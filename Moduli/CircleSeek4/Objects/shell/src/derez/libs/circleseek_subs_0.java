package derez.libs;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class circleseek_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "circleseek","asview", __ref);
 BA.debugLineNum = 82;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Return Cbase";
Debug.ShouldStop(262144);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getFieldClass("derez.libs.circleseek", false,"_cbase").getObject());
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbase_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Cbase_Touch (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("cbase_touch")) return __ref.runUserSub(false, "circleseek","cbase_touch", __ref, _action, _x, _y);
RemoteObject _teta = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 86;BA.debugLine="Private Sub Cbase_Touch (Action As Int, X As Float, Y As Float) As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim teta As Float = RtoAngle(X,Y)";
Debug.ShouldStop(4194304);
_teta = __ref.runClassMethod (derez.libs.circleseek.class, "_rtoangle",(Object)(_x),(Object)(_y));Debug.locals.put("teta", _teta);Debug.locals.put("teta", _teta);
 BA.debugLineNum = 88;BA.debugLine="If teta > 0 AND teta < 270 Then DrawPosition(teta, True)";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_teta,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_teta,BA.numberCast(double.class, 270))) { 
__ref.runClassMethod (derez.libs.circleseek.class, "_drawposition",(Object)(BA.numberCast(int.class, _teta)),(Object)(circleseek.__c.getField(true,"True")));};
 BA.debugLineNum = 89;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return circleseek.__c.getField(true,"True");
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private first As Boolean = True";
circleseek._first = circleseek.__c.getField(true,"True");__ref.setFieldClass("derez.libs.circleseek","_first",circleseek._first);
 //BA.debugLineNum = 7;BA.debugLine="Private Cwith As Int";
circleseek._cwith = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_cwith",circleseek._cwith);
 //BA.debugLineNum = 8;BA.debugLine="Private cnvs As Canvas";
circleseek._cnvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setFieldClass("derez.libs.circleseek","_cnvs",circleseek._cnvs);
 //BA.debugLineNum = 9;BA.debugLine="Private difbase(4),difside(4), ds  As Float";
circleseek._difbase = RemoteObject.createNewArray ("float", new int[] {4}, new Object[]{});__ref.setFieldClass("derez.libs.circleseek","_difbase",circleseek._difbase);
circleseek._difside = RemoteObject.createNewArray ("float", new int[] {4}, new Object[]{});__ref.setFieldClass("derez.libs.circleseek","_difside",circleseek._difside);
circleseek._ds = RemoteObject.createImmutable(0f);__ref.setFieldClass("derez.libs.circleseek","_ds",circleseek._ds);
 //BA.debugLineNum = 10;BA.debugLine="Private cx,cy,S, resbase(),resside(), rescnt() As Int";
circleseek._cx = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_cx",circleseek._cx);
circleseek._cy = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_cy",circleseek._cy);
circleseek._s = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_s",circleseek._s);
circleseek._resbase = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("derez.libs.circleseek","_resbase",circleseek._resbase);
circleseek._resside = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("derez.libs.circleseek","_resside",circleseek._resside);
circleseek._rescnt = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setFieldClass("derez.libs.circleseek","_rescnt",circleseek._rescnt);
 //BA.debugLineNum = 11;BA.debugLine="Private maxv, position As Double";
circleseek._maxv = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_maxv",circleseek._maxv);
circleseek._position = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_position",circleseek._position);
 //BA.debugLineNum = 12;BA.debugLine="Private basecolor,sliderside,slidercnt  As Int";
circleseek._basecolor = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_basecolor",circleseek._basecolor);
circleseek._sliderside = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_sliderside",circleseek._sliderside);
circleseek._slidercnt = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_slidercnt",circleseek._slidercnt);
 //BA.debugLineNum = 13;BA.debugLine="Private Cwith, Textcolor, Textsize As Int";
circleseek._cwith = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_cwith",circleseek._cwith);
circleseek._textcolor = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_textcolor",circleseek._textcolor);
circleseek._textsize = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.circleseek","_textsize",circleseek._textsize);
 //BA.debugLineNum = 14;BA.debugLine="Public NONE As Int = 0";
circleseek._none = BA.numberCast(int.class, 0);__ref.setFieldClass("derez.libs.circleseek","_none",circleseek._none);
 //BA.debugLineNum = 15;BA.debugLine="Public SHORT_KNOB As Int = 1";
circleseek._short_knob = BA.numberCast(int.class, 1);__ref.setFieldClass("derez.libs.circleseek","_short_knob",circleseek._short_knob);
 //BA.debugLineNum = 16;BA.debugLine="Public LONG_KNOB As Int = 2";
circleseek._long_knob = BA.numberCast(int.class, 2);__ref.setFieldClass("derez.libs.circleseek","_long_knob",circleseek._long_knob);
 //BA.debugLineNum = 17;BA.debugLine="Private Clabel As Label";
circleseek._clabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setFieldClass("derez.libs.circleseek","_clabel",circleseek._clabel);
 //BA.debugLineNum = 18;BA.debugLine="Private CModule As Object";
circleseek._cmodule = RemoteObject.createNew ("Object");__ref.setFieldClass("derez.libs.circleseek","_cmodule",circleseek._cmodule);
 //BA.debugLineNum = 19;BA.debugLine="Private  Cbase As Panel";
circleseek._cbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("derez.libs.circleseek","_cbase",circleseek._cbase);
 //BA.debugLineNum = 20;BA.debugLine="Private basepath, slidepath As Path";
