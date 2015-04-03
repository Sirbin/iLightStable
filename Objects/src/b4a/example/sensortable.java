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

public class sensortable extends Activity implements B4AActivity{
	public static sensortable mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.sensortable");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (sensortable).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.sensortable");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.sensortable", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (sensortable) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (sensortable) Resume **");
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
		return sensortable.class;
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
        BA.LogInfo("** Activity (sensortable) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (sensortable) Resume **");
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
public static String _str_ = "";
public static anywheresoftware.b4a.objects.Serial _serial1 = null;
public static anywheresoftware.b4a.objects.Serial.BluetoothAdmin _admin = null;
public static boolean _btconnected = false;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public static anywheresoftware.b4a.objects.collections.List _l = null;
public static anywheresoftware.b4a.objects.collections.Map _map1 = null;
public static anywheresoftware.b4a.objects.collections.JSONParser _json = null;
public static anywheresoftware.b4a.objects.Timer _clock1 = null;
public static int _sec1 = 0;
public b4a.example.table _table1 = null;
public adr.stringfunctions.stringfunctions _sf = null;
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _back = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel = null;
public static String _s = "";
public anywheresoftware.b4a.objects.UsbSerial _usb1 = null;
public static String _mydevicename = "";
public anywheresoftware.b4a.objects.ButtonWrapper _check_device = null;
public b4a.example.main _main = null;
public b4a.example.config _config = null;
public b4a.example.size _size = null;
public b4a.example.cancellato _cancellato = null;
public b4a.example.configpagemod _configpagemod = null;
public b4a.example.configurationwizardmod _configurationwizardmod = null;
public b4a.example.policiesmode _policiesmode = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"admin",_admin,"AStreams",_astreams,"astreams1",mostCurrent._astreams1,"back",mostCurrent._back,"btConnected",_btconnected,"cancellato",Debug.moduleToString(b4a.example.cancellato.class),"check_Device",mostCurrent._check_device,"Clock1",_clock1,"config",Debug.moduleToString(b4a.example.config.class),"ConfigPageMod",Debug.moduleToString(b4a.example.configpagemod.class),"ConfigurationWizardMod",Debug.moduleToString(b4a.example.configurationwizardmod.class),"json",_json,"l",_l,"Main",Debug.moduleToString(b4a.example.main.class),"map1",_map1,"MyDeviceName",mostCurrent._mydevicename,"Panel",mostCurrent._panel,"PoliciesMode",Debug.moduleToString(b4a.example.policiesmode.class),"s",mostCurrent._s,"sec1",_sec1,"serial1",_serial1,"sf",mostCurrent._sf,"Size",Debug.moduleToString(b4a.example.size.class),"str_",_str_,"table1",mostCurrent._table1,"usb1",mostCurrent._usb1};
}

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firstime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,33);
Debug.locals.put("firstime", _firstime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create( firstime  As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"sensori\")";
Debug.ShouldStop(4);
mostCurrent._activity.LoadLayout("sensori",mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="If firstime Then";
Debug.ShouldStop(8);
if (_firstime) { 
 BA.debugLineNum = 37;BA.debugLine="StartActivity(tables)";
Debug.ShouldStop(16);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_tables()));
 BA.debugLineNum = 38;BA.debugLine="admin.Initialize(\"BT\")";
Debug.ShouldStop(32);
_admin.Initialize(processBA,"BT");
 BA.debugLineNum = 39;BA.debugLine="serial1.Initialize(\"Serial1\")";
Debug.ShouldStop(64);
Debug.DebugWarningEngine.CheckInitialize(_serial1);_serial1.Initialize("Serial1");
 };
 BA.debugLineNum = 41;BA.debugLine="If admin.IsEnabled = False Then";
Debug.ShouldStop(256);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 42;BA.debugLine="admin.Enable";
Debug.ShouldStop(512);
_admin.Enable();
 BA.debugLineNum = 43;BA.debugLine="Log(\"Bt is ready\")";
Debug.ShouldStop(1024);
anywheresoftware.b4a.keywords.Common.Log("Bt is ready");
 };
 BA.debugLineNum = 45;BA.debugLine="If table1.IsInitialized = False Then";
