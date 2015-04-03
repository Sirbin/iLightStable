package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class circleseek extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.circleseek");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.circleseek",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
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
public b4a.example.main _main = null;
public b4a.example.sensortable _sensortable = null;
public b4a.example.config _config = null;
public b4a.example.size _size = null;
public b4a.example.cancellato _cancellato = null;
public b4a.example.configpagemod _configpagemod = null;
public b4a.example.configurationwizardmod _configurationwizardmod = null;
public b4a.example.policiesmode _policiesmode = null;
  public Object[] GetGlobals() {
		return new Object[] {"basecolor",_basecolor,"basepath",_basepath,"cancellato",Debug.moduleToString(b4a.example.cancellato.class),"Cbase",_cbase,"Clabel",_clabel,"CModule",_cmodule,"cnvs",_cnvs,"config",Debug.moduleToString(b4a.example.config.class),"ConfigPageMod",Debug.moduleToString(b4a.example.configpagemod.class),"ConfigurationWizardMod",Debug.moduleToString(b4a.example.configurationwizardmod.class),"Cwith",_cwith,"cx",_cx,"cy",_cy,"difbase",_difbase,"difside",_difside,"ds",_ds,"Event",_event,"first",_first,"LONG_KNOB",_long_knob,"Main",Debug.moduleToString(b4a.example.main.class),"maxv",_maxv,"NONE",_none,"PoliciesMode",Debug.moduleToString(b4a.example.policiesmode.class),"position",_position,"R",_r,"resbase",_resbase,"rescnt",_rescnt,"resside",_resside,"S",_s,"SensorTable",Debug.moduleToString(b4a.example.sensortable.class),"SHORT_KNOB",_short_knob,"Size",Debug.moduleToString(b4a.example.size.class),"slidepath",_slidepath,"slidercnt",_slidercnt,"sliderside",_sliderside,"Textcolor",_textcolor,"Textsize",_textsize};
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
try {
		Debug.PushSubsStack("AsView (circleseek) ","circleseek",10,ba,this,82);
 BA.debugLineNum = 82;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Return Cbase";
Debug.ShouldStop(262144);
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_cbase.getObject()));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _cbase_touch(int _action,float _x,float _y) throws Exception{
try {
		Debug.PushSubsStack("Cbase_Touch (circleseek) ","circleseek",10,ba,this,86);
float _teta = 0f;
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 86;BA.debugLine="Private Sub Cbase_Touch (Action As Int, X As Float";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim teta As Float = RtoAngle(X,Y)";
Debug.ShouldStop(4194304);
_teta = _rtoangle(_x,_y);Debug.locals.put("teta", _teta);Debug.locals.put("teta", _teta);
 BA.debugLineNum = 88;BA.debugLine="If teta > 0 AND teta < 270 Then DrawPosition(teta";
Debug.ShouldStop(8388608);
if (_teta>0 && _teta<270) { 
_drawposition((int) (_teta),__c.True);};
 BA.debugLineNum = 89;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return __c.True;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private first As Boolean = True";
_first = __c.True;
 //BA.debugLineNum = 7;BA.debugLine="Private Cwith As Int";
_cwith = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private cnvs As Canvas";
_cnvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private difbase(4),difside(4), ds  As Float";
_difbase = new float[(int) (4)];
;
_difside = new float[(int) (4)];
;
_ds = 0f;
 //BA.debugLineNum = 10;BA.debugLine="Private cx,cy,S, resbase(),resside(), rescnt() As";
_cx = 0;
_cy = 0;
_s = 0;
_resbase = new int[(int) (0)];
;
_resside = new int[(int) (0)];
;
_rescnt = new int[(int) (0)];
;
 //BA.debugLineNum = 11;BA.debugLine="Private maxv, position As Double";
_maxv = 0;
_position = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private basecolor,sliderside,slidercnt  As Int";
_basecolor = 0;
_sliderside = 0;
_slidercnt = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private Cwith, Textcolor, Textsize As Int";
_cwith = 0;
_textcolor = 0;
_textsize = 0;
 //BA.debugLineNum = 14;BA.debugLine="Public NONE As Int = 0";
_none = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Public SHORT_KNOB As Int = 1";
_short_knob = (int) (1);
 //BA.debugLineNum = 16;BA.debugLine="Public LONG_KNOB As Int = 2";
_long_knob = (int) (2);
 //BA.debugLineNum = 17;BA.debugLine="Private Clabel As Label";
_clabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private CModule As Object";
_cmodule = new Object();
 //BA.debugLineNum = 19;BA.debugLine="Private  Cbase As Panel";
_cbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private basepath, slidepath As Path";
_basepath = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_slidepath = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private R As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 22;BA.debugLine="Private Event As String";
_event = "";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _codecreateview(int _width,int _height,int _maxvalue,int _withknob) throws Exception{
try {
		Debug.PushSubsStack("CodeCreateView (circleseek) ","circleseek",10,ba,this,35);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("MaxValue", _maxvalue);
Debug.locals.put("WithKnob", _withknob);
 BA.debugLineNum = 35;BA.debugLine="Public Sub CodeCreateView(Width As Int ,Height As";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="maxv = MaxValue";
Debug.ShouldStop(8);
_maxv = _maxvalue;
 BA.debugLineNum = 37;BA.debugLine="Cbase.Initialize(\"Cbase\")";
Debug.ShouldStop(16);
_cbase.Initialize(ba,"Cbase");
 BA.debugLineNum = 38;BA.debugLine="Cwith = WithKnob";
Debug.ShouldStop(32);
_cwith = _withknob;
 BA.debugLineNum = 39;BA.debugLine="ContinueCreation";
Debug.ShouldStop(64);
_continuecreation();
 BA.debugLineNum = 40;BA.debugLine="End Sub";
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
public String  _continuecreation() throws Exception{
try {
		Debug.PushSubsStack("ContinueCreation (circleseek) ","circleseek",10,ba,this,53);
 BA.debugLineNum = 53;BA.debugLine="Private Sub ContinueCreation";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="setColors(Colors.Gray, Colors.DarkGray,Colors.Lig";
Debug.ShouldStop(4194304);
_setcolors(__c.Colors.Gray,__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.White,(int) (24));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return "";
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
		Debug.PushSubsStack("DesignerCreateView (circleseek) ","circleseek",10,ba,this,43);
Debug.locals.put("base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 43;BA.debugLine="Private Sub DesignerCreateView(base As Panel, Lbl";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="S = Min(Lbl.Width, Lbl.Height)";
Debug.ShouldStop(2048);
_s = (int) (__c.Min(_lbl.getWidth(),_lbl.getHeight()));
 BA.debugLineNum = 45;BA.debugLine="ds = 0.005 * S";
Debug.ShouldStop(4096);
_ds = (float) (0.005*_s);
 BA.debugLineNum = 46;BA.debugLine="Cbase.Initialize(\"Cbase\")";
Debug.ShouldStop(8192);
_cbase.Initialize(ba,"Cbase");
 BA.debugLineNum = 47;BA.debugLine="base.AddView(Cbase,0,0,S,S)";
Debug.ShouldStop(16384);
_base.AddView((android.view.View)(_cbase.getObject()),(int) (0),(int) (0),_s,_s);
 BA.debugLineNum = 48;BA.debugLine="maxv = Lbl.text";
Debug.ShouldStop(32768);
_maxv = (double)(Double.parseDouble(_lbl.getText()));
 BA.debugLineNum = 49;BA.debugLine="Cwith =  Lbl.Tag";
Debug.ShouldStop(65536);
_cwith = (int)(BA.ObjectToNumber(_lbl.getTag()));
 BA.debugLineNum = 50;BA.debugLine="ContinueCreation";
Debug.ShouldStop(131072);
_continuecreation();
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _drawbase() throws Exception{
try {
		Debug.PushSubsStack("DrawBase (circleseek) ","circleseek",10,ba,this,141);
int _clr = 0;
int _i = 0;
 BA.debugLineNum = 141;BA.debugLine="Private Sub DrawBase";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(8192);
_clr = 0;Debug.locals.put("clr", _clr);
 BA.debugLineNum = 143;BA.debugLine="cnvs.ClipPath(basepath)";
Debug.ShouldStop(16384);
_cnvs.ClipPath((android.graphics.Path)(_basepath.getObject()));
 BA.debugLineNum = 144;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(32768);
{
final int step110 = 1;
final int limit110 = (int) (10);
for (_i = (int) (1); (step110 > 0 && _i <= limit110) || (step110 < 0 && _i >= limit110); _i = ((int)(0 + _i + step110))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 145;BA.debugLine="clr = Colors.rgb(resbase(1)+i*difbase(1),resbase";
Debug.ShouldStop(65536);
_clr = __c.Colors.RGB((int) (_resbase[(int) (1)]+_i*_difbase[(int) (1)]),(int) (_resbase[(int) (2)]+_i*_difbase[(int) (2)]),(int) (_resbase[(int) (3)]+_i*_difbase[(int) (3)]));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 146;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.5 -i*ds, clr, False,";
Debug.ShouldStop(131072);
_cnvs.DrawCircle((float) (_cx),(float) (_cy),(float) (_s*0.5-_i*_ds),_clr,__c.False,(float) (2));
 BA.debugLineNum = 147;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.4 +i*ds, clr, False,";
Debug.ShouldStop(262144);
_cnvs.DrawCircle((float) (_cx),(float) (_cy),(float) (_s*0.4+_i*_ds),_clr,__c.False,(float) (2));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _drawposition(int _angle,boolean _userchanged) throws Exception{
try {
		Debug.PushSubsStack("DrawPosition (circleseek) ","circleseek",10,ba,this,128);
int _k = 0;
Debug.locals.put("Angle", _angle);
Debug.locals.put("userchanged", _userchanged);
 BA.debugLineNum = 128;BA.debugLine="Private Sub DrawPosition(Angle As Int, userchanged";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="DrawBase";
Debug.ShouldStop(1);
_drawbase();
 BA.debugLineNum = 130;BA.debugLine="DrawSlider(Angle)";
Debug.ShouldStop(2);
_drawslider((float) (_angle));
 BA.debugLineNum = 131;BA.debugLine="position = Angle * maxv / 270";
Debug.ShouldStop(4);
_position = _angle*_maxv/(double)270;
 BA.debugLineNum = 132;BA.debugLine="Clabel.Text = NumberFormat(position,0,0)";
Debug.ShouldStop(8);
_clabel.setText((Object)(__c.NumberFormat(_position,(int) (0),(int) (0))));
 BA.debugLineNum = 133;BA.debugLine="Cbase.Invalidate";
Debug.ShouldStop(16);
_cbase.Invalidate();
 BA.debugLineNum = 134;BA.debugLine="cnvs.RemoveClip";
Debug.ShouldStop(32);
_cnvs.RemoveClip();
 BA.debugLineNum = 135;BA.debugLine="Dim k As Int = position";
Debug.ShouldStop(64);
_k = (int) (_position);Debug.locals.put("k", _k);Debug.locals.put("k", _k);
 BA.debugLineNum = 136;BA.debugLine="If SubExists(CModule, Event & \"_ValueChanged\") Th";
Debug.ShouldStop(128);
if (__c.SubExists(ba,_cmodule,_event+"_ValueChanged")) { 
 BA.debugLineNum = 137;BA.debugLine="CallSub3(CModule, Event & \"_ValueChanged\",k, u";
Debug.ShouldStop(256);
__c.CallSubNew3(ba,_cmodule,_event+"_ValueChanged",(Object)(_k),(Object)(_userchanged));
 };
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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
public String  _drawslider(float _angle) throws Exception{
try {
		Debug.PushSubsStack("DrawSlider (circleseek) ","circleseek",10,ba,this,151);
int _clr = 0;
float[] _point = null;
int _i = 0;
float[] _p1 = null;
float[] _p2 = null;
float _dk = 0f;
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 151;BA.debugLine="Private Sub DrawSlider(angle As Float)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(8388608);
_clr = 0;Debug.locals.put("clr", _clr);
 BA.debugLineNum = 153;BA.debugLine="slidepath.Initialize(0,S)";
Debug.ShouldStop(16777216);
_slidepath.Initialize((float) (0),(float) (_s));
 BA.debugLineNum = 154;BA.debugLine="If angle > 90 Then slidepath.LineTo(0,0)";
Debug.ShouldStop(33554432);
if (_angle>90) { 
_slidepath.LineTo((float) (0),(float) (0));};
 BA.debugLineNum = 155;BA.debugLine="If angle > 180 Then slidepath.LineTo(S,0)";
Debug.ShouldStop(67108864);
if (_angle>180) { 
_slidepath.LineTo((float) (_s),(float) (0));};
 BA.debugLineNum = 156;BA.debugLine="Dim point(2) As Float = PtoR(angle , 2*cx)";
Debug.ShouldStop(134217728);
_point = _ptor(_angle,(float) (2*_cx));Debug.locals.put("point", _point);Debug.locals.put("point", _point);
 BA.debugLineNum = 157;BA.debugLine="slidepath.LineTo(point(0),point(1))";
Debug.ShouldStop(268435456);
_slidepath.LineTo(_point[(int) (0)],_point[(int) (1)]);
 BA.debugLineNum = 158;BA.debugLine="slidepath.LineTo(cx,cy)";
Debug.ShouldStop(536870912);
_slidepath.LineTo((float) (_cx),(float) (_cy));
 BA.debugLineNum = 159;BA.debugLine="cnvs.ClipPath(slidepath)";
Debug.ShouldStop(1073741824);
_cnvs.ClipPath((android.graphics.Path)(_slidepath.getObject()));
 BA.debugLineNum = 161;BA.debugLine="For i = 1 To 10  ' Draws the slider circle";
Debug.ShouldStop(1);
{
final int step125 = 1;
final int limit125 = (int) (10);
for (_i = (int) (1); (step125 > 0 && _i <= limit125) || (step125 < 0 && _i >= limit125); _i = ((int)(0 + _i + step125))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 162;BA.debugLine="clr = Colors.rgb(resside(1)+i*difside(1),resside";
Debug.ShouldStop(2);
_clr = __c.Colors.RGB((int) (_resside[(int) (1)]+_i*_difside[(int) (1)]),(int) (_resside[(int) (2)]+_i*_difside[(int) (2)]),(int) (_resside[(int) (3)]+_i*_difside[(int) (3)]));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 163;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.5 -i*ds, clr, False,";
Debug.ShouldStop(4);
_cnvs.DrawCircle((float) (_cx),(float) (_cy),(float) (_s*0.5-_i*_ds),_clr,__c.False,(float) (2));
 BA.debugLineNum = 164;BA.debugLine="cnvs.DrawCircle(cx, cy, S*0.4 +i*ds, clr, False,";
Debug.ShouldStop(8);
_cnvs.DrawCircle((float) (_cx),(float) (_cy),(float) (_s*0.4+_i*_ds),_clr,__c.False,(float) (2));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 166;BA.debugLine="cnvs.RemoveClip";
Debug.ShouldStop(32);
_cnvs.RemoveClip();
 BA.debugLineNum = 167;BA.debugLine="Select Cwith";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_cwith,_none,_short_knob,_long_knob)) {
case 0:
 break;
case 1:
 BA.debugLineNum = 172;BA.debugLine="Dim p1(2), p2(2), dk  As Float";
Debug.ShouldStop(2048);
_p1 = new float[(int) (2)];
;Debug.locals.put("p1", _p1);
_p2 = new float[(int) (2)];
;Debug.locals.put("p2", _p2);
_dk = 0f;Debug.locals.put("dk", _dk);
 BA.debugLineNum = 173;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(4096);
{
final int step135 = 1;
final int limit135 = (int) (10);
for (_i = (int) (1); (step135 > 0 && _i <= limit135) || (step135 < 0 && _i >= limit135); _i = ((int)(0 + _i + step135))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 174;BA.debugLine="dk = -7+i*0.7";
Debug.ShouldStop(8192);
_dk = (float) (-7+_i*0.7);Debug.locals.put("dk", _dk);
 BA.debugLineNum = 175;BA.debugLine="p1 = PtoR(angle+dk , S*0.5)";
Debug.ShouldStop(16384);
_p1 = _ptor((float) (_angle+_dk),(float) (_s*0.5));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 176;BA.debugLine="p2 = PtoR(angle+dk , S*0.4)";
Debug.ShouldStop(32768);
_p2 = _ptor((float) (_angle+_dk),(float) (_s*0.4));Debug.locals.put("p2", _p2);
 BA.debugLineNum = 177;BA.debugLine="clr = Colors.RGB(i*25,i*25,i*25) 'from black t";
Debug.ShouldStop(65536);
_clr = __c.Colors.RGB((int) (_i*25),(int) (_i*25),(int) (_i*25));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 178;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),p2(0),p2(1),clr,1)";
Debug.ShouldStop(131072);
_cnvs.DrawLine(_p1[(int) (0)],_p1[(int) (1)],_p2[(int) (0)],_p2[(int) (1)],_clr,(float) (1));
 BA.debugLineNum = 179;BA.debugLine="p1 = PtoR(angle-dk , S*0.5)";
Debug.ShouldStop(262144);
_p1 = _ptor((float) (_angle-_dk),(float) (_s*0.5));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 180;BA.debugLine="p2 = PtoR(angle-dk , S*0.4)";
Debug.ShouldStop(524288);
_p2 = _ptor((float) (_angle-_dk),(float) (_s*0.4));Debug.locals.put("p2", _p2);
 BA.debugLineNum = 181;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),p2(0),p2(1),clr,1)";
Debug.ShouldStop(1048576);
_cnvs.DrawLine(_p1[(int) (0)],_p1[(int) (1)],_p2[(int) (0)],_p2[(int) (1)],_clr,(float) (1));
 }
}Debug.locals.put("i", _i);
;
 break;
case 2:
 BA.debugLineNum = 185;BA.debugLine="Dim p1(2), dk  As Float";
Debug.ShouldStop(16777216);
_p1 = new float[(int) (2)];
;Debug.locals.put("p1", _p1);
_dk = 0f;Debug.locals.put("dk", _dk);
 BA.debugLineNum = 186;BA.debugLine="cnvs.ClipPath(basepath)";
Debug.ShouldStop(33554432);
_cnvs.ClipPath((android.graphics.Path)(_basepath.getObject()));
 BA.debugLineNum = 187;BA.debugLine="clr = cnvs.Bitmap.GetPixel(1dip,1dip)";
Debug.ShouldStop(67108864);
_clr = _cnvs.getBitmap().GetPixel(__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 188;BA.debugLine="cnvs.DrawCircle(cx,cy,S*0.4,clr,True,1) ' erase";
Debug.ShouldStop(134217728);
_cnvs.DrawCircle((float) (_cx),(float) (_cy),(float) (_s*0.4),_clr,__c.True,(float) (1));
 BA.debugLineNum = 189;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(268435456);
{
final int step150 = 1;
final int limit150 = (int) (10);
for (_i = (int) (1); (step150 > 0 && _i <= limit150) || (step150 < 0 && _i >= limit150); _i = ((int)(0 + _i + step150))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 190;BA.debugLine="dk = -7+i*0.7";
Debug.ShouldStop(536870912);
_dk = (float) (-7+_i*0.7);Debug.locals.put("dk", _dk);
 BA.debugLineNum = 191;BA.debugLine="p1 = PtoR(angle+dk , S*0.5)";
Debug.ShouldStop(1073741824);
_p1 = _ptor((float) (_angle+_dk),(float) (_s*0.5));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 192;BA.debugLine="clr = Colors.RGB(i*25,i*25,i*25) 'from black t";
Debug.ShouldStop(-2147483648);
_clr = __c.Colors.RGB((int) (_i*25),(int) (_i*25),(int) (_i*25));Debug.locals.put("clr", _clr);
 BA.debugLineNum = 193;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),cx,cy,clr,1)";
Debug.ShouldStop(1);
_cnvs.DrawLine(_p1[(int) (0)],_p1[(int) (1)],(float) (_cx),(float) (_cy),_clr,(float) (1));
 BA.debugLineNum = 194;BA.debugLine="p1 = PtoR(angle-dk , S*0.5)";
Debug.ShouldStop(2);
_p1 = _ptor((float) (_angle-_dk),(float) (_s*0.5));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 195;BA.debugLine="cnvs.DrawLine(p1(0),p1(1),cx,cy,clr,1)";
Debug.ShouldStop(4);
_cnvs.DrawLine(_p1[(int) (0)],_p1[(int) (1)],(float) (_cx),(float) (_cy),_clr,(float) (1));
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
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public double  _getvalue() throws Exception{
try {
		Debug.PushSubsStack("getValue (circleseek) ","circleseek",10,ba,this,124);
 BA.debugLineNum = 124;BA.debugLine="Sub getValue As Double";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Return position";
Debug.ShouldStop(268435456);
if (true) return _position;
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Initialize (circleseek) ","circleseek",10,ba,this,27);
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("Eventname", _eventname);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize(Module As Object, Eventname";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="CModule = Module";
Debug.ShouldStop(134217728);
_cmodule = _module;
 BA.debugLineNum = 29;BA.debugLine="Event = Eventname";
Debug.ShouldStop(268435456);
_event = _eventname;
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int[]  _parsecolor(int _clr) throws Exception{
try {
		Debug.PushSubsStack("ParseColor (circleseek) ","circleseek",10,ba,this,223);
int[] _res = null;
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 223;BA.debugLine="Private Sub ParseColor(clr As Int) As Int()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="Dim res(4) As Int";
Debug.ShouldStop(-2147483648);
_res = new int[(int) (4)];
;Debug.locals.put("res", _res);
 BA.debugLineNum = 225;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff";
Debug.ShouldStop(1);
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_clr,(int) (0xff000000)),(int) (24));Debug.locals.put("res", _res);
 BA.debugLineNum = 226;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff";
Debug.ShouldStop(2);
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_clr,(int) (0xff0000)),(int) (16));Debug.locals.put("res", _res);
 BA.debugLineNum = 227;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.AND(clr, 0xff";
Debug.ShouldStop(4);
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_clr,(int) (0xff00)),(int) (8));Debug.locals.put("res", _res);
 BA.debugLineNum = 228;BA.debugLine="res(3) = Bit.AND(clr, 0xff)  ' B";
Debug.ShouldStop(8);
_res[(int) (3)] = __c.Bit.And(_clr,(int) (0xff));Debug.locals.put("res", _res);
 BA.debugLineNum = 229;BA.debugLine="Return res";
Debug.ShouldStop(16);
if (true) return _res;
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public float[]  _ptor(float _alfa,float _rad) throws Exception{
try {
		Debug.PushSubsStack("PtoR (circleseek) ","circleseek",10,ba,this,203);
float[] _point = null;
Debug.locals.put("alfa", _alfa);
Debug.locals.put("Rad", _rad);
 BA.debugLineNum = 203;BA.debugLine="Private Sub PtoR(alfa As Float, Rad As Float) As F";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Dim point(2) As Float";
Debug.ShouldStop(2048);
_point = new float[(int) (2)];
;Debug.locals.put("point", _point);
 BA.debugLineNum = 205;BA.debugLine="point(0) = cx + Rad * SinD(alfa - 135)";
Debug.ShouldStop(4096);
_point[(int) (0)] = (float) (_cx+_rad*__c.SinD(_alfa-135));Debug.locals.put("point", _point);
 BA.debugLineNum = 206;BA.debugLine="point(1) = cy - Rad * CosD(alfa - 135)";
Debug.ShouldStop(8192);
_point[(int) (1)] = (float) (_cy-_rad*__c.CosD(_alfa-135));Debug.locals.put("point", _point);
 BA.debugLineNum = 207;BA.debugLine="Return point";
Debug.ShouldStop(16384);
if (true) return _point;
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public float  _rtoangle(float _x,float _y) throws Exception{
try {
		Debug.PushSubsStack("RtoAngle (circleseek) ","circleseek",10,ba,this,211);
float _teta = 0f;
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 211;BA.debugLine="Private Sub RtoAngle(X As Float, Y As Float) As Fl";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="Dim teta As Float";
Debug.ShouldStop(524288);
_teta = 0f;Debug.locals.put("teta", _teta);
 BA.debugLineNum = 213;BA.debugLine="If Y <> 0 Then";
Debug.ShouldStop(1048576);
if (_y!=0) { 
 BA.debugLineNum = 214;BA.debugLine="teta = ATan2D((X-cx),(cy-Y)) + 135";
Debug.ShouldStop(2097152);
_teta = (float) (__c.ATan2D((_x-_cx),(_cy-_y))+135);Debug.locals.put("teta", _teta);
 }else {
 BA.debugLineNum = 216;BA.debugLine="If (X-cx) > 0 Then teta = 235 Else teta = 45";
Debug.ShouldStop(8388608);
if ((_x-_cx)>0) { 
_teta = (float) (235);Debug.locals.put("teta", _teta);}
else {
_teta = (float) (45);Debug.locals.put("teta", _teta);};
 };
 BA.debugLineNum = 218;BA.debugLine="Return teta";
Debug.ShouldStop(33554432);
if (true) return _teta;
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return 0f;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setcolors(int _base_color,int _slider_color_side,int _slider_color_cnt,int _text_color,int _text_size) throws Exception{
try {
		Debug.PushSubsStack("setColors (circleseek) ","circleseek",10,ba,this,59);
Debug.locals.put("base_color", _base_color);
Debug.locals.put("slider_color_side", _slider_color_side);
Debug.locals.put("slider_color_cnt", _slider_color_cnt);
Debug.locals.put("Text_color", _text_color);
Debug.locals.put("Text_size", _text_size);
 BA.debugLineNum = 59;BA.debugLine="Public Sub setColors(base_color As Int,slider_colo";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="basecolor = base_color";
Debug.ShouldStop(134217728);
_basecolor = _base_color;
 BA.debugLineNum = 61;BA.debugLine="sliderside = slider_color_side";
Debug.ShouldStop(268435456);
_sliderside = _slider_color_side;
 BA.debugLineNum = 62;BA.debugLine="slidercnt = slider_color_cnt";
Debug.ShouldStop(536870912);
_slidercnt = _slider_color_cnt;
 BA.debugLineNum = 63;BA.debugLine="Textcolor = Text_color";
Debug.ShouldStop(1073741824);
_textcolor = _text_color;
 BA.debugLineNum = 64;BA.debugLine="Textsize = Text_size";
Debug.ShouldStop(-2147483648);
_textsize = _text_size;
 BA.debugLineNum = 66;BA.debugLine="resbase = ParseColor(basecolor)";
Debug.ShouldStop(2);
_resbase = _parsecolor(_basecolor);
 BA.debugLineNum = 68;BA.debugLine="difbase(1) = (255-resbase(1))/10";
Debug.ShouldStop(8);
_difbase[(int) (1)] = (float) ((255-_resbase[(int) (1)])/(double)10);
 BA.debugLineNum = 69;BA.debugLine="difbase(2) = (255-resbase(2))/10";
Debug.ShouldStop(16);
_difbase[(int) (2)] = (float) ((255-_resbase[(int) (2)])/(double)10);
 BA.debugLineNum = 70;BA.debugLine="difbase(3) = (255-resbase(3))/10";
Debug.ShouldStop(32);
_difbase[(int) (3)] = (float) ((255-_resbase[(int) (3)])/(double)10);
 BA.debugLineNum = 72;BA.debugLine="rescnt = ParseColor(slidercnt)";
Debug.ShouldStop(128);
_rescnt = _parsecolor(_slidercnt);
 BA.debugLineNum = 73;BA.debugLine="resside = ParseColor(sliderside)";
Debug.ShouldStop(256);
_resside = _parsecolor(_sliderside);
 BA.debugLineNum = 75;BA.debugLine="difside(1) = (rescnt(1)-resside(1))/10";
Debug.ShouldStop(1024);
_difside[(int) (1)] = (float) ((_rescnt[(int) (1)]-_resside[(int) (1)])/(double)10);
 BA.debugLineNum = 76;BA.debugLine="difside(2) = (rescnt(2)-resside(2))/10";
Debug.ShouldStop(2048);
_difside[(int) (2)] = (float) ((_rescnt[(int) (2)]-_resside[(int) (2)])/(double)10);
 BA.debugLineNum = 77;BA.debugLine="difside(3) = (rescnt(3)-resside(3))/10";
Debug.ShouldStop(4096);
_difside[(int) (3)] = (float) ((_rescnt[(int) (3)]-_resside[(int) (3)])/(double)10);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setvalue(double _value) throws Exception{
try {
		Debug.PushSubsStack("setValue (circleseek) ","circleseek",10,ba,this,94);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 94;BA.debugLine="Public Sub setValue(Value As Double)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="If first Then ' only after the new size of the vi";
Debug.ShouldStop(1073741824);
if (_first) { 
 BA.debugLineNum = 96;BA.debugLine="cnvs.Initialize(Cbase)";
Debug.ShouldStop(-2147483648);
_cnvs.Initialize((android.view.View)(_cbase.getObject()));
 BA.debugLineNum = 97;BA.debugLine="R.Target = cnvs";
Debug.ShouldStop(1);
_r.Target = (Object)(_cnvs);
 BA.debugLineNum = 98;BA.debugLine="R.Target = R.GetField(\"paint\")";
Debug.ShouldStop(2);
_r.Target = _r.GetField("paint");
 BA.debugLineNum = 99;BA.debugLine="R.RunMethod2(\"setAntiAlias\", True, \"java.lang.bo";
Debug.ShouldStop(4);
_r.RunMethod2("setAntiAlias",BA.ObjectToString(__c.True),"java.lang.boolean");
 BA.debugLineNum = 100;BA.debugLine="S = Min(Cbase.Width, Cbase.Height)";
Debug.ShouldStop(8);
_s = (int) (__c.Min(_cbase.getWidth(),_cbase.getHeight()));
 BA.debugLineNum = 101;BA.debugLine="ds = 0.005 * S";
Debug.ShouldStop(16);
_ds = (float) (0.005*_s);
 BA.debugLineNum = 102;BA.debugLine="cx = S/2";
Debug.ShouldStop(32);
_cx = (int) (_s/(double)2);
 BA.debugLineNum = 103;BA.debugLine="cy = S/2";
Debug.ShouldStop(64);
_cy = (int) (_s/(double)2);
 BA.debugLineNum = 104;BA.debugLine="basepath.Initialize(0,S)";
Debug.ShouldStop(128);
_basepath.Initialize((float) (0),(float) (_s));
 BA.debugLineNum = 105;BA.debugLine="basepath.LineTo(0,0)";
Debug.ShouldStop(256);
_basepath.LineTo((float) (0),(float) (0));
 BA.debugLineNum = 106;BA.debugLine="basepath.LineTo(S,0)";
Debug.ShouldStop(512);
_basepath.LineTo((float) (_s),(float) (0));
 BA.debugLineNum = 107;BA.debugLine="basepath.LineTo(S,S)";
Debug.ShouldStop(1024);
_basepath.LineTo((float) (_s),(float) (_s));
 BA.debugLineNum = 108;BA.debugLine="basepath.LineTo(cx,cy)";
Debug.ShouldStop(2048);
_basepath.LineTo((float) (_cx),(float) (_cy));
 BA.debugLineNum = 109;BA.debugLine="basepath.LineTo(0,S)";
Debug.ShouldStop(4096);
_basepath.LineTo((float) (0),(float) (_s));
 BA.debugLineNum = 111;BA.debugLine="Clabel.Initialize(\"\")";
Debug.ShouldStop(16384);
_clabel.Initialize(ba,"");
 BA.debugLineNum = 112;BA.debugLine="Clabel.Color = Colors.Transparent";
Debug.ShouldStop(32768);
_clabel.setColor(__c.Colors.Transparent);
 BA.debugLineNum = 113;BA.debugLine="Clabel.Textcolor = Textcolor";
Debug.ShouldStop(65536);
_clabel.setTextColor(_textcolor);
 BA.debugLineNum = 114;BA.debugLine="Clabel.Textsize = Textsize";
Debug.ShouldStop(131072);
_clabel.setTextSize((float) (_textsize));
 BA.debugLineNum = 115;BA.debugLine="Clabel.Gravity = Gravity.CENTER";
Debug.ShouldStop(262144);
_clabel.setGravity(__c.Gravity.CENTER);
 BA.debugLineNum = 116;BA.debugLine="Cbase.AddView(Clabel,cx-S/4,cy,S/2,S/2)";
Debug.ShouldStop(524288);
_cbase.AddView((android.view.View)(_clabel.getObject()),(int) (_cx-_s/(double)4),_cy,(int) (_s/(double)2),(int) (_s/(double)2));
 BA.debugLineNum = 117;BA.debugLine="first = False";
Debug.ShouldStop(1048576);
_first = __c.False;
 };
 BA.debugLineNum = 119;BA.debugLine="position = Value";
Debug.ShouldStop(4194304);
_position = _value;
 BA.debugLineNum = 120;BA.debugLine="DrawPosition(Round(Value * 270 / maxv),False)";
Debug.ShouldStop(8388608);
_drawposition((int) (__c.Round(_value*270/(double)_maxv)),__c.False);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