circleseek._basepath = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");__ref.setFieldClass("derez.libs.circleseek","_basepath",circleseek._basepath);
circleseek._slidepath = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");__ref.setFieldClass("derez.libs.circleseek","_slidepath",circleseek._slidepath);
 //BA.debugLineNum = 21;BA.debugLine="Private R As Reflector";
circleseek._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");__ref.setFieldClass("derez.libs.circleseek","_r",circleseek._r);
 //BA.debugLineNum = 22;BA.debugLine="Private Event As String";
circleseek._event = RemoteObject.createImmutable("");__ref.setFieldClass("derez.libs.circleseek","_event",circleseek._event);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _codecreateview(RemoteObject __ref,RemoteObject _width,RemoteObject _height,RemoteObject _maxvalue,RemoteObject _withknob) throws Exception{
try {
		Debug.PushSubsStack("CodeCreateView (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("codecreateview")) return __ref.runUserSub(false, "circleseek","codecreateview", __ref, _width, _height, _maxvalue, _withknob);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("MaxValue", _maxvalue);
Debug.locals.put("WithKnob", _withknob);
 BA.debugLineNum = 35;BA.debugLine="Public Sub CodeCreateView(Width As Int ,Height As Int, MaxValue As Int, WithKnob As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="maxv = MaxValue";
Debug.ShouldStop(8);
__ref.setFieldClass("derez.libs.circleseek", "_maxv",BA.numberCast(double.class, _maxvalue));
 BA.debugLineNum = 37;BA.debugLine="Cbase.Initialize(\"Cbase\")";
Debug.ShouldStop(16);
__ref.getFieldClass("derez.libs.circleseek", false,"_cbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Cbase")));
 BA.debugLineNum = 38;BA.debugLine="Cwith = WithKnob";
Debug.ShouldStop(32);
__ref.setFieldClass("derez.libs.circleseek", "_cwith",_withknob);
 BA.debugLineNum = 39;BA.debugLine="ContinueCreation";
Debug.ShouldStop(64);
__ref.runClassMethod (derez.libs.circleseek.class, "_continuecreation");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
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
public static RemoteObject  _continuecreation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ContinueCreation (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("continuecreation")) return __ref.runUserSub(false, "circleseek","continuecreation", __ref);
 BA.debugLineNum = 53;BA.debugLine="Private Sub ContinueCreation";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="setColors(Colors.Gray, Colors.DarkGray,Colors.LightGray, Colors.white, 24)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (derez.libs.circleseek.class, "_setcolors",(Object)(circleseek.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(circleseek.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(circleseek.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(circleseek.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 24)));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
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
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("designercreateview")) return __ref.runUserSub(false, "circleseek","designercreateview", __ref, _base, _lbl, _props);
Debug.locals.put("base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 43;BA.debugLine="Private Sub DesignerCreateView(base As Panel, Lbl As Label, Props As Map)'ignore";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="S = Min(Lbl.Width, Lbl.Height)";
Debug.ShouldStop(2048);
__ref.setFieldClass("derez.libs.circleseek", "_s",BA.numberCast(int.class, circleseek.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _lbl.runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, _lbl.runMethod(true,"getHeight"))))));
 BA.debugLineNum = 45;BA.debugLine="ds = 0.005 * S";
Debug.ShouldStop(4096);
__ref.setFieldClass("derez.libs.circleseek", "_ds",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.005),__ref.getFieldClass("derez.libs.circleseek", true,"_s")}, "*",0, 0)));
 BA.debugLineNum = 46;BA.debugLine="Cbase.Initialize(\"Cbase\")";
Debug.ShouldStop(8192);
__ref.getFieldClass("derez.libs.circleseek", false,"_cbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Cbase")));
 BA.debugLineNum = 47;BA.debugLine="base.AddView(Cbase,0,0,S,S)";
Debug.ShouldStop(16384);
_base.runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.circleseek", false,"_cbase").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getFieldClass("derez.libs.circleseek", true,"_s")),(Object)(__ref.getFieldClass("derez.libs.circleseek", true,"_s")));
 BA.debugLineNum = 48;BA.debugLine="maxv = Lbl.text";
Debug.ShouldStop(32768);
__ref.setFieldClass("derez.libs.circleseek", "_maxv",BA.numberCast(double.class, _lbl.runMethod(true,"getText")));
 BA.debugLineNum = 49;BA.debugLine="Cwith =  Lbl.Tag";
Debug.ShouldStop(65536);
__ref.setFieldClass("derez.libs.circleseek", "_cwith",BA.numberCast(int.class, _lbl.runMethod(false,"getTag")));
 BA.debugLineNum = 50;BA.debugLine="ContinueCreation";
Debug.ShouldStop(131072);
__ref.runClassMethod (derez.libs.circleseek.class, "_continuecreation");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
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
public static RemoteObject  _drawbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawBase (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("drawbase")) return __ref.runUserSub(false, "circleseek","drawbase", __ref);
RemoteObject _clr = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 141;BA.debugLine="Private Sub DrawBase";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(8192);
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 143;BA.debugLine="cnvs.ClipPath(basepath)";
Debug.ShouldStop(16384);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("ClipPath",(Object)((__ref.getFieldClass("derez.libs.circleseek", false,"_basepath").getObject())));
 BA.debugLineNum = 144;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(32768);
{
final int step110 = 1;
final int limit110 = 10;
for (_i = 1; (step110 > 0 && _i <= limit110) || (step110 < 0 && _i >= limit110); _i = ((int)(0 + _i + step110))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 145;BA.debugLine="clr = Colors.rgb(resbase(1)+i*difbase(1),resbase(2)+i*difbase(2),resbase(3)+i*difbase(3))";
Debug.ShouldStop(65536);
_clr = circleseek.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_resbase").getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", false,"_difbase").getArrayElement(true,BA.numberCast(int.class, 1))}, "+*",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_resbase").getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", false,"_difbase").getArrayElement(true,BA.numberCast(int.class, 2))}, "+*",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_resbase").getArrayElement(true,BA.numberCast(int.class, 3)),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", false,"_difbase").getArrayElement(true,BA.numberCast(int.class, 3))}, "+*",1, 0))));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 146;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.5 -i*ds, clr, False, 2)";
Debug.ShouldStop(131072);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.5),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", true,"_ds")}, "*-*",1, 0))),(Object)(_clr),(Object)(circleseek.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, 2)));
 BA.debugLineNum = 147;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.4 +i*ds, clr, False, 2)";
