package derez.libs;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class hseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "derez.libs.hseekbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "derez.libs.hseekbar",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public derez.libs.main _main = null;
public derez.libs.size _size = null;
public String  _setcolors(derez.libs.hseekbar __ref,int _background,int _basecolor,int _slidercolor,int _caretcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
int[] _clr = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub setColors(BackGround As Int,basecolor As Int,slidercolor As Int, caretcolor As Int)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim clr(3) As Int";
_clr = new int[(int) (3)];
;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="clr = Array  As Int(BackGround,basecolor,BackGround)";
_clr = new int[]{_background,_basecolor,_background};
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="dr1.Initialize(\"TOP_BOTTOM\",clr)";
__ref._dr1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clr);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Hbase.BackGround =   dr1  ' .Initialize(basecolor,BackGround,False)";
__ref._hbase.setBackground((android.graphics.drawable.Drawable)(__ref._dr1.getObject()));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="clr = Array  As Int(BackGround,slidercolor,BackGround)";
_clr = new int[]{_background,_slidercolor,_background};
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="dr2.Initialize(\"TOP_BOTTOM\",clr)";
__ref._dr2.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clr);
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="slider.BackGround = dr2";
__ref._slider.setBackground((android.graphics.drawable.Drawable)(__ref._dr2.getObject()));
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="clr = Array  As Int(BackGround,caretcolor,BackGround)";
_clr = new int[]{_background,_caretcolor,_background};
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="dr3.Initialize(\"LEFT_RIGHT\",clr)";
__ref._dr3.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),_clr);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="caret.BackGround =  dr3";
__ref._caret.setBackground((android.graphics.drawable.Drawable)(__ref._dr3.getObject()));
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(derez.libs.hseekbar __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub setValue(Value As Int)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Vpos = Value";
__ref._vpos = _value;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="W = Hbase.Width";
__ref._w = __ref._hbase.getWidth();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="setPosition(Vpos,False)";
__ref._setposition(null,__ref._vpos,__c.False);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(derez.libs.hseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub AsView As View 'ignore";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return Hbase";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._hbase.getObject()));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return null;
}
public String  _codecreateview(derez.libs.hseekbar __ref,int _width,int _height,int _maxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub CodeCreateView( width As Int ,height As Int, MaxValue As Int)";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="H = height";
__ref._h = _height;
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="W = width";
__ref._w = _width;
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="MaxV = MaxValue";
__ref._maxv = _maxvalue;
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Hbase.Initialize(\"\")";
__ref._hbase.Initialize(ba,"");
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="ContinueCreation";
__ref._continuecreation(null);
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="End Sub";
return "";
}
public String  _continuecreation(derez.libs.hseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub ContinueCreation";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="D = 20dip ' default caret width";
__ref._d = __c.DipToCurrent((int) (20));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="slider.Initialize(\"\")";
__ref._slider.Initialize(ba,"");
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Hbase.AddView(slider,0,0,W,H)";
__ref._hbase.AddView((android.view.View)(__ref._slider.getObject()),(int) (0),(int) (0),__ref._w,__ref._h);
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="caret.Initialize(\"\")";
__ref._caret.Initialize(ba,"");
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Hbase.AddView(caret,W/2-D/2,0,D,H)";
__ref._hbase.AddView((android.view.View)(__ref._caret.getObject()),(int) (__ref._w/(double)2-__ref._d/(double)2),(int) (0),__ref._d,__ref._h);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="cover.Initialize(\"cover\")";
__ref._cover.Initialize(ba,"cover");
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Hbase.AddView(cover,0,0,W,H)";
__ref._hbase.AddView((android.view.View)(__ref._cover.getObject()),(int) (0),(int) (0),__ref._w,__ref._h);
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="setColors(Colors.Black,Colors.white, Colors.Yellow, Colors.white)";
__ref._setcolors(null,__c.Colors.Black,__c.Colors.White,__c.Colors.Yellow,__c.Colors.White);
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="End Sub";
return "";
}
public boolean  _cover_touch(derez.libs.hseekbar __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
int _k = 0;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub cover_Touch(Action As Int, X As Float, Y As Float) As Boolean";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim k As Int";
_k = 0;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="k = X * MaxV / Hbase.Width";
_k = (int) (_x*__ref._maxv/(double)__ref._hbase.getWidth());
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="k = Max(Min(k, MaxV),0)";
_k = (int) (__c.Max(__c.Min(_k,__ref._maxv),0));
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="setPosition(k, True)";
__ref._setposition(null,_k,__c.True);
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="End Sub";
return false;
}
public String  _setposition(derez.libs.hseekbar __ref,int _value,boolean _userchanged) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub setPosition(Value As Int, userchanged As Boolean)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="slider.width = Max(Min(W * Value/MaxV, W ),0)";
__ref._slider.setWidth((int) (__c.Max(__c.Min(__ref._w*_value/(double)__ref._maxv,__ref._w),0)));
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="caret.left = Max(Min(W-D,slider.width-D/2),0)";
__ref._caret.setLeft((int) (__c.Max(__c.Min(__ref._w-__ref._d,__ref._slider.getWidth()-__ref._d/(double)2),0)));
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Hbase.Invalidate";
__ref._hbase.Invalidate();
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="If SubExists(Hmodule, BarName & \"_ValueChanged\") Then";
if (__c.SubExists(ba,__ref._hmodule,__ref._barname+"_ValueChanged")) { 
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="CallSub3(Hmodule,BarName & \"_ValueChanged\", Value , userchanged )";
__c.CallSubNew3(ba,__ref._hmodule,__ref._barname+"_ValueChanged",(Object)(_value),(Object)(_userchanged));
 };
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(derez.libs.hseekbar __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub DesignerCreateView(base As Panel, Lbl As Label, Props As Map) 'ignore";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="mybase = base";
__ref._mybase = _base;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="mybase.Left = Lbl.Left";
__ref._mybase.setLeft(_lbl.getLeft());
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="mybase.Top = Lbl.top";
__ref._mybase.setTop(_lbl.getTop());
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="mybase.Width = Lbl.Width";
__ref._mybase.setWidth(_lbl.getWidth());
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="mybase.Height = Lbl.Height";
__ref._mybase.setHeight(_lbl.getHeight());
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Hbase.Initialize(\"\")";
__ref._hbase.Initialize(ba,"");
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="base.AddView(Hbase,0, 0, Lbl.Width, Lbl.Height)";
_base.AddView((android.view.View)(__ref._hbase.getObject()),(int) (0),(int) (0),_lbl.getWidth(),_lbl.getHeight());
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="H = Lbl.Height";
__ref._h = _lbl.getHeight();
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="W = Lbl.Width";
__ref._w = _lbl.getWidth();
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="MaxV = Lbl.text";
__ref._maxv = (int)(Double.parseDouble(_lbl.getText()));
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="ContinueCreation";
__ref._continuecreation(null);
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(derez.libs.hseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub getValue As Int";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Return Vpos";
if (true) return __ref._vpos;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(derez.libs.hseekbar __ref,anywheresoftware.b4a.BA _ba,Object _module,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub Initialize(Module As Object, Eventname As String)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Hmodule = Module";
__ref._hmodule = _module;
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="BarName = Eventname";
__ref._barname = _eventname;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="End Sub";
return "";
}
public String  _setcaretwidth(derez.libs.hseekbar __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub setCaretWidth(value As Int)";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="D = value";
__ref._d = _value;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="caret.Width = D";
__ref._caret.setWidth(__ref._d);
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="caret.left = Max(Min(W-D,slider.width-D/2),0)";
__ref._caret.setLeft((int) (__c.Max(__c.Min(__ref._w-__ref._d,__ref._slider.getWidth()-__ref._d/(double)2),0)));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="End Sub";
return "";
}
public String  _setmaxvalue(derez.libs.hseekbar __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="hseekbar";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub setMaxValue(Value As Int)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="MaxV = Value";
__ref._maxv = _value;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
}