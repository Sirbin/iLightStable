package derez.libs;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class vseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "derez.libs.vseekbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "derez.libs.vseekbar",
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
public Object _vmodule = null;
public anywheresoftware.b4a.objects.PanelWrapper _vbase = null;
public anywheresoftware.b4a.objects.PanelWrapper _cover = null;
public String _barname = "";
public derez.libs.main _main = null;
public derez.libs.size _size = null;
public String  _setvalue(derez.libs.vseekbar __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub setValue(Value As Int)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Vpos = Value";
__ref._vpos = _value;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="H = Vbase.Height";
__ref._h = __ref._vbase.getHeight();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="setPosition(Vpos,False)";
__ref._setposition(null,__ref._vpos,__c.False);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(derez.libs.vseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub AsView As View 'ignore";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Return Vbase";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._vbase.getObject()));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return null;
}
public String  _codecreateview(derez.libs.vseekbar __ref,int _width,int _height,int _maxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub CodeCreateView( width As Int ,height As Int, MaxValue As Int)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="H = height";
__ref._h = _height;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="W = width";
__ref._w = _width;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="MaxV = MaxValue";
__ref._maxv = _maxvalue;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="D =  20dip ' default caret height";
__ref._d = __c.DipToCurrent((int) (20));
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Vbase.Initialize(\"\")";
__ref._vbase.Initialize(ba,"");
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="ContinueCreation";
__ref._continuecreation(null);
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="End Sub";
return "";
}
public String  _continuecreation(derez.libs.vseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub ContinueCreation";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="D = 20dip ' default caret height";
__ref._d = __c.DipToCurrent((int) (20));
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="slider.Initialize(\"\")";
__ref._slider.Initialize(ba,"");
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Vbase.AddView(slider,0,0,W,H)";
__ref._vbase.AddView((android.view.View)(__ref._slider.getObject()),(int) (0),(int) (0),__ref._w,__ref._h);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="caret.Initialize(\"\")";
__ref._caret.Initialize(ba,"");
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Vbase.AddView(caret,0,H/2-D/2,W,D)";
__ref._vbase.AddView((android.view.View)(__ref._caret.getObject()),(int) (0),(int) (__ref._h/(double)2-__ref._d/(double)2),__ref._w,__ref._d);
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="cover.Initialize(\"cover\")";
__ref._cover.Initialize(ba,"cover");
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Vbase.AddView(cover,0,0,W,H)";
__ref._vbase.AddView((android.view.View)(__ref._cover.getObject()),(int) (0),(int) (0),__ref._w,__ref._h);
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="setColors(Colors.Black,Colors.white, Colors.Yellow, Colors.white)";
__ref._setcolors(null,__c.Colors.Black,__c.Colors.White,__c.Colors.Yellow,__c.Colors.White);
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="End Sub";
return "";
}
public String  _setcolors(derez.libs.vseekbar __ref,int _background,int _basecolor,int _slidercolor,int _caretcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
int[] _clr = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub setColors(BackGround As Int,basecolor As Int,slidercolor As Int, caretcolor As Int)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim clr(3) As Int";
_clr = new int[(int) (3)];
;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="clr = Array  As Int(BackGround,basecolor,BackGround)";
_clr = new int[]{_background,_basecolor,_background};
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="dr1.Initialize(\"LEFT_RIGHT\",clr)";
__ref._dr1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),_clr);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Vbase.BackGround =   dr1";
__ref._vbase.setBackground((android.graphics.drawable.Drawable)(__ref._dr1.getObject()));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="clr = Array  As Int(BackGround,slidercolor,BackGround)";
_clr = new int[]{_background,_slidercolor,_background};
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="dr2.Initialize(\"LEFT_RIGHT\",clr)";
__ref._dr2.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),_clr);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="slider.BackGround = dr2";
__ref._slider.setBackground((android.graphics.drawable.Drawable)(__ref._dr2.getObject()));
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="clr = Array  As Int(BackGround,caretcolor,BackGround)";
_clr = new int[]{_background,_caretcolor,_background};
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="dr3.Initialize(\"TOP_BOTTOM\",clr)";
__ref._dr3.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clr);
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="caret.BackGround =  dr3";
__ref._caret.setBackground((android.graphics.drawable.Drawable)(__ref._dr3.getObject()));
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="End Sub";
return "";
}
public boolean  _cover_touch(derez.libs.vseekbar __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
int _k = 0;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub cover_Touch(Action As Int, X As Float, Y As Float) As Boolean";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim k As Int";
_k = 0;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="k = (1-Y/Vbase.Height)* MaxV";
_k = (int) ((1-_y/(double)__ref._vbase.getHeight())*__ref._maxv);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="k = Max(Min(k, MaxV),0)";
_k = (int) (__c.Max(__c.Min(_k,__ref._maxv),0));
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="setPosition(k, True)";
__ref._setposition(null,_k,__c.True);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="End Sub";
return false;
}
public String  _setposition(derez.libs.vseekbar __ref,int _value,boolean _userchanged) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub setPosition(Value As Int, userchanged As Boolean)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="slider.height = Max(Min(H * Value / MaxV, H ),0)";
__ref._slider.setHeight((int) (__c.Max(__c.Min(__ref._h*_value/(double)__ref._maxv,__ref._h),0)));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="slider.Top =  H - slider.height";
__ref._slider.setTop((int) (__ref._h-__ref._slider.getHeight()));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="caret.top = Max(Min(slider.top-D/2, H-D), 0)";
__ref._caret.setTop((int) (__c.Max(__c.Min(__ref._slider.getTop()-__ref._d/(double)2,__ref._h-__ref._d),0)));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Vbase.Invalidate";
__ref._vbase.Invalidate();
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="If SubExists(Vmodule, BarName & \"_ValueChanged\") Then";
if (__c.SubExists(ba,__ref._vmodule,__ref._barname+"_ValueChanged")) { 
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="CallSub3(Vmodule,BarName & \"_ValueChanged\", Value , userchanged )";
__c.CallSubNew3(ba,__ref._vmodule,__ref._barname+"_ValueChanged",(Object)(_value),(Object)(_userchanged));
 };
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(derez.libs.vseekbar __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub DesignerCreateView(base As Panel, Lbl As Label, Props As Map)'ignore";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="base.Left = Lbl.Left";
_base.setLeft(_lbl.getLeft());
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="base.Top = Lbl.top";
_base.setTop(_lbl.getTop());
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="base.Width = Lbl.Width";
_base.setWidth(_lbl.getWidth());
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="base.Height = Lbl.Height";
_base.setHeight(_lbl.getHeight());
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Vbase.Initialize(\"\")";
__ref._vbase.Initialize(ba,"");
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="base.AddView(Vbase,0, 0, Lbl.Width, Lbl.Height)";
_base.AddView((android.view.View)(__ref._vbase.getObject()),(int) (0),(int) (0),_lbl.getWidth(),_lbl.getHeight());
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="H = Lbl.Height";
__ref._h = _lbl.getHeight();
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="W = Lbl.Width";
__ref._w = _lbl.getWidth();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="MaxV = Lbl.text";
__ref._maxv = (int)(Double.parseDouble(_lbl.getText()));
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="ContinueCreation";
__ref._continuecreation(null);
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(derez.libs.vseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub getValue As Int";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return Vpos";
if (true) return __ref._vpos;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(derez.libs.vseekbar __ref,anywheresoftware.b4a.BA _ba,Object _module,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize(Module As Object, Eventname As String)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Vmodule = Module";
__ref._vmodule = _module;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="BarName = Eventname";
__ref._barname = _eventname;
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
public String  _setcaretheight(derez.libs.vseekbar __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub setCaretHeight(value As Int)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="D = value";
__ref._d = _value;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="caret.Height = D";
__ref._caret.setHeight(__ref._d);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="caret.top = Max(Min(slider.top-D/2, H-D), 0)";
__ref._caret.setTop((int) (__c.Max(__c.Min(__ref._slider.getTop()-__ref._d/(double)2,__ref._h-__ref._d),0)));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public String  _setmaxvalue(derez.libs.vseekbar __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vseekbar";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub setMaxValue(Value As Int)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="MaxV = Value";
__ref._maxv = _value;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
}