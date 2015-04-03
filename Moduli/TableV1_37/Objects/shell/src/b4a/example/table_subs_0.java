package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class table_subs_0 {


public static RemoteObject  _addrow(RemoteObject __ref,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("AddRow (table) ","table",1,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("addrow")) return __ref.runUserSub(false, "table","addrow", __ref, _values);
RemoteObject _lastrow = RemoteObject.createImmutable(0);
RemoteObject _changed = RemoteObject.createImmutable(false);
RemoteObject _extrawidth = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Values", _values);
 BA.debugLineNum = 418;BA.debugLine="Public Sub AddRow(Values() As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="If Values.Length <> NumberOfColumns Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_values.getField(true,"length"),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")))) { 
 BA.debugLineNum = 420;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length & \" col=\" & NumberOfColumns)";
Debug.ShouldStop(8);
table.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Wrong number of values ="),_values.getField(true,"length"),RemoteObject.createImmutable(" col="),__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"))));
 BA.debugLineNum = 421;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 423;BA.debugLine="Data.Add(Values)";
Debug.ShouldStop(64);
__ref.getFieldClass("b4a.example.table", false,"_data").runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 424;BA.debugLine="Dim lastRow As Int";
Debug.ShouldStop(128);
_lastrow = RemoteObject.createImmutable(0);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 425;BA.debugLine="lastRow = Data.Size - 1";
Debug.ShouldStop(256);
_lastrow = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 427;BA.debugLine="If cAutomaticWidths = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_cautomaticwidths"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 428;BA.debugLine="Dim changed = False As Boolean";
Debug.ShouldStop(2048);
_changed = table.__c.getField(true,"False");Debug.locals.put("changed", _changed);Debug.locals.put("changed", _changed);
 BA.debugLineNum = 429;BA.debugLine="Dim ExtraWidth, width As Int";
Debug.ShouldStop(4096);
_extrawidth = RemoteObject.createImmutable(0);Debug.locals.put("ExtraWidth", _extrawidth);
_width = RemoteObject.createImmutable(0);Debug.locals.put("width", _width);
 BA.debugLineNum = 430;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
Debug.ShouldStop(8192);
_extrawidth = RemoteObject.solve(new RemoteObject[] {table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "+",1, 1);Debug.locals.put("ExtraWidth", _extrawidth);
 BA.debugLineNum = 431;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(16384);
{
final int step260 = 1;
final int limit260 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step260 > 0 && _i <= limit260) || (step260 < 0 && _i >= limit260); _i = ((int)(0 + _i + step260))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 432;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_multitypeface"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 434;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTypeFace, cTextSize) + ExtraWidth";
Debug.ShouldStop(131072);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)((__ref.getFieldClass("b4a.example.table", false,"_ctypeface").getObject())),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),_extrawidth}, "+",1, 0));Debug.locals.put("width", _width);
 }else {
 BA.debugLineNum = 436;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTypeFaces(i), cTextSize) + ExtraWidth";
Debug.ShouldStop(524288);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)((__ref.getFieldClass("b4a.example.table", false,"_ctypefaces").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),_extrawidth}, "+",1, 0));Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 438;BA.debugLine="If ColumnWidths(i) < width Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(double.class, _width))) { 
 BA.debugLineNum = 439;BA.debugLine="ColumnWidths(i) = width";
Debug.ShouldStop(4194304);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 440;BA.debugLine="SavedWidths(i) = width";
Debug.ShouldStop(8388608);
__ref.getFieldClass("b4a.example.table", false,"_savedwidths").setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 441;BA.debugLine="HeaderWidths(i) = width";
Debug.ShouldStop(16777216);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 442;BA.debugLine="DataWidths(i) = width";
Debug.ShouldStop(33554432);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 443;BA.debugLine="changed = True";
Debug.ShouldStop(67108864);
_changed = table.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 446;BA.debugLine="If changed = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_changed,table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 447;BA.debugLine="refreshTable";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.table.class, "_refreshtable");
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 452;BA.debugLine="If lastRow < (SV.VerticalScrollPosition + SV.Height) / cRowHeight + 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_lastrow,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition"),__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight")}, "+",1, 1)),__ref.getFieldClass("b4a.example.table", true,"_crowheight"),RemoteObject.createImmutable(1)}, "/+",1, 0))) { 
 BA.debugLineNum = 453;BA.debugLine="ShowRow(lastRow)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(_lastrow));
 };
 BA.debugLineNum = 455;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(64);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1));
 BA.debugLineNum = 456;BA.debugLine="updateIPLocation";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.table.class, "_updateiplocation");
 BA.debugLineNum = 457;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill=True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean(".",__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_enablestatuslineautofill"),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.table.class, "_setstatusline",(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addrowautomaticwidth(RemoteObject __ref,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("AddRowAutomaticWidth (table) ","table",1,__ref.getField(false, "ba"),__ref,462);
if (RapidSub.canDelegate("addrowautomaticwidth")) return __ref.runUserSub(false, "table","addrowautomaticwidth", __ref, _values);
RemoteObject _lastrow = RemoteObject.createImmutable(0);
RemoteObject _changed = RemoteObject.createImmutable(false);
RemoteObject _extrawidth = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Values", _values);
 BA.debugLineNum = 462;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 463;BA.debugLine="If Values.Length <> NumberOfColumns Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_values.getField(true,"length"),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")))) { 
 BA.debugLineNum = 464;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length & \" col=\" & NumberOfColumns)";
Debug.ShouldStop(32768);
table.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Wrong number of values ="),_values.getField(true,"length"),RemoteObject.createImmutable(" col="),__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"))));
 BA.debugLineNum = 465;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 467;BA.debugLine="Data.Add(Values)";
Debug.ShouldStop(262144);
__ref.getFieldClass("b4a.example.table", false,"_data").runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 468;BA.debugLine="Dim lastRow As Int";
Debug.ShouldStop(524288);
_lastrow = RemoteObject.createImmutable(0);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 469;BA.debugLine="lastRow = Data.Size - 1";
Debug.ShouldStop(1048576);
_lastrow = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 471;BA.debugLine="Dim changed = False As Boolean";
Debug.ShouldStop(4194304);
_changed = table.__c.getField(true,"False");Debug.locals.put("changed", _changed);Debug.locals.put("changed", _changed);
 BA.debugLineNum = 472;BA.debugLine="Dim ExtraWidth, width As Int";
Debug.ShouldStop(8388608);
_extrawidth = RemoteObject.createImmutable(0);Debug.locals.put("ExtraWidth", _extrawidth);
_width = RemoteObject.createImmutable(0);Debug.locals.put("width", _width);
 BA.debugLineNum = 473;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
Debug.ShouldStop(16777216);
_extrawidth = RemoteObject.solve(new RemoteObject[] {table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "+",1, 1);Debug.locals.put("ExtraWidth", _extrawidth);
 BA.debugLineNum = 474;BA.debugLine="For I = 0 To NumberOfColumns - 1";
Debug.ShouldStop(33554432);
{
final int step296 = 1;
final int limit296 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step296 > 0 && _i <= limit296) || (step296 < 0 && _i >= limit296); _i = ((int)(0 + _i + step296))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 475;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_multitypeface"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 477;BA.debugLine="width = cvs.MeasureStringWidth(Values(I), cTypeFace, cTextSize) + ExtraWidth";
Debug.ShouldStop(268435456);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)((__ref.getFieldClass("b4a.example.table", false,"_ctypeface").getObject())),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),_extrawidth}, "+",1, 0));Debug.locals.put("width", _width);
 }else {
 BA.debugLineNum = 479;BA.debugLine="width = cvs.MeasureStringWidth(Values(I), cTypeFaces(I), cTextSize) + ExtraWidth";
Debug.ShouldStop(1073741824);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)((__ref.getFieldClass("b4a.example.table", false,"_ctypefaces").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),_extrawidth}, "+",1, 0));Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 481;BA.debugLine="If ColumnWidths(I) < width Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(double.class, _width))) { 
 BA.debugLineNum = 482;BA.debugLine="ColumnWidths(I) = width";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 483;BA.debugLine="SavedWidths(I) = width";
Debug.ShouldStop(4);
__ref.getFieldClass("b4a.example.table", false,"_savedwidths").setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 484;BA.debugLine="HeaderWidths(I) = width";
Debug.ShouldStop(8);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 485;BA.debugLine="DataWidths(I) = width";
Debug.ShouldStop(16);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (_width,BA.numberCast(int.class, _i));
 BA.debugLineNum = 486;BA.debugLine="changed = True";
Debug.ShouldStop(32);
_changed = table.__c.getField(true,"True");Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 489;BA.debugLine="If changed = True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_changed,table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 490;BA.debugLine="refreshTable";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.table.class, "_refreshtable");
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 494;BA.debugLine="If lastRow < (SV.VerticalScrollPosition + SV.Height) / cRowHeight + 1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("<",_lastrow,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition"),__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight")}, "+",1, 1)),__ref.getFieldClass("b4a.example.table", true,"_crowheight"),RemoteObject.createImmutable(1)}, "/+",1, 0))) { 
 BA.debugLineNum = 495;BA.debugLine="ShowRow(lastRow)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(_lastrow));
 };
 BA.debugLineNum = 497;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(65536);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1));
 BA.debugLineNum = 498;BA.debugLine="updateIPLocation";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.table.class, "_updateiplocation");
 BA.debugLineNum = 499;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill=True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean(".",__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_enablestatuslineautofill"),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.table.class, "_setstatusline",(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 500;BA.debugLine="End Sub";
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
public static RemoteObject  _addtoactivity(RemoteObject __ref,RemoteObject _act,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddToActivity (table) ","table",1,__ref.getField(false, "ba"),__ref,376);
if (RapidSub.canDelegate("addtoactivity")) return __ref.runUserSub(false, "table","addtoactivity", __ref, _act, _left, _top, _width, _height);
int _i = 0;
Debug.locals.put("Act", _act);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 376;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As Int, Top As Int, Width As Int, Height As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 377;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")));
 BA.debugLineNum = 379;BA.debugLine="SV.Panel.Color = cTableColor";
Debug.ShouldStop(67108864);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runVoidMethod ("setColor",__ref.getFieldClass("b4a.example.table", true,"_ctablecolor"));
 BA.debugLineNum = 380;BA.debugLine="IsVisible = True";
Debug.ShouldStop(134217728);
__ref.setFieldClass("b4a.example.table", "_isvisible",table.__c.getField(true,"True"));
 BA.debugLineNum = 381;BA.debugLine="Header.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_header").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 382;BA.debugLine="pnlTable.Initialize(\"\")";
Debug.ShouldStop(536870912);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 383;BA.debugLine="Header.Color = cTableColor";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("b4a.example.table", false,"_header").runVoidMethod ("setColor",__ref.getFieldClass("b4a.example.table", true,"_ctablecolor"));
 BA.debugLineNum = 384;BA.debugLine="Act.AddView(pnlTable, Left, Top , Width, Height)";
Debug.ShouldStop(-2147483648);
_act.runVoidMethod ("AddView",(Object)((__ref.getFieldClass("b4a.example.table", false,"_pnltable").getObject())),(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 385;BA.debugLine="pnlTable.AddView(Header, 0, 0 , Width, cHeaderHeight)";
Debug.ShouldStop(1);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("b4a.example.table", false,"_header").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(__ref.getFieldClass("b4a.example.table", true,"_cheaderheight")));
 BA.debugLineNum = 388;BA.debugLine="lblStatusLine.Initialize(\"\")";
Debug.ShouldStop(8);
__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 389;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it really ?";
Debug.ShouldStop(16);
__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runVoidMethod ("setColor",table.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 390;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO uncomment this";
Debug.ShouldStop(32);
__ref.getFieldClass("b4a.example.table", false,"_internalpanel").runVoidMethod ("setColor",table.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 391;BA.debugLine="If (showStatusLine = True) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_showstatusline"),table.__c.getField(true,"True")))) { 
 BA.debugLineNum = 392;BA.debugLine="pnlTable.AddView(SV, 0, Header.Height, Width, Height - Header.Height - cRowHeight)";
Debug.ShouldStop(128);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("b4a.example.table", false,"_sv").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getHeight")),(Object)(_width),(Object)(RemoteObject.solve(new RemoteObject[] {_height,__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getHeight"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "--",2, 1)));
 BA.debugLineNum = 393;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV.Top + SV.Height, Width, cRowHeight)";
Debug.ShouldStop(256);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getTop"),__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(_width),(Object)(__ref.getFieldClass("b4a.example.table", true,"_crowheight")));
 }else {
 BA.debugLineNum = 395;BA.debugLine="pnlTable.AddView(SV, 0, Header.Height, Width, Height - Header.Height)";
Debug.ShouldStop(1024);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("b4a.example.table", false,"_sv").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getHeight")),(Object)(_width),(Object)(RemoteObject.solve(new RemoteObject[] {_height,__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getHeight")}, "-",1, 1)));
 BA.debugLineNum = 396;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV.Top + SV.Height, 0, 0)";
Debug.ShouldStop(2048);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getTop"),__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 398;BA.debugLine="pnlTable.AddView(internalPanel,0,0,Width,0)";
Debug.ShouldStop(8192);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("b4a.example.table", false,"_internalpanel").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 399;BA.debugLine="updateIPLocation";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.table.class, "_updateiplocation");
 BA.debugLineNum = 401;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
Debug.ShouldStop(65536);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_columnwidths",table._columnwidths);
 BA.debugLineNum = 402;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
Debug.ShouldStop(131072);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_headerwidths",table._headerwidths);
 BA.debugLineNum = 403;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
Debug.ShouldStop(262144);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_datawidths",table._datawidths);
 BA.debugLineNum = 404;BA.debugLine="Dim SavedWidths(NumberOfColumns) As Int";
Debug.ShouldStop(524288);
table._savedwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_savedwidths",table._savedwidths);
 BA.debugLineNum = 405;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(1048576);
{
final int step239 = 1;
final int limit239 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step239 > 0 && _i <= limit239) || (step239 < 0 && _i >= limit239); _i = ((int)(0 + _i + step239))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 406;BA.debugLine="ColumnWidths(i) = SV.Width / NumberOfColumns";
Debug.ShouldStop(2097152);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getWidth"),__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")}, "/",0, 0)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 407;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(4194304);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 408;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(8388608);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 409;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(16777216);
__ref.getFieldClass("b4a.example.table", false,"_savedwidths").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 412;BA.debugLine="SV_ScrollChanged(0, 0)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.table.class, "_sv_scrollchanged",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 413;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill=True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean(".",__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_enablestatuslineautofill"),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.table.class, "_setstatusline",(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtoview(RemoteObject __ref,RemoteObject _v,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddToView (table) ","table",1,__ref.getField(false, "ba"),__ref,372);
if (RapidSub.canDelegate("addtoview")) return __ref.runUserSub(false, "table","addtoview", __ref, _v, _left, _top, _width, _height);
Debug.locals.put("v", _v);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 372;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top As Int, Width As Int, Height As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 373;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.table.class, "_addtoactivity",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), _v.getObject()),(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 374;BA.debugLine="End Sub";
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
public static RemoteObject  _cell_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Cell_Click (table) ","table",1,__ref.getField(false, "ba"),__ref,699);
if (RapidSub.canDelegate("cell_click")) return __ref.runUserSub(false, "table","cell_click", __ref);
RemoteObject _rc = RemoteObject.declareNull("b4a.example.table._rowcol");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 699;BA.debugLine="Private Sub Cell_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 700;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(134217728);
_rc = RemoteObject.createNew ("b4a.example.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 701;BA.debugLine="Dim L As Label";
Debug.ShouldStop(268435456);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 702;BA.debugLine="L = Sender";
Debug.ShouldStop(536870912);
_l.setObject(table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 703;BA.debugLine="rc = L.Tag";
Debug.ShouldStop(1073741824);
_rc = (_l.runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 705;BA.debugLine="SelectRow(rc)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.table.class, "_selectrow",(Object)(_rc));
 BA.debugLineNum = 706;BA.debugLine="If SubExists(Callback, Event & \"_CellClick\") Then";
Debug.ShouldStop(2);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_CellClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 707;BA.debugLine="CallSub3(Callback, Event & \"_CellClick\", rc.Col, rc.Row)";
Debug.ShouldStop(4);
table.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_CellClick"))),(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Col"))),(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row"))));
 };
 BA.debugLineNum = 709;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cell_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Cell_LongClick (table) ","table",1,__ref.getField(false, "ba"),__ref,676);
if (RapidSub.canDelegate("cell_longclick")) return __ref.runUserSub(false, "table","cell_longclick", __ref);
RemoteObject _rc = RemoteObject.declareNull("b4a.example.table._rowcol");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 676;BA.debugLine="Private Sub Cell_LongClick";
Debug.ShouldStop(8);
 BA.debugLineNum = 678;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(32);
_rc = RemoteObject.createNew ("b4a.example.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 679;BA.debugLine="Dim L As Label";
Debug.ShouldStop(64);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 680;BA.debugLine="L = Sender";
Debug.ShouldStop(128);
_l.setObject(table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 681;BA.debugLine="rc = L.Tag";
Debug.ShouldStop(256);
_rc = (_l.runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 683;BA.debugLine="If SubExists(Callback, Event & \"_CellLongClick\") Then";
Debug.ShouldStop(1024);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_CellLongClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 684;BA.debugLine="CallSub3(Callback, Event & \"_CellLongClick\", rc.Col, rc.Row)";
Debug.ShouldStop(2048);
table.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_CellLongClick"))),(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Col"))),(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row"))));
 };
 BA.debugLineNum = 686;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 107;BA.debugLine="Private StringUtils1 As StringUtils";
table._stringutils1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setFieldClass("b4a.example.table","_stringutils1",table._stringutils1);
 //BA.debugLineNum = 108;BA.debugLine="Private SV As ScrollView2D";
table._sv = RemoteObject.createNew ("flm.b4a.scrollview2d.ScrollView2DWrapper");__ref.setFieldClass("b4a.example.table","_sv",table._sv);
 //BA.debugLineNum = 109;BA.debugLine="Private pnlTable As Panel";
table._pnltable = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("b4a.example.table","_pnltable",table._pnltable);
 //BA.debugLineNum = 110;BA.debugLine="Private Header As Panel";
table._header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("b4a.example.table","_header",table._header);
 //BA.debugLineNum = 111;BA.debugLine="Private lblStatusLine As Label";
table._lblstatusline = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setFieldClass("b4a.example.table","_lblstatusline",table._lblstatusline);
 //BA.debugLineNum = 112;BA.debugLine="Private Callback As Object";
table._callback = RemoteObject.createNew ("Object");__ref.setFieldClass("b4a.example.table","_callback",table._callback);
 //BA.debugLineNum = 113;BA.debugLine="Private Event As String";
table._event = RemoteObject.createImmutable("");__ref.setFieldClass("b4a.example.table","_event",table._event);
 //BA.debugLineNum = 114;BA.debugLine="Public HeaderNames As List";
table._headernames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setFieldClass("b4a.example.table","_headernames",table._headernames);
 //BA.debugLineNum = 115;BA.debugLine="Public SelectedRows As List ' selected rows ' convert to map!!!";
table._selectedrows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setFieldClass("b4a.example.table","_selectedrows",table._selectedrows);
 //BA.debugLineNum = 116;BA.debugLine="Private SelectedCol As Int";
table._selectedcol = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_selectedcol",table._selectedcol);
 //BA.debugLineNum = 117;BA.debugLine="Private Data As List";
table._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setFieldClass("b4a.example.table","_data",table._data);
 //BA.debugLineNum = 118;BA.debugLine="Private LabelsCache As List";
table._labelscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setFieldClass("b4a.example.table","_labelscache",table._labelscache);
 //BA.debugLineNum = 119;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
table._minvisiblerow = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_minvisiblerow",table._minvisiblerow);
table._maxvisiblerow = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_maxvisiblerow",table._maxvisiblerow);
 //BA.debugLineNum = 120;BA.debugLine="Private IsVisible As Boolean";
table._isvisible = RemoteObject.createImmutable(false);__ref.setFieldClass("b4a.example.table","_isvisible",table._isvisible);
 //BA.debugLineNum = 121;BA.debugLine="Public visibleRows As Map";
table._visiblerows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setFieldClass("b4a.example.table","_visiblerows",table._visiblerows);
 //BA.debugLineNum = 122;BA.debugLine="Private NumberOfColumns, ColumnWidths(), cColumnColors(), cTextColors(), cHeaderColors(), cHeaderTextColors(), DataWidths(), HeaderWidths() As Int";
table._numberofcolumns = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_numberofcolumns",table._numberofcolumns);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_columnwidths",table._columnwidths);
table._ccolumncolors = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_ccolumncolors",table._ccolumncolors);
table._ctextcolors = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_ctextcolors",table._ctextcolors);
table._cheadercolors = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_cheadercolors",table._cheadercolors);
table._cheadertextcolors = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_cheadertextcolors",table._cheadertextcolors);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_datawidths",table._datawidths);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_headerwidths",table._headerwidths);
 //BA.debugLineNum = 123;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cTextColor, cHeaderHeight, cHeaderTextColor As Int";
table._crowheight = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_crowheight",table._crowheight);
table._cheadercolor = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_cheadercolor",table._cheadercolor);
table._ctablecolor = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_ctablecolor",table._ctablecolor);
table._ctextcolor = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_ctextcolor",table._ctextcolor);
table._cheaderheight = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_cheaderheight",table._cheaderheight);
table._cheadertextcolor = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_cheadertextcolor",table._cheadertextcolor);
 //BA.debugLineNum = 124;BA.debugLine="Private cAutomaticWidths = False As Boolean";
table._cautomaticwidths = table.__c.getField(true,"False");__ref.setFieldClass("b4a.example.table","_cautomaticwidths",table._cautomaticwidths);
 //BA.debugLineNum = 125;BA.debugLine="Private cTextSize As Float";
table._ctextsize = RemoteObject.createImmutable(0f);__ref.setFieldClass("b4a.example.table","_ctextsize",table._ctextsize);
 //BA.debugLineNum = 126;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
 //BA.debugLineNum = 127;BA.debugLine="Private cAlignment As Int";
table._calignment = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_calignment",table._calignment);
 //BA.debugLineNum = 128;BA.debugLine="Private cAlignments() As Int";
table._calignments = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_calignments",table._calignments);
 //BA.debugLineNum = 129;BA.debugLine="Private cAlignments0() As Int";
table._calignments0 = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_calignments0",table._calignments0);
 //BA.debugLineNum = 130;BA.debugLine="Private MultiAlignments = False As Boolean";
table._multialignments = table.__c.getField(true,"False");__ref.setFieldClass("b4a.example.table","_multialignments",table._multialignments);
 //BA.debugLineNum = 131;BA.debugLine="Private MultiTypeFace = False As Boolean";
table._multitypeface = table.__c.getField(true,"False");__ref.setFieldClass("b4a.example.table","_multitypeface",table._multitypeface);
 //BA.debugLineNum = 132;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
table._ctypeface = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
table._ctypeface.setObject(table.__c.getField(false,"Typeface").getField(false,"DEFAULT"));__ref.setFieldClass("b4a.example.table","_ctypeface",table._ctypeface);
 //BA.debugLineNum = 133;BA.debugLine="Private cTypeFaces() As Typeface";
table._ctypefaces = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_ctypefaces",table._ctypefaces);
 //BA.debugLineNum = 134;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
table._clinewidth = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))))));__ref.setFieldClass("b4a.example.table","_clinewidth",table._clinewidth);
 //BA.debugLineNum = 135;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable2() As Object";
table._selecteddrawable = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_selecteddrawable",table._selecteddrawable);
table._drawable1 = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_drawable1",table._drawable1);
table._drawable2 = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_drawable2",table._drawable2);
 //BA.debugLineNum = 136;BA.debugLine="Private SelectedCellDrawable As Object";
table._selectedcelldrawable = RemoteObject.createNew ("Object");__ref.setFieldClass("b4a.example.table","_selectedcelldrawable",table._selectedcelldrawable);
 //BA.debugLineNum = 137;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor, cSelectedCellColor As Int";
table._crowcolor1 = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_crowcolor1",table._crowcolor1);
table._crowcolor2 = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_crowcolor2",table._crowcolor2);
table._cselectedrowcolor = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_cselectedrowcolor",table._cselectedrowcolor);
table._cselectedcellcolor = RemoteObject.createImmutable(0);__ref.setFieldClass("b4a.example.table","_cselectedcellcolor",table._cselectedcellcolor);
 //BA.debugLineNum = 138;BA.debugLine="Private cSortColumn = True As Boolean";
table._csortcolumn = table.__c.getField(true,"True");__ref.setFieldClass("b4a.example.table","_csortcolumn",table._csortcolumn);
 //BA.debugLineNum = 139;BA.debugLine="Private cUseColumnColors = False As Boolean";
