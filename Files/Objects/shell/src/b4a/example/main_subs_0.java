package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"prova2\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("prova2")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("button1_click")) return main.remoteMe.runUserSub(false, "main","button1_click");
 BA.debugLineNum = 45;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="If EditText1.Text = \"alessio\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main.mostCurrent._edittext1.runMethod(true,"getText"),BA.ObjectToString("alessio"))) { 
 BA.debugLineNum = 47;BA.debugLine="Msgbox(\"ciao \" & EditText1.Text,\"Password\")";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ciao "),main.mostCurrent._edittext1.runMethod(true,"getText"))),(Object)(BA.ObjectToString("Password")),main.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="StartActivity(\"dati_sensisbili\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(("dati_sensisbili"))));
 }else {
 BA.debugLineNum = 51;BA.debugLine="Msgbox(\"Riproca\",\"Password Errata\")";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("Riproca")),(Object)(BA.ObjectToString("Password Errata")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
dati_sensisbili_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
dati_sensisbili.myClass = BA.getDeviceClass ("b4a.example.dati_sensisbili");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EditText1 As EditText";
main.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private pdw As Int";
main._pdw = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}