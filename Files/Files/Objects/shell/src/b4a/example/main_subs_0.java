package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"vocale_esempio\")";
Debug.ShouldStop(128);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("vocale_esempio")),main.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="voce.Initialize(\"voce\")";
Debug.ShouldStop(256);
main._voce.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("voce")));
 BA.debugLineNum = 42;BA.debugLine="parla.Initialize(\"parla\")";
Debug.ShouldStop(512);
main._parla.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("parla")));
 BA.debugLineNum = 43;BA.debugLine="x = 0";
Debug.ShouldStop(1024);
main._x = BA.numberCast(int.class, 0);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,46);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,89);
if (RapidSub.canDelegate("button1_click")) return main.remoteMe.runUserSub(false, "main","button1_click");
 BA.debugLineNum = 89;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="voce.Listen";
Debug.ShouldStop(33554432);
main._voce.runVoidMethod ("Listen",main.processBA);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
modulo_ilight_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
modulo_ilight.myClass = BA.getDeviceClass ("b4a.example.modulo_ilight");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private EditText1 As EditText";
main.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private voce_result As Button";
main.mostCurrent._voce_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private frase As String";
main.mostCurrent._frase = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Private x As Int";
main._x = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 32;BA.debugLine="Private apri As PhoneIntents";
main.mostCurrent._apri = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 //BA.debugLineNum = 33;BA.debugLine="Private calls As PhoneCalls";
main.mostCurrent._calls = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneCalls");
 //BA.debugLineNum = 34;BA.debugLine="Private contatti As Contacts";
