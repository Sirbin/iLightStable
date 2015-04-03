
package derez.libs;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class vseekbar implements IRemote{
	public static vseekbar mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public vseekbar() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return false;
	}
    public static PCBA staticBA = new PCBA(null, vseekbar.class, null);
    private PCBA pcBA;
    public RemoteObject ba;
    public RemoteObject ref;
	public RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), RemoteObject.addItemToArray(ref, args));
	}
    public void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        ref = (RemoteObject) args[0];
        ba = (RemoteObject) args[2];
		pcBA = new PCBA(this, vseekbar.class, ba);
		return pcBA;
	}


public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dr1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
public static RemoteObject _dr2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
public static RemoteObject _dr3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
public static RemoteObject _slider = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _caret = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _vpos = RemoteObject.createImmutable(0);
public static RemoteObject _h = RemoteObject.createImmutable(0);
public static RemoteObject _w = RemoteObject.createImmutable(0);
public static RemoteObject _maxv = RemoteObject.createImmutable(0);
public static RemoteObject _d = RemoteObject.createImmutable(0);
public static RemoteObject _vmodule = RemoteObject.declareNull("Object");
public static RemoteObject _vbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cover = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _barname = RemoteObject.createImmutable("");
public static derez.libs.main _main = null;
public static derez.libs.size _size = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BarName",_ref.getFieldClass("derez.libs.vseekbar", false, "_barname"),"caret",_ref.getFieldClass("derez.libs.vseekbar", false, "_caret"),"cover",_ref.getFieldClass("derez.libs.vseekbar", false, "_cover"),"D",_ref.getFieldClass("derez.libs.vseekbar", false, "_d"),"dr1",_ref.getFieldClass("derez.libs.vseekbar", false, "_dr1"),"dr2",_ref.getFieldClass("derez.libs.vseekbar", false, "_dr2"),"dr3",_ref.getFieldClass("derez.libs.vseekbar", false, "_dr3"),"H",_ref.getFieldClass("derez.libs.vseekbar", false, "_h"),"MaxV",_ref.getFieldClass("derez.libs.vseekbar", false, "_maxv"),"slider",_ref.getFieldClass("derez.libs.vseekbar", false, "_slider"),"Vbase",_ref.getFieldClass("derez.libs.vseekbar", false, "_vbase"),"Vmodule",_ref.getFieldClass("derez.libs.vseekbar", false, "_vmodule"),"Vpos",_ref.getFieldClass("derez.libs.vseekbar", false, "_vpos"),"W",_ref.getFieldClass("derez.libs.vseekbar", false, "_w")};
}
}