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

public class configurationwizardmod extends Activity implements B4AActivity{
	public static configurationwizardmod mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.configurationwizardmod");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (configurationwizardmod).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.configurationwizardmod");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.configurationwizardmod", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (configurationwizardmod) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (configurationwizardmod) Resume **");
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
		return configurationwizardmod.class;
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
        BA.LogInfo("** Activity (configurationwizardmod) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (configurationwizardmod) Resume **");
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
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.objects.Timer _timer2 = null;
public static anywheresoftware.b4a.objects.Timer _timer3 = null;
public static anywheresoftware.b4a.objects.Timer _timercoll = null;
public static anywheresoftware.b4a.objects.Serial.BluetoothAdmin _admin = null;
public static anywheresoftware.b4a.objects.Serial _serial1 = null;
public static anywheresoftware.b4a.objects.collections.JSONParser _json = null;
public static anywheresoftware.b4a.objects.collections.Map _map1 = null;
public static String _invio_dati = "";
public static int[] _straddrpwm = null;
public static String[] _straddr = null;
public static String[] _add = null;
public static int _sec = 0;
public static int _count = 0;
public derez.libs.WheelView _addres = null;
public derez.libs.WheelView _set = null;
public derez.libs.WheelView _choice = null;
public derez.libs.WheelView _followlux = null;
public derez.libs.WheelView _followluxon_off = null;
public derez.libs.WheelView _presenceon_off = null;
public derez.libs.WheelView _presencehi_low = null;
public derez.libs.WheelView _delayon_off = null;
public static int _pwm_to_timer0 = 0;
public static int _pwm_to_timer1 = 0;
public static int _pwm_to_timer2 = 0;
public static int _pwm_to_timer3 = 0;
public static int _pwm_pre0 = 0;
public static int _pwm_pre1 = 0;
public static int _pwm_pre2 = 0;
public static int _pwm_pre3 = 0;
public static int _pwm_foll0 = 0;
public static int _pwm_foll1 = 0;
public static int _pwm_foll2 = 0;
public static int _pwm_foll3 = 0;
public anywheresoftware.b4a.objects.collections.List _lstaddr = null;
public anywheresoftware.b4a.objects.ListViewWrapper _address = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public static String _str_ = "";
public static String _s = "";
public adr.stringfunctions.stringfunctions _sf = null;
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams1 = null;
public anywheresoftware.b4a.objects.collections.List _l = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _lblfont = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblluxvalue = null;
public b4a.example.circleseek _circle = null;
public b4a.example.circleseek _circle1 = null;
public b4a.example.circleseek _circle2 = null;
public static int _conta = 0;
public static int[] _arr = null;
public b4a.example.main _main = null;
public b4a.example.sensortable _sensortable = null;
public b4a.example.config _config = null;
public b4a.example.size _size = null;
public b4a.example.cancellato _cancellato = null;
public b4a.example.configpagemod _configpagemod = null;
public b4a.example.policiesmode _policiesmode = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"add",_add,"Addres",mostCurrent._addres,"Address",mostCurrent._address,"admin",_admin,"arr",_arr,"astreams1",mostCurrent._astreams1,"cancellato",Debug.moduleToString(b4a.example.cancellato.class),"choice",mostCurrent._choice,"Circle",mostCurrent._circle,"Circle1",mostCurrent._circle1,"Circle2",mostCurrent._circle2,"config",Debug.moduleToString(b4a.example.config.class),"ConfigPageMod",Debug.moduleToString(b4a.example.configpagemod.class),"conta",_conta,"count",_count,"DelayOn_Off",mostCurrent._delayon_off,"FollowLux",mostCurrent._followlux,"FollowLuxOn_Off",mostCurrent._followluxon_off,"invio_dati",_invio_dati,"json",_json,"l",mostCurrent._l,"lblFont",mostCurrent._lblfont,"lblLuxValue",mostCurrent._lblluxvalue,"lstaddr",mostCurrent._lstaddr,"Main",Debug.moduleToString(b4a.example.main.class),"map1",_map1,"Panel1",mostCurrent._panel1,"PoliciesMode",Debug.moduleToString(b4a.example.policiesmode.class),"PresenceHi_LOW",mostCurrent._presencehi_low,"PresenceOn_OFF",mostCurrent._presenceon_off,"pwm_Foll0",_pwm_foll0,"pwm_Foll1",_pwm_foll1,"pwm_Foll2",_pwm_foll2,"pwm_Foll3",_pwm_foll3,"pwm_Pre0",_pwm_pre0,"pwm_Pre1",_pwm_pre1,"pwm_Pre2",_pwm_pre2,"pwm_Pre3",_pwm_pre3,"pwm_to_timer0",_pwm_to_timer0,"pwm_to_timer1",_pwm_to_timer1,"pwm_to_timer2",_pwm_to_timer2,"pwm_to_timer3",_pwm_to_timer3,"s",mostCurrent._s,"sec",_sec,"SensorTable",Debug.moduleToString(b4a.example.sensortable.class),"serial1",_serial1,"Set",mostCurrent._set,"sf",mostCurrent._sf,"Size",Debug.moduleToString(b4a.example.size.class),"str_",mostCurrent._str_,"StrAddr",_straddr,"StrAddrPwm",_straddrpwm,"Timer1",_timer1,"Timer2",_timer2,"Timer3",_timer3,"timercoll",_timercoll};
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
		Debug.PushSubsStack("Activity_Create (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,50);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(262144);
if (_firsttime) { 
 BA.debugLineNum = 52;BA.debugLine="admin.Initialize(\"BT\")";
Debug.ShouldStop(524288);
_admin.Initialize(processBA,"BT");
 BA.debugLineNum = 53;BA.debugLine="serial1.Initialize(\"Serial1\")";
Debug.ShouldStop(1048576);
Debug.DebugWarningEngine.CheckInitialize(_serial1);_serial1.Initialize("Serial1");
 BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"ConfigurationWizard\")";
Debug.ShouldStop(2097152);
mostCurrent._activity.LoadLayout("ConfigurationWizard",mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="Label_create";
Debug.ShouldStop(4194304);
_label_create();
 BA.debugLineNum = 56;BA.debugLine="wheel_create";
Debug.ShouldStop(8388608);
_wheel_create();
 BA.debugLineNum = 57;BA.debugLine="Circle.setColors(Colors.RGB(150,150,255), Colors";
Debug.ShouldStop(16777216);
mostCurrent._circle._setcolors(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (150),(int) (150),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (50),(int) (205),(int) (50)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)),anywheresoftware.b4a.keywords.Common.Colors.Yellow,(int) (24*mostCurrent._size._cf));
 BA.debugLineNum = 58;BA.debugLine="Circle1.setColors(Colors.RGB(150,150,255), Color";
Debug.ShouldStop(33554432);
mostCurrent._circle1._setcolors(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (150),(int) (150),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (50),(int) (205),(int) (50)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)),anywheresoftware.b4a.keywords.Common.Colors.Yellow,(int) (24*mostCurrent._size._cf));
 BA.debugLineNum = 59;BA.debugLine="Circle2.setColors(Colors.RGB(150,150,255), Color";
Debug.ShouldStop(67108864);
mostCurrent._circle2._setcolors(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (150),(int) (150),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (50),(int) (205),(int) (50)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)),anywheresoftware.b4a.keywords.Common.Colors.Yellow,(int) (24*mostCurrent._size._cf));
 };
 BA.debugLineNum = 61;BA.debugLine="Timer1.Initialize(\"Timer1\",1000)";
Debug.ShouldStop(268435456);
Debug.DebugWarningEngine.CheckInitialize(_timer1);_timer1.Initialize(processBA,"Timer1",(long) (1000));
 BA.debugLineNum = 62;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(536870912);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 63;BA.debugLine="Timer2.Initialize(\"Timer2\",1000)";
Debug.ShouldStop(1073741824);
Debug.DebugWarningEngine.CheckInitialize(_timer2);_timer2.Initialize(processBA,"Timer2",(long) (1000));
 BA.debugLineNum = 64;BA.debugLine="Timer2.Enabled = True";
Debug.ShouldStop(-2147483648);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 65;BA.debugLine="Timer3.Initialize(\"Timer3\",1000)";
Debug.ShouldStop(1);
Debug.DebugWarningEngine.CheckInitialize(_timer3);_timer3.Initialize(processBA,"Timer3",(long) (1000));
 BA.debugLineNum = 66;BA.debugLine="Timer3.Enabled = True";
Debug.ShouldStop(2);
_timer3.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 67;BA.debugLine="If admin.IsEnabled = False Then";
Debug.ShouldStop(4);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 68;BA.debugLine="admin.Enable";
Debug.ShouldStop(8);
_admin.Enable();
 BA.debugLineNum = 69;BA.debugLine="Log(\"Bt is ready\")";
Debug.ShouldStop(16);
anywheresoftware.b4a.keywords.Common.Log("Bt is ready");
 };
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,222);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 222;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,73);
 BA.debugLineNum = 73;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Log(\"this is activity resume\")";
Debug.ShouldStop(512);
anywheresoftware.b4a.keywords.Common.Log("this is activity resume");
 BA.debugLineNum = 75;BA.debugLine="If Circle.IsInitialized = False OR Circle1.IsInit";
Debug.ShouldStop(1024);
if (mostCurrent._circle.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || mostCurrent._circle1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || mostCurrent._circle2.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 76;BA.debugLine="Activity.LoadLayout(\"configurationwizard\")";
Debug.ShouldStop(2048);
mostCurrent._activity.LoadLayout("configurationwizard",mostCurrent.activityBA);
 BA.debugLineNum = 77;BA.debugLine="Label_create";
Debug.ShouldStop(4096);
_label_create();
 BA.debugLineNum = 78;BA.debugLine="wheel_create";
Debug.ShouldStop(8192);
_wheel_create();
 BA.debugLineNum = 79;BA.debugLine="Circle.setColors(Colors.RGB(150,150,255), Colors";
Debug.ShouldStop(16384);
mostCurrent._circle._setcolors(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (150),(int) (150),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (50),(int) (205),(int) (50)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)),anywheresoftware.b4a.keywords.Common.Colors.Yellow,(int) (24*mostCurrent._size._cf));
 BA.debugLineNum = 80;BA.debugLine="Circle1.setColors(Colors.RGB(150,150,255), Color";
Debug.ShouldStop(32768);
mostCurrent._circle1._setcolors(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (150),(int) (150),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (50),(int) (205),(int) (50)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)),anywheresoftware.b4a.keywords.Common.Colors.Yellow,(int) (24*mostCurrent._size._cf));
 BA.debugLineNum = 81;BA.debugLine="Circle2.setColors(Colors.RGB(150,150,255), Color";
Debug.ShouldStop(65536);
mostCurrent._circle2._setcolors(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (150),(int) (150),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (50),(int) (205),(int) (50)),anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)),anywheresoftware.b4a.keywords.Common.Colors.Yellow,(int) (24*mostCurrent._size._cf));
 BA.debugLineNum = 82;BA.debugLine="Circle.Value = 0";
Debug.ShouldStop(131072);
mostCurrent._circle._setvalue(0);
 BA.debugLineNum = 83;BA.debugLine="Circle1.Value = 0";
Debug.ShouldStop(262144);
mostCurrent._circle1._setvalue(0);
 BA.debugLineNum = 84;BA.debugLine="Circle2.Value = 0";
Debug.ShouldStop(524288);
mostCurrent._circle2._setvalue(0);
 };
 BA.debugLineNum = 86;BA.debugLine="Circle.Value = 0";
Debug.ShouldStop(2097152);
mostCurrent._circle._setvalue(0);
 BA.debugLineNum = 87;BA.debugLine="Circle1.Value = 0";
Debug.ShouldStop(4194304);
mostCurrent._circle1._setvalue(0);
 BA.debugLineNum = 88;BA.debugLine="Circle2.Value = 0";
Debug.ShouldStop(8388608);
mostCurrent._circle2._setvalue(0);
 BA.debugLineNum = 89;BA.debugLine="If Timer1.Enabled = False OR Timer2.Enabled = Fal";