Debug.ShouldStop(262144);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.4),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", true,"_ds")}, "*+*",1, 0))),(Object)(_clr),(Object)(circleseek.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, 2)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
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
public static RemoteObject  _drawposition(RemoteObject __ref,RemoteObject _angle,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("DrawPosition (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("drawposition")) return __ref.runUserSub(false, "circleseek","drawposition", __ref, _angle, _userchanged);
RemoteObject _k = RemoteObject.createImmutable(0);
Debug.locals.put("Angle", _angle);
Debug.locals.put("userchanged", _userchanged);
 BA.debugLineNum = 128;BA.debugLine="Private Sub DrawPosition(Angle As Int, userchanged As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="DrawBase";
Debug.ShouldStop(1);
__ref.runClassMethod (derez.libs.circleseek.class, "_drawbase");
 BA.debugLineNum = 130;BA.debugLine="DrawSlider(Angle)";
Debug.ShouldStop(2);
__ref.runClassMethod (derez.libs.circleseek.class, "_drawslider",(Object)(BA.numberCast(float.class, _angle)));
 BA.debugLineNum = 131;BA.debugLine="position = Angle * maxv / 270";
Debug.ShouldStop(4);
__ref.setFieldClass("derez.libs.circleseek", "_position",RemoteObject.solve(new RemoteObject[] {_angle,__ref.getFieldClass("derez.libs.circleseek", true,"_maxv"),RemoteObject.createImmutable(270)}, "*/",0, 0));
 BA.debugLineNum = 132;BA.debugLine="Clabel.Text = NumberFormat(position,0,0)";
Debug.ShouldStop(8);
__ref.getFieldClass("derez.libs.circleseek", false,"_clabel").runMethod(true,"setText",(circleseek.__c.runMethod(true,"NumberFormat",(Object)(__ref.getFieldClass("derez.libs.circleseek", true,"_position")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 133;BA.debugLine="Cbase.Invalidate";
Debug.ShouldStop(16);
__ref.getFieldClass("derez.libs.circleseek", false,"_cbase").runVoidMethod ("Invalidate");
 BA.debugLineNum = 134;BA.debugLine="cnvs.RemoveClip";
Debug.ShouldStop(32);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("RemoveClip");
 BA.debugLineNum = 135;BA.debugLine="Dim k As Int = position";
Debug.ShouldStop(64);
_k = BA.numberCast(int.class, __ref.getFieldClass("derez.libs.circleseek", true,"_position"));Debug.locals.put("k", _k);Debug.locals.put("k", _k);
 BA.debugLineNum = 136;BA.debugLine="If SubExists(CModule, Event & \"_ValueChanged\") Then";
Debug.ShouldStop(128);
if (circleseek.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("derez.libs.circleseek", false,"_cmodule")),(Object)(RemoteObject.concat(__ref.getFieldClass("derez.libs.circleseek", true,"_event"),RemoteObject.createImmutable("_ValueChanged")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 137;BA.debugLine="CallSub3(CModule, Event & \"_ValueChanged\",k, userchanged )";
Debug.ShouldStop(256);
circleseek.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("derez.libs.circleseek", false,"_cmodule")),(Object)(RemoteObject.concat(__ref.getFieldClass("derez.libs.circleseek", true,"_event"),RemoteObject.createImmutable("_ValueChanged"))),(Object)((_k)),(Object)((_userchanged)));
 };
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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
public static RemoteObject  _drawslider(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("DrawSlider (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("drawslider")) return __ref.runUserSub(false, "circleseek","drawslider", __ref, _angle);
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _point = null;
int _i = 0;
RemoteObject _p1 = null;
RemoteObject _p2 = null;
RemoteObject _dk = RemoteObject.createImmutable(0f);
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 151;BA.debugLine="Private Sub DrawSlider(angle As Float)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(8388608);
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 153;BA.debugLine="slidepath.Initialize(0,S)";
Debug.ShouldStop(16777216);
__ref.getFieldClass("derez.libs.circleseek", false,"_slidepath").runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_s"))));
 BA.debugLineNum = 154;BA.debugLine="If angle > 90 Then slidepath.LineTo(0,0)";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_angle,BA.numberCast(double.class, 90))) { 
__ref.getFieldClass("derez.libs.circleseek", false,"_slidepath").runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));};
 BA.debugLineNum = 155;BA.debugLine="If angle > 180 Then slidepath.LineTo(S,0)";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_angle,BA.numberCast(double.class, 180))) { 
__ref.getFieldClass("derez.libs.circleseek", false,"_slidepath").runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_s"))),(Object)(BA.numberCast(float.class, 0)));};
 BA.debugLineNum = 156;BA.debugLine="Dim point(2) As Float = PtoR(angle , 2*cx)";
Debug.ShouldStop(134217728);
_point = __ref.runClassMethod (derez.libs.circleseek.class, "_ptor",(Object)(_angle),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),__ref.getFieldClass("derez.libs.circleseek", true,"_cx")}, "*",0, 1))));Debug.locals.put("point", _point);Debug.locals.put("point", _point);
 BA.debugLineNum = 157;BA.debugLine="slidepath.LineTo(point(0),point(1))";
