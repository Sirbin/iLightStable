package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_click() throws Exception{
try {
		Debug.PushSubsStack("Activity_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
if (RapidSub.canDelegate("activity_click")) return main.remoteMe.runUserSub(false, "main","activity_click");
RemoteObject _rc = RemoteObject.declareNull("b4a.example.table._rowcol");
 BA.debugLineNum = 97;BA.debugLine="Sub Activity_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 99;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(4);
_rc = RemoteObject.createNew ("b4a.example.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 100;BA.debugLine="rc.Row = -1";
Debug.ShouldStop(8);
_rc.setFieldClass("b4a.example.table._rowcol", "Row",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 101;BA.debugLine="rc.Col = 1";
Debug.ShouldStop(16);
_rc.setFieldClass("b4a.example.table._rowcol", "Col",BA.numberCast(int.class, 1));
 BA.debugLineNum = 102;BA.debugLine="Table1.SelectRow(rc)";
Debug.ShouldStop(32);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_selectrow",(Object)(_rc));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(8);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 39;BA.debugLine="If File.Exists(File.DirDefaultExternal, DBFileName) = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(main._dbfilename)),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 40;BA.debugLine="File.Copy(File.DirAssets, DBFileName, DBFileDir, DBFileName)";
Debug.ShouldStop(128);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._dbfilename),(Object)(main._dbfiledir),(Object)(main._dbfilename));
 };
 BA.debugLineNum = 42;BA.debugLine="SQL1.Initialize(DBFileDir, DBFileName, True)";
Debug.ShouldStop(512);
main._sql1.runVoidMethod ("Initialize",(Object)(main._dbfiledir),(Object)(main._dbfilename),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 45;BA.debugLine="btnChangeHeaders.Initialize(\"btnChangeHeaders\")";
Debug.ShouldStop(4096);
main.mostCurrent._btnchangeheaders.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("btnChangeHeaders")));
 BA.debugLineNum = 46;BA.debugLine="Activity.AddView(btnChangeHeaders, 2%x, 100%y - 60dip, 30%x, 50dip)";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._btnchangeheaders.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),main.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 47;BA.debugLine="btnChangeHeaders.Text = \"Change headers\"";
Debug.ShouldStop(16384);
main.mostCurrent._btnchangeheaders.runMethod(true,"setText",RemoteObject.createImmutable(("Change headers")));
 BA.debugLineNum = 49;BA.debugLine="btnDB.Initialize(\"btnDB\")";
Debug.ShouldStop(65536);
main.mostCurrent._btndb.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("btnDB")));
 BA.debugLineNum = 50;BA.debugLine="Activity.AddView(btnDB, 34%x, 100%y - 60dip, 30%x, 50dip)";
Debug.ShouldStop(131072);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._btndb.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 34)),main.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 51;BA.debugLine="btnDB.Text = \"SwapDB\"";
Debug.ShouldStop(262144);
main.mostCurrent._btndb.runMethod(true,"setText",RemoteObject.createImmutable(("SwapDB")));
 BA.debugLineNum = 53;BA.debugLine="btnCVS.Initialize(\"btnCVS\")";
Debug.ShouldStop(1048576);
main.mostCurrent._btncvs.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("btnCVS")));
 BA.debugLineNum = 54;BA.debugLine="Activity.AddView(btnCVS, 68%x, 100%y - 60dip, 30%x, 50dip)";
Debug.ShouldStop(2097152);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._btncvs.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 68)),main.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 55;BA.debugLine="btnCVS.Text = \"CVS\"";
Debug.ShouldStop(4194304);
main.mostCurrent._btncvs.runMethod(true,"setText",RemoteObject.createImmutable(("CVS")));
 BA.debugLineNum = 57;BA.debugLine="pnlTable.Initialize(\"\")";
Debug.ShouldStop(16777216);
main.mostCurrent._pnltable.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 58;BA.debugLine="Activity.AddView(pnlTable, 20dip, 20dip, 100%x - 40dip, 100%y - 90dip)";
Debug.ShouldStop(33554432);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._pnltable.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))}, "-",1, 1)));
 BA.debugLineNum = 62;BA.debugLine="Table1.Initialize(Me, \"Table1\", 5, Gravity.CENTER_HORIZONTAL, True)";
