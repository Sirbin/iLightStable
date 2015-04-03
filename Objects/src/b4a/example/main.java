package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
		BA.handler.postDelayed(new WaitForLayout(), 5);

	}
	private static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEvent(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.JSONParser _json = null;
public static boolean _btconnected = false;
public static anywheresoftware.b4a.objects.Serial.BluetoothAdmin _admin = null;
public static anywheresoftware.b4a.objects.Serial _serial1 = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _configuration = null;
public anywheresoftware.b4a.objects.ButtonWrapper _home = null;
public anywheresoftware.b4a.objects.ButtonWrapper _network = null;
public anywheresoftware.b4a.objects.ButtonWrapper _policies = null;
public anywheresoftware.b4a.objects.ButtonWrapper _sensors = null;
public anywheresoftware.b4a.objects.ButtonWrapper _back = null;
public anywheresoftware.b4a.objects.collections.Map _map1 = null;
public b4a.example.sensortable _sensortable = null;
public b4a.example.config _config = null;
public b4a.example.size _size = null;
public b4a.example.cancellato _cancellato = null;
public b4a.example.configpagemod _configpagemod = null;
public b4a.example.configurationwizardmod _configurationwizardmod = null;
public b4a.example.policiesmode _policiesmode = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"admin",_admin,"astreams1",_astreams1,"back",mostCurrent._back,"btConnected",_btconnected,"cancellato",Debug.moduleToString(b4a.example.cancellato.class),"config",Debug.moduleToString(b4a.example.config.class),"ConfigPageMod",Debug.moduleToString(b4a.example.configpagemod.class),"configuration",mostCurrent._configuration,"ConfigurationWizardMod",Debug.moduleToString(b4a.example.configurationwizardmod.class),"Home",mostCurrent._home,"json",_json,"map1",mostCurrent._map1,"Network",mostCurrent._network,"Policies",mostCurrent._policies,"PoliciesMode",Debug.moduleToString(b4a.example.policiesmode.class),"sensors",mostCurrent._sensors,"SensorTable",Debug.moduleToString(b4a.example.sensortable.class),"serial1",_serial1,"Size",Debug.moduleToString(b4a.example.size.class)};
}

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (sensortable.mostCurrent != null);
vis = vis | (config.mostCurrent != null);
vis = vis | (cancellato.mostCurrent != null);
vis = vis | (configpagemod.mostCurrent != null);
vis = vis | (configurationwizardmod.mostCurrent != null);
vis = vis | (policiesmode.mostCurrent != null);
return vis;}