Debug.ShouldStop(268435456);
__ref.getFieldClass("derez.libs.circleseek", false,"_slidepath").runVoidMethod ("LineTo",(Object)(_point.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_point.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 158;BA.debugLine="slidepath.LineTo(cx,cy)";
Debug.ShouldStop(536870912);
__ref.getFieldClass("derez.libs.circleseek", false,"_slidepath").runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))));
 BA.debugLineNum = 159;BA.debugLine="cnvs.ClipPath(slidepath)";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("ClipPath",(Object)((__ref.getFieldClass("derez.libs.circleseek", false,"_slidepath").getObject())));
 BA.debugLineNum = 161;BA.debugLine="For i = 1 To 10  ' Draws the slider circle";
Debug.ShouldStop(1);
{
final int step125 = 1;
final int limit125 = 10;
for (_i = 1; (step125 > 0 && _i <= limit125) || (step125 < 0 && _i >= limit125); _i = ((int)(0 + _i + step125))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 162;BA.debugLine="clr = Colors.rgb(resside(1)+i*difside(1),resside(2)+i*difside(2),resside(3)+i*difside(3))";
Debug.ShouldStop(2);
_clr = circleseek.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_resside").getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", false,"_difside").getArrayElement(true,BA.numberCast(int.class, 1))}, "+*",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_resside").getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", false,"_difside").getArrayElement(true,BA.numberCast(int.class, 2))}, "+*",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_resside").getArrayElement(true,BA.numberCast(int.class, 3)),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", false,"_difside").getArrayElement(true,BA.numberCast(int.class, 3))}, "+*",1, 0))));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 163;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.5 -i*ds, clr, False, 2)";
Debug.ShouldStop(4);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.5),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", true,"_ds")}, "*-*",1, 0))),(Object)(_clr),(Object)(circleseek.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, 2)));
 BA.debugLineNum = 164;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.4 +i*ds, clr, False, 2)";
Debug.ShouldStop(8);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.4),RemoteObject.createImmutable(_i),__ref.getFieldClass("derez.libs.circleseek", true,"_ds")}, "*+*",1, 0))),(Object)(_clr),(Object)(circleseek.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, 2)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 166;BA.debugLine="cnvs.RemoveClip";
Debug.ShouldStop(32);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("RemoveClip");
 BA.debugLineNum = 167;BA.debugLine="Select Cwith";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(__ref.getFieldClass("derez.libs.circleseek", true,"_cwith"),__ref.getFieldClass("derez.libs.circleseek", true,"_none"),__ref.getFieldClass("derez.libs.circleseek", true,"_short_knob"),__ref.getFieldClass("derez.libs.circleseek", true,"_long_knob"))) {
case 0:
 break;
case 1:
 BA.debugLineNum = 172;BA.debugLine="Dim p1(2), p2(2), dk  As Float";
Debug.ShouldStop(2048);
_p1 = RemoteObject.createNewArray ("float", new int[] {2}, new Object[]{});Debug.locals.put("p1", _p1);
_p2 = RemoteObject.createNewArray ("float", new int[] {2}, new Object[]{});Debug.locals.put("p2", _p2);
_dk = RemoteObject.createImmutable(0f);Debug.locals.put("dk", _dk);
 BA.debugLineNum = 173;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(4096);
{
final int step135 = 1;
final int limit135 = 10;
for (_i = 1; (step135 > 0 && _i <= limit135) || (step135 < 0 && _i >= limit135); _i = ((int)(0 + _i + step135))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 174;BA.debugLine="dk = -7+i*0.7";
Debug.ShouldStop(8192);
_dk = BA.numberCast(float.class, -(double) (0 + 7)+(double) (0 + _i)*0.7);Debug.locals.put("dk", _dk);
 BA.debugLineNum = 175;BA.debugLine="p1 = PtoR(angle+dk , S*0.5)";
Debug.ShouldStop(16384);
_p1 = __ref.runClassMethod (derez.libs.circleseek.class, "_ptor",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_angle,_dk}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.5)}, "*",0, 0))));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 176;BA.debugLine="p2 = PtoR(angle+dk , S*0.4)";
Debug.ShouldStop(32768);
_p2 = __ref.runClassMethod (derez.libs.circleseek.class, "_ptor",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_angle,_dk}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.4)}, "*",0, 0))));Debug.locals.put("p2", _p2);
 BA.debugLineNum = 177;BA.debugLine="clr = Colors.RGB(i*25,i*25,i*25) 'from black to white";
Debug.ShouldStop(65536);
_clr = circleseek.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(25)}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(25)}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(25)}, "*",0, 1)));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 178;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),p2(0),p2(1),clr,1)";
Debug.ShouldStop(131072);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawLine",(Object)(_p1.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_p1.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(_p2.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_p2.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(_clr),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 179;BA.debugLine="p1 = PtoR(angle-dk , S*0.5)";
Debug.ShouldStop(262144);
_p1 = __ref.runClassMethod (derez.libs.circleseek.class, "_ptor",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_angle,_dk}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.5)}, "*",0, 0))));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 180;BA.debugLine="p2 = PtoR(angle-dk , S*0.4)";
Debug.ShouldStop(524288);
_p2 = __ref.runClassMethod (derez.libs.circleseek.class, "_ptor",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_angle,_dk}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.4)}, "*",0, 0))));Debug.locals.put("p2", _p2);
 BA.debugLineNum = 181;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),p2(0),p2(1),clr,1)";
