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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
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



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
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
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static String _dbfiledir = "";
public static String _dbfilename = "";
public static String _dbtablename = "";
public static int _selectedid = 0;
public static int _selectedrow = 0;
public b4a.example.table _table1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltable = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndb = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncvs = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnchangeheaders = null;
public static boolean _newheaders = false;
public static String  _activity_click() throws Exception{
RDebugUtils.currentModule="main";
b4a.example.table._rowcol _rc = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Activity_Click";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.table._rowcol();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="rc.Row = -1";
_rc.Row = (int) (-1);
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="rc.Col = 1";
_rc.Col = (int) (1);
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Table1.SelectRow(rc)";
mostCurrent._table1._selectrow(null,_rc);
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="If File.Exists(File.DirDefaultExternal, DBFileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_dbfilename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="File.Copy(File.DirAssets, DBFileName, DBFileDir, DBFileName)";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_dbfilename,_dbfiledir,_dbfilename);
 };
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="SQL1.Initialize(DBFileDir, DBFileName, True)";
_sql1.Initialize(_dbfiledir,_dbfilename,anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="btnChangeHeaders.Initialize(\"btnChangeHeaders\")";
mostCurrent._btnchangeheaders.Initialize(mostCurrent.activityBA,"btnChangeHeaders");
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="Activity.AddView(btnChangeHeaders, 2%x, 100%y - 60dip, 30%x, 50dip)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._btnchangeheaders.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="btnChangeHeaders.Text = \"Change headers\"";
mostCurrent._btnchangeheaders.setText((Object)("Change headers"));
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="btnDB.Initialize(\"btnDB\")";
mostCurrent._btndb.Initialize(mostCurrent.activityBA,"btnDB");
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="Activity.AddView(btnDB, 34%x, 100%y - 60dip, 30%x, 50dip)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._btndb.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (34),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="btnDB.Text = \"SwapDB\"";
mostCurrent._btndb.setText((Object)("SwapDB"));
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="btnCVS.Initialize(\"btnCVS\")";
mostCurrent._btncvs.Initialize(mostCurrent.activityBA,"btnCVS");
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="Activity.AddView(btnCVS, 68%x, 100%y - 60dip, 30%x, 50dip)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._btncvs.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (68),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="btnCVS.Text = \"CVS\"";
mostCurrent._btncvs.setText((Object)("CVS"));
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="pnlTable.Initialize(\"\")";
mostCurrent._pnltable.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="Activity.AddView(pnlTable, 20dip, 20dip, 100%x - 40dip, 100%y - 90dip)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pnltable.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (90))));
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="Table1.Initialize(Me, \"Table1\", 5, Gravity.CENTER_HORIZONTAL, True)";
mostCurrent._table1._initialize(null,mostCurrent.activityBA,main.getObject(),"Table1",(int) (5),anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="Table1.CellAlignment = Bit.OR(Gravity.LEFT, Gravity.CENTER_VERTICAL)";
mostCurrent._table1._setcellalignment(null,anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.LEFT,anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="Table1.HeaderColor = Colors.Blue";
mostCurrent._table1._setheadercolor(null,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="Table1.HeaderTextColor = Colors.Yellow";
mostCurrent._table1._setheadertextcolor(null,anywheresoftware.b4a.keywords.Common.Colors.Yellow);
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="Table1.TextColor = Colors.Blue";
mostCurrent._table1._settextcolor(null,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="Table1.TableColor = Colors.Red";
mostCurrent._table1._settablecolor(null,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="Table1.RowHeight = 50dip";
mostCurrent._table1._setrowheight(null,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="Table1.AllowSelection = False";
mostCurrent._table1._setallowselection(null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="Table1.AddToActivity(pnlTable, 0, 0, pnlTable.Width, pnlTable.Height)";
mostCurrent._table1._addtoactivity(null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._pnltable.getObject())),(int) (0),(int) (0),mostCurrent._pnltable.getWidth(),mostCurrent._pnltable.getHeight());
RDebugUtils.currentLine=131114;
 //BA.debugLineNum = 131114;BA.debugLine="Table1.MultiSelect = False";
mostCurrent._table1._setmultiselect(null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="Table1.SortColumn = False";
mostCurrent._table1._setsortcolumn(null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131116;
 //BA.debugLineNum = 131116;BA.debugLine="Table1.SingleLine = False";
mostCurrent._table1._setsingleline(null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="FillTableSQLite";
_filltablesqlite();
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="End Sub";
return "";
}
public static String  _filltablesqlite() throws Exception{
RDebugUtils.currentModule="main";
String _query = "";
anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _tf = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub FillTableSQLite";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim Query As String";
_query = "";
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Table1.ClearAll";
mostCurrent._table1._clearall(null);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Table1.LineWidth = 3dip";
mostCurrent._table1._setlinewidth(null,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Table1.TextSize = 20";
mostCurrent._table1._settextsize(null,(float) (20));
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Dim tf() As Typeface";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _tf.length;
for (int i0 = 0;i0 < d0;i0++) {
_tf[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="tf = Array As Typeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT)";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]{(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT))};
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="Table1.SetTypeFaces(tf)";
mostCurrent._table1._settypefaces(null,_tf);
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="Table1.UseColumnColors = True";
mostCurrent._table1._setusecolumncolors(null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="Table1.SetColumnColors(Array As Int(Colors.White, 0xFF98F5FF, 0xFFFFC0FF, 0xFFC0FFC0, 0xFFFFFFC0))";
mostCurrent._table1._setcolumncolors(null,new int[]{anywheresoftware.b4a.keywords.Common.Colors.White,(int) (0xff98f5ff),(int) (0xffffc0ff),(int) (0xffc0ffc0),(int) (0xffffffc0)});
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="Table1.SetTextColors(Array As Int(Colors.Black, 0xFF800000, 0xFF0000FF, 0xFF004000, 0xFF400040))";
mostCurrent._table1._settextcolors(null,new int[]{anywheresoftware.b4a.keywords.Common.Colors.Black,(int) (0xff800000),(int) (0xff0000ff),(int) (0xff004000),(int) (0xff400040)});
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="Table1.SetHeaderColors(Array As Int(Colors.Black, 0xFF800000, 0xFF0000FF, 0xFF004000, 0xFF400040))";
mostCurrent._table1._setheadercolors(null,new int[]{anywheresoftware.b4a.keywords.Common.Colors.Black,(int) (0xff800000),(int) (0xff0000ff),(int) (0xff004000),(int) (0xff400040)});
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="Table1.SetHeaderTextColors(Array As Int(Colors.White, 0xFF98F5FF, 0xFFFFC0FF, 0xFFC0FFC0, 0xFFFFFFC0))";
mostCurrent._table1._setheadertextcolors(null,new int[]{anywheresoftware.b4a.keywords.Common.Colors.White,(int) (0xff98f5ff),(int) (0xffffc0ff),(int) (0xffc0ffc0),(int) (0xffffffc0)});
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="Query = \"SELECT * FROM \" & DBTableName";
_query = "SELECT * FROM "+_dbtablename;
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="Table1.LoadSQLiteDB(SQL1, Query, True)";
mostCurrent._table1._loadsqlitedb(null,_sql1,_query,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655406;
 //BA.debugLineNum = 655406;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="End Sub";
return "";
}
public static String  _btnchangeheaders_click() throws Exception{
RDebugUtils.currentModule="main";
String[] _headers = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub btnChangeHeaders_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim Headers() As String";
_headers = new String[(int) (0)];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="NewHeaders = Not(NewHeaders)";
_newheaders = anywheresoftware.b4a.keywords.Common.Not(_newheaders);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="If NewHeaders = True Then";
if (_newheaders==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Headers = Array As String(\"Col1\", \"First\" & CRLF & \"name\", \"Last name\", \"Addresses\", \"Cities\")";
_headers = new String[]{"Col1","First"+anywheresoftware.b4a.keywords.Common.CRLF+"name","Last name","Addresses","Cities"};
 }else {
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Headers = Array As String(\"ID\", \"FirstName\", \"LastName\", \"Address\", \"City\")";
_headers = new String[]{"ID","FirstName","LastName","Address","City"};
 };
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Table1.SetHeader(Headers)";
mostCurrent._table1._setheader(null,_headers);
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="End Sub";
return "";
}
public static String  _btncvs_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub btnCVS_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Table1.ClearAll";
mostCurrent._table1._clearall(null);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Table1.LoadTableFromCSV2(File.DirAssets, \"persons.csv\", True, \",\", False)";
mostCurrent._table1._loadtablefromcsv2(null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"persons.csv",anywheresoftware.b4a.keywords.Common.True,",",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="End Sub";
return "";
}
public static String  _btndb_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub btnDB_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If DBFileName = \"persons.db\" Then";
if ((_dbfilename).equals("persons.db")) { 
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="DBFileName = \"persons1.db\"";
_dbfilename = "persons1.db";
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="DBTableName = \"persons\"";
_dbtablename = "persons";
 }else {
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="DBFileName = \"persons.db\"";
_dbfilename = "persons.db";
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="DBTableName = \"persons\"";
_dbtablename = "persons";
 };
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="If File.Exists(File.DirDefaultExternal, DBFileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_dbfilename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="File.Copy(File.DirAssets, DBFileName, DBFileDir, DBFileName)";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_dbfilename,_dbfiledir,_dbfilename);
 };
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="SQL1.Initialize(DBFileDir, DBFileName, True)";
_sql1.Initialize(_dbfiledir,_dbfilename,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="FillTableSQLite";
_filltablesqlite();
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="End Sub";
return "";
}
public static String  _filltablecsv() throws Exception{
RDebugUtils.currentModule="main";
String _query = "";
anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _tf = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub FillTableCSV";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim Query As String";
_query = "";
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Table1.ClearAll";
mostCurrent._table1._clearall(null);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Table1.LineWidth = 3dip";
mostCurrent._table1._setlinewidth(null,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Table1.TextSize = 20";
mostCurrent._table1._settextsize(null,(float) (20));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Dim tf() As Typeface";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _tf.length;
for (int i0 = 0;i0 < d0;i0++) {
_tf[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="tf = Array As Typeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT)";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]{(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT))};
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Table1.SetTypeFaces(tf)";
mostCurrent._table1._settypefaces(null,_tf);
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="Table1.LoadTableFromCSV2(File.DirAssets, \"Grades.csv\", True, \",\",True)";
mostCurrent._table1._loadtablefromcsv2(null,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Grades.csv",anywheresoftware.b4a.keywords.Common.True,",",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="End Sub";
return "";
}
public static String  _filltablefix() throws Exception{
RDebugUtils.currentModule="main";
anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _tf = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub FillTableFix";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Table1.LineWidth = 3dip";
mostCurrent._table1._setlinewidth(null,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Table1.TextSize = 20";
mostCurrent._table1._settextsize(null,(float) (20));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim tf() As Typeface";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _tf.length;
for (int i0 = 0;i0 < d0;i0++) {
_tf[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="tf = Array As Typeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT)";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]{(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD)),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT))};
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Table1.SetTypeFaces(tf)";
mostCurrent._table1._settypefaces(null,_tf);
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Table1.SetHeader(Array As String(\"Head1\", \"Head2\", \"Head3\", \"Head4\", \"Head4\"))";
mostCurrent._table1._setheader(null,new String[]{"Head1","Head2","Head3","Head4","Head4"});
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Table1.SetColumnsWidths(Array As Int(25%x, 25%x, 25%x, 25%x, 25%x))";
mostCurrent._table1._setcolumnswidths(null,new int[]{anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA)});
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Table1.ClearAll";
mostCurrent._table1._clearall(null);
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Table1.AddRow(Array As String(\"aaa1\", \"bbbb1\", \"cccc1\", \"dddd1\", \"eeee1\"))";
mostCurrent._table1._addrow(null,new String[]{"aaa1","bbbb1","cccc1","dddd1","eeee1"});
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Table1.AddRow(Array As String(\"aaa2\", \"bbbb2\", \"cccc2\", \"dddd2\", \"eeee2\"))";
mostCurrent._table1._addrow(null,new String[]{"aaa2","bbbb2","cccc2","dddd2","eeee2"});
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="Table1.AddRow(Array As String(\"aaa3\", \"bbbb3\", \"cccc3\", \"dddd3\", \"eeee3\"))";
mostCurrent._table1._addrow(null,new String[]{"aaa3","bbbb3","cccc3","dddd3","eeee3"});
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="End Sub";
return "";
}
public static String  _table1_cellclick(int _col,int _row) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Table1_CellClick (Col As Int, Row As Int)";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Activity.Title = Table1.GetValue(Col, Row)";
mostCurrent._activity.setTitle((Object)(mostCurrent._table1._getvalue(null,_col,_row)));
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="SelectedRow = Row";
_selectedrow = _row;
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="End Sub";
return "";
}
public static String  _table1_headerclick(int _col) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Table1_HeaderClick (Col As Int)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Activity.Title = \"HeaderClick: \" & Col";
mostCurrent._activity.setTitle((Object)("HeaderClick: "+BA.NumberToString(_col)));
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _table1_headerlongclick(int _col) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Table1_HeaderLongClick(col As Int)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Msgbox(\"Header '\" & Table1.HeaderNames.Get(col) & \"' clicked\", \"Header\")";
anywheresoftware.b4a.keywords.Common.Msgbox("Header '"+BA.ObjectToString(mostCurrent._table1._headernames.Get(_col))+"' clicked","Header",mostCurrent.activityBA);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
}