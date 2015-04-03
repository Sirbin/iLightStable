package derez.libs;

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
public derez.libs.main _main = null;
public static String  _modify(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
RDebugUtils.currentModule="size";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub Modify(v As View)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="v.SetLayout( v.left * sx , v.top * sy, v.width * sx ,  v.height * sy )";
_v.SetLayout((int) (_v.getLeft()*_sx),(int) (_v.getTop()*_sy),(int) (_v.getWidth()*_sx),(int) (_v.getHeight()*_sy));
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If v Is Button OR _  	v Is CheckBox OR _ 	 v Is EditText OR _ 	  v Is Label OR _  	   v Is RadioButton OR _  	    v Is Spinner OR _  	     v Is ToggleButton Then";
if (_v.getObjectOrNull() instanceof android.widget.Button || _v.getObjectOrNull() instanceof android.widget.CheckBox || _v.getObjectOrNull() instanceof android.widget.EditText || _v.getObjectOrNull() instanceof android.widget.TextView || _v.getObjectOrNull() instanceof android.widget.RadioButton || _v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner || _v.getObjectOrNull() instanceof android.widget.ToggleButton) { 
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="SetFont(v)";
_setfont(_ba,_v);
 }else {
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="If v Is Panel Then SetPanel(v)";
if (_v.getObjectOrNull() instanceof android.view.ViewGroup) { 
_setpanel(_ba,_v);};
 };
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
RDebugUtils.currentModule="size";
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.EditTextWrapper _e = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _r = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _c = null;
anywheresoftware.b4a.objects.SpinnerWrapper _s = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _t = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub SetFont(V As View)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Select GetType(V)";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.GetType((Object)(_v.getObject())),"android.widget.Button","android.widget.EditText","android.widget.TextView","android.widget.RadioButton","android.widget.CheckBox","anywheresoftware.b4a.objects.SpinnerWrapper$B4ASpinner","android.widget.ToggleButton")) {
case 0:
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim B As Button";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="B = V";
_b.setObject((android.widget.Button)(_v.getObject()));
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="B.TextSize = B.TextSize * Cf";
_b.setTextSize((float) (_b.getTextSize()*_cf));
 break;
case 1:
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="Dim E As EditText";
_e = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="E = V";
_e.setObject((android.widget.EditText)(_v.getObject()));
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="E.TextSize = E.TextSize * Cf";
_e.setTextSize((float) (_e.getTextSize()*_cf));
 break;
case 2:
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="L = V";
_l.setObject((android.widget.TextView)(_v.getObject()));
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="L.TextSize = L.TextSize * Cf";
_l.setTextSize((float) (_l.getTextSize()*_cf));
 break;
case 3:
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="Dim R As RadioButton";
_r = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="R = V";
_r.setObject((android.widget.RadioButton)(_v.getObject()));
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="R.TextSize = R.TextSize * Cf";
_r.setTextSize((float) (_r.getTextSize()*_cf));
 break;
case 4:
RDebugUtils.currentLine=1703955;
 //BA.debugLineNum = 1703955;BA.debugLine="Dim C As CheckBox";
_c = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="C = V";
_c.setObject((android.widget.CheckBox)(_v.getObject()));
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="C.TextSize = C.TextSize * Cf";
_c.setTextSize((float) (_c.getTextSize()*_cf));
 break;
case 5:
RDebugUtils.currentLine=1703959;
 //BA.debugLineNum = 1703959;BA.debugLine="Dim S As Spinner";
_s = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=1703960;
 //BA.debugLineNum = 1703960;BA.debugLine="S = V";
_s.setObject((anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
RDebugUtils.currentLine=1703961;
 //BA.debugLineNum = 1703961;BA.debugLine="S.TextSize = S.TextSize * Cf";
_s.setTextSize((float) (_s.getTextSize()*_cf));
 break;
case 6:
RDebugUtils.currentLine=1703963;
 //BA.debugLineNum = 1703963;BA.debugLine="Dim T As ToggleButton";
_t = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
RDebugUtils.currentLine=1703964;
 //BA.debugLineNum = 1703964;BA.debugLine="T = V";
_t.setObject((android.widget.ToggleButton)(_v.getObject()));
RDebugUtils.currentLine=1703965;
 //BA.debugLineNum = 1703965;BA.debugLine="T.TextSize = T.TextSize * Cf";
_t.setTextSize((float) (_t.getTextSize()*_cf));
 break;
}
;
RDebugUtils.currentLine=1703967;
 //BA.debugLineNum = 1703967;BA.debugLine="End Sub";
return "";
}
public static String  _setpanel(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _vp) throws Exception{
RDebugUtils.currentModule="size";
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _i = 0;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub SetPanel(Vp As View)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim P As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="P = Vp";
_p.setObject((android.view.ViewGroup)(_vp.getObject()));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="For i = 0 To P.NumberOfViews -1";
{
final int step37 = 1;
final int limit37 = (int) (_p.getNumberOfViews()-1);
for (_i = (int) (0); (step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37); _i = ((int)(0 + _i + step37))) {
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="v = P.GetView(i)";
_v = _p.GetView(_i);
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Modify(v)";
_modify(_ba,_v);
 }
};
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="End Sub";
return "";
}
public static String  _setsize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _act,int _designlargeaxis,int _designsmallaxis) throws Exception{
RDebugUtils.currentModule="size";
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
float _desdiag2 = 0f;
float _realdiag2 = 0f;
int _i = 0;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub SetSize(Act As activity, DesignLargeAxis As Int, DesignSmallAxis As Int)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim DesDiag2, RealDiag2 As Float";
_desdiag2 = 0f;
_realdiag2 = 0f;
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Large = DesignLargeAxis * Density";
_large = (int) (_designlargeaxis*anywheresoftware.b4a.keywords.Common.Density);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Small = DesignSmallAxis * Density";
_small = (int) (_designsmallaxis*anywheresoftware.b4a.keywords.Common.Density);
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="If 100%x > 100%y Then";
if (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba)>anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)) { 
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="sx = 100%x /Large";
_sx = (float) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba)/(double)_large);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="sy = 100%y/Small";
_sy = (float) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)/(double)_small);
 }else {
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="sx = 100%x/Small";
_sx = (float) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba)/(double)_small);
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="sy = 100%y/Large";
_sy = (float) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)/(double)_large);
 };
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="DesDiag2 = Large*Large + Small*Small";
_desdiag2 = (float) (_large*_large+_small*_small);
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="RealDiag2 = 100%y * 100%y + 100%x * 100%x";
_realdiag2 = (float) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)*anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),_ba)+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba)*anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),_ba));
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="Cf =  Sqrt(RealDiag2/DesDiag2)' / Density   ' font size factor";
_cf = (float) (anywheresoftware.b4a.keywords.Common.Sqrt(_realdiag2/(double)_desdiag2));
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="For i = 0 To Act.NumberOfViews -1";
{
final int step20 = 1;
final int limit20 = (int) (_act.getNumberOfViews()-1);
for (_i = (int) (0); (step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20); _i = ((int)(0 + _i + step20))) {
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="v = Act.GetView(i)";
_v = _act.GetView(_i);
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="Modify(v)";
_modify(_ba,_v);
 }
};
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="End Sub";
return "";
}
}