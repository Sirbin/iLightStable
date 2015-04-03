
package derez.libs;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class size implements IRemote{
	public static size mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public size() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new size();
        remoteMe = RemoteObject.declareNull("derez.libs.size");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("derez.libs.size", "derez.libs.size");
	}
    private static PCBA pcBA = new PCBA(null, size.class, null);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _large = RemoteObject.createImmutable(0);
public static RemoteObject _small = RemoteObject.createImmutable(0);
public static RemoteObject _sx = RemoteObject.createImmutable(0f);
public static RemoteObject _sy = RemoteObject.createImmutable(0f);
public static RemoteObject _cf = RemoteObject.createImmutable(0f);
public static derez.libs.main _main = null;
  public Object[] GetGlobals() {
		return new Object[] {"Cf",size._cf,"Large",size._large,"Main",Debug.moduleToString(derez.libs.main.class),"Small",size._small,"sx",size._sx,"sy",size._sy};
}
}