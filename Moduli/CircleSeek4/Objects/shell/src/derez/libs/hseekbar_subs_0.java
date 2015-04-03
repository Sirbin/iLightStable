package derez.libs;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class hseekbar_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "hseekbar","asview", __ref);
 BA.debugLineNum = 72;BA.debugLine="Sub AsView As View 'ignore";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Return Hbase";
Debug.ShouldStop(256);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").getObject());
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private dr1,dr2,dr3 As GradientDrawable";
hseekbar._dr1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");__ref.setFieldClass("derez.libs.hseekbar","_dr1",hseekbar._dr1);
hseekbar._dr2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");__ref.setFieldClass("derez.libs.hseekbar","_dr2",hseekbar._dr2);
hseekbar._dr3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");__ref.setFieldClass("derez.libs.hseekbar","_dr3",hseekbar._dr3);
 //BA.debugLineNum = 7;BA.debugLine="Private slider, caret As ImageView";
hseekbar._slider = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setFieldClass("derez.libs.hseekbar","_slider",hseekbar._slider);
hseekbar._caret = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setFieldClass("derez.libs.hseekbar","_caret",hseekbar._caret);
 //BA.debugLineNum = 8;BA.debugLine="Private Vpos, H, W, MaxV, D As Int";
hseekbar._vpos = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.hseekbar","_vpos",hseekbar._vpos);
hseekbar._h = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.hseekbar","_h",hseekbar._h);
hseekbar._w = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.hseekbar","_w",hseekbar._w);
hseekbar._maxv = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.hseekbar","_maxv",hseekbar._maxv);
hseekbar._d = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.hseekbar","_d",hseekbar._d);
 //BA.debugLineNum = 9;BA.debugLine="Private Hmodule As Object";
hseekbar._hmodule = RemoteObject.createNew ("Object");__ref.setFieldClass("derez.libs.hseekbar","_hmodule",hseekbar._hmodule);
 //BA.debugLineNum = 10;BA.debugLine="Private Hbase, cover As Panel";
hseekbar._hbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("derez.libs.hseekbar","_hbase",hseekbar._hbase);
hseekbar._cover = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("derez.libs.hseekbar","_cover",hseekbar._cover);
 //BA.debugLineNum = 11;BA.debugLine="Private BarName As String";
hseekbar._barname = RemoteObject.createImmutable("");__ref.setFieldClass("derez.libs.hseekbar","_barname",hseekbar._barname);
 //BA.debugLineNum = 12;BA.debugLine="Private mybase As Panel";
hseekbar._mybase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("derez.libs.hseekbar","_mybase",hseekbar._mybase);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _codecreateview(RemoteObject __ref,RemoteObject _width,RemoteObject _height,RemoteObject _maxvalue) throws Exception{
try {
		Debug.PushSubsStack("CodeCreateView (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("codecreateview")) return __ref.runUserSub(false, "hseekbar","codecreateview", __ref, _width, _height, _maxvalue);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
Debug.locals.put("MaxValue", _maxvalue);
 BA.debugLineNum = 23;BA.debugLine="Public Sub CodeCreateView( width As Int ,height As Int, MaxValue As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="H = height";
Debug.ShouldStop(8388608);
__ref.setFieldClass("derez.libs.hseekbar", "_h",_height);
 BA.debugLineNum = 25;BA.debugLine="W = width";
Debug.ShouldStop(16777216);
__ref.setFieldClass("derez.libs.hseekbar", "_w",_width);
 BA.debugLineNum = 26;BA.debugLine="MaxV = MaxValue";
Debug.ShouldStop(33554432);
__ref.setFieldClass("derez.libs.hseekbar", "_maxv",_maxvalue);
 BA.debugLineNum = 27;BA.debugLine="Hbase.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 28;BA.debugLine="ContinueCreation";
Debug.ShouldStop(134217728);
__ref.runClassMethod (derez.libs.hseekbar.class, "_continuecreation");
 BA.debugLineNum = 29;BA.debugLine="End Sub";
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
public static RemoteObject  _continuecreation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ContinueCreation (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("continuecreation")) return __ref.runUserSub(false, "hseekbar","continuecreation", __ref);
 BA.debugLineNum = 46;BA.debugLine="Private Sub ContinueCreation";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="D = 20dip ' default caret width";
Debug.ShouldStop(16384);
__ref.setFieldClass("derez.libs.hseekbar", "_d",hseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))));
 BA.debugLineNum = 48;BA.debugLine="slider.Initialize(\"\")";