Debug.ShouldStop(536870912);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_initialize",main.mostCurrent.activityBA,(Object)(main.getObject()),(Object)(BA.ObjectToString("Table1")),(Object)(BA.numberCast(int.class, 5)),(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 63;BA.debugLine="Table1.CellAlignment = Bit.OR(Gravity.LEFT, Gravity.CENTER_VERTICAL)";
Debug.ShouldStop(1073741824);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setcellalignment",main.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT")),(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 64;BA.debugLine="Table1.HeaderColor = Colors.Blue";
Debug.ShouldStop(-2147483648);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setheadercolor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 65;BA.debugLine="Table1.HeaderTextColor = Colors.Yellow";
Debug.ShouldStop(1);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setheadertextcolor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 66;BA.debugLine="Table1.TextColor = Colors.Blue";
Debug.ShouldStop(2);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settextcolor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 67;BA.debugLine="Table1.TableColor = Colors.Red";
Debug.ShouldStop(4);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settablecolor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 68;BA.debugLine="Table1.RowHeight = 50dip";
Debug.ShouldStop(8);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setrowheight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 73;BA.debugLine="Table1.AllowSelection = False";
Debug.ShouldStop(256);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setallowselection",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="Table1.AddToActivity(pnlTable, 0, 0, pnlTable.Width, pnlTable.Height)";
Debug.ShouldStop(512);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_addtoactivity",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), main.mostCurrent._pnltable.getObject()),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._pnltable.runMethod(true,"getWidth")),(Object)(main.mostCurrent._pnltable.runMethod(true,"getHeight")));
 BA.debugLineNum = 77;BA.debugLine="Table1.MultiSelect = False";
Debug.ShouldStop(4096);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setmultiselect",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="Table1.SortColumn = False";
Debug.ShouldStop(8192);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setsortcolumn",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="Table1.SingleLine = False";
Debug.ShouldStop(16384);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setsingleline",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 82;BA.debugLine="FillTableSQLite";
Debug.ShouldStop(131072);
_filltablesqlite();
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 93;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 86;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnchangeheaders_click() throws Exception{
try {
		Debug.PushSubsStack("btnChangeHeaders_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,211);
if (RapidSub.canDelegate("btnchangeheaders_click")) return main.remoteMe.runUserSub(false, "main","btnchangeheaders_click");
RemoteObject _headers = null;
 BA.debugLineNum = 211;BA.debugLine="Sub btnChangeHeaders_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="Dim Headers() As String";
Debug.ShouldStop(524288);
_headers = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 214;BA.debugLine="NewHeaders = Not(NewHeaders)";
Debug.ShouldStop(2097152);
main._newheaders = main.mostCurrent.__c.runMethod(true,"Not",(Object)(main._newheaders));
 BA.debugLineNum = 215;BA.debugLine="If NewHeaders = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main._newheaders,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 216;BA.debugLine="Headers = Array As String(\"Col1\", \"First\" & CRLF & \"name\", \"Last name\", \"Addresses\", \"Cities\")";
Debug.ShouldStop(8388608);
_headers = RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("Col1"),RemoteObject.concat(RemoteObject.createImmutable("First"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("name")),BA.ObjectToString("Last name"),BA.ObjectToString("Addresses"),BA.ObjectToString("Cities")});Debug.locals.put("Headers", _headers);
 }else {
 BA.debugLineNum = 218;BA.debugLine="Headers = Array As String(\"ID\", \"FirstName\", \"LastName\", \"Address\", \"City\")";
Debug.ShouldStop(33554432);
_headers = RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("ID"),BA.ObjectToString("FirstName"),BA.ObjectToString("LastName"),BA.ObjectToString("Address"),BA.ObjectToString("City")});Debug.locals.put("Headers", _headers);
 };
 BA.debugLineNum = 220;BA.debugLine="Table1.SetHeader(Headers)";
Debug.ShouldStop(134217728);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setheader",(Object)(_headers));
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncvs_click() throws Exception{
try {
		Debug.PushSubsStack("btnCVS_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,138);
if (RapidSub.canDelegate("btncvs_click")) return main.remoteMe.runUserSub(false, "main","btncvs_click");
 BA.debugLineNum = 138;BA.debugLine="Sub btnCVS_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Table1.ClearAll";
Debug.ShouldStop(1024);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_clearall");
 BA.debugLineNum = 145;BA.debugLine="Table1.LoadTableFromCSV2(File.DirAssets, \"persons.csv\", True, \",\", False)";
Debug.ShouldStop(65536);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_loadtablefromcsv2",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("persons.csv")),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.ObjectToString(",")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndb_click() throws Exception{
try {
		Debug.PushSubsStack("btnDB_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,120);
if (RapidSub.canDelegate("btndb_click")) return main.remoteMe.runUserSub(false, "main","btndb_click");
 BA.debugLineNum = 120;BA.debugLine="Sub btnDB_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="If DBFileName = \"persons.db\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._dbfilename,BA.ObjectToString("persons.db"))) { 
 BA.debugLineNum = 124;BA.debugLine="DBFileName = \"persons1.db\"";
Debug.ShouldStop(134217728);
main._dbfilename = BA.ObjectToString("persons1.db");
 BA.debugLineNum = 125;BA.debugLine="DBTableName = \"persons\"";
Debug.ShouldStop(268435456);
main._dbtablename = BA.ObjectToString("persons");
 }else {
 BA.debugLineNum = 127;BA.debugLine="DBFileName = \"persons.db\"";
Debug.ShouldStop(1073741824);
main._dbfilename = BA.ObjectToString("persons.db");
 BA.debugLineNum = 128;BA.debugLine="DBTableName = \"persons\"";
Debug.ShouldStop(-2147483648);
main._dbtablename = BA.ObjectToString("persons");
 };
 BA.debugLineNum = 130;BA.debugLine="If File.Exists(File.DirDefaultExternal, DBFileName) = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(main._dbfilename)),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 131;BA.debugLine="File.Copy(File.DirAssets, DBFileName, DBFileDir, DBFileName)";
Debug.ShouldStop(4);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(main._dbfilename),(Object)(main._dbfiledir),(Object)(main._dbfilename));
 };
 BA.debugLineNum = 134;BA.debugLine="SQL1.Initialize(DBFileDir, DBFileName, True)";
Debug.ShouldStop(32);
main._sql1.runVoidMethod ("Initialize",(Object)(main._dbfiledir),(Object)(main._dbfilename),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 135;BA.debugLine="FillTableSQLite";
Debug.ShouldStop(64);
_filltablesqlite();
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filltablecsv() throws Exception{
try {
		Debug.PushSubsStack("FillTableCSV (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,196);
if (RapidSub.canDelegate("filltablecsv")) return main.remoteMe.runUserSub(false, "main","filltablecsv");
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _tf = null;
 BA.debugLineNum = 196;BA.debugLine="Sub FillTableCSV";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="Dim Query As String";
Debug.ShouldStop(16);
_query = RemoteObject.createImmutable("");Debug.locals.put("Query", _query);
 BA.debugLineNum = 199;BA.debugLine="Table1.ClearAll";
Debug.ShouldStop(64);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_clearall");
 BA.debugLineNum = 201;BA.debugLine="Table1.LineWidth = 3dip";
Debug.ShouldStop(256);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setlinewidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 202;BA.debugLine="Table1.TextSize = 20";
Debug.ShouldStop(512);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settextsize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 204;BA.debugLine="Dim tf() As Typeface";
Debug.ShouldStop(2048);
_tf = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});Debug.locals.put("tf", _tf);
 BA.debugLineNum = 205;BA.debugLine="tf = Array As Typeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT)";
Debug.ShouldStop(4096);
_tf = RemoteObject.createNewArray("anywheresoftware.b4a.keywords.constants.TypefaceWrapper",new int[] {5},new Object[] {RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"))});Debug.locals.put("tf", _tf);
 BA.debugLineNum = 206;BA.debugLine="Table1.SetTypeFaces(tf)";
Debug.ShouldStop(8192);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settypefaces",(Object)(_tf));
 BA.debugLineNum = 208;BA.debugLine="Table1.LoadTableFromCSV2(File.DirAssets, \"Grades.csv\", True, \",\",True)";
Debug.ShouldStop(32768);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_loadtablefromcsv2",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Grades.csv")),(Object)(main.mostCurrent.__c.getField(true,"True")),(Object)(BA.ObjectToString(",")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filltablefix() throws Exception{
try {
		Debug.PushSubsStack("FillTableFix (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,227);
if (RapidSub.canDelegate("filltablefix")) return main.remoteMe.runUserSub(false, "main","filltablefix");
RemoteObject _tf = null;
 BA.debugLineNum = 227;BA.debugLine="Sub FillTableFix";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="Table1.LineWidth = 3dip";
Debug.ShouldStop(8);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setlinewidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 229;BA.debugLine="Table1.TextSize = 20";
Debug.ShouldStop(16);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settextsize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 231;BA.debugLine="Dim tf() As Typeface";
Debug.ShouldStop(64);
_tf = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});Debug.locals.put("tf", _tf);
 BA.debugLineNum = 232;BA.debugLine="tf = Array As Typeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT)";
Debug.ShouldStop(128);
_tf = RemoteObject.createNewArray("anywheresoftware.b4a.keywords.constants.TypefaceWrapper",new int[] {5},new Object[] {RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"))});Debug.locals.put("tf", _tf);
 BA.debugLineNum = 233;BA.debugLine="Table1.SetTypeFaces(tf)";
Debug.ShouldStop(256);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settypefaces",(Object)(_tf));
 BA.debugLineNum = 235;BA.debugLine="Table1.SetHeader(Array As String(\"Head1\", \"Head2\", \"Head3\", \"Head4\", \"Head4\"))";
Debug.ShouldStop(1024);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setheader",(Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("Head1"),BA.ObjectToString("Head2"),BA.ObjectToString("Head3"),BA.ObjectToString("Head4"),BA.ObjectToString("Head4")})));
 BA.debugLineNum = 236;BA.debugLine="Table1.SetColumnsWidths(Array As Int(25%x, 25%x, 25%x, 25%x, 25%x))";
Debug.ShouldStop(2048);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setcolumnswidths",(Object)(RemoteObject.createNewArray("int",new int[] {5},new Object[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA)})));
 BA.debugLineNum = 237;BA.debugLine="Table1.ClearAll";
Debug.ShouldStop(4096);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_clearall");
 BA.debugLineNum = 239;BA.debugLine="Table1.AddRow(Array As String(\"aaa1\", \"bbbb1\", \"cccc1\", \"dddd1\", \"eeee1\"))";
Debug.ShouldStop(16384);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_addrow",(Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("aaa1"),BA.ObjectToString("bbbb1"),BA.ObjectToString("cccc1"),BA.ObjectToString("dddd1"),BA.ObjectToString("eeee1")})));
 BA.debugLineNum = 240;BA.debugLine="Table1.AddRow(Array As String(\"aaa2\", \"bbbb2\", \"cccc2\", \"dddd2\", \"eeee2\"))";
Debug.ShouldStop(32768);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_addrow",(Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("aaa2"),BA.ObjectToString("bbbb2"),BA.ObjectToString("cccc2"),BA.ObjectToString("dddd2"),BA.ObjectToString("eeee2")})));
 BA.debugLineNum = 241;BA.debugLine="Table1.AddRow(Array As String(\"aaa3\", \"bbbb3\", \"cccc3\", \"dddd3\", \"eeee3\"))";
Debug.ShouldStop(65536);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_addrow",(Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("aaa3"),BA.ObjectToString("bbbb3"),BA.ObjectToString("cccc3"),BA.ObjectToString("dddd3"),BA.ObjectToString("eeee3")})));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filltablesqlite() throws Exception{
try {
		Debug.PushSubsStack("FillTableSQLite (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,148);
if (RapidSub.canDelegate("filltablesqlite")) return main.remoteMe.runUserSub(false, "main","filltablesqlite");
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _tf = null;
 BA.debugLineNum = 148;BA.debugLine="Sub FillTableSQLite";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="Dim Query As String";
Debug.ShouldStop(1048576);
_query = RemoteObject.createImmutable("");Debug.locals.put("Query", _query);
 BA.debugLineNum = 151;BA.debugLine="Table1.ClearAll";
Debug.ShouldStop(4194304);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_clearall");
 BA.debugLineNum = 153;BA.debugLine="Table1.LineWidth = 3dip";
Debug.ShouldStop(16777216);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setlinewidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 154;BA.debugLine="Table1.TextSize = 20";
Debug.ShouldStop(33554432);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settextsize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 156;BA.debugLine="Dim tf() As Typeface";
Debug.ShouldStop(134217728);
_tf = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});Debug.locals.put("tf", _tf);
 BA.debugLineNum = 157;BA.debugLine="tf = Array As Typeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT, Typeface.DEFAULT_BOLD, Typeface.DEFAULT)";
Debug.ShouldStop(268435456);
_tf = RemoteObject.createNewArray("anywheresoftware.b4a.keywords.constants.TypefaceWrapper",new int[] {5},new Object[] {RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), main.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"))});Debug.locals.put("tf", _tf);
 BA.debugLineNum = 158;BA.debugLine="Table1.SetTypeFaces(tf)";
Debug.ShouldStop(536870912);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settypefaces",(Object)(_tf));
 BA.debugLineNum = 160;BA.debugLine="Table1.UseColumnColors = True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setusecolumncolors",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 161;BA.debugLine="Table1.SetColumnColors(Array As Int(Colors.White, 0xFF98F5FF, 0xFFFFC0FF, 0xFFC0FFC0, 0xFFFFFFC0))";
Debug.ShouldStop(1);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setcolumncolors",(Object)(RemoteObject.createNewArray("int",new int[] {5},new Object[] {main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"),BA.numberCast(int.class, 0xff98f5ff),BA.numberCast(int.class, 0xffffc0ff),BA.numberCast(int.class, 0xffc0ffc0),BA.numberCast(int.class, 0xffffffc0)})));
 BA.debugLineNum = 162;BA.debugLine="Table1.SetTextColors(Array As Int(Colors.Black, 0xFF800000, 0xFF0000FF, 0xFF004000, 0xFF400040))";
Debug.ShouldStop(2);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_settextcolors",(Object)(RemoteObject.createNewArray("int",new int[] {5},new Object[] {main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"),BA.numberCast(int.class, 0xff800000),BA.numberCast(int.class, 0xff0000ff),BA.numberCast(int.class, 0xff004000),BA.numberCast(int.class, 0xff400040)})));
 BA.debugLineNum = 163;BA.debugLine="Table1.SetHeaderColors(Array As Int(Colors.Black, 0xFF800000, 0xFF0000FF, 0xFF004000, 0xFF400040))";
