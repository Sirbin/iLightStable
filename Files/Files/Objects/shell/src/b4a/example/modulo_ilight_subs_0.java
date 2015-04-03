package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulo_ilight_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (modulo_ilight) ","modulo_ilight",1,modulo_ilight.mostCurrent.activityBA,modulo_ilight.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) return modulo_ilight.remoteMe.runUserSub(false, "modulo_ilight","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"ilight_prova2\")";
Debug.ShouldStop(1048576);
modulo_ilight.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("ilight_prova2")),modulo_ilight.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="Msgbox(\"Welcome to Basic4android!\", \"\")";
Debug.ShouldStop(2097152);
modulo_ilight.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("Welcome to Basic4android!")),(Object)(BA.ObjectToString("")),modulo_ilight.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Pause (modulo_ilight) ","modulo_ilight",1,modulo_ilight.mostCurrent.activityBA,modulo_ilight.mostCurrent,29);
if (RapidSub.canDelegate("activity_pause")) return modulo_ilight.remoteMe.runUserSub(false, "modulo_ilight","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (modulo_ilight) ","modulo_ilight",1,modulo_ilight.mostCurrent.activityBA,modulo_ilight.mostCurrent,25);
if (RapidSub.canDelegate("activity_resume")) return modulo_ilight.remoteMe.runUserSub(false, "modulo_ilight","activity_resume");
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
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
public static RemoteObject  _back_click() throws Exception{
try {
		Debug.PushSubsStack("Back_Click (modulo_ilight) ","modulo_ilight",1,modulo_ilight.mostCurrent.activityBA,modulo_ilight.mostCurrent,35);
if (RapidSub.canDelegate("back_click")) return modulo_ilight.remoteMe.runUserSub(false, "modulo_ilight","back_click");
 BA.debugLineNum = 35;BA.debugLine="Sub Back_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(8);
modulo_ilight.mostCurrent.__c.runVoidMethod ("StartActivity",modulo_ilight.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(("Main"))));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private Back As Button";
modulo_ilight.mostCurrent._back = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}