table._cusecolumncolors = table.__c.getField(true,"False");__ref.setFieldClass("b4a.example.table","_cusecolumncolors",table._cusecolumncolors);
 //BA.debugLineNum = 141;BA.debugLine="Private bmp As Bitmap		' used for the canvas below";
table._bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setFieldClass("b4a.example.table","_bmp",table._bmp);
 //BA.debugLineNum = 142;BA.debugLine="Private cvs As Canvas		' used to measure string widths in the LoadSQLiteDB routine";
table._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setFieldClass("b4a.example.table","_cvs",table._cvs);
 //BA.debugLineNum = 145;BA.debugLine="cHeaderColor = Colors.Gray";
__ref.setFieldClass("b4a.example.table", "_cheadercolor",table.__c.getField(false,"Colors").getField(true,"Gray"));
 //BA.debugLineNum = 146;BA.debugLine="cTableColor = Colors.LightGray";
__ref.setFieldClass("b4a.example.table", "_ctablecolor",table.__c.getField(false,"Colors").getField(true,"LightGray"));
 //BA.debugLineNum = 147;BA.debugLine="cTextColor = Colors.Black";
__ref.setFieldClass("b4a.example.table", "_ctextcolor",table.__c.getField(false,"Colors").getField(true,"Black"));
 //BA.debugLineNum = 148;BA.debugLine="cHeaderTextColor = Colors.White";
__ref.setFieldClass("b4a.example.table", "_cheadertextcolor",table.__c.getField(false,"Colors").getField(true,"White"));
 //BA.debugLineNum = 149;BA.debugLine="cTextSize = 14";
__ref.setFieldClass("b4a.example.table", "_ctextsize",BA.numberCast(float.class, 14));
 //BA.debugLineNum = 150;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LEFT or Gravity.RIGHT for other alignments.";
__ref.setFieldClass("b4a.example.table", "_calignment",table.__c.getField(false,"Gravity").getField(true,"CENTER"));
 //BA.debugLineNum = 151;BA.debugLine="cRowColor1 = Colors.White";
__ref.setFieldClass("b4a.example.table", "_crowcolor1",table.__c.getField(false,"Colors").getField(true,"White"));
 //BA.debugLineNum = 152;BA.debugLine="cRowColor2 = 0xFF98F5FF";
__ref.setFieldClass("b4a.example.table", "_crowcolor2",BA.numberCast(int.class, 0xff98f5ff));
 //BA.debugLineNum = 153;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
__ref.setFieldClass("b4a.example.table", "_cselectedrowcolor",BA.numberCast(int.class, 0xff007fff));
 //BA.debugLineNum = 154;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
__ref.setFieldClass("b4a.example.table", "_cselectedcellcolor",BA.numberCast(int.class, 0xfffc8eac));
 //BA.debugLineNum = 155;BA.debugLine="cRowHeight = 40dip";
__ref.setFieldClass("b4a.example.table", "_crowheight",table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 //BA.debugLineNum = 156;BA.debugLine="cHeaderHeight = cRowHeight";
__ref.setFieldClass("b4a.example.table", "_cheaderheight",__ref.getFieldClass("b4a.example.table", true,"_crowheight"));
 //BA.debugLineNum = 158;BA.debugLine="Private cSingleLine = True As Boolean		' does a lable hold a single line text or multiline , need to be set rigth after call to initialize";
table._csingleline = table.__c.getField(true,"True");__ref.setFieldClass("b4a.example.table","_csingleline",table._csingleline);
 //BA.debugLineNum = 160;BA.debugLine="Private IsMultiSelect As Boolean = False";
table._ismultiselect = table.__c.getField(true,"False");__ref.setFieldClass("b4a.example.table","_ismultiselect",table._ismultiselect);
 //BA.debugLineNum = 161;BA.debugLine="Private cAllowSelection = True As Boolean";
table._callowselection = table.__c.getField(true,"True");__ref.setFieldClass("b4a.example.table","_callowselection",table._callowselection);
 //BA.debugLineNum = 162;BA.debugLine="Private SavedWidths() As Int' to keep the user set widths for columns";
table._savedwidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("b4a.example.table","_savedwidths",table._savedwidths);
 //BA.debugLineNum = 163;BA.debugLine="Private showStatusLine As Boolean =True";
table._showstatusline = table.__c.getField(true,"True");__ref.setFieldClass("b4a.example.table","_showstatusline",table._showstatusline);
 //BA.debugLineNum = 165;BA.debugLine="Private internalPanel As Panel";
table._internalpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("b4a.example.table","_internalpanel",table._internalpanel);
 //BA.debugLineNum = 167;BA.debugLine="Private sortingDir As Int = 0 ' -1,0,1 as acc, unsorted, dec";
table._sortingdir = BA.numberCast(int.class, 0);__ref.setFieldClass("b4a.example.table","_sortingdir",table._sortingdir);
 //BA.debugLineNum = 168;BA.debugLine="Private sortedCol As Int = -1' hold the sorted column -1 for none";
table._sortedcol = BA.numberCast(int.class, -(double) (0 + 1));__ref.setFieldClass("b4a.example.table","_sortedcol",table._sortedcol);
 //BA.debugLineNum = 169;BA.debugLine="Private sortingView As Panel";
table._sortingview = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("b4a.example.table","_sortingview",table._sortingview);
 //BA.debugLineNum = 171;BA.debugLine="Dim debug_counter As Long";
table._debug_counter = RemoteObject.createImmutable(0L);__ref.setFieldClass("b4a.example.table","_debug_counter",table._debug_counter);
 //BA.debugLineNum = 172;BA.debugLine="Private enableStatusLineAutoFill As Boolean = True";
table._enablestatuslineautofill = table.__c.getField(true,"True");__ref.setFieldClass("b4a.example.table","_enablestatuslineautofill",table._enablestatuslineautofill);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearAll (table) ","table",1,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("clearall")) return __ref.runUserSub(false, "table","clearall", __ref);
 BA.debugLineNum = 209;BA.debugLine="Public Sub ClearAll";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")));
 BA.debugLineNum = 211;BA.debugLine="updateIPLocation";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.table.class, "_updateiplocation");
 BA.debugLineNum = 212;BA.debugLine="End Sub";
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
public static RemoteObject  _clearselection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("clearSelection (table) ","table",1,__ref.getField(false, "ba"),__ref,1047);
if (RapidSub.canDelegate("clearselection")) return __ref.runUserSub(false, "table","clearselection", __ref);
 BA.debugLineNum = 1047;BA.debugLine="Public Sub clearSelection";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1049;BA.debugLine="SelectedRows.Clear";
Debug.ShouldStop(16777216);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("Clear");
 BA.debugLineNum = 1050;BA.debugLine="refreshTable";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.table.class, "_refreshtable");
 BA.debugLineNum = 1051;BA.debugLine="End Sub";
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
public static RemoteObject  _createnewlabels(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateNewLabels (table) ","table",1,__ref.getField(false, "ba"),__ref,575);
if (RapidSub.canDelegate("createnewlabels")) return __ref.runUserSub(false, "table","createnewlabels", __ref);
RemoteObject _lbls = null;
int _i = 0;
RemoteObject _rc = RemoteObject.declareNull("b4a.example.table._rowcol");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _ref = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 575;BA.debugLine="Private Sub CreateNewLabels As Label()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 576;BA.debugLine="Dim lbls(NumberOfColumns) As Label";
Debug.ShouldStop(-2147483648);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 577;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(1);
{
final int step385 = 1;
final int limit385 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step385 > 0 && _i <= limit385) || (step385 < 0 && _i >= limit385); _i = ((int)(0 + _i + step385))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 578;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(2);
_rc = RemoteObject.createNew ("b4a.example.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 579;BA.debugLine="rc.Col = i";
Debug.ShouldStop(4);
_rc.setFieldClass("b4a.example.table._rowcol", "Col",BA.numberCast(int.class, _i));
 BA.debugLineNum = 580;BA.debugLine="Dim L As Label";
Debug.ShouldStop(8);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 581;BA.debugLine="L.Initialize(\"Cell\")";
Debug.ShouldStop(16);
_l.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Cell")));
 BA.debugLineNum = 582;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_multialignments"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 583;BA.debugLine="L.Gravity = cAlignment";
Debug.ShouldStop(64);
_l.runMethod(true,"setGravity",__ref.getFieldClass("b4a.example.table", true,"_calignment"));
 }else {
 BA.debugLineNum = 585;BA.debugLine="L.Gravity = cAlignments(i)";
Debug.ShouldStop(256);
_l.runMethod(true,"setGravity",__ref.getFieldClass("b4a.example.table", false,"_calignments").getArrayElement(true,BA.numberCast(int.class, _i)));
 };
 BA.debugLineNum = 587;BA.debugLine="L.TextSize = cTextSize";
Debug.ShouldStop(1024);
_l.runMethod(true,"setTextSize",__ref.getFieldClass("b4a.example.table", true,"_ctextsize"));
 BA.debugLineNum = 589;BA.debugLine="If cUseColumnColors = False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_cusecolumncolors"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 590;BA.debugLine="L.TextColor = cTextColor";
Debug.ShouldStop(8192);
_l.runMethod(true,"setTextColor",__ref.getFieldClass("b4a.example.table", true,"_ctextcolor"));
 }else {
 BA.debugLineNum = 592;BA.debugLine="L.TextColor = cTextColors(i)";
Debug.ShouldStop(32768);
_l.runMethod(true,"setTextColor",__ref.getFieldClass("b4a.example.table", false,"_ctextcolors").getArrayElement(true,BA.numberCast(int.class, _i)));
 };
 BA.debugLineNum = 595;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_multitypeface"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 596;BA.debugLine="L.Typeface = cTypeFace";
Debug.ShouldStop(524288);
_l.runMethod(false,"setTypeface",(__ref.getFieldClass("b4a.example.table", false,"_ctypeface").getObject()));
 }else {
 BA.debugLineNum = 598;BA.debugLine="L.Typeface = cTypeFaces(i)";
Debug.ShouldStop(2097152);
_l.runMethod(false,"setTypeface",(__ref.getFieldClass("b4a.example.table", false,"_ctypefaces").getArrayElement(false,BA.numberCast(int.class, _i)).getObject()));
 };
 BA.debugLineNum = 601;BA.debugLine="If cSingleLine Then";
Debug.ShouldStop(16777216);
if (__ref.getFieldClass("b4a.example.table", true,"_csingleline").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 602;BA.debugLine="Dim ref As Reflector";
Debug.ShouldStop(33554432);
_ref = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("ref", _ref);
 BA.debugLineNum = 603;BA.debugLine="ref.Target = L";
Debug.ShouldStop(67108864);
_ref.setField ("Target",(_l.getObject()));
 BA.debugLineNum = 604;BA.debugLine="ref.RunMethod2(\"setSingleLine\", True, \"java.lang.boolean\")";
Debug.ShouldStop(134217728);
_ref.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setSingleLine")),(Object)(BA.ObjectToString(table.__c.getField(true,"True"))),(Object)(BA.ObjectToString("java.lang.boolean")));
 };
 BA.debugLineNum = 606;BA.debugLine="L.Tag = rc";
Debug.ShouldStop(536870912);
_l.runMethod(false,"setTag",(_rc));
 BA.debugLineNum = 607;BA.debugLine="lbls(i) = L";
Debug.ShouldStop(1073741824);
_lbls.setArrayElement (_l,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 609;BA.debugLine="Return lbls";
Debug.ShouldStop(1);
if (true) return _lbls;
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getallowselection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAllowSelection (table) ","table",1,__ref.getField(false, "ba"),__ref,1075);
if (RapidSub.canDelegate("getallowselection")) return __ref.runUserSub(false, "table","getallowselection", __ref);
 BA.debugLineNum = 1075;BA.debugLine="Public Sub getAllowSelection As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1076;BA.debugLine="Return cAllowSelection";
Debug.ShouldStop(524288);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_callowselection");
 BA.debugLineNum = 1077;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcellalignment(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCellAlignment (table) ","table",1,__ref.getField(false, "ba"),__ref,1441);
if (RapidSub.canDelegate("getcellalignment")) return __ref.runUserSub(false, "table","getcellalignment", __ref);
 BA.debugLineNum = 1441;BA.debugLine="Public Sub getCellAlignment As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 1442;BA.debugLine="Return cAlignment";
Debug.ShouldStop(2);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_calignment");
 BA.debugLineNum = 1443;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumncolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetColumnColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1721);
if (RapidSub.canDelegate("getcolumncolors")) return __ref.runUserSub(false, "table","getcolumncolors", __ref);
 BA.debugLineNum = 1721;BA.debugLine="Public Sub GetColumnColors As Int()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1722;BA.debugLine="Return cColumnColors";
Debug.ShouldStop(33554432);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_ccolumncolors");
 BA.debugLineNum = 1723;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumnwidths(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetColumnWidths (table) ","table",1,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("getcolumnwidths")) return __ref.runUserSub(false, "table","getcolumnwidths", __ref);
 BA.debugLineNum = 261;BA.debugLine="Public Sub GetColumnWidths As Int()";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="Return SavedWidths";
Debug.ShouldStop(32);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_savedwidths");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadercolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1459);
if (RapidSub.canDelegate("getheadercolor")) return __ref.runUserSub(false, "table","getheadercolor", __ref);
 BA.debugLineNum = 1459;BA.debugLine="Public Sub getHeaderColor As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1460;BA.debugLine="Return cHeaderColor";
Debug.ShouldStop(524288);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_cheadercolor");
 BA.debugLineNum = 1461;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadercolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetHeaderColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1739);
if (RapidSub.canDelegate("getheadercolors")) return __ref.runUserSub(false, "table","getheadercolors", __ref);
 BA.debugLineNum = 1739;BA.debugLine="Public Sub GetHeaderColors As Int()";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1740;BA.debugLine="Return cHeaderColors";
Debug.ShouldStop(2048);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_cheadercolors");
 BA.debugLineNum = 1741;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheaderheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderHeight (table) ","table",1,__ref.getField(false, "ba"),__ref,1450);
if (RapidSub.canDelegate("getheaderheight")) return __ref.runUserSub(false, "table","getheaderheight", __ref);
 BA.debugLineNum = 1450;BA.debugLine="Public Sub getHeaderHeight As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 1451;BA.debugLine="Return cHeaderHeight";
Debug.ShouldStop(1024);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_cheaderheight");
 BA.debugLineNum = 1452;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheaderpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderPanel (table) ","table",1,__ref.getField(false, "ba"),__ref,1089);
if (RapidSub.canDelegate("getheaderpanel")) return __ref.runUserSub(false, "table","getheaderpanel", __ref);
 BA.debugLineNum = 1089;BA.debugLine="Public Sub getHeaderPanel As Panel";
Debug.ShouldStop(1);
 BA.debugLineNum = 1090;BA.debugLine="Return Header";
Debug.ShouldStop(2);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_header");
 BA.debugLineNum = 1091;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadertextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderTextColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1468);
if (RapidSub.canDelegate("getheadertextcolor")) return __ref.runUserSub(false, "table","getheadertextcolor", __ref);
 BA.debugLineNum = 1468;BA.debugLine="Public Sub getHeaderTextColor As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1469;BA.debugLine="Return cHeaderTextColor";
Debug.ShouldStop(268435456);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_cheadertextcolor");
 BA.debugLineNum = 1470;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadertextcolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetHeaderTextColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1748);
if (RapidSub.canDelegate("getheadertextcolors")) return __ref.runUserSub(false, "table","getheadertextcolors", __ref);
 BA.debugLineNum = 1748;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1749;BA.debugLine="Return cHeaderTextColors";
Debug.ShouldStop(1048576);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_cheadertextcolors");
 BA.debugLineNum = 1750;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (table) ","table",1,__ref.getField(false, "ba"),__ref,1189);
if (RapidSub.canDelegate("getheight")) return __ref.runUserSub(false, "table","getheight", __ref);
 BA.debugLineNum = 1189;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 1190;BA.debugLine="Return pnlTable.Height";
Debug.ShouldStop(32);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"getHeight");
 BA.debugLineNum = 1191;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlabels(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetLabels (table) ","table",1,__ref.getField(false, "ba"),__ref,558);
if (RapidSub.canDelegate("getlabels")) return __ref.runUserSub(false, "table","getlabels", __ref, _row);
RemoteObject _lbls = null;
int _i = 0;
RemoteObject _rc = RemoteObject.declareNull("b4a.example.table._rowcol");
Debug.locals.put("Row", _row);
 BA.debugLineNum = 558;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
Debug.ShouldStop(8192);
 BA.debugLineNum = 559;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(16384);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 560;BA.debugLine="If LabelsCache.Size > 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_labelscache").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 562;BA.debugLine="lbls = LabelsCache.get(LabelsCache.Size - 1)";
Debug.ShouldStop(131072);
_lbls = (__ref.getFieldClass("b4a.example.table", false,"_labelscache").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_labelscache").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 563;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
Debug.ShouldStop(262144);
__ref.getFieldClass("b4a.example.table", false,"_labelscache").runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_labelscache").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 }else {
 BA.debugLineNum = 565;BA.debugLine="lbls = CreateNewLabels";
Debug.ShouldStop(1048576);
_lbls = __ref.runClassMethod (b4a.example.table.class, "_createnewlabels");Debug.locals.put("lbls", _lbls);
 };
 BA.debugLineNum = 567;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(4194304);
{
final int step376 = 1;
final int limit376 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step376 > 0 && _i <= limit376) || (step376 < 0 && _i >= limit376); _i = ((int)(0 + _i + step376))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 568;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(8388608);
_rc = RemoteObject.createNew ("b4a.example.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 569;BA.debugLine="rc = lbls(I).Tag";
Debug.ShouldStop(16777216);
_rc = (_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 570;BA.debugLine="rc.Row = Row";
Debug.ShouldStop(33554432);
_rc.setFieldClass("b4a.example.table._rowcol", "Row",_row);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 572;BA.debugLine="Return lbls";
Debug.ShouldStop(134217728);
if (true) return _lbls;
 BA.debugLineNum = 573;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeft (table) ","table",1,__ref.getField(false, "ba"),__ref,1152);
if (RapidSub.canDelegate("getleft")) return __ref.runUserSub(false, "table","getleft", __ref);
 BA.debugLineNum = 1152;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1153;BA.debugLine="Return pnlTable.Left";
Debug.ShouldStop(1);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"getLeft");
 BA.debugLineNum = 1154;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlinewidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLineWidth (table) ","table",1,__ref.getField(false, "ba"),__ref,1207);
if (RapidSub.canDelegate("getlinewidth")) return __ref.runUserSub(false, "table","getlinewidth", __ref);
 BA.debugLineNum = 1207;BA.debugLine="Public Sub getLineWidth As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1208;BA.debugLine="Return cLineWidth";
Debug.ShouldStop(8388608);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_clinewidth");
 BA.debugLineNum = 1209;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmultiselect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMultiSelect (table) ","table",1,__ref.getField(false, "ba"),__ref,1063);
if (RapidSub.canDelegate("getmultiselect")) return __ref.runUserSub(false, "table","getmultiselect", __ref);
 BA.debugLineNum = 1063;BA.debugLine="Public Sub getMultiSelect As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 1064;BA.debugLine="Return IsMultiSelect";
Debug.ShouldStop(128);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_ismultiselect");
 BA.debugLineNum = 1065;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowcolor1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRowColor1 (table) ","table",1,__ref.getField(false, "ba"),__ref,1480);
if (RapidSub.canDelegate("getrowcolor1")) return __ref.runUserSub(false, "table","getrowcolor1", __ref);
 BA.debugLineNum = 1480;BA.debugLine="Public Sub getRowColor1 As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 1481;BA.debugLine="Return cRowColor1";
Debug.ShouldStop(256);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_crowcolor1");
 BA.debugLineNum = 1482;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowcolor2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRowColor2 (table) ","table",1,__ref.getField(false, "ba"),__ref,1492);
if (RapidSub.canDelegate("getrowcolor2")) return __ref.runUserSub(false, "table","getrowcolor2", __ref);
 BA.debugLineNum = 1492;BA.debugLine="Public Sub getRowColor2 As Int";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1493;BA.debugLine="Return cRowColor2";
Debug.ShouldStop(1048576);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_crowcolor2");
 BA.debugLineNum = 1494;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRowHeight (table) ","table",1,__ref.getField(false, "ba"),__ref,1578);
if (RapidSub.canDelegate("getrowheight")) return __ref.runUserSub(false, "table","getrowheight", __ref);
 BA.debugLineNum = 1578;BA.debugLine="Public Sub getRowHeight As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 1579;BA.debugLine="Return cRowHeight";
Debug.ShouldStop(1024);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_crowheight");
 BA.debugLineNum = 1580;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedcellcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedCellColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1516);
if (RapidSub.canDelegate("getselectedcellcolor")) return __ref.runUserSub(false, "table","getselectedcellcolor", __ref);
 BA.debugLineNum = 1516;BA.debugLine="Public Sub getSelectedCellColor As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1517;BA.debugLine="Return cSelectedCellColor";
Debug.ShouldStop(4096);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_cselectedcellcolor");
 BA.debugLineNum = 1518;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedrowcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedRowColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1504);
if (RapidSub.canDelegate("getselectedrowcolor")) return __ref.runUserSub(false, "table","getselectedrowcolor", __ref);
 BA.debugLineNum = 1504;BA.debugLine="Public Sub getSelectedRowColor As Int";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1505;BA.debugLine="Return cSelectedRowColor";
Debug.ShouldStop(1);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_cselectedrowcolor");
 BA.debugLineNum = 1506;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedrows(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedRows (table) ","table",1,__ref.getField(false, "ba"),__ref,1094);
if (RapidSub.canDelegate("getselectedrows")) return __ref.runUserSub(false, "table","getselectedrows", __ref);
RemoteObject _sr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1094;BA.debugLine="Public Sub getSelectedRows As List";
Debug.ShouldStop(32);
 BA.debugLineNum = 1095;BA.debugLine="Dim sr As List";
Debug.ShouldStop(64);
_sr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sr", _sr);
 BA.debugLineNum = 1096;BA.debugLine="sr.Initialize";
Debug.ShouldStop(128);
_sr.runVoidMethod ("Initialize");
 BA.debugLineNum = 1097;BA.debugLine="sr.AddAll(SelectedRows)";
Debug.ShouldStop(256);
_sr.runVoidMethod ("AddAll",(Object)(__ref.getFieldClass("b4a.example.table", false,"_selectedrows")));
 BA.debugLineNum = 1098;BA.debugLine="Return sr";
Debug.ShouldStop(512);
if (true) return _sr;
 BA.debugLineNum = 1099;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsingleline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSingleLine (table) ","table",1,__ref.getField(false, "ba"),__ref,1757);
if (RapidSub.canDelegate("getsingleline")) return __ref.runUserSub(false, "table","getsingleline", __ref);
 BA.debugLineNum = 1757;BA.debugLine="Public Sub getSingleLine As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1758;BA.debugLine="Return cSingleLine";
Debug.ShouldStop(536870912);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_csingleline");
 BA.debugLineNum = 1759;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (table) ","table",1,__ref.getField(false, "ba"),__ref,1143);
if (RapidSub.canDelegate("getsize")) return __ref.runUserSub(false, "table","getsize", __ref);
 BA.debugLineNum = 1143;BA.debugLine="Public Sub getSize As Long";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1144;BA.debugLine="Return Data.Size";
Debug.ShouldStop(8388608);
if (true) return BA.numberCast(long.class, __ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"));
 BA.debugLineNum = 1145;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsortcolumn(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSortColumn (table) ","table",1,__ref.getField(false, "ba"),__ref,1680);
if (RapidSub.canDelegate("getsortcolumn")) return __ref.runUserSub(false, "table","getsortcolumn", __ref);
 BA.debugLineNum = 1680;BA.debugLine="Public Sub getSortColumn As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1681;BA.debugLine="Return cSortColumn";
Debug.ShouldStop(65536);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_csortcolumn");
 BA.debugLineNum = 1682;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettablecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTableColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1529);
if (RapidSub.canDelegate("gettablecolor")) return __ref.runUserSub(false, "table","gettablecolor", __ref);
 BA.debugLineNum = 1529;BA.debugLine="Public Sub getTableColor As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1530;BA.debugLine="Return cTableColor";
Debug.ShouldStop(33554432);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_ctablecolor");
 BA.debugLineNum = 1531;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1544);
if (RapidSub.canDelegate("gettextcolor")) return __ref.runUserSub(false, "table","gettextcolor", __ref);
 BA.debugLineNum = 1544;BA.debugLine="Public Sub getTextColor As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 1545;BA.debugLine="Return cTextColor";
Debug.ShouldStop(256);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_ctextcolor");
 BA.debugLineNum = 1546;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextcolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTextColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1730);