Debug.ShouldStop(32768);
__ref.getFieldClass("derez.libs.hseekbar", false,"_slider").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 49;BA.debugLine="Hbase.AddView(slider,0,0,W,H)";
Debug.ShouldStop(65536);
__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.hseekbar", false,"_slider").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getFieldClass("derez.libs.hseekbar", true,"_w")),(Object)(__ref.getFieldClass("derez.libs.hseekbar", true,"_h")));
 BA.debugLineNum = 50;BA.debugLine="caret.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getFieldClass("derez.libs.hseekbar", false,"_caret").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 51;BA.debugLine="Hbase.AddView(caret,W/2-D/2,0,D,H)";
Debug.ShouldStop(262144);
__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.hseekbar", false,"_caret").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.hseekbar", true,"_w"),RemoteObject.createImmutable(2),__ref.getFieldClass("derez.libs.hseekbar", true,"_d"),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getFieldClass("derez.libs.hseekbar", true,"_d")),(Object)(__ref.getFieldClass("derez.libs.hseekbar", true,"_h")));
 BA.debugLineNum = 52;BA.debugLine="cover.Initialize(\"cover\")";
Debug.ShouldStop(524288);
__ref.getFieldClass("derez.libs.hseekbar", false,"_cover").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("cover")));
 BA.debugLineNum = 53;BA.debugLine="Hbase.AddView(cover,0,0,W,H)";
Debug.ShouldStop(1048576);
__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.hseekbar", false,"_cover").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getFieldClass("derez.libs.hseekbar", true,"_w")),(Object)(__ref.getFieldClass("derez.libs.hseekbar", true,"_h")));
 BA.debugLineNum = 55;BA.debugLine="setColors(Colors.Black,Colors.white, Colors.Yellow, Colors.white)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (derez.libs.hseekbar.class, "_setcolors",(Object)(hseekbar.__c.getField(false,"Colors").getField(true,"Black")),(Object)(hseekbar.__c.getField(false,"Colors").getField(true,"White")),(Object)(hseekbar.__c.getField(false,"Colors").getField(true,"Yellow")),(Object)(hseekbar.__c.getField(false,"Colors").getField(true,"White")));
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
public static RemoteObject  _cover_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("cover_Touch (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("cover_touch")) return __ref.runUserSub(false, "hseekbar","cover_touch", __ref, _action, _x, _y);
RemoteObject _k = RemoteObject.createImmutable(0);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 113;BA.debugLine="Private Sub cover_Touch(Action As Int, X As Float, Y As Float) As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim k As Int";
Debug.ShouldStop(131072);
_k = RemoteObject.createImmutable(0);Debug.locals.put("k", _k);
 BA.debugLineNum = 115;BA.debugLine="k = X * MaxV / Hbase.Width";
Debug.ShouldStop(262144);
_k = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getFieldClass("derez.libs.hseekbar", true,"_maxv"),__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runMethod(true,"getWidth")}, "*/",0, 0));Debug.locals.put("k", _k);
 BA.debugLineNum = 116;BA.debugLine="k = Max(Min(k, MaxV),0)";
