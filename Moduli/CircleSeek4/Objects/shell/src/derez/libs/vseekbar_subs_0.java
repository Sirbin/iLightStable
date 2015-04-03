package derez.libs;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vseekbar_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "vseekbar","asview", __ref);
 BA.debugLineNum = 70;BA.debugLine="Sub AsView As View 'ignore";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Return Vbase";
Debug.ShouldStop(64);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").getObject());
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
vseekbar._dr1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");__ref.setFieldClass("derez.libs.vseekbar","_dr1",vseekbar._dr1);
vseekbar._dr2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");__ref.setFieldClass("derez.libs.vseekbar","_dr2",vseekbar._dr2);
vseekbar._dr3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");__ref.setFieldClass("derez.libs.vseekbar","_dr3",vseekbar._dr3);
 //BA.debugLineNum = 7;BA.debugLine="Private slider, caret As ImageView";
vseekbar._slider = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setFieldClass("derez.libs.vseekbar","_slider",vseekbar._slider);
vseekbar._caret = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setFieldClass("derez.libs.vseekbar","_caret",vseekbar._caret);
 //BA.debugLineNum = 8;BA.debugLine="Private Vpos, H, W, MaxV, D As Int";
vseekbar._vpos = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.vseekbar","_vpos",vseekbar._vpos);
vseekbar._h = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.vseekbar","_h",vseekbar._h);
vseekbar._w = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.vseekbar","_w",vseekbar._w);
vseekbar._maxv = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.vseekbar","_maxv",vseekbar._maxv);
vseekbar._d = RemoteObject.createImmutable(0);__ref.setFieldClass("derez.libs.vseekbar","_d",vseekbar._d);
 //BA.debugLineNum = 9;BA.debugLine="Private Vmodule As Object";
vseekbar._vmodule = RemoteObject.createNew ("Object");__ref.setFieldClass("derez.libs.vseekbar","_vmodule",vseekbar._vmodule);
 //BA.debugLineNum = 10;BA.debugLine="Private Vbase,  cover As Panel";
vseekbar._vbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("derez.libs.vseekbar","_vbase",vseekbar._vbase);
vseekbar._cover = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setFieldClass("derez.libs.vseekbar","_cover",vseekbar._cover);
 //BA.debugLineNum = 11;BA.debugLine="Private BarName As String";
vseekbar._barname = RemoteObject.createImmutable("");__ref.setFieldClass("derez.libs.vseekbar","_barname",vseekbar._barname);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _codecreateview(RemoteObject __ref,RemoteObject _width,RemoteObject _height,RemoteObject _maxvalue) throws Exception{
try {
		Debug.PushSubsStack("CodeCreateView (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("codecreateview")) return __ref.runUserSub(false, "vseekbar","codecreateview", __ref, _width, _height, _maxvalue);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
Debug.locals.put("MaxValue", _maxvalue);
 BA.debugLineNum = 22;BA.debugLine="Public Sub CodeCreateView( width As Int ,height As Int, MaxValue As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="H = height";
Debug.ShouldStop(4194304);
__ref.setFieldClass("derez.libs.vseekbar", "_h",_height);
 BA.debugLineNum = 24;BA.debugLine="W = width";
Debug.ShouldStop(8388608);
__ref.setFieldClass("derez.libs.vseekbar", "_w",_width);
 BA.debugLineNum = 25;BA.debugLine="MaxV = MaxValue";
Debug.ShouldStop(16777216);
__ref.setFieldClass("derez.libs.vseekbar", "_maxv",_maxvalue);
 BA.debugLineNum = 26;BA.debugLine="D =  20dip ' default caret height";
Debug.ShouldStop(33554432);
__ref.setFieldClass("derez.libs.vseekbar", "_d",vseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))));
 BA.debugLineNum = 27;BA.debugLine="Vbase.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 28;BA.debugLine="ContinueCreation";
Debug.ShouldStop(134217728);
__ref.runClassMethod (derez.libs.vseekbar.class, "_continuecreation");
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
		Debug.PushSubsStack("ContinueCreation (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("continuecreation")) return __ref.runUserSub(false, "vseekbar","continuecreation", __ref);
 BA.debugLineNum = 44;BA.debugLine="Private Sub ContinueCreation";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="D = 20dip ' default caret height";
Debug.ShouldStop(4096);
__ref.setFieldClass("derez.libs.vseekbar", "_d",vseekbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))));
 BA.debugLineNum = 46;BA.debugLine="slider.Initialize(\"\")";
