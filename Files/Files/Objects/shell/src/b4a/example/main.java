
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("b4a.example.main", "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class, processBA);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _voce = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.VoiceRecognition");
public static RemoteObject _parla = RemoteObject.declareNull("anywheresoftware.b4a.obejcts.TTS");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _voce_result = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _frase = RemoteObject.createImmutable("");
public static RemoteObject _x = RemoteObject.createImmutable(0);
public static RemoteObject _apri = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
public static RemoteObject _calls = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneCalls");
public static RemoteObject _contatti = RemoteObject.declareNull("anywheresoftware.b4a.phone.ContactsWrapper");
public static RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static b4a.example.modulo_ilight _modulo_ilight = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"apri",main.mostCurrent._apri,"Button1",main.mostCurrent._button1,"calls",main.mostCurrent._calls,"contatti",main.mostCurrent._contatti,"EditText1",main.mostCurrent._edittext1,"frase",main.mostCurrent._frase,"Label1",main.mostCurrent._label1,"lista",main.mostCurrent._lista,"modulo_ilight",Debug.moduleToString(b4a.example.modulo_ilight.class),"parla",main._parla,"voce",main._voce,"voce_result",main.mostCurrent._voce_result,"x",main._x};
}
}