if (RapidSub.canDelegate("gettextcolors")) return __ref.runUserSub(false, "table","gettextcolors", __ref);
 BA.debugLineNum = 1730;BA.debugLine="Public Sub GetTextColors As Int()";
Debug.ShouldStop(2);
 BA.debugLineNum = 1731;BA.debugLine="Return cTextColors";
Debug.ShouldStop(4);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_ctextcolors");
 BA.debugLineNum = 1732;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextSize (table) ","table",1,__ref.getField(false, "ba"),__ref,1566);
if (RapidSub.canDelegate("gettextsize")) return __ref.runUserSub(false, "table","gettextsize", __ref);
 BA.debugLineNum = 1566;BA.debugLine="Public Sub getTextSize As Float";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1567;BA.debugLine="Return cTextSize";
Debug.ShouldStop(1073741824);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_ctextsize");
 BA.debugLineNum = 1568;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTop (table) ","table",1,__ref.getField(false, "ba"),__ref,1161);
if (RapidSub.canDelegate("gettop")) return __ref.runUserSub(false, "table","gettop", __ref);
 BA.debugLineNum = 1161;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 1162;BA.debugLine="Return pnlTable.Top";
Debug.ShouldStop(512);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"getTop");
 BA.debugLineNum = 1163;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getusecolumncolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getUseColumnColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1712);
if (RapidSub.canDelegate("getusecolumncolors")) return __ref.runUserSub(false, "table","getusecolumncolors", __ref);
 BA.debugLineNum = 1712;BA.debugLine="Public Sub getUseColumnColors As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1713;BA.debugLine="Return cUseColumnColors";
Debug.ShouldStop(65536);
if (true) return __ref.getFieldClass("b4a.example.table", true,"_cusecolumncolors");
 BA.debugLineNum = 1714;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _col,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetValue (table) ","table",1,__ref.getField(false, "ba"),__ref,712);
if (RapidSub.canDelegate("getvalue")) return __ref.runUserSub(false, "table","getvalue", __ref, _col, _row);
RemoteObject _values = null;
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 712;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 713;BA.debugLine="Dim values() As String";
Debug.ShouldStop(256);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 714;BA.debugLine="values = Data.get(Row)";
Debug.ShouldStop(512);
_values = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 715;BA.debugLine="Return values(Col)";
Debug.ShouldStop(1024);
if (true) return _values.getArrayElement(true,_col);
 BA.debugLineNum = 716;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalues(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetValues (table) ","table",1,__ref.getField(false, "ba"),__ref,985);
if (RapidSub.canDelegate("getvalues")) return __ref.runUserSub(false, "table","getvalues", __ref, _row);
RemoteObject _rowdata = null;
RemoteObject _tmp = null;
int _i = 0;
Debug.locals.put("Row", _row);
 BA.debugLineNum = 985;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 986;BA.debugLine="Dim rowData() As String  = Data.get(Row) ' will throw an excpetion if row is not correct";
Debug.ShouldStop(33554432);
_rowdata = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_row)));Debug.locals.put("rowData", _rowdata);Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 987;BA.debugLine="Dim tmp(NumberOfColumns) As String";
Debug.ShouldStop(67108864);
_tmp = RemoteObject.createNewArray ("String", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 988;BA.debugLine="For i=0 To NumberOfColumns-1 ' copy the array";
Debug.ShouldStop(134217728);
{
final int step709 = 1;
final int limit709 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step709 > 0 && _i <= limit709) || (step709 < 0 && _i >= limit709); _i = ((int)(0 + _i + step709))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 989;BA.debugLine="tmp(i) =  rowData(i)";
Debug.ShouldStop(268435456);
_tmp.setArrayElement (_rowdata.getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 991;BA.debugLine="Return tmp";
Debug.ShouldStop(1073741824);
if (true) return _tmp;
 BA.debugLineNum = 992;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVisible (table) ","table",1,__ref.getField(false, "ba"),__ref,1198);
if (RapidSub.canDelegate("getvisible")) return __ref.runUserSub(false, "table","getvisible", __ref);
 BA.debugLineNum = 1198;BA.debugLine="Public Sub getVisible As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1199;BA.debugLine="Return pnlTable.Visible";
Debug.ShouldStop(16384);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"getVisible");
 BA.debugLineNum = 1200;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (table) ","table",1,__ref.getField(false, "ba"),__ref,1173);
if (RapidSub.canDelegate("getwidth")) return __ref.runUserSub(false, "table","getwidth", __ref);
 BA.debugLineNum = 1173;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1174;BA.debugLine="Return pnlTable.Width";
Debug.ShouldStop(2097152);
if (true) return __ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"getWidth");
 BA.debugLineNum = 1175;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _header_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Header_Click (table) ","table",1,__ref.getField(false, "ba"),__ref,1211);
if (RapidSub.canDelegate("header_click")) return __ref.runUserSub(false, "table","header_click", __ref);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _dir = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1211;BA.debugLine="Private Sub Header_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1212;BA.debugLine="Dim L As Label";
Debug.ShouldStop(134217728);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 1213;BA.debugLine="Dim col As Int";
Debug.ShouldStop(268435456);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 1214;BA.debugLine="L = Sender";
Debug.ShouldStop(536870912);
_l.setObject(table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 1215;BA.debugLine="col = L.Tag";
Debug.ShouldStop(1073741824);
_col = BA.numberCast(int.class, _l.runMethod(false,"getTag"));Debug.locals.put("col", _col);
 BA.debugLineNum = 1220;BA.debugLine="If cSortColumn = True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_csortcolumn"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1221;BA.debugLine="Dim dir As Int = 0 ' unsorted";
Debug.ShouldStop(16);
_dir = BA.numberCast(int.class, 0);Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1222;BA.debugLine="If (sortedCol = col) Then ' we are sorting the same col, reverse dir";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_sortedcol"),BA.numberCast(double.class, _col)))) { 
 BA.debugLineNum = 1223;BA.debugLine="Select sortingDir";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(__ref.getFieldClass("b4a.example.table", true,"_sortingdir"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, -(double) (0 + 1)))) {
case 0:
 BA.debugLineNum = 1224;BA.debugLine="Case 0: dir = -1 ' going up";
Debug.ShouldStop(128);
_dir = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("dir", _dir);
 break;
case 1:
 BA.debugLineNum = 1225;BA.debugLine="Case 1: dir = -1";
Debug.ShouldStop(256);
_dir = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("dir", _dir);
 break;
case 2:
 BA.debugLineNum = 1226;BA.debugLine="Case -1: dir = 1";
Debug.ShouldStop(512);
_dir = BA.numberCast(int.class, 1);Debug.locals.put("dir", _dir);
 break;
}
;
 }else {
 BA.debugLineNum = 1229;BA.debugLine="dir = -1 ' start with going up";
Debug.ShouldStop(4096);
_dir = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("dir", _dir);
 };
 BA.debugLineNum = 1231;BA.debugLine="sortedCol = col";
Debug.ShouldStop(16384);
__ref.setFieldClass("b4a.example.table", "_sortedcol",_col);
 BA.debugLineNum = 1232;BA.debugLine="sortingDir = dir";
Debug.ShouldStop(32768);
__ref.setFieldClass("b4a.example.table", "_sortingdir",_dir);
 BA.debugLineNum = 1233;BA.debugLine="sortTable(col,dir <=0)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.table.class, "_sorttable",(Object)(_col),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("k",_dir,BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 1234;BA.debugLine="showHeaderSorting(col, dir)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.table.class, "_showheadersorting",(Object)(_col),(Object)(_dir));
 };
 BA.debugLineNum = 1237;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Then";
Debug.ShouldStop(1048576);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_HeaderClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1238;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", col)";
Debug.ShouldStop(2097152);
table.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_HeaderClick"))),(Object)((_col)));
 };
 BA.debugLineNum = 1240;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _header_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Header_LongClick (table) ","table",1,__ref.getField(false, "ba"),__ref,688);
if (RapidSub.canDelegate("header_longclick")) return __ref.runUserSub(false, "table","header_longclick", __ref);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _col = RemoteObject.createImmutable(0);
 BA.debugLineNum = 688;BA.debugLine="Private Sub Header_LongClick";
Debug.ShouldStop(32768);
 BA.debugLineNum = 690;BA.debugLine="Dim L As Label";