Debug.ShouldStop(4);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setheadercolors",(Object)(RemoteObject.createNewArray("int",new int[] {5},new Object[] {main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"),BA.numberCast(int.class, 0xff800000),BA.numberCast(int.class, 0xff0000ff),BA.numberCast(int.class, 0xff004000),BA.numberCast(int.class, 0xff400040)})));
 BA.debugLineNum = 164;BA.debugLine="Table1.SetHeaderTextColors(Array As Int(Colors.White, 0xFF98F5FF, 0xFFFFC0FF, 0xFFC0FFC0, 0xFFFFFFC0))";
Debug.ShouldStop(8);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_setheadertextcolors",(Object)(RemoteObject.createNewArray("int",new int[] {5},new Object[] {main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"),BA.numberCast(int.class, 0xff98f5ff),BA.numberCast(int.class, 0xffffc0ff),BA.numberCast(int.class, 0xffc0ffc0),BA.numberCast(int.class, 0xffffffc0)})));
 BA.debugLineNum = 166;BA.debugLine="Query = \"SELECT * FROM \" & DBTableName";
Debug.ShouldStop(32);
_query = RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM "),main._dbtablename);Debug.locals.put("Query", _query);
 BA.debugLineNum = 169;BA.debugLine="Table1.LoadSQLiteDB(SQL1, Query, True)";
