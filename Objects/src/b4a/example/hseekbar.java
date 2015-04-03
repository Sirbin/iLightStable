package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class hseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.hseekbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.hseekbar",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.drawable.GradientDrawable _dr1 = null;
public anywheresoftware.b4a.objects.drawable.GradientDrawable _dr2 = null;
public anywheresoftware.b4a.objects.drawable.GradientDrawable _dr3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _slider = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _caret = null;
public int _vpos = 0;
public int _h = 0;
public int _w = 0;
public int _maxv = 0;
public int _d = 0;
public Object _hmodule = null;
public anywheresoftware.b4a.objects.PanelWrapper _hbase = null;
public anywheresoftware.b4a.objects.PanelWrapper _cover = null;
public String _barname = "";
public anywheresoftware.b4a.objects.PanelWrapper _mybase = null;
public b4a.example.main _main = null;
public b4a.example.sensortable _sensortable = null;
public b4a.example.config _config = null;
public b4a.example.size _size = null;
public b4a.example.cancellato _cancellato = null;
public b4a.example.configpagemod _configpagemod = null;
public b4a.example.configurationwizardmod _configurationwizardmod = null;
public b4a.example.policiesmode _policiesmode = null;
  public Object[] GetGlobals() {
		return new Object[] {"BarName",_barname,"cancellato",Debug.moduleToString(b4a.example.cancellato.class),"caret",_caret,"config",Debug.moduleToString(b4a.example.config.class),"ConfigPageMod",Debug.moduleToString(b4a.example.configpagemod.class),"ConfigurationWizardMod",Debug.moduleToString(b4a.example.configurationwizardmod.class),"cover",_cover,"D",_d,"dr1",_dr1,"dr2",_dr2,"dr3",_dr3,"H",_h,"Hbase",_hbase,"Hmodule",_hmodule,"Main",Debug.moduleToString(b4a.example.main.class),"MaxV",_maxv,"mybase",_mybase,"PoliciesMode",Debug.moduleToString(b4a.example.policiesmode.class),"SensorTable",Debug.moduleToString(b4a.example.sensortable.class),"Size",Debug.moduleToString(b4a.example.size.class),"slider",_slider,"Vpos",_vpos,"W",_w};
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
try {
		Debug.PushSubsStack("AsView (hseekbar) ","hseekbar",6,ba,this,71);
 BA.debugLineNum = 71;BA.debugLine="Sub AsView As View 'ignore";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Return Hbase";
Debug.ShouldStop(128);
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_hbase.getObject()));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private dr1,dr2,dr3 As GradientDrawable";
_dr1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
_dr2 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
_dr3 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 7;BA.debugLine="Private slider, caret As ImageView";
_slider = new anywheresoftware.b4a.objects.ImageViewWrapper();
_caret = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Vpos, H, W, MaxV, D As Int";
_vpos = 0;
_h = 0;
_w = 0;
_maxv = 0;
_d = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private Hmodule As Object";
_hmodule = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Private Hbase, cover As Panel";
_hbase = new anywheresoftware.b4a.objects.PanelWrapper();
_cover = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private BarName As String";
_barname = "";
 //BA.debugLineNum = 12;BA.debugLine="Private mybase As Panel";
