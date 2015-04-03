package anywheresoftware.b4a.samples.bluetooth;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class chatactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Activity.LoadLayout(\"2\")";
Debug.ShouldStop(131072);
chatactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("2")),chatactivity.mostCurrent.activityBA);
 BA.debugLineNum = 19;BA.debugLine="If AStream.IsInitialized = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",chatactivity._astream.runMethod(true,"IsInitialized"),chatactivity.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 20;BA.debugLine="AStream.InitializePrefix(Main.serial1.InputStream, True, Main.serial1.OutputStream, \"AStream\")";
Debug.ShouldStop(524288);
chatactivity._astream.runVoidMethod ("InitializePrefix",chatactivity.processBA,(Object)(chatactivity.mostCurrent._main._serial1.runMethod(false,"getInputStream")),(Object)(chatactivity.mostCurrent.__c.getField(true,"True")),(Object)(chatactivity.mostCurrent._main._serial1.runMethod(false,"getOutputStream")),(Object)(BA.ObjectToString("AStream")));
 };
 BA.debugLineNum = 22;BA.debugLine="txtLog.Width = 100%x";
Debug.ShouldStop(2097152);
chatactivity.mostCurrent._txtlog.runMethod(true,"setWidth",chatactivity.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),chatactivity.mostCurrent.activityBA));
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
		Debug.PushSubsStack("Activity_Pause (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="If UserClosed Then";
Debug.ShouldStop(2048);
if (_userclosed.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 45;BA.debugLine="AStream.Close";
Debug.ShouldStop(4096);
chatactivity._astream.runVoidMethod ("Close");
 };
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","activity_resume");
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _astream_error() throws Exception{
try {
		Debug.PushSubsStack("AStream_Error (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,29);
if (RapidSub.canDelegate("astream_error")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","astream_error");
 BA.debugLineNum = 29;BA.debugLine="Sub AStream_Error";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="ToastMessageShow(\"Connection is broken.\", True)";
Debug.ShouldStop(536870912);
chatactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("Connection is broken.")),(Object)(chatactivity.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 31;BA.debugLine="btnSend.Enabled = False";
Debug.ShouldStop(1073741824);
chatactivity.mostCurrent._btnsend.runMethod(true,"setEnabled",chatactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 32;BA.debugLine="txtInput.Enabled = False";
Debug.ShouldStop(-2147483648);
chatactivity.mostCurrent._txtinput.runMethod(true,"setEnabled",chatactivity.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _astream_newdata(RemoteObject _buffer) throws Exception{
try {
		Debug.PushSubsStack("AStream_NewData (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,25);
if (RapidSub.canDelegate("astream_newdata")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","astream_newdata", _buffer);
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 25;BA.debugLine="Sub AStream_NewData (Buffer() As Byte)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="LogMessage(\"You\", BytesToString(Buffer, 0, Buffer.Length, \"UTF8\"))";
Debug.ShouldStop(33554432);
_logmessage(BA.ObjectToString("You"),chatactivity.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(BA.ObjectToString("UTF8"))));
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
public static RemoteObject  _astream_terminated() throws Exception{
try {
		Debug.PushSubsStack("AStream_Terminated (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,35);
if (RapidSub.canDelegate("astream_terminated")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","astream_terminated");
 BA.debugLineNum = 35;BA.debugLine="Sub AStream_Terminated";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="AStream_Error";
Debug.ShouldStop(8);
_astream_error();
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
public static RemoteObject  _btnsend_click() throws Exception{
try {
		Debug.PushSubsStack("btnSend_Click (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,52);
if (RapidSub.canDelegate("btnsend_click")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","btnsend_click");
 BA.debugLineNum = 52;BA.debugLine="Sub btnSend_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="AStream.Write(txtInput.Text.GetBytes(\"UTF8\"))";
Debug.ShouldStop(1048576);
chatactivity._astream.runVoidMethod ("Write",(Object)(chatactivity.mostCurrent._txtinput.runMethod(true,"getText").runMethod(false,"getBytes",(Object)(BA.ObjectToString("UTF8")))));
 BA.debugLineNum = 54;BA.debugLine="txtInput.SelectAll";
Debug.ShouldStop(2097152);
chatactivity.mostCurrent._txtinput.runVoidMethod ("SelectAll");
 BA.debugLineNum = 55;BA.debugLine="txtInput.RequestFocus";
Debug.ShouldStop(4194304);
chatactivity.mostCurrent._txtinput.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 56;BA.debugLine="LogMessage(\"Me\", txtInput.Text)";
Debug.ShouldStop(8388608);
_logmessage(BA.ObjectToString("Me"),chatactivity.mostCurrent._txtinput.runMethod(true,"getText"));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Dim txtInput As EditText";
chatactivity.mostCurrent._txtinput = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim txtLog As EditText";
chatactivity.mostCurrent._txtlog = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim btnSend As Button";
chatactivity.mostCurrent._btnsend = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _logmessage(RemoteObject _from,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("LogMessage (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,59);
if (RapidSub.canDelegate("logmessage")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","logmessage", _from, _msg);
Debug.locals.put("From", _from);
Debug.locals.put("Msg", _msg);
 BA.debugLineNum = 59;BA.debugLine="Sub LogMessage(From As String, Msg As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="txtLog.Text = txtLog.Text & From & \": \" & Msg & CRLF";
Debug.ShouldStop(134217728);
chatactivity.mostCurrent._txtlog.runMethodAndSync(true,"setText",(RemoteObject.concat(chatactivity.mostCurrent._txtlog.runMethod(true,"getText"),_from,RemoteObject.createImmutable(": "),_msg,chatactivity.mostCurrent.__c.getField(true,"CRLF"))));
 BA.debugLineNum = 61;BA.debugLine="txtLog.SelectionStart = txtLog.Text.Length";
Debug.ShouldStop(268435456);
chatactivity.mostCurrent._txtlog.runMethod(true,"setSelectionStart",chatactivity.mostCurrent._txtlog.runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim AStream As AsyncStreams";
chatactivity._astream = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _txtinput_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("txtInput_EnterPressed (chatactivity) ","chatactivity",1,chatactivity.mostCurrent.activityBA,chatactivity.mostCurrent,49);
if (RapidSub.canDelegate("txtinput_enterpressed")) return chatactivity.remoteMe.runUserSub(false, "chatactivity","txtinput_enterpressed");
 BA.debugLineNum = 49;BA.debugLine="Sub txtInput_EnterPressed";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="If btnSend.Enabled = True Then btnSend_Click";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",chatactivity.mostCurrent._btnsend.runMethod(true,"getEnabled"),chatactivity.mostCurrent.__c.getField(true,"True"))) { 
_btnsend_click();};
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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