Debug.ShouldStop(1048576);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawLine",(Object)(_p1.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_p1.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(_p2.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_p2.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(_clr),(Object)(BA.numberCast(float.class, 1)));
 }
}Debug.locals.put("i", _i);
;
 break;
case 2:
 BA.debugLineNum = 185;BA.debugLine="Dim p1(2), dk  As Float";
Debug.ShouldStop(16777216);
_p1 = RemoteObject.createNewArray ("float", new int[] {2}, new Object[]{});Debug.locals.put("p1", _p1);
_dk = RemoteObject.createImmutable(0f);Debug.locals.put("dk", _dk);
 BA.debugLineNum = 186;BA.debugLine="cnvs.ClipPath(basepath)";
Debug.ShouldStop(33554432);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("ClipPath",(Object)((__ref.getFieldClass("derez.libs.circleseek", false,"_basepath").getObject())));
 BA.debugLineNum = 187;BA.debugLine="clr = cnvs.Bitmap.GetPixel(1dip,1dip)";
Debug.ShouldStop(67108864);
_clr = __ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runMethod(false,"getBitmap").runMethod(true,"GetPixel",(Object)(circleseek.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(circleseek.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 188;BA.debugLine="cnvs.DrawCircle(cx,cy,S*0.4,clr,True,1) ' erase the previous arrow";
Debug.ShouldStop(134217728);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.4)}, "*",0, 0))),(Object)(_clr),(Object)(circleseek.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 189;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(268435456);
{
final int step150 = 1;
final int limit150 = 10;
for (_i = 1; (step150 > 0 && _i <= limit150) || (step150 < 0 && _i >= limit150); _i = ((int)(0 + _i + step150))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 190;BA.debugLine="dk = -7+i*0.7";
Debug.ShouldStop(536870912);
_dk = BA.numberCast(float.class, -(double) (0 + 7)+(double) (0 + _i)*0.7);Debug.locals.put("dk", _dk);
 BA.debugLineNum = 191;BA.debugLine="p1 = PtoR(angle+dk , S*0.5)";
Debug.ShouldStop(1073741824);
_p1 = __ref.runClassMethod (derez.libs.circleseek.class, "_ptor",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_angle,_dk}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.5)}, "*",0, 0))));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 192;BA.debugLine="clr = Colors.RGB(i*25,i*25,i*25) 'from black to white";
Debug.ShouldStop(-2147483648);
_clr = circleseek.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(25)}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(25)}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(25)}, "*",0, 1)));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 193;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),cx,cy,clr,1)";
Debug.ShouldStop(1);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawLine",(Object)(_p1.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_p1.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))),(Object)(_clr),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 194;BA.debugLine="p1 = PtoR(angle-dk , S*0.5)";
Debug.ShouldStop(2);
_p1 = __ref.runClassMethod (derez.libs.circleseek.class, "_ptor",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_angle,_dk}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(0.5)}, "*",0, 0))));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 195;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),cx,cy,clr,1)";
Debug.ShouldStop(4);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("DrawLine",(Object)(_p1.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_p1.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))),(Object)(_clr),(Object)(BA.numberCast(float.class, 1)));
 }
}Debug.locals.put("i", _i);
;
 break;
default:
 break;
}
;
 BA.debugLineNum = 201;BA.debugLine="End Sub";
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
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("getvalue")) return __ref.runUserSub(false, "circleseek","getvalue", __ref);
 BA.debugLineNum = 124;BA.debugLine="Sub getValue As Double";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Return position";
Debug.ShouldStop(268435456);
if (true) return __ref.getFieldClass("derez.libs.circleseek", true,"_position");
 BA.debugLineNum = 126;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _module,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "circleseek","initialize", __ref, _ba, _module, _eventname);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("Eventname", _eventname);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize(Module As Object, Eventname As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="CModule = Module";
Debug.ShouldStop(134217728);
__ref.setFieldClass("derez.libs.circleseek", "_cmodule",_module);
 BA.debugLineNum = 29;BA.debugLine="Event = Eventname";
Debug.ShouldStop(268435456);
__ref.setFieldClass("derez.libs.circleseek", "_event",_eventname);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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
public static RemoteObject  _parsecolor(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ParseColor (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("parsecolor")) return __ref.runUserSub(false, "circleseek","parsecolor", __ref, _clr);
RemoteObject _res = null;
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 223;BA.debugLine="Private Sub ParseColor(clr As Int) As Int()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="Dim res(4) As Int";
Debug.ShouldStop(-2147483648);
_res = RemoteObject.createNewArray ("int", new int[] {4}, new Object[]{});Debug.locals.put("res", _res);
 BA.debugLineNum = 225;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff000000), 24) ' alfa";
