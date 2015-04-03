
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
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _dbfiledir = RemoteObject.createImmutable("");
public static RemoteObject _dbfilename = RemoteObject.createImmutable("");
public static RemoteObject _dbtablename = RemoteObject.createImmutable("");
public static RemoteObject _selectedid = RemoteObject.createImmutable(0);
public static RemoteObject _selectedrow = RemoteObject.createImmutable(0);
public static RemoteObject _table1 = RemoteObject.declareNull("b4a.example.table");
public static RemoteObject _pnltable = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btndb = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnchangeheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _newheaders = RemoteObject.createImmutable(false);
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"btnChangeHeaders",main.mostCurrent._btnchangeheaders,"btnCVS",main.mostCurrent._btncvs,"btnDB",main.mostCurrent._btndb,"DBFileDir",main._dbfiledir,"DBFileName",main._dbfilename,"DBTableName",main._dbtablename,"NewHeaders",main._newheaders,"pnlTable",main.mostCurrent._pnltable,"SelectedID",main._selectedid,"SelectedRow",main._selectedrow,"SQL1",main._sql1,"Table1",main.mostCurrent._table1};
}
}