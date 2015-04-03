package derez.libs;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"bar.bal\")";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(BA.ObjectToString("bar.bal")),main.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="Hbar.setColors(Colors.Black, Colors.white, Colors.rgb(255,180,180), Colors.white)";
Debug.ShouldStop(33554432);
main.mostCurrent._hbar.runClassMethod (derez.libs.hseekbar.class, "_setcolors",(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 180)))),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 31;BA.debugLine="cs2.Initialize(Me,\"cs2\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._cs2.runClassMethod (derez.libs.circleseek.class, "_initialize",main.mostCurrent.activityBA,(Object)(main.getObject()),(Object)(BA.ObjectToString("cs2")));
 BA.debugLineNum = 32;BA.debugLine="cs2.CodeCreateView(31%x,31%x,100, cs2.SHORT_KNOB)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._cs2.runClassMethod (derez.libs.circleseek.class, "_codecreateview",(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 31)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 31)),main.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 100)),(Object)(main.mostCurrent._cs2.getFieldClass("derez.libs.circleseek", true,"_short_knob")));
 BA.debugLineNum = 33;BA.debugLine="Activity.AddView(cs2.AsView,20%x,60%y,40%x,40%x)";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._cs2.runClassMethod (derez.libs.circleseek.class, "_asview").getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 35;BA.debugLine="cs.setColors(Colors.RGB(150,150,255), Colors.blue, Colors.RGB(180,180,255), Colors.Yellow, 24*Size.cf)";
Debug.ShouldStop(4);
main.mostCurrent._cs.runClassMethod (derez.libs.circleseek.class, "_setcolors",(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 255)))),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 255)))),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(24),main.mostCurrent._size._cf}, "*",0, 0))));
 BA.debugLineNum = 36;BA.debugLine="cs2.setColors(Colors.RGB(150,150,255), Colors.blue, Colors.RGB(180,180,255), Colors.Yellow, 24*Size.cf)";
Debug.ShouldStop(8);
main.mostCurrent._cs2.runClassMethod (derez.libs.circleseek.class, "_setcolors",(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 255)))),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue")),(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 255)))),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(24),main.mostCurrent._size._cf}, "*",0, 0))));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Hbar.Value = 50";
Debug.ShouldStop(256);
main.mostCurrent._hbar.runClassMethod (derez.libs.hseekbar.class, "_setvalue",BA.numberCast(int.class, 50));
 BA.debugLineNum = 42;BA.debugLine="vbar.Value = 75";
Debug.ShouldStop(512);
main.mostCurrent._vbar.runClassMethod (derez.libs.vseekbar.class, "_setvalue",BA.numberCast(int.class, 75));
 BA.debugLineNum = 43;BA.debugLine="cs.Value = 0";
Debug.ShouldStop(1024);
main.mostCurrent._cs.runClassMethod (derez.libs.circleseek.class, "_setvalue",BA.numberCast(double.class, 0));
 BA.debugLineNum = 44;BA.debugLine="cs2.Value = 75";
Debug.ShouldStop(2048);
main.mostCurrent._cs2.runClassMethod (derez.libs.circleseek.class, "_setvalue",BA.numberCast(double.class, 75));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cs_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("cs_ValueChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("cs_valuechanged")) return main.remoteMe.runUserSub(false, "main","cs_valuechanged", _value, _userchanged);
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 60;BA.debugLine="Sub cs_ValueChanged(Value As Int, UserChanged As Boolean)";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _cs2_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("cs2_ValueChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("cs2_valuechanged")) return main.remoteMe.runUserSub(false, "main","cs2_valuechanged", _value, _userchanged);
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 64;BA.debugLine="Sub cs2_ValueChanged(Value As Int, UserChanged As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
size_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("derez.libs.main");
vseekbar.myClass = BA.getDeviceClass ("derez.libs.vseekbar");
size.myClass = BA.getDeviceClass ("derez.libs.size");
circleseek.myClass = BA.getDeviceClass ("derez.libs.circleseek");
hseekbar.myClass = BA.getDeviceClass ("derez.libs.hseekbar");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim vbar As VSeekbar";
main.mostCurrent._vbar = RemoteObject.createNew ("derez.libs.vseekbar");
 //BA.debugLineNum = 20;BA.debugLine="Dim Hbar As HSeekbar";
main.mostCurrent._hbar = RemoteObject.createNew ("derez.libs.hseekbar");
 //BA.debugLineNum = 21;BA.debugLine="Dim cs, cs2 As CircleSeek";
main.mostCurrent._cs = RemoteObject.createNew ("derez.libs.circleseek");
main.mostCurrent._cs2 = RemoteObject.createNew ("derez.libs.circleseek");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hbar_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("Hbar_ValueChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("hbar_valuechanged")) return main.remoteMe.runUserSub(false, "main","hbar_valuechanged", _value, _userchanged);
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 51;BA.debugLine="Sub Hbar_ValueChanged(Value As Int, UserChanged As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Log(\"H \" & Value& \"  \" & UserChanged)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("H "),_value,RemoteObject.createImmutable("  "),_userchanged)));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _vbar_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("Vbar_ValueChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("vbar_valuechanged")) return main.remoteMe.runUserSub(false, "main","vbar_valuechanged", _value, _userchanged);
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 55;BA.debugLine="Sub Vbar_ValueChanged(Value As Int, UserChanged As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
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
}