Debug.ShouldStop(524288);
_k = BA.numberCast(int.class, hseekbar.__c.runMethod(true,"Max",(Object)(hseekbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _k)),(Object)(BA.numberCast(double.class, __ref.getFieldClass("derez.libs.hseekbar", true,"_maxv"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("k", _k);
 BA.debugLineNum = 117;BA.debugLine="setPosition(k, True)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (derez.libs.hseekbar.class, "_setposition",(Object)(_k),(Object)(hseekbar.__c.getField(true,"True")));
 BA.debugLineNum = 118;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return hseekbar.__c.getField(true,"True");
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
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
		Debug.PushSubsStack("DesignerCreateView (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("designercreateview")) return __ref.runUserSub(false, "hseekbar","designercreateview", __ref, _base, _lbl, _props);
Debug.locals.put("base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 31;BA.debugLine="Private Sub DesignerCreateView(base As Panel, Lbl As Label, Props As Map) 'ignore";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="mybase = base";
Debug.ShouldStop(-2147483648);
__ref.setFieldClass("derez.libs.hseekbar", "_mybase",_base);
 BA.debugLineNum = 33;BA.debugLine="mybase.Left = Lbl.Left";
Debug.ShouldStop(1);
__ref.getFieldClass("derez.libs.hseekbar", false,"_mybase").runMethod(true,"setLeft",_lbl.runMethod(true,"getLeft"));
 BA.debugLineNum = 34;BA.debugLine="mybase.Top = Lbl.top";
Debug.ShouldStop(2);
__ref.getFieldClass("derez.libs.hseekbar", false,"_mybase").runMethod(true,"setTop",_lbl.runMethod(true,"getTop"));
 BA.debugLineNum = 35;BA.debugLine="mybase.Width = Lbl.Width";
Debug.ShouldStop(4);
__ref.getFieldClass("derez.libs.hseekbar", false,"_mybase").runMethod(true,"setWidth",_lbl.runMethod(true,"getWidth"));
 BA.debugLineNum = 36;BA.debugLine="mybase.Height = Lbl.Height";
Debug.ShouldStop(8);
__ref.getFieldClass("derez.libs.hseekbar", false,"_mybase").runMethod(true,"setHeight",_lbl.runMethod(true,"getHeight"));
 BA.debugLineNum = 37;BA.debugLine="Hbase.Initialize(\"\")";
Debug.ShouldStop(16);
__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 38;BA.debugLine="base.AddView(Hbase,0, 0, Lbl.Width, Lbl.Height)";
Debug.ShouldStop(32);
_base.runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_lbl.runMethod(true,"getWidth")),(Object)(_lbl.runMethod(true,"getHeight")));
 BA.debugLineNum = 40;BA.debugLine="H = Lbl.Height";
Debug.ShouldStop(128);
__ref.setFieldClass("derez.libs.hseekbar", "_h",_lbl.runMethod(true,"getHeight"));
 BA.debugLineNum = 41;BA.debugLine="W = Lbl.Width";
Debug.ShouldStop(256);
__ref.setFieldClass("derez.libs.hseekbar", "_w",_lbl.runMethod(true,"getWidth"));
 BA.debugLineNum = 42;BA.debugLine="MaxV = Lbl.text";
Debug.ShouldStop(512);
__ref.setFieldClass("derez.libs.hseekbar", "_maxv",BA.numberCast(int.class, _lbl.runMethod(true,"getText")));
 BA.debugLineNum = 43;BA.debugLine="ContinueCreation";
Debug.ShouldStop(1024);
__ref.runClassMethod (derez.libs.hseekbar.class, "_continuecreation");
 BA.debugLineNum = 44;BA.debugLine="End Sub";
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
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("getvalue")) return __ref.runUserSub(false, "hseekbar","getvalue", __ref);
 BA.debugLineNum = 108;BA.debugLine="Sub getValue As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Return Vpos";
Debug.ShouldStop(4096);
if (true) return __ref.getFieldClass("derez.libs.hseekbar", true,"_vpos");
 BA.debugLineNum = 110;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _module,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "hseekbar","initialize", __ref, _ba, _module, _eventname);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("Eventname", _eventname);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(Module As Object, Eventname As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Hmodule = Module";
Debug.ShouldStop(131072);
__ref.setFieldClass("derez.libs.hseekbar", "_hmodule",_module);
 BA.debugLineNum = 19;BA.debugLine="BarName = Eventname";
Debug.ShouldStop(262144);
__ref.setFieldClass("derez.libs.hseekbar", "_barname",_eventname);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
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
public static RemoteObject  _setcaretwidth(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setCaretWidth (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setcaretwidth")) return __ref.runUserSub(false, "hseekbar","setcaretwidth", __ref, _value);
Debug.locals.put("value", _value);
 BA.debugLineNum = 83;BA.debugLine="Sub setCaretWidth(value As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="D = value";
Debug.ShouldStop(524288);
__ref.setFieldClass("derez.libs.hseekbar", "_d",_value);
 BA.debugLineNum = 85;BA.debugLine="caret.Width = D";
Debug.ShouldStop(1048576);
__ref.getFieldClass("derez.libs.hseekbar", false,"_caret").runMethod(true,"setWidth",__ref.getFieldClass("derez.libs.hseekbar", true,"_d"));
 BA.debugLineNum = 86;BA.debugLine="caret.left = Max(Min(W-D,slider.width-D/2),0)";
Debug.ShouldStop(2097152);
__ref.getFieldClass("derez.libs.hseekbar", false,"_caret").runMethod(true,"setLeft",BA.numberCast(int.class, hseekbar.__c.runMethod(true,"Max",(Object)(hseekbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.hseekbar", true,"_w"),__ref.getFieldClass("derez.libs.hseekbar", true,"_d")}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.hseekbar", false,"_slider").runMethod(true,"getWidth"),__ref.getFieldClass("derez.libs.hseekbar", true,"_d"),RemoteObject.createImmutable(2)}, "-/",1, 0)))),(Object)(BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
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
public static RemoteObject  _setcolors(RemoteObject __ref,RemoteObject _background,RemoteObject _basecolor,RemoteObject _slidercolor,RemoteObject _caretcolor) throws Exception{
try {
		Debug.PushSubsStack("setColors (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setcolors")) return __ref.runUserSub(false, "hseekbar","setcolors", __ref, _background, _basecolor, _slidercolor, _caretcolor);
RemoteObject _clr = null;
Debug.locals.put("BackGround", _background);
Debug.locals.put("basecolor", _basecolor);
Debug.locals.put("slidercolor", _slidercolor);
Debug.locals.put("caretcolor", _caretcolor);
 BA.debugLineNum = 59;BA.debugLine="Sub setColors(BackGround As Int,basecolor As Int,slidercolor As Int, caretcolor As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim clr(3) As Int";
Debug.ShouldStop(134217728);
_clr = RemoteObject.createNewArray ("int", new int[] {3}, new Object[]{});Debug.locals.put("clr", _clr);
 BA.debugLineNum = 61;BA.debugLine="clr = Array  As Int(BackGround,basecolor,BackGround)";
Debug.ShouldStop(268435456);
_clr = RemoteObject.createNewArray("int",new int[] {3},new Object[] {_background,_basecolor,_background});Debug.locals.put("clr", _clr);
 BA.debugLineNum = 62;BA.debugLine="dr1.Initialize(\"TOP_BOTTOM\",clr)";
Debug.ShouldStop(536870912);
__ref.getFieldClass("derez.libs.hseekbar", false,"_dr1").runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clr));
 BA.debugLineNum = 63;BA.debugLine="Hbase.BackGround =   dr1  ' .Initialize(basecolor,BackGround,False)";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runMethod(false,"setBackground",(__ref.getFieldClass("derez.libs.hseekbar", false,"_dr1").getObject()));
 BA.debugLineNum = 64;BA.debugLine="clr = Array  As Int(BackGround,slidercolor,BackGround)";
Debug.ShouldStop(-2147483648);
_clr = RemoteObject.createNewArray("int",new int[] {3},new Object[] {_background,_slidercolor,_background});Debug.locals.put("clr", _clr);
 BA.debugLineNum = 65;BA.debugLine="dr2.Initialize(\"TOP_BOTTOM\",clr)";
Debug.ShouldStop(1);
__ref.getFieldClass("derez.libs.hseekbar", false,"_dr2").runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clr));
 BA.debugLineNum = 66;BA.debugLine="slider.BackGround = dr2";
Debug.ShouldStop(2);
__ref.getFieldClass("derez.libs.hseekbar", false,"_slider").runMethod(false,"setBackground",(__ref.getFieldClass("derez.libs.hseekbar", false,"_dr2").getObject()));
 BA.debugLineNum = 67;BA.debugLine="clr = Array  As Int(BackGround,caretcolor,BackGround)";
Debug.ShouldStop(4);
_clr = RemoteObject.createNewArray("int",new int[] {3},new Object[] {_background,_caretcolor,_background});Debug.locals.put("clr", _clr);
 BA.debugLineNum = 68;BA.debugLine="dr3.Initialize(\"LEFT_RIGHT\",clr)";
Debug.ShouldStop(8);
__ref.getFieldClass("derez.libs.hseekbar", false,"_dr3").runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"LEFT_RIGHT")),(Object)(_clr));
 BA.debugLineNum = 69;BA.debugLine="caret.BackGround =  dr3";