Debug.ShouldStop(131072);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 691;BA.debugLine="Dim col As Int";
Debug.ShouldStop(262144);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 692;BA.debugLine="L = Sender";
Debug.ShouldStop(524288);
_l.setObject(table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 693;BA.debugLine="col = L.Tag";
Debug.ShouldStop(1048576);
_col = BA.numberCast(int.class, _l.runMethod(false,"getTag"));Debug.locals.put("col", _col);
 BA.debugLineNum = 694;BA.debugLine="If SubExists(Callback, Event & \"_HeaderLongClick\") Then";
Debug.ShouldStop(2097152);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_HeaderLongClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 695;BA.debugLine="CallSub2(Callback, Event & \"_HeaderLongClick\", col)";
Debug.ShouldStop(4194304);
table.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_HeaderLongClick"))),(Object)((_col)));
 };
 BA.debugLineNum = 697;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidecol(RemoteObject __ref,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("hideCol (table) ","table",1,__ref.getField(false, "ba"),__ref,1102);
if (RapidSub.canDelegate("hidecol")) return __ref.runUserSub(false, "table","hidecol", __ref, _col);
RemoteObject _tmpwidths = null;
int _i = 0;
Debug.locals.put("col", _col);
 BA.debugLineNum = 1102;BA.debugLine="Public Sub hideCol(col As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1103;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
Debug.ShouldStop(16384);
_tmpwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", false,"_savedwidths").getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("tmpWidths", _tmpwidths);
 BA.debugLineNum = 1104;BA.debugLine="For i = 0 To SavedWidths.Length-1";
Debug.ShouldStop(32768);
{
final int step793 = 1;
final int limit793 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_savedwidths").getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step793 > 0 && _i <= limit793) || (step793 < 0 && _i >= limit793); _i = ((int)(0 + _i + step793))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1105;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
Debug.ShouldStop(65536);
_tmpwidths.setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_savedwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1107;BA.debugLine="tmpWidths(col) = 1";
Debug.ShouldStop(262144);
_tmpwidths.setArrayElement (BA.numberCast(int.class, 1),_col);
 BA.debugLineNum = 1108;BA.debugLine="SetColumnsWidths(tmpWidths)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.table.class, "_setcolumnswidths",(Object)(_tmpwidths));
 BA.debugLineNum = 1109;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hiderow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("HideRow (table) ","table",1,__ref.getField(false, "ba"),__ref,543);
if (RapidSub.canDelegate("hiderow")) return __ref.runUserSub(false, "table","hiderow", __ref, _row);
RemoteObject _lbls = null;
int _i = 0;
Debug.locals.put("Row", _row);
 BA.debugLineNum = 543;BA.debugLine="Private Sub HideRow (Row As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 545;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(1);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 546;BA.debugLine="lbls = visibleRows.get(Row)";
Debug.ShouldStop(2);
_lbls = (__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(false,"Get",(Object)((_row))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 547;BA.debugLine="If lbls = Null Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("n",_lbls)) { 
 BA.debugLineNum = 549;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 551;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(64);
{
final int step362 = 1;
final int limit362 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step362 > 0 && _i <= limit362) || (step362 < 0 && _i >= limit362); _i = ((int)(0 + _i + step362))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 552;BA.debugLine="lbls(I).RemoveView";
Debug.ShouldStop(128);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("RemoveView");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 554;BA.debugLine="visibleRows.Remove(Row)";
Debug.ShouldStop(512);
__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runVoidMethod ("Remove",(Object)((_row)));
 BA.debugLineNum = 555;BA.debugLine="LabelsCache.Add(lbls)";
Debug.ShouldStop(1024);
__ref.getFieldClass("b4a.example.table", false,"_labelscache").runVoidMethod ("Add",(Object)((_lbls)));
 BA.debugLineNum = 556;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callbackmodule,RemoteObject _eventname,RemoteObject _vnumberofcolumns,RemoteObject _cellalignement,RemoteObject _showstatusl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (table) ","table",1,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "table","initialize", __ref, _ba, _callbackmodule, _eventname, _vnumberofcolumns, _cellalignement, _showstatusl);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallbackModule", _callbackmodule);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("vNumberOfColumns", _vnumberofcolumns);
Debug.locals.put("cellAlignement", _cellalignement);
Debug.locals.put("showStatusL", _showstatusl);
 BA.debugLineNum = 182;BA.debugLine="Public Sub Initialize (CallbackModule As Object, EventName As String, vNumberOfColumns As Int, cellAlignement As Int, showStatusL As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="SV.Initialize(0, 0, \"SV\")";
Debug.ShouldStop(4194304);
__ref.getFieldClass("b4a.example.table", false,"_sv").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("SV")));
 BA.debugLineNum = 184;BA.debugLine="internalPanel.Initialize(\"IP\")";
Debug.ShouldStop(8388608);
__ref.getFieldClass("b4a.example.table", false,"_internalpanel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("IP")));
 BA.debugLineNum = 185;BA.debugLine="showStatusLine = showStatusL";
Debug.ShouldStop(16777216);
__ref.setFieldClass("b4a.example.table", "_showstatusline",_showstatusl);
 BA.debugLineNum = 186;BA.debugLine="SelectedRows.Initialize";
Debug.ShouldStop(33554432);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="cAlignment = cellAlignement";
Debug.ShouldStop(67108864);
__ref.setFieldClass("b4a.example.table", "_calignment",_cellalignement);
 BA.debugLineNum = 189;BA.debugLine="Callback = CallbackModule";
Debug.ShouldStop(268435456);
__ref.setFieldClass("b4a.example.table", "_callback",_callbackmodule);
 BA.debugLineNum = 190;BA.debugLine="Event = EventName";
Debug.ShouldStop(536870912);
__ref.setFieldClass("b4a.example.table", "_event",_eventname);
 BA.debugLineNum = 199;BA.debugLine="Data.Initialize";
Debug.ShouldStop(64);
__ref.getFieldClass("b4a.example.table", false,"_data").runVoidMethod ("Initialize");
 BA.debugLineNum = 201;BA.debugLine="sortingView.Initialize(\"\")";
Debug.ShouldStop(256);
__ref.getFieldClass("b4a.example.table", false,"_sortingview").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 204;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
Debug.ShouldStop(2048);
__ref.getFieldClass("b4a.example.table", false,"_bmp").runVoidMethod ("InitializeMutable",(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 205;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(4096);
__ref.getFieldClass("b4a.example.table", false,"_cvs").runVoidMethod ("Initialize2",(Object)((__ref.getFieldClass("b4a.example.table", false,"_bmp").getObject())));
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innerclearall(RemoteObject __ref,RemoteObject _vnumberofcolumns) throws Exception{
try {
		Debug.PushSubsStack("innerClearAll (table) ","table",1,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("innerclearall")) return __ref.runUserSub(false, "table","innerclearall", __ref, _vnumberofcolumns);
int _i = 0;
RemoteObject _cd1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("vNumberOfColumns", _vnumberofcolumns);
 BA.debugLineNum = 265;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="SelectedRows.Initialize";
Debug.ShouldStop(512);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("Initialize");
 BA.debugLineNum = 267;BA.debugLine="For i = SV.Panel.NumberOfViews -1 To 0 Step -1";
Debug.ShouldStop(1024);
{
final int step122 = (int) (0 + -(double) (0 + 1));
final int limit122 = 0;
for (_i = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue(); (step122 > 0 && _i <= limit122) || (step122 < 0 && _i >= limit122); _i = ((int)(0 + _i + step122))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 268;BA.debugLine="SV.Panel.RemoveViewAt(i)";
Debug.ShouldStop(2048);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 270;BA.debugLine="NumberOfColumns = vNumberOfColumns";
Debug.ShouldStop(8192);
__ref.setFieldClass("b4a.example.table", "_numberofcolumns",_vnumberofcolumns);
 BA.debugLineNum = 271;BA.debugLine="Dim Drawable1(NumberOfColumns) As Object";
Debug.ShouldStop(16384);
table._drawable1 = RemoteObject.createNewArray ("Object", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_drawable1",table._drawable1);
 BA.debugLineNum = 272;BA.debugLine="Dim Drawable2(NumberOfColumns) As Object";
Debug.ShouldStop(32768);
table._drawable2 = RemoteObject.createNewArray ("Object", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_drawable2",table._drawable2);
 BA.debugLineNum = 273;BA.debugLine="Dim SelectedDrawable(NumberOfColumns) As Object";
Debug.ShouldStop(65536);
table._selecteddrawable = RemoteObject.createNewArray ("Object", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_selecteddrawable",table._selecteddrawable);
 BA.debugLineNum = 274;BA.debugLine="Dim cAlignments(NumberOfColumns) As Int";
Debug.ShouldStop(131072);
table._calignments = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_calignments",table._calignments);
 BA.debugLineNum = 275;BA.debugLine="If cUseColumnColors = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_cusecolumncolors"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 276;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(524288);
{
final int step131 = 1;
final int limit131 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step131 > 0 && _i <= limit131) || (step131 < 0 && _i >= limit131); _i = ((int)(0 + _i + step131))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 277;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
Debug.ShouldStop(1048576);
_cd1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd1", _cd1);
_cd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd2", _cd2);
_cd3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd3", _cd3);
 BA.debugLineNum = 278;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
Debug.ShouldStop(2097152);
_cd1.runVoidMethod ("Initialize",(Object)(__ref.getFieldClass("b4a.example.table", true,"_crowcolor1")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 279;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
Debug.ShouldStop(4194304);
_cd2.runVoidMethod ("Initialize",(Object)(__ref.getFieldClass("b4a.example.table", true,"_crowcolor2")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 280;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
Debug.ShouldStop(8388608);
_cd3.runVoidMethod ("Initialize",(Object)(__ref.getFieldClass("b4a.example.table", true,"_cselectedrowcolor")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 281;BA.debugLine="Drawable1(i) = cd1";
Debug.ShouldStop(16777216);
__ref.getFieldClass("b4a.example.table", false,"_drawable1").setArrayElement ((_cd1.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 282;BA.debugLine="Drawable2(i) = cd2";
Debug.ShouldStop(33554432);
__ref.getFieldClass("b4a.example.table", false,"_drawable2").setArrayElement ((_cd2.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 283;BA.debugLine="SelectedDrawable(i) = cd3";
Debug.ShouldStop(67108864);
__ref.getFieldClass("b4a.example.table", false,"_selecteddrawable").setArrayElement ((_cd3.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 284;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_multialignments"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 285;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_calignments").setArrayElement (__ref.getFieldClass("b4a.example.table", true,"_calignment"),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 287;BA.debugLine="cAlignments(i) = cAlignments0(i)";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("b4a.example.table", false,"_calignments").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_calignments0").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 291;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(4);
{
final int step146 = 1;
final int limit146 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step146 > 0 && _i <= limit146) || (step146 < 0 && _i >= limit146); _i = ((int)(0 + _i + step146))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 292;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
Debug.ShouldStop(8);
_cd1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd1", _cd1);
_cd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd2", _cd2);
_cd3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd3", _cd3);
 BA.debugLineNum = 293;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
Debug.ShouldStop(16);
_cd1.runVoidMethod ("Initialize",(Object)(__ref.getFieldClass("b4a.example.table", false,"_ccolumncolors").getArrayElement(true,BA.numberCast(int.class, _i))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 294;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
Debug.ShouldStop(32);
_cd2.runVoidMethod ("Initialize",(Object)(__ref.getFieldClass("b4a.example.table", false,"_ccolumncolors").getArrayElement(true,BA.numberCast(int.class, _i))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 295;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
Debug.ShouldStop(64);
_cd3.runVoidMethod ("Initialize",(Object)(__ref.getFieldClass("b4a.example.table", true,"_cselectedrowcolor")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 296;BA.debugLine="Drawable1(i) = cd1";
Debug.ShouldStop(128);
__ref.getFieldClass("b4a.example.table", false,"_drawable1").setArrayElement ((_cd1.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 297;BA.debugLine="Drawable2(i) = cd2";
Debug.ShouldStop(256);
__ref.getFieldClass("b4a.example.table", false,"_drawable2").setArrayElement ((_cd2.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 298;BA.debugLine="SelectedDrawable(i) = cd3";
Debug.ShouldStop(512);
__ref.getFieldClass("b4a.example.table", false,"_selecteddrawable").setArrayElement ((_cd3.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 299;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_multialignments"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 300;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(2048);
__ref.getFieldClass("b4a.example.table", false,"_calignments").setArrayElement (__ref.getFieldClass("b4a.example.table", true,"_calignment"),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 302;BA.debugLine="cAlignments(i) = cAlignments0(i)";
Debug.ShouldStop(8192);
__ref.getFieldClass("b4a.example.table", false,"_calignments").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_calignments0").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 307;BA.debugLine="Dim cd4 As ColorDrawable";
Debug.ShouldStop(262144);
_cd4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd4", _cd4);
 BA.debugLineNum = 308;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
Debug.ShouldStop(524288);
_cd4.runVoidMethod ("Initialize",(Object)(__ref.getFieldClass("b4a.example.table", true,"_cselectedcellcolor")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 309;BA.debugLine="SelectedCellDrawable = cd4";
Debug.ShouldStop(1048576);
__ref.setFieldClass("b4a.example.table", "_selectedcelldrawable",(_cd4.getObject()));
 BA.debugLineNum = 311;BA.debugLine="SV.Panel.Height = 0";
Debug.ShouldStop(4194304);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 314;BA.debugLine="SelectedCol = -1";
Debug.ShouldStop(33554432);
__ref.setFieldClass("b4a.example.table", "_selectedcol",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 315;BA.debugLine="minVisibleRow = -1";
Debug.ShouldStop(67108864);
__ref.setFieldClass("b4a.example.table", "_minvisiblerow",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 316;BA.debugLine="maxVisibleRow = 0";
Debug.ShouldStop(134217728);
__ref.setFieldClass("b4a.example.table", "_maxvisiblerow",BA.numberCast(int.class, 0));
 BA.debugLineNum = 317;BA.debugLine="Data.Initialize";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_data").runVoidMethod ("Initialize");
 BA.debugLineNum = 318;BA.debugLine="LabelsCache.Initialize";
Debug.ShouldStop(536870912);
__ref.getFieldClass("b4a.example.table", false,"_labelscache").runVoidMethod ("Initialize");
 BA.debugLineNum = 319;BA.debugLine="visibleRows.Initialize";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runVoidMethod ("Initialize");
 BA.debugLineNum = 320;BA.debugLine="SV.VerticalScrollPosition = 0";
Debug.ShouldStop(-2147483648);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setVerticalScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 321;BA.debugLine="DoEvents";
Debug.ShouldStop(1);
table.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 322;BA.debugLine="SV.VerticalScrollPosition = 0";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setVerticalScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 323;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on the first touch";
Debug.ShouldStop(4);
{
final int step174 = 1;
final int limit174 = 80;
for (_i = 1; (step174 > 0 && _i <= limit174) || (step174 < 0 && _i >= limit174); _i = ((int)(0 + _i + step174))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 324;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
Debug.ShouldStop(8);
__ref.getFieldClass("b4a.example.table", false,"_labelscache").runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.table.class, "_createnewlabels"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 326;BA.debugLine="If IsVisible Then";
Debug.ShouldStop(32);
if (__ref.getFieldClass("b4a.example.table", true,"_isvisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 327;BA.debugLine="SV_ScrollChanged(0, 0)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.table.class, "_sv_scrollchanged",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 329;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill = True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean(".",__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_enablestatuslineautofill"),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.table.class, "_setstatusline",(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertrowat(RemoteObject __ref,RemoteObject _row,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("insertRowAt (table) ","table",1,__ref.getField(false, "ba"),__ref,995);
if (RapidSub.canDelegate("insertrowat")) return __ref.runUserSub(false, "table","insertrowat", __ref, _row, _values);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _keepsel = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 995;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As String) As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 996;BA.debugLine="If (Row < 0) Then Row = 0";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 0)))) { 
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);};
 BA.debugLineNum = 997;BA.debugLine="If (Row > Data.Size) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean(">",_row,BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"))))) { 
 BA.debugLineNum = 998;BA.debugLine="AddRow(Values)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.table.class, "_addrow",(Object)(_values));
 BA.debugLineNum = 999;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return table.__c.getField(true,"True");
 };
 BA.debugLineNum = 1001;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.VerticalScrollPosition) ' this strange call will set min/max visible area";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.table.class, "_sv_scrollchanged",(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 1003;BA.debugLine="Dim L As List";
Debug.ShouldStop(1024);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("L", _l);
 BA.debugLineNum = 1004;BA.debugLine="L.Initialize";
Debug.ShouldStop(2048);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 1005;BA.debugLine="L.Add(Values)";
Debug.ShouldStop(4096);
_l.runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 1007;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selection";
Debug.ShouldStop(16384);
{
final int step724 = 1;
final int limit724 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step724 > 0 && _i <= limit724) || (step724 < 0 && _i >= limit724); _i = ((int)(0 + _i + step724))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1008;BA.debugLine="Dim keepSel As Int";
Debug.ShouldStop(32768);
_keepsel = RemoteObject.createImmutable(0);Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 1009;BA.debugLine="keepSel = SelectedRows.get(i)";
Debug.ShouldStop(65536);
_keepsel = BA.numberCast(int.class, __ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 1010;BA.debugLine="If (keepSel >= Row) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("g",_keepsel,BA.numberCast(double.class, _row)))) { 
 BA.debugLineNum = 1011;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number in all rows appear after the soon tobe removed removed row";
Debug.ShouldStop(262144);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _i)),(Object)((RemoteObject.solve(new RemoteObject[] {_keepsel,RemoteObject.createImmutable(1)}, "+",1, 1))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1015;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
Debug.ShouldStop(4194304);
{
final int step731 = 1;
final int limit731 = __ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow").<Integer>get().intValue();
for (_i = __ref.getFieldClass("b4a.example.table", true,"_minvisiblerow").<Integer>get().intValue(); (step731 > 0 && _i <= limit731) || (step731 < 0 && _i >= limit731); _i = ((int)(0 + _i + step731))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1016;BA.debugLine="HideRow(i)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.table.class, "_hiderow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1018;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
Debug.ShouldStop(33554432);
__ref.getFieldClass("b4a.example.table", false,"_data").runVoidMethod ("AddAllAt",(Object)(_row),(Object)(_l));
 BA.debugLineNum = 1020;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.VerticalScrollPosition) ' this strange call will set min/max visible area";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.table.class, "_sv_scrollchanged",(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 1022;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
Debug.ShouldStop(536870912);
{
final int step736 = 1;
final int limit736 = __ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow").<Integer>get().intValue();
for (_i = __ref.getFieldClass("b4a.example.table", true,"_minvisiblerow").<Integer>get().intValue(); (step736 > 0 && _i <= limit736) || (step736 < 0 && _i >= limit736); _i = ((int)(0 + _i + step736))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1023;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1026;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1));
 BA.debugLineNum = 1027;BA.debugLine="updateIPLocation";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.table.class, "_updateiplocation");
 BA.debugLineNum = 1028;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,Min(SV.VerticalScrollPosition, SV.Panel.Height))";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.table.class, "_sv_scrollchanged",(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHorizontalScrollPosition")),(Object)(BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition"))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"getHeight")))))));
 BA.debugLineNum = 1029;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill = True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean(".",__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_enablestatuslineautofill"),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.table.class, "_setstatusline",(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 1030;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) return table.__c.getField(true,"False");
 BA.debugLineNum = 1031;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ip_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IP_Click (table) ","table",1,__ref.getField(false, "ba"),__ref,1125);
if (RapidSub.canDelegate("ip_click")) return __ref.runUserSub(false, "table","ip_click", __ref);
 BA.debugLineNum = 1125;BA.debugLine="Private Sub IP_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 1127;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Then";
Debug.ShouldStop(64);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_HeaderClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1128;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", -1)";
Debug.ShouldStop(128);
table.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("b4a.example.table", false,"_callback")),(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", true,"_event"),RemoteObject.createImmutable("_HeaderClick"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))));
 };
 BA.debugLineNum = 1130;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isrowvisible(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("IsRowVisible (table) ","table",1,__ref.getField(false, "ba"),__ref,538);
if (RapidSub.canDelegate("isrowvisible")) return __ref.runUserSub(false, "table","isrowvisible", __ref, _row);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 538;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 539;BA.debugLine="Return Row < (SV.VerticalScrollPosition + SV.Height) / (cRowHeight + 1) AND _ 		Row > SV.VerticalScrollPosition / cRowHeight";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("<",_row,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition"),__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight")}, "+",1, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_crowheight"),RemoteObject.createImmutable(1)}, "+",1, 1))}, "/",0, 0)) && RemoteObject.solveBoolean(">",_row,RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "/",0, 0)));
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptorow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("JumpToRow (table) ","table",1,__ref.getField(false, "ba"),__ref,783);
if (RapidSub.canDelegate("jumptorow")) return __ref.runUserSub(false, "table","jumptorow", __ref, _row);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 783;BA.debugLine="Public Sub JumpToRow(Row As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 784;BA.debugLine="SV.VerticalScrollPosition = Row * cRowHeight";
Debug.ShouldStop(32768);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setVerticalScrollPosition",RemoteObject.solve(new RemoteObject[] {_row,__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1));
 BA.debugLineNum = 785;BA.debugLine="DoEvents";
Debug.ShouldStop(65536);
table.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 786;BA.debugLine="SV.VerticalScrollPosition = Row * cRowHeight";
Debug.ShouldStop(131072);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setVerticalScrollPosition",RemoteObject.solve(new RemoteObject[] {_row,__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1));
 BA.debugLineNum = 787;BA.debugLine="DoEvents";
Debug.ShouldStop(262144);
table.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 788;BA.debugLine="End Sub";
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
public static RemoteObject  _jumptorowandselect(RemoteObject __ref,RemoteObject _row,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("JumpToRowAndSelect (table) ","table",1,__ref.getField(false, "ba"),__ref,791);
if (RapidSub.canDelegate("jumptorowandselect")) return __ref.runUserSub(false, "table","jumptorowandselect", __ref, _row, _col);
RemoteObject _rc = RemoteObject.declareNull("b4a.example.table._rowcol");
Debug.locals.put("Row", _row);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 791;BA.debugLine="Public Sub JumpToRowAndSelect(Row As Int, Col As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 792;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(8388608);
_rc = RemoteObject.createNew ("b4a.example.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 794;BA.debugLine="rc.Row = Row";
Debug.ShouldStop(33554432);
_rc.setFieldClass("b4a.example.table._rowcol", "Row",_row);
 BA.debugLineNum = 795;BA.debugLine="rc.Col = Col";
Debug.ShouldStop(67108864);
_rc.setFieldClass("b4a.example.table._rowcol", "Col",_col);
 BA.debugLineNum = 796;BA.debugLine="SelectRow(rc)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.table.class, "_selectrow",(Object)(_rc));
 BA.debugLineNum = 797;BA.debugLine="SV.VerticalScrollPosition = Row * cRowHeight";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setVerticalScrollPosition",RemoteObject.solve(new RemoteObject[] {_row,__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1));
 BA.debugLineNum = 798;BA.debugLine="DoEvents";
Debug.ShouldStop(536870912);
table.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 799;BA.debugLine="SV.VerticalScrollPosition = Row * cRowHeight";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setVerticalScrollPosition",RemoteObject.solve(new RemoteObject[] {_row,__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1));
 BA.debugLineNum = 800;BA.debugLine="DoEvents";
Debug.ShouldStop(-2147483648);
table.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 801;BA.debugLine="End Sub";
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
public static RemoteObject  _loadsqlitedb(RemoteObject __ref,RemoteObject _sqlite,RemoteObject _query,RemoteObject _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLiteDB (table) ","table",1,__ref.getField(false, "ba"),__ref,1612);
if (RapidSub.canDelegate("loadsqlitedb")) return __ref.runUserSub(false, "table","loadsqlitedb", __ref, _sqlite, _query, _automaticwidths);
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _headers = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _r = null;
Debug.locals.put("SQLite", _sqlite);
Debug.locals.put("Query", _query);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 1612;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As String, AutomaticWidths As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1613;BA.debugLine="Dim Curs As Cursor";
Debug.ShouldStop(4096);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 1614;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
Debug.ShouldStop(8192);
_curs.setObject(_sqlite.runMethod(false,"ExecQuery",(Object)(_query)));
 BA.debugLineNum = 1616;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(32768);
__ref.setFieldClass("b4a.example.table", "_cautomaticwidths",_automaticwidths);
 BA.debugLineNum = 1617;BA.debugLine="NumberOfColumns = Curs.ColumnCount";
Debug.ShouldStop(65536);
__ref.setFieldClass("b4a.example.table", "_numberofcolumns",_curs.runMethod(true,"getColumnCount"));
 BA.debugLineNum = 1618;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")));
 BA.debugLineNum = 1620;BA.debugLine="Dim Headers(NumberOfColumns) As String";
Debug.ShouldStop(524288);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 1621;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
Debug.ShouldStop(1048576);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_columnwidths",table._columnwidths);
 BA.debugLineNum = 1622;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
Debug.ShouldStop(2097152);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_headerwidths",table._headerwidths);
 BA.debugLineNum = 1623;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
Debug.ShouldStop(4194304);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_datawidths",table._datawidths);
 BA.debugLineNum = 1624;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(8388608);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 1625;BA.debugLine="Dim str As String";
Debug.ShouldStop(16777216);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 1626;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(33554432);
{
final int step1174 = 1;
final int limit1174 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step1174 > 0 && _col.<Integer>get().intValue() <= limit1174) || (step1174 < 0 && _col.<Integer>get().intValue() >= limit1174); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step1174))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1627;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
Debug.ShouldStop(67108864);
_headers.setArrayElement (_curs.runMethod(true,"GetColumnName",(Object)(_col)),_col);
 BA.debugLineNum = 1628;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_automaticwidths,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1629;BA.debugLine="ColumnWidths(col) = 130dip";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 1630;BA.debugLine="HeaderWidths(col) = 130dip";
Debug.ShouldStop(536870912);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 BA.debugLineNum = 1631;BA.debugLine="DataWidths(col) = 130dip";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),_col);
 }else {
 BA.debugLineNum = 1633;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Headers(col), Typeface.DEFAULT, cTextSize) + 8dip + cLineWidth";
Debug.ShouldStop(1);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_headers.getArrayElement(true,_col)),(Object)(table.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "++",2, 0)),_col);
 BA.debugLineNum = 1634;BA.debugLine="DataWidths(col) = 0";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (BA.numberCast(int.class, 0),_col);
 BA.debugLineNum = 1635;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(4);
{
final int step1183 = 1;
final int limit1183 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_row = BA.numberCast(int.class, 0); (step1183 > 0 && _row.<Integer>get().intValue() <= limit1183) || (step1183 < 0 && _row.<Integer>get().intValue() >= limit1183); _row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step1183))) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 1636;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(8);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 1637;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(16);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 1638;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_str)) { 
 BA.debugLineNum = 1639;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.MeasureStringWidth(str, Typeface.DEFAULT, cTextSize) + 8dip + cLineWidth)";
Debug.ShouldStop(64);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_datawidths").getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_str),(Object)(table.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "++",2, 0)))),_col);
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 1642;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), DataWidths(col))";
Debug.ShouldStop(512);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_headerwidths").getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_datawidths").getArrayElement(true,_col))))),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1645;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.table.class, "_setheader",(Object)(_headers));
 BA.debugLineNum = 1646;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.table.class, "_setcolumnswidths",(Object)(__ref.getFieldClass("b4a.example.table", false,"_columnwidths")));
 BA.debugLineNum = 1648;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(32768);
{
final int step1195 = 1;
final int limit1195 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_row = BA.numberCast(int.class, 0); (step1195 > 0 && _row.<Integer>get().intValue() <= limit1195) || (step1195 < 0 && _row.<Integer>get().intValue() >= limit1195); _row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step1195))) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 1649;BA.debugLine="Dim R(NumberOfColumns), str As String";
Debug.ShouldStop(65536);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("R", _r);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 1650;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(131072);
{
final int step1197 = 1;
final int limit1197 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step1197 > 0 && _col.<Integer>get().intValue() <= limit1197) || (step1197 < 0 && _col.<Integer>get().intValue() >= limit1197); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step1197))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1651;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(262144);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 1652;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(524288);
_str = _curs.runMethod(true,"GetString2",(Object)(_col));Debug.locals.put("str", _str);
 BA.debugLineNum = 1653;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("N",_str)) { 
 BA.debugLineNum = 1654;BA.debugLine="R(col) = str";
Debug.ShouldStop(2097152);
_r.setArrayElement (_str,_col);
 }else {
 BA.debugLineNum = 1656;BA.debugLine="R(col) = \"\"";
Debug.ShouldStop(8388608);
_r.setArrayElement (BA.ObjectToString(""),_col);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1659;BA.debugLine="AddRow(R)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.table.class, "_addrow",(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 1662;BA.debugLine="Curs.Close";
Debug.ShouldStop(536870912);
_curs.runVoidMethod ("Close");
 BA.debugLineNum = 1663;BA.debugLine="End Sub";
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
public static RemoteObject  _loadtablefromcsv(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _headersexist) throws Exception{
try {
		Debug.PushSubsStack("LoadTableFromCSV (table) ","table",1,__ref.getField(false, "ba"),__ref,805);
if (RapidSub.canDelegate("loadtablefromcsv")) return __ref.runUserSub(false, "table","loadtablefromcsv", __ref, _dir, _filename, _headersexist);
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _h = null;
RemoteObject _headers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _firstrow = null;
RemoteObject _row = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("HeadersExist", _headersexist);
 BA.debugLineNum = 805;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filename As String, HeadersExist As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 807;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(64);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 808;BA.debugLine="Dim h() As String";
Debug.ShouldStop(128);
_h = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 810;BA.debugLine="cAutomaticWidths = False";
Debug.ShouldStop(512);
__ref.setFieldClass("b4a.example.table", "_cautomaticwidths",table.__c.getField(true,"False"));
 BA.debugLineNum = 812;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(2048);
if (_headersexist.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 813;BA.debugLine="Dim headers As List";
Debug.ShouldStop(4096);
_headers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("headers", _headers);
 BA.debugLineNum = 814;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\", headers)";
Debug.ShouldStop(8192);
_list1 = __ref.getFieldClass("b4a.example.table", false,"_stringutils1").runMethod(false,"LoadCSV2",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(",")),(Object)(_headers));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 815;BA.debugLine="Dim h(headers.Size) As String";
Debug.ShouldStop(16384);
_h = RemoteObject.createNewArray ("String", new int[] {_headers.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 816;BA.debugLine="For i = 0 To headers.Size - 1";
Debug.ShouldStop(32768);
{
final int step579 = 1;
final int limit579 = RemoteObject.solve(new RemoteObject[] {_headers.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step579 > 0 && _i <= limit579) || (step579 < 0 && _i >= limit579); _i = ((int)(0 + _i + step579))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 817;BA.debugLine="h(i) = headers.get(i)";
Debug.ShouldStop(65536);
_h.setArrayElement (BA.ObjectToString(_headers.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 820;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
Debug.ShouldStop(524288);
_list1 = __ref.getFieldClass("b4a.example.table", false,"_stringutils1").runMethod(false,"LoadCSV",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(",")));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 821;BA.debugLine="Dim firstRow() As String";
Debug.ShouldStop(1048576);
_firstrow = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 822;BA.debugLine="firstRow = List1.get(0)";
Debug.ShouldStop(2097152);
_firstrow = (_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 823;BA.debugLine="Dim h(firstRow.Length) As String";
Debug.ShouldStop(4194304);
_h = RemoteObject.createNewArray ("String", new int[] {_firstrow.getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 824;BA.debugLine="For i = 0 To firstRow.Length - 1";
Debug.ShouldStop(8388608);
{
final int step587 = 1;
final int limit587 = RemoteObject.solve(new RemoteObject[] {_firstrow.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step587 > 0 && _i <= limit587) || (step587 < 0 && _i >= limit587); _i = ((int)(0 + _i + step587))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 825;BA.debugLine="h(i) = \"Col\" & (i + 1)";
Debug.ShouldStop(16777216);
_h.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("Col"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 828;BA.debugLine="innerClearAll(h.Length)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(_h.getField(true,"length")));
 BA.debugLineNum = 829;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
Debug.ShouldStop(268435456);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_columnwidths",table._columnwidths);
 BA.debugLineNum = 830;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
Debug.ShouldStop(536870912);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_headerwidths",table._headerwidths);
 BA.debugLineNum = 831;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
Debug.ShouldStop(1073741824);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_datawidths",table._datawidths);
 BA.debugLineNum = 832;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(-2147483648);
{
final int step595 = 1;
final int limit595 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step595 > 0 && _i <= limit595) || (step595 < 0 && _i >= limit595); _i = ((int)(0 + _i + step595))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 833;BA.debugLine="ColumnWidths(i) = SV.Width / NumberOfColumns";
Debug.ShouldStop(1);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getWidth"),__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")}, "/",0, 0)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 834;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 BA.debugLineNum = 835;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(4);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 837;BA.debugLine="SetHeader(h)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.table.class, "_setheader",(Object)(_h));
 BA.debugLineNum = 838;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.table.class, "_setcolumnswidths",(Object)(__ref.getFieldClass("b4a.example.table", false,"_columnwidths")));
 BA.debugLineNum = 840;BA.debugLine="For i = 0 To List1.Size - 1";
Debug.ShouldStop(128);
{
final int step602 = 1;
final int limit602 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step602 > 0 && _i <= limit602) || (step602 < 0 && _i >= limit602); _i = ((int)(0 + _i + step602))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 841;BA.debugLine="Dim Row() As String";
Debug.ShouldStop(256);
_row = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Row", _row);
 BA.debugLineNum = 842;BA.debugLine="Row = List1.get(i)";
Debug.ShouldStop(512);
_row = (_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Row", _row);
 BA.debugLineNum = 843;BA.debugLine="AddRow(Row)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.table.class, "_addrow",(Object)(_row));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 845;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadtablefromcsv2(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _headersexist,RemoteObject _separatorchar,RemoteObject _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadTableFromCSV2 (table) ","table",1,__ref.getField(false, "ba"),__ref,852);
if (RapidSub.canDelegate("loadtablefromcsv2")) return __ref.runUserSub(false, "table","loadtablefromcsv2", __ref, _dir, _filename, _headersexist, _separatorchar, _automaticwidths);
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _h = null;
RemoteObject _headers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _firstrow = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _strrow = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("HeadersExist", _headersexist);
Debug.locals.put("SeparatorChar", _separatorchar);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 852;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filename As String, HeadersExist As Boolean, SeparatorChar As String, AutomaticWidths As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 854;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(2097152);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 855;BA.debugLine="Dim h() As String";
Debug.ShouldStop(4194304);
_h = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 857;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(16777216);
__ref.setFieldClass("b4a.example.table", "_cautomaticwidths",_automaticwidths);
 BA.debugLineNum = 859;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(67108864);
if (_headersexist.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 860;BA.debugLine="Dim headers As List";
Debug.ShouldStop(134217728);
_headers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("headers", _headers);
 BA.debugLineNum = 861;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, SeparatorChar, headers)";
Debug.ShouldStop(268435456);
_list1 = __ref.getFieldClass("b4a.example.table", false,"_stringutils1").runMethod(false,"LoadCSV2",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(_separatorchar)),(Object)(_headers));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 862;BA.debugLine="Dim h(headers.Size) As String";
Debug.ShouldStop(536870912);
_h = RemoteObject.createNewArray ("String", new int[] {_headers.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 863;BA.debugLine="For i = 0 To headers.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step616 = 1;
final int limit616 = RemoteObject.solve(new RemoteObject[] {_headers.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step616 > 0 && _i <= limit616) || (step616 < 0 && _i >= limit616); _i = ((int)(0 + _i + step616))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 864;BA.debugLine="h(i) = headers.get(i)";
Debug.ShouldStop(-2147483648);
_h.setArrayElement (BA.ObjectToString(_headers.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 867;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, SeparatorChar)";
Debug.ShouldStop(4);
_list1 = __ref.getFieldClass("b4a.example.table", false,"_stringutils1").runMethod(false,"LoadCSV",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(_separatorchar)));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 868;BA.debugLine="Dim firstRow() As String";
Debug.ShouldStop(8);
_firstrow = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 869;BA.debugLine="firstRow = List1.get(0)";
Debug.ShouldStop(16);
_firstrow = (_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 870;BA.debugLine="Dim h(firstRow.Length) As String";
Debug.ShouldStop(32);
_h = RemoteObject.createNewArray ("String", new int[] {_firstrow.getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("h", _h);
 BA.debugLineNum = 871;BA.debugLine="For i = 0 To firstRow.Length - 1";
Debug.ShouldStop(64);
{
final int step624 = 1;
final int limit624 = RemoteObject.solve(new RemoteObject[] {_firstrow.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step624 > 0 && _i <= limit624) || (step624 < 0 && _i >= limit624); _i = ((int)(0 + _i + step624))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 872;BA.debugLine="h(i) = \"Col\" & (i + 1)";
Debug.ShouldStop(128);
_h.setArrayElement (RemoteObject.concat(RemoteObject.createImmutable("Col"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 875;BA.debugLine="innerClearAll(h.Length)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(_h.getField(true,"length")));
 BA.debugLineNum = 876;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
Debug.ShouldStop(2048);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_columnwidths",table._columnwidths);
 BA.debugLineNum = 877;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
Debug.ShouldStop(4096);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_headerwidths",table._headerwidths);
 BA.debugLineNum = 878;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
Debug.ShouldStop(8192);
table._datawidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_datawidths",table._datawidths);
 BA.debugLineNum = 880;BA.debugLine="Dim col, Row As Int";
Debug.ShouldStop(32768);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("Row", _row);
 BA.debugLineNum = 881;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_automaticwidths,table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 882;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(131072);
{
final int step634 = 1;
final int limit634 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step634 > 0 && _col.<Integer>get().intValue() <= limit634) || (step634 < 0 && _col.<Integer>get().intValue() >= limit634); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step634))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 883;BA.debugLine="ColumnWidths(col) = SV.Width / NumberOfColumns";
Debug.ShouldStop(262144);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getWidth"),__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")}, "/",0, 0)),_col);
 BA.debugLineNum = 884;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
Debug.ShouldStop(524288);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,_col),_col);
 BA.debugLineNum = 885;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
Debug.ShouldStop(1048576);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,_col),_col);
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 888;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(8388608);
if (_headersexist.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 889;BA.debugLine="Dim strRow(NumberOfColumns) As String";
Debug.ShouldStop(16777216);
_strrow = RemoteObject.createNewArray ("String", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 890;BA.debugLine="strRow = List1.get(col)";
Debug.ShouldStop(33554432);
_strrow = (_list1.runMethod(false,"Get",(Object)(_col)));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 891;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(67108864);
{
final int step643 = 1;
final int limit643 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step643 > 0 && _col.<Integer>get().intValue() <= limit643) || (step643 < 0 && _col.<Integer>get().intValue() >= limit643); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step643))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 892;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(headers.get(col), Typeface.DEFAULT, cTextSize) + 8dip + cLineWidth";
Debug.ShouldStop(134217728);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(_headers.runMethod(false,"Get",(Object)(_col)))),(Object)(table.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "++",2, 0)),_col);
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 895;BA.debugLine="For Row = 0 To List1.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step647 = 1;
final int limit647 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_row = BA.numberCast(int.class, 0); (step647 > 0 && _row.<Integer>get().intValue() <= limit647) || (step647 < 0 && _row.<Integer>get().intValue() >= limit647); _row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step647))) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 896;BA.debugLine="Dim strRow(NumberOfColumns) As String";
Debug.ShouldStop(-2147483648);
_strrow = RemoteObject.createNewArray ("String", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 897;BA.debugLine="strRow = List1.get(Row)";
Debug.ShouldStop(1);
_strrow = (_list1.runMethod(false,"Get",(Object)(_row)));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 898;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(2);
{
final int step650 = 1;
final int limit650 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step650 > 0 && _col.<Integer>get().intValue() <= limit650) || (step650 < 0 && _col.<Integer>get().intValue() >= limit650); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step650))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 899;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.MeasureStringWidth(strRow(col), Typeface.DEFAULT, cTextSize) + 8dip + cLineWidth)";
Debug.ShouldStop(4);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_datawidths").getArrayElement(true,_col))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_strrow.getArrayElement(true,_col)),(Object)(table.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "++",2, 0)))),_col);
 }
}Debug.locals.put("col", _col);
;
 }
}Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 902;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(32);
{
final int step654 = 1;
final int limit654 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step654 > 0 && _col.<Integer>get().intValue() <= limit654) || (step654 < 0 && _col.<Integer>get().intValue() >= limit654); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step654))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 903;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), DataWidths(col))";
Debug.ShouldStop(64);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_headerwidths").getArrayElement(true,_col))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_datawidths").getArrayElement(true,_col))))),_col);
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 906;BA.debugLine="SetHeader(h)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.table.class, "_setheader",(Object)(_h));
 BA.debugLineNum = 908;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.table.class, "_setcolumnswidths",(Object)(__ref.getFieldClass("b4a.example.table", false,"_columnwidths")));
 BA.debugLineNum = 910;BA.debugLine="For i = 0 To List1.Size - 1";