Debug.ShouldStop(4096);
if (mostCurrent._table1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 46;BA.debugLine="tables";
Debug.ShouldStop(8192);
_tables();
 };
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
public static String  _activity_pause(boolean _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,49);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
public static String  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,131);
 BA.debugLineNum = 131;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="If admin.IsEnabled = False Then";
Debug.ShouldStop(8);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
 BA.debugLineNum = 133;BA.debugLine="admin.Enable";
Debug.ShouldStop(16);
_admin.Enable();
 };
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Astreams1_NewData (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,72);
String _u = "";
long _lpos = 0L;
long _rpos = 0L;
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 72;BA.debugLine="Sub Astreams1_NewData (Buffer() As Byte)";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="Dim u As String";
Debug.ShouldStop(512);
_u = "";Debug.locals.put("u", _u);
 BA.debugLineNum = 75;BA.debugLine="Dim lpos As Long";
Debug.ShouldStop(1024);
_lpos = 0L;Debug.locals.put("lpos", _lpos);
 BA.debugLineNum = 76;BA.debugLine="Dim rpos As Long";
Debug.ShouldStop(2048);
_rpos = 0L;Debug.locals.put("rpos", _rpos);
 BA.debugLineNum = 77;BA.debugLine="u = u & BytesToString(Buffer, 0, Buffer.Length, \"";
Debug.ShouldStop(4096);
_u = _u+anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF8");Debug.locals.put("u", _u);
 BA.debugLineNum = 78;BA.debugLine="str_ = str_ & u";
Debug.ShouldStop(8192);
_str_ = _str_+_u;
 BA.debugLineNum = 79;BA.debugLine="If str_.Length > 180 Then";