Debug.ShouldStop(16);
__ref.getFieldClass("derez.libs.hseekbar", false,"_caret").runMethod(false,"setBackground",(__ref.getFieldClass("derez.libs.hseekbar", false,"_dr3").getObject()));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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
public static RemoteObject  _setmaxvalue(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setMaxValue (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setmaxvalue")) return __ref.runUserSub(false, "hseekbar","setmaxvalue", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 77;BA.debugLine="Sub setMaxValue(Value As Int)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="MaxV = Value";
Debug.ShouldStop(8192);
__ref.setFieldClass("derez.libs.hseekbar", "_maxv",_value);
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
public static RemoteObject  _setposition(RemoteObject __ref,RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("setPosition (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setposition")) return __ref.runUserSub(false, "hseekbar","setposition", __ref, _value, _userchanged);
Debug.locals.put("Value", _value);
Debug.locals.put("userchanged", _userchanged);
 BA.debugLineNum = 89;BA.debugLine="Private Sub setPosition(Value As Int, userchanged As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="slider.width = Max(Min(W * Value/MaxV, W ),0)";
Debug.ShouldStop(33554432);
__ref.getFieldClass("derez.libs.hseekbar", false,"_slider").runMethod(true,"setWidth",BA.numberCast(int.class, hseekbar.__c.runMethod(true,"Max",(Object)(hseekbar.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.hseekbar", true,"_w"),_value,__ref.getFieldClass("derez.libs.hseekbar", true,"_maxv")}, "*/",0, 0)),(Object)(BA.numberCast(double.class, __ref.getFieldClass("derez.libs.hseekbar", true,"_w"))))),(Object)(BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 91;BA.debugLine="caret.left = Max(Min(W-D,slider.width-D/2),0)";
Debug.ShouldStop(67108864);
__ref.getFieldClass("derez.libs.hseekbar", false,"_caret").runMethod(true,"setLeft",BA.numberCast(int.class, hseekbar.__c.runMethod(true,"Max",(Object)(hseekbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.hseekbar", true,"_w"),__ref.getFieldClass("derez.libs.hseekbar", true,"_d")}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.hseekbar", false,"_slider").runMethod(true,"getWidth"),__ref.getFieldClass("derez.libs.hseekbar", true,"_d"),RemoteObject.createImmutable(2)}, "-/",1, 0)))),(Object)(BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 92;BA.debugLine="Hbase.Invalidate";
Debug.ShouldStop(134217728);
__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runVoidMethod ("Invalidate");
 BA.debugLineNum = 93;BA.debugLine="If SubExists(Hmodule, BarName & \"_ValueChanged\") Then";
Debug.ShouldStop(268435456);
if (hseekbar.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("derez.libs.hseekbar", false,"_hmodule")),(Object)(RemoteObject.concat(__ref.getFieldClass("derez.libs.hseekbar", true,"_barname"),RemoteObject.createImmutable("_ValueChanged")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="CallSub3(Hmodule,BarName & \"_ValueChanged\", Value , userchanged )";
Debug.ShouldStop(536870912);
hseekbar.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("derez.libs.hseekbar", false,"_hmodule")),(Object)(RemoteObject.concat(__ref.getFieldClass("derez.libs.hseekbar", true,"_barname"),RemoteObject.createImmutable("_ValueChanged"))),(Object)((_value)),(Object)((_userchanged)));
 };
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setValue (hseekbar) ","hseekbar",4,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setvalue")) return __ref.runUserSub(false, "hseekbar","setvalue", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 101;BA.debugLine="Sub setValue(Value As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Vpos = Value";
Debug.ShouldStop(32);
__ref.setFieldClass("derez.libs.hseekbar", "_vpos",_value);
 BA.debugLineNum = 103;BA.debugLine="W = Hbase.Width";
Debug.ShouldStop(64);
__ref.setFieldClass("derez.libs.hseekbar", "_w",__ref.getFieldClass("derez.libs.hseekbar", false,"_hbase").runMethod(true,"getWidth"));
 BA.debugLineNum = 104;BA.debugLine="setPosition(Vpos,False)";
Debug.ShouldStop(128);
__ref.runClassMethod (derez.libs.hseekbar.class, "_setposition",(Object)(__ref.getFieldClass("derez.libs.hseekbar", true,"_vpos")),(Object)(hseekbar.__c.getField(true,"False")));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
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
}