Debug.ShouldStop(8192);
{
final int step660 = 1;
final int limit660 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step660 > 0 && _i <= limit660) || (step660 < 0 && _i >= limit660); _i = ((int)(0 + _i + step660))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 911;BA.debugLine="Dim strRow() As String";
Debug.ShouldStop(16384);
_strrow = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 912;BA.debugLine="strRow = List1.get(i)";
Debug.ShouldStop(32768);
_strrow = (_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 913;BA.debugLine="AddRow(strRow)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.table.class, "_addrow",(Object)(_strrow));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 915;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _partition(RemoteObject __ref,RemoteObject _left,RemoteObject _right,RemoteObject _pivotindex,RemoteObject _col,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("Partition (table) ","table",1,__ref.getField(false, "ba"),__ref,1373);
if (RapidSub.canDelegate("partition")) return __ref.runUserSub(false, "table","partition", __ref, _left, _right, _pivotindex, _col, _dir);
RemoteObject _storeindex = RemoteObject.createImmutable(0);
RemoteObject _pivotvalues = null;
RemoteObject _pivotvalue = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _values = null;
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("left", _left);
Debug.locals.put("right", _right);
Debug.locals.put("pivotIndex", _pivotindex);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1373;BA.debugLine="Public Sub Partition (left As Int, right As Int, pivotIndex As Int, col As Int, dir As Boolean) As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1374;BA.debugLine="Dim storeIndex As Int";
Debug.ShouldStop(536870912);
_storeindex = RemoteObject.createImmutable(0);Debug.locals.put("storeIndex", _storeindex);
 BA.debugLineNum = 1375;BA.debugLine="Dim pivotValues() As String";
Debug.ShouldStop(1073741824);
_pivotvalues = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("pivotValues", _pivotvalues);
 BA.debugLineNum = 1376;BA.debugLine="Dim pivotValue As String";
Debug.ShouldStop(-2147483648);
_pivotvalue = RemoteObject.createImmutable("");Debug.locals.put("pivotValue", _pivotvalue);
 BA.debugLineNum = 1377;BA.debugLine="pivotValues = Data.get(pivotIndex)";
Debug.ShouldStop(1);
_pivotvalues = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_pivotindex)));Debug.locals.put("pivotValues", _pivotvalues);
 BA.debugLineNum = 1378;BA.debugLine="pivotValue = pivotValues(col)";
Debug.ShouldStop(2);
_pivotvalue = _pivotvalues.getArrayElement(true,_col);Debug.locals.put("pivotValue", _pivotvalue);
 BA.debugLineNum = 1379;BA.debugLine="SwapList(pivotIndex, right)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.table.class, "_swaplist",(Object)(_pivotindex),(Object)(_right));
 BA.debugLineNum = 1380;BA.debugLine="storeIndex = left";
Debug.ShouldStop(8);
_storeindex = _left;Debug.locals.put("storeIndex", _storeindex);
 BA.debugLineNum = 1381;BA.debugLine="For i = left To right - 1";
Debug.ShouldStop(16);
{
final int step995 = 1;
final int limit995 = RemoteObject.solve(new RemoteObject[] {_right,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = _left.<Integer>get().intValue(); (step995 > 0 && _i <= limit995) || (step995 < 0 && _i >= limit995); _i = ((int)(0 + _i + step995))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1382;BA.debugLine="Dim values() As String = Data.get(i)";
Debug.ShouldStop(32);
_values = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("values", _values);Debug.locals.put("values", _values);
 BA.debugLineNum = 1383;BA.debugLine="Dim s As String = values(col)";
Debug.ShouldStop(64);
_s = _values.getArrayElement(true,_col);Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 1384;BA.debugLine="If (dir) Then";
Debug.ShouldStop(128);
if ((_dir).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1385;BA.debugLine="If s.CompareTo(pivotValue) < 0 Then ' dir is < acc, > dec";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("<",_s.runMethod(true,"compareTo",(Object)(_pivotvalue)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1386;BA.debugLine="SwapList(i, storeIndex)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.table.class, "_swaplist",(Object)(BA.numberCast(int.class, _i)),(Object)(_storeindex));
 BA.debugLineNum = 1387;BA.debugLine="storeIndex = storeIndex + 1";
Debug.ShouldStop(1024);
_storeindex = RemoteObject.solve(new RemoteObject[] {_storeindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("storeIndex", _storeindex);
 };
 }else {
 BA.debugLineNum = 1390;BA.debugLine="If s.CompareTo(pivotValue) > 0 Then ' dir is < acc, > dec";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_s.runMethod(true,"compareTo",(Object)(_pivotvalue)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1391;BA.debugLine="SwapList(i, storeIndex)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.table.class, "_swaplist",(Object)(BA.numberCast(int.class, _i)),(Object)(_storeindex));
 BA.debugLineNum = 1392;BA.debugLine="storeIndex = storeIndex + 1";
Debug.ShouldStop(32768);
_storeindex = RemoteObject.solve(new RemoteObject[] {_storeindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("storeIndex", _storeindex);
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1396;BA.debugLine="SwapList(storeIndex, right)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.table.class, "_swaplist",(Object)(_storeindex),(Object)(_right));
 BA.debugLineNum = 1397;BA.debugLine="Return storeIndex";
Debug.ShouldStop(1048576);
if (true) return _storeindex;
 BA.debugLineNum = 1398;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _quicksort(RemoteObject __ref,RemoteObject _left,RemoteObject _right,RemoteObject _col,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("QuickSort (table) ","table",1,__ref.getField(false, "ba"),__ref,1361);
if (RapidSub.canDelegate("quicksort")) return __ref.runUserSub(false, "table","quicksort", __ref, _left, _right, _col, _dir);
RemoteObject _pivotindex = RemoteObject.createImmutable(0);
RemoteObject _pivotnewindex = RemoteObject.createImmutable(0);
Debug.locals.put("left", _left);
Debug.locals.put("right", _right);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1361;BA.debugLine="Public Sub QuickSort (left As Int, right As Int, col As Int, dir As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1362;BA.debugLine="debug_counter = debug_counter +1";
Debug.ShouldStop(131072);
__ref.setFieldClass("b4a.example.table", "_debug_counter",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_debug_counter"),RemoteObject.createImmutable(1)}, "+",1, 2));
 BA.debugLineNum = 1363;BA.debugLine="Log (\"counter=\" & debug_counter)";
Debug.ShouldStop(262144);
table.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("counter="),__ref.getFieldClass("b4a.example.table", true,"_debug_counter"))));
 BA.debugLineNum = 1364;BA.debugLine="If right > left Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_right,BA.numberCast(double.class, _left))) { 
 BA.debugLineNum = 1365;BA.debugLine="Dim pivotIndex, pivotNewIndex As Int";
Debug.ShouldStop(1048576);
_pivotindex = RemoteObject.createImmutable(0);Debug.locals.put("pivotIndex", _pivotindex);
_pivotnewindex = RemoteObject.createImmutable(0);Debug.locals.put("pivotNewIndex", _pivotnewindex);
 BA.debugLineNum = 1366;BA.debugLine="pivotIndex = Rnd(left, right + 1) 'max value is exclusive";
Debug.ShouldStop(2097152);
_pivotindex = table.__c.runMethod(true,"Rnd",(Object)(_left),(Object)(RemoteObject.solve(new RemoteObject[] {_right,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("pivotIndex", _pivotindex);
 BA.debugLineNum = 1367;BA.debugLine="pivotNewIndex = Partition(left, right, pivotIndex, col,dir)";
Debug.ShouldStop(4194304);
_pivotnewindex = __ref.runClassMethod (b4a.example.table.class, "_partition",(Object)(_left),(Object)(_right),(Object)(_pivotindex),(Object)(_col),(Object)(_dir));Debug.locals.put("pivotNewIndex", _pivotnewindex);
 BA.debugLineNum = 1368;BA.debugLine="QuickSort(left, pivotNewIndex - 1, col, dir)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.table.class, "_quicksort",(Object)(_left),(Object)(RemoteObject.solve(new RemoteObject[] {_pivotnewindex,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_col),(Object)(_dir));
 BA.debugLineNum = 1369;BA.debugLine="QuickSort(pivotNewIndex + 1, right, col, dir)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.table.class, "_quicksort",(Object)(RemoteObject.solve(new RemoteObject[] {_pivotnewindex,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_right),(Object)(_col),(Object)(_dir));
 };
 BA.debugLineNum = 1371;BA.debugLine="End Sub";
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
public static RemoteObject  _refreshtable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("refreshTable (table) ","table",1,__ref.getField(false, "ba"),__ref,1054);
if (RapidSub.canDelegate("refreshtable")) return __ref.runUserSub(false, "table","refreshtable", __ref);
int _i = 0;
 BA.debugLineNum = 1054;BA.debugLine="Private Sub refreshTable";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1055;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.VerticalScrollPosition) ' this strange call will set min/max visible area";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.table.class, "_sv_scrollchanged",(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 1056;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all visible rows";
Debug.ShouldStop(-2147483648);
{
final int step761 = 1;
final int limit761 = __ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow").<Integer>get().intValue();
for (_i = __ref.getFieldClass("b4a.example.table", true,"_minvisiblerow").<Integer>get().intValue(); (step761 > 0 && _i <= limit761) || (step761 < 0 && _i >= limit761); _i = ((int)(0 + _i + step761))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1057;BA.debugLine="HideRow(i)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.table.class, "_hiderow",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 1058;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1060;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removerow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("RemoveRow (table) ","table",1,__ref.getField(false, "ba"),__ref,931);
if (RapidSub.canDelegate("removerow")) return __ref.runUserSub(false, "table","removerow", __ref, _row);
RemoteObject _previndex = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _keepsel = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 931;BA.debugLine="Public Sub RemoveRow(Row As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 932;BA.debugLine="If (Row <0 OR Row > Data.Size-1) Then Return ' cant remove row outside of the table scope";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_row,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 934;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.VerticalScrollPosition) ' this strange call will set min/max visible area";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.table.class, "_sv_scrollchanged",(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHorizontalScrollPosition")),(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition")));
 BA.debugLineNum = 938;BA.debugLine="Dim prevIndex As Int";
Debug.ShouldStop(512);
_previndex = RemoteObject.createImmutable(0);Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 939;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rmeoved one was selected or not/";
Debug.ShouldStop(1024);
_previndex = __ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(true,"IndexOf",(Object)((_row)));Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 941;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selection";
Debug.ShouldStop(4096);
{
final int step680 = 1;
final int limit680 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step680 > 0 && _i <= limit680) || (step680 < 0 && _i >= limit680); _i = ((int)(0 + _i + step680))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 942;BA.debugLine="Dim keepSel As Int";
Debug.ShouldStop(8192);
_keepsel = RemoteObject.createImmutable(0);Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 943;BA.debugLine="keepSel = SelectedRows.get(i)";
Debug.ShouldStop(16384);
_keepsel = BA.numberCast(int.class, __ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 944;BA.debugLine="If (keepSel > Row) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean(">",_keepsel,BA.numberCast(double.class, _row)))) { 
 BA.debugLineNum = 945;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number in all rows appear after the soon tobe removed removed row";
Debug.ShouldStop(65536);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _i)),(Object)((RemoteObject.solve(new RemoteObject[] {_keepsel,RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 950;BA.debugLine="If (prevIndex <> -1) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("!",_previndex,BA.numberCast(double.class, -(double) (0 + 1))))) { 
 BA.debugLineNum = 952;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the current row from the selected list";
Debug.ShouldStop(8388608);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("RemoveAt",(Object)(_previndex));
 };
 BA.debugLineNum = 955;BA.debugLine="Data.RemoveAt(Row)";
Debug.ShouldStop(67108864);
__ref.getFieldClass("b4a.example.table", false,"_data").runVoidMethod ("RemoveAt",(Object)(_row));
 BA.debugLineNum = 956;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all visible rows";
Debug.ShouldStop(134217728);
{
final int step691 = 1;
final int limit691 = __ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow").<Integer>get().intValue();
for (_i = __ref.getFieldClass("b4a.example.table", true,"_minvisiblerow").<Integer>get().intValue(); (step691 > 0 && _i <= limit691) || (step691 < 0 && _i >= limit691); _i = ((int)(0 + _i + step691))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 957;BA.debugLine="HideRow(i)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.table.class, "_hiderow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 968;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 969;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1) ' adjust visible rows";
Debug.ShouldStop(256);
__ref.setFieldClass("b4a.example.table", "_maxvisiblerow",BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow"))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 970;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1)";
Debug.ShouldStop(512);
__ref.setFieldClass("b4a.example.table", "_minvisiblerow",BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_minvisiblerow"))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 971;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all visible rows (should select the ones needed to be selected as well)";
Debug.ShouldStop(1024);
{
final int step697 = 1;
final int limit697 = __ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow").<Integer>get().intValue();
for (_i = __ref.getFieldClass("b4a.example.table", true,"_minvisiblerow").<Integer>get().intValue(); (step697 > 0 && _i <= limit697) || (step697 < 0 && _i >= limit697); _i = ((int)(0 + _i + step697))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 973;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 977;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(65536);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1));
 BA.debugLineNum = 978;BA.debugLine="updateIPLocation";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.table.class, "_updateiplocation");
 BA.debugLineNum = 980;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,Min(SV.VerticalScrollPosition, SV.Panel.Height))";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.table.class, "_sv_scrollchanged",(Object)(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHorizontalScrollPosition")),(Object)(BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getVerticalScrollPosition"))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"getHeight")))))));
 BA.debugLineNum = 981;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill=True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean(".",__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_enablestatuslineautofill"),table.__c.getField(true,"True")))) { 
__ref.runClassMethod (b4a.example.table.class, "_setstatusline",(Object)(RemoteObject.concat(__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));};
 BA.debugLineNum = 982;BA.debugLine="End Sub";
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
public static RemoteObject  _removeview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveView (table) ","table",1,__ref.getField(false, "ba"),__ref,1665);
if (RapidSub.canDelegate("removeview")) return __ref.runUserSub(false, "table","removeview", __ref);
 BA.debugLineNum = 1665;BA.debugLine="Public Sub RemoveView";
Debug.ShouldStop(1);
 BA.debugLineNum = 1666;BA.debugLine="pnlTable.RemoveView";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runVoidMethod ("RemoveView");
 BA.debugLineNum = 1667;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savetabletocsv(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SaveTableToCSV (table) ","table",1,__ref.getField(false, "ba"),__ref,918);
if (RapidSub.canDelegate("savetabletocsv")) return __ref.runUserSub(false, "table","savetabletocsv", __ref, _dir, _filename);
RemoteObject _headers = null;
int _i = 0;
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 918;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 919;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(4194304);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 920;BA.debugLine="For i = 0 To headers.Length - 1";
Debug.ShouldStop(8388608);
{
final int step668 = 1;
final int limit668 = RemoteObject.solve(new RemoteObject[] {_headers.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step668 > 0 && _i <= limit668) || (step668 < 0 && _i >= limit668); _i = ((int)(0 + _i + step668))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 921;BA.debugLine="Dim L As Label";
Debug.ShouldStop(16777216);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 922;BA.debugLine="L = Header.GetView(i)";
Debug.ShouldStop(33554432);
_l.setObject(__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 923;BA.debugLine="headers(i) = L.Text";
Debug.ShouldStop(67108864);
_headers.setArrayElement (_l.runMethod(true,"getText"),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 925;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, headers)";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_stringutils1").runVoidMethod ("SaveCSV2",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(",")),(Object)(__ref.getFieldClass("b4a.example.table", false,"_data")),(Object)(table.__c.runMethod(false, "ArrayToList", (Object)(_headers))));
 BA.debugLineNum = 926;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectionsort(RemoteObject __ref,RemoteObject _col,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("SelectionSort (table) ","table",1,__ref.getField(false, "ba"),__ref,1283);
if (RapidSub.canDelegate("selectionsort")) return __ref.runUserSub(false, "table","selectionsort", __ref, _col, _dir);
RemoteObject _minindex = RemoteObject.createImmutable(0);
int _i = 0;
int _j = 0;
RemoteObject _values1 = null;
RemoteObject _s1 = RemoteObject.createImmutable("");
RemoteObject _values2 = null;
RemoteObject _s2 = RemoteObject.createImmutable("");
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1283;BA.debugLine="Public Sub SelectionSort (col As Int, dir As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 1284;BA.debugLine="Dim minIndex As Int";
Debug.ShouldStop(8);
_minindex = RemoteObject.createImmutable(0);Debug.locals.put("minIndex", _minindex);
 BA.debugLineNum = 1285;BA.debugLine="For i = 0 To Data.Size- 1";
Debug.ShouldStop(16);
{
final int step926 = 1;
final int limit926 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step926 > 0 && _i <= limit926) || (step926 < 0 && _i >= limit926); _i = ((int)(0 + _i + step926))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1286;BA.debugLine="minIndex = i";
Debug.ShouldStop(32);
_minindex = BA.numberCast(int.class, _i);Debug.locals.put("minIndex", _minindex);
 BA.debugLineNum = 1287;BA.debugLine="For j = i + 1 To Data.Size - 1";
Debug.ShouldStop(64);
{
final int step928 = 1;
final int limit928 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_j = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue(); (step928 > 0 && _j <= limit928) || (step928 < 0 && _j >= limit928); _j = ((int)(0 + _j + step928))) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1288;BA.debugLine="Dim values1() As String = Data.get(j)";
Debug.ShouldStop(128);
_values1 = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("values1", _values1);Debug.locals.put("values1", _values1);
 BA.debugLineNum = 1289;BA.debugLine="Dim s1 As String = values1(col)";
Debug.ShouldStop(256);
_s1 = _values1.getArrayElement(true,_col);Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 1290;BA.debugLine="Dim values2() As String = Data.get(minIndex)";
Debug.ShouldStop(512);
_values2 = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_minindex)));Debug.locals.put("values2", _values2);Debug.locals.put("values2", _values2);
 BA.debugLineNum = 1291;BA.debugLine="Dim s2 As String = values2(col)";
Debug.ShouldStop(1024);
_s2 = _values2.getArrayElement(true,_col);Debug.locals.put("s2", _s2);Debug.locals.put("s2", _s2);
 BA.debugLineNum = 1292;BA.debugLine="If (dir) Then";
Debug.ShouldStop(2048);
if ((_dir).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1293;BA.debugLine="If s1.CompareTo(s2) < 0 Then minIndex = j";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",_s1.runMethod(true,"compareTo",(Object)(_s2)),BA.numberCast(double.class, 0))) { 
_minindex = BA.numberCast(int.class, _j);Debug.locals.put("minIndex", _minindex);};
 }else {
 BA.debugLineNum = 1295;BA.debugLine="If s1.CompareTo(s2) > 0 Then minIndex = j";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_s1.runMethod(true,"compareTo",(Object)(_s2)),BA.numberCast(double.class, 0))) { 
_minindex = BA.numberCast(int.class, _j);Debug.locals.put("minIndex", _minindex);};
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1298;BA.debugLine="SwapList(i, minIndex)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.table.class, "_swaplist",(Object)(BA.numberCast(int.class, _i)),(Object)(_minindex));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1300;BA.debugLine="End Sub";
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
public static RemoteObject  _selectionsortnum(RemoteObject __ref,RemoteObject _col,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("SelectionSortNum (table) ","table",1,__ref.getField(false, "ba"),__ref,1317);
if (RapidSub.canDelegate("selectionsortnum")) return __ref.runUserSub(false, "table","selectionsortnum", __ref, _col, _dir);
RemoteObject _minindex = RemoteObject.createImmutable(0);
int _i = 0;
int _j = 0;
RemoteObject _values1 = null;
RemoteObject _s1 = RemoteObject.createImmutable(0);
RemoteObject _values2 = null;
RemoteObject _s2 = RemoteObject.createImmutable(0);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1317;BA.debugLine="Public Sub SelectionSortNum (col As Int,dir As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1318;BA.debugLine="Dim minIndex As Int";
Debug.ShouldStop(32);
_minindex = RemoteObject.createImmutable(0);Debug.locals.put("minIndex", _minindex);
 BA.debugLineNum = 1319;BA.debugLine="For i = 0 To Data.Size- 1";
Debug.ShouldStop(64);
{
final int step951 = 1;
final int limit951 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step951 > 0 && _i <= limit951) || (step951 < 0 && _i >= limit951); _i = ((int)(0 + _i + step951))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1320;BA.debugLine="minIndex = i";
Debug.ShouldStop(128);
_minindex = BA.numberCast(int.class, _i);Debug.locals.put("minIndex", _minindex);
 BA.debugLineNum = 1321;BA.debugLine="For j = i + 1 To Data.Size - 1";
Debug.ShouldStop(256);
{
final int step953 = 1;
final int limit953 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_j = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue(); (step953 > 0 && _j <= limit953) || (step953 < 0 && _j >= limit953); _j = ((int)(0 + _j + step953))) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1322;BA.debugLine="Dim values1() As String = Data.get(j)";
Debug.ShouldStop(512);
_values1 = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("values1", _values1);Debug.locals.put("values1", _values1);
 BA.debugLineNum = 1323;BA.debugLine="Dim s1 As Double = values1(col)";
Debug.ShouldStop(1024);
_s1 = BA.numberCast(double.class, _values1.getArrayElement(true,_col));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 1324;BA.debugLine="Dim values2() As String = Data.get(minIndex)";
Debug.ShouldStop(2048);
_values2 = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_minindex)));Debug.locals.put("values2", _values2);Debug.locals.put("values2", _values2);
 BA.debugLineNum = 1325;BA.debugLine="Dim s2 As Double = values2(col)";
Debug.ShouldStop(4096);
_s2 = BA.numberCast(double.class, _values2.getArrayElement(true,_col));Debug.locals.put("s2", _s2);Debug.locals.put("s2", _s2);
 BA.debugLineNum = 1326;BA.debugLine="If (dir) Then";
Debug.ShouldStop(8192);
if ((_dir).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1327;BA.debugLine="If s1 < s2 Then minIndex = j";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",_s1,_s2)) { 
_minindex = BA.numberCast(int.class, _j);Debug.locals.put("minIndex", _minindex);};
 }else {
 BA.debugLineNum = 1329;BA.debugLine="If s1 > s2 Then minIndex = j";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_s1,_s2)) { 
_minindex = BA.numberCast(int.class, _j);Debug.locals.put("minIndex", _minindex);};
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1332;BA.debugLine="SwapList(i, minIndex)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.table.class, "_swaplist",(Object)(BA.numberCast(int.class, _i)),(Object)(_minindex));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1334;BA.debugLine="End Sub";
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
public static RemoteObject  _selectrow(RemoteObject __ref,RemoteObject _rc) throws Exception{
try {
		Debug.PushSubsStack("SelectRow (table) ","table",1,__ref.getField(false, "ba"),__ref,730);
if (RapidSub.canDelegate("selectrow")) return __ref.runUserSub(false, "table","selectrow", __ref, _rc);
RemoteObject _previndex = RemoteObject.createImmutable(0);
RemoteObject _prev = RemoteObject.createImmutable(0);
Debug.locals.put("rc", _rc);
 BA.debugLineNum = 730;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 731;BA.debugLine="If Not(cAllowSelection) Then Return";
Debug.ShouldStop(67108864);
if (table.__c.runMethod(true,"Not",(Object)(__ref.getFieldClass("b4a.example.table", true,"_callowselection"))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 733;BA.debugLine="Dim prevIndex As Int";
Debug.ShouldStop(268435456);
_previndex = RemoteObject.createImmutable(0);Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 734;BA.debugLine="Dim prev As Int ' if we select an alreday selected row, prev will be rc.row, else will be -1";
Debug.ShouldStop(536870912);
_prev = RemoteObject.createImmutable(0);Debug.locals.put("prev", _prev);
 BA.debugLineNum = 736;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if selecting not a selected row";
Debug.ShouldStop(-2147483648);
_previndex = __ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(true,"IndexOf",(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row"))));Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 737;BA.debugLine="If (prevIndex <> -1 AND IsMultiSelect = False) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("!",_previndex,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_ismultiselect"),table.__c.getField(true,"False")))) { 
 BA.debugLineNum = 739;BA.debugLine="SelectedCol = rc.col";
Debug.ShouldStop(4);
__ref.setFieldClass("b4a.example.table", "_selectedcol",_rc.getFieldClass("b4a.example.table._rowcol", true,"Col"));
 BA.debugLineNum = 740;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
Debug.ShouldStop(8);
if (__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(true,"ContainsKey",(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 741;BA.debugLine="HideRow(rc.Row)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.table.class, "_hiderow",(Object)(_rc.getFieldClass("b4a.example.table._rowcol", true,"Row")));
 BA.debugLineNum = 742;BA.debugLine="ShowRow(rc.Row)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(_rc.getFieldClass("b4a.example.table._rowcol", true,"Row")));
 };
 BA.debugLineNum = 744;BA.debugLine="Return	' comment this line if you want to unselect a line";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 747;BA.debugLine="If (prevIndex = -1) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",_previndex,BA.numberCast(double.class, -(double) (0 + 1))))) { 
 BA.debugLineNum = 748;BA.debugLine="If (IsMultiSelect) Then";
Debug.ShouldStop(2048);
if ((__ref.getFieldClass("b4a.example.table", true,"_ismultiselect")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 749;BA.debugLine="SelectedRows.add(rc.Row) 'Select the new row";
Debug.ShouldStop(4096);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("Add",(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row"))));
 BA.debugLineNum = 750;BA.debugLine="prev = -1";
Debug.ShouldStop(8192);
_prev = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("prev", _prev);
 }else {
 BA.debugLineNum = 754;BA.debugLine="If (SelectedRows.Size <> 0) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("!",__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 755;BA.debugLine="prev = SelectedRows.get(0) ' there should be only one here ever!!!, keep the unselected row in prev";
Debug.ShouldStop(262144);
_prev = BA.numberCast(int.class, __ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("prev", _prev);
 BA.debugLineNum = 756;BA.debugLine="SelectedRows.set(0,rc.Row) ' change it to the new one";
Debug.ShouldStop(524288);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row"))));
 }else {
 BA.debugLineNum = 758;BA.debugLine="prev = -1";
Debug.ShouldStop(2097152);
_prev = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("prev", _prev);
 BA.debugLineNum = 759;BA.debugLine="SelectedRows.Add(rc.Row)";
Debug.ShouldStop(4194304);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("Add",(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row"))));
 };
 };
 }else {
 BA.debugLineNum = 764;BA.debugLine="prev = SelectedRows.get(prevIndex) ' should be RC.row";
Debug.ShouldStop(134217728);
_prev = BA.numberCast(int.class, __ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(false,"Get",(Object)(_previndex)));Debug.locals.put("prev", _prev);
 BA.debugLineNum = 765;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the old selected row";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runVoidMethod ("RemoveAt",(Object)(_previndex));
 };
 BA.debugLineNum = 768;BA.debugLine="If prev > -1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_prev,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 769;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
Debug.ShouldStop(1);
if (__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(true,"ContainsKey",(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 770;BA.debugLine="HideRow(prev)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.table.class, "_hiderow",(Object)(_prev));
 BA.debugLineNum = 771;BA.debugLine="ShowRow(prev)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(_prev));
 };
 };
 BA.debugLineNum = 775;BA.debugLine="SelectedCol = rc.col";
Debug.ShouldStop(64);
__ref.setFieldClass("b4a.example.table", "_selectedcol",_rc.getFieldClass("b4a.example.table._rowcol", true,"Col"));
 BA.debugLineNum = 776;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
Debug.ShouldStop(128);
if (__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(true,"ContainsKey",(Object)((_rc.getFieldClass("b4a.example.table._rowcol", true,"Row")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 777;BA.debugLine="HideRow(rc.Row)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.table.class, "_hiderow",(Object)(_rc.getFieldClass("b4a.example.table._rowcol", true,"Row")));
 BA.debugLineNum = 778;BA.debugLine="ShowRow(rc.Row)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(_rc.getFieldClass("b4a.example.table._rowcol", true,"Row")));
 };
 BA.debugLineNum = 780;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setallowselection(RemoteObject __ref,RemoteObject _allowselection) throws Exception{
try {
		Debug.PushSubsStack("setAllowSelection (table) ","table",1,__ref.getField(false, "ba"),__ref,1081);
if (RapidSub.canDelegate("setallowselection")) return __ref.runUserSub(false, "table","setallowselection", __ref, _allowselection);
Debug.locals.put("AllowSelection", _allowselection);
 BA.debugLineNum = 1081;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1082;BA.debugLine="cAllowSelection = AllowSelection";
Debug.ShouldStop(33554432);
__ref.setFieldClass("b4a.example.table", "_callowselection",_allowselection);
 BA.debugLineNum = 1083;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(67108864);
if (__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1084;BA.debugLine="clearSelection";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.table.class, "_clearselection");
 };
 BA.debugLineNum = 1086;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellalignment(RemoteObject __ref,RemoteObject _alignment) throws Exception{
try {
		Debug.PushSubsStack("setCellAlignment (table) ","table",1,__ref.getField(false, "ba"),__ref,1428);
if (RapidSub.canDelegate("setcellalignment")) return __ref.runUserSub(false, "table","setcellalignment", __ref, _alignment);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Alignment", _alignment);
 BA.debugLineNum = 1428;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1429;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1048576);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1431;BA.debugLine="cAlignment = Alignment";
Debug.ShouldStop(4194304);
__ref.setFieldClass("b4a.example.table", "_calignment",_alignment);
 BA.debugLineNum = 1432;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(8388608);
{
final int step1033 = 1;
final int limit1033 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step1033 > 0 && _i.<Integer>get().intValue() <= limit1033) || (step1033 < 0 && _i.<Integer>get().intValue() >= limit1033); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step1033))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1433;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(16777216);
__ref.getFieldClass("b4a.example.table", false,"_calignments").setArrayElement (__ref.getFieldClass("b4a.example.table", true,"_calignment"),_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1435;BA.debugLine="MultiAlignments = False";
Debug.ShouldStop(67108864);
__ref.setFieldClass("b4a.example.table", "_multialignments",table.__c.getField(true,"False"));
 BA.debugLineNum = 1436;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1437;BA.debugLine="refreshTable";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.table.class, "_refreshtable");
 };
 BA.debugLineNum = 1439;BA.debugLine="End Sub";
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
public static RemoteObject  _setcellalignments(RemoteObject __ref,RemoteObject _alignments) throws Exception{
try {
		Debug.PushSubsStack("SetCellAlignments (table) ","table",1,__ref.getField(false, "ba"),__ref,1404);
if (RapidSub.canDelegate("setcellalignments")) return __ref.runUserSub(false, "table","setcellalignments", __ref, _alignments);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Alignments", _alignments);
 BA.debugLineNum = 1404;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1405;BA.debugLine="Dim i As Int";
Debug.ShouldStop(268435456);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1407;BA.debugLine="If Alignments.Length <> NumberOfColumns Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_alignments.getField(true,"length"),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")))) { 
 BA.debugLineNum = 1408;BA.debugLine="ToastMessageShow(\"The number of aligments is not equal to the number of columns.\", False)";
Debug.ShouldStop(-2147483648);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("The number of aligments is not equal to the number of columns.")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 1409;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1412;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1413;BA.debugLine="Dim cAlignments0(NumberOfColumns) As Int";
Debug.ShouldStop(16);
table._calignments0 = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_calignments0",table._calignments0);
 BA.debugLineNum = 1415;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(64);
{
final int step1021 = 1;
final int limit1021 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step1021 > 0 && _i.<Integer>get().intValue() <= limit1021) || (step1021 < 0 && _i.<Integer>get().intValue() >= limit1021); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step1021))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1416;BA.debugLine="cAlignments0 = Alignments";
Debug.ShouldStop(128);
__ref.setFieldClass("b4a.example.table", "_calignments0",_alignments);
 BA.debugLineNum = 1417;BA.debugLine="cAlignments = cAlignments0";
Debug.ShouldStop(256);
__ref.setFieldClass("b4a.example.table", "_calignments",__ref.getFieldClass("b4a.example.table", false,"_calignments0"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1419;BA.debugLine="MultiAlignments = True";
Debug.ShouldStop(1024);
__ref.setFieldClass("b4a.example.table", "_multialignments",table.__c.getField(true,"True"));
 BA.debugLineNum = 1420;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1421;BA.debugLine="refreshTable";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.table.class, "_refreshtable");
 };
 BA.debugLineNum = 1423;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumncolors(RemoteObject __ref,RemoteObject _columncolors) throws Exception{
try {
		Debug.PushSubsStack("SetColumnColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1717);
if (RapidSub.canDelegate("setcolumncolors")) return __ref.runUserSub(false, "table","setcolumncolors", __ref, _columncolors);
Debug.locals.put("ColumnColors", _columncolors);
 BA.debugLineNum = 1717;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1718;BA.debugLine="cColumnColors = ColumnColors";
Debug.ShouldStop(2097152);
__ref.setFieldClass("b4a.example.table", "_ccolumncolors",_columncolors);
 BA.debugLineNum = 1719;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnswidths(RemoteObject __ref,RemoteObject _widths) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsWidths (table) ","table",1,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("setcolumnswidths")) return __ref.runUserSub(false, "table","setcolumnswidths", __ref, _widths);
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _lbls = null;
Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 216;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 218;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(33554432);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 220;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
Debug.ShouldStop(134217728);
table._savedwidths = RemoteObject.createNewArray ("int", new int[] {_widths.getField(true,"length").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_savedwidths",table._savedwidths);
 BA.debugLineNum = 221;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
Debug.ShouldStop(268435456);
table._columnwidths = RemoteObject.createNewArray ("int", new int[] {_widths.getField(true,"length").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_columnwidths",table._columnwidths);
 BA.debugLineNum = 222;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
Debug.ShouldStop(536870912);
table._headerwidths = RemoteObject.createNewArray ("int", new int[] {_widths.getField(true,"length").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_headerwidths",table._headerwidths);
 BA.debugLineNum = 223;BA.debugLine="If cAutomaticWidths = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_cautomaticwidths"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 224;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(-2147483648);
{
final int step83 = 1;
final int limit83 = RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step83 > 0 && _col.<Integer>get().intValue() <= limit83) || (step83 < 0 && _col.<Integer>get().intValue() >= limit83); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step83))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 225;BA.debugLine="SavedWidths(col) = Widths(col)";
Debug.ShouldStop(1);
__ref.getFieldClass("b4a.example.table", false,"_savedwidths").setArrayElement (_widths.getArrayElement(true,_col),_col);
 BA.debugLineNum = 226;BA.debugLine="ColumnWidths(col) = Widths(col)";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (_widths.getArrayElement(true,_col),_col);
 BA.debugLineNum = 227;BA.debugLine="HeaderWidths(col) = Widths(col)";
Debug.ShouldStop(4);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (_widths.getArrayElement(true,_col),_col);
 BA.debugLineNum = 228;BA.debugLine="DataWidths(col) = Widths(col)";
Debug.ShouldStop(8);
__ref.getFieldClass("b4a.example.table", false,"_datawidths").setArrayElement (_widths.getArrayElement(true,_col),_col);
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 231;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(64);
{
final int step90 = 1;
final int limit90 = RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step90 > 0 && _col.<Integer>get().intValue() <= limit90) || (step90 < 0 && _col.<Integer>get().intValue() >= limit90); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step90))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 232;BA.debugLine="SavedWidths(col) = Widths(col)";
Debug.ShouldStop(128);
__ref.getFieldClass("b4a.example.table", false,"_savedwidths").setArrayElement (_widths.getArrayElement(true,_col),_col);
 BA.debugLineNum = 233;BA.debugLine="ColumnWidths(col) = Widths(col)";
Debug.ShouldStop(256);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (_widths.getArrayElement(true,_col),_col);
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 237;BA.debugLine="Dim v As View";
Debug.ShouldStop(4096);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 238;BA.debugLine="Dim w As Int";
Debug.ShouldStop(8192);
_w = RemoteObject.createImmutable(0);Debug.locals.put("w", _w);
 BA.debugLineNum = 239;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(16384);
{
final int step97 = 1;
final int limit97 = RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step97 > 0 && _col.<Integer>get().intValue() <= limit97) || (step97 < 0 && _col.<Integer>get().intValue() >= limit97); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step97))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 240;BA.debugLine="v = Header.GetView(col)";
Debug.ShouldStop(32768);
_v = __ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(_col));Debug.locals.put("v", _v);
 BA.debugLineNum = 241;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
Debug.ShouldStop(65536);
_w = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_widths.getArrayElement(true,_col),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "-",1, 1)))));Debug.locals.put("w", _w);
 BA.debugLineNum = 242;BA.debugLine="v.Width = w";
Debug.ShouldStop(131072);
_v.runMethod(true,"setWidth",_w);
 BA.debugLineNum = 243;BA.debugLine="If col > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_col,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 244;BA.debugLine="v.Left = Header.GetView(col - 1).Left + Widths(col - 1)";
Debug.ShouldStop(524288);
_v.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_col,RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(true,"getLeft"),_widths.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_col,RemoteObject.createImmutable(1)}, "-",1, 1))}, "+",1, 1));
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 247;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1).Left + Widths(Widths.Length - 1)";
Debug.ShouldStop(4194304);
__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(true,"getLeft"),_widths.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "+",1, 1));
 BA.debugLineNum = 248;BA.debugLine="SV.Panel.Width = Header.Width";
Debug.ShouldStop(8388608);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"setWidth",__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getWidth"));
 BA.debugLineNum = 249;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(16777216);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 250;BA.debugLine="For row = 0 To visibleRows.Size - 1";
Debug.ShouldStop(33554432);
{
final int step108 = 1;
final int limit108 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_row = BA.numberCast(int.class, 0); (step108 > 0 && _row.<Integer>get().intValue() <= limit108) || (step108 < 0 && _row.<Integer>get().intValue() >= limit108); _row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step108))) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 251;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
Debug.ShouldStop(67108864);
_lbls = (__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(false,"GetValueAt",(Object)(_row)));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 252;BA.debugLine="For col = 0 To lbls.Length - 1";
Debug.ShouldStop(134217728);
{
final int step110 = 1;
final int limit110 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_col = BA.numberCast(int.class, 0); (step110 > 0 && _col.<Integer>get().intValue() <= limit110) || (step110 < 0 && _col.<Integer>get().intValue() >= limit110); _col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step110))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 253;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left, lbls(col).Top, _ 				Header.GetView(col).Width, cRowHeight - cLineWidth)";
Debug.ShouldStop(268435456);
_lbls.getArrayElement(false,_col).runVoidMethod ("SetLayout",(Object)(__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(_col)).runMethod(true,"getLeft")),(Object)(_lbls.getArrayElement(false,_col).runMethod(true,"getTop")),(Object)(__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(_col)).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_crowheight"),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "-",1, 1)));
 }
}Debug.locals.put("col", _col);
;
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 257;BA.debugLine="lblStatusLine.Width = Header.Width";
Debug.ShouldStop(1);
__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"setWidth",__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getWidth"));
 BA.debugLineNum = 258;BA.debugLine="internalPanel.Width = Header.Width";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_internalpanel").runMethod(true,"setWidth",__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getWidth"));
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheader(RemoteObject __ref,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("SetHeader (table) ","table",1,__ref.getField(false, "ba"),__ref,614);
if (RapidSub.canDelegate("setheader")) return __ref.runUserSub(false, "table","setheader", __ref, _values);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _change = RemoteObject.createImmutable(0);
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _extrawidth = RemoteObject.createImmutable(0);
RemoteObject _str = null;
RemoteObject _j = RemoteObject.createImmutable(0);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 614;BA.debugLine="Public Sub SetHeader(Values() As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 615;BA.debugLine="Dim i As Int";
Debug.ShouldStop(64);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 617;BA.debugLine="For i = Header.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(256);
{
final int step418 = (int) (0 + -(double) (0 + 1));
final int limit418 = 0;
for (_i = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1); (step418 > 0 && _i.<Integer>get().intValue() <= limit418) || (step418 < 0 && _i.<Integer>get().intValue() >= limit418); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step418))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 618;BA.debugLine="Header.RemoveViewAt(i)";
Debug.ShouldStop(512);
__ref.getFieldClass("b4a.example.table", false,"_header").runVoidMethod ("RemoveViewAt",(Object)(_i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 621;BA.debugLine="HeaderNames.Initialize2(Values)";
Debug.ShouldStop(4096);
__ref.getFieldClass("b4a.example.table", false,"_headernames").runVoidMethod ("Initialize2",(Object)(table.__c.runMethod(false, "ArrayToList", (Object)(_values))));
 BA.debugLineNum = 623;BA.debugLine="Dim Left = 0 As Int";
Debug.ShouldStop(16384);
_left = BA.numberCast(int.class, 0);Debug.locals.put("Left", _left);Debug.locals.put("Left", _left);
 BA.debugLineNum = 625;BA.debugLine="Dim Change = 0 As Int";
Debug.ShouldStop(65536);
_change = BA.numberCast(int.class, 0);Debug.locals.put("Change", _change);Debug.locals.put("Change", _change);
 BA.debugLineNum = 626;BA.debugLine="Dim w As Int";
Debug.ShouldStop(131072);
_w = RemoteObject.createImmutable(0);Debug.locals.put("w", _w);
 BA.debugLineNum = 627;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(262144);
{
final int step425 = 1;
final int limit425 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step425 > 0 && _i.<Integer>get().intValue() <= limit425) || (step425 < 0 && _i.<Integer>get().intValue() >= limit425); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step425))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 628;BA.debugLine="Dim L As Label";
Debug.ShouldStop(524288);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 629;BA.debugLine="L.Initialize(\"header\")";
Debug.ShouldStop(1048576);
_l.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("header")));
 BA.debugLineNum = 630;BA.debugLine="L.Gravity = Gravity.CENTER";
