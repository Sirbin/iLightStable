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

public class policiesmode extends Activity implements B4AActivity{
	public static policiesmode mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.policiesmode");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (policiesmode).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.policiesmode");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.policiesmode", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (policiesmode) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (policiesmode) Resume **");
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
		return policiesmode.class;
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
        BA.LogInfo("** Activity (policiesmode) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (policiesmode) Resume **");
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
public static anywheresoftware.b4a.objects.collections.Map _m = null;
public static anywheresoftware.b4a.objects.collections.List _lstdati = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcreate = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _insert = null;
public anywheresoftware.b4a.objects.ButtonWrapper _delete = null;
public b4a.example.main _main = null;
public b4a.example.sensortable _sensortable = null;
public b4a.example.config _config = null;
public b4a.example.size _size = null;
public b4a.example.cancellato _cancellato = null;
public b4a.example.configpagemod _configpagemod = null;
public b4a.example.configurationwizardmod _configurationwizardmod = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"Button1",mostCurrent._button1,"Button2",mostCurrent._button2,"cancellato",Debug.moduleToString(b4a.example.cancellato.class),"config",Debug.moduleToString(b4a.example.config.class),"ConfigPageMod",Debug.moduleToString(b4a.example.configpagemod.class),"ConfigurationWizardMod",Debug.moduleToString(b4a.example.configurationwizardmod.class),"Delete",mostCurrent._delete,"Insert",mostCurrent._insert,"lblCreate",mostCurrent._lblcreate,"lbltitle",mostCurrent._lbltitle,"ListView1",mostCurrent._listview1,"LstDati",_lstdati,"m",_m,"Main",Debug.moduleToString(b4a.example.main.class),"panel1",mostCurrent._panel1,"SensorTable",Debug.moduleToString(b4a.example.sensortable.class),"Size",Debug.moduleToString(b4a.example.size.class)};
}

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,28);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Policies\")";
Debug.ShouldStop(536870912);
mostCurrent._activity.LoadLayout("Policies",mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="create_layout";
Debug.ShouldStop(1073741824);
_create_layout();
 BA.debugLineNum = 32;BA.debugLine="End Sub";
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
public static String  _activity_pause(boolean _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,64);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Resume (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,60);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,77);
 BA.debugLineNum = 77;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,74);
 BA.debugLineNum = 74;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Msgbox(\"ciao\",\"ottimo\")";
Debug.ShouldStop(1024);
anywheresoftware.b4a.keywords.Common.Msgbox("ciao","ottimo",mostCurrent.activityBA);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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
public static String  _create_layout() throws Exception{
try {
		Debug.PushSubsStack("create_layout (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,33);
int _x = 0;
String[] _num = null;
 BA.debugLineNum = 33;BA.debugLine="Sub create_layout";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="lbltitle.Initialize(\"\")";
Debug.ShouldStop(2);
mostCurrent._lbltitle.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 35;BA.debugLine="lbltitle.Text = \"iLight Policies Mode\"";
Debug.ShouldStop(4);
mostCurrent._lbltitle.setText((Object)("iLight Policies Mode"));
 BA.debugLineNum = 36;BA.debugLine="lbltitle.TextSize = 34";
Debug.ShouldStop(8);
mostCurrent._lbltitle.setTextSize((float) (34));
 BA.debugLineNum = 37;BA.debugLine="lbltitle.Gravity = Gravity.CENTER_HORIZONTAL + Gr";
Debug.ShouldStop(16);
mostCurrent._lbltitle.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
 BA.debugLineNum = 38;BA.debugLine="lbltitle.TextColor = Colors.RGB(227,227,227)";
Debug.ShouldStop(32);
mostCurrent._lbltitle.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 39;BA.debugLine="Activity.AddView(lbltitle,10dip,10dip,100%x,10%y)";
Debug.ShouldStop(64);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._lbltitle.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
 BA.debugLineNum = 41;BA.debugLine="lblCreate.Initialize(\"lblCreate\")";
Debug.ShouldStop(256);
mostCurrent._lblcreate.Initialize(mostCurrent.activityBA,"lblCreate");
 BA.debugLineNum = 42;BA.debugLine="lblCreate.Color = Colors.RGB(227,227,227)";
Debug.ShouldStop(512);
mostCurrent._lblcreate.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 44;BA.debugLine="LstDati.Initialize";
Debug.ShouldStop(2048);
_lstdati.Initialize();
 BA.debugLineNum = 45;BA.debugLine="LstDati.AddAll(Array As String(\"home\",\"motel\"))";
Debug.ShouldStop(4096);
_lstdati.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"home","motel"}));
 BA.debugLineNum = 46;BA.debugLine="For x = 0 To LstDati.Size -1";
Debug.ShouldStop(8192);
{
final int step30 = 1;
final int limit30 = (int) (_lstdati.getSize()-1);
for (_x = (int) (0); (step30 > 0 && _x <= limit30) || (step30 < 0 && _x >= limit30); _x = ((int)(0 + _x + step30))) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 47;BA.debugLine="Dim num(2) As String";
Debug.ShouldStop(16384);
_num = new String[(int) (2)];
java.util.Arrays.fill(_num,"");Debug.locals.put("num", _num);
 BA.debugLineNum = 48;BA.debugLine="num(0) = LstDati.Get(0)";
Debug.ShouldStop(32768);
_num[(int) (0)] = BA.ObjectToString(_lstdati.Get((int) (0)));Debug.locals.put("num", _num);
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 50;BA.debugLine="Log (LstDati)";
Debug.ShouldStop(131072);
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_lstdati));
 BA.debugLineNum = 51;BA.debugLine="Log (num(0))";
