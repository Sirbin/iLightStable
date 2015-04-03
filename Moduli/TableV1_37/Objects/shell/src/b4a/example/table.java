
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class table implements IRemote{
	public static table mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public table() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return false;
	}
    public static PCBA staticBA = new PCBA(null, table.class, null);
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
		pcBA = new PCBA(this, table.class, ba);
		return pcBA;
	}


public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _stringutils1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _sv = RemoteObject.declareNull("flm.b4a.scrollview2d.ScrollView2DWrapper");
public static RemoteObject _pnltable = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _header = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblstatusline = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _event = RemoteObject.createImmutable("");
public static RemoteObject _headernames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _selectedrows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _selectedcol = RemoteObject.createImmutable(0);
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _labelscache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _minvisiblerow = RemoteObject.createImmutable(0);
public static RemoteObject _maxvisiblerow = RemoteObject.createImmutable(0);
public static RemoteObject _isvisible = RemoteObject.createImmutable(false);
public static RemoteObject _visiblerows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _numberofcolumns = RemoteObject.createImmutable(0);
public static RemoteObject _columnwidths = null;
public static RemoteObject _ccolumncolors = null;
public static RemoteObject _ctextcolors = null;
public static RemoteObject _cheadercolors = null;
public static RemoteObject _cheadertextcolors = null;
public static RemoteObject _datawidths = null;
public static RemoteObject _headerwidths = null;
public static RemoteObject _crowheight = RemoteObject.createImmutable(0);
public static RemoteObject _cheadercolor = RemoteObject.createImmutable(0);
public static RemoteObject _ctablecolor = RemoteObject.createImmutable(0);
public static RemoteObject _ctextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _cheaderheight = RemoteObject.createImmutable(0);
public static RemoteObject _cheadertextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _cautomaticwidths = RemoteObject.createImmutable(false);
public static RemoteObject _ctextsize = RemoteObject.createImmutable(0f);
public static RemoteObject _calignment = RemoteObject.createImmutable(0);
public static RemoteObject _calignments = null;
public static RemoteObject _calignments0 = null;
public static RemoteObject _multialignments = RemoteObject.createImmutable(false);
public static RemoteObject _multitypeface = RemoteObject.createImmutable(false);
public static RemoteObject _ctypeface = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _ctypefaces = null;
public static RemoteObject _clinewidth = RemoteObject.createImmutable(0);
public static RemoteObject _selecteddrawable = null;
public static RemoteObject _drawable1 = null;
public static RemoteObject _drawable2 = null;
public static RemoteObject _selectedcelldrawable = RemoteObject.declareNull("Object");
public static RemoteObject _crowcolor1 = RemoteObject.createImmutable(0);
public static RemoteObject _crowcolor2 = RemoteObject.createImmutable(0);
public static RemoteObject _cselectedrowcolor = RemoteObject.createImmutable(0);
public static RemoteObject _cselectedcellcolor = RemoteObject.createImmutable(0);
public static RemoteObject _csortcolumn = RemoteObject.createImmutable(false);
public static RemoteObject _cusecolumncolors = RemoteObject.createImmutable(false);
public static RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _csingleline = RemoteObject.createImmutable(false);
public static RemoteObject _ismultiselect = RemoteObject.createImmutable(false);
public static RemoteObject _callowselection = RemoteObject.createImmutable(false);
public static RemoteObject _savedwidths = null;
public static RemoteObject _showstatusline = RemoteObject.createImmutable(false);
public static RemoteObject _internalpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _sortingdir = RemoteObject.createImmutable(0);
public static RemoteObject _sortedcol = RemoteObject.createImmutable(0);
public static RemoteObject _sortingview = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _debug_counter = RemoteObject.createImmutable(0L);
public static RemoteObject _enablestatuslineautofill = RemoteObject.createImmutable(false);
public static b4a.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bmp",_ref.getFieldClass("b4a.example.table", false, "_bmp"),"cAlignment",_ref.getFieldClass("b4a.example.table", false, "_calignment"),"cAlignments",_ref.getFieldClass("b4a.example.table", false, "_calignments"),"cAlignments0",_ref.getFieldClass("b4a.example.table", false, "_calignments0"),"Callback",_ref.getFieldClass("b4a.example.table", false, "_callback"),"cAllowSelection",_ref.getFieldClass("b4a.example.table", false, "_callowselection"),"cAutomaticWidths",_ref.getFieldClass("b4a.example.table", false, "_cautomaticwidths"),"cColumnColors",_ref.getFieldClass("b4a.example.table", false, "_ccolumncolors"),"cHeaderColor",_ref.getFieldClass("b4a.example.table", false, "_cheadercolor"),"cHeaderColors",_ref.getFieldClass("b4a.example.table", false, "_cheadercolors"),"cHeaderHeight",_ref.getFieldClass("b4a.example.table", false, "_cheaderheight"),"cHeaderTextColor",_ref.getFieldClass("b4a.example.table", false, "_cheadertextcolor"),"cHeaderTextColors",_ref.getFieldClass("b4a.example.table", false, "_cheadertextcolors"),"cLineWidth",_ref.getFieldClass("b4a.example.table", false, "_clinewidth"),"ColumnWidths",_ref.getFieldClass("b4a.example.table", false, "_columnwidths"),"cRowColor1",_ref.getFieldClass("b4a.example.table", false, "_crowcolor1"),"cRowColor2",_ref.getFieldClass("b4a.example.table", false, "_crowcolor2"),"cRowHeight",_ref.getFieldClass("b4a.example.table", false, "_crowheight"),"cSelectedCellColor",_ref.getFieldClass("b4a.example.table", false, "_cselectedcellcolor"),"cSelectedRowColor",_ref.getFieldClass("b4a.example.table", false, "_cselectedrowcolor"),"cSingleLine",_ref.getFieldClass("b4a.example.table", false, "_csingleline"),"cSortColumn",_ref.getFieldClass("b4a.example.table", false, "_csortcolumn"),"cTableColor",_ref.getFieldClass("b4a.example.table", false, "_ctablecolor"),"cTextColor",_ref.getFieldClass("b4a.example.table", false, "_ctextcolor"),"cTextColors",_ref.getFieldClass("b4a.example.table", false, "_ctextcolors"),"cTextSize",_ref.getFieldClass("b4a.example.table", false, "_ctextsize"),"cTypeFace",_ref.getFieldClass("b4a.example.table", false, "_ctypeface"),"cTypeFaces",_ref.getFieldClass("b4a.example.table", false, "_ctypefaces"),"cUseColumnColors",_ref.getFieldClass("b4a.example.table", false, "_cusecolumncolors"),"cvs",_ref.getFieldClass("b4a.example.table", false, "_cvs"),"Data",_ref.getFieldClass("b4a.example.table", false, "_data"),"DataWidths",_ref.getFieldClass("b4a.example.table", false, "_datawidths"),"debug_counter",_ref.getFieldClass("b4a.example.table", false, "_debug_counter"),"Drawable1",_ref.getFieldClass("b4a.example.table", false, "_drawable1"),"Drawable2",_ref.getFieldClass("b4a.example.table", false, "_drawable2"),"enableStatusLineAutoFill",_ref.getFieldClass("b4a.example.table", false, "_enablestatuslineautofill"),"Event",_ref.getFieldClass("b4a.example.table", false, "_event"),"Header",_ref.getFieldClass("b4a.example.table", false, "_header"),"HeaderNames",_ref.getFieldClass("b4a.example.table", false, "_headernames"),"HeaderWidths",_ref.getFieldClass("b4a.example.table", false, "_headerwidths"),"internalPanel",_ref.getFieldClass("b4a.example.table", false, "_internalpanel"),"IsMultiSelect",_ref.getFieldClass("b4a.example.table", false, "_ismultiselect"),"IsVisible",_ref.getFieldClass("b4a.example.table", false, "_isvisible"),"LabelsCache",_ref.getFieldClass("b4a.example.table", false, "_labelscache"),"lblStatusLine",_ref.getFieldClass("b4a.example.table", false, "_lblstatusline"),"maxVisibleRow",_ref.getFieldClass("b4a.example.table", false, "_maxvisiblerow"),"minVisibleRow",_ref.getFieldClass("b4a.example.table", false, "_minvisiblerow"),"MultiAlignments",_ref.getFieldClass("b4a.example.table", false, "_multialignments"),"MultiTypeFace",_ref.getFieldClass("b4a.example.table", false, "_multitypeface"),"NumberOfColumns",_ref.getFieldClass("b4a.example.table", false, "_numberofcolumns"),"pnlTable",_ref.getFieldClass("b4a.example.table", false, "_pnltable"),"SavedWidths",_ref.getFieldClass("b4a.example.table", false, "_savedwidths"),"SelectedCellDrawable",_ref.getFieldClass("b4a.example.table", false, "_selectedcelldrawable"),"SelectedCol",_ref.getFieldClass("b4a.example.table", false, "_selectedcol"),"SelectedDrawable",_ref.getFieldClass("b4a.example.table", false, "_selecteddrawable"),"SelectedRows",_ref.getFieldClass("b4a.example.table", false, "_selectedrows"),"showStatusLine",_ref.getFieldClass("b4a.example.table", false, "_showstatusline"),"sortedCol",_ref.getFieldClass("b4a.example.table", false, "_sortedcol"),"sortingDir",_ref.getFieldClass("b4a.example.table", false, "_sortingdir"),"sortingView",_ref.getFieldClass("b4a.example.table", false, "_sortingview"),"StringUtils1",_ref.getFieldClass("b4a.example.table", false, "_stringutils1"),"SV",_ref.getFieldClass("b4a.example.table", false, "_sv"),"visibleRows",_ref.getFieldClass("b4a.example.table", false, "_visiblerows")};
}
}