Debug.ShouldStop(16384);
if (_str_.length()>180) { 
 BA.debugLineNum = 80;BA.debugLine="lpos=str_.IndexOf(\"{\")";
Debug.ShouldStop(32768);
_lpos = (long) (_str_.indexOf("{"));Debug.locals.put("lpos", _lpos);
 BA.debugLineNum = 81;BA.debugLine="rpos=str_.IndexOf2(\"}\",lpos+1)";
Debug.ShouldStop(65536);
_rpos = (long) (_str_.indexOf("}",(int) (_lpos+1)));Debug.locals.put("rpos", _rpos);
 BA.debugLineNum = 82;BA.debugLine="If lpos < 0 Then";
Debug.ShouldStop(131072);
if (_lpos<0) { 
 BA.debugLineNum = 83;BA.debugLine="str_=\" \"";
Debug.ShouldStop(262144);
_str_ = " ";
 };
 BA.debugLineNum = 85;BA.debugLine="If lpos>=0 Then";
Debug.ShouldStop(1048576);
if (_lpos>=0) { 
 BA.debugLineNum = 86;BA.debugLine="If rpos > lpos Then";
Debug.ShouldStop(2097152);
if (_rpos>_lpos) { 
 BA.debugLineNum = 87;BA.debugLine="s = sf.Mid(str_,lpos+1,(rpos+lpos)+1)";
Debug.ShouldStop(4194304);
mostCurrent._s = mostCurrent._sf._vvvv5(_str_,(int) (_lpos+1),(int) ((_rpos+_lpos)+1));
 BA.debugLineNum = 88;BA.debugLine="json_interpreter1(s)	'change the buffer'";
Debug.ShouldStop(8388608);
_json_interpreter1(mostCurrent._s);
 BA.debugLineNum = 89;BA.debugLine="str_=sf.Right(str_,(str_.Length-rpos)-1)";
Debug.ShouldStop(16777216);
_str_ = mostCurrent._sf._vvvvv7(_str_,(long) ((_str_.length()-_rpos)-1));
 };
 };
 };
 BA.debugLineNum = 94;BA.debugLine="End Sub";
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
public static String  _back_click() throws Exception{
try {
		Debug.PushSubsStack("back_Click (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,52);
 BA.debugLineNum = 52;BA.debugLine="Sub back_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If admin.IsEnabled = True Then";
Debug.ShouldStop(1048576);
if (_admin.IsEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 54;BA.debugLine="admin.disable";
Debug.ShouldStop(2097152);
_admin.Disable();
 BA.debugLineNum = 55;BA.debugLine="Log(\"Bt as Disable\")";
Debug.ShouldStop(4194304);
anywheresoftware.b4a.keywords.Common.Log("Bt as Disable");
 };
 BA.debugLineNum = 57;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
mostCurrent._activity.Finish();
 BA.debugLineNum = 58;BA.debugLine="l.Clear ' cancel list with Mac Adress'";
Debug.ShouldStop(33554432);
_l.Clear();
 BA.debugLineNum = 59;BA.debugLine="StartActivity(\"main\")";
Debug.ShouldStop(67108864);
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("main"));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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
public static String  _bt_statechanged(int _newstate,int _oldstate) throws Exception{
try {
		Debug.PushSubsStack("BT_StateChanged (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,137);
Debug.locals.put("NewState", _newstate);
Debug.locals.put("OldState", _oldstate);
 BA.debugLineNum = 137;BA.debugLine="Sub BT_StateChanged(NewState As Int,OldState As In";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="If NewState = admin.STATE_ON Then";
Debug.ShouldStop(1024);
if (_newstate==_admin.STATE_ON) { 
 BA.debugLineNum = 140;BA.debugLine="Connect_3box ' call sub connect_3box";
Debug.ShouldStop(2048);
_connect_3box();
 BA.debugLineNum = 141;BA.debugLine="Log(\"BT Connect\")";
Debug.ShouldStop(4096);
anywheresoftware.b4a.keywords.Common.Log("BT Connect");
 }else {
 BA.debugLineNum = 143;BA.debugLine="serial1.Disconnect";
Debug.ShouldStop(16384);
_serial1.Disconnect();
 BA.debugLineNum = 144;BA.debugLine="Log(\"BT Disconnect\")";
Debug.ShouldStop(32768);
anywheresoftware.b4a.keywords.Common.Log("BT Disconnect");
 };
 BA.debugLineNum = 146;BA.debugLine="End Sub";
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
public static String  _clock1_tick() throws Exception{
try {
		Debug.PushSubsStack("Clock1_tick (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,120);
 BA.debugLineNum = 120;BA.debugLine="Sub Clock1_tick";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="sec1 = sec1 + 1";
Debug.ShouldStop(16777216);
_sec1 = (int) (_sec1+1);
 BA.debugLineNum = 122;BA.debugLine="If sec1 > 5 Then";
Debug.ShouldStop(33554432);
if (_sec1>5) { 
 BA.debugLineNum = 123;BA.debugLine="admin.Enable";
Debug.ShouldStop(67108864);
_admin.Enable();
 BA.debugLineNum = 124;BA.debugLine="BT_StateChanged(1,0)";
Debug.ShouldStop(134217728);
_bt_statechanged((int) (1),(int) (0));
 BA.debugLineNum = 125;BA.debugLine="If admin.Enable = True Then";
Debug.ShouldStop(268435456);
if (_admin.Enable()==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 126;BA.debugLine="Clock1.Enabled = False";
Debug.ShouldStop(536870912);
_clock1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 };
 BA.debugLineNum = 129;BA.debugLine="End Sub";
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
public static String  _connect_3box() throws Exception{
try {
		Debug.PushSubsStack("Connect_3box (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,157);
anywheresoftware.b4a.objects.collections.Map _parireddevices = null;
String _mydevice = "";
 BA.debugLineNum = 157;BA.debugLine="Sub Connect_3box";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Public PariredDevices As Map";
Debug.ShouldStop(536870912);
_parireddevices = new anywheresoftware.b4a.objects.collections.Map();Debug.locals.put("PariredDevices", _parireddevices);
 BA.debugLineNum = 159;BA.debugLine="Dim MyDevice As String";
Debug.ShouldStop(1073741824);
_mydevice = "";Debug.locals.put("MyDevice", _mydevice);
 BA.debugLineNum = 160;BA.debugLine="MyDevice = \"3box\"";
Debug.ShouldStop(-2147483648);
_mydevice = "3box";Debug.locals.put("MyDevice", _mydevice);
 BA.debugLineNum = 161;BA.debugLine="PariredDevices = serial1.GetPairedDevices";
Debug.ShouldStop(1);
_parireddevices = _serial1.GetPairedDevices();Debug.locals.put("PariredDevices", _parireddevices);
 BA.debugLineNum = 162;BA.debugLine="If PariredDevices.ContainsKey(MyDevice) Then";
Debug.ShouldStop(2);
if (_parireddevices.ContainsKey((Object)(_mydevice))) { 
 BA.debugLineNum = 163;BA.debugLine="l.add(PariredDevices.Get(MyDevice))";
Debug.ShouldStop(4);
_l.Add(_parireddevices.Get((Object)(_mydevice)));
 BA.debugLineNum = 164;BA.debugLine="Log(l)";
Debug.ShouldStop(8);
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_l));
 };
 BA.debugLineNum = 166;BA.debugLine="serial1.Connect(l.Get(0)) ' connect with 3box add";
Debug.ShouldStop(32);
_serial1.Connect(processBA,BA.ObjectToString(_l.Get((int) (0))));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim table1 As Table";
mostCurrent._table1 = new b4a.example.table();
 //BA.debugLineNum = 22;BA.debugLine="Dim sf As StringFunctions";
mostCurrent._sf = new adr.stringfunctions.stringfunctions();
 //BA.debugLineNum = 23;BA.debugLine="sf.Initialize";
mostCurrent._sf._initialize(processBA);
 //BA.debugLineNum = 24;BA.debugLine="Dim astreams1 As AsyncStreams";
mostCurrent._astreams1 = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 25;BA.debugLine="Private back As Button";
mostCurrent._back = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim Panel As Panel";
mostCurrent._panel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim s As String";
mostCurrent._s = "";
 //BA.debugLineNum = 28;BA.debugLine="Dim usb1 As UsbSerial";
mostCurrent._usb1 = new anywheresoftware.b4a.objects.UsbSerial();
 //BA.debugLineNum = 29;BA.debugLine="Dim MyDeviceName As String";
mostCurrent._mydevicename = "";
 //BA.debugLineNum = 30;BA.debugLine="Private check_Device As Button";
mostCurrent._check_device = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _json_interpreter1(String _jstr) throws Exception{
try {
		Debug.PushSubsStack("json_interpreter1 (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,95);
Debug.locals.put("jstr", _jstr);
 BA.debugLineNum = 95;BA.debugLine="Sub json_interpreter1 (jstr As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 98;BA.debugLine="json.Initialize(jstr)";
Debug.ShouldStop(2);
_json.Initialize(_jstr);
 BA.debugLineNum = 99;BA.debugLine="map1.Initialize";
Debug.ShouldStop(4);
_map1.Initialize();
 BA.debugLineNum = 100;BA.debugLine="Log (\"dato\" & jstr)";
Debug.ShouldStop(8);
anywheresoftware.b4a.keywords.Common.Log("dato"+_jstr);
 BA.debugLineNum = 101;BA.debugLine="map1=json.NextObject";
Debug.ShouldStop(16);
_map1 = _json.NextObject();
 BA.debugLineNum = 102;BA.debugLine="If map1.Get(\"address64\") = \"0x0013a20040be447f\"";
Debug.ShouldStop(32);
if ((_map1.Get((Object)("address64"))).equals((Object)("0x0013a20040be447f"))) { 
 BA.debugLineNum = 103;BA.debugLine="table1.UpdateRow(0,Array As String(map1.Get(\"ad";
Debug.ShouldStop(64);
mostCurrent._table1._updaterow((int) (0),new String[]{BA.ObjectToString(_map1.Get((Object)("address64"))),BA.ObjectToString(_map1.Get((Object)("power"))),BA.ObjectToString(_map1.Get((Object)("temperature"))),BA.ObjectToString(_map1.Get((Object)("humidity"))),BA.ObjectToString(_map1.Get((Object)("lux"))),BA.ObjectToString(_map1.Get((Object)("co2"))),BA.ObjectToString(_map1.Get((Object)("presence"))),BA.ObjectToString(_map1.Get((Object)("voltage"))),BA.ObjectToString(_map1.Get((Object)("pwm")))});
 };
 BA.debugLineNum = 105;BA.debugLine="If map1.Get(\"address64\") = \"0x0013a200406ff46e\"";
Debug.ShouldStop(256);
if ((_map1.Get((Object)("address64"))).equals((Object)("0x0013a200406ff46e"))) { 
 BA.debugLineNum = 106;BA.debugLine="table1.UpdateRow(1,Array As String(map1.Get(\"ad";
Debug.ShouldStop(512);
mostCurrent._table1._updaterow((int) (1),new String[]{BA.ObjectToString(_map1.Get((Object)("address64"))),BA.ObjectToString(_map1.Get((Object)("power"))),BA.ObjectToString(_map1.Get((Object)("temperature"))),BA.ObjectToString(_map1.Get((Object)("humidity"))),BA.ObjectToString(_map1.Get((Object)("lux"))),BA.ObjectToString(_map1.Get((Object)("co2"))),BA.ObjectToString(_map1.Get((Object)("presence"))),BA.ObjectToString(_map1.Get((Object)("voltage"))),BA.ObjectToString(_map1.Get((Object)("pwm")))});
 };
 BA.debugLineNum = 108;BA.debugLine="If map1.Get(\"address64\") = \"0x0013a20040332051\"";
Debug.ShouldStop(2048);
if ((_map1.Get((Object)("address64"))).equals((Object)("0x0013a20040332051"))) { 
 BA.debugLineNum = 109;BA.debugLine="table1.UpdateRow(2,Array As String(map1.Get(\"ad";
Debug.ShouldStop(4096);
mostCurrent._table1._updaterow((int) (2),new String[]{BA.ObjectToString(_map1.Get((Object)("address64"))),BA.ObjectToString(_map1.Get((Object)("power"))),BA.ObjectToString(_map1.Get((Object)("temperature"))),BA.ObjectToString(_map1.Get((Object)("humidity"))),BA.ObjectToString(_map1.Get((Object)("lux"))),BA.ObjectToString(_map1.Get((Object)("co2"))),BA.ObjectToString(_map1.Get((Object)("presence"))),BA.ObjectToString(_map1.Get((Object)("voltage"))),BA.ObjectToString(_map1.Get((Object)("pwm")))});
 };
 BA.debugLineNum = 111;BA.debugLine="If map1.Get(\"address64\") = \"0x0013a20040626109\"";
Debug.ShouldStop(16384);
if ((_map1.Get((Object)("address64"))).equals((Object)("0x0013a20040626109"))) { 
 BA.debugLineNum = 112;BA.debugLine="table1.UpdateRow(3,Array As String(map1.Get(\"ad";
Debug.ShouldStop(32768);
mostCurrent._table1._updaterow((int) (3),new String[]{BA.ObjectToString(_map1.Get((Object)("address64"))),BA.ObjectToString(_map1.Get((Object)("power"))),BA.ObjectToString(_map1.Get((Object)("temperature"))),BA.ObjectToString(_map1.Get((Object)("humidity"))),BA.ObjectToString(_map1.Get((Object)("lux"))),BA.ObjectToString(_map1.Get((Object)("co2"))),BA.ObjectToString(_map1.Get((Object)("presence"))),BA.ObjectToString(_map1.Get((Object)("voltage"))),BA.ObjectToString(_map1.Get((Object)("pwm")))});
 };
 } 
       catch (Exception e101) {
			processBA.setLastException(e101); BA.debugLineNum = 115;BA.debugLine="admin.Disable 'if a json mapping has a problem d";
Debug.ShouldStop(262144);
_admin.Disable();
 BA.debugLineNum = 116;BA.debugLine="Clock1.Initialize(\"Clock1\", 1000)";
Debug.ShouldStop(524288);
Debug.DebugWarningEngine.CheckInitialize(_clock1);_clock1.Initialize(processBA,"Clock1",(long) (1000));
 BA.debugLineNum = 117;BA.debugLine="Clock1.Enabled = True";
Debug.ShouldStop(1048576);
_clock1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 119;BA.debugLine="End Sub";
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
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public str_ As String";
_str_ = "";
 //BA.debugLineNum = 8;BA.debugLine="Dim serial1 As Serial";
_serial1 = new anywheresoftware.b4a.objects.Serial();
 //BA.debugLineNum = 9;BA.debugLine="Dim admin As BluetoothAdmin";
_admin = new anywheresoftware.b4a.objects.Serial.BluetoothAdmin();
 //BA.debugLineNum = 10;BA.debugLine="Dim btConnected As Boolean";
_btconnected = false;
 //BA.debugLineNum = 11;BA.debugLine="Dim AStreams As AsyncStreams";
_astreams = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 12;BA.debugLine="Public l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="l.Initialize";
_l.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="Public map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Public json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 16;BA.debugLine="Dim Clock1 As Timer";
_clock1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 17;BA.debugLine="Dim sec1 As Int";
_sec1 = 0;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public static String  _serial1_connected(boolean _success) throws Exception{
try {
		Debug.PushSubsStack("Serial1_Connected (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,147);
String _msg = "";
Debug.locals.put("success", _success);
 BA.debugLineNum = 147;BA.debugLine="Sub Serial1_Connected (success As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Dim msg As String";
Debug.ShouldStop(524288);
_msg = "";Debug.locals.put("msg", _msg);
 BA.debugLineNum = 149;BA.debugLine="If success = True Then";
Debug.ShouldStop(1048576);
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
 BA.debugLineNum = 150;BA.debugLine="ToastMessageShow(\"Bluetooth connecd with success";
Debug.ShouldStop(2097152);
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Bluetooth connecd with success",anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 151;BA.debugLine="ToastMessageShow(\"Bluetooth connected to \" & l.G";
Debug.ShouldStop(4194304);
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Bluetooth connected to "+BA.ObjectToString(_l.Get((int) (0))),anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 152;BA.debugLine="astreams1.Initialize(serial1.InputStream,serial1";
Debug.ShouldStop(8388608);
mostCurrent._astreams1.Initialize(processBA,_serial1.getInputStream(),_serial1.getOutputStream(),"AStreams1");
 }else {
 BA.debugLineNum = 154;BA.debugLine="ToastMessageShow(\"Connection to \" & l.Get(0) & \"";
Debug.ShouldStop(33554432);
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Connection to "+BA.ObjectToString(_l.Get((int) (0)))+"broken!",anywheresoftware.b4a.keywords.Common.True);
 };
 BA.debugLineNum = 156;BA.debugLine="End Sub";
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
public static String  _tables() throws Exception{
try {
		Debug.PushSubsStack("tables (sensortable) ","sensortable",1,mostCurrent.activityBA,mostCurrent,61);
 BA.debugLineNum = 61;BA.debugLine="Sub tables";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="table1.Initialize(Me,\"table1\",9,Gravity.CENTER_HO";
Debug.ShouldStop(1073741824);
mostCurrent._table1._initialize(mostCurrent.activityBA,sensortable.getObject(),"table1",(int) (9),anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL,anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 64;BA.debugLine="table1.AddToActivity(Panel , 0, 0, 100%x,100%y)";
Debug.ShouldStop(-2147483648);
mostCurrent._table1._addtoactivity((anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._panel.getObject())),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 BA.debugLineNum = 65;BA.debugLine="table1.SetHeader(Array As String(\"Address64\",";
Debug.ShouldStop(1);
mostCurrent._table1._setheader(new String[]{"Address64","Power","Temperature","Humidity","Lux","CO2","Presence","Voltage","Power %"});
 BA.debugLineNum = 66;BA.debugLine="table1.insertRowAt(0,Array As String(\"null\",\"null";
Debug.ShouldStop(2);
mostCurrent._table1._insertrowat((int) (0),new String[]{"null","null","null","null","null","null","null","null","null"});
 BA.debugLineNum = 67;BA.debugLine="table1.insertRowAt(1,Array As String(\"3\",\"34\",\"5\"";
Debug.ShouldStop(4);
mostCurrent._table1._insertrowat((int) (1),new String[]{"3","34","5","5","5","7","5","42","22"});
 BA.debugLineNum = 68;BA.debugLine="table1.insertRowAt(2,Array As String(\"6\",\"4\",\"8\",";
Debug.ShouldStop(8);
mostCurrent._table1._insertrowat((int) (2),new String[]{"6","4","8","3","5","7","5","6","22"});
 BA.debugLineNum = 69;BA.debugLine="table1.insertRowAt(3,Array As String(\"9\",\"8\",\"26\"";
Debug.ShouldStop(16);
mostCurrent._table1._insertrowat((int) (3),new String[]{"9","8","26","3","5","7","6","42","22"});
 BA.debugLineNum = 70;BA.debugLine="table1.SetColumnsWidths(Array As Int(150dip, 100d";
Debug.ShouldStop(32);
mostCurrent._table1._setcolumnswidths(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),(int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100))-1)});
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