Debug.ShouldStop(262144);
anywheresoftware.b4a.keywords.Common.Log(_num[(int) (0)]);
 BA.debugLineNum = 52;BA.debugLine="Log (num(1))";
Debug.ShouldStop(524288);
anywheresoftware.b4a.keywords.Common.Log(_num[(int) (1)]);
 BA.debugLineNum = 53;BA.debugLine="ListView1.AddSingleLine(num(0))";
Debug.ShouldStop(1048576);
mostCurrent._listview1.AddSingleLine(_num[(int) (0)]);
 BA.debugLineNum = 54;BA.debugLine="ListView1.AddSingleLine2(\"prova2\",2)";
Debug.ShouldStop(2097152);
mostCurrent._listview1.AddSingleLine2("prova2",(Object)(2));
 BA.debugLineNum = 55;BA.debugLine="ListView1.AddSingleLine2(\"prova3\",3)";
Debug.ShouldStop(4194304);
mostCurrent._listview1.AddSingleLine2("prova3",(Object)(3));
 BA.debugLineNum = 56;BA.debugLine="ListView1.AddSingleLine2(\"+\",4)";
Debug.ShouldStop(8388608);
mostCurrent._listview1.AddSingleLine2("+",(Object)(4));
 BA.debugLineNum = 57;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor = Colo";
Debug.ShouldStop(16777216);
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 58;BA.debugLine="ListView1.SingleLineLayout.ItemHeight = 80dip";
Debug.ShouldStop(33554432);
mostCurrent._listview1.getSingleLineLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _createpol_click() throws Exception{
try {
		Debug.PushSubsStack("CreatePol_Click (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,67);
 BA.debugLineNum = 67;BA.debugLine="Sub CreatePol_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Dim m As Map";
Debug.ShouldStop(8);
_m = new anywheresoftware.b4a.objects.collections.Map();
 BA.debugLineNum = 69;BA.debugLine="m.Initialize";
Debug.ShouldStop(16);
_m.Initialize();
 BA.debugLineNum = 70;BA.debugLine="m.put(\"home\",False)";
Debug.ShouldStop(32);
_m.Put((Object)("home"),(Object)(anywheresoftware.b4a.keywords.Common.False));
 BA.debugLineNum = 71;BA.debugLine="m.Put(\"Motel\",False)";
Debug.ShouldStop(64);
_m.Put((Object)("Motel"),(Object)(anywheresoftware.b4a.keywords.Common.False));
 BA.debugLineNum = 72;BA.debugLine="InputMap(m,\"scelta dei dati\")";
Debug.ShouldStop(128);
anywheresoftware.b4a.keywords.Common.InputMap(_m,"scelta dei dati",mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _delete_click(int _click) throws Exception{
try {
		Debug.PushSubsStack("Delete_Click (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,83);
Debug.locals.put("click", _click);
 BA.debugLineNum = 83;BA.debugLine="Sub Delete_Click(click As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim lbltitle As Label";
mostCurrent._lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblCreate As Label";
mostCurrent._lblcreate = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private ListView1 As ListView";
mostCurrent._listview1 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Button1 As Button";
mostCurrent._button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Button2 As Button";
mostCurrent._button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Insert As Button";
mostCurrent._insert = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Delete As Button";
mostCurrent._delete = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _insert_click() throws Exception{
try {
		Debug.PushSubsStack("Insert_Click (policiesmode) ","policiesmode",9,mostCurrent.activityBA,mostCurrent,80);
 BA.debugLineNum = 80;BA.debugLine="Sub Insert_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Msgbox(\"ciao\",\"ottimo\")";
Debug.ShouldStop(65536);
anywheresoftware.b4a.keywords.Common.Msgbox("ciao","ottimo",mostCurrent.activityBA);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 11;BA.debugLine="Public LstDati As List";
_lstdati = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
}