Debug.ShouldStop(2097152);
_l.runMethod(true,"setGravity",table.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 631;BA.debugLine="L.TextSize = cTextSize";
Debug.ShouldStop(4194304);
_l.runMethod(true,"setTextSize",__ref.getFieldClass("b4a.example.table", true,"_ctextsize"));
 BA.debugLineNum = 632;BA.debugLine="If cUseColumnColors = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_cusecolumncolors"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 633;BA.debugLine="L.Color = cHeaderColor";
Debug.ShouldStop(16777216);
_l.runVoidMethod ("setColor",__ref.getFieldClass("b4a.example.table", true,"_cheadercolor"));
 BA.debugLineNum = 634;BA.debugLine="L.TextColor = cHeaderTextColor";
Debug.ShouldStop(33554432);
_l.runMethod(true,"setTextColor",__ref.getFieldClass("b4a.example.table", true,"_cheadertextcolor"));
 }else {
 BA.debugLineNum = 636;BA.debugLine="L.Color = cHeaderColors(i)";
Debug.ShouldStop(134217728);
_l.runVoidMethod ("setColor",__ref.getFieldClass("b4a.example.table", false,"_cheadercolors").getArrayElement(true,_i));
 BA.debugLineNum = 637;BA.debugLine="L.TextColor = cHeaderTextColors(i)";
Debug.ShouldStop(268435456);
_l.runMethod(true,"setTextColor",__ref.getFieldClass("b4a.example.table", false,"_cheadertextcolors").getArrayElement(true,_i));
 };
 BA.debugLineNum = 640;BA.debugLine="L.Text = Values(i)";
Debug.ShouldStop(-2147483648);
_l.runMethod(true,"setText",(_values.getArrayElement(true,_i)));
 BA.debugLineNum = 641;BA.debugLine="L.Tag = i";
Debug.ShouldStop(1);
_l.runMethod(false,"setTag",(_i));
 BA.debugLineNum = 643;BA.debugLine="w = Max(2dip, ColumnWidths(i) - cLineWidth)		' needed to make sure that the width has value >0";
Debug.ShouldStop(4);
_w = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,_i),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "-",1, 1)))));Debug.locals.put("w", _w);
 BA.debugLineNum = 644;BA.debugLine="Header.AddView(L, Left, 0, w, cRowHeight)";
Debug.ShouldStop(8);
__ref.getFieldClass("b4a.example.table", false,"_header").runVoidMethod ("AddView",(Object)((_l.getObject())),(Object)(_left),(Object)(BA.numberCast(int.class, 0)),(Object)(_w),(Object)(__ref.getFieldClass("b4a.example.table", true,"_crowheight")));
 BA.debugLineNum = 645;BA.debugLine="If cAutomaticWidths = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_cautomaticwidths"),table.__c.getField(true,"True"))) { 
 BA.debugLineNum = 646;BA.debugLine="Dim ExtraWidth As Int";
Debug.ShouldStop(32);
_extrawidth = RemoteObject.createImmutable(0);Debug.locals.put("ExtraWidth", _extrawidth);
 BA.debugLineNum = 647;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
Debug.ShouldStop(64);
_extrawidth = RemoteObject.solve(new RemoteObject[] {table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "+",1, 1);Debug.locals.put("ExtraWidth", _extrawidth);
 BA.debugLineNum = 648;BA.debugLine="If Values(i).Contains(CRLF) Then";
Debug.ShouldStop(128);
if (_values.getArrayElement(true,_i).runMethod(true,"contains",(Object)(table.__c.getField(true,"CRLF"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 649;BA.debugLine="Dim str() As String";
Debug.ShouldStop(256);
_str = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("str", _str);
 BA.debugLineNum = 650;BA.debugLine="Dim j As Int";
Debug.ShouldStop(512);
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 651;BA.debugLine="str = Regex.Split(CRLF, Values(i))";
Debug.ShouldStop(1024);
_str = table.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(table.__c.getField(true,"CRLF")),(Object)(_values.getArrayElement(true,_i)));Debug.locals.put("str", _str);
 BA.debugLineNum = 652;BA.debugLine="HeaderWidths(i) = cvs.MeasureStringWidth(str(0), L.Typeface, cTextSize) + ExtraWidth";
Debug.ShouldStop(2048);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_str.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_l.runMethod(false,"getTypeface")),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),_extrawidth}, "+",1, 0)),_i);
 BA.debugLineNum = 653;BA.debugLine="For j = 1 To str.Length - 1";
Debug.ShouldStop(4096);
{
final int step449 = 1;
final int limit449 = RemoteObject.solve(new RemoteObject[] {_str.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_j = BA.numberCast(int.class, 1); (step449 > 0 && _j.<Integer>get().intValue() <= limit449) || (step449 < 0 && _j.<Integer>get().intValue() >= limit449); _j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step449))) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 654;BA.debugLine="HeaderWidths(i) = Max(HeaderWidths(i),cvs.MeasureStringWidth(str(j), L.Typeface, cTextSize)  + ExtraWidth)";
Debug.ShouldStop(8192);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_headerwidths").getArrayElement(true,_i))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_str.getArrayElement(true,_j)),(Object)(_l.runMethod(false,"getTypeface")),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),_extrawidth}, "+",1, 0)))),_i);
 }
}Debug.locals.put("j", _j);
;
 }else {
 BA.debugLineNum = 657;BA.debugLine="HeaderWidths(i) = cvs.MeasureStringWidth(Values(i), L.Typeface, cTextSize)  + ExtraWidth";
Debug.ShouldStop(65536);
__ref.getFieldClass("b4a.example.table", false,"_headerwidths").setArrayElement (BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_cvs").runMethod(true,"MeasureStringWidth",(Object)(_values.getArrayElement(true,_i)),(Object)(_l.runMethod(false,"getTypeface")),(Object)(__ref.getFieldClass("b4a.example.table", true,"_ctextsize"))),_extrawidth}, "+",1, 0)),_i);
 };
 BA.debugLineNum = 659;BA.debugLine="If HeaderWidths(i) > ColumnWidths(i) Then OR HeaderWidths(i) > ColumnWidths(i) Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_headerwidths").getArrayElement(true,_i),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,_i)))) { 
 BA.debugLineNum = 660;BA.debugLine="Change = 1";
Debug.ShouldStop(524288);
_change = BA.numberCast(int.class, 1);Debug.locals.put("Change", _change);
 BA.debugLineNum = 661;BA.debugLine="ColumnWidths(i) = Max(HeaderWidths(i), ColumnWidths(i))";
Debug.ShouldStop(1048576);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_headerwidths").getArrayElement(true,_i))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,_i))))),_i);
 }else 
{ BA.debugLineNum = 662;BA.debugLine="Else If ColumnWidths(i) > HeaderWidths(i) AND ColumnWidths(i) > DataWidths(i) Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,_i),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_headerwidths").getArrayElement(true,_i))) && RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,_i),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_datawidths").getArrayElement(true,_i)))) { 
 BA.debugLineNum = 663;BA.debugLine="Change = 1";
Debug.ShouldStop(4194304);
_change = BA.numberCast(int.class, 1);Debug.locals.put("Change", _change);
 BA.debugLineNum = 664;BA.debugLine="ColumnWidths(i) = Max(HeaderWidths(i), DataWidths(i))";
Debug.ShouldStop(8388608);
__ref.getFieldClass("b4a.example.table", false,"_columnwidths").setArrayElement (BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_headerwidths").getArrayElement(true,_i))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", false,"_datawidths").getArrayElement(true,_i))))),_i);
 }};
 };
 BA.debugLineNum = 667;BA.debugLine="Left = Left + ColumnWidths(i)";
Debug.ShouldStop(67108864);
_left = RemoteObject.solve(new RemoteObject[] {_left,__ref.getFieldClass("b4a.example.table", false,"_columnwidths").getArrayElement(true,_i)}, "+",1, 1);Debug.locals.put("Left", _left);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 670;BA.debugLine="If Change = 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_change,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 671;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.table.class, "_setcolumnswidths",(Object)(__ref.getFieldClass("b4a.example.table", false,"_columnwidths")));
 };
 BA.debugLineNum = 673;BA.debugLine="Header.Left = - SV.HorizontalScrollPosition";