Debug.ShouldStop(8192);
__ref.getFieldClass("derez.libs.vseekbar", false,"_slider").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 47;BA.debugLine="Vbase.AddView(slider,0,0,W,H)";
Debug.ShouldStop(16384);
__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.vseekbar", false,"_slider").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getFieldClass("derez.libs.vseekbar", true,"_w")),(Object)(__ref.getFieldClass("derez.libs.vseekbar", true,"_h")));
 BA.debugLineNum = 48;BA.debugLine="caret.Initialize(\"\")";
Debug.ShouldStop(32768);
__ref.getFieldClass("derez.libs.vseekbar", false,"_caret").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 49;BA.debugLine="Vbase.AddView(caret,0,H/2-D/2,W,D)";
Debug.ShouldStop(65536);
__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.vseekbar", false,"_caret").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.vseekbar", true,"_h"),RemoteObject.createImmutable(2),__ref.getFieldClass("derez.libs.vseekbar", true,"_d"),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(__ref.getFieldClass("derez.libs.vseekbar", true,"_w")),(Object)(__ref.getFieldClass("derez.libs.vseekbar", true,"_d")));
 BA.debugLineNum = 50;BA.debugLine="cover.Initialize(\"cover\")";
Debug.ShouldStop(131072);
__ref.getFieldClass("derez.libs.vseekbar", false,"_cover").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("cover")));
 BA.debugLineNum = 51;BA.debugLine="Vbase.AddView(cover,0,0,W,H)";
Debug.ShouldStop(262144);
__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.vseekbar", false,"_cover").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getFieldClass("derez.libs.vseekbar", true,"_w")),(Object)(__ref.getFieldClass("derez.libs.vseekbar", true,"_h")));
 BA.debugLineNum = 53;BA.debugLine="setColors(Colors.Black,Colors.white, Colors.Yellow, Colors.white)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (derez.libs.vseekbar.class, "_setcolors",(Object)(vseekbar.__c.getField(false,"Colors").getField(true,"Black")),(Object)(vseekbar.__c.getField(false,"Colors").getField(true,"White")),(Object)(vseekbar.__c.getField(false,"Colors").getField(true,"Yellow")),(Object)(vseekbar.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
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
public static RemoteObject  _cover_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("cover_Touch (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("cover_touch")) return __ref.runUserSub(false, "vseekbar","cover_touch", __ref, _action, _x, _y);
RemoteObject _k = RemoteObject.createImmutable(0);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 112;BA.debugLine="Private Sub cover_Touch(Action As Int, X As Float, Y As Float) As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim k As Int";
Debug.ShouldStop(65536);
_k = RemoteObject.createImmutable(0);Debug.locals.put("k", _k);
 BA.debugLineNum = 114;BA.debugLine="k = (1-Y/Vbase.Height)* MaxV";
Debug.ShouldStop(131072);
_k = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_y,__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runMethod(true,"getHeight")}, "-/",1, 0)),__ref.getFieldClass("derez.libs.vseekbar", true,"_maxv")}, "*",0, 0));Debug.locals.put("k", _k);
 BA.debugLineNum = 115;BA.debugLine="k = Max(Min(k, MaxV),0)";
Debug.ShouldStop(262144);
_k = BA.numberCast(int.class, vseekbar.__c.runMethod(true,"Max",(Object)(vseekbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _k)),(Object)(BA.numberCast(double.class, __ref.getFieldClass("derez.libs.vseekbar", true,"_maxv"))))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("k", _k);
 BA.debugLineNum = 116;BA.debugLine="setPosition(k, True)";