Debug.ShouldStop(16777216);
if (_timer1.getEnabled()==anywheresoftware.b4a.keywords.Common.False || _timer2.getEnabled()==anywheresoftware.b4a.keywords.Common.False || _timer3.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 90;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(33554432);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 91;BA.debugLine="Timer2.Enabled = True";
Debug.ShouldStop(67108864);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 92;BA.debugLine="Timer3.Enabled = True";
Debug.ShouldStop(134217728);
_timer3.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 94;BA.debugLine="If admin.IsEnabled = False Then";
Debug.ShouldStop(536870912);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 95;BA.debugLine="admin.Enable";
Debug.ShouldStop(1073741824);
_admin.Enable();
 };
 BA.debugLineNum = 98;BA.debugLine="End Sub";
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
public static String  _addres_tick() throws Exception{
try {
		Debug.PushSubsStack("Addres_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,337);
 BA.debugLineNum = 337;BA.debugLine="Sub Addres_tick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 338;BA.debugLine="If Addres.ReadWheel = StrAddr(0) Then";
Debug.ShouldStop(131072);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)])) { 
 BA.debugLineNum = 339;BA.debugLine="Circle.Value = pwm_to_timer0";
Debug.ShouldStop(262144);
mostCurrent._circle._setvalue(_pwm_to_timer0);
 }else 
{ BA.debugLineNum = 340;BA.debugLine="Else If Addres.ReadWheel = StrAddr(1) Then";
Debug.ShouldStop(524288);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)])) { 
 BA.debugLineNum = 341;BA.debugLine="Circle.Value = pwm_to_timer1";
Debug.ShouldStop(1048576);
mostCurrent._circle._setvalue(_pwm_to_timer1);
 }else 
{ BA.debugLineNum = 342;BA.debugLine="Else If Addres.ReadWheel = StrAddr(2) Then";
Debug.ShouldStop(2097152);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)])) { 
 BA.debugLineNum = 343;BA.debugLine="Circle.Value = pwm_to_timer2";
Debug.ShouldStop(4194304);
mostCurrent._circle._setvalue(_pwm_to_timer2);
 }else 
{ BA.debugLineNum = 344;BA.debugLine="Else If Addres.ReadWheel = StrAddr(3) Then";
Debug.ShouldStop(8388608);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)])) { 
 BA.debugLineNum = 345;BA.debugLine="Circle.Value = pwm_to_timer3";
Debug.ShouldStop(16777216);
mostCurrent._circle._setvalue(_pwm_to_timer3);
 }}}};
 BA.debugLineNum = 347;BA.debugLine="End Sub";
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
public static String  _astreams1_newdata(byte[] _buffer) throws Exception{
try {
		Debug.PushSubsStack("Astreams1_NewData (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,224);
String _u = "";
long _lpos = 0L;
long _rpos = 0L;
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 224;BA.debugLine="Sub Astreams1_NewData (Buffer() As Byte)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="Dim u As String";
Debug.ShouldStop(1);
_u = "";Debug.locals.put("u", _u);
 BA.debugLineNum = 226;BA.debugLine="Dim lpos As Long";
Debug.ShouldStop(2);
_lpos = 0L;Debug.locals.put("lpos", _lpos);
 BA.debugLineNum = 227;BA.debugLine="Dim rpos As Long";
Debug.ShouldStop(4);
_rpos = 0L;Debug.locals.put("rpos", _rpos);
 BA.debugLineNum = 228;BA.debugLine="u = u & BytesToString(Buffer, 0, Buffer.Length, \"";
Debug.ShouldStop(8);
_u = _u+anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF8");Debug.locals.put("u", _u);
 BA.debugLineNum = 229;BA.debugLine="str_ = str_ & u";
Debug.ShouldStop(16);
mostCurrent._str_ = mostCurrent._str_+_u;
 BA.debugLineNum = 231;BA.debugLine="If str_.Length > 180 Then";
Debug.ShouldStop(64);
if (mostCurrent._str_.length()>180) { 
 BA.debugLineNum = 232;BA.debugLine="lpos=str_.IndexOf(\"{\")";
Debug.ShouldStop(128);
_lpos = (long) (mostCurrent._str_.indexOf("{"));Debug.locals.put("lpos", _lpos);
 BA.debugLineNum = 233;BA.debugLine="rpos=str_.IndexOf2(\"}\",lpos+1)";
Debug.ShouldStop(256);
_rpos = (long) (mostCurrent._str_.indexOf("}",(int) (_lpos+1)));Debug.locals.put("rpos", _rpos);
 BA.debugLineNum = 234;BA.debugLine="If lpos < 0 Then";
Debug.ShouldStop(512);
if (_lpos<0) { 
 BA.debugLineNum = 235;BA.debugLine="Log(\"lpos negativo ----------------------------";
Debug.ShouldStop(1024);
anywheresoftware.b4a.keywords.Common.Log("lpos negativo ----------------------------------------------");
 BA.debugLineNum = 236;BA.debugLine="str_=\" \"";
Debug.ShouldStop(2048);
mostCurrent._str_ = " ";
 };
 BA.debugLineNum = 238;BA.debugLine="If lpos>=0 Then";
Debug.ShouldStop(8192);
if (_lpos>=0) { 
 BA.debugLineNum = 239;BA.debugLine="If rpos > lpos Then";
Debug.ShouldStop(16384);
if (_rpos>_lpos) { 
 BA.debugLineNum = 240;BA.debugLine="s = sf.Mid(str_,lpos+1,(rpos+lpos)+1)";
Debug.ShouldStop(32768);
mostCurrent._s = mostCurrent._sf._vvvv5(mostCurrent._str_,(int) (_lpos+1),(int) ((_rpos+_lpos)+1));
 BA.debugLineNum = 241;BA.debugLine="json_interpreter1(s)	'change the buffer'";
Debug.ShouldStop(65536);
_json_interpreter1(mostCurrent._s);
 BA.debugLineNum = 242;BA.debugLine="str_=sf.Right(str_,(str_.Length-rpos)-1)";
Debug.ShouldStop(131072);
mostCurrent._str_ = mostCurrent._sf._vvvvv7(mostCurrent._str_,(long) ((mostCurrent._str_.length()-_rpos)-1));
 };
 };
 };
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _bt_statechanged(int _newstate,int _oldstate) throws Exception{
try {
		Debug.PushSubsStack("BT_StateChanged (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,304);
Debug.locals.put("NewState", _newstate);
Debug.locals.put("OldState", _oldstate);
 BA.debugLineNum = 304;BA.debugLine="Sub BT_StateChanged(NewState As Int,OldState As In";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="If NewState = admin.STATE_ON Then";
Debug.ShouldStop(65536);
if (_newstate==_admin.STATE_ON) { 
 BA.debugLineNum = 306;BA.debugLine="Connect_3box";
Debug.ShouldStop(131072);
_connect_3box();
 BA.debugLineNum = 307;BA.debugLine="Log(\"BT Connect\")";
Debug.ShouldStop(262144);
anywheresoftware.b4a.keywords.Common.Log("BT Connect");
 }else {
 BA.debugLineNum = 309;BA.debugLine="serial1.Disconnect";
Debug.ShouldStop(1048576);
_serial1.Disconnect();
 BA.debugLineNum = 310;BA.debugLine="Log(\"BT Disconnect\")";
Debug.ShouldStop(2097152);
anywheresoftware.b4a.keywords.Common.Log("BT Disconnect");
 };
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Button1_Click (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,771);
 BA.debugLineNum = 771;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 773;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Button2_Click (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,768);
 BA.debugLineNum = 768;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 769;BA.debugLine="string_invPing (2,StrAddr(0))";
Debug.ShouldStop(1);
_string_invping((int) (2),_straddr[(int) (0)]);
 BA.debugLineNum = 770;BA.debugLine="End Sub";
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
public static String  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,765);
 BA.debugLineNum = 765;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 767;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _choice_tick() throws Exception{
try {
		Debug.PushSubsStack("choice_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,608);
 BA.debugLineNum = 608;BA.debugLine="Sub choice_tick";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 609;BA.debugLine="SetPingOn_Off";
Debug.ShouldStop(1);
_setpingon_off();
 BA.debugLineNum = 610;BA.debugLine="End Sub";
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
public static String  _circle_valuechanged(int _value,boolean _userchanged) throws Exception{
try {
		Debug.PushSubsStack("Circle_ValueChanged (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,403);
Debug.locals.put("value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 403;BA.debugLine="Sub Circle_ValueChanged(value As Int,UserChanged A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 404;BA.debugLine="If UserChanged  AND Addres.ReadWheel = StrAddr(0)";
Debug.ShouldStop(524288);
if (_userchanged && (mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 405;BA.debugLine="If Timer1.Enabled = False Then";
Debug.ShouldStop(1048576);
if (_timer1.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 406;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(2097152);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 408;BA.debugLine="pwm_to_timer0 = value";
Debug.ShouldStop(8388608);
_pwm_to_timer0 = _value;
 };
 BA.debugLineNum = 410;BA.debugLine="If UserChanged AND Addres.ReadWheel = StrAddr(1)";
Debug.ShouldStop(33554432);
if (_userchanged && (mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 411;BA.debugLine="If Timer1.Enabled = False Then";
Debug.ShouldStop(67108864);
if (_timer1.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 412;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(134217728);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 414;BA.debugLine="pwm_to_timer1 = value";
Debug.ShouldStop(536870912);
_pwm_to_timer1 = _value;
 };
 BA.debugLineNum = 416;BA.debugLine="If UserChanged AND Addres.ReadWheel = StrAddr(2)";
Debug.ShouldStop(-2147483648);
if (_userchanged && (mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 417;BA.debugLine="If Timer1.Enabled = False Then";
Debug.ShouldStop(1);
if (_timer1.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 418;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(2);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 420;BA.debugLine="pwm_to_timer2 = value";
Debug.ShouldStop(8);
_pwm_to_timer2 = _value;
 };
 BA.debugLineNum = 422;BA.debugLine="If UserChanged AND  Addres.ReadWheel = StrAddr(3)";
Debug.ShouldStop(32);
if (_userchanged && (mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 423;BA.debugLine="If Timer1.Enabled = False Then";
Debug.ShouldStop(64);
if (_timer1.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 424;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(128);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 426;BA.debugLine="pwm_to_timer3 = value";
Debug.ShouldStop(512);
_pwm_to_timer3 = _value;
 };
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _circle1_valuechanged(int _value,boolean _userchanged) throws Exception{
try {
		Debug.PushSubsStack("Circle1_ValueChanged (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,430);
Debug.locals.put("value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 430;BA.debugLine="Sub Circle1_ValueChanged(value As Int,UserChanged";
Debug.ShouldStop(8192);
 BA.debugLineNum = 431;BA.debugLine="If UserChanged AND	Addres.ReadWheel = StrAddr(0)";
Debug.ShouldStop(16384);
if (_userchanged && (mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 432;BA.debugLine="pwm_Pre0 = value";
Debug.ShouldStop(32768);
_pwm_pre0 = _value;
 BA.debugLineNum = 433;BA.debugLine="If Timer2.Enabled = False Then";
Debug.ShouldStop(65536);
if (_timer2.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 434;BA.debugLine="Timer2.Enabled = True";
Debug.ShouldStop(131072);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 };
 BA.debugLineNum = 437;BA.debugLine="If UserChanged AND Addres.ReadWheel = StrAddr(1)";
Debug.ShouldStop(1048576);
if (_userchanged && (mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 438;BA.debugLine="pwm_Pre1 = value";
Debug.ShouldStop(2097152);
_pwm_pre1 = _value;
 BA.debugLineNum = 439;BA.debugLine="If Timer2.Enabled = False Then";
Debug.ShouldStop(4194304);
if (_timer2.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 440;BA.debugLine="Timer2.Enabled = True";
Debug.ShouldStop(8388608);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 };
 BA.debugLineNum = 443;BA.debugLine="If UserChanged AND Addres.ReadWheel = StrAddr(2)";
Debug.ShouldStop(67108864);
if (_userchanged && (mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 444;BA.debugLine="pwm_Pre2 = value";
Debug.ShouldStop(134217728);
_pwm_pre2 = _value;
 BA.debugLineNum = 445;BA.debugLine="If Timer2.Enabled = False Then";
Debug.ShouldStop(268435456);
if (_timer2.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 446;BA.debugLine="Timer2.Enabled = True";
Debug.ShouldStop(536870912);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 };
 BA.debugLineNum = 449;BA.debugLine="If UserChanged AND  Addres.ReadWheel = StrAddr(3)";
Debug.ShouldStop(1);
if (_userchanged && (mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 450;BA.debugLine="pwm_Pre3 = value";
Debug.ShouldStop(2);
_pwm_pre3 = _value;
 BA.debugLineNum = 451;BA.debugLine="If Timer2.Enabled = False Then";
Debug.ShouldStop(4);
if (_timer2.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 452;BA.debugLine="Timer2.Enabled = True";
Debug.ShouldStop(8);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 };
 BA.debugLineNum = 456;BA.debugLine="End Sub";
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
public static String  _circle2_valuechanged(int _value,boolean _userchanged) throws Exception{
try {
		Debug.PushSubsStack("Circle2_ValueChanged (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,457);
Debug.locals.put("value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 457;BA.debugLine="Sub Circle2_ValueChanged(value As Int ,UserChanged";
Debug.ShouldStop(256);
 BA.debugLineNum = 459;BA.debugLine="If Timer3.Enabled = False Then";
Debug.ShouldStop(1024);
if (_timer3.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 460;BA.debugLine="Timer3.Enabled = True";
Debug.ShouldStop(2048);
_timer3.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 462;BA.debugLine="pwm_Foll3 = value";
Debug.ShouldStop(8192);
_pwm_foll3 = _value;
 BA.debugLineNum = 463;BA.debugLine="Log (\"timer3\" & pwm_Foll3)";
Debug.ShouldStop(16384);
anywheresoftware.b4a.keywords.Common.Log("timer3"+BA.NumberToString(_pwm_foll3));
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _connect_3box() throws Exception{
try {
		Debug.PushSubsStack("Connect_3box (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,326);
anywheresoftware.b4a.objects.collections.Map _parireddevices = null;
String _mydevice = "";
 BA.debugLineNum = 326;BA.debugLine="Sub Connect_3box";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="Public PariredDevices As Map";
Debug.ShouldStop(64);
_parireddevices = new anywheresoftware.b4a.objects.collections.Map();Debug.locals.put("PariredDevices", _parireddevices);
 BA.debugLineNum = 328;BA.debugLine="Dim MyDevice As String";
Debug.ShouldStop(128);
_mydevice = "";Debug.locals.put("MyDevice", _mydevice);
 BA.debugLineNum = 329;BA.debugLine="MyDevice = \"3box\"";
Debug.ShouldStop(256);
_mydevice = "3box";Debug.locals.put("MyDevice", _mydevice);
 BA.debugLineNum = 330;BA.debugLine="PariredDevices = serial1.GetPairedDevices";
Debug.ShouldStop(512);
_parireddevices = _serial1.GetPairedDevices();Debug.locals.put("PariredDevices", _parireddevices);
 BA.debugLineNum = 331;BA.debugLine="If PariredDevices.ContainsKey(MyDevice) Then";
Debug.ShouldStop(1024);
if (_parireddevices.ContainsKey((Object)(_mydevice))) { 
 BA.debugLineNum = 332;BA.debugLine="l.add(PariredDevices.Get(MyDevice))";
Debug.ShouldStop(2048);
mostCurrent._l.Add(_parireddevices.Get((Object)(_mydevice)));
 BA.debugLineNum = 333;BA.debugLine="Log(l)";
Debug.ShouldStop(4096);
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(mostCurrent._l));
 };
 BA.debugLineNum = 335;BA.debugLine="serial1.Connect(l.Get(0))";
Debug.ShouldStop(16384);
_serial1.Connect(processBA,BA.ObjectToString(mostCurrent._l.Get((int) (0))));
 BA.debugLineNum = 336;BA.debugLine="End Sub";
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
public static String  _create_list() throws Exception{
try {
		Debug.PushSubsStack("create_list (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,207);
 BA.debugLineNum = 207;BA.debugLine="Sub create_list";
Debug.ShouldStop(16384);
 BA.debugLineNum = 221;BA.debugLine="End Sub";
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
public static String  _delayon_off_tick() throws Exception{
try {
		Debug.PushSubsStack("DelayOn_Off_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,671);
 BA.debugLineNum = 671;BA.debugLine="Sub DelayOn_Off_tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 672;BA.debugLine="DelayOnOff";
Debug.ShouldStop(-2147483648);
_delayonoff();
 BA.debugLineNum = 673;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _delayonoff() throws Exception{
try {
		Debug.PushSubsStack("DelayOnOff (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,674);
 BA.debugLineNum = 674;BA.debugLine="Sub DelayOnOff";
Debug.ShouldStop(2);
 BA.debugLineNum = 675;BA.debugLine="If Addres.ReadWheel = StrAddr(0) AND Set.ReadWhee";
Debug.ShouldStop(4);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMax")) { 
 BA.debugLineNum = 676;BA.debugLine="string_inv(4,StrAddr(0),0)";
Debug.ShouldStop(8);
_string_inv((int) (4),_straddr[(int) (0)],(int) (0));
 BA.debugLineNum = 677;BA.debugLine="string_inv(4,StrAddr(0),0)";
Debug.ShouldStop(16);
_string_inv((int) (4),_straddr[(int) (0)],(int) (0));
 }else 
{ BA.debugLineNum = 678;BA.debugLine="Else If Addres.ReadWheel = StrAddr(0) AND Set.Re";
Debug.ShouldStop(32);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMed")) { 
 BA.debugLineNum = 679;BA.debugLine="string_inv(4,StrAddr(0),10)";
Debug.ShouldStop(64);
_string_inv((int) (4),_straddr[(int) (0)],(int) (10));
 BA.debugLineNum = 680;BA.debugLine="string_inv(4,StrAddr(0),10)";
Debug.ShouldStop(128);
_string_inv((int) (4),_straddr[(int) (0)],(int) (10));
 }else 
{ BA.debugLineNum = 681;BA.debugLine="Else If Addres.ReadWheel = StrAddr(0) AND Set.Re";
Debug.ShouldStop(256);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMin")) { 
 BA.debugLineNum = 682;BA.debugLine="string_inv(4,StrAddr(0),20)";
Debug.ShouldStop(512);
_string_inv((int) (4),_straddr[(int) (0)],(int) (20));
 BA.debugLineNum = 683;BA.debugLine="string_inv(4,StrAddr(0),20)";
Debug.ShouldStop(1024);
_string_inv((int) (4),_straddr[(int) (0)],(int) (20));
 }}};
 BA.debugLineNum = 685;BA.debugLine="If Addres.ReadWheel = StrAddr(1) AND Set.ReadWhee";
Debug.ShouldStop(4096);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMax")) { 
 BA.debugLineNum = 686;BA.debugLine="string_inv(4,StrAddr(1),0)";
Debug.ShouldStop(8192);
_string_inv((int) (4),_straddr[(int) (1)],(int) (0));
 BA.debugLineNum = 687;BA.debugLine="string_inv(4,StrAddr(1),0)";
Debug.ShouldStop(16384);
_string_inv((int) (4),_straddr[(int) (1)],(int) (0));
 }else 
{ BA.debugLineNum = 688;BA.debugLine="Else If Addres.ReadWheel = StrAddr(1) AND Set.Re";
Debug.ShouldStop(32768);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMed")) { 
 BA.debugLineNum = 689;BA.debugLine="string_inv(4,StrAddr(1),10)";
Debug.ShouldStop(65536);
_string_inv((int) (4),_straddr[(int) (1)],(int) (10));
 BA.debugLineNum = 690;BA.debugLine="string_inv(4,StrAddr(1),10)";
Debug.ShouldStop(131072);
_string_inv((int) (4),_straddr[(int) (1)],(int) (10));
 }else 
{ BA.debugLineNum = 691;BA.debugLine="Else If Addres.ReadWheel = StrAddr(1) AND Set.Re";
Debug.ShouldStop(262144);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMin")) { 
 BA.debugLineNum = 692;BA.debugLine="string_inv(4,StrAddr(1),20)";
Debug.ShouldStop(524288);
_string_inv((int) (4),_straddr[(int) (1)],(int) (20));
 BA.debugLineNum = 693;BA.debugLine="string_inv(4,StrAddr(1),20)";
Debug.ShouldStop(1048576);
_string_inv((int) (4),_straddr[(int) (1)],(int) (20));
 }}};
 BA.debugLineNum = 695;BA.debugLine="If Addres.ReadWheel = StrAddr(2) AND Set.ReadWhee";
Debug.ShouldStop(4194304);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMax")) { 
 BA.debugLineNum = 696;BA.debugLine="string_inv(4,StrAddr(2),0)";
Debug.ShouldStop(8388608);
_string_inv((int) (4),_straddr[(int) (2)],(int) (0));
 BA.debugLineNum = 697;BA.debugLine="string_inv(4,StrAddr(2),0)";
Debug.ShouldStop(16777216);
_string_inv((int) (4),_straddr[(int) (2)],(int) (0));
 }else 
{ BA.debugLineNum = 698;BA.debugLine="Else If Addres.ReadWheel = StrAddr(2) AND Set.Re";
Debug.ShouldStop(33554432);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMed")) { 
 BA.debugLineNum = 699;BA.debugLine="string_inv(4,StrAddr(2),10)";
Debug.ShouldStop(67108864);
_string_inv((int) (4),_straddr[(int) (2)],(int) (10));
 BA.debugLineNum = 700;BA.debugLine="string_inv(4,StrAddr(2),10)";
Debug.ShouldStop(134217728);
_string_inv((int) (4),_straddr[(int) (2)],(int) (10));
 }else 
{ BA.debugLineNum = 701;BA.debugLine="Else If Addres.ReadWheel = StrAddr(2) AND Set.Re";
Debug.ShouldStop(268435456);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMin")) { 
 BA.debugLineNum = 702;BA.debugLine="string_inv(4,StrAddr(2),20)";
Debug.ShouldStop(536870912);
_string_inv((int) (4),_straddr[(int) (2)],(int) (20));
 BA.debugLineNum = 703;BA.debugLine="string_inv(4,StrAddr(2),20)";
Debug.ShouldStop(1073741824);
_string_inv((int) (4),_straddr[(int) (2)],(int) (20));
 }}};
 BA.debugLineNum = 705;BA.debugLine="If Addres.ReadWheel = StrAddr(3) AND Set.ReadWhee";
Debug.ShouldStop(1);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMax")) { 
 BA.debugLineNum = 706;BA.debugLine="string_inv(4,StrAddr(3),0)";
Debug.ShouldStop(2);
_string_inv((int) (4),_straddr[(int) (3)],(int) (0));
 BA.debugLineNum = 707;BA.debugLine="string_inv(4,StrAddr(3),0)";
Debug.ShouldStop(4);
_string_inv((int) (4),_straddr[(int) (3)],(int) (0));
 }else 
{ BA.debugLineNum = 708;BA.debugLine="Else If Addres.ReadWheel = StrAddr(3) AND Set.Re";
Debug.ShouldStop(8);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMed")) { 
 BA.debugLineNum = 709;BA.debugLine="string_inv(4,StrAddr(3),10)";
Debug.ShouldStop(16);
_string_inv((int) (4),_straddr[(int) (3)],(int) (10));
 BA.debugLineNum = 710;BA.debugLine="string_inv(4,StrAddr(3),10)";
Debug.ShouldStop(32);
_string_inv((int) (4),_straddr[(int) (3)],(int) (10));
 }else 
{ BA.debugLineNum = 711;BA.debugLine="Else If Addres.ReadWheel = StrAddr(3) AND Set.Re";
Debug.ShouldStop(64);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._delayon_off.ReadWheel()).equals("DelayMin")) { 
 BA.debugLineNum = 712;BA.debugLine="string_inv(4,StrAddr(3),20)";
Debug.ShouldStop(128);
_string_inv((int) (4),_straddr[(int) (3)],(int) (20));
 BA.debugLineNum = 713;BA.debugLine="string_inv(4,StrAddr(3),20)";
Debug.ShouldStop(256);
_string_inv((int) (4),_straddr[(int) (3)],(int) (20));
 }}};
 BA.debugLineNum = 715;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _followluxon_off_tick() throws Exception{
try {
		Debug.PushSubsStack("FollowLuxOn_Off_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,642);
 BA.debugLineNum = 642;BA.debugLine="Sub FollowLuxOn_Off_tick";
Debug.ShouldStop(2);
 BA.debugLineNum = 643;BA.debugLine="FollowLuxOnOff";
Debug.ShouldStop(4);
_followluxonoff();
 BA.debugLineNum = 644;BA.debugLine="End Sub";
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
public static String  _followluxonoff() throws Exception{
try {
		Debug.PushSubsStack("FollowLuxOnOff (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,645);
 BA.debugLineNum = 645;BA.debugLine="Sub FollowLuxOnOff";
Debug.ShouldStop(16);
 BA.debugLineNum = 646;BA.debugLine="If Addres.ReadWheel = StrAddr(0) AND Set.ReadWhee";
Debug.ShouldStop(32);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOn")) { 
 BA.debugLineNum = 647;BA.debugLine="string_invPing(6,StrAddr(0))";
Debug.ShouldStop(64);
_string_invping((int) (6),_straddr[(int) (0)]);
 }else 
{ BA.debugLineNum = 648;BA.debugLine="Else If Addres.ReadWheel = StrAddr(0) AND  Set.Re";
Debug.ShouldStop(128);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOff")) { 
 BA.debugLineNum = 649;BA.debugLine="string_invPing(7,StrAddr(0))";
Debug.ShouldStop(256);
_string_invping((int) (7),_straddr[(int) (0)]);
 }};
 BA.debugLineNum = 652;BA.debugLine="If Addres.ReadWheel = StrAddr(1) AND Set.ReadWhee";
Debug.ShouldStop(2048);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOn")) { 
 BA.debugLineNum = 653;BA.debugLine="string_invPing(6,StrAddr(1))";
Debug.ShouldStop(4096);
_string_invping((int) (6),_straddr[(int) (1)]);
 }else 
{ BA.debugLineNum = 654;BA.debugLine="Else If Addres.ReadWheel = StrAddr(1) AND  Set.Re";
Debug.ShouldStop(8192);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOff")) { 
 BA.debugLineNum = 655;BA.debugLine="string_invPing(7,StrAddr(1))";
Debug.ShouldStop(16384);
_string_invping((int) (7),_straddr[(int) (1)]);
 }};
 BA.debugLineNum = 658;BA.debugLine="If Addres.ReadWheel = StrAddr(2) AND Set.ReadWhee";
Debug.ShouldStop(131072);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOn")) { 
 BA.debugLineNum = 659;BA.debugLine="string_invPing(6,StrAddr(2))";
Debug.ShouldStop(262144);
_string_invping((int) (6),_straddr[(int) (2)]);
 }else 
{ BA.debugLineNum = 660;BA.debugLine="Else If Addres.ReadWheel = StrAddr(2) AND  Set.Re";
Debug.ShouldStop(524288);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOff")) { 
 BA.debugLineNum = 661;BA.debugLine="string_invPing(7,StrAddr(2))";
Debug.ShouldStop(1048576);
_string_invping((int) (7),_straddr[(int) (2)]);
 }};
 BA.debugLineNum = 664;BA.debugLine="If Addres.ReadWheel = StrAddr(3) AND Set.ReadWhee";
Debug.ShouldStop(8388608);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOn")) { 
 BA.debugLineNum = 665;BA.debugLine="string_invPing(6,StrAddr(3))";
Debug.ShouldStop(16777216);
_string_invping((int) (6),_straddr[(int) (3)]);
 }else 
{ BA.debugLineNum = 666;BA.debugLine="Else If Addres.ReadWheel = StrAddr(3) AND  Set.Re";
Debug.ShouldStop(33554432);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOff")) { 
 BA.debugLineNum = 667;BA.debugLine="string_invPing(7,StrAddr(3))";
Debug.ShouldStop(67108864);
_string_invping((int) (7),_straddr[(int) (3)]);
 }};
 BA.debugLineNum = 670;BA.debugLine="End Sub";
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
public static String  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Dim Addres,Set,choice,FollowLux, FollowLuxOn_Off";
mostCurrent._addres = new derez.libs.WheelView();
mostCurrent._set = new derez.libs.WheelView();
mostCurrent._choice = new derez.libs.WheelView();
mostCurrent._followlux = new derez.libs.WheelView();
mostCurrent._followluxon_off = new derez.libs.WheelView();
mostCurrent._presenceon_off = new derez.libs.WheelView();
mostCurrent._presencehi_low = new derez.libs.WheelView();
mostCurrent._delayon_off = new derez.libs.WheelView();
 //BA.debugLineNum = 28;BA.debugLine="Dim pwm_to_timer0 ,pwm_to_timer1,pwm_to_timer2,pw";
_pwm_to_timer0 = 0;
_pwm_to_timer1 = 0;
_pwm_to_timer2 = 0;
_pwm_to_timer3 = 0;
_pwm_pre0 = 0;
_pwm_pre1 = 0;
_pwm_pre2 = 0;
_pwm_pre3 = 0;
_pwm_foll0 = 0;
_pwm_foll1 = 0;
_pwm_foll2 = 0;
_pwm_foll3 = 0;
 //BA.debugLineNum = 29;BA.debugLine="Dim lstaddr As List";
mostCurrent._lstaddr = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 30;BA.debugLine="Public Address As ListView";
mostCurrent._address = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Dim Panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Dim str_,s As String";
mostCurrent._str_ = "";
mostCurrent._s = "";
 //BA.debugLineNum = 37;BA.debugLine="Dim sf As StringFunctions";
mostCurrent._sf = new adr.stringfunctions.stringfunctions();
 //BA.debugLineNum = 38;BA.debugLine="sf.Initialize";
mostCurrent._sf._initialize(processBA);
 //BA.debugLineNum = 39;BA.debugLine="Dim astreams1 As AsyncStreams";
mostCurrent._astreams1 = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 41;BA.debugLine="Dim l As List";
mostCurrent._l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 42;BA.debugLine="l.Initialize";
mostCurrent._l.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="Private lblFont As Typeface";
mostCurrent._lblfont = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private lblLuxValue As Label";
mostCurrent._lblluxvalue = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private Circle,Circle1,Circle2 As CircleSeek";
mostCurrent._circle = new b4a.example.circleseek();
mostCurrent._circle1 = new b4a.example.circleseek();
mostCurrent._circle2 = new b4a.example.circleseek();
 //BA.debugLineNum = 46;BA.debugLine="Dim conta As Int ' provvisorio'";
_conta = 0;
 //BA.debugLineNum = 47;BA.debugLine="Dim arr(5) As Int";
_arr = new int[(int) (5)];
;
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public static String  _goback1_click() throws Exception{
try {
		Debug.PushSubsStack("GoBack1_Click (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,394);
 BA.debugLineNum = 394;BA.debugLine="Sub GoBack1_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 395;BA.debugLine="If admin.IsEnabled = True Then";
Debug.ShouldStop(1024);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 396;BA.debugLine="admin.disable";
Debug.ShouldStop(2048);
_admin.Disable();
 BA.debugLineNum = 397;BA.debugLine="Log(\"Bt as Disable\")";
Debug.ShouldStop(4096);
anywheresoftware.b4a.keywords.Common.Log("Bt as Disable");
 };
 BA.debugLineNum = 399;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
mostCurrent._activity.Finish();
 BA.debugLineNum = 400;BA.debugLine="l.Clear";
Debug.ShouldStop(32768);
mostCurrent._l.Clear();
 BA.debugLineNum = 401;BA.debugLine="StartActivity(\"main\")";
Debug.ShouldStop(65536);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("main"));
 BA.debugLineNum = 402;BA.debugLine="End Sub";
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
public static String  _gonext1_click() throws Exception{
try {
		Debug.PushSubsStack("GoNext1_Click (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,760);
 BA.debugLineNum = 760;BA.debugLine="Sub GoNext1_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 764;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _json_interpreter1(String _jstr) throws Exception{
try {
		Debug.PushSubsStack("json_interpreter1 (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,250);
Debug.locals.put("jstr", _jstr);
 BA.debugLineNum = 250;BA.debugLine="Sub json_interpreter1 (jstr As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 252;BA.debugLine="json.Initialize(jstr)";
Debug.ShouldStop(134217728);
_json.Initialize(_jstr);
 BA.debugLineNum = 253;BA.debugLine="map1.Initialize";
Debug.ShouldStop(268435456);
_map1.Initialize();
 BA.debugLineNum = 254;BA.debugLine="map1=json.NextObject";
Debug.ShouldStop(536870912);
_map1 = _json.NextObject();
 BA.debugLineNum = 255;BA.debugLine="If map1.Get(\"pktype\") = \"reply\" Then";
Debug.ShouldStop(1073741824);
if ((_map1.Get((Object)("pktype"))).equals((Object)("reply"))) { 
 BA.debugLineNum = 256;BA.debugLine="If map1.Get(\"command\") =  \"3\" Then";
Debug.ShouldStop(-2147483648);
if ((_map1.Get((Object)("command"))).equals((Object)("3"))) { 
 BA.debugLineNum = 257;BA.debugLine="arr = map1.Get(\"value\")";
Debug.ShouldStop(1);
_arr = (int[])(_map1.Get((Object)("value")));
 }else 
{ BA.debugLineNum = 258;BA.debugLine="Else If map1.Get(\"command\") = \"1\" Then";
Debug.ShouldStop(2);
if ((_map1.Get((Object)("command"))).equals((Object)("1"))) { 
 BA.debugLineNum = 259;BA.debugLine="arr = map1.Get(\"value\")";
Debug.ShouldStop(4);
_arr = (int[])(_map1.Get((Object)("value")));
 }else 
{ BA.debugLineNum = 260;BA.debugLine="Else If map1.Get(\"command\") = \"2\" Then";
Debug.ShouldStop(8);
if ((_map1.Get((Object)("command"))).equals((Object)("2"))) { 
 BA.debugLineNum = 261;BA.debugLine="arr = map1.Get(\"value\")";
Debug.ShouldStop(16);
_arr = (int[])(_map1.Get((Object)("value")));
 }else 
{ BA.debugLineNum = 262;BA.debugLine="Else If map1.Get(\"command\") = \"4\" Then";
Debug.ShouldStop(32);
if ((_map1.Get((Object)("command"))).equals((Object)("4"))) { 
 BA.debugLineNum = 263;BA.debugLine="arr(1) = map1.Get(\"value\")";
Debug.ShouldStop(64);
_arr[(int) (1)] = (int)(BA.ObjectToNumber(_map1.Get((Object)("value"))));
 }else 
{ BA.debugLineNum = 264;BA.debugLine="Else If map1.Get(\"command\") = 10 Then";
Debug.ShouldStop(128);
if ((_map1.Get((Object)("command"))).equals((Object)(10))) { 
 BA.debugLineNum = 265;BA.debugLine="arr(1) = map1.Get(\"value\")";
Debug.ShouldStop(256);
_arr[(int) (1)] = (int)(BA.ObjectToNumber(_map1.Get((Object)("value"))));
 }else 
{ BA.debugLineNum = 266;BA.debugLine="Else If map1.Get(\"command\") = 11 Then";
Debug.ShouldStop(512);
if ((_map1.Get((Object)("command"))).equals((Object)(11))) { 
 BA.debugLineNum = 267;BA.debugLine="arr(2) = map1.Get(\"value\")";
Debug.ShouldStop(1024);
_arr[(int) (2)] = (int)(BA.ObjectToNumber(_map1.Get((Object)("value"))));
 }else 
{ BA.debugLineNum = 268;BA.debugLine="Else If map1.Get(\"command\") = 5 Then";
Debug.ShouldStop(2048);
if ((_map1.Get((Object)("command"))).equals((Object)(5))) { 
 BA.debugLineNum = 269;BA.debugLine="arr(3) = map1.Get(\"value\")";
Debug.ShouldStop(4096);
_arr[(int) (3)] = (int)(BA.ObjectToNumber(_map1.Get((Object)("value"))));
 }else 
{ BA.debugLineNum = 270;BA.debugLine="Else If map1.Get(\"pktype\") = \"sensors\" Then";
Debug.ShouldStop(8192);
if ((_map1.Get((Object)("pktype"))).equals((Object)("sensors"))) { 
 }}}}}}}};
 }else {
 BA.debugLineNum = 273;BA.debugLine="Take_Address_Take_Pwm 'call suv take_address";
Debug.ShouldStop(65536);
_take_address_take_pwm();
 };
 } 
       catch (Exception e227) {
			processBA.setLastException(e227); BA.debugLineNum = 277;BA.debugLine="admin.Disable";
Debug.ShouldStop(1048576);
_admin.Disable();
 BA.debugLineNum = 278;BA.debugLine="timercoll.Initialize(\"TimerColl\", 1000)";
Debug.ShouldStop(2097152);
Debug.DebugWarningEngine.CheckInitialize(_timercoll);_timercoll.Initialize(processBA,"TimerColl",(long) (1000));
 BA.debugLineNum = 279;BA.debugLine="timercoll.Enabled = True";
Debug.ShouldStop(4194304);
_timercoll.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _label_create() throws Exception{
try {
		Debug.PushSubsStack("Label_create (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,99);
anywheresoftware.b4a.objects.LabelWrapper _labaddress = null;
anywheresoftware.b4a.objects.LabelWrapper _labset = null;
anywheresoftware.b4a.objects.LabelWrapper _labping = null;
anywheresoftware.b4a.objects.LabelWrapper _labdelay = null;
anywheresoftware.b4a.objects.LabelWrapper _labpresenceon_off = null;
anywheresoftware.b4a.objects.LabelWrapper _labpresencehi_low = null;
anywheresoftware.b4a.objects.LabelWrapper _labfollowlux = null;
 BA.debugLineNum = 99;BA.debugLine="Sub Label_create";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Dim LabAddress As Label";
Debug.ShouldStop(8);
_labaddress = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("LabAddress", _labaddress);
 BA.debugLineNum = 101;BA.debugLine="Dim LabSet As Label";
Debug.ShouldStop(16);
_labset = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("LabSet", _labset);
 BA.debugLineNum = 102;BA.debugLine="Dim LabPing As Label";
Debug.ShouldStop(32);
_labping = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("LabPing", _labping);
 BA.debugLineNum = 103;BA.debugLine="Dim LabDelay As Label";
Debug.ShouldStop(64);
_labdelay = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("LabDelay", _labdelay);
 BA.debugLineNum = 104;BA.debugLine="Dim LabPresenceOn_Off As Label";
Debug.ShouldStop(128);
_labpresenceon_off = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("LabPresenceOn_Off", _labpresenceon_off);
 BA.debugLineNum = 105;BA.debugLine="Dim LabPresenceHi_Low As Label";
Debug.ShouldStop(256);
_labpresencehi_low = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("LabPresenceHi_Low", _labpresencehi_low);
 BA.debugLineNum = 106;BA.debugLine="Dim LabFollowLux As Label";
Debug.ShouldStop(512);
_labfollowlux = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("LabFollowLux", _labfollowlux);
 BA.debugLineNum = 107;BA.debugLine="LabAddress.Initialize(\"\")";
Debug.ShouldStop(1024);
_labaddress.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 108;BA.debugLine="LabSet.Initialize(\"\")";
Debug.ShouldStop(2048);
_labset.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 109;BA.debugLine="LabPing.Initialize(\"\")";
Debug.ShouldStop(4096);
_labping.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 110;BA.debugLine="LabDelay.Initialize(\"\")";
Debug.ShouldStop(8192);
_labdelay.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 111;BA.debugLine="LabPresenceOn_Off.Initialize(\"\")";
Debug.ShouldStop(16384);
_labpresenceon_off.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 112;BA.debugLine="LabPresenceHi_Low.Initialize(\"\")";
Debug.ShouldStop(32768);
_labpresencehi_low.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 113;BA.debugLine="LabFollowLux.Initialize(\"\")";
Debug.ShouldStop(65536);
_labfollowlux.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 114;BA.debugLine="LabAddress.Text = \"Address\"";
Debug.ShouldStop(131072);
_labaddress.setText((Object)("Address"));
 BA.debugLineNum = 115;BA.debugLine="LabAddress.TextColor = Colors.RGB(227,227,227)";
Debug.ShouldStop(262144);
_labaddress.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 116;BA.debugLine="LabAddress.TextSize = 25";
Debug.ShouldStop(524288);
_labaddress.setTextSize((float) (25));
 BA.debugLineNum = 117;BA.debugLine="LabAddress.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(1048576);
_labaddress.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
 BA.debugLineNum = 118;BA.debugLine="LabSet.Text = \"Set\"";
Debug.ShouldStop(2097152);
_labset.setText((Object)("Set"));
 BA.debugLineNum = 119;BA.debugLine="LabSet.TextColor = Colors.RGB(227,227,227)";
Debug.ShouldStop(4194304);
_labset.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 120;BA.debugLine="LabSet.TextSize = 25";
Debug.ShouldStop(8388608);
_labset.setTextSize((float) (25));
 BA.debugLineNum = 121;BA.debugLine="LabSet.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(16777216);
_labset.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
 BA.debugLineNum = 122;BA.debugLine="LabPing.Text = \"Ping\"";
Debug.ShouldStop(33554432);
_labping.setText((Object)("Ping"));
 BA.debugLineNum = 123;BA.debugLine="LabPing.TextColor = Colors.RGB(227,227,227)";
Debug.ShouldStop(67108864);
_labping.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 124;BA.debugLine="LabPing.TextSize = 25";
Debug.ShouldStop(134217728);
_labping.setTextSize((float) (25));
 BA.debugLineNum = 125;BA.debugLine="LabPing.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(268435456);
_labping.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
 BA.debugLineNum = 126;BA.debugLine="LabDelay.Text = \"Delay\"";
Debug.ShouldStop(536870912);
_labdelay.setText((Object)("Delay"));
 BA.debugLineNum = 127;BA.debugLine="LabDelay.TextColor = Colors.RGB(227,227,227)";
Debug.ShouldStop(1073741824);
_labdelay.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 128;BA.debugLine="LabDelay.TextSize = 25";
Debug.ShouldStop(-2147483648);
_labdelay.setTextSize((float) (25));
 BA.debugLineNum = 129;BA.debugLine="LabDelay.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(1);
_labdelay.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
 BA.debugLineNum = 130;BA.debugLine="LabPresenceOn_Off.Text = \"Presen\"";
Debug.ShouldStop(2);
_labpresenceon_off.setText((Object)("Presen"));
 BA.debugLineNum = 131;BA.debugLine="LabPresenceOn_Off.TextColor = Colors.RGB(227,227,";
Debug.ShouldStop(4);
_labpresenceon_off.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 132;BA.debugLine="LabPresenceOn_Off.TextSize = 25";
Debug.ShouldStop(8);
_labpresenceon_off.setTextSize((float) (25));
 BA.debugLineNum = 133;BA.debugLine="LabPresenceOn_Off.Gravity = Gravity.CENTER_HORIZO";
Debug.ShouldStop(16);
_labpresenceon_off.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
 BA.debugLineNum = 134;BA.debugLine="LabPresenceHi_Low.Text = \"PresH_L\"";
Debug.ShouldStop(32);
_labpresencehi_low.setText((Object)("PresH_L"));
 BA.debugLineNum = 135;BA.debugLine="LabPresenceHi_Low.TextColor = Colors.RGB(227,227,";
Debug.ShouldStop(64);
_labpresencehi_low.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 136;BA.debugLine="LabPresenceHi_Low.TextSize = 25";
Debug.ShouldStop(128);
_labpresencehi_low.setTextSize((float) (25));
 BA.debugLineNum = 137;BA.debugLine="LabPresenceHi_Low.Gravity = Gravity.CENTER_HORIZO";
Debug.ShouldStop(256);
_labpresencehi_low.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
 BA.debugLineNum = 138;BA.debugLine="LabFollowLux.Text = \"FollLux\"";
Debug.ShouldStop(512);
_labfollowlux.setText((Object)("FollLux"));
 BA.debugLineNum = 139;BA.debugLine="LabFollowLux.TextColor = Colors.RGB(227,227,227)";
Debug.ShouldStop(1024);
_labfollowlux.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (227),(int) (227),(int) (227)));
 BA.debugLineNum = 140;BA.debugLine="LabFollowLux.TextSize = 25";
Debug.ShouldStop(2048);
_labfollowlux.setTextSize((float) (25));
 BA.debugLineNum = 141;BA.debugLine="LabFollowLux.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(4096);
_labfollowlux.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
 BA.debugLineNum = 142;BA.debugLine="Activity.AddView(LabAddress,50dip,85dip,250dip,50";
Debug.ShouldStop(8192);
mostCurrent._activity.AddView((android.view.View)(_labaddress.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 BA.debugLineNum = 143;BA.debugLine="Activity.AddView(LabSet,300dip,85dip,80dip,50dip)";
Debug.ShouldStop(16384);
mostCurrent._activity.AddView((android.view.View)(_labset.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 BA.debugLineNum = 144;BA.debugLine="Activity.AddView(LabPing,380dip,85dip,80dip,50dip";
Debug.ShouldStop(32768);
mostCurrent._activity.AddView((android.view.View)(_labping.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (380)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 BA.debugLineNum = 145;BA.debugLine="Activity.AddView(LabDelay,460dip,85dip,130dip,50d";
Debug.ShouldStop(65536);
mostCurrent._activity.AddView((android.view.View)(_labdelay.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (460)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 BA.debugLineNum = 146;BA.debugLine="Activity.AddView(LabPresenceOn_Off,590dip,85dip,1";
Debug.ShouldStop(131072);
mostCurrent._activity.AddView((android.view.View)(_labpresenceon_off.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (590)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 BA.debugLineNum = 147;BA.debugLine="Activity.AddView(LabPresenceHi_Low,720dip,85dip,1";
Debug.ShouldStop(262144);
mostCurrent._activity.AddView((android.view.View)(_labpresencehi_low.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (720)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 BA.debugLineNum = 148;BA.debugLine="Activity.AddView(LabFollowLux,850dip,85dip,130dip";
Debug.ShouldStop(524288);
mostCurrent._activity.AddView((android.view.View)(_labfollowlux.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (850)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
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
public static String  _presencehi_low_tick() throws Exception{
try {
		Debug.PushSubsStack("PresenceHi_LOW_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,505);
 BA.debugLineNum = 505;BA.debugLine="Sub PresenceHi_LOW_tick";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 506;BA.debugLine="PresenceHi_LOW.ReadWheel";
Debug.ShouldStop(33554432);
mostCurrent._presencehi_low.ReadWheel();
 BA.debugLineNum = 507;BA.debugLine="End Sub";
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
public static String  _presenceon_off_tick() throws Exception{
try {
		Debug.PushSubsStack("PresenceOn_OFF_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,571);
 BA.debugLineNum = 571;BA.debugLine="Sub PresenceOn_OFF_tick";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 572;BA.debugLine="presenceOnOff";
Debug.ShouldStop(134217728);
_presenceonoff();
 BA.debugLineNum = 573;BA.debugLine="End Sub";
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
public static String  _presenceonoff() throws Exception{
try {
		Debug.PushSubsStack("presenceOnOff (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,574);
 BA.debugLineNum = 574;BA.debugLine="Sub presenceOnOff";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 575;BA.debugLine="If Addres.ReadWheel = StrAddr(0) AND PresenceOn_O";
Debug.ShouldStop(1073741824);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._presenceon_off.ReadWheel()).equals("PresOn") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 576;BA.debugLine="string_invPing(8,StrAddr(0))";
Debug.ShouldStop(-2147483648);
_string_invping((int) (8),_straddr[(int) (0)]);
 BA.debugLineNum = 577;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(1);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else 
{ BA.debugLineNum = 578;BA.debugLine="Else If Addres.ReadWheel = StrAddr(0) AND Presenc";
Debug.ShouldStop(2);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._presenceon_off.ReadWheel()).equals("PresOff")) { 
 BA.debugLineNum = 579;BA.debugLine="string_invPing(9,StrAddr(0))";
Debug.ShouldStop(4);
_string_invping((int) (9),_straddr[(int) (0)]);
 BA.debugLineNum = 580;BA.debugLine="string_invPing(9,StrAddr(0))";
Debug.ShouldStop(8);
_string_invping((int) (9),_straddr[(int) (0)]);
 BA.debugLineNum = 581;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(16);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }};
 BA.debugLineNum = 583;BA.debugLine="If Addres.ReadWheel = StrAddr(1) AND PresenceOn_O";
Debug.ShouldStop(64);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._presenceon_off.ReadWheel()).equals("PresOn") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 584;BA.debugLine="string_invPing(8,StrAddr(1))";
Debug.ShouldStop(128);
_string_invping((int) (8),_straddr[(int) (1)]);
 BA.debugLineNum = 585;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(256);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else 
{ BA.debugLineNum = 586;BA.debugLine="Else If Addres.ReadWheel = StrAddr(1) AND Presenc";
Debug.ShouldStop(512);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._presenceon_off.ReadWheel()).equals("PresOff")) { 
 BA.debugLineNum = 587;BA.debugLine="string_invPing(9,StrAddr(1))";
Debug.ShouldStop(1024);
_string_invping((int) (9),_straddr[(int) (1)]);
 BA.debugLineNum = 588;BA.debugLine="string_invPing(9,StrAddr(1))";
Debug.ShouldStop(2048);
_string_invping((int) (9),_straddr[(int) (1)]);
 BA.debugLineNum = 589;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(4096);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }};
 BA.debugLineNum = 591;BA.debugLine="If Addres.ReadWheel = StrAddr(2) AND PresenceOn_O";
Debug.ShouldStop(16384);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._presenceon_off.ReadWheel()).equals("PresOn") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 592;BA.debugLine="string_invPing(8,StrAddr(2))";
Debug.ShouldStop(32768);
_string_invping((int) (8),_straddr[(int) (2)]);
 BA.debugLineNum = 593;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(65536);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else 
{ BA.debugLineNum = 594;BA.debugLine="Else If Addres.ReadWheel = StrAddr(2) AND Presenc";
Debug.ShouldStop(131072);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._presenceon_off.ReadWheel()).equals("PresOff")) { 
 BA.debugLineNum = 595;BA.debugLine="string_invPing(9,StrAddr(2))";
Debug.ShouldStop(262144);
_string_invping((int) (9),_straddr[(int) (2)]);
 BA.debugLineNum = 596;BA.debugLine="string_invPing(9,StrAddr(2))";
Debug.ShouldStop(524288);
_string_invping((int) (9),_straddr[(int) (2)]);
 BA.debugLineNum = 597;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(1048576);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }};
 BA.debugLineNum = 599;BA.debugLine="If Addres.ReadWheel = StrAddr(3) AND PresenceOn_O";
Debug.ShouldStop(4194304);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._presenceon_off.ReadWheel()).equals("PresOn") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 600;BA.debugLine="string_invPing(8,StrAddr(3))";
Debug.ShouldStop(8388608);
_string_invping((int) (8),_straddr[(int) (3)]);
 BA.debugLineNum = 601;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(16777216);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else 
{ BA.debugLineNum = 602;BA.debugLine="Else If Addres.ReadWheel = StrAddr(3) AND Presenc";
Debug.ShouldStop(33554432);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._presenceon_off.ReadWheel()).equals("PresOff")) { 
 BA.debugLineNum = 603;BA.debugLine="string_invPing(9,StrAddr(3))";
Debug.ShouldStop(67108864);
_string_invping((int) (9),_straddr[(int) (3)]);
 BA.debugLineNum = 604;BA.debugLine="string_invPing(9,StrAddr(3))";
Debug.ShouldStop(134217728);
_string_invping((int) (9),_straddr[(int) (3)]);
 BA.debugLineNum = 605;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(268435456);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }};
 BA.debugLineNum = 607;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim Timer1,Timer2 ,Timer3 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
_timer2 = new anywheresoftware.b4a.objects.Timer();
_timer3 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 10;BA.debugLine="Dim timercoll As Timer";
_timercoll = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 11;BA.debugLine="Public admin As BluetoothAdmin";
_admin = new anywheresoftware.b4a.objects.Serial.BluetoothAdmin();
 //BA.debugLineNum = 12;BA.debugLine="Public serial1 As Serial";
_serial1 = new anywheresoftware.b4a.objects.Serial();
 //BA.debugLineNum = 13;BA.debugLine="Public json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 14;BA.debugLine="Public map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Public invio_dati As String";
_invio_dati = "";
 //BA.debugLineNum = 16;BA.debugLine="Public StrAddrPwm(10) As Int";
_straddrpwm = new int[(int) (10)];
;
 //BA.debugLineNum = 17;BA.debugLine="Public StrAddr(4) As String";
_straddr = new String[(int) (4)];
java.util.Arrays.fill(_straddr,"");
 //BA.debugLineNum = 18;BA.debugLine="Public add(4) As String ' provvisoria";
_add = new String[(int) (4)];
java.util.Arrays.fill(_add,"");
 //BA.debugLineNum = 19;BA.debugLine="Public sec,count As Int";
_sec = 0;
_count = 0;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _serial1_connected(boolean _success) throws Exception{
try {
		Debug.PushSubsStack("Serial1_Connected (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,313);
Debug.locals.put("success", _success);
 BA.debugLineNum = 313;BA.debugLine="Sub Serial1_Connected (success As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 315;BA.debugLine="If success = True Then";
Debug.ShouldStop(67108864);
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 316;BA.debugLine="ToastMessageShow(\"Bluetooth connect with success";
Debug.ShouldStop(134217728);
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Bluetooth connect with success",anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 317;BA.debugLine="ToastMessageShow(\"Bluetooth connected to \" & l.G";
Debug.ShouldStop(268435456);
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Bluetooth connected to "+BA.ObjectToString(mostCurrent._l.Get((int) (0))),anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 318;BA.debugLine="astreams1.Initialize(serial1.InputStream,serial1";
Debug.ShouldStop(536870912);
mostCurrent._astreams1.Initialize(processBA,_serial1.getInputStream(),_serial1.getOutputStream(),"AStreams1");
 }else {
 BA.debugLineNum = 320;BA.debugLine="ToastMessageShow(\"Connection to \" & l.Get(0) & \"";
Debug.ShouldStop(-2147483648);
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Connection to "+BA.ObjectToString(mostCurrent._l.Get((int) (0)))+"broken!",anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e272) {
			processBA.setLastException(e272); BA.debugLineNum = 323;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return "";
 };
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _set_tick() throws Exception{
try {
		Debug.PushSubsStack("Set_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,756);
 BA.debugLineNum = 756;BA.debugLine="Sub Set_tick";
Debug.ShouldStop(524288);
 BA.debugLineNum = 757;BA.debugLine="Set.ReadWheel";
Debug.ShouldStop(1048576);
mostCurrent._set.ReadWheel();
 BA.debugLineNum = 758;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _setpingon_off() throws Exception{
try {
		Debug.PushSubsStack("SetPingOn_Off (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,611);
 BA.debugLineNum = 611;BA.debugLine="Sub SetPingOn_Off";
Debug.ShouldStop(4);
 BA.debugLineNum = 612;BA.debugLine="If Addres.ReadWheel = StrAddr(0) AND choice.ReadW";
Debug.ShouldStop(8);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._choice.ReadWheel()).equals("On") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 613;BA.debugLine="string_invPing(1,StrAddr(0))";
Debug.ShouldStop(16);
_string_invping((int) (1),_straddr[(int) (0)]);
 }else 
{ BA.debugLineNum = 614;BA.debugLine="Else If Addres.ReadWheel = StrAddr(0) AND choice.";
Debug.ShouldStop(32);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._choice.ReadWheel()).equals("Off") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 615;BA.debugLine="string_invPing(2,StrAddr(0))";
Debug.ShouldStop(64);
_string_invping((int) (2),_straddr[(int) (0)]);
 BA.debugLineNum = 616;BA.debugLine="string_invPing(2,StrAddr(0))";
Debug.ShouldStop(128);
_string_invping((int) (2),_straddr[(int) (0)]);
 BA.debugLineNum = 617;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(256);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }};
 BA.debugLineNum = 619;BA.debugLine="If Addres.ReadWheel = StrAddr(1) AND choice.ReadW";
Debug.ShouldStop(1024);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._choice.ReadWheel()).equals("On") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 620;BA.debugLine="string_invPing(1,StrAddr(1))";
Debug.ShouldStop(2048);
_string_invping((int) (1),_straddr[(int) (1)]);
 }else 
{ BA.debugLineNum = 621;BA.debugLine="Else If Addres.ReadWheel = StrAddr(1) AND choice.";
Debug.ShouldStop(4096);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._choice.ReadWheel()).equals("Off") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 622;BA.debugLine="string_invPing (2,StrAddr(1))";
Debug.ShouldStop(8192);
_string_invping((int) (2),_straddr[(int) (1)]);
 BA.debugLineNum = 623;BA.debugLine="string_invPing (2,StrAddr(1))";
Debug.ShouldStop(16384);
_string_invping((int) (2),_straddr[(int) (1)]);
 BA.debugLineNum = 624;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(32768);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }};
 BA.debugLineNum = 626;BA.debugLine="If Addres.ReadWheel = StrAddr(2) AND choice.ReadW";
Debug.ShouldStop(131072);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._choice.ReadWheel()).equals("On") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 627;BA.debugLine="string_invPing(1,StrAddr(2))";
Debug.ShouldStop(262144);
_string_invping((int) (1),_straddr[(int) (2)]);
 }else 
{ BA.debugLineNum = 628;BA.debugLine="Else If Addres.ReadWheel = StrAddr(2) AND choice.";
Debug.ShouldStop(524288);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._choice.ReadWheel()).equals("Off") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 629;BA.debugLine="string_invPing (2,StrAddr(2))";
Debug.ShouldStop(1048576);
_string_invping((int) (2),_straddr[(int) (2)]);
 BA.debugLineNum = 630;BA.debugLine="string_invPing (2,StrAddr(2))";
Debug.ShouldStop(2097152);
_string_invping((int) (2),_straddr[(int) (2)]);
 BA.debugLineNum = 631;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(4194304);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }};
 BA.debugLineNum = 633;BA.debugLine="If Addres.ReadWheel = StrAddr(3) AND choice.ReadW";
Debug.ShouldStop(16777216);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._choice.ReadWheel()).equals("On") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 634;BA.debugLine="string_invPing(1,StrAddr(3))";
Debug.ShouldStop(33554432);
_string_invping((int) (1),_straddr[(int) (3)]);
 }else 
{ BA.debugLineNum = 635;BA.debugLine="Else If Addres.ReadWheel = StrAddr(3) AND choice.";
Debug.ShouldStop(67108864);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._choice.ReadWheel()).equals("Off") && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 636;BA.debugLine="string_invPing (2,StrAddr(3))";
Debug.ShouldStop(134217728);
_string_invping((int) (2),_straddr[(int) (3)]);
 BA.debugLineNum = 637;BA.debugLine="string_invPing (2,StrAddr(3))";
Debug.ShouldStop(268435456);
_string_invping((int) (2),_straddr[(int) (3)]);
 BA.debugLineNum = 639;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(1073741824);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }};
 BA.debugLineNum = 641;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _string_inv(int _cmd,String _addr,int _value) throws Exception{
try {
		Debug.PushSubsStack("string_inv (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,370);
Debug.locals.put("cmd", _cmd);
Debug.locals.put("Addr", _addr);
Debug.locals.put("value", _value);
 BA.debugLineNum = 370;BA.debugLine="Sub string_inv(cmd As Int, Addr As String, value A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 371;BA.debugLine="astreams1.Write(invio_dati.GetBytes(\"UTF-8\"))";
Debug.ShouldStop(262144);
mostCurrent._astreams1.Write(_invio_dati.getBytes("UTF-8"));
 BA.debugLineNum = 372;BA.debugLine="If cmd = 3 Then 				' Set Light Value";
Debug.ShouldStop(524288);
if (_cmd==3) { 
 BA.debugLineNum = 373;BA.debugLine="invio_dati = \"3,\" & Addr & \",\" & value & \";\"";
Debug.ShouldStop(1048576);
_invio_dati = "3,"+_addr+","+BA.NumberToString(_value)+";";
 }else 
{ BA.debugLineNum = 375;BA.debugLine="Else If  cmd = 4 Then 				'Set Delay value (0 = F";
Debug.ShouldStop(4194304);
if (_cmd==4) { 
 BA.debugLineNum = 376;BA.debugLine="invio_dati = \"4,\" & Addr & \",\" & value & \";\"";
Debug.ShouldStop(8388608);
_invio_dati = "4,"+_addr+","+BA.NumberToString(_value)+";";
 BA.debugLineNum = 377;BA.debugLine="Log (\"prog\" & invio_dati)";
Debug.ShouldStop(16777216);
anywheresoftware.b4a.keywords.Common.Log("prog"+_invio_dati);
 BA.debugLineNum = 378;BA.debugLine="Log (\"quanti invio\" & conta)";
Debug.ShouldStop(33554432);
anywheresoftware.b4a.keywords.Common.Log("quanti invio"+BA.NumberToString(_conta));
 }else 
{ BA.debugLineNum = 379;BA.debugLine="Else If cmd = 5 Then 			' Set FollowLux Value";
Debug.ShouldStop(67108864);
if (_cmd==5) { 
 BA.debugLineNum = 380;BA.debugLine="invio_dati = \"5,\" & Addr & \",\" & value & \";\"";
Debug.ShouldStop(134217728);
_invio_dati = "5,"+_addr+","+BA.NumberToString(_value)+";";
 BA.debugLineNum = 381;BA.debugLine="conta = conta + 1";
Debug.ShouldStop(268435456);
_conta = (int) (_conta+1);
 BA.debugLineNum = 383;BA.debugLine="Log (\"quanti invio\" & conta)";
Debug.ShouldStop(1073741824);
anywheresoftware.b4a.keywords.Common.Log("quanti invio"+BA.NumberToString(_conta));
 BA.debugLineNum = 384;BA.debugLine="Log (invio_dati)";
Debug.ShouldStop(-2147483648);
anywheresoftware.b4a.keywords.Common.Log(_invio_dati);
 }else 
{ BA.debugLineNum = 385;BA.debugLine="Else If cmd = 10 Then 			' Set Presence High Valu";
Debug.ShouldStop(1);
if (_cmd==10) { 
 BA.debugLineNum = 386;BA.debugLine="invio_dati = \"10,\" & Addr & \",\" & value & \";\"";
Debug.ShouldStop(2);
_invio_dati = "10,"+_addr+","+BA.NumberToString(_value)+";";
 }else 
{ BA.debugLineNum = 388;BA.debugLine="Else If cmd = 11 Then 			' Set Presence Low Value";
Debug.ShouldStop(8);
if (_cmd==11) { 
 BA.debugLineNum = 389;BA.debugLine="invio_dati = \"11,\" & Addr & \",\" & value & \";\"";
Debug.ShouldStop(16);
_invio_dati = "11,"+_addr+","+BA.NumberToString(_value)+";";
 }}}}};
 BA.debugLineNum = 393;BA.debugLine="End Sub";
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
public static String  _string_invping(int _cmd,String _addr) throws Exception{
try {
		Debug.PushSubsStack("string_invPing (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,348);
Debug.locals.put("cmd", _cmd);
Debug.locals.put("Addr", _addr);
 BA.debugLineNum = 348;BA.debugLine="Sub string_invPing(cmd As Int ,Addr As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="astreams1.Write(invio_dati.GetBytes(\"UTF-8\"))";
Debug.ShouldStop(268435456);
mostCurrent._astreams1.Write(_invio_dati.getBytes("UTF-8"));
 BA.debugLineNum = 350;BA.debugLine="If cmd = 1 Then 				' Set Ping ON";
Debug.ShouldStop(536870912);
if (_cmd==1) { 
 BA.debugLineNum = 351;BA.debugLine="invio_dati = \"1,\" & Addr & \";\"";
Debug.ShouldStop(1073741824);
_invio_dati = "1,"+_addr+";";
 BA.debugLineNum = 352;BA.debugLine="Log (\"pingon\" &invio_dati)";
Debug.ShouldStop(-2147483648);
anywheresoftware.b4a.keywords.Common.Log("pingon"+_invio_dati);
 }else 
{ BA.debugLineNum = 353;BA.debugLine="Else If cmd = 2 Then            ' Set Ping OFF";
Debug.ShouldStop(1);
if (_cmd==2) { 
 BA.debugLineNum = 354;BA.debugLine="invio_dati = \"2,\" & Addr & \";\"";
Debug.ShouldStop(2);
_invio_dati = "2,"+_addr+";";
 BA.debugLineNum = 355;BA.debugLine="Log (\"pingoff\" &invio_dati)";
Debug.ShouldStop(4);
anywheresoftware.b4a.keywords.Common.Log("pingoff"+_invio_dati);
 }else 
{ BA.debugLineNum = 356;BA.debugLine="Else If cmd = 6 Then  			' Set Follow On";
Debug.ShouldStop(8);
if (_cmd==6) { 
 BA.debugLineNum = 357;BA.debugLine="invio_dati = \"6,\" & Addr & \";\"";
Debug.ShouldStop(16);
_invio_dati = "6,"+_addr+";";
 BA.debugLineNum = 358;BA.debugLine="Log (invio_dati)";
Debug.ShouldStop(32);
anywheresoftware.b4a.keywords.Common.Log(_invio_dati);
 }else 
{ BA.debugLineNum = 359;BA.debugLine="Else If cmd = 7 Then			' Set Follow OFF";
Debug.ShouldStop(64);
if (_cmd==7) { 
 BA.debugLineNum = 360;BA.debugLine="invio_dati = \"7,\" & Addr & \";\"";
Debug.ShouldStop(128);
_invio_dati = "7,"+_addr+";";
 BA.debugLineNum = 361;BA.debugLine="Log (invio_dati)";
Debug.ShouldStop(256);
anywheresoftware.b4a.keywords.Common.Log(_invio_dati);
 }else 
{ BA.debugLineNum = 362;BA.debugLine="Else If cmd = 8 Then			' Set Presence On";
Debug.ShouldStop(512);
if (_cmd==8) { 
 BA.debugLineNum = 363;BA.debugLine="invio_dati = \"8,\" & Addr & \";\"";
Debug.ShouldStop(1024);
_invio_dati = "8,"+_addr+";";
 }else 
{ BA.debugLineNum = 365;BA.debugLine="Else If cmd = 9 Then			' Set Presence OFF";
Debug.ShouldStop(4096);
if (_cmd==9) { 
 BA.debugLineNum = 366;BA.debugLine="invio_dati = \"9,\" & Addr & \";\"";
Debug.ShouldStop(8192);
_invio_dati = "9,"+_addr+";";
 }}}}}};
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _take_address_take_pwm() throws Exception{
try {
		Debug.PushSubsStack("Take_Address_Take_Pwm (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,292);
 BA.debugLineNum = 292;BA.debugLine="Sub Take_Address_Take_Pwm";
Debug.ShouldStop(8);
 BA.debugLineNum = 294;BA.debugLine="If map1.Get(\"address64\") = \"0x0013a20040be447f\"";
Debug.ShouldStop(32);
if ((_map1.Get((Object)("address64"))).equals((Object)("0x0013a20040be447f"))) { 
 BA.debugLineNum = 295;BA.debugLine="StrAddrPwm(4) = map1.Get(\"pwm\")";
Debug.ShouldStop(64);
_straddrpwm[(int) (4)] = (int)(BA.ObjectToNumber(_map1.Get((Object)("pwm"))));
 }else 
{ BA.debugLineNum = 296;BA.debugLine="Else If map1.Get(\"address64\") = \"0x0013a200406ff";
Debug.ShouldStop(128);
if ((_map1.Get((Object)("address64"))).equals((Object)("0x0013a200406ff46e"))) { 
 BA.debugLineNum = 297;BA.debugLine="StrAddrPwm(5) = map1.Get(\"pwm\")";
Debug.ShouldStop(256);
_straddrpwm[(int) (5)] = (int)(BA.ObjectToNumber(_map1.Get((Object)("pwm"))));
 }else 
{ BA.debugLineNum = 298;BA.debugLine="Else If map1.Get(\"address64\") = \"0x0013a20040332";
Debug.ShouldStop(512);
if ((_map1.Get((Object)("address64"))).equals((Object)("0x0013a20040332051"))) { 
 BA.debugLineNum = 299;BA.debugLine="StrAddrPwm(6) = map1.Get(\"pwm\")";
Debug.ShouldStop(1024);
_straddrpwm[(int) (6)] = (int)(BA.ObjectToNumber(_map1.Get((Object)("pwm"))));
 }else 
{ BA.debugLineNum = 300;BA.debugLine="Else If map1.Get(\"address64\") = \"0x0013a20040626";
Debug.ShouldStop(2048);
if ((_map1.Get((Object)("address64"))).equals((Object)("0x0013a20040626109"))) { 
 BA.debugLineNum = 301;BA.debugLine="StrAddrPwm(7) = map1.Get(\"pwm\")";
Debug.ShouldStop(4096);
_straddrpwm[(int) (7)] = (int)(BA.ObjectToNumber(_map1.Get((Object)("pwm"))));
 }}}};
 BA.debugLineNum = 303;BA.debugLine="End Sub";
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
public static String  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,716);
 BA.debugLineNum = 716;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(2048);
 BA.debugLineNum = 717;BA.debugLine="count = count + 1";
Debug.ShouldStop(4096);
_count = (int) (_count+1);
 BA.debugLineNum = 718;BA.debugLine="Log (count)";
Debug.ShouldStop(8192);
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_count));
 BA.debugLineNum = 719;BA.debugLine="If Addres.ReadWheel = StrAddr(0) AND Set.ReadWhee";
Debug.ShouldStop(16384);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 720;BA.debugLine="If StrAddrPwm(4) <> pwm_to_timer0 Then";
Debug.ShouldStop(32768);
if (_straddrpwm[(int) (4)]!=_pwm_to_timer0) { 
 BA.debugLineNum = 721;BA.debugLine="string_inv(3,StrAddr(0),pwm_to_timer0)";
Debug.ShouldStop(65536);
_string_inv((int) (3),_straddr[(int) (0)],_pwm_to_timer0);
 }else 
{ BA.debugLineNum = 722;BA.debugLine="Else If StrAddrPwm(4) = pwm_to_timer0 Then";
Debug.ShouldStop(131072);
if (_straddrpwm[(int) (4)]==_pwm_to_timer0) { 
 BA.debugLineNum = 723;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(262144);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 724;BA.debugLine="count = 0";
Debug.ShouldStop(524288);
_count = (int) (0);
 BA.debugLineNum = 725;BA.debugLine="Log (\"addr0\" & pwm_to_timer0)";
Debug.ShouldStop(1048576);
anywheresoftware.b4a.keywords.Common.Log("addr0"+BA.NumberToString(_pwm_to_timer0));
 }};
 };
 BA.debugLineNum = 728;BA.debugLine="If Addres.ReadWheel = StrAddr(1) AND Set.ReadWhee";
Debug.ShouldStop(8388608);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 729;BA.debugLine="If StrAddrPwm(5) <>  pwm_to_timer1 Then";
Debug.ShouldStop(16777216);
if (_straddrpwm[(int) (5)]!=_pwm_to_timer1) { 
 BA.debugLineNum = 730;BA.debugLine="string_inv(3,StrAddr(1),pwm_to_timer1)";
Debug.ShouldStop(33554432);
_string_inv((int) (3),_straddr[(int) (1)],_pwm_to_timer1);
 }else 
{ BA.debugLineNum = 731;BA.debugLine="Else If StrAddrPwm(5) = pwm_to_timer1 Then";
Debug.ShouldStop(67108864);
if (_straddrpwm[(int) (5)]==_pwm_to_timer1) { 
 BA.debugLineNum = 732;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(134217728);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 733;BA.debugLine="count= 0";
Debug.ShouldStop(268435456);
_count = (int) (0);
 BA.debugLineNum = 734;BA.debugLine="Log (\"addr1\" & pwm_to_timer1)";
Debug.ShouldStop(536870912);
anywheresoftware.b4a.keywords.Common.Log("addr1"+BA.NumberToString(_pwm_to_timer1));
 }};
 };
 BA.debugLineNum = 737;BA.debugLine="If Addres.ReadWheel = StrAddr(2) AND Set.ReadWhee";
Debug.ShouldStop(1);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 738;BA.debugLine="If StrAddrPwm(6) <>  pwm_to_timer2 Then";
Debug.ShouldStop(2);
if (_straddrpwm[(int) (6)]!=_pwm_to_timer2) { 
 BA.debugLineNum = 739;BA.debugLine="string_inv(3,StrAddr(2),pwm_to_timer2)";
Debug.ShouldStop(4);
_string_inv((int) (3),_straddr[(int) (2)],_pwm_to_timer2);
 }else 
{ BA.debugLineNum = 740;BA.debugLine="Else If StrAddrPwm(6) = pwm_to_timer2 Then";
Debug.ShouldStop(8);
if (_straddrpwm[(int) (6)]==_pwm_to_timer2) { 
 BA.debugLineNum = 741;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(16);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 742;BA.debugLine="count = 0";
Debug.ShouldStop(32);
_count = (int) (0);
 BA.debugLineNum = 743;BA.debugLine="Log (\"addr2\" & pwm_to_timer2)";
Debug.ShouldStop(64);
anywheresoftware.b4a.keywords.Common.Log("addr2"+BA.NumberToString(_pwm_to_timer2));
 }};
 };
 BA.debugLineNum = 746;BA.debugLine="If Addres.ReadWheel = StrAddr(3) AND Set.ReadWhee";
Debug.ShouldStop(512);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes")) { 
 BA.debugLineNum = 747;BA.debugLine="If StrAddrPwm(7) <> pwm_to_timer3 Then";
Debug.ShouldStop(1024);
if (_straddrpwm[(int) (7)]!=_pwm_to_timer3) { 
 BA.debugLineNum = 748;BA.debugLine="string_inv(3,StrAddr(3),pwm_to_timer3)";
Debug.ShouldStop(2048);
_string_inv((int) (3),_straddr[(int) (3)],_pwm_to_timer3);
 }else 
{ BA.debugLineNum = 749;BA.debugLine="Else If StrAddrPwm(7) = pwm_to_timer3 Then";
Debug.ShouldStop(4096);
if (_straddrpwm[(int) (7)]==_pwm_to_timer3) { 
 BA.debugLineNum = 750;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(8192);
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 751;BA.debugLine="count = 0";
Debug.ShouldStop(16384);
_count = (int) (0);
 BA.debugLineNum = 752;BA.debugLine="Log (\"addr3\" & pwm_to_timer3)";
Debug.ShouldStop(32768);
anywheresoftware.b4a.keywords.Common.Log("addr3"+BA.NumberToString(_pwm_to_timer3));
 }};
 };
 BA.debugLineNum = 755;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _timer2_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer2_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,508);
 BA.debugLineNum = 508;BA.debugLine="Sub Timer2_tick";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 509;BA.debugLine="If Addres.ReadWheel = StrAddr(0) AND Set.ReadWhee";
Debug.ShouldStop(268435456);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._presencehi_low.ReadWheel()).equals("PreLuxHi")) { 
 BA.debugLineNum = 510;BA.debugLine="If arr(1) <> pwm_Pre0 Then";
Debug.ShouldStop(536870912);
if (_arr[(int) (1)]!=_pwm_pre0) { 
 BA.debugLineNum = 511;BA.debugLine="string_inv(10,StrAddr(0),pwm_Pre0)";
Debug.ShouldStop(1073741824);
_string_inv((int) (10),_straddr[(int) (0)],_pwm_pre0);
 }else 
{ BA.debugLineNum = 512;BA.debugLine="Else If arr(1) = pwm_Pre0 Then";
Debug.ShouldStop(-2147483648);
if (_arr[(int) (1)]==_pwm_pre0) { 
 BA.debugLineNum = 513;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(1);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 514;BA.debugLine="Log (\"valori uguali0\")";
Debug.ShouldStop(2);
anywheresoftware.b4a.keywords.Common.Log("valori uguali0");
 }};
 }else 
{ BA.debugLineNum = 516;BA.debugLine="Else If Addres.ReadWheel = StrAddr(0) AND Set.Rea";
Debug.ShouldStop(8);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._presencehi_low.ReadWheel()).equals("PreLuxLo")) { 
 BA.debugLineNum = 517;BA.debugLine="If arr(2) <> pwm_Pre0 Then";
Debug.ShouldStop(16);
if (_arr[(int) (2)]!=_pwm_pre0) { 
 BA.debugLineNum = 518;BA.debugLine="string_inv(11,StrAddr(0),pwm_Pre0)";
Debug.ShouldStop(32);
_string_inv((int) (11),_straddr[(int) (0)],_pwm_pre0);
 }else 
{ BA.debugLineNum = 519;BA.debugLine="Else If arr(2) = pwm_Pre0 Then";
Debug.ShouldStop(64);
if (_arr[(int) (2)]==_pwm_pre0) { 
 BA.debugLineNum = 520;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(128);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 521;BA.debugLine="Log (\"valori uguali1\")";
Debug.ShouldStop(256);
anywheresoftware.b4a.keywords.Common.Log("valori uguali1");
 }};
 }};
 BA.debugLineNum = 524;BA.debugLine="If Addres.ReadWheel = StrAddr(1) AND Set.ReadWhee";
Debug.ShouldStop(2048);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._presencehi_low.ReadWheel()).equals("PreLuxHi")) { 
 BA.debugLineNum = 525;BA.debugLine="If arr(1) <> pwm_Pre1 Then";
Debug.ShouldStop(4096);
if (_arr[(int) (1)]!=_pwm_pre1) { 
 BA.debugLineNum = 526;BA.debugLine="string_inv(10,StrAddr(1),pwm_Pre1)";
Debug.ShouldStop(8192);
_string_inv((int) (10),_straddr[(int) (1)],_pwm_pre1);
 }else 
{ BA.debugLineNum = 527;BA.debugLine="Else If arr(1) = pwm_Pre1 Then";
Debug.ShouldStop(16384);
if (_arr[(int) (1)]==_pwm_pre1) { 
 BA.debugLineNum = 528;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(32768);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 529;BA.debugLine="Log (\"valori uguali2\")";
Debug.ShouldStop(65536);
anywheresoftware.b4a.keywords.Common.Log("valori uguali2");
 }};
 }else 
{ BA.debugLineNum = 531;BA.debugLine="Else If Addres.ReadWheel = StrAddr(1) AND Set.Rea";
Debug.ShouldStop(262144);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._presencehi_low.ReadWheel()).equals("PreLuxLo")) { 
 BA.debugLineNum = 532;BA.debugLine="If arr(2) <> pwm_Pre1 Then";
Debug.ShouldStop(524288);
if (_arr[(int) (2)]!=_pwm_pre1) { 
 BA.debugLineNum = 533;BA.debugLine="string_inv(11,StrAddr(1),pwm_Pre1)";
Debug.ShouldStop(1048576);
_string_inv((int) (11),_straddr[(int) (1)],_pwm_pre1);
 }else 
{ BA.debugLineNum = 534;BA.debugLine="Else If arr(2) = pwm_Pre1 Then";
Debug.ShouldStop(2097152);
if (_arr[(int) (2)]==_pwm_pre1) { 
 BA.debugLineNum = 535;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(4194304);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 536;BA.debugLine="Log (\"valori uguali3\")";
Debug.ShouldStop(8388608);
anywheresoftware.b4a.keywords.Common.Log("valori uguali3");
 }};
 }};
 BA.debugLineNum = 539;BA.debugLine="If Addres.ReadWheel = StrAddr(2) AND Set.ReadWhee";
Debug.ShouldStop(67108864);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._presencehi_low.ReadWheel()).equals("PreLuxHi")) { 
 BA.debugLineNum = 540;BA.debugLine="If arr(1) <> pwm_Pre2 Then";
Debug.ShouldStop(134217728);
if (_arr[(int) (1)]!=_pwm_pre2) { 
 BA.debugLineNum = 541;BA.debugLine="string_inv(10,StrAddr(2),pwm_Pre2)";
Debug.ShouldStop(268435456);
_string_inv((int) (10),_straddr[(int) (2)],_pwm_pre2);
 }else 
{ BA.debugLineNum = 542;BA.debugLine="Else If arr(1) = pwm_Pre2 Then";
Debug.ShouldStop(536870912);
if (_arr[(int) (1)]==_pwm_pre2) { 
 BA.debugLineNum = 543;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(1073741824);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 544;BA.debugLine="Log (\"valori uguali\")";
Debug.ShouldStop(-2147483648);
anywheresoftware.b4a.keywords.Common.Log("valori uguali");
 }};
 }else 
{ BA.debugLineNum = 546;BA.debugLine="Else If Addres.ReadWheel = StrAddr(2) AND Set.Rea";
Debug.ShouldStop(2);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._presencehi_low.ReadWheel()).equals("PreLuxLo")) { 
 BA.debugLineNum = 547;BA.debugLine="If arr(2) <> pwm_Pre2 Then";
Debug.ShouldStop(4);
if (_arr[(int) (2)]!=_pwm_pre2) { 
 BA.debugLineNum = 548;BA.debugLine="string_inv(11,StrAddr(2),pwm_Pre2)";
Debug.ShouldStop(8);
_string_inv((int) (11),_straddr[(int) (2)],_pwm_pre2);
 }else 
{ BA.debugLineNum = 549;BA.debugLine="Else If arr(2) = pwm_Pre2 Then";
Debug.ShouldStop(16);
if (_arr[(int) (2)]==_pwm_pre2) { 
 BA.debugLineNum = 550;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(32);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 551;BA.debugLine="Log (\"valori uguali\")";
Debug.ShouldStop(64);
anywheresoftware.b4a.keywords.Common.Log("valori uguali");
 }};
 }};
 BA.debugLineNum = 554;BA.debugLine="If Addres.ReadWheel = StrAddr(3) AND Set.ReadWhee";
Debug.ShouldStop(512);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._presencehi_low.ReadWheel()).equals("PreLuxHi")) { 
 BA.debugLineNum = 555;BA.debugLine="If arr(1) <> pwm_Pre3 Then";
Debug.ShouldStop(1024);
if (_arr[(int) (1)]!=_pwm_pre3) { 
 BA.debugLineNum = 556;BA.debugLine="string_inv(10,StrAddr(3),pwm_Pre3)";
Debug.ShouldStop(2048);
_string_inv((int) (10),_straddr[(int) (3)],_pwm_pre3);
 }else 
{ BA.debugLineNum = 557;BA.debugLine="Else If arr(1) = pwm_Pre3 Then";
Debug.ShouldStop(4096);
if (_arr[(int) (1)]==_pwm_pre3) { 
 BA.debugLineNum = 558;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(8192);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 559;BA.debugLine="Log (\"valori uguali\")";
Debug.ShouldStop(16384);
anywheresoftware.b4a.keywords.Common.Log("valori uguali");
 }};
 }else 
{ BA.debugLineNum = 561;BA.debugLine="Else If Addres.ReadWheel = StrAddr(3) AND Set.Rea";
Debug.ShouldStop(65536);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._presencehi_low.ReadWheel()).equals("PreLuxLo")) { 
 BA.debugLineNum = 562;BA.debugLine="If arr(2) <> pwm_Pre3 Then";
Debug.ShouldStop(131072);
if (_arr[(int) (2)]!=_pwm_pre3) { 
 BA.debugLineNum = 563;BA.debugLine="string_inv(11,StrAddr(3),pwm_Pre3)";
Debug.ShouldStop(262144);
_string_inv((int) (11),_straddr[(int) (3)],_pwm_pre3);
 }else 
{ BA.debugLineNum = 564;BA.debugLine="Else If arr(2) = pwm_Pre3 Then";
Debug.ShouldStop(524288);
if (_arr[(int) (2)]==_pwm_pre3) { 
 BA.debugLineNum = 565;BA.debugLine="Timer2.Enabled = False";
Debug.ShouldStop(1048576);
_timer2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 566;BA.debugLine="Log (\"valori uguali\")";
Debug.ShouldStop(2097152);
anywheresoftware.b4a.keywords.Common.Log("valori uguali");
 }};
 }};
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _timer3_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer3_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,466);
 BA.debugLineNum = 466;BA.debugLine="Sub Timer3_tick";
Debug.ShouldStop(131072);
 BA.debugLineNum = 467;BA.debugLine="If Addres.ReadWheel = StrAddr(0) AND Set.ReadWhee";
Debug.ShouldStop(262144);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (0)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOn")) { 
 BA.debugLineNum = 468;BA.debugLine="string_inv(5,StrAddr(0),pwm_Foll3)";
Debug.ShouldStop(524288);
_string_inv((int) (5),_straddr[(int) (0)],_pwm_foll3);
 BA.debugLineNum = 469;BA.debugLine="count = count + 1";
Debug.ShouldStop(1048576);
_count = (int) (_count+1);
 BA.debugLineNum = 470;BA.debugLine="Log (\"secondi\" & count)";
Debug.ShouldStop(2097152);
anywheresoftware.b4a.keywords.Common.Log("secondi"+BA.NumberToString(_count));
 BA.debugLineNum = 471;BA.debugLine="If count = 3 Then";
Debug.ShouldStop(4194304);
if (_count==3) { 
 BA.debugLineNum = 472;BA.debugLine="Timer3.Enabled = False";
Debug.ShouldStop(8388608);
_timer3.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 473;BA.debugLine="count = 0";
Debug.ShouldStop(16777216);
_count = (int) (0);
 BA.debugLineNum = 474;BA.debugLine="Log (\"addr0\" & pwm_to_timer0)";
Debug.ShouldStop(33554432);
anywheresoftware.b4a.keywords.Common.Log("addr0"+BA.NumberToString(_pwm_to_timer0));
 };
 };
 BA.debugLineNum = 477;BA.debugLine="If Addres.ReadWheel = StrAddr(1) AND Set.ReadWhee";
Debug.ShouldStop(268435456);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (1)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOn")) { 
 BA.debugLineNum = 478;BA.debugLine="string_inv(5,StrAddr(1),pwm_Foll3)";
Debug.ShouldStop(536870912);
_string_inv((int) (5),_straddr[(int) (1)],_pwm_foll3);
 BA.debugLineNum = 479;BA.debugLine="count = count + 1";
Debug.ShouldStop(1073741824);
_count = (int) (_count+1);
 BA.debugLineNum = 480;BA.debugLine="Log (\"secondi\" & count)";
Debug.ShouldStop(-2147483648);
anywheresoftware.b4a.keywords.Common.Log("secondi"+BA.NumberToString(_count));
 BA.debugLineNum = 481;BA.debugLine="If count = 3 Then";
Debug.ShouldStop(1);
if (_count==3) { 
 BA.debugLineNum = 482;BA.debugLine="Timer3.Enabled = False";
Debug.ShouldStop(2);
_timer3.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 483;BA.debugLine="count = 0";
Debug.ShouldStop(4);
_count = (int) (0);
 };
 };
 BA.debugLineNum = 486;BA.debugLine="If Addres.ReadWheel = StrAddr(2) AND Set.ReadWhee";
Debug.ShouldStop(32);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (2)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOn")) { 
 BA.debugLineNum = 487;BA.debugLine="string_inv(5,StrAddr(2),pwm_Foll3)";
Debug.ShouldStop(64);
_string_inv((int) (5),_straddr[(int) (2)],_pwm_foll3);
 BA.debugLineNum = 488;BA.debugLine="count = count + 1";
Debug.ShouldStop(128);
_count = (int) (_count+1);
 BA.debugLineNum = 489;BA.debugLine="Log (\"secondi\" & count)";
Debug.ShouldStop(256);
anywheresoftware.b4a.keywords.Common.Log("secondi"+BA.NumberToString(_count));
 BA.debugLineNum = 490;BA.debugLine="If count = 3 Then";
Debug.ShouldStop(512);
if (_count==3) { 
 BA.debugLineNum = 491;BA.debugLine="Timer3.Enabled = False";
Debug.ShouldStop(1024);
_timer3.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 492;BA.debugLine="count = 0";
Debug.ShouldStop(2048);
_count = (int) (0);
 };
 };
 BA.debugLineNum = 495;BA.debugLine="If Addres.ReadWheel = StrAddr(3) AND Set.ReadWhee";
Debug.ShouldStop(16384);
if ((mostCurrent._addres.ReadWheel()).equals(_straddr[(int) (3)]) && (mostCurrent._set.ReadWheel()).equals("yes") && (mostCurrent._followluxon_off.ReadWheel()).equals("FolOn")) { 
 BA.debugLineNum = 496;BA.debugLine="string_inv(5,StrAddr(3),pwm_Foll3)";
Debug.ShouldStop(32768);
_string_inv((int) (5),_straddr[(int) (3)],_pwm_foll3);
 BA.debugLineNum = 497;BA.debugLine="count = count + 1";
Debug.ShouldStop(65536);
_count = (int) (_count+1);
 BA.debugLineNum = 498;BA.debugLine="Log (\"secondi\" & count)";
Debug.ShouldStop(131072);
anywheresoftware.b4a.keywords.Common.Log("secondi"+BA.NumberToString(_count));
 BA.debugLineNum = 499;BA.debugLine="If count = 3 Then";
Debug.ShouldStop(262144);
if (_count==3) { 
 BA.debugLineNum = 500;BA.debugLine="Timer3.Enabled = False";
Debug.ShouldStop(524288);
_timer3.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 501;BA.debugLine="count = 0";
Debug.ShouldStop(1048576);
_count = (int) (0);
 };
 };
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _timercoll_tick() throws Exception{
try {
		Debug.PushSubsStack("TimerColl_tick (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,282);
 BA.debugLineNum = 282;BA.debugLine="Sub TimerColl_tick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="sec = sec + 1";
Debug.ShouldStop(67108864);
_sec = (int) (_sec+1);
 BA.debugLineNum = 284;BA.debugLine="If sec > 5 Then";
Debug.ShouldStop(134217728);
if (_sec>5) { 
 BA.debugLineNum = 285;BA.debugLine="admin.Enable";
Debug.ShouldStop(268435456);
_admin.Enable();
 BA.debugLineNum = 286;BA.debugLine="BT_StateChanged(1,0)";
Debug.ShouldStop(536870912);
_bt_statechanged((int) (1),(int) (0));
 BA.debugLineNum = 287;BA.debugLine="If admin.Enable = True Then";
Debug.ShouldStop(1073741824);
if (_admin.Enable()==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 288;BA.debugLine="timercoll.Enabled = False";
Debug.ShouldStop(-2147483648);
_timercoll.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 };
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _wheel_create() throws Exception{
try {
		Debug.PushSubsStack("wheel_create (configurationwizardmod) ","configurationwizardmod",8,mostCurrent.activityBA,mostCurrent,151);
String[] _strset = null;
String[] _strping = null;
String[] _strfolllux = null;
String[] _strpresence = null;
String[] _strpresencevalue = null;
String[] _strdelay = null;
int _svsstep = 0;
 BA.debugLineNum = 151;BA.debugLine="Sub wheel_create";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="lstaddr.Initialize";
Debug.ShouldStop(8388608);
mostCurrent._lstaddr.Initialize();
 BA.debugLineNum = 153;BA.debugLine="StrAddr(0) = \"0x0013a20040be447f\"";
Debug.ShouldStop(16777216);
_straddr[(int) (0)] = "0x0013a20040be447f";
 BA.debugLineNum = 154;BA.debugLine="StrAddr(1) = \"0x0013a200406ff46e\"";
Debug.ShouldStop(33554432);
_straddr[(int) (1)] = "0x0013a200406ff46e";
 BA.debugLineNum = 155;BA.debugLine="StrAddr(2) = \"0x0013a20040332051\"";
Debug.ShouldStop(67108864);
_straddr[(int) (2)] = "0x0013a20040332051";
 BA.debugLineNum = 156;BA.debugLine="StrAddr(3) = \"0x0013a20040626109\"";
Debug.ShouldStop(134217728);
_straddr[(int) (3)] = "0x0013a20040626109";
 BA.debugLineNum = 158;BA.debugLine="Dim StrSet(2) As String";
Debug.ShouldStop(536870912);
_strset = new String[(int) (2)];
java.util.Arrays.fill(_strset,"");Debug.locals.put("StrSet", _strset);
 BA.debugLineNum = 159;BA.debugLine="StrSet(0) = \"yes\"";
Debug.ShouldStop(1073741824);
_strset[(int) (0)] = "yes";Debug.locals.put("StrSet", _strset);
 BA.debugLineNum = 160;BA.debugLine="StrSet(1) = \"no\"";
Debug.ShouldStop(-2147483648);
_strset[(int) (1)] = "no";Debug.locals.put("StrSet", _strset);
 BA.debugLineNum = 162;BA.debugLine="Dim StrPing(2) As String";
Debug.ShouldStop(2);
_strping = new String[(int) (2)];
java.util.Arrays.fill(_strping,"");Debug.locals.put("StrPing", _strping);
 BA.debugLineNum = 163;BA.debugLine="StrPing(0) = \"On\"";
Debug.ShouldStop(4);
_strping[(int) (0)] = "On";Debug.locals.put("StrPing", _strping);
 BA.debugLineNum = 164;BA.debugLine="StrPing(1) = \"Off\"";
Debug.ShouldStop(8);
_strping[(int) (1)] = "Off";Debug.locals.put("StrPing", _strping);
 BA.debugLineNum = 166;BA.debugLine="Dim StrFollLux(2) As String";
Debug.ShouldStop(32);
_strfolllux = new String[(int) (2)];
java.util.Arrays.fill(_strfolllux,"");Debug.locals.put("StrFollLux", _strfolllux);
 BA.debugLineNum = 167;BA.debugLine="StrFollLux(0) = \"FolOn\"";
Debug.ShouldStop(64);
_strfolllux[(int) (0)] = "FolOn";Debug.locals.put("StrFollLux", _strfolllux);
 BA.debugLineNum = 168;BA.debugLine="StrFollLux(1) = \"FolOff\"";
Debug.ShouldStop(128);
_strfolllux[(int) (1)] = "FolOff";Debug.locals.put("StrFollLux", _strfolllux);
 BA.debugLineNum = 170;BA.debugLine="Dim StrPresence(2) As String";
Debug.ShouldStop(512);
_strpresence = new String[(int) (2)];
java.util.Arrays.fill(_strpresence,"");Debug.locals.put("StrPresence", _strpresence);
 BA.debugLineNum = 171;BA.debugLine="StrPresence(0) = \"PresOn\"";
Debug.ShouldStop(1024);
_strpresence[(int) (0)] = "PresOn";Debug.locals.put("StrPresence", _strpresence);
 BA.debugLineNum = 172;BA.debugLine="StrPresence(1) = \"PresOff\"";
Debug.ShouldStop(2048);
_strpresence[(int) (1)] = "PresOff";Debug.locals.put("StrPresence", _strpresence);
 BA.debugLineNum = 174;BA.debugLine="Dim StrPresenceValue(2) As String";
Debug.ShouldStop(8192);
_strpresencevalue = new String[(int) (2)];
java.util.Arrays.fill(_strpresencevalue,"");Debug.locals.put("StrPresenceValue", _strpresencevalue);
 BA.debugLineNum = 175;BA.debugLine="StrPresenceValue(0) = \"PreLuxHi\"";
Debug.ShouldStop(16384);
_strpresencevalue[(int) (0)] = "PreLuxHi";Debug.locals.put("StrPresenceValue", _strpresencevalue);
 BA.debugLineNum = 176;BA.debugLine="StrPresenceValue(1) = \"PreLuxLo\"";
Debug.ShouldStop(32768);
_strpresencevalue[(int) (1)] = "PreLuxLo";Debug.locals.put("StrPresenceValue", _strpresencevalue);
 BA.debugLineNum = 178;BA.debugLine="Dim StrDelay(3) As String";
Debug.ShouldStop(131072);
_strdelay = new String[(int) (3)];
java.util.Arrays.fill(_strdelay,"");Debug.locals.put("StrDelay", _strdelay);
 BA.debugLineNum = 179;BA.debugLine="StrDelay(0) = \"DelayMax\"";
Debug.ShouldStop(262144);
_strdelay[(int) (0)] = "DelayMax";Debug.locals.put("StrDelay", _strdelay);
 BA.debugLineNum = 180;BA.debugLine="StrDelay(1) = \"DelayMed\"";
Debug.ShouldStop(524288);
_strdelay[(int) (1)] = "DelayMed";Debug.locals.put("StrDelay", _strdelay);
 BA.debugLineNum = 181;BA.debugLine="StrDelay(2) = \"DelayMin\"";
Debug.ShouldStop(1048576);
_strdelay[(int) (2)] = "DelayMin";Debug.locals.put("StrDelay", _strdelay);
 BA.debugLineNum = 184;BA.debugLine="Panel1.Initialize(\"\")";
Debug.ShouldStop(8388608);
mostCurrent._panel1.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 185;BA.debugLine="Dim svsstep As Int";
Debug.ShouldStop(16777216);
_svsstep = 0;Debug.locals.put("svsstep", _svsstep);
 BA.debugLineNum = 186;BA.debugLine="svsstep = 50dip";
Debug.ShouldStop(33554432);
_svsstep = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));Debug.locals.put("svsstep", _svsstep);
 BA.debugLineNum = 187;BA.debugLine="Addres.Initialize2(svsstep,StrAddr,True,\"addres\")";
Debug.ShouldStop(67108864);
mostCurrent._addres.Initialize2(mostCurrent.activityBA,_svsstep,_straddr,anywheresoftware.b4a.keywords.Common.True,"addres");
 BA.debugLineNum = 188;BA.debugLine="Set.Initialize2(svsstep,StrSet,True,\"Set\")";
Debug.ShouldStop(134217728);
mostCurrent._set.Initialize2(mostCurrent.activityBA,_svsstep,_strset,anywheresoftware.b4a.keywords.Common.True,"Set");
 BA.debugLineNum = 189;BA.debugLine="choice.Initialize2(svsstep,StrPing,True,\"choice\")";
Debug.ShouldStop(268435456);
mostCurrent._choice.Initialize2(mostCurrent.activityBA,_svsstep,_strping,anywheresoftware.b4a.keywords.Common.True,"choice");
 BA.debugLineNum = 190;BA.debugLine="DelayOn_Off.Initialize2(svsstep,StrDelay,True,\"De";
Debug.ShouldStop(536870912);
mostCurrent._delayon_off.Initialize2(mostCurrent.activityBA,_svsstep,_strdelay,anywheresoftware.b4a.keywords.Common.True,"DelayOn_Off");
 BA.debugLineNum = 192;BA.debugLine="FollowLuxOn_Off.Initialize2(svsstep,StrFollLux,Tr";
Debug.ShouldStop(-2147483648);
mostCurrent._followluxon_off.Initialize2(mostCurrent.activityBA,_svsstep,_strfolllux,anywheresoftware.b4a.keywords.Common.True,"FollowLuxOn_Off");
 BA.debugLineNum = 193;BA.debugLine="PresenceOn_OFF.Initialize2(svsstep,StrPresence,Tr";
Debug.ShouldStop(1);
mostCurrent._presenceon_off.Initialize2(mostCurrent.activityBA,_svsstep,_strpresence,anywheresoftware.b4a.keywords.Common.True,"PresenceOn_Off");
 BA.debugLineNum = 194;BA.debugLine="PresenceHi_LOW.Initialize2(svsstep,StrPresenceVal";
Debug.ShouldStop(2);
mostCurrent._presencehi_low.Initialize2(mostCurrent.activityBA,_svsstep,_strpresencevalue,anywheresoftware.b4a.keywords.Common.True,"PresenceHi_Low");
 BA.debugLineNum = 195;BA.debugLine="Activity.AddView(Addres,50dip,125dip,250dip,svsst";
Debug.ShouldStop(4);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._addres.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (125)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)),(int) (_svsstep*3));
 BA.debugLineNum = 196;BA.debugLine="Activity.AddView(Set,300dip,125dip,80dip,svsstep*";
Debug.ShouldStop(8);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._set.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (125)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),(int) (_svsstep*3));
 BA.debugLineNum = 197;BA.debugLine="Activity.AddView(choice,380dip,125dip,80dip,svsst";
Debug.ShouldStop(16);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._choice.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (380)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (125)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),(int) (_svsstep*3));
 BA.debugLineNum = 198;BA.debugLine="Activity.AddView(DelayOn_Off,460dip,125dip,130dip";
Debug.ShouldStop(32);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._delayon_off.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (460)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (125)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),(int) (_svsstep*3));
 BA.debugLineNum = 199;BA.debugLine="Activity.AddView(PresenceOn_OFF,590dip,125dip,130";
Debug.ShouldStop(64);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._presenceon_off.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (590)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (125)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),(int) (_svsstep*3));
 BA.debugLineNum = 200;BA.debugLine="Activity.AddView(PresenceHi_LOW,720dip,125dip,130";
Debug.ShouldStop(128);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._presencehi_low.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (720)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (125)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),(int) (_svsstep*3));
 BA.debugLineNum = 201;BA.debugLine="Activity.AddView(FollowLuxOn_Off,850,125dip,130di";
Debug.ShouldStop(256);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._followluxon_off.getObject()),(int) (850),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (125)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),(int) (_svsstep*3));
 BA.debugLineNum = 202;BA.debugLine="Panel1.SetBackgroundImage(LoadBitmap(File.DirAsse";
Debug.ShouldStop(512);
mostCurrent._panel1.SetBackgroundImage((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"cover.png").getObject()));
 BA.debugLineNum = 203;BA.debugLine="Activity.AddView(Panel1,50dip,125,930dip,svsstep*";
Debug.ShouldStop(1024);
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panel1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),(int) (125),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (930)),(int) (_svsstep*3));
 BA.debugLineNum = 204;BA.debugLine="DoEvents";
Debug.ShouldStop(2048);
anywheresoftware.b4a.keywords.Common.DoEvents();
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