Debug.ShouldStop(256);
main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_loadsqlitedb",(Object)(main._sql1),(Object)(_query),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
table.myClass = BA.getDeviceClass ("b4a.example.table");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 29;BA.debugLine="Dim Table1 As Table";
main.mostCurrent._table1 = RemoteObject.createNew ("b4a.example.table");
 //BA.debugLineNum = 30;BA.debugLine="Dim pnlTable As Panel";
main.mostCurrent._pnltable = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim btnDB, btnCVS, btnChangeHeaders As Button";
main.mostCurrent._btndb = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
main.mostCurrent._btncvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
main.mostCurrent._btnchangeheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Dim NewHeaders = True As Boolean";
main._newheaders = main.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim SQL1 As SQL";
main._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 19;BA.debugLine="Dim DBFileDir As String				: DBFileDir = File.DirDefaultExternal";
main._dbfiledir = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim DBFileDir As String				: DBFileDir = File.DirDefaultExternal";
main._dbfiledir = main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal");
 //BA.debugLineNum = 20;BA.debugLine="Dim DBFileName As String			: DBFileName = \"persons.db\"";
main._dbfilename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim DBFileName As String			: DBFileName = \"persons.db\"";
main._dbfilename = BA.ObjectToString("persons.db");
 //BA.debugLineNum = 21;BA.debugLine="Dim DBTableName As String			: DBTableName = \"persons\"";
