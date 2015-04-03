package derez.libs;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class circleseek extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "derez.libs.circleseek");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "derez.libs.circleseek",
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
public boolean _first = false;
public int _cwith = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cnvs = null;
public float[] _difbase = null;
public float[] _difside = null;
public float _ds = 0f;
public int _cx = 0;
public int _cy = 0;
public int _s = 0;
public int[] _resbase = null;
public int[] _resside = null;
public int[] _rescnt = null;
public double _maxv = 0;
public double _position = 0;
public int _basecolor = 0;
public int _sliderside = 0;
public int _slidercnt = 0;
public int _textcolor = 0;
public int _textsize = 0;
public int _none = 0;
public int _short_knob = 0;
public int _long_knob = 0;
public anywheresoftware.b4a.objects.LabelWrapper _clabel = null;
public Object _cmodule = null;
public anywheresoftware.b4a.objects.PanelWrapper _cbase = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _basepath = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _slidepath = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
public String _event = "";
public derez.libs.main _main = null;
public derez.libs.size _size = null;
public String  _initialize(derez.libs.circleseek __ref,anywheresoftware.b4a.BA _ba,Object _module,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="circleseek";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Initialize(Module As Object, Eventname As String)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="CModule = Module";
__ref._cmodule = _module;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Event = Eventname";
__ref._event = _eventname;
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="End Sub";
return "";
}
public String  _codecreateview(derez.libs.circleseek __ref,int _width,int _height,int _maxvalue,int _withknob) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub CodeCreateView(Width As Int ,Height As Int, MaxValue As Int, WithKnob As Int)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="maxv = MaxValue";
__ref._maxv = _maxvalue;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Cbase.Initialize(\"Cbase\")";
__ref._cbase.Initialize(ba,"Cbase");
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Cwith = WithKnob";
__ref._cwith = _withknob;
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="ContinueCreation";
__ref._continuecreation(null);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(derez.libs.circleseek __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Return Cbase";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cbase.getObject()));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return null;
}
public String  _setcolors(derez.libs.circleseek __ref,int _base_color,int _slider_color_side,int _slider_color_cnt,int _text_color,int _text_size) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub setColors(base_color As Int,slider_color_side As Int,slider_color_cnt As Int, Text_color As Int, Text_size As Int)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="basecolor = base_color";
__ref._basecolor = _base_color;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="sliderside = slider_color_side";
__ref._sliderside = _slider_color_side;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="slidercnt = slider_color_cnt";
__ref._slidercnt = _slider_color_cnt;
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Textcolor = Text_color";
__ref._textcolor = _text_color;
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Textsize = Text_size";
__ref._textsize = _text_size;
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="resbase = ParseColor(basecolor)";
__ref._resbase = __ref._parsecolor(null,__ref._basecolor);
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="difbase(1) = (255-resbase(1))/10";
__ref._difbase[(int) (1)] = (float) ((255-__ref._resbase[(int) (1)])/(double)10);
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="difbase(2) = (255-resbase(2))/10";
__ref._difbase[(int) (2)] = (float) ((255-__ref._resbase[(int) (2)])/(double)10);
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="difbase(3) = (255-resbase(3))/10";
__ref._difbase[(int) (3)] = (float) ((255-__ref._resbase[(int) (3)])/(double)10);
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="rescnt = ParseColor(slidercnt)";
__ref._rescnt = __ref._parsecolor(null,__ref._slidercnt);
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="resside = ParseColor(sliderside)";
__ref._resside = __ref._parsecolor(null,__ref._sliderside);
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="difside(1) = (rescnt(1)-resside(1))/10";
__ref._difside[(int) (1)] = (float) ((__ref._rescnt[(int) (1)]-__ref._resside[(int) (1)])/(double)10);
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="difside(2) = (rescnt(2)-resside(2))/10";
__ref._difside[(int) (2)] = (float) ((__ref._rescnt[(int) (2)]-__ref._resside[(int) (2)])/(double)10);
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="difside(3) = (rescnt(3)-resside(3))/10";
__ref._difside[(int) (3)] = (float) ((__ref._rescnt[(int) (3)]-__ref._resside[(int) (3)])/(double)10);
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(derez.libs.circleseek __ref,double _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub setValue(Value As Double)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If first Then ' only after the new size of the view is known";
if (__ref._first) { 
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="cnvs.Initialize(Cbase)";
__ref._cnvs.Initialize((android.view.View)(__ref._cbase.getObject()));
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="R.Target = cnvs";
__ref._r.Target = (Object)(__ref._cnvs);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="R.Target = R.GetField(\"paint\")";
__ref._r.Target = __ref._r.GetField("paint");
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="R.RunMethod2(\"setAntiAlias\", True, \"java.lang.boolean\")";
__ref._r.RunMethod2("setAntiAlias",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="S = Min(Cbase.Width, Cbase.Height)";
__ref._s = (int) (__c.Min(__ref._cbase.getWidth(),__ref._cbase.getHeight()));
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="ds = 0.005 * S";
__ref._ds = (float) (0.005*__ref._s);
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="cx = S/2";
__ref._cx = (int) (__ref._s/(double)2);
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="cy = S/2";
__ref._cy = (int) (__ref._s/(double)2);
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="basepath.Initialize(0,S)";
__ref._basepath.Initialize((float) (0),(float) (__ref._s));
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="basepath.LineTo(0,0)";
__ref._basepath.LineTo((float) (0),(float) (0));
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="basepath.LineTo(S,0)";
__ref._basepath.LineTo((float) (__ref._s),(float) (0));
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="basepath.LineTo(S,S)";
__ref._basepath.LineTo((float) (__ref._s),(float) (__ref._s));
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="basepath.LineTo(cx,cy)";
__ref._basepath.LineTo((float) (__ref._cx),(float) (__ref._cy));
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="basepath.LineTo(0,S)";
__ref._basepath.LineTo((float) (0),(float) (__ref._s));
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="Clabel.Initialize(\"\")";
__ref._clabel.Initialize(ba,"");
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="Clabel.Color = Colors.Transparent";
__ref._clabel.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="Clabel.Textcolor = Textcolor";
__ref._clabel.setTextColor(__ref._textcolor);
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="Clabel.Textsize = Textsize";
__ref._clabel.setTextSize((float) (__ref._textsize));
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="Clabel.Gravity = Gravity.CENTER";
__ref._clabel.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="Cbase.AddView(Clabel,cx-S/4,cy,S/2,S/2)";
__ref._cbase.AddView((android.view.View)(__ref._clabel.getObject()),(int) (__ref._cx-__ref._s/(double)4),__ref._cy,(int) (__ref._s/(double)2),(int) (__ref._s/(double)2));
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="first = False";
__ref._first = __c.False;
 };
RDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="position = Value";
__ref._position = _value;
RDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="DrawPosition(Round(Value * 270 / maxv),False)";
__ref._drawposition(null,(int) (__c.Round(_value*270/(double)__ref._maxv)),__c.False);
RDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="End Sub";
return "";
}
public boolean  _cbase_touch(derez.libs.circleseek __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
float _teta = 0f;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub Cbase_Touch (Action As Int, X As Float, Y As Float) As Boolean";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim teta As Float = RtoAngle(X,Y)";
_teta = __ref._rtoangle(null,_x,_y);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="If teta > 0 AND teta < 270 Then DrawPosition(teta, True)";
if (_teta>0 && _teta<270) { 
__ref._drawposition(null,(int) (_teta),__c.True);};
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return false;
}
public float  _rtoangle(derez.libs.circleseek __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
float _teta = 0f;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub RtoAngle(X As Float, Y As Float) As Float";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim teta As Float";
_teta = 0f;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If Y <> 0 Then";
if (_y!=0) { 
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="teta = ATan2D((X-cx),(cy-Y)) + 135";
_teta = (float) (__c.ATan2D((_x-__ref._cx),(__ref._cy-_y))+135);
 }else {
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="If (X-cx) > 0 Then teta = 235 Else teta = 45";
if ((_x-__ref._cx)>0) { 
_teta = (float) (235);}
else {
_teta = (float) (45);};
 };
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Return teta";
if (true) return _teta;
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="End Sub";
return 0f;
}
public String  _drawposition(derez.libs.circleseek __ref,int _angle,boolean _userchanged) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
int _k = 0;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub DrawPosition(Angle As Int, userchanged As Boolean)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="DrawBase";
__ref._drawbase(null);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="DrawSlider(Angle)";
__ref._drawslider(null,(float) (_angle));
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="position = Angle * maxv / 270";
__ref._position = _angle*__ref._maxv/(double)270;
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Clabel.Text = NumberFormat(position,0,0)";
__ref._clabel.setText((Object)(__c.NumberFormat(__ref._position,(int) (0),(int) (0))));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Cbase.Invalidate";
__ref._cbase.Invalidate();
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="cnvs.RemoveClip";
__ref._cnvs.RemoveClip();
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Dim k As Int = position";
_k = (int) (__ref._position);
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="If SubExists(CModule, Event & \"_ValueChanged\") Then";
if (__c.SubExists(ba,__ref._cmodule,__ref._event+"_ValueChanged")) { 
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="CallSub3(CModule, Event & \"_ValueChanged\",k, userchanged )";
__c.CallSubNew3(ba,__ref._cmodule,__ref._event+"_ValueChanged",(Object)(_k),(Object)(_userchanged));
 };
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="End Sub";
return "";
}
public String  _continuecreation(derez.libs.circleseek __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub ContinueCreation";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="setColors(Colors.Gray, Colors.DarkGray,Colors.LightGray, Colors.white, 24)";
__ref._setcolors(null,__c.Colors.Gray,__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.White,(int) (24));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(derez.libs.circleseek __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub DesignerCreateView(base As Panel, Lbl As Label, Props As Map)'ignore";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="S = Min(Lbl.Width, Lbl.Height)";
__ref._s = (int) (__c.Min(_lbl.getWidth(),_lbl.getHeight()));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="ds = 0.005 * S";
__ref._ds = (float) (0.005*__ref._s);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Cbase.Initialize(\"Cbase\")";
__ref._cbase.Initialize(ba,"Cbase");
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="base.AddView(Cbase,0,0,S,S)";
_base.AddView((android.view.View)(__ref._cbase.getObject()),(int) (0),(int) (0),__ref._s,__ref._s);
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="maxv = Lbl.text";
__ref._maxv = (double)(Double.parseDouble(_lbl.getText()));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Cwith =  Lbl.Tag";
__ref._cwith = (int)(BA.ObjectToNumber(_lbl.getTag()));
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="ContinueCreation";
__ref._continuecreation(null);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="End Sub";
return "";
}
public String  _drawbase(derez.libs.circleseek __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
int _clr = 0;
int _i = 0;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub DrawBase";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="cnvs.ClipPath(basepath)";
__ref._cnvs.ClipPath((android.graphics.Path)(__ref._basepath.getObject()));
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="For i = 1 To 10";
{
final int step110 = 1;
final int limit110 = (int) (10);
for (_i = (int) (1); (step110 > 0 && _i <= limit110) || (step110 < 0 && _i >= limit110); _i = ((int)(0 + _i + step110))) {
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="clr = Colors.rgb(resbase(1)+i*difbase(1),resbase(2)+i*difbase(2),resbase(3)+i*difbase(3))";
_clr = __c.Colors.RGB((int) (__ref._resbase[(int) (1)]+_i*__ref._difbase[(int) (1)]),(int) (__ref._resbase[(int) (2)]+_i*__ref._difbase[(int) (2)]),(int) (__ref._resbase[(int) (3)]+_i*__ref._difbase[(int) (3)]));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.5 -i*ds, clr, False, 2)";
__ref._cnvs.DrawCircle((float) (__ref._cx),(float) (__ref._cy),(float) (__ref._s*0.5-_i*__ref._ds),_clr,__c.False,(float) (2));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.4 +i*ds, clr, False, 2)";
__ref._cnvs.DrawCircle((float) (__ref._cx),(float) (__ref._cy),(float) (__ref._s*0.4+_i*__ref._ds),_clr,__c.False,(float) (2));
 }
};
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="End Sub";
return "";
}
public String  _drawslider(derez.libs.circleseek __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
int _clr = 0;
float[] _point = null;
int _i = 0;
float[] _p1 = null;
float[] _p2 = null;
float _dk = 0f;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub DrawSlider(angle As Float)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="slidepath.Initialize(0,S)";
__ref._slidepath.Initialize((float) (0),(float) (__ref._s));
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="If angle > 90 Then slidepath.LineTo(0,0)";
if (_angle>90) { 
__ref._slidepath.LineTo((float) (0),(float) (0));};
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="If angle > 180 Then slidepath.LineTo(S,0)";
if (_angle>180) { 
__ref._slidepath.LineTo((float) (__ref._s),(float) (0));};
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Dim point(2) As Float = PtoR(angle , 2*cx)";
_point = __ref._ptor(null,_angle,(float) (2*__ref._cx));
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="slidepath.LineTo(point(0),point(1))";
__ref._slidepath.LineTo(_point[(int) (0)],_point[(int) (1)]);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="slidepath.LineTo(cx,cy)";
__ref._slidepath.LineTo((float) (__ref._cx),(float) (__ref._cy));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="cnvs.ClipPath(slidepath)";
__ref._cnvs.ClipPath((android.graphics.Path)(__ref._slidepath.getObject()));
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="For i = 1 To 10  ' Draws the slider circle";
{
final int step125 = 1;
final int limit125 = (int) (10);
for (_i = (int) (1); (step125 > 0 && _i <= limit125) || (step125 < 0 && _i >= limit125); _i = ((int)(0 + _i + step125))) {
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="clr = Colors.rgb(resside(1)+i*difside(1),resside(2)+i*difside(2),resside(3)+i*difside(3))";
_clr = __c.Colors.RGB((int) (__ref._resside[(int) (1)]+_i*__ref._difside[(int) (1)]),(int) (__ref._resside[(int) (2)]+_i*__ref._difside[(int) (2)]),(int) (__ref._resside[(int) (3)]+_i*__ref._difside[(int) (3)]));
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.5 -i*ds, clr, False, 2)";
__ref._cnvs.DrawCircle((float) (__ref._cx),(float) (__ref._cy),(float) (__ref._s*0.5-_i*__ref._ds),_clr,__c.False,(float) (2));
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.4 +i*ds, clr, False, 2)";
__ref._cnvs.DrawCircle((float) (__ref._cx),(float) (__ref._cy),(float) (__ref._s*0.4+_i*__ref._ds),_clr,__c.False,(float) (2));
 }
};
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="cnvs.RemoveClip";
__ref._cnvs.RemoveClip();
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="Select Cwith";
switch (BA.switchObjectToInt(__ref._cwith,__ref._none,__ref._short_knob,__ref._long_knob)) {
case 0:
 break;
case 1:
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="Dim p1(2), p2(2), dk  As Float";
_p1 = new float[(int) (2)];
;
_p2 = new float[(int) (2)];
;
_dk = 0f;
RDebugUtils.currentLine=2555926;
 //BA.debugLineNum = 2555926;BA.debugLine="For i = 1 To 10";
{
final int step135 = 1;
final int limit135 = (int) (10);
for (_i = (int) (1); (step135 > 0 && _i <= limit135) || (step135 < 0 && _i >= limit135); _i = ((int)(0 + _i + step135))) {
RDebugUtils.currentLine=2555927;
 //BA.debugLineNum = 2555927;BA.debugLine="dk = -7+i*0.7";
_dk = (float) (-7+_i*0.7);
RDebugUtils.currentLine=2555928;
 //BA.debugLineNum = 2555928;BA.debugLine="p1 = PtoR(angle+dk , S*0.5)";
_p1 = __ref._ptor(null,(float) (_angle+_dk),(float) (__ref._s*0.5));
RDebugUtils.currentLine=2555929;
 //BA.debugLineNum = 2555929;BA.debugLine="p2 = PtoR(angle+dk , S*0.4)";
_p2 = __ref._ptor(null,(float) (_angle+_dk),(float) (__ref._s*0.4));
RDebugUtils.currentLine=2555930;
 //BA.debugLineNum = 2555930;BA.debugLine="clr = Colors.RGB(i*25,i*25,i*25) 'from black to white";
_clr = __c.Colors.RGB((int) (_i*25),(int) (_i*25),(int) (_i*25));
RDebugUtils.currentLine=2555931;
 //BA.debugLineNum = 2555931;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),p2(0),p2(1),clr,1)";
__ref._cnvs.DrawLine(_p1[(int) (0)],_p1[(int) (1)],_p2[(int) (0)],_p2[(int) (1)],_clr,(float) (1));
RDebugUtils.currentLine=2555932;
 //BA.debugLineNum = 2555932;BA.debugLine="p1 = PtoR(angle-dk , S*0.5)";
_p1 = __ref._ptor(null,(float) (_angle-_dk),(float) (__ref._s*0.5));
RDebugUtils.currentLine=2555933;
 //BA.debugLineNum = 2555933;BA.debugLine="p2 = PtoR(angle-dk , S*0.4)";
_p2 = __ref._ptor(null,(float) (_angle-_dk),(float) (__ref._s*0.4));
RDebugUtils.currentLine=2555934;
 //BA.debugLineNum = 2555934;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),p2(0),p2(1),clr,1)";
__ref._cnvs.DrawLine(_p1[(int) (0)],_p1[(int) (1)],_p2[(int) (0)],_p2[(int) (1)],_clr,(float) (1));
 }
};
 break;
case 2:
RDebugUtils.currentLine=2555938;
 //BA.debugLineNum = 2555938;BA.debugLine="Dim p1(2), dk  As Float";
_p1 = new float[(int) (2)];
;
_dk = 0f;
RDebugUtils.currentLine=2555939;
 //BA.debugLineNum = 2555939;BA.debugLine="cnvs.ClipPath(basepath)";
__ref._cnvs.ClipPath((android.graphics.Path)(__ref._basepath.getObject()));
RDebugUtils.currentLine=2555940;
 //BA.debugLineNum = 2555940;BA.debugLine="clr = cnvs.Bitmap.GetPixel(1dip,1dip)";
_clr = __ref._cnvs.getBitmap().GetPixel(__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=2555941;
 //BA.debugLineNum = 2555941;BA.debugLine="cnvs.DrawCircle(cx,cy,S*0.4,clr,True,1) ' erase the previous arrow";
__ref._cnvs.DrawCircle((float) (__ref._cx),(float) (__ref._cy),(float) (__ref._s*0.4),_clr,__c.True,(float) (1));
RDebugUtils.currentLine=2555942;
 //BA.debugLineNum = 2555942;BA.debugLine="For i = 1 To 10";
{
final int step150 = 1;
final int limit150 = (int) (10);
for (_i = (int) (1); (step150 > 0 && _i <= limit150) || (step150 < 0 && _i >= limit150); _i = ((int)(0 + _i + step150))) {
RDebugUtils.currentLine=2555943;
 //BA.debugLineNum = 2555943;BA.debugLine="dk = -7+i*0.7";
_dk = (float) (-7+_i*0.7);
RDebugUtils.currentLine=2555944;
 //BA.debugLineNum = 2555944;BA.debugLine="p1 = PtoR(angle+dk , S*0.5)";
_p1 = __ref._ptor(null,(float) (_angle+_dk),(float) (__ref._s*0.5));
RDebugUtils.currentLine=2555945;
 //BA.debugLineNum = 2555945;BA.debugLine="clr = Colors.RGB(i*25,i*25,i*25) 'from black to white";
_clr = __c.Colors.RGB((int) (_i*25),(int) (_i*25),(int) (_i*25));
RDebugUtils.currentLine=2555946;
 //BA.debugLineNum = 2555946;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),cx,cy,clr,1)";
__ref._cnvs.DrawLine(_p1[(int) (0)],_p1[(int) (1)],(float) (__ref._cx),(float) (__ref._cy),_clr,(float) (1));
RDebugUtils.currentLine=2555947;
 //BA.debugLineNum = 2555947;BA.debugLine="p1 = PtoR(angle-dk , S*0.5)";
_p1 = __ref._ptor(null,(float) (_angle-_dk),(float) (__ref._s*0.5));
RDebugUtils.currentLine=2555948;
 //BA.debugLineNum = 2555948;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),cx,cy,clr,1)";
__ref._cnvs.DrawLine(_p1[(int) (0)],_p1[(int) (1)],(float) (__ref._cx),(float) (__ref._cy),_clr,(float) (1));
 }
};
 break;
default:
 break;
}
;
RDebugUtils.currentLine=2555954;
 //BA.debugLineNum = 2555954;BA.debugLine="End Sub";
return "";
}
public float[]  _ptor(derez.libs.circleseek __ref,float _alfa,float _rad) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
float[] _point = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub PtoR(alfa As Float, Rad As Float) As Float()";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim point(2) As Float";
_point = new float[(int) (2)];
;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="point(0) = cx + Rad * SinD(alfa - 135)";
_point[(int) (0)] = (float) (__ref._cx+_rad*__c.SinD(_alfa-135));
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="point(1) = cy - Rad * CosD(alfa - 135)";
_point[(int) (1)] = (float) (__ref._cy-_rad*__c.CosD(_alfa-135));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Return point";
if (true) return _point;
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="End Sub";
return null;
}
public double  _getvalue(derez.libs.circleseek __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub getValue As Double";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Return position";
if (true) return __ref._position;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return 0;
}
public int[]  _parsecolor(derez.libs.circleseek __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="circleseek";
int[] _res = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub ParseColor(clr As Int) As Int()";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff000000), 24) ' alfa";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_clr,(int) (0xff000000)),(int) (24));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff0000), 16)   ' R";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_clr,(int) (0xff0000)),(int) (16));
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff00), 8)      ' G";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_clr,(int) (0xff00)),(int) (8));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="res(3) = Bit.AND(clr, 0xff)  ' B";
_res[(int) (3)] = __c.Bit.And(_clr,(int) (0xff));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="End Sub";
return null;
}
}