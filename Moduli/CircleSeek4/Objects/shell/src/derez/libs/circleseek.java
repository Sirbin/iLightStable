
package derez.libs;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class circleseek implements IRemote{
	public static circleseek mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public circleseek() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return false;
	}
    public static PCBA staticBA = new PCBA(null, circleseek.class, null);
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
		pcBA = new PCBA(this, circleseek.class, ba);
		return pcBA;
	}


public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _first = RemoteObject.createImmutable(false);
public static RemoteObject _cwith = RemoteObject.createImmutable(0);
public static RemoteObject _cnvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _difbase = null;
public static RemoteObject _difside = null;
public static RemoteObject _ds = RemoteObject.createImmutable(0f);
public static RemoteObject _cx = RemoteObject.createImmutable(0);
public static RemoteObject _cy = RemoteObject.createImmutable(0);
public static RemoteObject _s = RemoteObject.createImmutable(0);
public static RemoteObject _resbase = null;
public static RemoteObject _resside = null;
public static RemoteObject _rescnt = null;
public static RemoteObject _maxv = RemoteObject.createImmutable(0);
public static RemoteObject _position = RemoteObject.createImmutable(0);
public static RemoteObject _basecolor = RemoteObject.createImmutable(0);
public static RemoteObject _sliderside = RemoteObject.createImmutable(0);
public static RemoteObject _slidercnt = RemoteObject.createImmutable(0);
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _textsize = RemoteObject.createImmutable(0);
public static RemoteObject _none = RemoteObject.createImmutable(0);
public static RemoteObject _short_knob = RemoteObject.createImmutable(0);
public static RemoteObject _long_knob = RemoteObject.createImmutable(0);
public static RemoteObject _clabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _cmodule = RemoteObject.declareNull("Object");
public static RemoteObject _cbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _basepath = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");
public static RemoteObject _slidepath = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");
public static RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
public static RemoteObject _event = RemoteObject.createImmutable("");
public static derez.libs.main _main = null;
public static derez.libs.size _size = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"basecolor",_ref.getFieldClass("derez.libs.circleseek", false, "_basecolor"),"basepath",_ref.getFieldClass("derez.libs.circleseek", false, "_basepath"),"Cbase",_ref.getFieldClass("derez.libs.circleseek", false, "_cbase"),"Clabel",_ref.getFieldClass("derez.libs.circleseek", false, "_clabel"),"CModule",_ref.getFieldClass("derez.libs.circleseek", false, "_cmodule"),"cnvs",_ref.getFieldClass("derez.libs.circleseek", false, "_cnvs"),"Cwith",_ref.getFieldClass("derez.libs.circleseek", false, "_cwith"),"cx",_ref.getFieldClass("derez.libs.circleseek", false, "_cx"),"cy",_ref.getFieldClass("derez.libs.circleseek", false, "_cy"),"difbase",_ref.getFieldClass("derez.libs.circleseek", false, "_difbase"),"difside",_ref.getFieldClass("derez.libs.circleseek", false, "_difside"),"ds",_ref.getFieldClass("derez.libs.circleseek", false, "_ds"),"Event",_ref.getFieldClass("derez.libs.circleseek", false, "_event"),"first",_ref.getFieldClass("derez.libs.circleseek", false, "_first"),"LONG_KNOB",_ref.getFieldClass("derez.libs.circleseek", false, "_long_knob"),"maxv",_ref.getFieldClass("derez.libs.circleseek", false, "_maxv"),"NONE",_ref.getFieldClass("derez.libs.circleseek", false, "_none"),"position",_ref.getFieldClass("derez.libs.circleseek", false, "_position"),"R",_ref.getFieldClass("derez.libs.circleseek", false, "_r"),"resbase",_ref.getFieldClass("derez.libs.circleseek", false, "_resbase"),"rescnt",_ref.getFieldClass("derez.libs.circleseek", false, "_rescnt"),"resside",_ref.getFieldClass("derez.libs.circleseek", false, "_resside"),"S",_ref.getFieldClass("derez.libs.circleseek", false, "_s"),"SHORT_KNOB",_ref.getFieldClass("derez.libs.circleseek", false, "_short_knob"),"slidepath",_ref.getFieldClass("derez.libs.circleseek", false, "_slidepath"),"slidercnt",_ref.getFieldClass("derez.libs.circleseek", false, "_slidercnt"),"sliderside",_ref.getFieldClass("derez.libs.circleseek", false, "_sliderside"),"Textcolor",_ref.getFieldClass("derez.libs.circleseek", false, "_textcolor"),"Textsize",_ref.getFieldClass("derez.libs.circleseek", false, "_textsize")};
}
}