public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = main.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (sensortable.previousOne != null) {
				__a = sensortable.previousOne.get();
			}
            else {
                BA ba = sensortable.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (config.previousOne != null) {
				__a = config.previousOne.get();
			}
            else {
                BA ba = config.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (cancellato.previousOne != null) {
				__a = cancellato.previousOne.get();
			}
            else {
                BA ba = cancellato.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (configpagemod.previousOne != null) {
				__a = configpagemod.previousOne.get();
			}
            else {
                BA ba = configpagemod.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (configurationwizardmod.previousOne != null) {
				__a = configurationwizardmod.previousOne.get();
			}
            else {
                BA ba = configurationwizardmod.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (policiesmode.previousOne != null) {
				__a = policiesmode.previousOne.get();
			}
            else {
                BA ba = policiesmode.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public static String  _activity_create(boolean _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,mostCurrent.activityBA,mostCurrent,34);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"iLight\")";
Debug.ShouldStop(4);
mostCurrent._activity.LoadLayout("iLight",mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(8);
if (_firsttime) { 
 BA.debugLineNum = 37;BA.debugLine="admin.Initialize(\"BT\")";
Debug.ShouldStop(16);
_admin.Initialize(processBA,"BT");
 BA.debugLineNum = 38;BA.debugLine="serial1.Initialize(\"Serial1\")";
Debug.ShouldStop(32);
Debug.DebugWarningEngine.CheckInitialize(_serial1);_serial1.Initialize("Serial1");
 };
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _activity_pause(boolean _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,mostCurrent.activityBA,mostCurrent,46);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,mostCurrent.activityBA,mostCurrent,42);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _back_click() throws Exception{
try {
		Debug.PushSubsStack("back_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,75);
 BA.debugLineNum = 75;BA.debugLine="Sub back_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="StartActivity(\"main\")";
Debug.ShouldStop(4096);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("main"));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _configuration_click() throws Exception{
try {
		Debug.PushSubsStack("Configuration_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,69);
 BA.debugLineNum = 69;BA.debugLine="Sub Configuration_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="If admin.IsEnabled = True Then";
Debug.ShouldStop(32);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 71;BA.debugLine="admin.Disable";
Debug.ShouldStop(64);
_admin.Disable();
 };
 BA.debugLineNum = 73;BA.debugLine="StartActivity(\"ConfigurationWizardMod\")";
Debug.ShouldStop(256);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("ConfigurationWizardMod"));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    if (mostCurrent != null && mostCurrent.activityBA != null) {
Debug.StartDebugging(mostCurrent.activityBA, 37846, new int[] {3, 6, 56, 2, 3, 4, 4, 2, 25, 3, 8}, "87197c7b-18ab-4c76-8d20-15cd051a50f0");}

    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
sensortable._process_globals();
config._process_globals();
size._process_globals();
cancellato._process_globals();
configpagemod._process_globals();
configurationwizardmod._process_globals();
policiesmode._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private configuration As Button";
mostCurrent._configuration = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Home As Button";
mostCurrent._home = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Network As Button";
mostCurrent._network = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Policies As Button";
mostCurrent._policies = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private sensors As Button";
mostCurrent._sensors = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private back As Button";
mostCurrent._back = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Dim map1 As Map";
mostCurrent._map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _home_click() throws Exception{
try {
		Debug.PushSubsStack("Home_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,65);
 BA.debugLineNum = 65;BA.debugLine="Sub Home_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Msgbox(\"ByeBye\",\"Exit\")";
Debug.ShouldStop(2);
anywheresoftware.b4a.keywords.Common.Msgbox("ByeBye","Exit",mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="ExitApplication";
Debug.ShouldStop(4);
anywheresoftware.b4a.keywords.Common.ExitApplication();
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _network_click() throws Exception{
try {
		Debug.PushSubsStack("Network_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,62);
 BA.debugLineNum = 62;BA.debugLine="Sub Network_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _policies_click() throws Exception{
try {
		Debug.PushSubsStack("Policies_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,56);
 BA.debugLineNum = 56;BA.debugLine="Sub Policies_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="If admin.IsEnabled = True Then";
Debug.ShouldStop(16777216);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 58;BA.debugLine="admin.Disable";
Debug.ShouldStop(33554432);
_admin.Disable();
 };
 BA.debugLineNum = 60;BA.debugLine="StartActivity(\"PoliciesMode\")";
Debug.ShouldStop(134217728);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("PoliciesMode"));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Public json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 17;BA.debugLine="Public btConnected As Boolean";
_btconnected = false;
 //BA.debugLineNum = 18;BA.debugLine="Public admin As BluetoothAdmin";
_admin = new anywheresoftware.b4a.objects.Serial.BluetoothAdmin();
 //BA.debugLineNum = 19;BA.debugLine="Public serial1 As Serial";
_serial1 = new anywheresoftware.b4a.objects.Serial();
 //BA.debugLineNum = 20;BA.debugLine="Public astreams1  As AsyncStreams";
_astreams1 = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _sensors_click() throws Exception{
try {
		Debug.PushSubsStack("sensors_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,49);
 BA.debugLineNum = 49;BA.debugLine="Sub sensors_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="If admin.IsEnabled = True Then";
Debug.ShouldStop(131072);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 51;BA.debugLine="admin.Disable";
Debug.ShouldStop(262144);
_admin.Disable();
 };
 BA.debugLineNum = 54;BA.debugLine="StartActivity(\"SensorTable\")";
Debug.ShouldStop(2097152);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("SensorTable"));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}