Debug.ShouldStop(1);
__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + __ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHorizontalScrollPosition").<Integer>get().intValue())));
 BA.debugLineNum = 674;BA.debugLine="End Sub";
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
public static RemoteObject  _setheadercolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setHeaderColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1455);
if (RapidSub.canDelegate("setheadercolor")) return __ref.runUserSub(false, "table","setheadercolor", __ref, _color);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1455;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1456;BA.debugLine="cHeaderColor = Color";
Debug.ShouldStop(32768);
__ref.setFieldClass("b4a.example.table", "_cheadercolor",_color);
 BA.debugLineNum = 1457;BA.debugLine="End Sub";
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
public static RemoteObject  _setheadercolors(RemoteObject __ref,RemoteObject _headercolors) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1735);
if (RapidSub.canDelegate("setheadercolors")) return __ref.runUserSub(false, "table","setheadercolors", __ref, _headercolors);
Debug.locals.put("HeaderColors", _headercolors);
 BA.debugLineNum = 1735;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 1736;BA.debugLine="cHeaderColors = HeaderColors";
Debug.ShouldStop(128);
__ref.setFieldClass("b4a.example.table", "_cheadercolors",_headercolors);
 BA.debugLineNum = 1737;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheaderheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setHeaderHeight (table) ","table",1,__ref.getField(false, "ba"),__ref,1446);
if (RapidSub.canDelegate("setheaderheight")) return __ref.runUserSub(false, "table","setheaderheight", __ref, _height);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1446;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 1447;BA.debugLine="cHeaderHeight = Height";
Debug.ShouldStop(64);
__ref.setFieldClass("b4a.example.table", "_cheaderheight",_height);
 BA.debugLineNum = 1448;BA.debugLine="End Sub";
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
public static RemoteObject  _setheadertextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setHeaderTextColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1464);
if (RapidSub.canDelegate("setheadertextcolor")) return __ref.runUserSub(false, "table","setheadertextcolor", __ref, _color);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1464;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1465;BA.debugLine="cHeaderTextColor = Color";
Debug.ShouldStop(16777216);
__ref.setFieldClass("b4a.example.table", "_cheadertextcolor",_color);
 BA.debugLineNum = 1466;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadertextcolors(RemoteObject __ref,RemoteObject _headertextcolors) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderTextColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1744);
if (RapidSub.canDelegate("setheadertextcolors")) return __ref.runUserSub(false, "table","setheadertextcolors", __ref, _headertextcolors);
Debug.locals.put("HeaderTextColors", _headertextcolors);
 BA.debugLineNum = 1744;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors() As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1745;BA.debugLine="cHeaderTextColors = HeaderTextColors";
Debug.ShouldStop(65536);
__ref.setFieldClass("b4a.example.table", "_cheadertextcolors",_headertextcolors);
 BA.debugLineNum = 1746;BA.debugLine="End Sub";
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
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("setHeight (table) ","table",1,__ref.getField(false, "ba"),__ref,1178);
if (RapidSub.canDelegate("setheight")) return __ref.runUserSub(false, "table","setheight", __ref, _height);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1178;BA.debugLine="Public Sub setHeight(Height As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1179;BA.debugLine="pnlTable.Height = Height";
Debug.ShouldStop(67108864);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"setHeight",_height);
 BA.debugLineNum = 1180;BA.debugLine="If (showStatusLine = True) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_showstatusline"),table.__c.getField(true,"True")))) { 
 BA.debugLineNum = 1181;BA.debugLine="SV.Height = Height - (cRowHeight * 2)";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_height,(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_crowheight"),RemoteObject.createImmutable(2)}, "*",0, 1))}, "-",1, 1));
 }else {
 BA.debugLineNum = 1183;BA.debugLine="SV.Height = Height - (cRowHeight)";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_height,(__ref.getFieldClass("b4a.example.table", true,"_crowheight"))}, "-",1, 1));
 };
 BA.debugLineNum = 1185;BA.debugLine="lblStatusLine.Top = SV.Top + SV.Height";
Debug.ShouldStop(1);
__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getTop"),__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 1186;BA.debugLine="updateIPLocation";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.table.class, "_updateiplocation");
 BA.debugLineNum = 1187;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setleft(RemoteObject __ref,RemoteObject _left) throws Exception{
try {
		Debug.PushSubsStack("setLeft (table) ","table",1,__ref.getField(false, "ba"),__ref,1148);
if (RapidSub.canDelegate("setleft")) return __ref.runUserSub(false, "table","setleft", __ref, _left);
Debug.locals.put("Left", _left);
 BA.debugLineNum = 1148;BA.debugLine="Public Sub setLeft(Left As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1149;BA.debugLine="pnlTable.Left = Left";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"setLeft",_left);
 BA.debugLineNum = 1150;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlinewidth(RemoteObject __ref,RemoteObject _linewidth) throws Exception{
try {
		Debug.PushSubsStack("setLineWidth (table) ","table",1,__ref.getField(false, "ba"),__ref,1203);
if (RapidSub.canDelegate("setlinewidth")) return __ref.runUserSub(false, "table","setlinewidth", __ref, _linewidth);
Debug.locals.put("LineWidth", _linewidth);
 BA.debugLineNum = 1203;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1204;BA.debugLine="cLineWidth = LineWidth";
Debug.ShouldStop(524288);
__ref.setFieldClass("b4a.example.table", "_clinewidth",_linewidth);
 BA.debugLineNum = 1205;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmultiselect(RemoteObject __ref,RemoteObject _ms) throws Exception{
try {
		Debug.PushSubsStack("setMultiSelect (table) ","table",1,__ref.getField(false, "ba"),__ref,1070);
if (RapidSub.canDelegate("setmultiselect")) return __ref.runUserSub(false, "table","setmultiselect", __ref, _ms);
Debug.locals.put("ms", _ms);
 BA.debugLineNum = 1070;BA.debugLine="Public Sub setMultiSelect(ms As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1071;BA.debugLine="clearSelection";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.table.class, "_clearselection");
 BA.debugLineNum = 1072;BA.debugLine="IsMultiSelect = ms";
Debug.ShouldStop(32768);
__ref.setFieldClass("b4a.example.table", "_ismultiselect",_ms);
 BA.debugLineNum = 1073;BA.debugLine="End Sub";
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _v,RemoteObject _left,RemoteObject _top,RemoteObject _right,RemoteObject _bottom) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (table) ","table",1,__ref.getField(false, "ba"),__ref,1669);
if (RapidSub.canDelegate("setpadding")) return __ref.runUserSub(false, "table","setpadding", __ref, _v, _left, _top, _right, _bottom);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("v", _v);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Right", _right);
Debug.locals.put("Bottom", _bottom);
 BA.debugLineNum = 1669;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top As Int, Right As Int, Bottom As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1670;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(32);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 1671;BA.debugLine="r.Target = v";
Debug.ShouldStop(64);
_r.setField ("Target",(_v.getObject()));
 BA.debugLineNum = 1672;BA.debugLine="r.RunMethod4(\"setPadding\", Array As Object(Left, Top, Right, Bottom), Array As String(\"java.lang.int\", \"java.lang.int\", \"java.lang.int\", \"java.lang.int\"))";
Debug.ShouldStop(128);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_left),(_top),(_right),(_bottom)})),(Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int")})));
 BA.debugLineNum = 1673;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrowcolor1(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setRowColor1 (table) ","table",1,__ref.getField(false, "ba"),__ref,1473);
if (RapidSub.canDelegate("setrowcolor1")) return __ref.runUserSub(false, "table","setrowcolor1", __ref, _color);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1473;BA.debugLine="Public Sub setRowColor1(Color As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1474;BA.debugLine="cRowColor1 = Color";
Debug.ShouldStop(2);
__ref.setFieldClass("b4a.example.table", "_crowcolor1",_color);
 BA.debugLineNum = 1475;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(4);
if (__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1476;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")));
 };
 BA.debugLineNum = 1478;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrowcolor2(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setRowColor2 (table) ","table",1,__ref.getField(false, "ba"),__ref,1485);
if (RapidSub.canDelegate("setrowcolor2")) return __ref.runUserSub(false, "table","setrowcolor2", __ref, _color);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1485;BA.debugLine="Public Sub setRowColor2(Color As Int)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1486;BA.debugLine="cRowColor2 = Color";
Debug.ShouldStop(8192);
__ref.setFieldClass("b4a.example.table", "_crowcolor2",_color);
 BA.debugLineNum = 1487;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(16384);
if (__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1488;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")));
 };
 BA.debugLineNum = 1490;BA.debugLine="End Sub";
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
public static RemoteObject  _setrowheight(RemoteObject __ref,RemoteObject _rowheight) throws Exception{
try {
		Debug.PushSubsStack("setRowHeight (table) ","table",1,__ref.getField(false, "ba"),__ref,1571);
if (RapidSub.canDelegate("setrowheight")) return __ref.runUserSub(false, "table","setrowheight", __ref, _rowheight);
Debug.locals.put("RowHeight", _rowheight);
 BA.debugLineNum = 1571;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 1572;BA.debugLine="If cRowHeight = cHeaderHeight Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_crowheight"),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_cheaderheight")))) { 
 BA.debugLineNum = 1573;BA.debugLine="cHeaderHeight = RowHeight";
Debug.ShouldStop(16);
__ref.setFieldClass("b4a.example.table", "_cheaderheight",_rowheight);
 };
 BA.debugLineNum = 1575;BA.debugLine="cRowHeight = RowHeight";
Debug.ShouldStop(64);
__ref.setFieldClass("b4a.example.table", "_crowheight",_rowheight);
 BA.debugLineNum = 1576;BA.debugLine="End Sub";
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
public static RemoteObject  _setselectedcellcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setSelectedCellColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1509);
if (RapidSub.canDelegate("setselectedcellcolor")) return __ref.runUserSub(false, "table","setselectedcellcolor", __ref, _color);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1509;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1510;BA.debugLine="cSelectedCellColor = Color";
Debug.ShouldStop(32);
__ref.setFieldClass("b4a.example.table", "_cselectedcellcolor",_color);
 BA.debugLineNum = 1511;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(64);
if (__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1512;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")));
 };
 BA.debugLineNum = 1514;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedrowcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setSelectedRowColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1497);
if (RapidSub.canDelegate("setselectedrowcolor")) return __ref.runUserSub(false, "table","setselectedrowcolor", __ref, _color);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1497;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1498;BA.debugLine="cSelectedRowColor = Color";
Debug.ShouldStop(33554432);
__ref.setFieldClass("b4a.example.table", "_cselectedrowcolor",_color);
 BA.debugLineNum = 1499;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(67108864);
if (__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1500;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.table.class, "_innerclearall",(Object)(__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns")));
 };
 BA.debugLineNum = 1502;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsingleline(RemoteObject __ref,RemoteObject _singleline) throws Exception{
try {
		Debug.PushSubsStack("setSingleLine (table) ","table",1,__ref.getField(false, "ba"),__ref,1753);
if (RapidSub.canDelegate("setsingleline")) return __ref.runUserSub(false, "table","setsingleline", __ref, _singleline);
Debug.locals.put("SingleLine", _singleline);
 BA.debugLineNum = 1753;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1754;BA.debugLine="cSingleLine = SingleLine";
Debug.ShouldStop(33554432);
__ref.setFieldClass("b4a.example.table", "_csingleline",_singleline);
 BA.debugLineNum = 1755;BA.debugLine="End Sub";
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
public static RemoteObject  _setsortcolumn(RemoteObject __ref,RemoteObject _sortcolumn) throws Exception{
try {
		Debug.PushSubsStack("setSortColumn (table) ","table",1,__ref.getField(false, "ba"),__ref,1676);
if (RapidSub.canDelegate("setsortcolumn")) return __ref.runUserSub(false, "table","setsortcolumn", __ref, _sortcolumn);
Debug.locals.put("SortColumn", _sortcolumn);
 BA.debugLineNum = 1676;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1677;BA.debugLine="cSortColumn = SortColumn";
Debug.ShouldStop(4096);
__ref.setFieldClass("b4a.example.table", "_csortcolumn",_sortcolumn);
 BA.debugLineNum = 1678;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatusline(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("setStatusLine (table) ","table",1,__ref.getField(false, "ba"),__ref,1121);
if (RapidSub.canDelegate("setstatusline")) return __ref.runUserSub(false, "table","setstatusline", __ref, _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 1121;BA.debugLine="Public Sub setStatusLine(s As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1122;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLine.Text = s";
Debug.ShouldStop(2);
if ((__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"setText",(_s));};
 BA.debugLineNum = 1123;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatuslineautofill(RemoteObject __ref,RemoteObject _status) throws Exception{
try {
		Debug.PushSubsStack("setStatusLineAutoFill (table) ","table",1,__ref.getField(false, "ba"),__ref,1355);
if (RapidSub.canDelegate("setstatuslineautofill")) return __ref.runUserSub(false, "table","setstatuslineautofill", __ref, _status);
Debug.locals.put("status", _status);
 BA.debugLineNum = 1355;BA.debugLine="Public Sub setStatusLineAutoFill(status As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1356;BA.debugLine="enableStatusLineAutoFill = status";
Debug.ShouldStop(2048);
__ref.setFieldClass("b4a.example.table", "_enablestatuslineautofill",_status);
 BA.debugLineNum = 1357;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settablecolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTableColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1521);
if (RapidSub.canDelegate("settablecolor")) return __ref.runUserSub(false, "table","settablecolor", __ref, _color);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1521;BA.debugLine="Public Sub setTableColor(Color As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1522;BA.debugLine="cTableColor = Color";
Debug.ShouldStop(131072);
__ref.setFieldClass("b4a.example.table", "_ctablecolor",_color);
 BA.debugLineNum = 1523;BA.debugLine="SV.Panel.Color = cTableColor";
Debug.ShouldStop(262144);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runVoidMethod ("setColor",__ref.getFieldClass("b4a.example.table", true,"_ctablecolor"));
 BA.debugLineNum = 1524;BA.debugLine="If Header.IsInitialized Then";
Debug.ShouldStop(524288);
if (__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1525;BA.debugLine="Header.Color = cTableColor";
Debug.ShouldStop(1048576);
__ref.getFieldClass("b4a.example.table", false,"_header").runVoidMethod ("setColor",__ref.getFieldClass("b4a.example.table", true,"_ctablecolor"));
 };
 BA.debugLineNum = 1527;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (table) ","table",1,__ref.getField(false, "ba"),__ref,1534);
if (RapidSub.canDelegate("settextcolor")) return __ref.runUserSub(false, "table","settextcolor", __ref, _color);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1534;BA.debugLine="Public Sub setTextColor(Color As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1535;BA.debugLine="cTextColor = Color";
Debug.ShouldStop(1073741824);
__ref.setFieldClass("b4a.example.table", "_ctextcolor",_color);
 BA.debugLineNum = 1536;BA.debugLine="Dim i As Int";
Debug.ShouldStop(-2147483648);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1537;BA.debugLine="For i = 0 To SV.Panel.NumberOfViews - 1";
Debug.ShouldStop(1);
{
final int step1111 = 1;
final int limit1111 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step1111 > 0 && _i.<Integer>get().intValue() <= limit1111) || (step1111 < 0 && _i.<Integer>get().intValue() >= limit1111); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step1111))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1538;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(2);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1539;BA.debugLine="lbl = SV.Panel.GetView(i)";
Debug.ShouldStop(4);
_lbl.setObject(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());
 BA.debugLineNum = 1540;BA.debugLine="lbl.TextColor = cTextColor";
Debug.ShouldStop(8);
_lbl.runMethod(true,"setTextColor",__ref.getFieldClass("b4a.example.table", true,"_ctextcolor"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1542;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolors(RemoteObject __ref,RemoteObject _textcolors) throws Exception{
try {
		Debug.PushSubsStack("SetTextColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1726);
if (RapidSub.canDelegate("settextcolors")) return __ref.runUserSub(false, "table","settextcolors", __ref, _textcolors);
Debug.locals.put("TextColors", _textcolors);
 BA.debugLineNum = 1726;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1727;BA.debugLine="cTextColors = TextColors";
Debug.ShouldStop(1073741824);
__ref.setFieldClass("b4a.example.table", "_ctextcolors",_textcolors);
 BA.debugLineNum = 1728;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextsize(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("setTextSize (table) ","table",1,__ref.getField(false, "ba"),__ref,1549);
if (RapidSub.canDelegate("settextsize")) return __ref.runUserSub(false, "table","settextsize", __ref, _size);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Size", _size);
 BA.debugLineNum = 1549;BA.debugLine="Public Sub setTextSize(Size As Float)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1550;BA.debugLine="cTextSize = Size";
Debug.ShouldStop(8192);
__ref.setFieldClass("b4a.example.table", "_ctextsize",_size);
 BA.debugLineNum = 1551;BA.debugLine="Dim i As Int";
Debug.ShouldStop(16384);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1553;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
Debug.ShouldStop(65536);
{
final int step1123 = 1;
final int limit1123 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step1123 > 0 && _i.<Integer>get().intValue() <= limit1123) || (step1123 < 0 && _i.<Integer>get().intValue() >= limit1123); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step1123))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1554;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(131072);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1555;BA.debugLine="lbl = Header.GetView(i)";
Debug.ShouldStop(262144);
_lbl.setObject(__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(_i)).getObject());
 BA.debugLineNum = 1556;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(524288);
_lbl.runMethod(true,"setTextSize",__ref.getFieldClass("b4a.example.table", true,"_ctextsize"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1559;BA.debugLine="For i = 0 To SV.Panel.NumberOfViews - 1";
Debug.ShouldStop(4194304);
{
final int step1128 = 1;
final int limit1128 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step1128 > 0 && _i.<Integer>get().intValue() <= limit1128) || (step1128 < 0 && _i.<Integer>get().intValue() >= limit1128); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step1128))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1560;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(8388608);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1561;BA.debugLine="lbl = SV.Panel.GetView(i)";
Debug.ShouldStop(16777216);
_lbl.setObject(__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_i)).getObject());
 BA.debugLineNum = 1562;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setTextSize",__ref.getFieldClass("b4a.example.table", true,"_ctextsize"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1564;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settop(RemoteObject __ref,RemoteObject _top) throws Exception{
try {
		Debug.PushSubsStack("setTop (table) ","table",1,__ref.getField(false, "ba"),__ref,1157);
if (RapidSub.canDelegate("settop")) return __ref.runUserSub(false, "table","settop", __ref, _top);
Debug.locals.put("Top", _top);
 BA.debugLineNum = 1157;BA.debugLine="Public Sub setTop(Top As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1158;BA.debugLine="pnlTable.Top = Top";
Debug.ShouldStop(32);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"setTop",_top);
 BA.debugLineNum = 1159;BA.debugLine="End Sub";
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
public static RemoteObject  _settypefaces(RemoteObject __ref,RemoteObject _typefaces) throws Exception{
try {
		Debug.PushSubsStack("SetTypeFaces (table) ","table",1,__ref.getField(false, "ba"),__ref,1589);
if (RapidSub.canDelegate("settypefaces")) return __ref.runUserSub(false, "table","settypefaces", __ref, _typefaces);
Debug.locals.put("TypeFaces", _typefaces);
 BA.debugLineNum = 1589;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1590;BA.debugLine="If TypeFaces.Length <> NumberOfColumns AND NumberOfColumns > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_typefaces.getField(true,"length"),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"))) && RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1591;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", False)";
Debug.ShouldStop(4194304);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("Invalid number of columns")),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 1592;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1595;BA.debugLine="If TypeFaces.Length = 1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_typefaces.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1596;BA.debugLine="cTypeFace = TypeFaces(0)";
Debug.ShouldStop(134217728);
__ref.setFieldClass("b4a.example.table", "_ctypeface",_typefaces.getArrayElement(false,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1597;BA.debugLine="MultiTypeFace = False";
Debug.ShouldStop(268435456);
__ref.setFieldClass("b4a.example.table", "_multitypeface",table.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 1599;BA.debugLine="cTypeFaces = TypeFaces";
Debug.ShouldStop(1073741824);
__ref.setFieldClass("b4a.example.table", "_ctypefaces",_typefaces);
 BA.debugLineNum = 1600;BA.debugLine="MultiTypeFace = True";
Debug.ShouldStop(-2147483648);
__ref.setFieldClass("b4a.example.table", "_multitypeface",table.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1603;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1604;BA.debugLine="refreshTable";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.table.class, "_refreshtable");
 };
 BA.debugLineNum = 1606;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setusecolumncolors(RemoteObject __ref,RemoteObject _usecolumncolors) throws Exception{
try {
		Debug.PushSubsStack("setUseColumnColors (table) ","table",1,__ref.getField(false, "ba"),__ref,1685);
if (RapidSub.canDelegate("setusecolumncolors")) return __ref.runUserSub(false, "table","setusecolumncolors", __ref, _usecolumncolors);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("UseColumnColors", _usecolumncolors);
 BA.debugLineNum = 1685;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1686;BA.debugLine="cUseColumnColors = UseColumnColors";
Debug.ShouldStop(2097152);
__ref.setFieldClass("b4a.example.table", "_cusecolumncolors",_usecolumncolors);
 BA.debugLineNum = 1687;BA.debugLine="If cColumnColors.Length = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", false,"_ccolumncolors").getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1688;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8388608);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1689;BA.debugLine="Dim cColumnColors(NumberOfColumns) As Int";
Debug.ShouldStop(16777216);
table._ccolumncolors = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_ccolumncolors",table._ccolumncolors);
 BA.debugLineNum = 1690;BA.debugLine="Dim cTextColors(NumberOfColumns) As Int";
Debug.ShouldStop(33554432);
table._ctextcolors = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_ctextcolors",table._ctextcolors);
 BA.debugLineNum = 1691;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(67108864);
{
final int step1230 = 1;
final int limit1230 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step1230 > 0 && _i.<Integer>get().intValue() <= limit1230) || (step1230 < 0 && _i.<Integer>get().intValue() >= limit1230); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step1230))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1692;BA.debugLine="If i Mod 2 = 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1693;BA.debugLine="cColumnColors(i) = cRowColor1";
Debug.ShouldStop(268435456);
__ref.getFieldClass("b4a.example.table", false,"_ccolumncolors").setArrayElement (__ref.getFieldClass("b4a.example.table", true,"_crowcolor1"),_i);
 }else {
 BA.debugLineNum = 1695;BA.debugLine="cColumnColors(i) = cRowColor2";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("b4a.example.table", false,"_ccolumncolors").setArrayElement (__ref.getFieldClass("b4a.example.table", true,"_crowcolor2"),_i);
 };
 BA.debugLineNum = 1697;BA.debugLine="cTextColors(i) = cTextColor";
Debug.ShouldStop(1);
__ref.getFieldClass("b4a.example.table", false,"_ctextcolors").setArrayElement (__ref.getFieldClass("b4a.example.table", true,"_ctextcolor"),_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1701;BA.debugLine="If cHeaderColors.Length = 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", false,"_cheadercolors").getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1702;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1703;BA.debugLine="Dim cHeaderColors(NumberOfColumns) As Int";
Debug.ShouldStop(64);
table._cheadercolors = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_cheadercolors",table._cheadercolors);
 BA.debugLineNum = 1704;BA.debugLine="Dim cHeaderTextColors(NumberOfColumns) As Int";
Debug.ShouldStop(128);
table._cheadertextcolors = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns").<Integer>get().intValue()}, new Object[]{});__ref.setFieldClass("b4a.example.table","_cheadertextcolors",table._cheadertextcolors);
 BA.debugLineNum = 1705;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(256);
{
final int step1243 = 1;
final int limit1243 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step1243 > 0 && _i.<Integer>get().intValue() <= limit1243) || (step1243 < 0 && _i.<Integer>get().intValue() >= limit1243); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step1243))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1706;BA.debugLine="cHeaderColors(i) = cHeaderColor";
Debug.ShouldStop(512);
__ref.getFieldClass("b4a.example.table", false,"_cheadercolors").setArrayElement (__ref.getFieldClass("b4a.example.table", true,"_cheadercolor"),_i);
 BA.debugLineNum = 1707;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
Debug.ShouldStop(1024);
__ref.getFieldClass("b4a.example.table", false,"_cheadertextcolors").setArrayElement (__ref.getFieldClass("b4a.example.table", true,"_cheadertextcolor"),_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1710;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _col,RemoteObject _row,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetValue (table) ","table",1,__ref.getField(false, "ba"),__ref,719);
if (RapidSub.canDelegate("setvalue")) return __ref.runUserSub(false, "table","setvalue", __ref, _col, _row, _value);
RemoteObject _values = null;
RemoteObject _lbls = null;
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 719;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 720;BA.debugLine="Dim values() As String";
Debug.ShouldStop(32768);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 721;BA.debugLine="values = Data.get(Row)";
Debug.ShouldStop(65536);
_values = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 722;BA.debugLine="values(Col) = Value";
Debug.ShouldStop(131072);
_values.setArrayElement (_value,_col);
 BA.debugLineNum = 723;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
Debug.ShouldStop(262144);
if (__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(true,"ContainsKey",(Object)((_row))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 724;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(524288);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 725;BA.debugLine="lbls = visibleRows.get(Row)";
Debug.ShouldStop(1048576);
_lbls = (__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(false,"Get",(Object)((_row))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 726;BA.debugLine="lbls(Col).Text = Value";
Debug.ShouldStop(2097152);
_lbls.getArrayElement(false,_col).runMethod(true,"setText",(_value));
 };
 BA.debugLineNum = 728;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("setVisible (table) ","table",1,__ref.getField(false, "ba"),__ref,1194);
if (RapidSub.canDelegate("setvisible")) return __ref.runUserSub(false, "table","setvisible", __ref, _visible);
Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 1194;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 1195;BA.debugLine="pnlTable.Visible = Visible";
Debug.ShouldStop(1024);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"setVisible",_visible);
 BA.debugLineNum = 1196;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setWidth (table) ","table",1,__ref.getField(false, "ba"),__ref,1166);
if (RapidSub.canDelegate("setwidth")) return __ref.runUserSub(false, "table","setwidth", __ref, _width);
Debug.locals.put("Width", _width);
 BA.debugLineNum = 1166;BA.debugLine="Public Sub setWidth(Width As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1167;BA.debugLine="pnlTable.Width = Width";
Debug.ShouldStop(16384);
__ref.getFieldClass("b4a.example.table", false,"_pnltable").runMethod(true,"setWidth",_width);
 BA.debugLineNum = 1168;BA.debugLine="SV.Width = Width";
Debug.ShouldStop(32768);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"setWidth",_width);
 BA.debugLineNum = 1169;BA.debugLine="internalPanel.Width = Width";
Debug.ShouldStop(65536);
__ref.getFieldClass("b4a.example.table", false,"_internalpanel").runMethod(true,"setWidth",_width);
 BA.debugLineNum = 1170;BA.debugLine="updateIPLocation";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.table.class, "_updateiplocation");
 BA.debugLineNum = 1171;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showheadersorting(RemoteObject __ref,RemoteObject _col,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("showHeaderSorting (table) ","table",1,__ref.getField(false, "ba"),__ref,1242);
if (RapidSub.canDelegate("showheadersorting")) return __ref.runUserSub(false, "table","showheadersorting", __ref, _col, _dir);
RemoteObject _ll = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _l = RemoteObject.createImmutable(0);
RemoteObject _t = RemoteObject.createImmutable(0);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1242;BA.debugLine="Public Sub showHeaderSorting(col As Int,dir As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1249;BA.debugLine="Dim ll As Int = 40";
Debug.ShouldStop(1);
_ll = BA.numberCast(int.class, 40);Debug.locals.put("ll", _ll);Debug.locals.put("ll", _ll);
 BA.debugLineNum = 1250;BA.debugLine="sortingView.RemoveView";
Debug.ShouldStop(2);
__ref.getFieldClass("b4a.example.table", false,"_sortingview").runVoidMethod ("RemoveView");
 BA.debugLineNum = 1251;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",_dir,BA.numberCast(double.class, 0)))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1253;BA.debugLine="If (dir = -1) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",_dir,BA.numberCast(double.class, -(double) (0 + 1))))) { 
 BA.debugLineNum = 1254;BA.debugLine="sortingView.SetBackgroundImage(LoadBitmapSample(File.DirAssets, \"sort_asc.png\", ll, ll))";
Debug.ShouldStop(32);
__ref.getFieldClass("b4a.example.table", false,"_sortingview").runVoidMethod ("SetBackgroundImage",(Object)((table.__c.runMethod(false,"LoadBitmapSample",(Object)(table.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("sort_asc.png")),(Object)(_ll),(Object)(_ll)).getObject())));
 }else {
 BA.debugLineNum = 1256;BA.debugLine="sortingView.SetBackgroundImage(LoadBitmapSample(File.DirAssets, \"sort_desc.png\", ll, ll))";
Debug.ShouldStop(128);
__ref.getFieldClass("b4a.example.table", false,"_sortingview").runVoidMethod ("SetBackgroundImage",(Object)((table.__c.runMethod(false,"LoadBitmapSample",(Object)(table.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("sort_desc.png")),(Object)(_ll),(Object)(_ll)).getObject())));
 };
 BA.debugLineNum = 1259;BA.debugLine="Dim v As View";
Debug.ShouldStop(1024);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 1260;BA.debugLine="v = Header.GetView(col)";
Debug.ShouldStop(2048);
_v = __ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(_col));Debug.locals.put("v", _v);
 BA.debugLineNum = 1261;BA.debugLine="Dim L As Int ' calculate left";
Debug.ShouldStop(4096);
_l = RemoteObject.createImmutable(0);Debug.locals.put("L", _l);
 BA.debugLineNum = 1262;BA.debugLine="Dim t As Int ' calculate top";
Debug.ShouldStop(8192);
_t = RemoteObject.createImmutable(0);Debug.locals.put("t", _t);
 BA.debugLineNum = 1263;BA.debugLine="L = v.Left + v.Width - ll + 6";
Debug.ShouldStop(16384);
_l = RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"getLeft"),_v.runMethod(true,"getWidth"),_ll,RemoteObject.createImmutable(6)}, "+-+",3, 1);Debug.locals.put("L", _l);
 BA.debugLineNum = 1264;BA.debugLine="t = v.Top + v.Height - ll + 6";
Debug.ShouldStop(32768);
_t = RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"getTop"),_v.runMethod(true,"getHeight"),_ll,RemoteObject.createImmutable(6)}, "+-+",3, 1);Debug.locals.put("t", _t);
 BA.debugLineNum = 1265;BA.debugLine="Header.AddView(sortingView, L, t, ll, ll)";