Debug.ShouldStop(524288);
__ref.runClassMethod (derez.libs.vseekbar.class, "_setposition",(Object)(_k),(Object)(vseekbar.__c.getField(true,"True")));
 BA.debugLineNum = 117;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return vseekbar.__c.getField(true,"True");
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("DesignerCreateView (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("designercreateview")) return __ref.runUserSub(false, "vseekbar","designercreateview", __ref, _base, _lbl, _props);
Debug.locals.put("base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 31;BA.debugLine="Private Sub DesignerCreateView(base As Panel, Lbl As Label, Props As Map)'ignore";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="base.Left = Lbl.Left";
Debug.ShouldStop(-2147483648);
_base.runMethod(true,"setLeft",_lbl.runMethod(true,"getLeft"));
 BA.debugLineNum = 33;BA.debugLine="base.Top = Lbl.top";
Debug.ShouldStop(1);
_base.runMethod(true,"setTop",_lbl.runMethod(true,"getTop"));
 BA.debugLineNum = 34;BA.debugLine="base.Width = Lbl.Width";
Debug.ShouldStop(2);
_base.runMethod(true,"setWidth",_lbl.runMethod(true,"getWidth"));
 BA.debugLineNum = 35;BA.debugLine="base.Height = Lbl.Height";
Debug.ShouldStop(4);
_base.runMethod(true,"setHeight",_lbl.runMethod(true,"getHeight"));
 BA.debugLineNum = 36;BA.debugLine="Vbase.Initialize(\"\")";
Debug.ShouldStop(8);
__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")));
 BA.debugLineNum = 37;BA.debugLine="base.AddView(Vbase,0, 0, Lbl.Width, Lbl.Height)";
Debug.ShouldStop(16);
_base.runVoidMethod ("AddView",(Object)((__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_lbl.runMethod(true,"getWidth")),(Object)(_lbl.runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="H = Lbl.Height";
Debug.ShouldStop(32);
__ref.setFieldClass("derez.libs.vseekbar", "_h",_lbl.runMethod(true,"getHeight"));
 BA.debugLineNum = 39;BA.debugLine="W = Lbl.Width";
Debug.ShouldStop(64);
__ref.setFieldClass("derez.libs.vseekbar", "_w",_lbl.runMethod(true,"getWidth"));
 BA.debugLineNum = 40;BA.debugLine="MaxV = Lbl.text";
Debug.ShouldStop(128);
__ref.setFieldClass("derez.libs.vseekbar", "_maxv",BA.numberCast(int.class, _lbl.runMethod(true,"getText")));
 BA.debugLineNum = 41;BA.debugLine="ContinueCreation";
Debug.ShouldStop(256);
__ref.runClassMethod (derez.libs.vseekbar.class, "_continuecreation");
 BA.debugLineNum = 42;BA.debugLine="End Sub";
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
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("getvalue")) return __ref.runUserSub(false, "vseekbar","getvalue", __ref);
 BA.debugLineNum = 107;BA.debugLine="Sub getValue As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Return Vpos";
Debug.ShouldStop(2048);
if (true) return __ref.getFieldClass("derez.libs.vseekbar", true,"_vpos");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "vseekbar","initialize", __ref, _ba, _module, _eventname);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("Eventname", _eventname);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(Module As Object, Eventname As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Vmodule = Module";
Debug.ShouldStop(65536);
__ref.setFieldClass("derez.libs.vseekbar", "_vmodule",_module);
 BA.debugLineNum = 18;BA.debugLine="BarName = Eventname";
Debug.ShouldStop(131072);
__ref.setFieldClass("derez.libs.vseekbar", "_barname",_eventname);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
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
public static RemoteObject  _setcaretheight(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setCaretHeight (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setcaretheight")) return __ref.runUserSub(false, "vseekbar","setcaretheight", __ref, _value);
Debug.locals.put("value", _value);
 BA.debugLineNum = 81;BA.debugLine="Sub setCaretHeight(value As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="D = value";
Debug.ShouldStop(131072);
__ref.setFieldClass("derez.libs.vseekbar", "_d",_value);
 BA.debugLineNum = 83;BA.debugLine="caret.Height = D";
Debug.ShouldStop(262144);
__ref.getFieldClass("derez.libs.vseekbar", false,"_caret").runMethod(true,"setHeight",__ref.getFieldClass("derez.libs.vseekbar", true,"_d"));
 BA.debugLineNum = 84;BA.debugLine="caret.top = Max(Min(slider.top-D/2, H-D), 0)";
Debug.ShouldStop(524288);
__ref.getFieldClass("derez.libs.vseekbar", false,"_caret").runMethod(true,"setTop",BA.numberCast(int.class, vseekbar.__c.runMethod(true,"Max",(Object)(vseekbar.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.vseekbar", false,"_slider").runMethod(true,"getTop"),__ref.getFieldClass("derez.libs.vseekbar", true,"_d"),RemoteObject.createImmutable(2)}, "-/",1, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.vseekbar", true,"_h"),__ref.getFieldClass("derez.libs.vseekbar", true,"_d")}, "-",1, 1))))),(Object)(BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
public static RemoteObject  _setcolors(RemoteObject __ref,RemoteObject _background,RemoteObject _basecolor,RemoteObject _slidercolor,RemoteObject _caretcolor) throws Exception{
try {
		Debug.PushSubsStack("setColors (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setcolors")) return __ref.runUserSub(false, "vseekbar","setcolors", __ref, _background, _basecolor, _slidercolor, _caretcolor);
RemoteObject _clr = null;
Debug.locals.put("BackGround", _background);
Debug.locals.put("basecolor", _basecolor);
Debug.locals.put("slidercolor", _slidercolor);
Debug.locals.put("caretcolor", _caretcolor);
 BA.debugLineNum = 57;BA.debugLine="Sub setColors(BackGround As Int,basecolor As Int,slidercolor As Int, caretcolor As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim clr(3) As Int";
Debug.ShouldStop(33554432);
_clr = RemoteObject.createNewArray ("int", new int[] {3}, new Object[]{});Debug.locals.put("clr", _clr);
 BA.debugLineNum = 59;BA.debugLine="clr = Array  As Int(BackGround,basecolor,BackGround)";
Debug.ShouldStop(67108864);
_clr = RemoteObject.createNewArray("int",new int[] {3},new Object[] {_background,_basecolor,_background});Debug.locals.put("clr", _clr);
 BA.debugLineNum = 60;BA.debugLine="dr1.Initialize(\"LEFT_RIGHT\",clr)";
Debug.ShouldStop(134217728);
__ref.getFieldClass("derez.libs.vseekbar", false,"_dr1").runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"LEFT_RIGHT")),(Object)(_clr));
 BA.debugLineNum = 61;BA.debugLine="Vbase.BackGround =   dr1";
Debug.ShouldStop(268435456);
__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runMethod(false,"setBackground",(__ref.getFieldClass("derez.libs.vseekbar", false,"_dr1").getObject()));
 BA.debugLineNum = 62;BA.debugLine="clr = Array  As Int(BackGround,slidercolor,BackGround)";
Debug.ShouldStop(536870912);
_clr = RemoteObject.createNewArray("int",new int[] {3},new Object[] {_background,_slidercolor,_background});Debug.locals.put("clr", _clr);
 BA.debugLineNum = 63;BA.debugLine="dr2.Initialize(\"LEFT_RIGHT\",clr)";
Debug.ShouldStop(1073741824);
__ref.getFieldClass("derez.libs.vseekbar", false,"_dr2").runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"LEFT_RIGHT")),(Object)(_clr));
 BA.debugLineNum = 64;BA.debugLine="slider.BackGround = dr2";
