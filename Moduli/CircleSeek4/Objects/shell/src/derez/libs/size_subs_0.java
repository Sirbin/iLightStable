package derez.libs;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class size_subs_0 {


public static RemoteObject  _modify(RemoteObject _ba,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("Modify (size) ","size",2,_ba,size.mostCurrent,37);
if (RapidSub.canDelegate("modify")) return size.remoteMe.runUserSub(false, "size","modify", _ba, _v);
;
Debug.locals.put("v", _v);
 BA.debugLineNum = 37;BA.debugLine="Private Sub Modify(v As View)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="v.SetLayout( v.left * sx , v.top * sy, v.width * sx ,  v.height * sy )";
Debug.ShouldStop(32);
_v.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"getLeft"),size._sx}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"getTop"),size._sy}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"getWidth"),size._sx}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"getHeight"),size._sy}, "*",0, 0))));
 BA.debugLineNum = 39;BA.debugLine="If v Is Button OR _  	v Is CheckBox OR _ 	 v Is EditText OR _ 	  v Is Label OR _  	   v Is RadioButton OR _  	    v Is Spinner OR _  	     v Is ToggleButton Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.Button")) || RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.CheckBox")) || RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.EditText")) || RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.TextView")) || RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.RadioButton")) || RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner")) || RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.ToggleButton"))) { 
 BA.debugLineNum = 46;BA.debugLine="SetFont(v)";
Debug.ShouldStop(8192);
_setfont(_ba,_v);
 }else {
 BA.debugLineNum = 48;BA.debugLine="If v Is Panel Then SetPanel(v)";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.view.ViewGroup"))) { 
_setpanel(_ba,_v);};
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private	Large, Small As Int";
size._large = RemoteObject.createImmutable(0);
size._small = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 6;BA.debugLine="Private sx, sy  As Float";
size._sx = RemoteObject.createImmutable(0f);
size._sy = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 7;BA.debugLine="Public  Cf  As Float";
size._cf = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setfont(RemoteObject _ba,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetFont (size) ","size",2,_ba,size.mostCurrent,62);
if (RapidSub.canDelegate("setfont")) return size.remoteMe.runUserSub(false, "size","setfont", _ba, _v);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _e = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");
;
Debug.locals.put("V", _v);
 BA.debugLineNum = 62;BA.debugLine="Private Sub SetFont(V As View)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Select GetType(V)";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(size.mostCurrent.__c.runMethod(true,"GetType",(Object)((_v.getObject()))),BA.ObjectToString("android.widget.Button"),BA.ObjectToString("android.widget.EditText"),BA.ObjectToString("android.widget.TextView"),BA.ObjectToString("android.widget.RadioButton"),BA.ObjectToString("android.widget.CheckBox"),BA.ObjectToString("anywheresoftware.b4a.objects.SpinnerWrapper$B4ASpinner"),BA.ObjectToString("android.widget.ToggleButton"))) {
case 0:
 BA.debugLineNum = 65;BA.debugLine="Dim B As Button";
Debug.ShouldStop(1);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("B", _b);
 BA.debugLineNum = 66;BA.debugLine="B = V";
Debug.ShouldStop(2);
_b.setObject(_v.getObject());
 BA.debugLineNum = 67;BA.debugLine="B.TextSize = B.TextSize * Cf";
Debug.ShouldStop(4);
_b.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getTextSize"),size._cf}, "*",0, 0)));
 break;
case 1:
 BA.debugLineNum = 69;BA.debugLine="Dim E As EditText";
Debug.ShouldStop(16);
_e = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");Debug.locals.put("E", _e);
 BA.debugLineNum = 70;BA.debugLine="E = V";
Debug.ShouldStop(32);
_e.setObject(_v.getObject());
 BA.debugLineNum = 71;BA.debugLine="E.TextSize = E.TextSize * Cf";
Debug.ShouldStop(64);
_e.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_e.runMethod(true,"getTextSize"),size._cf}, "*",0, 0)));
 break;
case 2:
 BA.debugLineNum = 73;BA.debugLine="Dim L As Label";