Debug.ShouldStop(65536);
__ref.getFieldClass("b4a.example.table", false,"_header").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("b4a.example.table", false,"_sortingview").getObject())),(Object)(_l),(Object)(_t),(Object)(_ll),(Object)(_ll));
 BA.debugLineNum = 1266;BA.debugLine="End Sub";
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
public static RemoteObject  _showrow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("ShowRow (table) ","table",1,__ref.getField(false, "ba"),__ref,503);
if (RapidSub.canDelegate("showrow")) return __ref.runUserSub(false, "table","showrow", __ref, _row);
RemoteObject _lbls = null;
RemoteObject _values = null;
RemoteObject _rowcolor = null;
int _i = 0;
Debug.locals.put("Row", _row);
 BA.debugLineNum = 503;BA.debugLine="Private Sub ShowRow(Row As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 504;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
Debug.ShouldStop(8388608);
if (__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runMethod(true,"ContainsKey",(Object)((_row))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 506;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(33554432);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 507;BA.debugLine="Dim values() As String";
Debug.ShouldStop(67108864);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 508;BA.debugLine="lbls = GetLabels(Row)";
Debug.ShouldStop(134217728);
_lbls = __ref.runClassMethod (b4a.example.table.class, "_getlabels",(Object)(_row));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 509;BA.debugLine="values = Data.get(Row)";
Debug.ShouldStop(268435456);
_values = (__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 510;BA.debugLine="visibleRows.Put(Row, lbls)";
Debug.ShouldStop(536870912);
__ref.getFieldClass("b4a.example.table", false,"_visiblerows").runVoidMethod ("Put",(Object)((_row)),(Object)((_lbls)));
 BA.debugLineNum = 511;BA.debugLine="Dim rowColor() As Object";
Debug.ShouldStop(1073741824);
_rowcolor = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 512;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("!",__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(true,"IndexOf",(Object)((_row))),BA.numberCast(double.class, -(double) (0 + 1))))) { 
 BA.debugLineNum = 513;BA.debugLine="rowColor = SelectedDrawable";
Debug.ShouldStop(1);
_rowcolor = __ref.getFieldClass("b4a.example.table", false,"_selecteddrawable");Debug.locals.put("rowColor", _rowcolor);
 }else 
{ BA.debugLineNum = 514;BA.debugLine="Else If Row Mod 2 = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 515;BA.debugLine="rowColor = Drawable1";
Debug.ShouldStop(4);
_rowcolor = __ref.getFieldClass("b4a.example.table", false,"_drawable1");Debug.locals.put("rowColor", _rowcolor);
 }else {
 BA.debugLineNum = 517;BA.debugLine="rowColor = Drawable2";
Debug.ShouldStop(16);
_rowcolor = __ref.getFieldClass("b4a.example.table", false,"_drawable2");Debug.locals.put("rowColor", _rowcolor);
 }};
 BA.debugLineNum = 519;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(64);
{
final int step335 = 1;
final int limit335 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step335 > 0 && _i <= limit335) || (step335 < 0 && _i >= limit335); _i = ((int)(0 + _i + step335))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 520;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"getWidth"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 521;BA.debugLine="SV.Panel.AddView(lbls(I), Header.GetView(I).Left, Row * cRowHeight, Header.GetView(I).Width, cRowHeight - cLineWidth)";
Debug.ShouldStop(256);
__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {_row,__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1)),(Object)(__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_crowheight"),__ref.getFieldClass("b4a.example.table", true,"_clinewidth")}, "-",1, 1)));
 BA.debugLineNum = 522;BA.debugLine="lbls(I).Text = values(I)";
Debug.ShouldStop(512);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",(_values.getArrayElement(true,BA.numberCast(int.class, _i))));
 BA.debugLineNum = 523;BA.debugLine="SetPadding(lbls(I), 4dip, 2dip, 4dip, 2dip)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.table.class, "_setpadding",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _lbls.getArrayElement(false,BA.numberCast(int.class, _i)).getObject()),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 524;BA.debugLine="If I = SelectedCol AND (SelectedRows.indexof(Row) <> -1) Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_selectedcol"))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",__ref.getFieldClass("b4a.example.table", false,"_selectedrows").runMethod(true,"IndexOf",(Object)((_row))),BA.numberCast(double.class, -(double) (0 + 1))))))) { 
 BA.debugLineNum = 525;BA.debugLine="lbls(I).Background = SelectedCellDrawable";
Debug.ShouldStop(4096);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setBackground",(__ref.getFieldClass("b4a.example.table", false,"_selectedcelldrawable")));
 }else {
 BA.debugLineNum = 527;BA.debugLine="lbls(I).Background = rowColor(I)";
Debug.ShouldStop(16384);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setBackground",(_rowcolor.getArrayElement(false,BA.numberCast(int.class, _i))));
 };
 BA.debugLineNum = 529;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getFieldClass("b4a.example.table", true,"_multialignments"),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 530;BA.debugLine="lbls(I).Gravity = cAlignment";
Debug.ShouldStop(131072);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setGravity",__ref.getFieldClass("b4a.example.table", true,"_calignment"));
 }else {
 BA.debugLineNum = 532;BA.debugLine="lbls(I).Gravity = cAlignments(I)";
Debug.ShouldStop(524288);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setGravity",__ref.getFieldClass("b4a.example.table", false,"_calignments").getArrayElement(true,BA.numberCast(int.class, _i)));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 536;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sorttable(RemoteObject __ref,RemoteObject _col,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("sortTable (table) ","table",1,__ref.getField(false, "ba"),__ref,1274);
if (RapidSub.canDelegate("sorttable")) return __ref.runUserSub(false, "table","sorttable", __ref, _col, _dir);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1274;BA.debugLine="Public Sub sortTable(col As Int, dir As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1275;BA.debugLine="Log (\"sorting table for col:\" & col)";
Debug.ShouldStop(67108864);
table.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("sorting table for col:"),_col)));
 BA.debugLineNum = 1276;BA.debugLine="clearSelection";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.table.class, "_clearselection");
 BA.debugLineNum = 1277;BA.debugLine="debug_counter = 0";
Debug.ShouldStop(268435456);
__ref.setFieldClass("b4a.example.table", "_debug_counter",BA.numberCast(long.class, 0));
 BA.debugLineNum = 1279;BA.debugLine="SelectionSort(col, dir)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.table.class, "_selectionsort",(Object)(_col),(Object)(_dir));
 BA.debugLineNum = 1280;BA.debugLine="refreshTable";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.table.class, "_refreshtable");
 BA.debugLineNum = 1281;BA.debugLine="End Sub";
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
public static RemoteObject  _sorttablenum(RemoteObject __ref,RemoteObject _col,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("sortTableNum (table) ","table",1,__ref.getField(false, "ba"),__ref,1308);
if (RapidSub.canDelegate("sorttablenum")) return __ref.runUserSub(false, "table","sorttablenum", __ref, _col, _dir);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1308;BA.debugLine="Public Sub sortTableNum(col As Int, dir As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1309;BA.debugLine="Log (\"sorting table for col:\" & col)";
Debug.ShouldStop(268435456);
table.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("sorting table for col:"),_col)));
 BA.debugLineNum = 1310;BA.debugLine="clearSelection";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.table.class, "_clearselection");
 BA.debugLineNum = 1311;BA.debugLine="debug_counter = 0";
Debug.ShouldStop(1073741824);
__ref.setFieldClass("b4a.example.table", "_debug_counter",BA.numberCast(long.class, 0));
 BA.debugLineNum = 1313;BA.debugLine="SelectionSortNum(col, dir)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.table.class, "_selectionsortnum",(Object)(_col),(Object)(_dir));
 BA.debugLineNum = 1314;BA.debugLine="refreshTable";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.table.class, "_refreshtable");
 BA.debugLineNum = 1315;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sv_scrollchanged(RemoteObject __ref,RemoteObject _posx,RemoteObject _posy) throws Exception{
try {
		Debug.PushSubsStack("SV_ScrollChanged (table) ","table",1,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("sv_scrollchanged")) return __ref.runUserSub(false, "table","sv_scrollchanged", __ref, _posx, _posy);
RemoteObject _currentmin = RemoteObject.createImmutable(0);
RemoteObject _currentmax = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("PosX", _posx);
Debug.locals.put("PosY", _posy);
 BA.debugLineNum = 333;BA.debugLine="Private Sub SV_ScrollChanged(PosX As Int, PosY As Int)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="Dim currentMin, currentMax As Int";
Debug.ShouldStop(8192);
_currentmin = RemoteObject.createImmutable(0);Debug.locals.put("currentMin", _currentmin);
_currentmax = RemoteObject.createImmutable(0);Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 335;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
Debug.ShouldStop(16384);
_currentmin = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_posy,__ref.getFieldClass("b4a.example.table", true,"_crowheight"),RemoteObject.createImmutable(30)}, "/-",1, 0))));Debug.locals.put("currentMin", _currentmin);
 BA.debugLineNum = 336;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV.Height) / cRowHeight + 30)";
Debug.ShouldStop(32768);
_currentmax = BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_posy,__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight")}, "+",1, 1)),__ref.getFieldClass("b4a.example.table", true,"_crowheight"),RemoteObject.createImmutable(30)}, "/+",1, 0))));Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 337;BA.debugLine="If minVisibleRow > -1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", true,"_minvisiblerow"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 338;BA.debugLine="If minVisibleRow < currentMin Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("<",__ref.getFieldClass("b4a.example.table", true,"_minvisiblerow"),BA.numberCast(double.class, _currentmin))) { 
 BA.debugLineNum = 340;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, maxVisibleRow)";
Debug.ShouldStop(524288);
{
final int step188 = 1;
final int limit188 = (int) (0 + table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_currentmin,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow")))).<Double>get().doubleValue());
for (_i = __ref.getFieldClass("b4a.example.table", true,"_minvisiblerow").<Integer>get().intValue(); (step188 > 0 && _i <= limit188) || (step188 < 0 && _i >= limit188); _i = ((int)(0 + _i + step188))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 341;BA.debugLine="HideRow(I)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.table.class, "_hiderow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 343;BA.debugLine="Else If minVisibleRow > currentMin Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", true,"_minvisiblerow"),BA.numberCast(double.class, _currentmin))) { 
 BA.debugLineNum = 345;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, currentMax)";
Debug.ShouldStop(16777216);
{
final int step192 = 1;
final int limit192 = (int) (0 + table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_minvisiblerow"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _currentmax))).<Double>get().doubleValue());
for (_i = _currentmin.<Integer>get().intValue(); (step192 > 0 && _i <= limit192) || (step192 < 0 && _i >= limit192); _i = ((int)(0 + _i + step192))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 346;BA.debugLine="ShowRow(I)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 }};
 BA.debugLineNum = 349;BA.debugLine="If maxVisibleRow > currentMax Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow"),BA.numberCast(double.class, _currentmax))) { 
 BA.debugLineNum = 351;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, minVisibleRow) Step -1";
Debug.ShouldStop(1073741824);
{
final int step197 = (int) (0 + -(double) (0 + 1));
final int limit197 = (int) (0 + table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_currentmax,RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_minvisiblerow")))).<Double>get().doubleValue());
for (_i = __ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow").<Integer>get().intValue(); (step197 > 0 && _i <= limit197) || (step197 < 0 && _i >= limit197); _i = ((int)(0 + _i + step197))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 352;BA.debugLine="HideRow(I)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.table.class, "_hiderow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 354;BA.debugLine="Else If maxVisibleRow < currentMax Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",__ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow"),BA.numberCast(double.class, _currentmax))) { 
 BA.debugLineNum = 356;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, currentMin) Step -1";
Debug.ShouldStop(8);
{
final int step201 = (int) (0 + -(double) (0 + 1));
final int limit201 = (int) (0 + table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", true,"_maxvisiblerow"),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(double.class, _currentmin))).<Double>get().doubleValue());
for (_i = _currentmax.<Integer>get().intValue(); (step201 > 0 && _i <= limit201) || (step201 < 0 && _i >= limit201); _i = ((int)(0 + _i + step201))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 357;BA.debugLine="ShowRow(I)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.table.class, "_showrow",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 }};
 };
 BA.debugLineNum = 361;BA.debugLine="minVisibleRow = currentMin";
Debug.ShouldStop(256);
__ref.setFieldClass("b4a.example.table", "_minvisiblerow",_currentmin);
 BA.debugLineNum = 362;BA.debugLine="maxVisibleRow = currentMax";
Debug.ShouldStop(512);
__ref.setFieldClass("b4a.example.table", "_maxvisiblerow",_currentmax);
 BA.debugLineNum = 363;BA.debugLine="Header.Left = -PosX";
Debug.ShouldStop(1024);
__ref.getFieldClass("b4a.example.table", false,"_header").runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + _posx.<Integer>get().intValue())));
 BA.debugLineNum = 364;BA.debugLine="lblStatusLine.Left = - PosX";
Debug.ShouldStop(2048);
__ref.getFieldClass("b4a.example.table", false,"_lblstatusline").runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + _posx.<Integer>get().intValue())));
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swaplist(RemoteObject __ref,RemoteObject _index1,RemoteObject _index2) throws Exception{
try {
		Debug.PushSubsStack("SwapList (table) ","table",1,__ref.getField(false, "ba"),__ref,1336);
if (RapidSub.canDelegate("swaplist")) return __ref.runUserSub(false, "table","swaplist", __ref, _index1, _index2);
RemoteObject _temp = RemoteObject.declareNull("Object");
Debug.locals.put("index1", _index1);
Debug.locals.put("index2", _index2);
 BA.debugLineNum = 1336;BA.debugLine="Public Sub SwapList(index1 As Int, index2 As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1337;BA.debugLine="Dim temp As Object";
Debug.ShouldStop(16777216);
_temp = RemoteObject.createNew ("Object");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1338;BA.debugLine="temp = Data.get(index1)";
Debug.ShouldStop(33554432);
_temp = __ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_index1));Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1339;BA.debugLine="Data.set(index1,Data.get(index2))";
Debug.ShouldStop(67108864);
__ref.getFieldClass("b4a.example.table", false,"_data").runVoidMethod ("Set",(Object)(_index1),(Object)(__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(false,"Get",(Object)(_index2))));
 BA.debugLineNum = 1340;BA.debugLine="Data.set(index2,temp)";
Debug.ShouldStop(134217728);
__ref.getFieldClass("b4a.example.table", false,"_data").runVoidMethod ("Set",(Object)(_index2),(Object)(_temp));
 BA.debugLineNum = 1352;BA.debugLine="End Sub";
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
public static RemoteObject  _unhidecol(RemoteObject __ref,RemoteObject _col,RemoteObject _newsize) throws Exception{
try {
		Debug.PushSubsStack("unHideCol (table) ","table",1,__ref.getField(false, "ba"),__ref,1112);
if (RapidSub.canDelegate("unhidecol")) return __ref.runUserSub(false, "table","unhidecol", __ref, _col, _newsize);
RemoteObject _tmpwidths = null;
int _i = 0;
Debug.locals.put("col", _col);
Debug.locals.put("newSize", _newsize);
 BA.debugLineNum = 1112;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1113;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
Debug.ShouldStop(16777216);
_tmpwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getFieldClass("b4a.example.table", false,"_savedwidths").getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("tmpWidths", _tmpwidths);
 BA.debugLineNum = 1114;BA.debugLine="For i=0 To SavedWidths.Length-1";
Debug.ShouldStop(33554432);
{
final int step801 = 1;
final int limit801 = RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_savedwidths").getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step801 > 0 && _i <= limit801) || (step801 < 0 && _i >= limit801); _i = ((int)(0 + _i + step801))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1115;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
Debug.ShouldStop(67108864);
_tmpwidths.setArrayElement (__ref.getFieldClass("b4a.example.table", false,"_savedwidths").getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1117;BA.debugLine="tmpWidths(col) = newSize";
Debug.ShouldStop(268435456);
_tmpwidths.setArrayElement (_newsize,_col);
 BA.debugLineNum = 1118;BA.debugLine="SetColumnsWidths(tmpWidths)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.table.class, "_setcolumnswidths",(Object)(_tmpwidths));
 BA.debugLineNum = 1119;BA.debugLine="End Sub";
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
public static RemoteObject  _updateiplocation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("updateIPLocation (table) ","table",1,__ref.getField(false, "ba"),__ref,1133);
if (RapidSub.canDelegate("updateiplocation")) return __ref.runUserSub(false, "table","updateiplocation", __ref);
 BA.debugLineNum = 1133;BA.debugLine="Private Sub updateIPLocation";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1134;BA.debugLine="If (SV.Height > Data.Size * cRowHeight) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean(">",__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1))))) { 
 BA.debugLineNum = 1136;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cRowHeight";
Debug.ShouldStop(32768);
__ref.getFieldClass("b4a.example.table", false,"_internalpanel").runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),__ref.getFieldClass("b4a.example.table", true,"_crowheight"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*+",1, 1));
 BA.debugLineNum = 1137;BA.debugLine="internalPanel.Height = SV.Height - (Data.Size * cRowHeight)";
Debug.ShouldStop(65536);
__ref.getFieldClass("b4a.example.table", false,"_internalpanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_sv").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),__ref.getFieldClass("b4a.example.table", true,"_crowheight")}, "*",0, 1))}, "-",1, 1));
 }else {
 BA.debugLineNum = 1139;BA.debugLine="internalPanel.Height = 0";
Debug.ShouldStop(262144);
__ref.getFieldClass("b4a.example.table", false,"_internalpanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 1141;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterow(RemoteObject __ref,RemoteObject _row,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("UpdateRow (table) ","table",1,__ref.getField(false, "ba"),__ref,1036);
if (RapidSub.canDelegate("updaterow")) return __ref.runUserSub(false, "table","updaterow", __ref, _row, _values);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 1036;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As String) As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1037;BA.debugLine="Dim i As Int";
Debug.ShouldStop(4096);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1038;BA.debugLine="If (Values.Length <> NumberOfColumns OR Row <0 OR Row>Data.Size-1) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("!",_values.getField(true,"length"),BA.numberCast(double.class, __ref.getFieldClass("b4a.example.table", true,"_numberofcolumns"))) || RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_row,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("b4a.example.table", false,"_data").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))))) { 
 BA.debugLineNum = 1039;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) return table.__c.getField(true,"False");
 };
 BA.debugLineNum = 1041;BA.debugLine="For i=0 To Values.Length-1";
Debug.ShouldStop(65536);
{
final int step750 = 1;
final int limit750 = RemoteObject.solve(new RemoteObject[] {_values.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step750 > 0 && _i.<Integer>get().intValue() <= limit750) || (step750 < 0 && _i.<Integer>get().intValue() >= limit750); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step750))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1042;BA.debugLine="SetValue(i,Row,Values(i))";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.table.class, "_setvalue",(Object)(_i),(Object)(_row),(Object)(_values.getArrayElement(true,_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1044;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return table.__c.getField(true,"True");
 BA.debugLineNum = 1045;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}