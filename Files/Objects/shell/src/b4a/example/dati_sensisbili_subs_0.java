package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dati_sensisbili_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (dati_sensisbili) ","dati_sensisbili",1,dati_sensisbili.mostCurrent.activityBA,dati_sensisbili.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) return dati_sensisbili.remoteMe.runUserSub(false, "dati_sensisbili","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"prova3\")";
Debug.ShouldStop(524288);
dati_sensisbili.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("prova3")),dati_sensisbili.mostCurrent.activityBA);
 BA.debugLineNum = 21;BA.debugLine="msgbox(\"Benveuto\", \"Dati Sensible\")";
Debug.ShouldStop(1048576);
dati_sensisbili.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("Benveuto")),(Object)(BA.ObjectToString("Dati Sensible")),dati_sensisbili.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Pause (dati_sensisbili) ","dati_sensisbili",1,dati_sensisbili.mostCurrent.activityBA,dati_sensisbili.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) return dati_sensisbili.remoteMe.runUserSub(false, "dati_sensisbili","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (dati_sensisbili) ","dati_sensisbili",1,dati_sensisbili.mostCurrent.activityBA,dati_sensisbili.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) return dati_sensisbili.remoteMe.runUserSub(false, "dati_sensisbili","activity_resume");
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}