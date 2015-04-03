package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class size {
private static size mostCurrent = new size();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static int _large = 0;
public static int _small = 0;
public static float _sx = 0f;
public static float _sy = 0f;
public static float _cf = 0f;
public b4a.example.main _main = null;
public b4a.example.sensortable _sensortable = null;
public b4a.example.config _config = null;
public b4a.example.cancellato _cancellato = null;
public b4a.example.configpagemod _configpagemod = null;
public b4a.example.configurationwizardmod _configurationwizardmod = null;
public b4a.example.policiesmode _policiesmode = null;
  public Object[] GetGlobals() {
		return new Object[] {"cancellato",Debug.moduleToString(b4a.example.cancellato.class),"Cf",_cf,"config",Debug.moduleToString(b4a.example.config.class),"ConfigPageMod",Debug.moduleToString(b4a.example.configpagemod.class),"ConfigurationWizardMod",Debug.moduleToString(b4a.example.configurationwizardmod.class),"Large",_large,"Main",Debug.moduleToString(b4a.example.main.class),"PoliciesMode",Debug.moduleToString(b4a.example.policiesmode.class),"SensorTable",Debug.moduleToString(b4a.example.sensortable.class),"Small",_small,"sx",_sx,"sy",_sy};
}
public static String  _modify(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
try {
		Debug.PushSubsStack("Modify (size) ","size",4,_ba,mostCurrent,37);
;
Debug.locals.put("v", _v);
 BA.debugLineNum = 37;BA.debugLine="Private Sub Modify(v As View)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="v.SetLayout( v.left * sx , v.top * sy, v.width * s";
Debug.ShouldStop(32);
_v.SetLayout((int) (_v.getLeft()*_sx),(int) (_v.getTop()*_sy),(int) (_v.getWidth()*_sx),(int) (_v.getHeight()*_sy));
 BA.debugLineNum = 39;BA.debugLine="If v Is Button OR _  	v Is CheckBox OR _ 	 v Is Ed";
Debug.ShouldStop(64);
if (_v.getObjectOrNull() instanceof android.widget.Button || _v.getObjectOrNull() instanceof android.widget.CheckBox || _v.getObjectOrNull() instanceof android.widget.EditText || _v.getObjectOrNull() instanceof android.widget.TextView || _v.getObjectOrNull() instanceof android.widget.RadioButton || _v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner || _v.getObjectOrNull() instanceof android.widget.ToggleButton) { 
 BA.debugLineNum = 46;BA.debugLine="SetFont(v)";
Debug.ShouldStop(8192);
_setfont(_ba,_v);
 }else {
 BA.debugLineNum = 48;BA.debugLine="If v Is Panel Then SetPanel(v)";
Debug.ShouldStop(32768);
if (_v.getObjectOrNull() instanceof android.view.ViewGroup) { 
_setpanel(_ba,_v);};
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private	Large, Small As Int";
_large = 0;
_small = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private sx, sy  As Float";
_sx = 0f;
_sy = 0f;
 //BA.debugLineNum = 7;BA.debugLine="Public  Cf  As Float";
_cf = 0f;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
try {
		Debug.PushSubsStack("SetFont (size) ","size",4,_ba,mostCurrent,62);
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.EditTextWrapper _e = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _r = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _c = null;
anywheresoftware.b4a.objects.SpinnerWrapper _s = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _t = null;
;
Debug.locals.put("V", _v);
 BA.debugLineNum = 62;BA.debugLine="Private Sub SetFont(V As View)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Select GetType(V)";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.GetType((Object)(_v.getObject())),"android.widget.Button","android.widget.EditText","android.widget.TextView","android.widget.RadioButton","android.widget.CheckBox","anywheresoftware.b4a.objects.SpinnerWrapper$B4ASpinner","android.widget.ToggleButton")) {
case 0:
 BA.debugLineNum = 65;BA.debugLine="Dim B As Button";
Debug.ShouldStop(1);
_b = new anywheresoftware.b4a.objects.ButtonWrapper();Debug.locals.put("B", _b);
 BA.debugLineNum = 66;BA.debugLine="B = V";
Debug.ShouldStop(2);
_b.setObject((android.widget.Button)(_v.getObject()));
 BA.debugLineNum = 67;BA.debugLine="B.TextSize = B.TextSize * Cf";
Debug.ShouldStop(4);
_b.setTextSize((float) (_b.getTextSize()*_cf));
 break;
case 1:
 BA.debugLineNum = 69;BA.debugLine="Dim E As EditText";
Debug.ShouldStop(16);
_e = new anywheresoftware.b4a.objects.EditTextWrapper();Debug.locals.put("E", _e);
 BA.debugLineNum = 70;BA.debugLine="E = V";
Debug.ShouldStop(32);
_e.setObject((android.widget.EditText)(_v.getObject()));
 BA.debugLineNum = 71;BA.debugLine="E.TextSize = E.TextSize * Cf";
Debug.ShouldStop(64);
_e.setTextSize((float) (_e.getTextSize()*_cf));
 break;
case 2:
 BA.debugLineNum = 73;BA.debugLine="Dim L As Label";
Debug.ShouldStop(256);
_l = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("L", _l);
 BA.debugLineNum = 74;BA.debugLine="L = V";
Debug.ShouldStop(512);
_l.setObject((android.widget.TextView)(_v.getObject()));
 BA.debugLineNum = 75;BA.debugLine="L.TextSize = L.TextSize * Cf";
Debug.ShouldStop(1024);
_l.setTextSize((float) (_l.getTextSize()*_cf));
 break;
case 3:
 BA.debugLineNum = 77;BA.debugLine="Dim R As RadioButton";
Debug.ShouldStop(4096);
_r = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();Debug.locals.put("R", _r);
 BA.debugLineNum = 78;BA.debugLine="R = V";
Debug.ShouldStop(8192);
_r.setObject((android.widget.RadioButton)(_v.getObject()));
 BA.debugLineNum = 79;BA.debugLine="R.TextSize = R.TextSize * Cf";
Debug.ShouldStop(16384);
_r.setTextSize((float) (_r.getTextSize()*_cf));
 break;
case 4:
 BA.debugLineNum = 81;BA.debugLine="Dim C As CheckBox";
Debug.ShouldStop(65536);
_c = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();Debug.locals.put("C", _c);
 BA.debugLineNum = 82;BA.debugLine="C = V";
Debug.ShouldStop(131072);
_c.setObject((android.widget.CheckBox)(_v.getObject()));
 BA.debugLineNum = 83;BA.debugLine="C.TextSize = C.TextSize * Cf";
Debug.ShouldStop(262144);
_c.setTextSize((float) (_c.getTextSize()*_cf));
 break;
case 5:
 BA.debugLineNum = 85;BA.debugLine="Dim S As Spinner";
Debug.ShouldStop(1048576);
_s = new anywheresoftware.b4a.objects.SpinnerWrapper();Debug.locals.put("S", _s);
 BA.debugLineNum = 86;BA.debugLine="S = V";
Debug.ShouldStop(2097152);
_s.setObject((anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
 BA.debugLineNum = 87;BA.debugLine="S.TextSize = S.TextSize * Cf";
Debug.ShouldStop(4194304);
_s.setTextSize((float) (_s.getTextSize()*_cf));
 break;
case 6:
 BA.debugLineNum = 89;BA.debugLine="Dim T As ToggleButton";
Debug.ShouldStop(16777216);
_t = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();Debug.locals.put("T", _t);
 BA.debugLineNum = 90;BA.debugLine="T = V";
Debug.ShouldStop(33554432);
_t.setObject((android.widget.ToggleButton)(_v.getObject()));
 BA.debugLineNum = 91;BA.debugLine="T.TextSize = T.TextSize * Cf";
Debug.ShouldStop(67108864);
_t.setTextSize((float) (_t.getTextSize()*_cf));
 break;
}
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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
public static String  _setpanel(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _vp) throws Exception{
try {
		Debug.PushSubsStack("SetPanel (size) ","size",4,_ba,mostCurrent,52);
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _i = 0;
;
Debug.locals.put("Vp", _vp);
 BA.debugLineNum = 52;BA.debugLine="Private Sub SetPanel(Vp As View)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Dim P As Panel";
Debug.ShouldStop(1048576);
_p = new anywheresoftware.b4a.objects.PanelWrapper();Debug.locals.put("P", _p);
 BA.debugLineNum = 54;BA.debugLine="Dim v As View";
Debug.ShouldStop(2097152);
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();Debug.locals.put("v", _v);
 BA.debugLineNum = 55;BA.debugLine="P = Vp";
Debug.ShouldStop(4194304);
_p.setObject((android.view.ViewGroup)(_vp.getObject()));
 BA.debugLineNum = 56;BA.debugLine="For i = 0 To P.NumberOfViews -1";
Debug.ShouldStop(8388608);
{
final int step37 = 1;
final int limit37 = (int) (_p.getNumberOfViews()-1);
for (_i = (int) (0); (step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37); _i = ((int)(0 + _i + step37))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="v = P.GetView(i)";
Debug.ShouldStop(16777216);
_v = _p.GetView(_i);Debug.locals.put("v", _v);
 BA.debugLineNum = 58;BA.debugLine="Modify(v)";
Debug.ShouldStop(33554432);
_modify(_ba,_v);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static String  _setsize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _act,int _designlargeaxis,int _designsmallaxis) throws Exception{
try {
		Debug.PushSubsStack("SetSize (size) ","size",4,_ba,mostCurrent,11);
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
float _desdiag2 = 0f;
float _realdiag2 = 0f;
int _i = 0;
;
Debug.locals.put("Act", _act);
Debug.locals.put("DesignLargeAxis", _designlargeaxis);
Debug.locals.put("DesignSmallAxis", _designsmallaxis);
 BA.debugLineNum = 11;BA.debugLine="Public Sub SetSize(Act As activity, DesignLargeAxi";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Dim v As View";
Debug.ShouldStop(2048);
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();Debug.locals.put("v", _v);
 BA.debugLineNum = 13;BA.debugLine="Dim DesDiag2, RealDiag2 As Float";
Debug.ShouldStop(4096);
_desdiag2 = 0f;Debug.locals.put("DesDiag2", _desdiag2);
_realdiag2 = 0f;Debug.locals.put("RealDiag2", _realdiag2);
 BA.debugLineNum = 14;BA.debugLine="Large = DesignLargeAxis * Density";
Debug.ShouldStop(8192);
_large = (int) (_designlargeaxis*anywheresoftware.b4a.keywords.Common.Density);
 BA.debugLineNum = 15;BA.debugLine="Small = DesignSmallAxis * Density";
Debug.ShouldStop(16384);
_small = (int) (_designsmallaxis*anywheresoftware.b4a.keywords.Common.Density);
 BA.debugLineNum = 17;BA.debugLine="If 100%x > 100%y Then";
Debug.ShouldStop(65536);
if (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba)>anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)) { 
 BA.debugLineNum = 18;BA.debugLine="sx = 100%x /Large";
Debug.ShouldStop(131072);
_sx = (float) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba)/(double)_large);
 BA.debugLineNum = 19;BA.debugLine="sy = 100%y/Small";
Debug.ShouldStop(262144);
_sy = (float) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)/(double)_small);
 }else {
 BA.debugLineNum = 22;BA.debugLine="sx = 100%x/Small";
Debug.ShouldStop(2097152);
_sx = (float) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba)/(double)_small);
 BA.debugLineNum = 23;BA.debugLine="sy = 100%y/Large";
Debug.ShouldStop(4194304);
_sy = (float) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)/(double)_large);
 };
 BA.debugLineNum = 27;BA.debugLine="DesDiag2 = Large*Large + Small*Small";
Debug.ShouldStop(67108864);
_desdiag2 = (float) (_large*_large+_small*_small);Debug.locals.put("DesDiag2", _desdiag2);
 BA.debugLineNum = 28;BA.debugLine="RealDiag2 = 100%y * 100%y + 100%x * 100%x";
Debug.ShouldStop(134217728);
_realdiag2 = (float) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)*anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba)*anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba));Debug.locals.put("RealDiag2", _realdiag2);
 BA.debugLineNum = 29;BA.debugLine="Cf =  Sqrt(RealDiag2/DesDiag2)' / Density   ' font";
Debug.ShouldStop(268435456);
_cf = (float) (anywheresoftware.b4a.keywords.Common.Sqrt(_realdiag2/(double)_desdiag2));
 BA.debugLineNum = 31;BA.debugLine="For i = 0 To Act.NumberOfViews -1";
Debug.ShouldStop(1073741824);
{
final int step20 = 1;
final int limit20 = (int) (_act.getNumberOfViews()-1);
for (_i = (int) (0); (step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20); _i = ((int)(0 + _i + step20))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 32;BA.debugLine="v = Act.GetView(i)";
Debug.ShouldStop(-2147483648);
_v = _act.GetView(_i);Debug.locals.put("v", _v);
 BA.debugLineNum = 33;BA.debugLine="Modify(v)";
Debug.ShouldStop(1);
_modify(_ba,_v);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}