main.mostCurrent._contatti = RemoteObject.createNew ("anywheresoftware.b4a.phone.ContactsWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lista = contatti.GetAll As List 'apreleva tutti i dati da contatti'";
main.mostCurrent._lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main.mostCurrent._lista = main.mostCurrent._contatti.runMethod(false,"GetAll");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim voce As VoiceRecognition";
main._voce = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.VoiceRecognition");
 //BA.debugLineNum = 19;BA.debugLine="Dim parla As TTS";
main._parla = RemoteObject.createNew ("anywheresoftware.b4a.obejcts.TTS");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _voce_result(RemoteObject _success,RemoteObject _texts) throws Exception{
try {
		Debug.PushSubsStack("voce_result (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("voce_result")) return main.remoteMe.runUserSub(false, "main","voce_result", _success, _texts);
int _w = 0;
RemoteObject _contatto = RemoteObject.declareNull("anywheresoftware.b4a.phone.ContactsWrapper.Contact");
RemoteObject _telf = RemoteObject.createImmutable(0);
Debug.locals.put("success", _success);
Debug.locals.put("texts", _texts);
 BA.debugLineNum = 53;BA.debugLine="Sub voce_result(success As Boolean , texts As List)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="frase = texts.Get(0)";
Debug.ShouldStop(2097152);
main.mostCurrent._frase = BA.ObjectToString(_texts.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 55;BA.debugLine="EditText1.Text = frase";
Debug.ShouldStop(4194304);
main.mostCurrent._edittext1.runMethodAndSync(true,"setText",(main.mostCurrent._frase));
 BA.debugLineNum = 56;BA.debugLine="If frase = \"ciao\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main.mostCurrent._frase,BA.ObjectToString("ciao"))) { 
 BA.debugLineNum = 57;BA.debugLine="parla.Speak(\"ciao anche a te come stai?\",True)";
Debug.ShouldStop(16777216);
main._parla.runVoidMethod ("Speak",(Object)(BA.ObjectToString("ciao anche a te come stai?")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 58;BA.debugLine="Else If x = 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",main._x,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 59;BA.debugLine="StartActivity(apri.OpenBrowser(\"http://www.google.it\"))";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((main.mostCurrent._apri.runMethod(false,"OpenBrowser",(Object)(BA.ObjectToString("http://www.google.it"))))));
 BA.debugLineNum = 60;BA.debugLine="x = 0";
Debug.ShouldStop(134217728);
main._x = BA.numberCast(int.class, 0);
 }else 
{ BA.debugLineNum = 61;BA.debugLine="Else If x = 2 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main._x,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 62;BA.debugLine="StartActivity(calls.Call(frase))";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((main.mostCurrent._calls.runMethod(false,"Call",(Object)(main.mostCurrent._frase)))));
 }else 
{ BA.debugLineNum = 63;BA.debugLine="Else If frase = \"Internet\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main.mostCurrent._frase,BA.ObjectToString("Internet"))) { 
 BA.debugLineNum = 64;BA.debugLine="parla.Speak(\"cosa vuoi cercare?\",True)";
Debug.ShouldStop(-2147483648);
main._parla.runVoidMethod ("Speak",(Object)(BA.ObjectToString("cosa vuoi cercare?")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 65;BA.debugLine="x = 1";
Debug.ShouldStop(1);
main._x = BA.numberCast(int.class, 1);
 }else 
{ BA.debugLineNum = 66;BA.debugLine="Else If x = 3 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main._x,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 67;BA.debugLine="For w=0 To lista.Size-1";
Debug.ShouldStop(4);
{
final int step40 = 1;
final int limit40 = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._lista.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_w = 0; (step40 > 0 && _w <= limit40) || (step40 < 0 && _w >= limit40); _w = ((int)(0 + _w + step40))) {
Debug.locals.put("w", _w);
 BA.debugLineNum = 68;BA.debugLine="Dim contatto  As Contact";
Debug.ShouldStop(8);
_contatto = RemoteObject.createNew ("anywheresoftware.b4a.phone.ContactsWrapper.Contact");Debug.locals.put("contatto", _contatto);
 BA.debugLineNum = 69;BA.debugLine="contatto = lista.Get(w)";
Debug.ShouldStop(16);
_contatto = (main.mostCurrent._lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _w))));Debug.locals.put("contatto", _contatto);
 BA.debugLineNum = 70;BA.debugLine="Log (contatto)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_contatto)));
 BA.debugLineNum = 71;BA.debugLine="If contatto.Name = frase Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_contatto.getField(true,"Name"),main.mostCurrent._frase)) { 
 BA.debugLineNum = 72;BA.debugLine="Dim telf As Int";
Debug.ShouldStop(128);
_telf = RemoteObject.createImmutable(0);Debug.locals.put("telf", _telf);
 BA.debugLineNum = 73;BA.debugLine="telf = contatto.PHONE_MOBILE";
Debug.ShouldStop(256);
_telf = _contatto.getField(true,"PHONE_MOBILE");Debug.locals.put("telf", _telf);
 BA.debugLineNum = 74;BA.debugLine="StartActivity(calls.Call(telf))";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((main.mostCurrent._calls.runMethod(false,"Call",(Object)(BA.NumberToString(_telf))))));
 };
 }
}Debug.locals.put("w", _w);
;
 }else 
{ BA.debugLineNum = 77;BA.debugLine="Else If frase = \"telefono\" OR frase = \"voglio delefonare \"  Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main.mostCurrent._frase,BA.ObjectToString("telefono")) || RemoteObject.solveBoolean("=",main.mostCurrent._frase,BA.ObjectToString("voglio delefonare "))) { 
 BA.debugLineNum = 78;BA.debugLine="parla.Speak(\"quale numero\",True)";
Debug.ShouldStop(8192);
main._parla.runVoidMethod ("Speak",(Object)(BA.ObjectToString("quale numero")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="x=2";
Debug.ShouldStop(16384);
main._x = BA.numberCast(int.class, 2);
 }else 
{ BA.debugLineNum = 80;BA.debugLine="Else If frase = \"telefona contatto\" OR frase = \"telefona a contatto\" OR frase = \"contatti\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main.mostCurrent._frase,BA.ObjectToString("telefona contatto")) || RemoteObject.solveBoolean("=",main.mostCurrent._frase,BA.ObjectToString("telefona a contatto")) || RemoteObject.solveBoolean("=",main.mostCurrent._frase,BA.ObjectToString("contatti"))) { 
 BA.debugLineNum = 81;BA.debugLine="parla.Speak(\"quale nome devo chiamare?\",True)";
Debug.ShouldStop(65536);
main._parla.runVoidMethod ("Speak",(Object)(BA.ObjectToString("quale nome devo chiamare?")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 82;BA.debugLine="x=3";
Debug.ShouldStop(131072);
main._x = BA.numberCast(int.class, 3);
 }else {
 BA.debugLineNum = 84;BA.debugLine="parla.Speak(\"non ho capito\",True)";
Debug.ShouldStop(524288);
main._parla.runVoidMethod ("Speak",(Object)(BA.ObjectToString("non ho capito")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 }}}}}}};
 BA.debugLineNum = 88;BA.debugLine="End Sub";
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
public static RemoteObject  _voce_result_click() throws Exception{
try {
		Debug.PushSubsStack("voce_result_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("voce_result_click")) return main.remoteMe.runUserSub(false, "main","voce_result_click");
 BA.debugLineNum = 93;BA.debugLine="Sub voce_result_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="StartActivity(\"modulo_ilight\")";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(("modulo_ilight"))));
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
}