Debug.ShouldStop(-2147483648);
__ref.getFieldClass("derez.libs.vseekbar", false,"_slider").runMethod(false,"setBackground",(__ref.getFieldClass("derez.libs.vseekbar", false,"_dr2").getObject()));
 BA.debugLineNum = 65;BA.debugLine="clr = Array  As Int(BackGround,caretcolor,BackGround)";
Debug.ShouldStop(1);
_clr = RemoteObject.createNewArray("int",new int[] {3},new Object[] {_background,_caretcolor,_background});Debug.locals.put("clr", _clr);
 BA.debugLineNum = 66;BA.debugLine="dr3.Initialize(\"TOP_BOTTOM\",clr)";
Debug.ShouldStop(2);
__ref.getFieldClass("derez.libs.vseekbar", false,"_dr3").runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clr));
 BA.debugLineNum = 67;BA.debugLine="caret.BackGround =  dr3";
Debug.ShouldStop(4);
__ref.getFieldClass("derez.libs.vseekbar", false,"_caret").runMethod(false,"setBackground",(__ref.getFieldClass("derez.libs.vseekbar", false,"_dr3").getObject()));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
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
public static RemoteObject  _setmaxvalue(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setMaxValue (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setmaxvalue")) return __ref.runUserSub(false, "vseekbar","setmaxvalue", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 75;BA.debugLine="Sub setMaxValue(Value As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="MaxV = Value";
Debug.ShouldStop(2048);
__ref.setFieldClass("derez.libs.vseekbar", "_maxv",_value);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
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
public static RemoteObject  _setposition(RemoteObject __ref,RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("setPosition (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setposition")) return __ref.runUserSub(false, "vseekbar","setposition", __ref, _value, _userchanged);
Debug.locals.put("Value", _value);
Debug.locals.put("userchanged", _userchanged);
 BA.debugLineNum = 87;BA.debugLine="Private Sub setPosition(Value As Int, userchanged As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="slider.height = Max(Min(H * Value / MaxV, H ),0)";
Debug.ShouldStop(8388608);
__ref.getFieldClass("derez.libs.vseekbar", false,"_slider").runMethod(true,"setHeight",BA.numberCast(int.class, vseekbar.__c.runMethod(true,"Max",(Object)(vseekbar.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.vseekbar", true,"_h"),_value,__ref.getFieldClass("derez.libs.vseekbar", true,"_maxv")}, "*/",0, 0)),(Object)(BA.numberCast(double.class, __ref.getFieldClass("derez.libs.vseekbar", true,"_h"))))),(Object)(BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 89;BA.debugLine="slider.Top =  H - slider.height";
Debug.ShouldStop(16777216);
__ref.getFieldClass("derez.libs.vseekbar", false,"_slider").runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.vseekbar", true,"_h"),__ref.getFieldClass("derez.libs.vseekbar", false,"_slider").runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 90;BA.debugLine="caret.top = Max(Min(slider.top-D/2, H-D), 0)";
Debug.ShouldStop(33554432);
__ref.getFieldClass("derez.libs.vseekbar", false,"_caret").runMethod(true,"setTop",BA.numberCast(int.class, vseekbar.__c.runMethod(true,"Max",(Object)(vseekbar.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.vseekbar", false,"_slider").runMethod(true,"getTop"),__ref.getFieldClass("derez.libs.vseekbar", true,"_d"),RemoteObject.createImmutable(2)}, "-/",1, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getFieldClass("derez.libs.vseekbar", true,"_h"),__ref.getFieldClass("derez.libs.vseekbar", true,"_d")}, "-",1, 1))))),(Object)(BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 91;BA.debugLine="Vbase.Invalidate";
Debug.ShouldStop(67108864);
__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runVoidMethod ("Invalidate");
 BA.debugLineNum = 92;BA.debugLine="If SubExists(Vmodule, BarName & \"_ValueChanged\") Then";
Debug.ShouldStop(134217728);
if (vseekbar.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("derez.libs.vseekbar", false,"_vmodule")),(Object)(RemoteObject.concat(__ref.getFieldClass("derez.libs.vseekbar", true,"_barname"),RemoteObject.createImmutable("_ValueChanged")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 93;BA.debugLine="CallSub3(Vmodule,BarName & \"_ValueChanged\", Value , userchanged )";
Debug.ShouldStop(268435456);
vseekbar.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getFieldClass("derez.libs.vseekbar", false,"_vmodule")),(Object)(RemoteObject.concat(__ref.getFieldClass("derez.libs.vseekbar", true,"_barname"),RemoteObject.createImmutable("_ValueChanged"))),(Object)((_value)),(Object)((_userchanged)));
 };
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setValue (vseekbar) ","vseekbar",1,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("setvalue")) return __ref.runUserSub(false, "vseekbar","setvalue", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 100;BA.debugLine="Sub setValue(Value As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Vpos = Value";
Debug.ShouldStop(16);
__ref.setFieldClass("derez.libs.vseekbar", "_vpos",_value);
 BA.debugLineNum = 102;BA.debugLine="H = Vbase.Height";
Debug.ShouldStop(32);
__ref.setFieldClass("derez.libs.vseekbar", "_h",__ref.getFieldClass("derez.libs.vseekbar", false,"_vbase").runMethod(true,"getHeight"));
 BA.debugLineNum = 103;BA.debugLine="setPosition(Vpos,False)";
Debug.ShouldStop(64);
__ref.runClassMethod (derez.libs.vseekbar.class, "_setposition",(Object)(__ref.getFieldClass("derez.libs.vseekbar", true,"_vpos")),(Object)(vseekbar.__c.getField(true,"False")));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
}