_mybase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _codecreateview(int _width,int _height,int _maxvalue) throws Exception{
try {
		Debug.PushSubsStack("CodeCreateView (hseekbar) ","hseekbar",6,ba,this,23);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
Debug.locals.put("MaxValue", _maxvalue);
 BA.debugLineNum = 23;BA.debugLine="Public Sub CodeCreateView( width As Int ,height As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="H = height";
Debug.ShouldStop(8388608);
_h = _height;
 BA.debugLineNum = 25;BA.debugLine="W = width";
Debug.ShouldStop(16777216);
_w = _width;
 BA.debugLineNum = 26;BA.debugLine="MaxV = MaxValue";
Debug.ShouldStop(33554432);
_maxv = _maxvalue;
 BA.debugLineNum = 27;BA.debugLine="Hbase.Initialize(\"\")";
Debug.ShouldStop(67108864);
_hbase.Initialize(ba,"");
 BA.debugLineNum = 28;BA.debugLine="ContinueCreation";
Debug.ShouldStop(134217728);
_continuecreation();
 BA.debugLineNum = 29;BA.debugLine="End Sub";
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
public String  _continuecreation() throws Exception{
try {
		Debug.PushSubsStack("ContinueCreation (hseekbar) ","hseekbar",6,ba,this,45);
 BA.debugLineNum = 45;BA.debugLine="Private Sub ContinueCreation";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="D = 20dip ' default caret width";
Debug.ShouldStop(8192);
_d = __c.DipToCurrent((int) (20));
 BA.debugLineNum = 47;BA.debugLine="slider.Initialize(\"\")";
Debug.ShouldStop(16384);
_slider.Initialize(ba,"");
 BA.debugLineNum = 48;BA.debugLine="Hbase.AddView(slider,0,0,W,H)";
Debug.ShouldStop(32768);
_hbase.AddView((android.view.View)(_slider.getObject()),(int) (0),(int) (0),_w,_h);
 BA.debugLineNum = 49;BA.debugLine="caret.Initialize(\"\")";
Debug.ShouldStop(65536);
_caret.Initialize(ba,"");
 BA.debugLineNum = 50;BA.debugLine="Hbase.AddView(caret,W/2-D/2,0,D,H)";
Debug.ShouldStop(131072);
_hbase.AddView((android.view.View)(_caret.getObject()),(int) (_w/(double)2-_d/(double)2),(int) (0),_d,_h);
 BA.debugLineNum = 51;BA.debugLine="cover.Initialize(\"cover\")";
Debug.ShouldStop(262144);
_cover.Initialize(ba,"cover");
 BA.debugLineNum = 52;BA.debugLine="Hbase.AddView(cover,0,0,W,H)";
Debug.ShouldStop(524288);
_hbase.AddView((android.view.View)(_cover.getObject()),(int) (0),(int) (0),_w,_h);
 BA.debugLineNum = 54;BA.debugLine="setColors(Colors.Black,Colors.white, Colors.Yellow";
Debug.ShouldStop(2097152);
_setcolors(__c.Colors.Black,__c.Colors.White,__c.Colors.Yellow,__c.Colors.White);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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
public boolean  _cover_touch(int _action,float _x,float _y) throws Exception{
try {
		Debug.PushSubsStack("cover_Touch (hseekbar) ","hseekbar",6,ba,this,112);
int _k = 0;
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 112;BA.debugLine="Private Sub cover_Touch(Action As Int, X As Float,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim k As Int";
Debug.ShouldStop(65536);
_k = 0;Debug.locals.put("k", _k);
 BA.debugLineNum = 114;BA.debugLine="k = X * MaxV / Hbase.Width";
Debug.ShouldStop(131072);
_k = (int) (_x*_maxv/(double)_hbase.getWidth());Debug.locals.put("k", _k);
 BA.debugLineNum = 115;BA.debugLine="k = Max(Min(k, MaxV),0)";
Debug.ShouldStop(262144);
_k = (int) (__c.Max(__c.Min(_k,_maxv),0));Debug.locals.put("k", _k);
 BA.debugLineNum = 116;BA.debugLine="setPosition(k, True)";
Debug.ShouldStop(524288);
_setposition(_k,__c.True);
 BA.debugLineNum = 117;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return __c.True;
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (hseekbar) ","hseekbar",6,ba,this,31);
Debug.locals.put("base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 31;BA.debugLine="Private Sub DesignerCreateView(base As Panel, Lbl";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="mybase = base";
Debug.ShouldStop(-2147483648);
_mybase = _base;
 BA.debugLineNum = 33;BA.debugLine="mybase.Left = Lbl.Left";
Debug.ShouldStop(1);
_mybase.setLeft(_lbl.getLeft());
 BA.debugLineNum = 34;BA.debugLine="mybase.Top = Lbl.top";
Debug.ShouldStop(2);
_mybase.setTop(_lbl.getTop());
 BA.debugLineNum = 35;BA.debugLine="mybase.Width = Lbl.Width";
Debug.ShouldStop(4);
_mybase.setWidth(_lbl.getWidth());
 BA.debugLineNum = 36;BA.debugLine="mybase.Height = Lbl.Height";
Debug.ShouldStop(8);
_mybase.setHeight(_lbl.getHeight());
 BA.debugLineNum = 37;BA.debugLine="Hbase.Initialize(\"\")";
Debug.ShouldStop(16);
_hbase.Initialize(ba,"");
 BA.debugLineNum = 38;BA.debugLine="base.AddView(Hbase,0, 0, Lbl.Width, Lbl.Height)";
Debug.ShouldStop(32);
_base.AddView((android.view.View)(_hbase.getObject()),(int) (0),(int) (0),_lbl.getWidth(),_lbl.getHeight());
 BA.debugLineNum = 39;BA.debugLine="H = Lbl.Height";
Debug.ShouldStop(64);
_h = _lbl.getHeight();
 BA.debugLineNum = 40;BA.debugLine="W = Lbl.Width";
Debug.ShouldStop(128);
_w = _lbl.getWidth();
 BA.debugLineNum = 41;BA.debugLine="MaxV = Lbl.text";
Debug.ShouldStop(256);
_maxv = (int)(Double.parseDouble(_lbl.getText()));
 BA.debugLineNum = 42;BA.debugLine="ContinueCreation";
Debug.ShouldStop(512);
_continuecreation();
 BA.debugLineNum = 43;BA.debugLine="End Sub";
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
public int  _getvalue() throws Exception{
try {
		Debug.PushSubsStack("getValue (hseekbar) ","hseekbar",6,ba,this,107);
 BA.debugLineNum = 107;BA.debugLine="Sub getValue As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Return Vpos";
Debug.ShouldStop(2048);
if (true) return _vpos;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _module,String _eventname) throws Exception{
innerInitialize(_ba);
try {
		Debug.PushSubsStack("Initialize (hseekbar) ","hseekbar",6,ba,this,17);
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("Eventname", _eventname);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(Module As Object, Eventname";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Hmodule = Module";
Debug.ShouldStop(131072);
_hmodule = _module;
 BA.debugLineNum = 19;BA.debugLine="BarName = Eventname";
Debug.ShouldStop(262144);
_barname = _eventname;
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setcaretwidth(int _value) throws Exception{
try {
		Debug.PushSubsStack("setCaretWidth (hseekbar) ","hseekbar",6,ba,this,82);
Debug.locals.put("value", _value);
 BA.debugLineNum = 82;BA.debugLine="Sub setCaretWidth(value As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="D = value";
Debug.ShouldStop(262144);
_d = _value;
 BA.debugLineNum = 84;BA.debugLine="caret.Width = D";
Debug.ShouldStop(524288);
_caret.setWidth(_d);
 BA.debugLineNum = 85;BA.debugLine="caret.left = Max(Min(W-D,slider.width-D/2),0)";
Debug.ShouldStop(1048576);
_caret.setLeft((int) (__c.Max(__c.Min(_w-_d,_slider.getWidth()-_d/(double)2),0)));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
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
public String  _setcolors(int _background,int _basecolor,int _slidercolor,int _caretcolor) throws Exception{
try {
		Debug.PushSubsStack("setColors (hseekbar) ","hseekbar",6,ba,this,58);
int[] _clr = null;
Debug.locals.put("BackGround", _background);
Debug.locals.put("basecolor", _basecolor);
Debug.locals.put("slidercolor", _slidercolor);
Debug.locals.put("caretcolor", _caretcolor);
 BA.debugLineNum = 58;BA.debugLine="Sub setColors(BackGround As Int,basecolor As Int,s";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Dim clr(3) As Int";
Debug.ShouldStop(67108864);
_clr = new int[(int) (3)];
;Debug.locals.put("clr", _clr);
 BA.debugLineNum = 60;BA.debugLine="clr = Array  As Int(BackGround,basecolor,BackGroun";
Debug.ShouldStop(134217728);
_clr = new int[]{_background,_basecolor,_background};Debug.locals.put("clr", _clr);
 BA.debugLineNum = 61;BA.debugLine="dr1.Initialize(\"TOP_BOTTOM\",clr)";
Debug.ShouldStop(268435456);
_dr1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clr);
 BA.debugLineNum = 62;BA.debugLine="Hbase.BackGround =   dr1  ' .Initialize(basecolor,";
Debug.ShouldStop(536870912);
_hbase.setBackground((android.graphics.drawable.Drawable)(_dr1.getObject()));
 BA.debugLineNum = 63;BA.debugLine="clr = Array  As Int(BackGround,slidercolor,BackGro";
Debug.ShouldStop(1073741824);
_clr = new int[]{_background,_slidercolor,_background};Debug.locals.put("clr", _clr);
 BA.debugLineNum = 64;BA.debugLine="dr2.Initialize(\"TOP_BOTTOM\",clr)";
Debug.ShouldStop(-2147483648);
_dr2.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clr);
 BA.debugLineNum = 65;BA.debugLine="slider.BackGround = dr2";
Debug.ShouldStop(1);
_slider.setBackground((android.graphics.drawable.Drawable)(_dr2.getObject()));
 BA.debugLineNum = 66;BA.debugLine="clr = Array  As Int(BackGround,caretcolor,BackGrou";
Debug.ShouldStop(2);
_clr = new int[]{_background,_caretcolor,_background};Debug.locals.put("clr", _clr);
 BA.debugLineNum = 67;BA.debugLine="dr3.Initialize(\"LEFT_RIGHT\",clr)";
Debug.ShouldStop(4);
_dr3.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),_clr);
 BA.debugLineNum = 68;BA.debugLine="caret.BackGround =  dr3";
Debug.ShouldStop(8);
_caret.setBackground((android.graphics.drawable.Drawable)(_dr3.getObject()));
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
public String  _setmaxvalue(int _value) throws Exception{
try {
		Debug.PushSubsStack("setMaxValue (hseekbar) ","hseekbar",6,ba,this,76);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 76;BA.debugLine="Sub setMaxValue(Value As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="MaxV = 100 'Value";
Debug.ShouldStop(4096);
_maxv = (int) (100);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setposition(int _value,boolean _userchanged) throws Exception{
try {
		Debug.PushSubsStack("setPosition (hseekbar) ","hseekbar",6,ba,this,88);
Debug.locals.put("Value", _value);
Debug.locals.put("userchanged", _userchanged);
 BA.debugLineNum = 88;BA.debugLine="Private Sub setPosition(Value As Int, userchanged";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="slider.width = Max(Min(W * Value/MaxV, W ),0)";
Debug.ShouldStop(16777216);
_slider.setWidth((int) (__c.Max(__c.Min(_w*_value/(double)_maxv,_w),0)));
 BA.debugLineNum = 90;BA.debugLine="caret.left = Max(Min(W-D,slider.width-D/2),0)";
Debug.ShouldStop(33554432);
_caret.setLeft((int) (__c.Max(__c.Min(_w-_d,_slider.getWidth()-_d/(double)2),0)));
 BA.debugLineNum = 91;BA.debugLine="Hbase.Invalidate";
Debug.ShouldStop(67108864);
_hbase.Invalidate();
 BA.debugLineNum = 92;BA.debugLine="If SubExists(Hmodule, BarName & \"_ValueChanged\") T";
Debug.ShouldStop(134217728);
if (__c.SubExists(ba,_hmodule,_barname+"_ValueChanged")) { 
 BA.debugLineNum = 93;BA.debugLine="CallSub3(Hmodule,BarName & \"_ValueChanged\", Valu";
Debug.ShouldStop(268435456);
__c.CallSubNew3(ba,_hmodule,_barname+"_ValueChanged",(Object)(_value),(Object)(_userchanged));
 };
 BA.debugLineNum = 95;BA.debugLine="End Sub";
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
public String  _setvalue(int _value) throws Exception{
try {
		Debug.PushSubsStack("setValue (hseekbar) ","hseekbar",6,ba,this,100);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 100;BA.debugLine="Public Sub setValue(Value As Int) 'inserito public";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Vpos = Value";
Debug.ShouldStop(16);
_vpos = _value;
 BA.debugLineNum = 102;BA.debugLine="W = Hbase.Width";
Debug.ShouldStop(32);
_w = _hbase.getWidth();
 BA.debugLineNum = 103;BA.debugLine="setPosition(Vpos,False)";
Debug.ShouldStop(64);
_setposition(_vpos,__c.False);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