Debug.ShouldStop(256);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("L", _l);
 BA.debugLineNum = 74;BA.debugLine="L = V";
Debug.ShouldStop(512);
_l.setObject(_v.getObject());
 BA.debugLineNum = 75;BA.debugLine="L.TextSize = L.TextSize * Cf";
Debug.ShouldStop(1024);
_l.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_l.runMethod(true,"getTextSize"),size._cf}, "*",0, 0)));
 break;
case 3:
 BA.debugLineNum = 77;BA.debugLine="Dim R As RadioButton";
Debug.ShouldStop(4096);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");Debug.locals.put("R", _r);
 BA.debugLineNum = 78;BA.debugLine="R = V";
Debug.ShouldStop(8192);
_r.setObject(_v.getObject());
 BA.debugLineNum = 79;BA.debugLine="R.TextSize = R.TextSize * Cf";
Debug.ShouldStop(16384);
_r.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTextSize"),size._cf}, "*",0, 0)));
 break;
case 4:
 BA.debugLineNum = 81;BA.debugLine="Dim C As CheckBox";
Debug.ShouldStop(65536);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("C", _c);
 BA.debugLineNum = 82;BA.debugLine="C = V";
Debug.ShouldStop(131072);
_c.setObject(_v.getObject());
 BA.debugLineNum = 83;BA.debugLine="C.TextSize = C.TextSize * Cf";
Debug.ShouldStop(262144);
_c.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_c.runMethod(true,"getTextSize"),size._cf}, "*",0, 0)));
 break;
case 5:
 BA.debugLineNum = 85;BA.debugLine="Dim S As Spinner";
Debug.ShouldStop(1048576);
_s = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");Debug.locals.put("S", _s);
 BA.debugLineNum = 86;BA.debugLine="S = V";
Debug.ShouldStop(2097152);
_s.setObject(_v.getObject());
 BA.debugLineNum = 87;BA.debugLine="S.TextSize = S.TextSize * Cf";
Debug.ShouldStop(4194304);
_s.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_s.runMethod(true,"getTextSize"),size._cf}, "*",0, 0)));
 break;
case 6:
 BA.debugLineNum = 89;BA.debugLine="Dim T As ToggleButton";
Debug.ShouldStop(16777216);
_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper");Debug.locals.put("T", _t);
 BA.debugLineNum = 90;BA.debugLine="T = V";
Debug.ShouldStop(33554432);
_t.setObject(_v.getObject());
 BA.debugLineNum = 91;BA.debugLine="T.TextSize = T.TextSize * Cf";