Debug.ShouldStop(1);
_res.setArrayElement (circleseek.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(circleseek.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_clr),(Object)(BA.numberCast(int.class, 0xff000000)))),(Object)(BA.numberCast(int.class, 24))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 226;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff0000), 16)   ' R";
Debug.ShouldStop(2);
_res.setArrayElement (circleseek.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(circleseek.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_clr),(Object)(BA.numberCast(int.class, 0xff0000)))),(Object)(BA.numberCast(int.class, 16))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 227;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff00), 8)      ' G";
Debug.ShouldStop(4);
_res.setArrayElement (circleseek.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(circleseek.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_clr),(Object)(BA.numberCast(int.class, 0xff00)))),(Object)(BA.numberCast(int.class, 8))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 228;BA.debugLine="res(3) = Bit.AND(clr, 0xff)  ' B";
Debug.ShouldStop(8);
_res.setArrayElement (circleseek.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_clr),(Object)(BA.numberCast(int.class, 0xff))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 229;BA.debugLine="Return res";
Debug.ShouldStop(16);
if (true) return _res;
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ptor(RemoteObject __ref,RemoteObject _alfa,RemoteObject _rad) throws Exception{
try {
		Debug.PushSubsStack("PtoR (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("ptor")) return __ref.runUserSub(false, "circleseek","ptor", __ref, _alfa, _rad);
RemoteObject _point = null;
Debug.locals.put("alfa", _alfa);
Debug.locals.put("Rad", _rad);
 BA.debugLineNum = 203;BA.debugLine="Private Sub PtoR(alfa As Float, Rad As Float) As Float()";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Dim point(2) As Float";
Debug.ShouldStop(2048);
_point = RemoteObject.createNewArray ("float", new int[] {2}, new Object[]{});Debug.locals.put("point", _point);
 BA.debugLineNum = 205;BA.debugLine="point(0) = cx + Rad * SinD(alfa - 135)";
Debug.ShouldStop(4096);
_point.setArrayElement (BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_cx"),_rad,circleseek.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_alfa,RemoteObject.createImmutable(135)}, "-",1, 0)))}, "+*",1, 0)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 206;BA.debugLine="point(1) = cy - Rad * CosD(alfa - 135)";
Debug.ShouldStop(8192);
_point.setArrayElement (BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_cy"),_rad,circleseek.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {_alfa,RemoteObject.createImmutable(135)}, "-",1, 0)))}, "-*",1, 0)),BA.numberCast(int.class, 1));
 BA.debugLineNum = 207;BA.debugLine="Return point";
Debug.ShouldStop(16384);
if (true) return _point;
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rtoangle(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("RtoAngle (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("rtoangle")) return __ref.runUserSub(false, "circleseek","rtoangle", __ref, _x, _y);
RemoteObject _teta = RemoteObject.createImmutable(0f);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 211;BA.debugLine="Private Sub RtoAngle(X As Float, Y As Float) As Float";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="Dim teta As Float";
Debug.ShouldStop(524288);
_teta = RemoteObject.createImmutable(0f);Debug.locals.put("teta", _teta);
 BA.debugLineNum = 213;BA.debugLine="If Y <> 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_y,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 214;BA.debugLine="teta = ATan2D((X-cx),(cy-Y)) + 135";
Debug.ShouldStop(2097152);
_teta = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {circleseek.__c.runMethod(true,"ATan2D",(Object)((RemoteObject.solve(new RemoteObject[] {_x,__ref.getFieldClass("derez.libs.circleseek", true,"_cx")}, "-",1, 0))),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_cy"),_y}, "-",1, 0)))),RemoteObject.createImmutable(135)}, "+",1, 0));Debug.locals.put("teta", _teta);
 }else {
 BA.debugLineNum = 216;BA.debugLine="If (X-cx) > 0 Then teta = 235 Else teta = 45";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {_x,__ref.getFieldClass("derez.libs.circleseek", true,"_cx")}, "-",1, 0)),BA.numberCast(double.class, 0))) { 
_teta = BA.numberCast(float.class, 235);Debug.locals.put("teta", _teta);}
else {
_teta = BA.numberCast(float.class, 45);Debug.locals.put("teta", _teta);};
 };
 BA.debugLineNum = 218;BA.debugLine="Return teta";
Debug.ShouldStop(33554432);
if (true) return _teta;
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolors(RemoteObject __ref,RemoteObject _base_color,RemoteObject _slider_color_side,RemoteObject _slider_color_cnt,RemoteObject _text_color,RemoteObject _text_size) throws Exception{
try {
		Debug.PushSubsStack("setColors (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setcolors")) return __ref.runUserSub(false, "circleseek","setcolors", __ref, _base_color, _slider_color_side, _slider_color_cnt, _text_color, _text_size);
Debug.locals.put("base_color", _base_color);
Debug.locals.put("slider_color_side", _slider_color_side);
Debug.locals.put("slider_color_cnt", _slider_color_cnt);
Debug.locals.put("Text_color", _text_color);
Debug.locals.put("Text_size", _text_size);
 BA.debugLineNum = 59;BA.debugLine="Public Sub setColors(base_color As Int,slider_color_side As Int,slider_color_cnt As Int, Text_color As Int, Text_size As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="basecolor = base_color";
Debug.ShouldStop(134217728);
__ref.setFieldClass("derez.libs.circleseek", "_basecolor",_base_color);
 BA.debugLineNum = 61;BA.debugLine="sliderside = slider_color_side";
Debug.ShouldStop(268435456);
__ref.setFieldClass("derez.libs.circleseek", "_sliderside",_slider_color_side);
 BA.debugLineNum = 62;BA.debugLine="slidercnt = slider_color_cnt";
Debug.ShouldStop(536870912);
__ref.setFieldClass("derez.libs.circleseek", "_slidercnt",_slider_color_cnt);
 BA.debugLineNum = 63;BA.debugLine="Textcolor = Text_color";
Debug.ShouldStop(1073741824);
__ref.setFieldClass("derez.libs.circleseek", "_textcolor",_text_color);
 BA.debugLineNum = 64;BA.debugLine="Textsize = Text_size";
Debug.ShouldStop(-2147483648);
__ref.setFieldClass("derez.libs.circleseek", "_textsize",_text_size);
 BA.debugLineNum = 66;BA.debugLine="resbase = ParseColor(basecolor)";
Debug.ShouldStop(2);
__ref.setFieldClass("derez.libs.circleseek", "_resbase",__ref.runClassMethod (derez.libs.circleseek.class, "_parsecolor",(Object)(__ref.getFieldClass("derez.libs.circleseek", true,"_basecolor"))));
 BA.debugLineNum = 68;BA.debugLine="difbase(1) = (255-resbase(1))/10";
Debug.ShouldStop(8);
__ref.getFieldClass("derez.libs.circleseek", false,"_difbase").setArrayElement (BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),__ref.getFieldClass("derez.libs.circleseek", false,"_resbase").getArrayElement(true,BA.numberCast(int.class, 1))}, "-",1, 1)),RemoteObject.createImmutable(10)}, "/",0, 0)),BA.numberCast(int.class, 1));
 BA.debugLineNum = 69;BA.debugLine="difbase(2) = (255-resbase(2))/10";