main._dbtablename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Dim DBTableName As String			: DBTableName = \"persons\"";
main._dbtablename = BA.ObjectToString("persons");
 //BA.debugLineNum = 24;BA.debugLine="Dim SelectedID = -1 As Int";
main._selectedid = BA.numberCast(int.class, -(double) (0 + 1));
 //BA.debugLineNum = 25;BA.debugLine="Dim SelectedRow As Int";
main._selectedrow = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _table1_cellclick(RemoteObject _col,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("Table1_CellClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,105);
if (RapidSub.canDelegate("table1_cellclick")) return main.remoteMe.runUserSub(false, "main","table1_cellclick", _col, _row);
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 105;BA.debugLine="Sub Table1_CellClick (Col As Int, Row As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Activity.Title = Table1.GetValue(Col, Row)";
Debug.ShouldStop(512);
main.mostCurrent._activity.runMethod(false,"setTitle",(main.mostCurrent._table1.runClassMethod (b4a.example.table.class, "_getvalue",(Object)(_col),(Object)(_row))));
 BA.debugLineNum = 108;BA.debugLine="SelectedRow = Row";
Debug.ShouldStop(2048);
main._selectedrow = _row;
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _table1_headerclick(RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("Table1_HeaderClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,116);
if (RapidSub.canDelegate("table1_headerclick")) return main.remoteMe.runUserSub(false, "main","table1_headerclick", _col);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 116;BA.debugLine="Sub Table1_HeaderClick (Col As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Activity.Title = \"HeaderClick: \" & Col";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runMethod(false,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable("HeaderClick: "),_col)));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _table1_headerlongclick(RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("Table1_HeaderLongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,223);
if (RapidSub.canDelegate("table1_headerlongclick")) return main.remoteMe.runUserSub(false, "main","table1_headerlongclick", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 223;BA.debugLine="Sub Table1_HeaderLongClick(col As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="Msgbox(\"Header '\" & Table1.HeaderNames.Get(col) & \"' clicked\", \"Header\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Header '"),main.mostCurrent._table1.getFieldClass("b4a.example.table", false,"_headernames").runMethod(false,"Get",(Object)(_col)),RemoteObject.createImmutable("' clicked"))),(Object)(BA.ObjectToString("Header")),main.mostCurrent.activityBA);
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}