Debug.ShouldStop(67108864);
_t.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_t.runMethod(true,"getTextSize"),size._cf}, "*",0, 0)));
 break;
}
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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
public static RemoteObject  _setpanel(RemoteObject _ba,RemoteObject _vp) throws Exception{
try {
		Debug.PushSubsStack("SetPanel (size) ","size",2,_ba,size.mostCurrent,52);
if (RapidSub.canDelegate("setpanel")) return size.remoteMe.runUserSub(false, "size","setpanel", _ba, _vp);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
int _i = 0;
;
Debug.locals.put("Vp", _vp);
 BA.debugLineNum = 52;BA.debugLine="Private Sub SetPanel(Vp As View)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Dim P As Panel";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("P", _p);
 BA.debugLineNum = 54;BA.debugLine="Dim v As View";
Debug.ShouldStop(2097152);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 55;BA.debugLine="P = Vp";
Debug.ShouldStop(4194304);
_p.setObject(_vp.getObject());
 BA.debugLineNum = 56;BA.debugLine="For i = 0 To P.NumberOfViews -1";
Debug.ShouldStop(8388608);
{
final int step37 = 1;
final int limit37 = RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37); _i = ((int)(0 + _i + step37))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="v = P.GetView(i)";
Debug.ShouldStop(16777216);
_v = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("v", _v);
 BA.debugLineNum = 58;BA.debugLine="Modify(v)";
Debug.ShouldStop(33554432);
_modify(_ba,_v);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsize(RemoteObject _ba,RemoteObject _act,RemoteObject _designlargeaxis,RemoteObject _designsmallaxis) throws Exception{
try {
		Debug.PushSubsStack("SetSize (size) ","size",2,_ba,size.mostCurrent,11);
if (RapidSub.canDelegate("setsize")) return size.remoteMe.runUserSub(false, "size","setsize", _ba, _act, _designlargeaxis, _designsmallaxis);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _desdiag2 = RemoteObject.createImmutable(0f);
RemoteObject _realdiag2 = RemoteObject.createImmutable(0f);
int _i = 0;
;
Debug.locals.put("Act", _act);
Debug.locals.put("DesignLargeAxis", _designlargeaxis);
Debug.locals.put("DesignSmallAxis", _designsmallaxis);
 BA.debugLineNum = 11;BA.debugLine="Public Sub SetSize(Act As activity, DesignLargeAxis As Int, DesignSmallAxis As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Dim v As View";
Debug.ShouldStop(2048);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 13;BA.debugLine="Dim DesDiag2, RealDiag2 As Float";
Debug.ShouldStop(4096);
_desdiag2 = RemoteObject.createImmutable(0f);Debug.locals.put("DesDiag2", _desdiag2);
_realdiag2 = RemoteObject.createImmutable(0f);Debug.locals.put("RealDiag2", _realdiag2);
 BA.debugLineNum = 14;BA.debugLine="Large = DesignLargeAxis * Density";
Debug.ShouldStop(8192);
size._large = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_designlargeaxis,size.mostCurrent.__c.getField(true,"Density")}, "*",0, 0));
 BA.debugLineNum = 15;BA.debugLine="Small = DesignSmallAxis * Density";
Debug.ShouldStop(16384);
size._small = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_designsmallaxis,size.mostCurrent.__c.getField(true,"Density")}, "*",0, 0));
 BA.debugLineNum = 17;BA.debugLine="If 100%x > 100%y Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",size.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba),BA.numberCast(double.class, size.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba)))) { 
 BA.debugLineNum = 18;BA.debugLine="sx = 100%x /Large";
Debug.ShouldStop(131072);
size._sx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {size.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba),size._large}, "/",0, 0));
 BA.debugLineNum = 19;BA.debugLine="sy = 100%y/Small";
Debug.ShouldStop(262144);
size._sy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {size.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba),size._small}, "/",0, 0));
 }else {
 BA.debugLineNum = 22;BA.debugLine="sx = 100%x/Small";
Debug.ShouldStop(2097152);
size._sx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {size.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba),size._small}, "/",0, 0));
 BA.debugLineNum = 23;BA.debugLine="sy = 100%y/Large";
Debug.ShouldStop(4194304);
size._sy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {size.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba),size._large}, "/",0, 0));
 };
 BA.debugLineNum = 27;BA.debugLine="DesDiag2 = Large*Large + Small*Small";
Debug.ShouldStop(67108864);
_desdiag2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {size._large,size._large,size._small,size._small}, "*+*",1, 1));Debug.locals.put("DesDiag2", _desdiag2);
 BA.debugLineNum = 28;BA.debugLine="RealDiag2 = 100%y * 100%y + 100%x * 100%x";
Debug.ShouldStop(134217728);
_realdiag2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {size.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba),size.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba),size.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba),size.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),_ba)}, "*+*",1, 1));Debug.locals.put("RealDiag2", _realdiag2);
 BA.debugLineNum = 29;BA.debugLine="Cf =  Sqrt(RealDiag2/DesDiag2)' / Density   ' font size factor";
Debug.ShouldStop(268435456);
size._cf = BA.numberCast(float.class, size.mostCurrent.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {_realdiag2,_desdiag2}, "/",0, 0))));
 BA.debugLineNum = 31;BA.debugLine="For i = 0 To Act.NumberOfViews -1";
Debug.ShouldStop(1073741824);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_act.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20); _i = ((int)(0 + _i + step20))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 32;BA.debugLine="v = Act.GetView(i)";
Debug.ShouldStop(-2147483648);
_v = _act.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("v", _v);
 BA.debugLineNum = 33;BA.debugLine="Modify(v)";
Debug.ShouldStop(1);
_modify(_ba,_v);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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