Debug.ShouldStop(16);
__ref.getFieldClass("derez.libs.circleseek", false,"_difbase").setArrayElement (BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),__ref.getFieldClass("derez.libs.circleseek", false,"_resbase").getArrayElement(true,BA.numberCast(int.class, 2))}, "-",1, 1)),RemoteObject.createImmutable(10)}, "/",0, 0)),BA.numberCast(int.class, 2));
 BA.debugLineNum = 70;BA.debugLine="difbase(3) = (255-resbase(3))/10";
Debug.ShouldStop(32);
__ref.getFieldClass("derez.libs.circleseek", false,"_difbase").setArrayElement (BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),__ref.getFieldClass("derez.libs.circleseek", false,"_resbase").getArrayElement(true,BA.numberCast(int.class, 3))}, "-",1, 1)),RemoteObject.createImmutable(10)}, "/",0, 0)),BA.numberCast(int.class, 3));
 BA.debugLineNum = 72;BA.debugLine="rescnt = ParseColor(slidercnt)";
Debug.ShouldStop(128);
__ref.setFieldClass("derez.libs.circleseek", "_rescnt",__ref.runClassMethod (derez.libs.circleseek.class, "_parsecolor",(Object)(__ref.getFieldClass("derez.libs.circleseek", true,"_slidercnt"))));
 BA.debugLineNum = 73;BA.debugLine="resside = ParseColor(sliderside)";
Debug.ShouldStop(256);
__ref.setFieldClass("derez.libs.circleseek", "_resside",__ref.runClassMethod (derez.libs.circleseek.class, "_parsecolor",(Object)(__ref.getFieldClass("derez.libs.circleseek", true,"_sliderside"))));
 BA.debugLineNum = 75;BA.debugLine="difside(1) = (rescnt(1)-resside(1))/10";
Debug.ShouldStop(1024);
__ref.getFieldClass("derez.libs.circleseek", false,"_difside").setArrayElement (BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_rescnt").getArrayElement(true,BA.numberCast(int.class, 1)),__ref.getFieldClass("derez.libs.circleseek", false,"_resside").getArrayElement(true,BA.numberCast(int.class, 1))}, "-",1, 1)),RemoteObject.createImmutable(10)}, "/",0, 0)),BA.numberCast(int.class, 1));
 BA.debugLineNum = 76;BA.debugLine="difside(2) = (rescnt(2)-resside(2))/10";
Debug.ShouldStop(2048);
__ref.getFieldClass("derez.libs.circleseek", false,"_difside").setArrayElement (BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_rescnt").getArrayElement(true,BA.numberCast(int.class, 2)),__ref.getFieldClass("derez.libs.circleseek", false,"_resside").getArrayElement(true,BA.numberCast(int.class, 2))}, "-",1, 1)),RemoteObject.createImmutable(10)}, "/",0, 0)),BA.numberCast(int.class, 2));
 BA.debugLineNum = 77;BA.debugLine="difside(3) = (rescnt(3)-resside(3))/10";
Debug.ShouldStop(4096);
__ref.getFieldClass("derez.libs.circleseek", false,"_difside").setArrayElement (BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", false,"_rescnt").getArrayElement(true,BA.numberCast(int.class, 3)),__ref.getFieldClass("derez.libs.circleseek", false,"_resside").getArrayElement(true,BA.numberCast(int.class, 3))}, "-",1, 1)),RemoteObject.createImmutable(10)}, "/",0, 0)),BA.numberCast(int.class, 3));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setValue (circleseek) ","circleseek",3,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setvalue")) return __ref.runUserSub(false, "circleseek","setvalue", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 94;BA.debugLine="Public Sub setValue(Value As Double)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="If first Then ' only after the new size of the view is known";
Debug.ShouldStop(1073741824);
if (__ref.getFieldClass("derez.libs.circleseek", true,"_first").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="cnvs.Initialize(Cbase)";
Debug.ShouldStop(-2147483648);
__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs").runVoidMethod ("Initialize",(Object)((__ref.getFieldClass("derez.libs.circleseek", false,"_cbase").getObject())));
 BA.debugLineNum = 97;BA.debugLine="R.Target = cnvs";
Debug.ShouldStop(1);
__ref.getFieldClass("derez.libs.circleseek", false,"_r").setField ("Target",(__ref.getFieldClass("derez.libs.circleseek", false,"_cnvs")));
 BA.debugLineNum = 98;BA.debugLine="R.Target = R.GetField(\"paint\")";
Debug.ShouldStop(2);
__ref.getFieldClass("derez.libs.circleseek", false,"_r").setField ("Target",__ref.getFieldClass("derez.libs.circleseek", false,"_r").runMethod(false,"GetField",(Object)(BA.ObjectToString("paint"))));
 BA.debugLineNum = 99;BA.debugLine="R.RunMethod2(\"setAntiAlias\", True, \"java.lang.boolean\")";
Debug.ShouldStop(4);
__ref.getFieldClass("derez.libs.circleseek", false,"_r").runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setAntiAlias")),(Object)(BA.ObjectToString(circleseek.__c.getField(true,"True"))),(Object)(BA.ObjectToString("java.lang.boolean")));
 BA.debugLineNum = 100;BA.debugLine="S = Min(Cbase.Width, Cbase.Height)";
Debug.ShouldStop(8);
__ref.setFieldClass("derez.libs.circleseek", "_s",BA.numberCast(int.class, circleseek.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getFieldClass("derez.libs.circleseek", false,"_cbase").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getFieldClass("derez.libs.circleseek", false,"_cbase").runMethod(true,"getHeight"))))));
 BA.debugLineNum = 101;BA.debugLine="ds = 0.005 * S";
Debug.ShouldStop(16);
__ref.setFieldClass("derez.libs.circleseek", "_ds",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.005),__ref.getFieldClass("derez.libs.circleseek", true,"_s")}, "*",0, 0)));
 BA.debugLineNum = 102;BA.debugLine="cx = S/2";
