package anywheresoftware.b4a.agraham.dialogsdemo;

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
			processBA = new BA(this.getApplicationContext(), null, null, "anywheresoftware.b4a.agraham.dialogsdemo", "anywheresoftware.b4a.agraham.dialogsdemo.main");
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
		activityBA = new BA(this, layout, processBA, "anywheresoftware.b4a.agraham.dialogsdemo", "anywheresoftware.b4a.agraham.dialogsdemo.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "anywheresoftware.b4a.agraham.dialogsdemo.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
//        try {
//            if (processBA.subExists("activity_actionbarhomeclick")) {
//                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
//                    getClass().getMethod("getActionBar").invoke(this), true);
//                BA.Log("adding event");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		return true;
	}   
// @Override
// public boolean onOptionsItemSelected(android.view.MenuItem item) {
//    if (item.getItemId() == 16908332) {
//        processBA.raiseEvent(null, "activity_actionbarhomeclick");
//        return true;
//    }
//    else
//        return super.onOptionsItemSelected(item); 
//}
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
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
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
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}

public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btninput = null;
public anywheresoftware.b4a.objects.ButtonWrapper _gettime = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncolor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncolor2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnumber = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfile = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncustom = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl1 = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mostCurrent._activity,"Bmp",mostCurrent._bmp,"btnColor",mostCurrent._btncolor,"btnColor2",mostCurrent._btncolor2,"btnCustom",mostCurrent._btncustom,"btnDate",mostCurrent._btndate,"btnFile",mostCurrent._btnfile,"btnInput",mostCurrent._btninput,"btnNumber",mostCurrent._btnnumber,"getTime",mostCurrent._gettime,"lbl1",mostCurrent._lbl1};
}

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
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

}
public static String  _activity_create(boolean _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,mostCurrent.activityBA,mostCurrent,34);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(4);
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="Bmp.Initialize(File.DirAssets, \"android48.png\")";
Debug.ShouldStop(8);
mostCurrent._bmp.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"android48.png");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
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
public static String  _activity_pause(boolean _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,mostCurrent.activityBA,mostCurrent,43);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
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
public static String  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,mostCurrent.activityBA,mostCurrent,39);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
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
public static String  _btn1_click() throws Exception{
try {
		Debug.PushSubsStack("btn1_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,174);
 BA.debugLineNum = 174;BA.debugLine="Sub btn1_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="lbl1.Text = \"Pressed!\"";
Debug.ShouldStop(16384);
mostCurrent._lbl1.setText((Object)("Pressed!"));
 BA.debugLineNum = 176;BA.debugLine="lbl1.Color = Colors.Black";
Debug.ShouldStop(32768);
mostCurrent._lbl1.setColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 BA.debugLineNum = 177;BA.debugLine="ToastMessageShow(\"Pressed!\", False)";
Debug.ShouldStop(65536);
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Pressed!",anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 178;BA.debugLine="End Sub";
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
public static String  _btncolor_click() throws Exception{
try {
		Debug.PushSubsStack("btnColor_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,81);
anywheresoftware.b4a.agraham.dialogs.InputDialog.ColorDialog _cd = null;
int _color = 0;
String _ret = "";
 BA.debugLineNum = 81;BA.debugLine="Sub btnColor_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim cd As ColorDialog";
Debug.ShouldStop(131072);
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.ColorDialog();Debug.locals.put("cd", _cd);
 BA.debugLineNum = 83;BA.debugLine="Dim color As Int";
Debug.ShouldStop(262144);
_color = 0;Debug.locals.put("color", _color);
 BA.debugLineNum = 84;BA.debugLine="cd.RGB = Colors.RGB(128, 128, 128)";
Debug.ShouldStop(524288);
_cd.setRGB(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (128),(int) (128),(int) (128)));
 BA.debugLineNum = 85;BA.debugLine="ret = cd.Show(\"B4A Color Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(1048576);
_ret = BA.NumberToString(_cd.Show("B4A Color Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 86;BA.debugLine="ToastMessageShow(ret & \" : \" & cd.Red & \" \" & cd.Green & \" \" & cd.Blue, False)";
Debug.ShouldStop(2097152);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(_ret+" : "+BA.NumberToString(_cd.getRed())+" "+BA.NumberToString(_cd.getGreen())+" "+BA.NumberToString(_cd.getBlue()),anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 87;BA.debugLine="Activity.color = cd.RGB";
Debug.ShouldStop(4194304);
mostCurrent._activity.setColor(_cd.getRGB());
 BA.debugLineNum = 89;BA.debugLine="End Sub";
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
public static String  _btncolor2_click() throws Exception{
try {
		Debug.PushSubsStack("btnColor2_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,91);
anywheresoftware.b4a.agraham.dialogs.InputDialog.ColorPickerDialog _cd = null;
int _color = 0;
String _ret = "";
 BA.debugLineNum = 91;BA.debugLine="Sub btnColor2_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Dim cd As ColorPickerDialog";
Debug.ShouldStop(134217728);
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.ColorPickerDialog();Debug.locals.put("cd", _cd);
 BA.debugLineNum = 93;BA.debugLine="Dim color As Int";
Debug.ShouldStop(268435456);
_color = 0;Debug.locals.put("color", _color);
 BA.debugLineNum = 94;BA.debugLine="cd.RGB = Colors.DarkGray";
Debug.ShouldStop(536870912);
_cd.setRGB(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
 BA.debugLineNum = 95;BA.debugLine="ret = cd.Show(\"B4A ColorPicker Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(1073741824);
_ret = BA.NumberToString(_cd.Show("B4A ColorPicker Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 96;BA.debugLine="ToastMessageShow(ret & \" : \" & cd.RGB, False)";
Debug.ShouldStop(-2147483648);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(_ret+" : "+BA.NumberToString(_cd.getRGB()),anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 97;BA.debugLine="Activity.color = cd.RGB";
Debug.ShouldStop(1);
mostCurrent._activity.setColor(_cd.getRGB());
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
public static String  _btncolor3_click() throws Exception{
try {
		Debug.PushSubsStack("btnColor3_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,100);
anywheresoftware.b4a.agraham.dialogs.InputDialog.ColorDialogHSV _cd = null;
int _color = 0;
String _ret = "";
 BA.debugLineNum = 100;BA.debugLine="Sub btnColor3_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Dim cd As ColorDialogHSV";
Debug.ShouldStop(16);
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.ColorDialogHSV();Debug.locals.put("cd", _cd);
 BA.debugLineNum = 102;BA.debugLine="Dim color As Int";
Debug.ShouldStop(32);
_color = 0;Debug.locals.put("color", _color);
 BA.debugLineNum = 103;BA.debugLine="cd.Hue = 180";
Debug.ShouldStop(64);
_cd.setHue((float) (180));
 BA.debugLineNum = 104;BA.debugLine="cd.Saturation = 0.5";
Debug.ShouldStop(128);
_cd.setSaturation((float) (0.5));
 BA.debugLineNum = 105;BA.debugLine="cd.Value = 0.5";
Debug.ShouldStop(256);
_cd.setValue((float) (0.5));
 BA.debugLineNum = 106;BA.debugLine="ret = cd.Show(\"B4A ColorPicker Dialog HSV\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(512);
_ret = BA.NumberToString(_cd.Show("B4A ColorPicker Dialog HSV","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 107;BA.debugLine="ToastMessageShow(ret & \" : \" & cd.RGB, False)";
Debug.ShouldStop(1024);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(_ret+" : "+BA.NumberToString(_cd.getRGB()),anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 108;BA.debugLine="Activity.color = cd.RGB";
Debug.ShouldStop(2048);
mostCurrent._activity.setColor(_cd.getRGB());
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
public static String  _btncustom_click() throws Exception{
try {
		Debug.PushSubsStack("btnCustom_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,132);
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog _cd = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bgnd = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn1 = null;
String _ret = "";
 BA.debugLineNum = 132;BA.debugLine="Sub btnCustom_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Dim cd As CustomDialog";
Debug.ShouldStop(16);
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog();Debug.locals.put("cd", _cd);
 BA.debugLineNum = 134;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(32);
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 135;BA.debugLine="pnl.Initialize(\"pnl\")";
Debug.ShouldStop(64);
_pnl.Initialize(mostCurrent.activityBA,"pnl");
 BA.debugLineNum = 136;BA.debugLine="Dim bgnd As ColorDrawable";
Debug.ShouldStop(128);
_bgnd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("bgnd", _bgnd);
 BA.debugLineNum = 137;BA.debugLine="bgnd.Initialize(Colors.Green, 5dip)";
Debug.ShouldStop(256);
_bgnd.Initialize(anywheresoftware.b4a.keywords.Common.Colors.Green,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)));
 BA.debugLineNum = 138;BA.debugLine="pnl.Background = bgnd";
Debug.ShouldStop(512);
_pnl.setBackground((android.graphics.drawable.Drawable)(_bgnd.getObject()));
 BA.debugLineNum = 139;BA.debugLine="Dim btn1 As Button";
Debug.ShouldStop(1024);
_btn1 = new anywheresoftware.b4a.objects.ButtonWrapper();Debug.locals.put("btn1", _btn1);
 BA.debugLineNum = 140;BA.debugLine="btn1.Initialize(\"btn1\")";
Debug.ShouldStop(2048);
_btn1.Initialize(mostCurrent.activityBA,"btn1");
 BA.debugLineNum = 141;BA.debugLine="btn1.Text = \"Press me\"";
Debug.ShouldStop(4096);
_btn1.setText((Object)("Press me"));
 BA.debugLineNum = 142;BA.debugLine="pnl.AddView(btn1, 80dip, 50dip, 60dip, 60dip)";
Debug.ShouldStop(8192);
_pnl.AddView((android.view.View)(_btn1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
 BA.debugLineNum = 143;BA.debugLine="lbl1.Initialize(\"\")";
Debug.ShouldStop(16384);
mostCurrent._lbl1.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 144;BA.debugLine="pnl.AddView(lbl1, 50dip, 120dip, 120dip, 60dip)";
Debug.ShouldStop(32768);
_pnl.AddView((android.view.View)(mostCurrent._lbl1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
 BA.debugLineNum = 145;BA.debugLine="cd.AddView(pnl, 5%x, 0%y, 77%x, 70%y) ' sizing relative to the screen size is probably best";
Debug.ShouldStop(65536);
_cd.AddView((android.view.View)(_pnl.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (77),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (70),mostCurrent.activityBA));
 BA.debugLineNum = 146;BA.debugLine="ret = cd.Show(\"B4A Custom Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(131072);
_ret = BA.NumberToString(_cd.Show("B4A Custom Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
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
public static String  _btncustom2_click() throws Exception{
try {
		Debug.PushSubsStack("btnCustom2_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,149);
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog2 _cd = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _bgnd = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn1 = null;
anywheresoftware.b4a.objects.ListViewWrapper _lv = null;
String _ret = "";
 BA.debugLineNum = 149;BA.debugLine="Sub btnCustom2_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim cd As CustomDialog2";
Debug.ShouldStop(2097152);
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog2();Debug.locals.put("cd", _cd);
 BA.debugLineNum = 151;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(4194304);
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 152;BA.debugLine="pnl.Initialize(\"pnl\")";
Debug.ShouldStop(8388608);
_pnl.Initialize(mostCurrent.activityBA,"pnl");
 BA.debugLineNum = 153;BA.debugLine="Dim bgnd As ColorDrawable";
Debug.ShouldStop(16777216);
_bgnd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("bgnd", _bgnd);
 BA.debugLineNum = 154;BA.debugLine="bgnd.Initialize(Colors.Cyan, 5dip)";
Debug.ShouldStop(33554432);
_bgnd.Initialize(anywheresoftware.b4a.keywords.Common.Colors.Cyan,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)));
 BA.debugLineNum = 155;BA.debugLine="pnl.Background = bgnd";
Debug.ShouldStop(67108864);
_pnl.setBackground((android.graphics.drawable.Drawable)(_bgnd.getObject()));
 BA.debugLineNum = 156;BA.debugLine="Dim btn1 As Button";
Debug.ShouldStop(134217728);
_btn1 = new anywheresoftware.b4a.objects.ButtonWrapper();Debug.locals.put("btn1", _btn1);
 BA.debugLineNum = 157;BA.debugLine="btn1.Initialize(\"btn1\")";
Debug.ShouldStop(268435456);
_btn1.Initialize(mostCurrent.activityBA,"btn1");
 BA.debugLineNum = 158;BA.debugLine="btn1.Text = \"Press me\"";
Debug.ShouldStop(536870912);
_btn1.setText((Object)("Press me"));
 BA.debugLineNum = 159;BA.debugLine="pnl.AddView(btn1, 80dip, 50dip, 60dip, 60dip)";
Debug.ShouldStop(1073741824);
_pnl.AddView((android.view.View)(_btn1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
 BA.debugLineNum = 160;BA.debugLine="lbl1.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
mostCurrent._lbl1.Initialize(mostCurrent.activityBA,"");
 BA.debugLineNum = 161;BA.debugLine="pnl.AddView(lbl1, 50dip, 120dip, 120dip, 60dip)";
Debug.ShouldStop(1);
_pnl.AddView((android.view.View)(mostCurrent._lbl1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
 BA.debugLineNum = 163;BA.debugLine="Dim lv As ListView";
Debug.ShouldStop(4);
_lv = new anywheresoftware.b4a.objects.ListViewWrapper();Debug.locals.put("lv", _lv);
 BA.debugLineNum = 164;BA.debugLine="lv.Initialize(\"lv\")";
Debug.ShouldStop(8);
_lv.Initialize(mostCurrent.activityBA,"lv");
 BA.debugLineNum = 165;BA.debugLine="lv.AddTwoLinesAndBitmap(\"one\", \"one\", Null)";
Debug.ShouldStop(16);
_lv.AddTwoLinesAndBitmap("one","one",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
 BA.debugLineNum = 166;BA.debugLine="lv.AddTwoLinesAndBitmap(\"two\", \"one\", Null)";
Debug.ShouldStop(32);
_lv.AddTwoLinesAndBitmap("two","one",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
 BA.debugLineNum = 167;BA.debugLine="lv.AddTwoLinesAndBitmap(\"three\", \"one\", Null)";
Debug.ShouldStop(64);
_lv.AddTwoLinesAndBitmap("three","one",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
 BA.debugLineNum = 168;BA.debugLine="pnl.AddView(lv, 300dip, 120dip, 120dip, 250dip)";
Debug.ShouldStop(128);
_pnl.AddView((android.view.View)(_lv.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
 BA.debugLineNum = 170;BA.debugLine="cd.AddView(pnl, 77%x, 60%y) ' sizing relative to the screen size is probably best";
Debug.ShouldStop(512);
_cd.AddView((android.view.View)(_pnl.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (77),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (60),mostCurrent.activityBA));
 BA.debugLineNum = 171;BA.debugLine="ret = cd.Show(\"B4A Custom Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(1024);
_ret = BA.NumberToString(_cd.Show("B4A Custom Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 172;BA.debugLine="End Sub";
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
public static String  _btndate_click() throws Exception{
try {
		Debug.PushSubsStack("btnDate_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,61);
anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog _dd = null;
String _ret = "";
 BA.debugLineNum = 61;BA.debugLine="Sub btnDate_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim Dd As DateDialog";
Debug.ShouldStop(536870912);
_dd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();Debug.locals.put("Dd", _dd);
 BA.debugLineNum = 64;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
Debug.ShouldStop(-2147483648);
_dd.setYear(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 BA.debugLineNum = 65;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
Debug.ShouldStop(1);
_dd.setMonth(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 BA.debugLineNum = 66;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)";
Debug.ShouldStop(2);
_dd.setDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 BA.debugLineNum = 67;BA.debugLine="ret = Dd.Show(\"Set the required date\", \"B4A Date Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(4);
_ret = BA.NumberToString(_dd.Show("Set the required date","B4A Date Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 68;BA.debugLine="ToastMessageShow(ret & \" : \" & Dd.DayOfMonth & \"/\" & Dd.Month & \"/\" & Dd.Year , False)";
Debug.ShouldStop(8);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(_ret+" : "+BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())+"/"+BA.NumberToString(_dd.getYear()),anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
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
public static String  _btnfile_click() throws Exception{
try {
		Debug.PushSubsStack("btnFile_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,121);
anywheresoftware.b4a.agraham.dialogs.InputDialog.FileDialog _fd = null;
String _ret = "";
 BA.debugLineNum = 121;BA.debugLine="Sub btnFile_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Dim fd As FileDialog";
Debug.ShouldStop(33554432);
_fd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.FileDialog();Debug.locals.put("fd", _fd);
 BA.debugLineNum = 123;BA.debugLine="fd.FastScroll = True";
Debug.ShouldStop(67108864);
_fd.setFastScroll(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 125;BA.debugLine="fd.FilePath = File.DirRootExternal ' also sets ChosenName to an emtpy string";
Debug.ShouldStop(268435456);
_fd.setFilePath(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal());
 BA.debugLineNum = 128;BA.debugLine="ret = fd.Show(\"B4A File Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(-2147483648);
_ret = BA.NumberToString(_fd.Show("B4A File Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 129;BA.debugLine="ToastMessageShow(ret & \" : Path : \" & fd.FilePath & CRLF & \"File : \" & fd.ChosenName, False)";
Debug.ShouldStop(1);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(_ret+" : Path : "+_fd.getFilePath()+anywheresoftware.b4a.keywords.Common.CRLF+"File : "+_fd.getChosenName(),anywheresoftware.b4a.keywords.Common.False);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
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
public static String  _btninput_click() throws Exception{
try {
		Debug.PushSubsStack("btnInput_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,47);
anywheresoftware.b4a.agraham.dialogs.InputDialog _id = null;
String _ret = "";
 BA.debugLineNum = 47;BA.debugLine="Sub btnInput_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Dim Id As InputDialog";
Debug.ShouldStop(32768);
_id = new anywheresoftware.b4a.agraham.dialogs.InputDialog();Debug.locals.put("Id", _id);
 BA.debugLineNum = 53;BA.debugLine="Id.Input = \"\"";
Debug.ShouldStop(1048576);
_id.setInput("");
 BA.debugLineNum = 54;BA.debugLine="Id.Hint = \"Enter some text!\"";
Debug.ShouldStop(2097152);
_id.setHint("Enter some text!");
 BA.debugLineNum = 55;BA.debugLine="Id.HintColor = Colors.ARGB(196, 255, 140, 0)";
Debug.ShouldStop(4194304);
_id.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (196),(int) (255),(int) (140),(int) (0)));
 BA.debugLineNum = 56;BA.debugLine="ret = DialogResponse.CANCEL";
Debug.ShouldStop(8388608);
_ret = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 57;BA.debugLine="ret = Id.Show(\"Input the required text\", \"B4A Input Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(16777216);
_ret = BA.NumberToString(_id.Show("Input the required text","B4A Input Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 58;BA.debugLine="ToastMessageShow(ret & \" : \" & Id.Input, False)";
Debug.ShouldStop(33554432);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(_ret+" : "+_id.getInput(),anywheresoftware.b4a.keywords.Common.False);
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
public static String  _btnnumber_click() throws Exception{
try {
		Debug.PushSubsStack("btnNumber_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,111);
anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog _nd = null;
String _ret = "";
 BA.debugLineNum = 111;BA.debugLine="Sub btnNumber_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Dim nd As NumberDialog";
Debug.ShouldStop(32768);
_nd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog();Debug.locals.put("nd", _nd);
 BA.debugLineNum = 113;BA.debugLine="nd.Digits = 10";
Debug.ShouldStop(65536);
_nd.setDigits((int) (10));
 BA.debugLineNum = 114;BA.debugLine="nd.Number = -12345";
Debug.ShouldStop(131072);
_nd.setNumber((int) (-12345));
 BA.debugLineNum = 115;BA.debugLine="nd.Decimal = 2";
Debug.ShouldStop(262144);
_nd.setDecimal((int) (2));
 BA.debugLineNum = 116;BA.debugLine="nd.ShowSign = True";
Debug.ShouldStop(524288);
_nd.setShowSign(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 117;BA.debugLine="ret = nd.Show(\"B4A Number Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(1048576);
_ret = BA.NumberToString(_nd.Show("B4A Number Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 118;BA.debugLine="ToastMessageShow(ret & \" : \" & nd.Number, False)";
Debug.ShouldStop(2097152);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(_ret+" : "+BA.NumberToString(_nd.getNumber()),anywheresoftware.b4a.keywords.Common.False);
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
public static String  _btntime_click() throws Exception{
try {
		Debug.PushSubsStack("btnTime_Click (main) ","main",0,mostCurrent.activityBA,mostCurrent,71);
anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog _td = null;
String _txt = "";
String _ret = "";
 BA.debugLineNum = 71;BA.debugLine="Sub btnTime_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Dim td As TimeDialog";
Debug.ShouldStop(128);
_td = new anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog();Debug.locals.put("td", _td);
 BA.debugLineNum = 73;BA.debugLine="Dim txt As String";
Debug.ShouldStop(256);
_txt = "";Debug.locals.put("txt", _txt);
 BA.debugLineNum = 74;BA.debugLine="td.Hour = DateTime.GetHour(DateTime.Now)";
Debug.ShouldStop(512);
_td.setHour(anywheresoftware.b4a.keywords.Common.DateTime.GetHour(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 BA.debugLineNum = 75;BA.debugLine="td.Minute = DateTime.GetMinute(DateTime.Now)";
Debug.ShouldStop(1024);
_td.setMinute(anywheresoftware.b4a.keywords.Common.DateTime.GetMinute(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 BA.debugLineNum = 76;BA.debugLine="td.Is24Hours = True";
Debug.ShouldStop(2048);
_td.setIs24Hours(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 77;BA.debugLine="ret = td.Show(\"Set the required time\", \"B4A Time Dialog\", \"Yes\", \"No\", \"Maybe\", Bmp)";
Debug.ShouldStop(4096);
_ret = BA.NumberToString(_td.Show("Set the required time","B4A Time Dialog","Yes","No","Maybe",mostCurrent.activityBA,(android.graphics.Bitmap)(mostCurrent._bmp.getObject())));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 78;BA.debugLine="ToastMessageShow(ret & \" : \" & td.Hour & \":\" & td.Minute, False)";
Debug.ShouldStop(8192);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(_ret+" : "+BA.NumberToString(_td.getHour())+":"+BA.NumberToString(_td.getMinute()),anywheresoftware.b4a.keywords.Common.False);
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

public static void initializeProcessGlobals() {
    if (mostCurrent != null && mostCurrent.activityBA != null) {
Debug.StartDebugging(mostCurrent.activityBA, 11109, new int[] {6}, "71e5e926-84d8-4bd7-a9cf-bd31000c6a45");}

    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim btnDate As Button";
mostCurrent._btndate = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim btnInput As Button";
mostCurrent._btninput = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim getTime As Button";
mostCurrent._gettime = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim Bmp As Bitmap";
mostCurrent._bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim btnColor As Button";
mostCurrent._btncolor = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim btnColor2 As Button";
mostCurrent._btncolor2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim btnNumber As Button";
mostCurrent._btnnumber = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim btnFile As Button";
mostCurrent._btnfile = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim btnCustom As Button";
mostCurrent._btncustom = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Dim lbl1 As Label";
mostCurrent._lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _lv_itemclick(int _position,Object _value) throws Exception{
try {
		Debug.PushSubsStack("lv_ItemClick (main) ","main",0,mostCurrent.activityBA,mostCurrent,180);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 180;BA.debugLine="Sub lv_ItemClick (Position As Int, Value As Object)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="ToastMessageShow(Position, True)";
Debug.ShouldStop(1048576);
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.NumberToString(_position),anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 182;BA.debugLine="End Sub";
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
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
}