Debug.ShouldStop(32);
__ref.setFieldClass("derez.libs.circleseek", "_cx",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 103;BA.debugLine="cy = S/2";
Debug.ShouldStop(64);
__ref.setFieldClass("derez.libs.circleseek", "_cy",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 104;BA.debugLine="basepath.Initialize(0,S)";
Debug.ShouldStop(128);
__ref.getFieldClass("derez.libs.circleseek", false,"_basepath").runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_s"))));
 BA.debugLineNum = 105;BA.debugLine="basepath.LineTo(0,0)";
Debug.ShouldStop(256);
__ref.getFieldClass("derez.libs.circleseek", false,"_basepath").runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 106;BA.debugLine="basepath.LineTo(S,0)";
Debug.ShouldStop(512);
__ref.getFieldClass("derez.libs.circleseek", false,"_basepath").runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_s"))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 107;BA.debugLine="basepath.LineTo(S,S)";
Debug.ShouldStop(1024);
__ref.getFieldClass("derez.libs.circleseek", false,"_basepath").runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_s"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_s"))));
 BA.debugLineNum = 108;BA.debugLine="basepath.LineTo(cx,cy)";
Debug.ShouldStop(2048);
__ref.getFieldClass("derez.libs.circleseek", false,"_basepath").runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cx"))),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_cy"))));
 BA.debugLineNum = 109;BA.debugLine="basepath.LineTo(0,S)";
Debug.ShouldStop(4096);
__ref.getFieldClass("derez.libs.circleseek", false,"_basepath").runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_s"))));
 BA.debugLineNum = 111;BA.debugLine="Clabel.Initialize(\"\")";
Debug.ShouldStop(16384);
__ref.getFieldClass("derez.libs.circleseek", false,"_clabel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 112;BA.debugLine="Clabel.Color = Colors.Transparent";
Debug.ShouldStop(32768);
__ref.getFieldClass("derez.libs.circleseek", false,"_clabel").runVoidMethod ("setColor",circleseek.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 113;BA.debugLine="Clabel.Textcolor = Textcolor";
Debug.ShouldStop(65536);
__ref.getFieldClass("derez.libs.circleseek", false,"_clabel").runMethod(true,"setTextColor",__ref.getFieldClass("derez.libs.circleseek", true,"_textcolor"));
 BA.debugLineNum = 114;BA.debugLine="Clabel.Textsize = Textsize";
Debug.ShouldStop(131072);
__ref.getFieldClass("derez.libs.circleseek", false,"_clabel").runMethod(true,"setTextSize",BA.numberCast(float.class, __ref.getFieldClass("derez.libs.circleseek", true,"_textsize")));
 BA.debugLineNum = 115;BA.debugLine="Clabel.Gravity = Gravity.CENTER";
Debug.ShouldStop(262144);
__ref.getFieldClass("derez.libs.circleseek", false,"_clabel").runMethod(true,"setGravity",circleseek.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 116;BA.debugLine="Cbase.AddView(Clabel,cx-S/4,cy,S/2,S/2)";
Debug.ShouldStop(524288);
__ref.getFieldClass("derez.libs.circleseek", false,"_cbase").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.circleseek", false,"_clabel").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_cx"),__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(4)}, "-/",1, 0))),(Object)(__ref.getFieldClass("derez.libs.circleseek", true,"_cy")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.circleseek", true,"_s"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 117;BA.debugLine="first = False";
Debug.ShouldStop(1048576);
__ref.setFieldClass("derez.libs.circleseek", "_first",circleseek.__c.getField(true,"False"));
 };
 BA.debugLineNum = 119;BA.debugLine="position = Value";
Debug.ShouldStop(4194304);
__ref.setFieldClass("derez.libs.circleseek", "_position",_value);
 BA.debugLineNum = 120;BA.debugLine="DrawPosition(Round(Value * 270 / maxv),False)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (derez.libs.circleseek.class, "_drawposition",(Object)(BA.numberCast(int.class, circleseek.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(270),__ref.getFieldClass("derez.libs.circleseek", true,"_maxv")}, "*/",0, 0))))),(Object)(circleseek.__c.getField(true,"False")));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
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
}