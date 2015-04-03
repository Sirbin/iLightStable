package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class table extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.table");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "b4a.example.table",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.StringUtils _stringutils1 = null;
public flm.b4a.scrollview2d.ScrollView2DWrapper _sv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltable = null;
public anywheresoftware.b4a.objects.PanelWrapper _header = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstatusline = null;
public Object _callback = null;
public String _event = "";
public anywheresoftware.b4a.objects.collections.List _headernames = null;
public anywheresoftware.b4a.objects.collections.List _selectedrows = null;
public int _selectedcol = 0;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.List _labelscache = null;
public int _minvisiblerow = 0;
public int _maxvisiblerow = 0;
public boolean _isvisible = false;
public anywheresoftware.b4a.objects.collections.Map _visiblerows = null;
public int _numberofcolumns = 0;
public int[] _columnwidths = null;
public int[] _ccolumncolors = null;
public int[] _ctextcolors = null;
public int[] _cheadercolors = null;
public int[] _cheadertextcolors = null;
public int[] _datawidths = null;
public int[] _headerwidths = null;
public int _crowheight = 0;
public int _cheadercolor = 0;
public int _ctablecolor = 0;
public int _ctextcolor = 0;
public int _cheaderheight = 0;
public int _cheadertextcolor = 0;
public boolean _cautomaticwidths = false;
public float _ctextsize = 0f;
public int _calignment = 0;
public int[] _calignments = null;
public int[] _calignments0 = null;
public boolean _multialignments = false;
public boolean _multitypeface = false;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _ctypeface = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _ctypefaces = null;
public int _clinewidth = 0;
public Object[] _selecteddrawable = null;
public Object[] _drawable1 = null;
public Object[] _drawable2 = null;
public Object _selectedcelldrawable = null;
public int _crowcolor1 = 0;
public int _crowcolor2 = 0;
public int _cselectedrowcolor = 0;
public int _cselectedcellcolor = 0;
public boolean _csortcolumn = false;
public boolean _cusecolumncolors = false;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public boolean _csingleline = false;
public boolean _ismultiselect = false;
public boolean _callowselection = false;
public int[] _savedwidths = null;
public boolean _showstatusline = false;
public anywheresoftware.b4a.objects.PanelWrapper _internalpanel = null;
public int _sortingdir = 0;
public int _sortedcol = 0;
public anywheresoftware.b4a.objects.PanelWrapper _sortingview = null;
public long _debug_counter = 0L;
public boolean _enablestatuslineautofill = false;
public b4a.example.main _main = null;
public b4a.example.sensortable _sensortable = null;
public b4a.example.config _config = null;
public b4a.example.size _size = null;
public b4a.example.cancellato _cancellato = null;
public b4a.example.configpagemod _configpagemod = null;
public b4a.example.configurationwizardmod _configurationwizardmod = null;
public b4a.example.policiesmode _policiesmode = null;
  public Object[] GetGlobals() {
		return new Object[] {"bmp",_bmp,"cAlignment",_calignment,"cAlignments",_calignments,"cAlignments0",_calignments0,"Callback",_callback,"cAllowSelection",_callowselection,"cancellato",Debug.moduleToString(b4a.example.cancellato.class),"cAutomaticWidths",_cautomaticwidths,"cColumnColors",_ccolumncolors,"cHeaderColor",_cheadercolor,"cHeaderColors",_cheadercolors,"cHeaderHeight",_cheaderheight,"cHeaderTextColor",_cheadertextcolor,"cHeaderTextColors",_cheadertextcolors,"cLineWidth",_clinewidth,"ColumnWidths",_columnwidths,"config",Debug.moduleToString(b4a.example.config.class),"ConfigPageMod",Debug.moduleToString(b4a.example.configpagemod.class),"ConfigurationWizardMod",Debug.moduleToString(b4a.example.configurationwizardmod.class),"cRowColor1",_crowcolor1,"cRowColor2",_crowcolor2,"cRowHeight",_crowheight,"cSelectedCellColor",_cselectedcellcolor,"cSelectedRowColor",_cselectedrowcolor,"cSingleLine",_csingleline,"cSortColumn",_csortcolumn,"cTableColor",_ctablecolor,"cTextColor",_ctextcolor,"cTextColors",_ctextcolors,"cTextSize",_ctextsize,"cTypeFace",_ctypeface,"cTypeFaces",_ctypefaces,"cUseColumnColors",_cusecolumncolors,"cvs",_cvs,"Data",_data,"DataWidths",_datawidths,"debug_counter",_debug_counter,"Drawable1",_drawable1,"Drawable2",_drawable2,"enableStatusLineAutoFill",_enablestatuslineautofill,"Event",_event,"Header",_header,"HeaderNames",_headernames,"HeaderWidths",_headerwidths,"internalPanel",_internalpanel,"IsMultiSelect",_ismultiselect,"IsVisible",_isvisible,"LabelsCache",_labelscache,"lblStatusLine",_lblstatusline,"Main",Debug.moduleToString(b4a.example.main.class),"maxVisibleRow",_maxvisiblerow,"minVisibleRow",_minvisiblerow,"MultiAlignments",_multialignments,"MultiTypeFace",_multitypeface,"NumberOfColumns",_numberofcolumns,"pnlTable",_pnltable,"PoliciesMode",Debug.moduleToString(b4a.example.policiesmode.class),"SavedWidths",_savedwidths,"SelectedCellDrawable",_selectedcelldrawable,"SelectedCol",_selectedcol,"SelectedDrawable",_selecteddrawable,"SelectedRows",_selectedrows,"SensorTable",Debug.moduleToString(b4a.example.sensortable.class),"showStatusLine",_showstatusline,"Size",Debug.moduleToString(b4a.example.size.class),"sortedCol",_sortedcol,"sortingDir",_sortingdir,"sortingView",_sortingview,"StringUtils1",_stringutils1,"SV",_sv,"visibleRows",_visiblerows};
}
public static class _rowcol{
public boolean IsInitialized;
public int row;
public int Col;
public void Initialize() {
IsInitialized = true;
row = 0;
Col = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addrow(String[] _values) throws Exception{
try {
		Debug.PushSubsStack("AddRow (table) ","table",2,ba,this,419);
int _lastrow = 0;
boolean _changed = false;
int _extrawidth = 0;
int _width = 0;
int _i = 0;
Debug.locals.put("Values", _values);
 BA.debugLineNum = 419;BA.debugLine="Public Sub AddRow(Values() As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 420;BA.debugLine="If Values.Length <> NumberOfColumns Then";
Debug.ShouldStop(8);
if (_values.length!=_numberofcolumns) { 
 BA.debugLineNum = 421;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
Debug.ShouldStop(16);
__c.Log("Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(_numberofcolumns));
 BA.debugLineNum = 422;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return "";
 };
 BA.debugLineNum = 424;BA.debugLine="Data.Add(Values)";
Debug.ShouldStop(128);
_data.Add((Object)(_values));
 BA.debugLineNum = 425;BA.debugLine="Dim lastRow As Int";
Debug.ShouldStop(256);
_lastrow = 0;Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 426;BA.debugLine="lastRow = Data.Size - 1";
Debug.ShouldStop(512);
_lastrow = (int) (_data.getSize()-1);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 428;BA.debugLine="If cAutomaticWidths = True Then";
Debug.ShouldStop(2048);
if (_cautomaticwidths==__c.True) { 
 BA.debugLineNum = 429;BA.debugLine="Dim changed = False As Boolean";
Debug.ShouldStop(4096);
_changed = __c.False;Debug.locals.put("changed", _changed);Debug.locals.put("changed", _changed);
 BA.debugLineNum = 430;BA.debugLine="Dim ExtraWidth, width As Int";
Debug.ShouldStop(8192);
_extrawidth = 0;Debug.locals.put("ExtraWidth", _extrawidth);
_width = 0;Debug.locals.put("width", _width);
 BA.debugLineNum = 431;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
Debug.ShouldStop(16384);
_extrawidth = (int) (__c.DipToCurrent((int) (8))+_clinewidth);Debug.locals.put("ExtraWidth", _extrawidth);
 BA.debugLineNum = 432;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(32768);
{
final int step261 = 1;
final int limit261 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step261 > 0 && _i <= limit261) || (step261 < 0 && _i >= limit261); _i = ((int)(0 + _i + step261))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 433;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(65536);
if (_multitypeface==__c.False) { 
 BA.debugLineNum = 435;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
Debug.ShouldStop(262144);
_width = (int) (_cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth);Debug.locals.put("width", _width);
 }else {
 BA.debugLineNum = 437;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
Debug.ShouldStop(1048576);
_width = (int) (_cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(_ctypefaces[_i].getObject()),_ctextsize)+_extrawidth);Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 439;BA.debugLine="If ColumnWidths(i) < width Then";
Debug.ShouldStop(4194304);
if (_columnwidths[_i]<_width) { 
 BA.debugLineNum = 440;BA.debugLine="ColumnWidths(i) = width";
Debug.ShouldStop(8388608);
_columnwidths[_i] = _width;
 BA.debugLineNum = 441;BA.debugLine="SavedWidths(i) = width";
Debug.ShouldStop(16777216);
_savedwidths[_i] = _width;
 BA.debugLineNum = 442;BA.debugLine="HeaderWidths(i) = width";
Debug.ShouldStop(33554432);
_headerwidths[_i] = _width;
 BA.debugLineNum = 443;BA.debugLine="DataWidths(i) = width";
Debug.ShouldStop(67108864);
_datawidths[_i] = _width;
 BA.debugLineNum = 444;BA.debugLine="changed = True";
Debug.ShouldStop(134217728);
_changed = __c.True;Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 447;BA.debugLine="If changed = True Then";
Debug.ShouldStop(1073741824);
if (_changed==__c.True) { 
 BA.debugLineNum = 448;BA.debugLine="refreshTable";
Debug.ShouldStop(-2147483648);
_refreshtable();
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 453;BA.debugLine="If lastRow < (SV.VerticalScrollPosition + SV.Heig";
Debug.ShouldStop(16);
if (_lastrow<(_sv.getVerticalScrollPosition()+_sv.getHeight())/(double)_crowheight+1) { 
 BA.debugLineNum = 454;BA.debugLine="ShowRow(lastRow)";
Debug.ShouldStop(32);
_showrow(_lastrow);
 };
 BA.debugLineNum = 456;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(128);
_sv.getPanel().setHeight((int) (_data.getSize()*_crowheight));
 BA.debugLineNum = 457;BA.debugLine="updateIPLocation";
Debug.ShouldStop(256);
_updateiplocation();
 BA.debugLineNum = 458;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusL";
Debug.ShouldStop(512);
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _addrowautomaticwidth(String[] _values) throws Exception{
try {
		Debug.PushSubsStack("AddRowAutomaticWidth (table) ","table",2,ba,this,463);
int _lastrow = 0;
boolean _changed = false;
int _extrawidth = 0;
int _width = 0;
int _i = 0;
Debug.locals.put("Values", _values);
 BA.debugLineNum = 463;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 464;BA.debugLine="If Values.Length <> NumberOfColumns Then";
Debug.ShouldStop(32768);
if (_values.length!=_numberofcolumns) { 
 BA.debugLineNum = 465;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
Debug.ShouldStop(65536);
__c.Log("Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(_numberofcolumns));
 BA.debugLineNum = 466;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return "";
 };
 BA.debugLineNum = 468;BA.debugLine="Data.Add(Values)";
Debug.ShouldStop(524288);
_data.Add((Object)(_values));
 BA.debugLineNum = 469;BA.debugLine="Dim lastRow As Int";
Debug.ShouldStop(1048576);
_lastrow = 0;Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 470;BA.debugLine="lastRow = Data.Size - 1";
Debug.ShouldStop(2097152);
_lastrow = (int) (_data.getSize()-1);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 472;BA.debugLine="Dim changed = False As Boolean";
Debug.ShouldStop(8388608);
_changed = __c.False;Debug.locals.put("changed", _changed);Debug.locals.put("changed", _changed);
 BA.debugLineNum = 473;BA.debugLine="Dim ExtraWidth, width As Int";
Debug.ShouldStop(16777216);
_extrawidth = 0;Debug.locals.put("ExtraWidth", _extrawidth);
_width = 0;Debug.locals.put("width", _width);
 BA.debugLineNum = 474;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
Debug.ShouldStop(33554432);
_extrawidth = (int) (__c.DipToCurrent((int) (8))+_clinewidth);Debug.locals.put("ExtraWidth", _extrawidth);
 BA.debugLineNum = 475;BA.debugLine="For I = 0 To NumberOfColumns - 1";
Debug.ShouldStop(67108864);
{
final int step297 = 1;
final int limit297 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step297 > 0 && _i <= limit297) || (step297 < 0 && _i >= limit297); _i = ((int)(0 + _i + step297))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 476;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(134217728);
if (_multitypeface==__c.False) { 
 BA.debugLineNum = 478;BA.debugLine="width = cvs.MeasureStringWidth(Values(I), cType";
Debug.ShouldStop(536870912);
_width = (int) (_cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth);Debug.locals.put("width", _width);
 }else {
 BA.debugLineNum = 480;BA.debugLine="width = cvs.MeasureStringWidth(Values(I), cType";
Debug.ShouldStop(-2147483648);
_width = (int) (_cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(_ctypefaces[_i].getObject()),_ctextsize)+_extrawidth);Debug.locals.put("width", _width);
 };
 BA.debugLineNum = 482;BA.debugLine="If ColumnWidths(I) < width Then";
Debug.ShouldStop(2);
if (_columnwidths[_i]<_width) { 
 BA.debugLineNum = 483;BA.debugLine="ColumnWidths(I) = width";
Debug.ShouldStop(4);
_columnwidths[_i] = _width;
 BA.debugLineNum = 484;BA.debugLine="SavedWidths(I) = width";
Debug.ShouldStop(8);
_savedwidths[_i] = _width;
 BA.debugLineNum = 485;BA.debugLine="HeaderWidths(I) = width";
Debug.ShouldStop(16);
_headerwidths[_i] = _width;
 BA.debugLineNum = 486;BA.debugLine="DataWidths(I) = width";
Debug.ShouldStop(32);
_datawidths[_i] = _width;
 BA.debugLineNum = 487;BA.debugLine="changed = True";
Debug.ShouldStop(64);
_changed = __c.True;Debug.locals.put("changed", _changed);
 };
 BA.debugLineNum = 490;BA.debugLine="If changed = True Then";
Debug.ShouldStop(512);
if (_changed==__c.True) { 
 BA.debugLineNum = 491;BA.debugLine="refreshTable";
Debug.ShouldStop(1024);
_refreshtable();
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 495;BA.debugLine="If lastRow < (SV.VerticalScrollPosition + SV.Heig";
Debug.ShouldStop(16384);
if (_lastrow<(_sv.getVerticalScrollPosition()+_sv.getHeight())/(double)_crowheight+1) { 
 BA.debugLineNum = 496;BA.debugLine="ShowRow(lastRow)";
Debug.ShouldStop(32768);
_showrow(_lastrow);
 };
 BA.debugLineNum = 498;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(131072);
_sv.getPanel().setHeight((int) (_data.getSize()*_crowheight));
 BA.debugLineNum = 499;BA.debugLine="updateIPLocation";
Debug.ShouldStop(262144);
_updateiplocation();
 BA.debugLineNum = 500;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusL";
Debug.ShouldStop(524288);
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _addtoactivity(anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
try {
		Debug.PushSubsStack("AddToActivity (table) ","table",2,ba,this,377);
int _i = 0;
Debug.locals.put("Act", _act);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 377;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 378;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(33554432);
_innerclearall(_numberofcolumns);
 BA.debugLineNum = 380;BA.debugLine="SV.Panel.Color = cTableColor";
Debug.ShouldStop(134217728);
_sv.getPanel().setColor(_ctablecolor);
 BA.debugLineNum = 381;BA.debugLine="IsVisible = True";
Debug.ShouldStop(268435456);
_isvisible = __c.True;
 BA.debugLineNum = 382;BA.debugLine="Header.Initialize(\"\")";
Debug.ShouldStop(536870912);
_header.Initialize(ba,"");
 BA.debugLineNum = 383;BA.debugLine="pnlTable.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_pnltable.Initialize(ba,"");
 BA.debugLineNum = 384;BA.debugLine="Header.Color = cTableColor";
Debug.ShouldStop(-2147483648);
_header.setColor(_ctablecolor);
 BA.debugLineNum = 385;BA.debugLine="Act.AddView(pnlTable, Left, Top , Width, Height)";
Debug.ShouldStop(1);
_act.AddView((android.view.View)(_pnltable.getObject()),_left,_top,_width,_height);
 BA.debugLineNum = 386;BA.debugLine="pnlTable.AddView(Header, 0, 0 , Width, cHeaderHei";
Debug.ShouldStop(2);
_pnltable.AddView((android.view.View)(_header.getObject()),(int) (0),(int) (0),_width,_cheaderheight);
 BA.debugLineNum = 389;BA.debugLine="lblStatusLine.Initialize(\"\")";
Debug.ShouldStop(16);
_lblstatusline.Initialize(ba,"");
 BA.debugLineNum = 390;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it";
Debug.ShouldStop(32);
_lblstatusline.setColor(__c.Colors.Transparent);
 BA.debugLineNum = 391;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO un";
Debug.ShouldStop(64);
_internalpanel.setColor(__c.Colors.Transparent);
 BA.debugLineNum = 392;BA.debugLine="If (showStatusLine = True) Then";
Debug.ShouldStop(128);
if ((_showstatusline==__c.True)) { 
 BA.debugLineNum = 393;BA.debugLine="pnlTable.AddView(SV, 0, Header.Height, Width, He";
Debug.ShouldStop(256);
_pnltable.AddView((android.view.View)(_sv.getObject()),(int) (0),_header.getHeight(),_width,(int) (_height-_header.getHeight()-_crowheight));
 BA.debugLineNum = 394;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV.Top + SV.He";
Debug.ShouldStop(512);
_pnltable.AddView((android.view.View)(_lblstatusline.getObject()),(int) (0),(int) (_sv.getTop()+_sv.getHeight()),_width,_crowheight);
 }else {
 BA.debugLineNum = 396;BA.debugLine="pnlTable.AddView(SV, 0, Header.Height, Width, He";
Debug.ShouldStop(2048);
_pnltable.AddView((android.view.View)(_sv.getObject()),(int) (0),_header.getHeight(),_width,(int) (_height-_header.getHeight()));
 BA.debugLineNum = 397;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV.Top + SV.He";
Debug.ShouldStop(4096);
_pnltable.AddView((android.view.View)(_lblstatusline.getObject()),(int) (0),(int) (_sv.getTop()+_sv.getHeight()),(int) (0),(int) (0));
 };
 BA.debugLineNum = 399;BA.debugLine="pnlTable.AddView(internalPanel,0,0,Width,0)";
Debug.ShouldStop(16384);
_pnltable.AddView((android.view.View)(_internalpanel.getObject()),(int) (0),(int) (0),_width,(int) (0));
 BA.debugLineNum = 400;BA.debugLine="updateIPLocation";
Debug.ShouldStop(32768);
_updateiplocation();
 BA.debugLineNum = 402;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
Debug.ShouldStop(131072);
_columnwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 403;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
Debug.ShouldStop(262144);
_headerwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 404;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
Debug.ShouldStop(524288);
_datawidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 405;BA.debugLine="Dim SavedWidths(NumberOfColumns) As Int";
Debug.ShouldStop(1048576);
_savedwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 406;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(2097152);
{
final int step240 = 1;
final int limit240 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step240 > 0 && _i <= limit240) || (step240 < 0 && _i >= limit240); _i = ((int)(0 + _i + step240))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 407;BA.debugLine="ColumnWidths(i) = SV.Width / NumberOfColumns";
Debug.ShouldStop(4194304);
_columnwidths[_i] = (int) (_sv.getWidth()/(double)_numberofcolumns);
 BA.debugLineNum = 408;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(8388608);
_headerwidths[_i] = _columnwidths[_i];
 BA.debugLineNum = 409;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(16777216);
_datawidths[_i] = _columnwidths[_i];
 BA.debugLineNum = 410;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(33554432);
_savedwidths[_i] = _columnwidths[_i];
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 413;BA.debugLine="SV_ScrollChanged(0, 0)";
Debug.ShouldStop(268435456);
_sv_scrollchanged((int) (0),(int) (0));
 BA.debugLineNum = 414;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusL";
Debug.ShouldStop(536870912);
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _addtoview(anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
try {
		Debug.PushSubsStack("AddToView (table) ","table",2,ba,this,373);
Debug.locals.put("v", _v);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 373;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 374;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
Debug.ShouldStop(2097152);
_addtoactivity((anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_v.getObject())),_left,_top,_width,_height);
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _cell_click() throws Exception{
try {
		Debug.PushSubsStack("Cell_Click (table) ","table",2,ba,this,700);
b4a.example.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 BA.debugLineNum = 700;BA.debugLine="Private Sub Cell_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 701;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(268435456);
_rc = new b4a.example.table._rowcol();Debug.locals.put("rc", _rc);
 BA.debugLineNum = 702;BA.debugLine="Dim L As Label";
Debug.ShouldStop(536870912);
_l = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("L", _l);
 BA.debugLineNum = 703;BA.debugLine="L = Sender";
Debug.ShouldStop(1073741824);
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
 BA.debugLineNum = 704;BA.debugLine="rc = L.Tag";
Debug.ShouldStop(-2147483648);
_rc = (b4a.example.table._rowcol)(_l.getTag());Debug.locals.put("rc", _rc);
 BA.debugLineNum = 706;BA.debugLine="SelectRow(rc)";
Debug.ShouldStop(2);
_selectrow(_rc);
 BA.debugLineNum = 707;BA.debugLine="If SubExists(Callback, Event & \"_CellClick\") Then";
Debug.ShouldStop(4);
if (__c.SubExists(ba,_callback,_event+"_CellClick")) { 
 BA.debugLineNum = 708;BA.debugLine="CallSub3(Callback, Event & \"_CellClick\", rc.Col,";
Debug.ShouldStop(8);
__c.CallSubNew3(ba,_callback,_event+"_CellClick",(Object)(_rc.Col),(Object)(_rc.row));
 };
 BA.debugLineNum = 710;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _cell_longclick() throws Exception{
try {
		Debug.PushSubsStack("Cell_LongClick (table) ","table",2,ba,this,677);
b4a.example.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 BA.debugLineNum = 677;BA.debugLine="Private Sub Cell_LongClick";
Debug.ShouldStop(16);
 BA.debugLineNum = 679;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(64);
_rc = new b4a.example.table._rowcol();Debug.locals.put("rc", _rc);
 BA.debugLineNum = 680;BA.debugLine="Dim L As Label";
Debug.ShouldStop(128);
_l = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("L", _l);
 BA.debugLineNum = 681;BA.debugLine="L = Sender";
Debug.ShouldStop(256);
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
 BA.debugLineNum = 682;BA.debugLine="rc = L.Tag";
Debug.ShouldStop(512);
_rc = (b4a.example.table._rowcol)(_l.getTag());Debug.locals.put("rc", _rc);
 BA.debugLineNum = 684;BA.debugLine="If SubExists(Callback, Event & \"_CellLongClick\")";
Debug.ShouldStop(2048);
if (__c.SubExists(ba,_callback,_event+"_CellLongClick")) { 
 BA.debugLineNum = 685;BA.debugLine="CallSub3(Callback, Event & \"_CellLongClick\", rc.";
Debug.ShouldStop(4096);
__c.CallSubNew3(ba,_callback,_event+"_CellLongClick",(Object)(_rc.Col),(Object)(_rc.row));
 };
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 107;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 108;BA.debugLine="Private SV As ScrollView2D";
_sv = new flm.b4a.scrollview2d.ScrollView2DWrapper();
 //BA.debugLineNum = 109;BA.debugLine="Private pnlTable As Panel";
_pnltable = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 110;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 111;BA.debugLine="Private lblStatusLine As Label";
_lblstatusline = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 112;BA.debugLine="Private Callback As Object";
_callback = new Object();
 //BA.debugLineNum = 113;BA.debugLine="Private Event As String";
_event = "";
 //BA.debugLineNum = 114;BA.debugLine="Public HeaderNames As List";
_headernames = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 115;BA.debugLine="Public SelectedRows As List ' selected rows ' con";
_selectedrows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 116;BA.debugLine="Private SelectedCol As Int";
_selectedcol = 0;
 //BA.debugLineNum = 117;BA.debugLine="Private Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 118;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 119;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
 //BA.debugLineNum = 120;BA.debugLine="Private IsVisible As Boolean";
_isvisible = false;
 //BA.debugLineNum = 121;BA.debugLine="Public visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 122;BA.debugLine="Private NumberOfColumns, ColumnWidths(), cColumnC";
_numberofcolumns = 0;
_columnwidths = new int[(int) (0)];
;
_ccolumncolors = new int[(int) (0)];
;
_ctextcolors = new int[(int) (0)];
;
_cheadercolors = new int[(int) (0)];
;
_cheadertextcolors = new int[(int) (0)];
;
_datawidths = new int[(int) (0)];
;
_headerwidths = new int[(int) (0)];
;
 //BA.debugLineNum = 123;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cT";
_crowheight = 0;
_cheadercolor = 0;
_ctablecolor = 0;
_ctextcolor = 0;
_cheaderheight = 0;
_cheadertextcolor = 0;
 //BA.debugLineNum = 124;BA.debugLine="Private cAutomaticWidths = False As Boolean";
_cautomaticwidths = __c.False;
 //BA.debugLineNum = 125;BA.debugLine="Private cTextSize As Float";
_ctextsize = 0f;
 //BA.debugLineNum = 126;BA.debugLine="Type RowCol (row As Int, Col As Int)";
;
 //BA.debugLineNum = 127;BA.debugLine="Private cAlignment As Int";
_calignment = 0;
 //BA.debugLineNum = 128;BA.debugLine="Private cAlignments() As Int";
_calignments = new int[(int) (0)];
;
 //BA.debugLineNum = 129;BA.debugLine="Private cAlignments0() As Int";
_calignments0 = new int[(int) (0)];
;
 //BA.debugLineNum = 130;BA.debugLine="Private MultiAlignments = False As Boolean";
_multialignments = __c.False;
 //BA.debugLineNum = 131;BA.debugLine="Private MultiTypeFace = False As Boolean";
_multitypeface = __c.False;
 //BA.debugLineNum = 132;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
_ctypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_ctypeface.setObject((android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 133;BA.debugLine="Private cTypeFaces() As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
 //BA.debugLineNum = 134;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
_clinewidth = (int) (__c.Max(1,__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 135;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable";
_selecteddrawable = new Object[(int) (0)];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
_drawable1 = new Object[(int) (0)];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
_drawable2 = new Object[(int) (0)];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
 //BA.debugLineNum = 136;BA.debugLine="Private SelectedCellDrawable As Object";
_selectedcelldrawable = new Object();
 //BA.debugLineNum = 137;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor";
_crowcolor1 = 0;
_crowcolor2 = 0;
_cselectedrowcolor = 0;
_cselectedcellcolor = 0;
 //BA.debugLineNum = 138;BA.debugLine="Private cSortColumn = True As Boolean";
_csortcolumn = __c.True;
 //BA.debugLineNum = 139;BA.debugLine="Private cUseColumnColors = False As Boolean";
_cusecolumncolors = __c.False;
 //BA.debugLineNum = 142;BA.debugLine="Private bmp As Bitmap		' used for the canvas belo";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 143;BA.debugLine="Private cvs As Canvas		' used to measure string w";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 146;BA.debugLine="cHeaderColor = Colors.Gray";
_cheadercolor = __c.Colors.Gray;
 //BA.debugLineNum = 147;BA.debugLine="cTableColor = Colors.LightGray";
_ctablecolor = __c.Colors.LightGray;
 //BA.debugLineNum = 148;BA.debugLine="cTextColor = Colors.Black";
_ctextcolor = __c.Colors.Black;
 //BA.debugLineNum = 149;BA.debugLine="cHeaderTextColor = Colors.White";
_cheadertextcolor = __c.Colors.White;
 //BA.debugLineNum = 150;BA.debugLine="cTextSize = 14";
_ctextsize = (float) (14);
 //BA.debugLineNum = 151;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LE";
_calignment = __c.Gravity.CENTER;
 //BA.debugLineNum = 152;BA.debugLine="cRowColor1 = Colors.White";
_crowcolor1 = __c.Colors.White;
 //BA.debugLineNum = 153;BA.debugLine="cRowColor2 = 0xFF98F5FF";
_crowcolor2 = (int) (0xff98f5ff);
 //BA.debugLineNum = 154;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
_cselectedrowcolor = (int) (0xff007fff);
 //BA.debugLineNum = 155;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
_cselectedcellcolor = (int) (0xfffc8eac);
 //BA.debugLineNum = 156;BA.debugLine="cRowHeight = 40dip";
_crowheight = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 157;BA.debugLine="cHeaderHeight = cRowHeight";
_cheaderheight = _crowheight;
 //BA.debugLineNum = 159;BA.debugLine="Private cSingleLine = True As Boolean		' does a l";
_csingleline = __c.True;
 //BA.debugLineNum = 161;BA.debugLine="Private IsMultiSelect As Boolean = False";
_ismultiselect = __c.False;
 //BA.debugLineNum = 162;BA.debugLine="Private cAllowSelection = True As Boolean";
_callowselection = __c.True;
 //BA.debugLineNum = 163;BA.debugLine="Private SavedWidths() As Int' to keep the user se";
_savedwidths = new int[(int) (0)];
;
 //BA.debugLineNum = 164;BA.debugLine="Private showStatusLine As Boolean =True";
_showstatusline = __c.True;
 //BA.debugLineNum = 166;BA.debugLine="Private internalPanel As Panel";
_internalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 168;BA.debugLine="Private sortingDir As Int = 0 ' -1,0,1 as acc, un";
_sortingdir = (int) (0);
 //BA.debugLineNum = 169;BA.debugLine="Private sortedCol As Int = -1' hold the sorted co";
_sortedcol = (int) (-1);
 //BA.debugLineNum = 170;BA.debugLine="Private sortingView As Panel";
_sortingview = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 172;BA.debugLine="Dim debug_counter As Long";
_debug_counter = 0L;
 //BA.debugLineNum = 173;BA.debugLine="Private enableStatusLineAutoFill As Boolean = Tru";
_enablestatuslineautofill = __c.True;
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _clearall() throws Exception{
try {
		Debug.PushSubsStack("ClearAll (table) ","table",2,ba,this,210);
 BA.debugLineNum = 210;BA.debugLine="Public Sub ClearAll";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(262144);
_innerclearall(_numberofcolumns);
 BA.debugLineNum = 212;BA.debugLine="updateIPLocation";
Debug.ShouldStop(524288);
_updateiplocation();
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _clearselection() throws Exception{
try {
		Debug.PushSubsStack("clearSelection (table) ","table",2,ba,this,1048);
 BA.debugLineNum = 1048;BA.debugLine="Public Sub clearSelection";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1050;BA.debugLine="SelectedRows.Clear";
Debug.ShouldStop(33554432);
_selectedrows.Clear();
 BA.debugLineNum = 1051;BA.debugLine="refreshTable";
Debug.ShouldStop(67108864);
_refreshtable();
 BA.debugLineNum = 1052;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.objects.LabelWrapper[]  _createnewlabels() throws Exception{
try {
		Debug.PushSubsStack("CreateNewLabels (table) ","table",2,ba,this,576);
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.example.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.agraham.reflection.Reflection _ref = null;
 BA.debugLineNum = 576;BA.debugLine="Private Sub CreateNewLabels As Label()";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 577;BA.debugLine="Dim lbls(NumberOfColumns) As Label";
Debug.ShouldStop(1);
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[_numberofcolumns];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 578;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(2);
{
final int step386 = 1;
final int limit386 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step386 > 0 && _i <= limit386) || (step386 < 0 && _i >= limit386); _i = ((int)(0 + _i + step386))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 579;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(4);
_rc = new b4a.example.table._rowcol();Debug.locals.put("rc", _rc);
 BA.debugLineNum = 580;BA.debugLine="rc.Col = i";
Debug.ShouldStop(8);
_rc.Col = _i;Debug.locals.put("rc", _rc);
 BA.debugLineNum = 581;BA.debugLine="Dim L As Label";
Debug.ShouldStop(16);
_l = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("L", _l);
 BA.debugLineNum = 582;BA.debugLine="L.Initialize(\"Cell\")";
Debug.ShouldStop(32);
_l.Initialize(ba,"Cell");
 BA.debugLineNum = 583;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(64);
if (_multialignments==__c.False) { 
 BA.debugLineNum = 584;BA.debugLine="L.Gravity = cAlignment";
Debug.ShouldStop(128);
_l.setGravity(_calignment);
 }else {
 BA.debugLineNum = 586;BA.debugLine="L.Gravity = cAlignments(i)";
Debug.ShouldStop(512);
_l.setGravity(_calignments[_i]);
 };
 BA.debugLineNum = 588;BA.debugLine="L.TextSize = cTextSize";
Debug.ShouldStop(2048);
_l.setTextSize(_ctextsize);
 BA.debugLineNum = 590;BA.debugLine="If cUseColumnColors = False Then";
Debug.ShouldStop(8192);
if (_cusecolumncolors==__c.False) { 
 BA.debugLineNum = 591;BA.debugLine="L.TextColor = cTextColor";
Debug.ShouldStop(16384);
_l.setTextColor(_ctextcolor);
 }else {
 BA.debugLineNum = 593;BA.debugLine="L.TextColor = cTextColors(i)";
Debug.ShouldStop(65536);
_l.setTextColor(_ctextcolors[_i]);
 };
 BA.debugLineNum = 596;BA.debugLine="If MultiTypeFace = False Then";
Debug.ShouldStop(524288);
if (_multitypeface==__c.False) { 
 BA.debugLineNum = 597;BA.debugLine="L.Typeface = cTypeFace";
Debug.ShouldStop(1048576);
_l.setTypeface((android.graphics.Typeface)(_ctypeface.getObject()));
 }else {
 BA.debugLineNum = 599;BA.debugLine="L.Typeface = cTypeFaces(i)";
Debug.ShouldStop(4194304);
_l.setTypeface((android.graphics.Typeface)(_ctypefaces[_i].getObject()));
 };
 BA.debugLineNum = 602;BA.debugLine="If cSingleLine Then";
Debug.ShouldStop(33554432);
if (_csingleline) { 
 BA.debugLineNum = 603;BA.debugLine="Dim ref As Reflector";
Debug.ShouldStop(67108864);
_ref = new anywheresoftware.b4a.agraham.reflection.Reflection();Debug.locals.put("ref", _ref);
 BA.debugLineNum = 604;BA.debugLine="ref.Target = L";
Debug.ShouldStop(134217728);
_ref.Target = (Object)(_l.getObject());Debug.locals.put("ref", _ref);
 BA.debugLineNum = 605;BA.debugLine="ref.RunMethod2(\"setSingleLine\", True, \"java.lan";
Debug.ShouldStop(268435456);
_ref.RunMethod2("setSingleLine",BA.ObjectToString(__c.True),"java.lang.boolean");
 };
 BA.debugLineNum = 607;BA.debugLine="L.Tag = rc";
Debug.ShouldStop(1073741824);
_l.setTag((Object)(_rc));
 BA.debugLineNum = 608;BA.debugLine="lbls(i) = L";
Debug.ShouldStop(-2147483648);
_lbls[_i] = _l;Debug.locals.put("lbls", _lbls);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 610;BA.debugLine="Return lbls";
Debug.ShouldStop(2);
if (true) return _lbls;
 BA.debugLineNum = 611;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _getallowselection() throws Exception{
try {
		Debug.PushSubsStack("getAllowSelection (table) ","table",2,ba,this,1076);
 BA.debugLineNum = 1076;BA.debugLine="Public Sub getAllowSelection As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1077;BA.debugLine="Return cAllowSelection";
Debug.ShouldStop(1048576);
if (true) return _callowselection;
 BA.debugLineNum = 1078;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getcellalignment() throws Exception{
try {
		Debug.PushSubsStack("getCellAlignment (table) ","table",2,ba,this,1442);
 BA.debugLineNum = 1442;BA.debugLine="Public Sub getCellAlignment As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 1443;BA.debugLine="Return cAlignment";
Debug.ShouldStop(4);
if (true) return _calignment;
 BA.debugLineNum = 1444;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int[]  _getcolumncolors() throws Exception{
try {
		Debug.PushSubsStack("GetColumnColors (table) ","table",2,ba,this,1722);
 BA.debugLineNum = 1722;BA.debugLine="Public Sub GetColumnColors As Int()";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1723;BA.debugLine="Return cColumnColors";
Debug.ShouldStop(67108864);
if (true) return _ccolumncolors;
 BA.debugLineNum = 1724;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int[]  _getcolumnwidths() throws Exception{
try {
		Debug.PushSubsStack("GetColumnWidths (table) ","table",2,ba,this,262);
 BA.debugLineNum = 262;BA.debugLine="Public Sub GetColumnWidths As Int()";
Debug.ShouldStop(32);
 BA.debugLineNum = 263;BA.debugLine="Return SavedWidths";
Debug.ShouldStop(64);
if (true) return _savedwidths;
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getheadercolor() throws Exception{
try {
		Debug.PushSubsStack("getHeaderColor (table) ","table",2,ba,this,1460);
 BA.debugLineNum = 1460;BA.debugLine="Public Sub getHeaderColor As Int";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1461;BA.debugLine="Return cHeaderColor";
Debug.ShouldStop(1048576);
if (true) return _cheadercolor;
 BA.debugLineNum = 1462;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int[]  _getheadercolors() throws Exception{
try {
		Debug.PushSubsStack("GetHeaderColors (table) ","table",2,ba,this,1740);
 BA.debugLineNum = 1740;BA.debugLine="Public Sub GetHeaderColors As Int()";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1741;BA.debugLine="Return cHeaderColors";
Debug.ShouldStop(4096);
if (true) return _cheadercolors;
 BA.debugLineNum = 1742;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getheaderheight() throws Exception{
try {
		Debug.PushSubsStack("getHeaderHeight (table) ","table",2,ba,this,1451);
 BA.debugLineNum = 1451;BA.debugLine="Public Sub getHeaderHeight As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1452;BA.debugLine="Return cHeaderHeight";
Debug.ShouldStop(2048);
if (true) return _cheaderheight;
 BA.debugLineNum = 1453;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.objects.PanelWrapper  _getheaderpanel() throws Exception{
try {
		Debug.PushSubsStack("getHeaderPanel (table) ","table",2,ba,this,1090);
 BA.debugLineNum = 1090;BA.debugLine="Public Sub getHeaderPanel As Panel";
Debug.ShouldStop(2);
 BA.debugLineNum = 1091;BA.debugLine="Return Header";
Debug.ShouldStop(4);
if (true) return _header;
 BA.debugLineNum = 1092;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getheadertextcolor() throws Exception{
try {
		Debug.PushSubsStack("getHeaderTextColor (table) ","table",2,ba,this,1469);
 BA.debugLineNum = 1469;BA.debugLine="Public Sub getHeaderTextColor As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1470;BA.debugLine="Return cHeaderTextColor";
Debug.ShouldStop(536870912);
if (true) return _cheadertextcolor;
 BA.debugLineNum = 1471;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int[]  _getheadertextcolors() throws Exception{
try {
		Debug.PushSubsStack("GetHeaderTextColors (table) ","table",2,ba,this,1749);
 BA.debugLineNum = 1749;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1750;BA.debugLine="Return cHeaderTextColors";
Debug.ShouldStop(2097152);
if (true) return _cheadertextcolors;
 BA.debugLineNum = 1751;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getheight() throws Exception{
try {
		Debug.PushSubsStack("getHeight (table) ","table",2,ba,this,1190);
 BA.debugLineNum = 1190;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 1191;BA.debugLine="Return pnlTable.Height";
Debug.ShouldStop(64);
if (true) return _pnltable.getHeight();
 BA.debugLineNum = 1192;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.objects.LabelWrapper[]  _getlabels(int _row) throws Exception{
try {
		Debug.PushSubsStack("GetLabels (table) ","table",2,ba,this,559);
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.example.table._rowcol _rc = null;
Debug.locals.put("row", _row);
 BA.debugLineNum = 559;BA.debugLine="Private Sub GetLabels(row As Int) As Label()";
Debug.ShouldStop(16384);
 BA.debugLineNum = 560;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(32768);
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 561;BA.debugLine="If LabelsCache.Size > 0 Then";
Debug.ShouldStop(65536);
if (_labelscache.getSize()>0) { 
 BA.debugLineNum = 563;BA.debugLine="lbls = LabelsCache.get(LabelsCache.Size - 1)";
Debug.ShouldStop(262144);
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_labelscache.Get((int) (_labelscache.getSize()-1)));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 564;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
Debug.ShouldStop(524288);
_labelscache.RemoveAt((int) (_labelscache.getSize()-1));
 }else {
 BA.debugLineNum = 566;BA.debugLine="lbls = CreateNewLabels";
Debug.ShouldStop(2097152);
_lbls = _createnewlabels();Debug.locals.put("lbls", _lbls);
 };
 BA.debugLineNum = 568;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(8388608);
{
final int step377 = 1;
final int limit377 = (int) (_lbls.length-1);
for (_i = (int) (0); (step377 > 0 && _i <= limit377) || (step377 < 0 && _i >= limit377); _i = ((int)(0 + _i + step377))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 569;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(16777216);
_rc = new b4a.example.table._rowcol();Debug.locals.put("rc", _rc);
 BA.debugLineNum = 570;BA.debugLine="rc = lbls(I).Tag";
Debug.ShouldStop(33554432);
_rc = (b4a.example.table._rowcol)(_lbls[_i].getTag());Debug.locals.put("rc", _rc);
 BA.debugLineNum = 571;BA.debugLine="rc.row = row";
Debug.ShouldStop(67108864);
_rc.row = _row;Debug.locals.put("rc", _rc);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 573;BA.debugLine="Return lbls";
Debug.ShouldStop(268435456);
if (true) return _lbls;
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getleft() throws Exception{
try {
		Debug.PushSubsStack("getLeft (table) ","table",2,ba,this,1153);
 BA.debugLineNum = 1153;BA.debugLine="Public Sub getLeft As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 1154;BA.debugLine="Return pnlTable.Left";
Debug.ShouldStop(2);
if (true) return _pnltable.getLeft();
 BA.debugLineNum = 1155;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getlinewidth() throws Exception{
try {
		Debug.PushSubsStack("getLineWidth (table) ","table",2,ba,this,1208);
 BA.debugLineNum = 1208;BA.debugLine="Public Sub getLineWidth As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1209;BA.debugLine="Return cLineWidth";
Debug.ShouldStop(16777216);
if (true) return _clinewidth;
 BA.debugLineNum = 1210;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _getmultiselect() throws Exception{
try {
		Debug.PushSubsStack("getMultiSelect (table) ","table",2,ba,this,1064);
 BA.debugLineNum = 1064;BA.debugLine="Public Sub getMultiSelect As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 1065;BA.debugLine="Return IsMultiSelect";
Debug.ShouldStop(256);
if (true) return _ismultiselect;
 BA.debugLineNum = 1066;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getrowcolor1() throws Exception{
try {
		Debug.PushSubsStack("getRowColor1 (table) ","table",2,ba,this,1481);
 BA.debugLineNum = 1481;BA.debugLine="Public Sub getRowColor1 As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 1482;BA.debugLine="Return cRowColor1";
Debug.ShouldStop(512);
if (true) return _crowcolor1;
 BA.debugLineNum = 1483;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getrowcolor2() throws Exception{
try {
		Debug.PushSubsStack("getRowColor2 (table) ","table",2,ba,this,1493);
 BA.debugLineNum = 1493;BA.debugLine="Public Sub getRowColor2 As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1494;BA.debugLine="Return cRowColor2";
Debug.ShouldStop(2097152);
if (true) return _crowcolor2;
 BA.debugLineNum = 1495;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getrowheight() throws Exception{
try {
		Debug.PushSubsStack("getRowHeight (table) ","table",2,ba,this,1579);
 BA.debugLineNum = 1579;BA.debugLine="Public Sub getRowHeight As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1580;BA.debugLine="Return cRowHeight";
Debug.ShouldStop(2048);
if (true) return _crowheight;
 BA.debugLineNum = 1581;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getselectedcellcolor() throws Exception{
try {
		Debug.PushSubsStack("getSelectedCellColor (table) ","table",2,ba,this,1517);
 BA.debugLineNum = 1517;BA.debugLine="Public Sub getSelectedCellColor As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1518;BA.debugLine="Return cSelectedCellColor";
Debug.ShouldStop(8192);
if (true) return _cselectedcellcolor;
 BA.debugLineNum = 1519;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getselectedrowcolor() throws Exception{
try {
		Debug.PushSubsStack("getSelectedRowColor (table) ","table",2,ba,this,1505);
 BA.debugLineNum = 1505;BA.debugLine="Public Sub getSelectedRowColor As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 1506;BA.debugLine="Return cSelectedRowColor";
Debug.ShouldStop(2);
if (true) return _cselectedrowcolor;
 BA.debugLineNum = 1507;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public anywheresoftware.b4a.objects.collections.List  _getselectedrows() throws Exception{
try {
		Debug.PushSubsStack("getSelectedRows (table) ","table",2,ba,this,1095);
anywheresoftware.b4a.objects.collections.List _sr = null;
 BA.debugLineNum = 1095;BA.debugLine="Public Sub getSelectedRows As List";
Debug.ShouldStop(64);
 BA.debugLineNum = 1096;BA.debugLine="Dim sr As List";
Debug.ShouldStop(128);
_sr = new anywheresoftware.b4a.objects.collections.List();Debug.locals.put("sr", _sr);
 BA.debugLineNum = 1097;BA.debugLine="sr.Initialize";
Debug.ShouldStop(256);
_sr.Initialize();
 BA.debugLineNum = 1098;BA.debugLine="sr.AddAll(SelectedRows)";
Debug.ShouldStop(512);
_sr.AddAll(_selectedrows);
 BA.debugLineNum = 1099;BA.debugLine="Return sr";
Debug.ShouldStop(1024);
if (true) return _sr;
 BA.debugLineNum = 1100;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _getsingleline() throws Exception{
try {
		Debug.PushSubsStack("getSingleLine (table) ","table",2,ba,this,1758);
 BA.debugLineNum = 1758;BA.debugLine="Public Sub getSingleLine As Boolean";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1759;BA.debugLine="Return cSingleLine";
Debug.ShouldStop(1073741824);
if (true) return _csingleline;
 BA.debugLineNum = 1760;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public long  _getsize() throws Exception{
try {
		Debug.PushSubsStack("getSize (table) ","table",2,ba,this,1144);
 BA.debugLineNum = 1144;BA.debugLine="Public Sub getSize As Long";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1145;BA.debugLine="Return Data.Size";
Debug.ShouldStop(16777216);
if (true) return (long) (_data.getSize());
 BA.debugLineNum = 1146;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return 0L;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _getsortcolumn() throws Exception{
try {
		Debug.PushSubsStack("getSortColumn (table) ","table",2,ba,this,1681);
 BA.debugLineNum = 1681;BA.debugLine="Public Sub getSortColumn As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1682;BA.debugLine="Return cSortColumn";
Debug.ShouldStop(131072);
if (true) return _csortcolumn;
 BA.debugLineNum = 1683;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _gettablecolor() throws Exception{
try {
		Debug.PushSubsStack("getTableColor (table) ","table",2,ba,this,1530);
 BA.debugLineNum = 1530;BA.debugLine="Public Sub getTableColor As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1531;BA.debugLine="Return cTableColor";
Debug.ShouldStop(67108864);
if (true) return _ctablecolor;
 BA.debugLineNum = 1532;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _gettextcolor() throws Exception{
try {
		Debug.PushSubsStack("getTextColor (table) ","table",2,ba,this,1545);
 BA.debugLineNum = 1545;BA.debugLine="Public Sub getTextColor As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 1546;BA.debugLine="Return cTextColor";
Debug.ShouldStop(512);
if (true) return _ctextcolor;
 BA.debugLineNum = 1547;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int[]  _gettextcolors() throws Exception{
try {
		Debug.PushSubsStack("GetTextColors (table) ","table",2,ba,this,1731);
 BA.debugLineNum = 1731;BA.debugLine="Public Sub GetTextColors As Int()";
Debug.ShouldStop(4);
 BA.debugLineNum = 1732;BA.debugLine="Return cTextColors";
Debug.ShouldStop(8);
if (true) return _ctextcolors;
 BA.debugLineNum = 1733;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public float  _gettextsize() throws Exception{
try {
		Debug.PushSubsStack("getTextSize (table) ","table",2,ba,this,1567);
 BA.debugLineNum = 1567;BA.debugLine="Public Sub getTextSize As Float";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1568;BA.debugLine="Return cTextSize";
Debug.ShouldStop(-2147483648);
if (true) return _ctextsize;
 BA.debugLineNum = 1569;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return 0f;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _gettop() throws Exception{
try {
		Debug.PushSubsStack("getTop (table) ","table",2,ba,this,1162);
 BA.debugLineNum = 1162;BA.debugLine="Public Sub getTop As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 1163;BA.debugLine="Return pnlTable.Top";
Debug.ShouldStop(1024);
if (true) return _pnltable.getTop();
 BA.debugLineNum = 1164;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _getusecolumncolors() throws Exception{
try {
		Debug.PushSubsStack("getUseColumnColors (table) ","table",2,ba,this,1713);
 BA.debugLineNum = 1713;BA.debugLine="Public Sub getUseColumnColors As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1714;BA.debugLine="Return cUseColumnColors";
Debug.ShouldStop(131072);
if (true) return _cusecolumncolors;
 BA.debugLineNum = 1715;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _getvalue(int _col,int _row) throws Exception{
try {
		Debug.PushSubsStack("GetValue (table) ","table",2,ba,this,713);
String[] _values = null;
Debug.locals.put("Col", _col);
Debug.locals.put("row", _row);
 BA.debugLineNum = 713;BA.debugLine="Public Sub GetValue(Col As Int, row As Int) As Str";
Debug.ShouldStop(256);
 BA.debugLineNum = 714;BA.debugLine="Dim values() As String 'stringa prima'";
Debug.ShouldStop(512);
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");Debug.locals.put("values", _values);
 BA.debugLineNum = 715;BA.debugLine="values = Data.get(row)";
Debug.ShouldStop(1024);
_values = (String[])(_data.Get(_row));Debug.locals.put("values", _values);
 BA.debugLineNum = 716;BA.debugLine="Return values(Col)";
Debug.ShouldStop(2048);
if (true) return _values[_col];
 BA.debugLineNum = 717;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String[]  _getvalues(int _row) throws Exception{
try {
		Debug.PushSubsStack("GetValues (table) ","table",2,ba,this,986);
String[] _rowdata = null;
String[] _tmp = null;
int _i = 0;
Debug.locals.put("row", _row);
 BA.debugLineNum = 986;BA.debugLine="Public Sub GetValues(row As Int ) As String()";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 987;BA.debugLine="Dim rowData() As String  = Data.get(row) ' will t";
Debug.ShouldStop(67108864);
_rowdata = (String[])(_data.Get(_row));Debug.locals.put("rowData", _rowdata);Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 988;BA.debugLine="Dim tmp(NumberOfColumns) As String";
Debug.ShouldStop(134217728);
_tmp = new String[_numberofcolumns];
java.util.Arrays.fill(_tmp,"");Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 989;BA.debugLine="For i=0 To NumberOfColumns-1 ' copy the array";
Debug.ShouldStop(268435456);
{
final int step710 = 1;
final int limit710 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step710 > 0 && _i <= limit710) || (step710 < 0 && _i >= limit710); _i = ((int)(0 + _i + step710))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 990;BA.debugLine="tmp(i) =  rowData(i)";
Debug.ShouldStop(536870912);
_tmp[_i] = _rowdata[_i];Debug.locals.put("tmp", _tmp);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 992;BA.debugLine="Return tmp";
Debug.ShouldStop(-2147483648);
if (true) return _tmp;
 BA.debugLineNum = 993;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return null;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _getvisible() throws Exception{
try {
		Debug.PushSubsStack("getVisible (table) ","table",2,ba,this,1199);
 BA.debugLineNum = 1199;BA.debugLine="Public Sub getVisible As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1200;BA.debugLine="Return pnlTable.Visible";
Debug.ShouldStop(32768);
if (true) return _pnltable.getVisible();
 BA.debugLineNum = 1201;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _getwidth() throws Exception{
try {
		Debug.PushSubsStack("getWidth (table) ","table",2,ba,this,1174);
 BA.debugLineNum = 1174;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1175;BA.debugLine="Return pnlTable.Width";
Debug.ShouldStop(4194304);
if (true) return _pnltable.getWidth();
 BA.debugLineNum = 1176;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _header_click() throws Exception{
try {
		Debug.PushSubsStack("Header_Click (table) ","table",2,ba,this,1212);
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
int _dir = 0;
 BA.debugLineNum = 1212;BA.debugLine="Private Sub Header_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1213;BA.debugLine="Dim L As Label";
Debug.ShouldStop(268435456);
_l = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("L", _l);
 BA.debugLineNum = 1214;BA.debugLine="Dim col As Int";
Debug.ShouldStop(536870912);
_col = 0;Debug.locals.put("col", _col);
 BA.debugLineNum = 1215;BA.debugLine="L = Sender";
Debug.ShouldStop(1073741824);
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
 BA.debugLineNum = 1216;BA.debugLine="col = L.Tag";
Debug.ShouldStop(-2147483648);
_col = (int)(BA.ObjectToNumber(_l.getTag()));Debug.locals.put("col", _col);
 BA.debugLineNum = 1221;BA.debugLine="If cSortColumn = True Then";
Debug.ShouldStop(16);
if (_csortcolumn==__c.True) { 
 BA.debugLineNum = 1222;BA.debugLine="Dim dir As Int = 0 ' unsorted";
Debug.ShouldStop(32);
_dir = (int) (0);Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1223;BA.debugLine="If (sortedCol = col) Then ' we are sorting the s";
Debug.ShouldStop(64);
if ((_sortedcol==_col)) { 
 BA.debugLineNum = 1224;BA.debugLine="Select sortingDir";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_sortingdir,(int) (0),(int) (1),(int) (-1))) {
case 0:
 BA.debugLineNum = 1225;BA.debugLine="Case 0: dir = -1 ' going up";
Debug.ShouldStop(256);
_dir = (int) (-1);Debug.locals.put("dir", _dir);
 break;
case 1:
 BA.debugLineNum = 1226;BA.debugLine="Case 1: dir = -1";
Debug.ShouldStop(512);
_dir = (int) (-1);Debug.locals.put("dir", _dir);
 break;
case 2:
 BA.debugLineNum = 1227;BA.debugLine="Case -1: dir = 1";
Debug.ShouldStop(1024);
_dir = (int) (1);Debug.locals.put("dir", _dir);
 break;
}
;
 }else {
 BA.debugLineNum = 1230;BA.debugLine="dir = -1 ' start with going up";
Debug.ShouldStop(8192);
_dir = (int) (-1);Debug.locals.put("dir", _dir);
 };
 BA.debugLineNum = 1232;BA.debugLine="sortedCol = col";
Debug.ShouldStop(32768);
_sortedcol = _col;
 BA.debugLineNum = 1233;BA.debugLine="sortingDir = dir";
Debug.ShouldStop(65536);
_sortingdir = _dir;
 BA.debugLineNum = 1234;BA.debugLine="sortTable(col,dir <=0)";
Debug.ShouldStop(131072);
_sorttable(_col,_dir<=0);
 BA.debugLineNum = 1235;BA.debugLine="showHeaderSorting(col, dir)";
Debug.ShouldStop(262144);
_showheadersorting(_col,_dir);
 };
 BA.debugLineNum = 1238;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Th";
Debug.ShouldStop(2097152);
if (__c.SubExists(ba,_callback,_event+"_HeaderClick")) { 
 BA.debugLineNum = 1239;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", col)";
Debug.ShouldStop(4194304);
__c.CallSubNew2(ba,_callback,_event+"_HeaderClick",(Object)(_col));
 };
 BA.debugLineNum = 1241;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _header_longclick() throws Exception{
try {
		Debug.PushSubsStack("Header_LongClick (table) ","table",2,ba,this,689);
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
 BA.debugLineNum = 689;BA.debugLine="Private Sub Header_LongClick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 691;BA.debugLine="Dim L As Label";
Debug.ShouldStop(262144);
_l = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("L", _l);
 BA.debugLineNum = 692;BA.debugLine="Dim col As Int";
Debug.ShouldStop(524288);
_col = 0;Debug.locals.put("col", _col);
 BA.debugLineNum = 693;BA.debugLine="L = Sender";
Debug.ShouldStop(1048576);
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
 BA.debugLineNum = 694;BA.debugLine="col = L.Tag";
Debug.ShouldStop(2097152);
_col = (int)(BA.ObjectToNumber(_l.getTag()));Debug.locals.put("col", _col);
 BA.debugLineNum = 695;BA.debugLine="If SubExists(Callback, Event & \"_HeaderLongClick\"";
Debug.ShouldStop(4194304);
if (__c.SubExists(ba,_callback,_event+"_HeaderLongClick")) { 
 BA.debugLineNum = 696;BA.debugLine="CallSub2(Callback, Event & \"_HeaderLongClick\", c";
Debug.ShouldStop(8388608);
__c.CallSubNew2(ba,_callback,_event+"_HeaderLongClick",(Object)(_col));
 };
 BA.debugLineNum = 698;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _hidecol(int _col) throws Exception{
try {
		Debug.PushSubsStack("hideCol (table) ","table",2,ba,this,1103);
int[] _tmpwidths = null;
int _i = 0;
Debug.locals.put("col", _col);
 BA.debugLineNum = 1103;BA.debugLine="Public Sub hideCol(col As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1104;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
Debug.ShouldStop(32768);
_tmpwidths = new int[_savedwidths.length];
;Debug.locals.put("tmpWidths", _tmpwidths);
 BA.debugLineNum = 1105;BA.debugLine="For i = 0 To SavedWidths.Length-1";
Debug.ShouldStop(65536);
{
final int step794 = 1;
final int limit794 = (int) (_savedwidths.length-1);
for (_i = (int) (0); (step794 > 0 && _i <= limit794) || (step794 < 0 && _i >= limit794); _i = ((int)(0 + _i + step794))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1106;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
Debug.ShouldStop(131072);
_tmpwidths[_i] = _savedwidths[_i];Debug.locals.put("tmpWidths", _tmpwidths);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1108;BA.debugLine="tmpWidths(col) = 1";
Debug.ShouldStop(524288);
_tmpwidths[_col] = (int) (1);Debug.locals.put("tmpWidths", _tmpwidths);
 BA.debugLineNum = 1109;BA.debugLine="SetColumnsWidths(tmpWidths)";
Debug.ShouldStop(1048576);
_setcolumnswidths(_tmpwidths);
 BA.debugLineNum = 1110;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _hiderow(int _row) throws Exception{
try {
		Debug.PushSubsStack("HideRow (table) ","table",2,ba,this,544);
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
Debug.locals.put("row", _row);
 BA.debugLineNum = 544;BA.debugLine="Private Sub HideRow (row As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 546;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(2);
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 547;BA.debugLine="lbls = visibleRows.get(row)";
Debug.ShouldStop(4);
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.Get((Object)(_row)));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 548;BA.debugLine="If lbls = Null Then";
Debug.ShouldStop(8);
if (_lbls== null) { 
 BA.debugLineNum = 550;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return "";
 };
 BA.debugLineNum = 552;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(128);
{
final int step363 = 1;
final int limit363 = (int) (_lbls.length-1);
for (_i = (int) (0); (step363 > 0 && _i <= limit363) || (step363 < 0 && _i >= limit363); _i = ((int)(0 + _i + step363))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 553;BA.debugLine="lbls(I).RemoveView";
Debug.ShouldStop(256);
_lbls[_i].RemoveView();
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 555;BA.debugLine="visibleRows.Remove(row)";
Debug.ShouldStop(1024);
_visiblerows.Remove((Object)(_row));
 BA.debugLineNum = 556;BA.debugLine="LabelsCache.Add(lbls)";
Debug.ShouldStop(2048);
_labelscache.Add((Object)(_lbls));
 BA.debugLineNum = 557;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callbackmodule,String _eventname,int _vnumberofcolumns,int _cellalignement,boolean _showstatusl) throws Exception{
innerInitialize(_ba);
try {
		Debug.PushSubsStack("Initialize (table) ","table",2,ba,this,183);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallbackModule", _callbackmodule);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("vNumberOfColumns", _vnumberofcolumns);
Debug.locals.put("cellAlignement", _cellalignement);
Debug.locals.put("showStatusL", _showstatusl);
 BA.debugLineNum = 183;BA.debugLine="Public Sub Initialize (CallbackModule As Object, E";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="SV.Initialize(0, 0, \"SV\")";
Debug.ShouldStop(8388608);
_sv.Initialize(ba,(int) (0),(int) (0),"SV");
 BA.debugLineNum = 185;BA.debugLine="internalPanel.Initialize(\"IP\")";
Debug.ShouldStop(16777216);
_internalpanel.Initialize(ba,"IP");
 BA.debugLineNum = 186;BA.debugLine="showStatusLine = showStatusL";
Debug.ShouldStop(33554432);
_showstatusline = _showstatusl;
 BA.debugLineNum = 187;BA.debugLine="SelectedRows.Initialize";
Debug.ShouldStop(67108864);
_selectedrows.Initialize();
 BA.debugLineNum = 188;BA.debugLine="cAlignment = cellAlignement";
Debug.ShouldStop(134217728);
_calignment = _cellalignement;
 BA.debugLineNum = 190;BA.debugLine="Callback = CallbackModule";
Debug.ShouldStop(536870912);
_callback = _callbackmodule;
 BA.debugLineNum = 191;BA.debugLine="Event = EventName";
Debug.ShouldStop(1073741824);
_event = _eventname;
 BA.debugLineNum = 195;BA.debugLine="NumberOfColumns = vNumberOfColumns";
Debug.ShouldStop(4);
_numberofcolumns = _vnumberofcolumns;
 BA.debugLineNum = 200;BA.debugLine="Data.Initialize";
Debug.ShouldStop(128);
_data.Initialize();
 BA.debugLineNum = 202;BA.debugLine="sortingView.Initialize(\"\")";
Debug.ShouldStop(512);
_sortingview.Initialize(ba,"");
 BA.debugLineNum = 205;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
Debug.ShouldStop(4096);
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 BA.debugLineNum = 206;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(8192);
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _innerclearall(int _vnumberofcolumns) throws Exception{
try {
		Debug.PushSubsStack("innerClearAll (table) ","table",2,ba,this,266);
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd1 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd2 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd3 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd4 = null;
Debug.locals.put("vNumberOfColumns", _vnumberofcolumns);
 BA.debugLineNum = 266;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int)";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="SelectedRows.Initialize";
Debug.ShouldStop(1024);
_selectedrows.Initialize();
 BA.debugLineNum = 268;BA.debugLine="For i = SV.Panel.NumberOfViews -1 To 0 Step -1";
Debug.ShouldStop(2048);
{
final int step123 = (int) (-1);
final int limit123 = (int) (0);
for (_i = (int) (_sv.getPanel().getNumberOfViews()-1); (step123 > 0 && _i <= limit123) || (step123 < 0 && _i >= limit123); _i = ((int)(0 + _i + step123))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 269;BA.debugLine="SV.Panel.RemoveViewAt(i)";
Debug.ShouldStop(4096);
_sv.getPanel().RemoveViewAt(_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 271;BA.debugLine="NumberOfColumns = vNumberOfColumns";
Debug.ShouldStop(16384);
_numberofcolumns = _vnumberofcolumns;
 BA.debugLineNum = 272;BA.debugLine="Dim Drawable1(NumberOfColumns) As Object";
Debug.ShouldStop(32768);
_drawable1 = new Object[_numberofcolumns];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
 BA.debugLineNum = 273;BA.debugLine="Dim Drawable2(NumberOfColumns) As Object";
Debug.ShouldStop(65536);
_drawable2 = new Object[_numberofcolumns];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
 BA.debugLineNum = 274;BA.debugLine="Dim SelectedDrawable(NumberOfColumns) As Object";
Debug.ShouldStop(131072);
_selecteddrawable = new Object[_numberofcolumns];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
 BA.debugLineNum = 275;BA.debugLine="Dim cAlignments(NumberOfColumns) As Int";
Debug.ShouldStop(262144);
_calignments = new int[_numberofcolumns];
;
 BA.debugLineNum = 276;BA.debugLine="If cUseColumnColors = False Then";
Debug.ShouldStop(524288);
if (_cusecolumncolors==__c.False) { 
 BA.debugLineNum = 277;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(1048576);
{
final int step132 = 1;
final int limit132 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step132 > 0 && _i <= limit132) || (step132 < 0 && _i >= limit132); _i = ((int)(0 + _i + step132))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 278;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
Debug.ShouldStop(2097152);
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("cd1", _cd1);
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("cd2", _cd2);
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("cd3", _cd3);
 BA.debugLineNum = 279;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
Debug.ShouldStop(4194304);
_cd1.Initialize(_crowcolor1,(int) (0));
 BA.debugLineNum = 280;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
Debug.ShouldStop(8388608);
_cd2.Initialize(_crowcolor2,(int) (0));
 BA.debugLineNum = 281;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
Debug.ShouldStop(16777216);
_cd3.Initialize(_cselectedrowcolor,(int) (0));
 BA.debugLineNum = 282;BA.debugLine="Drawable1(i) = cd1";
Debug.ShouldStop(33554432);
_drawable1[_i] = (Object)(_cd1.getObject());
 BA.debugLineNum = 283;BA.debugLine="Drawable2(i) = cd2";
Debug.ShouldStop(67108864);
_drawable2[_i] = (Object)(_cd2.getObject());
 BA.debugLineNum = 284;BA.debugLine="SelectedDrawable(i) = cd3";
Debug.ShouldStop(134217728);
_selecteddrawable[_i] = (Object)(_cd3.getObject());
 BA.debugLineNum = 285;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(268435456);
if (_multialignments==__c.False) { 
 BA.debugLineNum = 286;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(536870912);
_calignments[_i] = _calignment;
 }else {
 BA.debugLineNum = 288;BA.debugLine="cAlignments(i) = cAlignments0(i)";
Debug.ShouldStop(-2147483648);
_calignments[_i] = _calignments0[_i];
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 292;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(8);
{
final int step147 = 1;
final int limit147 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step147 > 0 && _i <= limit147) || (step147 < 0 && _i >= limit147); _i = ((int)(0 + _i + step147))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 293;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
Debug.ShouldStop(16);
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("cd1", _cd1);
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("cd2", _cd2);
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("cd3", _cd3);
 BA.debugLineNum = 294;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
Debug.ShouldStop(32);
_cd1.Initialize(_ccolumncolors[_i],(int) (0));
 BA.debugLineNum = 295;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
Debug.ShouldStop(64);
_cd2.Initialize(_ccolumncolors[_i],(int) (0));
 BA.debugLineNum = 296;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
Debug.ShouldStop(128);
_cd3.Initialize(_cselectedrowcolor,(int) (0));
 BA.debugLineNum = 297;BA.debugLine="Drawable1(i) = cd1";
Debug.ShouldStop(256);
_drawable1[_i] = (Object)(_cd1.getObject());
 BA.debugLineNum = 298;BA.debugLine="Drawable2(i) = cd2";
Debug.ShouldStop(512);
_drawable2[_i] = (Object)(_cd2.getObject());
 BA.debugLineNum = 299;BA.debugLine="SelectedDrawable(i) = cd3";
Debug.ShouldStop(1024);
_selecteddrawable[_i] = (Object)(_cd3.getObject());
 BA.debugLineNum = 300;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(2048);
if (_multialignments==__c.False) { 
 BA.debugLineNum = 301;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(4096);
_calignments[_i] = _calignment;
 }else {
 BA.debugLineNum = 303;BA.debugLine="cAlignments(i) = cAlignments0(i)";
Debug.ShouldStop(16384);
_calignments[_i] = _calignments0[_i];
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 308;BA.debugLine="Dim cd4 As ColorDrawable";
Debug.ShouldStop(524288);
_cd4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();Debug.locals.put("cd4", _cd4);
 BA.debugLineNum = 309;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
Debug.ShouldStop(1048576);
_cd4.Initialize(_cselectedcellcolor,(int) (0));
 BA.debugLineNum = 310;BA.debugLine="SelectedCellDrawable = cd4";
Debug.ShouldStop(2097152);
_selectedcelldrawable = (Object)(_cd4.getObject());
 BA.debugLineNum = 312;BA.debugLine="SV.Panel.Height = 0";
Debug.ShouldStop(8388608);
_sv.getPanel().setHeight((int) (0));
 BA.debugLineNum = 315;BA.debugLine="SelectedCol = -1";
Debug.ShouldStop(67108864);
_selectedcol = (int) (-1);
 BA.debugLineNum = 316;BA.debugLine="minVisibleRow = -1";
Debug.ShouldStop(134217728);
_minvisiblerow = (int) (-1);
 BA.debugLineNum = 317;BA.debugLine="maxVisibleRow = 0";
Debug.ShouldStop(268435456);
_maxvisiblerow = (int) (0);
 BA.debugLineNum = 318;BA.debugLine="Data.Initialize";
Debug.ShouldStop(536870912);
_data.Initialize();
 BA.debugLineNum = 319;BA.debugLine="LabelsCache.Initialize";
Debug.ShouldStop(1073741824);
_labelscache.Initialize();
 BA.debugLineNum = 320;BA.debugLine="visibleRows.Initialize";
Debug.ShouldStop(-2147483648);
_visiblerows.Initialize();
 BA.debugLineNum = 321;BA.debugLine="SV.VerticalScrollPosition = 0";
Debug.ShouldStop(1);
_sv.setVerticalScrollPosition((int) (0));
 BA.debugLineNum = 322;BA.debugLine="DoEvents";
Debug.ShouldStop(2);
__c.DoEvents();
 BA.debugLineNum = 323;BA.debugLine="SV.VerticalScrollPosition = 0";
Debug.ShouldStop(4);
_sv.setVerticalScrollPosition((int) (0));
 BA.debugLineNum = 324;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
Debug.ShouldStop(8);
{
final int step175 = 1;
final int limit175 = (int) (80);
for (_i = (int) (1); (step175 > 0 && _i <= limit175) || (step175 < 0 && _i >= limit175); _i = ((int)(0 + _i + step175))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 325;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
Debug.ShouldStop(16);
_labelscache.Add((Object)(_createnewlabels()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 327;BA.debugLine="If IsVisible Then";
Debug.ShouldStop(64);
if (_isvisible) { 
 BA.debugLineNum = 328;BA.debugLine="SV_ScrollChanged(0, 0)";
Debug.ShouldStop(128);
_sv_scrollchanged((int) (0),(int) (0));
 };
 BA.debugLineNum = 330;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusL";
Debug.ShouldStop(512);
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _insertrowat(int _row,String[] _values) throws Exception{
try {
		Debug.PushSubsStack("insertRowAt (table) ","table",2,ba,this,996);
anywheresoftware.b4a.objects.collections.List _l = null;
int _i = 0;
int _keepsel = 0;
Debug.locals.put("row", _row);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 996;BA.debugLine="Public Sub insertRowAt (row As Int, Values() As St";
Debug.ShouldStop(8);
 BA.debugLineNum = 997;BA.debugLine="If (row < 0) Then row = 0";
Debug.ShouldStop(16);
if ((_row<0)) { 
_row = (int) (0);Debug.locals.put("row", _row);};
 BA.debugLineNum = 998;BA.debugLine="If (row > Data.Size) Then";
Debug.ShouldStop(32);
if ((_row>_data.getSize())) { 
 BA.debugLineNum = 999;BA.debugLine="AddRow(Values)";
Debug.ShouldStop(64);
_addrow(_values);
 BA.debugLineNum = 1000;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return __c.True;
 };
 BA.debugLineNum = 1002;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,S";
Debug.ShouldStop(512);
_sv_scrollchanged(_sv.getHorizontalScrollPosition(),_sv.getVerticalScrollPosition());
 BA.debugLineNum = 1004;BA.debugLine="Dim L As List";
Debug.ShouldStop(2048);
_l = new anywheresoftware.b4a.objects.collections.List();Debug.locals.put("L", _l);
 BA.debugLineNum = 1005;BA.debugLine="L.Initialize";
Debug.ShouldStop(4096);
_l.Initialize();
 BA.debugLineNum = 1006;BA.debugLine="L.Add(Values)";
Debug.ShouldStop(8192);
_l.Add((Object)(_values));
 BA.debugLineNum = 1008;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
Debug.ShouldStop(32768);
{
final int step725 = 1;
final int limit725 = (int) (_selectedrows.getSize()-1);
for (_i = (int) (0); (step725 > 0 && _i <= limit725) || (step725 < 0 && _i >= limit725); _i = ((int)(0 + _i + step725))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1009;BA.debugLine="Dim keepSel As Int";
Debug.ShouldStop(65536);
_keepsel = 0;Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 1010;BA.debugLine="keepSel = SelectedRows.get(i)";
Debug.ShouldStop(131072);
_keepsel = (int)(BA.ObjectToNumber(_selectedrows.Get(_i)));Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 1011;BA.debugLine="If (keepSel >= row) Then";
Debug.ShouldStop(262144);
if ((_keepsel>=_row)) { 
 BA.debugLineNum = 1012;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number";
Debug.ShouldStop(524288);
_selectedrows.Set(_i,(Object)(_keepsel+1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1016;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
Debug.ShouldStop(8388608);
{
final int step732 = 1;
final int limit732 = _maxvisiblerow;
for (_i = _minvisiblerow; (step732 > 0 && _i <= limit732) || (step732 < 0 && _i >= limit732); _i = ((int)(0 + _i + step732))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1017;BA.debugLine="HideRow(i)";
Debug.ShouldStop(16777216);
_hiderow(_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1019;BA.debugLine="Data.AddAllAt(row,L) ' now I can add the row";
Debug.ShouldStop(67108864);
_data.AddAllAt(_row,_l);
 BA.debugLineNum = 1021;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.V";
Debug.ShouldStop(268435456);
_sv_scrollchanged(_sv.getHorizontalScrollPosition(),_sv.getVerticalScrollPosition());
 BA.debugLineNum = 1023;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
Debug.ShouldStop(1073741824);
{
final int step737 = 1;
final int limit737 = _maxvisiblerow;
for (_i = _minvisiblerow; (step737 > 0 && _i <= limit737) || (step737 < 0 && _i >= limit737); _i = ((int)(0 + _i + step737))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1024;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(-2147483648);
_showrow(_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1027;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(4);
_sv.getPanel().setHeight((int) (_data.getSize()*_crowheight));
 BA.debugLineNum = 1028;BA.debugLine="updateIPLocation";
Debug.ShouldStop(8);
_updateiplocation();
 BA.debugLineNum = 1029;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,Min(";
Debug.ShouldStop(16);
_sv_scrollchanged(_sv.getHorizontalScrollPosition(),(int) (__c.Min(_sv.getVerticalScrollPosition(),_sv.getPanel().getHeight())));
 BA.debugLineNum = 1030;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusL";
Debug.ShouldStop(32);
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 BA.debugLineNum = 1031;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) return __c.False;
 BA.debugLineNum = 1032;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _ip_click() throws Exception{
try {
		Debug.PushSubsStack("IP_Click (table) ","table",2,ba,this,1126);
 BA.debugLineNum = 1126;BA.debugLine="Private Sub IP_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 1128;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Th";
Debug.ShouldStop(128);
if (__c.SubExists(ba,_callback,_event+"_HeaderClick")) { 
 BA.debugLineNum = 1129;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", -1)";
Debug.ShouldStop(256);
__c.CallSubNew2(ba,_callback,_event+"_HeaderClick",(Object)(-1));
 };
 BA.debugLineNum = 1131;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _isrowvisible(int _row) throws Exception{
try {
		Debug.PushSubsStack("IsRowVisible (table) ","table",2,ba,this,539);
Debug.locals.put("row", _row);
 BA.debugLineNum = 539;BA.debugLine="Private Sub IsRowVisible(row As Int) As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 540;BA.debugLine="Return row < (SV.VerticalScrollPosition + SV.Heig";
Debug.ShouldStop(134217728);
if (true) return _row<(_sv.getVerticalScrollPosition()+_sv.getHeight())/(double)(_crowheight+1) && _row>_sv.getVerticalScrollPosition()/(double)_crowheight;
 BA.debugLineNum = 542;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _jumptorow(int _row) throws Exception{
try {
		Debug.PushSubsStack("JumpToRow (table) ","table",2,ba,this,784);
Debug.locals.put("row", _row);
 BA.debugLineNum = 784;BA.debugLine="Public Sub JumpToRow(row As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 785;BA.debugLine="SV.VerticalScrollPosition = row * cRowHeight";
Debug.ShouldStop(65536);
_sv.setVerticalScrollPosition((int) (_row*_crowheight));
 BA.debugLineNum = 786;BA.debugLine="DoEvents";
Debug.ShouldStop(131072);
__c.DoEvents();
 BA.debugLineNum = 787;BA.debugLine="SV.VerticalScrollPosition = row * cRowHeight";
Debug.ShouldStop(262144);
_sv.setVerticalScrollPosition((int) (_row*_crowheight));
 BA.debugLineNum = 788;BA.debugLine="DoEvents";
Debug.ShouldStop(524288);
__c.DoEvents();
 BA.debugLineNum = 789;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _jumptorowandselect(int _row,int _col) throws Exception{
try {
		Debug.PushSubsStack("JumpToRowAndSelect (table) ","table",2,ba,this,792);
b4a.example.table._rowcol _rc = null;
Debug.locals.put("row", _row);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 792;BA.debugLine="Public Sub JumpToRowAndSelect(row As Int, Col As I";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 793;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(16777216);
_rc = new b4a.example.table._rowcol();Debug.locals.put("rc", _rc);
 BA.debugLineNum = 795;BA.debugLine="rc.row = row";
Debug.ShouldStop(67108864);
_rc.row = _row;Debug.locals.put("rc", _rc);
 BA.debugLineNum = 796;BA.debugLine="rc.Col = Col";
Debug.ShouldStop(134217728);
_rc.Col = _col;Debug.locals.put("rc", _rc);
 BA.debugLineNum = 797;BA.debugLine="SelectRow(rc)";
Debug.ShouldStop(268435456);
_selectrow(_rc);
 BA.debugLineNum = 798;BA.debugLine="SV.VerticalScrollPosition = row * cRowHeight";
Debug.ShouldStop(536870912);
_sv.setVerticalScrollPosition((int) (_row*_crowheight));
 BA.debugLineNum = 799;BA.debugLine="DoEvents";
Debug.ShouldStop(1073741824);
__c.DoEvents();
 BA.debugLineNum = 800;BA.debugLine="SV.VerticalScrollPosition = row * cRowHeight";
Debug.ShouldStop(-2147483648);
_sv.setVerticalScrollPosition((int) (_row*_crowheight));
 BA.debugLineNum = 801;BA.debugLine="DoEvents";
Debug.ShouldStop(1);
__c.DoEvents();
 BA.debugLineNum = 802;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _loadsqlitedb(anywheresoftware.b4a.sql.SQL _sqlite,String _query,boolean _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLiteDB (table) ","table",2,ba,this,1613);
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
String[] _r = null;
Debug.locals.put("SQLite", _sqlite);
Debug.locals.put("Query", _query);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 1613;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As St";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1614;BA.debugLine="Dim Curs As Cursor";
Debug.ShouldStop(8192);
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 1615;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
Debug.ShouldStop(16384);
_curs.setObject((android.database.Cursor)(_sqlite.ExecQuery(_query)));
 BA.debugLineNum = 1617;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(65536);
_cautomaticwidths = _automaticwidths;
 BA.debugLineNum = 1618;BA.debugLine="NumberOfColumns = Curs.ColumnCount";
Debug.ShouldStop(131072);
_numberofcolumns = _curs.getColumnCount();
 BA.debugLineNum = 1619;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(262144);
_innerclearall(_numberofcolumns);
 BA.debugLineNum = 1621;BA.debugLine="Dim Headers(NumberOfColumns) As String";
Debug.ShouldStop(1048576);
_headers = new String[_numberofcolumns];
java.util.Arrays.fill(_headers,"");Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 1622;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
Debug.ShouldStop(2097152);
_columnwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 1623;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
Debug.ShouldStop(4194304);
_headerwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 1624;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
Debug.ShouldStop(8388608);
_datawidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 1625;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(16777216);
_col = 0;Debug.locals.put("col", _col);
_row = 0;Debug.locals.put("row", _row);
 BA.debugLineNum = 1626;BA.debugLine="Dim str As String";
Debug.ShouldStop(33554432);
_str = "";Debug.locals.put("str", _str);
 BA.debugLineNum = 1627;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(67108864);
{
final int step1175 = 1;
final int limit1175 = (int) (_numberofcolumns-1);
for (_col = (int) (0); (step1175 > 0 && _col <= limit1175) || (step1175 < 0 && _col >= limit1175); _col = ((int)(0 + _col + step1175))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1628;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
Debug.ShouldStop(134217728);
_headers[_col] = _curs.GetColumnName(_col);Debug.locals.put("Headers", _headers);
 BA.debugLineNum = 1629;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(268435456);
if (_automaticwidths==__c.False) { 
 BA.debugLineNum = 1630;BA.debugLine="ColumnWidths(col) = 130dip";
Debug.ShouldStop(536870912);
_columnwidths[_col] = __c.DipToCurrent((int) (130));
 BA.debugLineNum = 1631;BA.debugLine="HeaderWidths(col) = 130dip";
Debug.ShouldStop(1073741824);
_headerwidths[_col] = __c.DipToCurrent((int) (130));
 BA.debugLineNum = 1632;BA.debugLine="DataWidths(col) = 130dip";
Debug.ShouldStop(-2147483648);
_datawidths[_col] = __c.DipToCurrent((int) (130));
 }else {
 BA.debugLineNum = 1634;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Head";
Debug.ShouldStop(2);
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],__c.Typeface.DEFAULT,_ctextsize)+__c.DipToCurrent((int) (8))+_clinewidth);
 BA.debugLineNum = 1635;BA.debugLine="DataWidths(col) = 0";
Debug.ShouldStop(4);
_datawidths[_col] = (int) (0);
 BA.debugLineNum = 1636;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(8);
{
final int step1184 = 1;
final int limit1184 = (int) (_curs.getRowCount()-1);
for (_row = (int) (0); (step1184 > 0 && _row <= limit1184) || (step1184 < 0 && _row >= limit1184); _row = ((int)(0 + _row + step1184))) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 1637;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(16);
_curs.setPosition(_row);
 BA.debugLineNum = 1638;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(32);
_str = _curs.GetString2(_col);Debug.locals.put("str", _str);
 BA.debugLineNum = 1639;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(64);
if (_str!= null) { 
 BA.debugLineNum = 1640;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
Debug.ShouldStop(128);
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,__c.Typeface.DEFAULT,_ctextsize)+__c.DipToCurrent((int) (8))+_clinewidth));
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 1643;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
Debug.ShouldStop(1024);
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1646;BA.debugLine="SetHeader(Headers)";
Debug.ShouldStop(8192);
_setheader(_headers);
 BA.debugLineNum = 1647;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(16384);
_setcolumnswidths(_columnwidths);
 BA.debugLineNum = 1649;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(65536);
{
final int step1196 = 1;
final int limit1196 = (int) (_curs.getRowCount()-1);
for (_row = (int) (0); (step1196 > 0 && _row <= limit1196) || (step1196 < 0 && _row >= limit1196); _row = ((int)(0 + _row + step1196))) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 1650;BA.debugLine="Dim R(NumberOfColumns), str As String";
Debug.ShouldStop(131072);
_r = new String[_numberofcolumns];
java.util.Arrays.fill(_r,"");Debug.locals.put("R", _r);
_str = "";Debug.locals.put("str", _str);
 BA.debugLineNum = 1651;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(262144);
{
final int step1198 = 1;
final int limit1198 = (int) (_numberofcolumns-1);
for (_col = (int) (0); (step1198 > 0 && _col <= limit1198) || (step1198 < 0 && _col >= limit1198); _col = ((int)(0 + _col + step1198))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1652;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(524288);
_curs.setPosition(_row);
 BA.debugLineNum = 1653;BA.debugLine="str = Curs.GetString2(col)";
Debug.ShouldStop(1048576);
_str = _curs.GetString2(_col);Debug.locals.put("str", _str);
 BA.debugLineNum = 1654;BA.debugLine="If str <> Null Then";
Debug.ShouldStop(2097152);
if (_str!= null) { 
 BA.debugLineNum = 1655;BA.debugLine="R(col) = str";
Debug.ShouldStop(4194304);
_r[_col] = _str;Debug.locals.put("R", _r);
 }else {
 BA.debugLineNum = 1657;BA.debugLine="R(col) = \"\"";
Debug.ShouldStop(16777216);
_r[_col] = "";Debug.locals.put("R", _r);
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1660;BA.debugLine="AddRow(R)";
Debug.ShouldStop(134217728);
_addrow(_r);
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 1663;BA.debugLine="Curs.Close";
Debug.ShouldStop(1073741824);
_curs.Close();
 BA.debugLineNum = 1664;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _loadtablefromcsv(String _dir,String _filename,boolean _headersexist) throws Exception{
try {
		Debug.PushSubsStack("LoadTableFromCSV (table) ","table",2,ba,this,806);
anywheresoftware.b4a.objects.collections.List _list1 = null;
String[] _h = null;
anywheresoftware.b4a.objects.collections.List _headers = null;
int _i = 0;
String[] _firstrow = null;
String[] _row = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("HeadersExist", _headersexist);
 BA.debugLineNum = 806;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
Debug.ShouldStop(32);
 BA.debugLineNum = 808;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(128);
_list1 = new anywheresoftware.b4a.objects.collections.List();Debug.locals.put("List1", _list1);
 BA.debugLineNum = 809;BA.debugLine="Dim h() As String";
Debug.ShouldStop(256);
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");Debug.locals.put("h", _h);
 BA.debugLineNum = 811;BA.debugLine="cAutomaticWidths = False";
Debug.ShouldStop(1024);
_cautomaticwidths = __c.False;
 BA.debugLineNum = 813;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(4096);
if (_headersexist) { 
 BA.debugLineNum = 814;BA.debugLine="Dim headers As List";
Debug.ShouldStop(8192);
_headers = new anywheresoftware.b4a.objects.collections.List();Debug.locals.put("headers", _headers);
 BA.debugLineNum = 815;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
Debug.ShouldStop(16384);
_list1 = _stringutils1.LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);Debug.locals.put("List1", _list1);
 BA.debugLineNum = 816;BA.debugLine="Dim h(headers.Size) As String";
Debug.ShouldStop(32768);
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");Debug.locals.put("h", _h);
 BA.debugLineNum = 817;BA.debugLine="For i = 0 To headers.Size - 1";
Debug.ShouldStop(65536);
{
final int step580 = 1;
final int limit580 = (int) (_headers.getSize()-1);
for (_i = (int) (0); (step580 > 0 && _i <= limit580) || (step580 < 0 && _i >= limit580); _i = ((int)(0 + _i + step580))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 818;BA.debugLine="h(i) = headers.get(i)";
Debug.ShouldStop(131072);
_h[_i] = BA.ObjectToString(_headers.Get(_i));Debug.locals.put("h", _h);
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 821;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
Debug.ShouldStop(1048576);
_list1 = _stringutils1.LoadCSV(_dir,_filename,BA.ObjectToChar(","));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 822;BA.debugLine="Dim firstRow() As String";
Debug.ShouldStop(2097152);
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 823;BA.debugLine="firstRow = List1.get(0)";
Debug.ShouldStop(4194304);
_firstrow = (String[])(_list1.Get((int) (0)));Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 824;BA.debugLine="Dim h(firstRow.Length) As String";
Debug.ShouldStop(8388608);
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");Debug.locals.put("h", _h);
 BA.debugLineNum = 825;BA.debugLine="For i = 0 To firstRow.Length - 1";
Debug.ShouldStop(16777216);
{
final int step588 = 1;
final int limit588 = (int) (_firstrow.length-1);
for (_i = (int) (0); (step588 > 0 && _i <= limit588) || (step588 < 0 && _i >= limit588); _i = ((int)(0 + _i + step588))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 826;BA.debugLine="h(i) = \"Col\" & (i + 1)";
Debug.ShouldStop(33554432);
_h[_i] = "Col"+BA.NumberToString((_i+1));Debug.locals.put("h", _h);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 829;BA.debugLine="innerClearAll(h.Length)";
Debug.ShouldStop(268435456);
_innerclearall(_h.length);
 BA.debugLineNum = 830;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
Debug.ShouldStop(536870912);
_columnwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 831;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
Debug.ShouldStop(1073741824);
_headerwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 832;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
Debug.ShouldStop(-2147483648);
_datawidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 833;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(1);
{
final int step596 = 1;
final int limit596 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step596 > 0 && _i <= limit596) || (step596 < 0 && _i >= limit596); _i = ((int)(0 + _i + step596))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 834;BA.debugLine="ColumnWidths(i) = SV.Width / NumberOfColumns";
Debug.ShouldStop(2);
_columnwidths[_i] = (int) (_sv.getWidth()/(double)_numberofcolumns);
 BA.debugLineNum = 835;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(4);
_headerwidths[_i] = _columnwidths[_i];
 BA.debugLineNum = 836;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
Debug.ShouldStop(8);
_datawidths[_i] = _columnwidths[_i];
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 838;BA.debugLine="SetHeader(h)";
Debug.ShouldStop(32);
_setheader(_h);
 BA.debugLineNum = 839;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(64);
_setcolumnswidths(_columnwidths);
 BA.debugLineNum = 841;BA.debugLine="For i = 0 To List1.Size - 1";
Debug.ShouldStop(256);
{
final int step603 = 1;
final int limit603 = (int) (_list1.getSize()-1);
for (_i = (int) (0); (step603 > 0 && _i <= limit603) || (step603 < 0 && _i >= limit603); _i = ((int)(0 + _i + step603))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 842;BA.debugLine="Dim row() As String";
Debug.ShouldStop(512);
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");Debug.locals.put("row", _row);
 BA.debugLineNum = 843;BA.debugLine="row = List1.get(i)";
Debug.ShouldStop(1024);
_row = (String[])(_list1.Get(_i));Debug.locals.put("row", _row);
 BA.debugLineNum = 844;BA.debugLine="AddRow(row)";
Debug.ShouldStop(2048);
_addrow(_row);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 846;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _loadtablefromcsv2(String _dir,String _filename,boolean _headersexist,String _separatorchar,boolean _automaticwidths) throws Exception{
try {
		Debug.PushSubsStack("LoadTableFromCSV2 (table) ","table",2,ba,this,853);
anywheresoftware.b4a.objects.collections.List _list1 = null;
String[] _h = null;
anywheresoftware.b4a.objects.collections.List _headers = null;
int _i = 0;
String[] _firstrow = null;
int _col = 0;
int _row = 0;
String[] _strrow = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("HeadersExist", _headersexist);
Debug.locals.put("SeparatorChar", _separatorchar);
Debug.locals.put("AutomaticWidths", _automaticwidths);
 BA.debugLineNum = 853;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filena";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 855;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(4194304);
_list1 = new anywheresoftware.b4a.objects.collections.List();Debug.locals.put("List1", _list1);
 BA.debugLineNum = 856;BA.debugLine="Dim h() As String";
Debug.ShouldStop(8388608);
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");Debug.locals.put("h", _h);
 BA.debugLineNum = 858;BA.debugLine="cAutomaticWidths = AutomaticWidths";
Debug.ShouldStop(33554432);
_cautomaticwidths = _automaticwidths;
 BA.debugLineNum = 860;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(134217728);
if (_headersexist) { 
 BA.debugLineNum = 861;BA.debugLine="Dim headers As List";
Debug.ShouldStop(268435456);
_headers = new anywheresoftware.b4a.objects.collections.List();Debug.locals.put("headers", _headers);
 BA.debugLineNum = 862;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, Sep";
Debug.ShouldStop(536870912);
_list1 = _stringutils1.LoadCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_headers);Debug.locals.put("List1", _list1);
 BA.debugLineNum = 863;BA.debugLine="Dim h(headers.Size) As String";
Debug.ShouldStop(1073741824);
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");Debug.locals.put("h", _h);
 BA.debugLineNum = 864;BA.debugLine="For i = 0 To headers.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step617 = 1;
final int limit617 = (int) (_headers.getSize()-1);
for (_i = (int) (0); (step617 > 0 && _i <= limit617) || (step617 < 0 && _i >= limit617); _i = ((int)(0 + _i + step617))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 865;BA.debugLine="h(i) = headers.get(i)";
Debug.ShouldStop(1);
_h[_i] = BA.ObjectToString(_headers.Get(_i));Debug.locals.put("h", _h);
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 868;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, Sepa";
Debug.ShouldStop(8);
_list1 = _stringutils1.LoadCSV(_dir,_filename,BA.ObjectToChar(_separatorchar));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 869;BA.debugLine="Dim firstRow() As String";
Debug.ShouldStop(16);
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 870;BA.debugLine="firstRow = List1.get(0)";
Debug.ShouldStop(32);
_firstrow = (String[])(_list1.Get((int) (0)));Debug.locals.put("firstRow", _firstrow);
 BA.debugLineNum = 871;BA.debugLine="Dim h(firstRow.Length) As String";
Debug.ShouldStop(64);
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");Debug.locals.put("h", _h);
 BA.debugLineNum = 872;BA.debugLine="For i = 0 To firstRow.Length - 1";
Debug.ShouldStop(128);
{
final int step625 = 1;
final int limit625 = (int) (_firstrow.length-1);
for (_i = (int) (0); (step625 > 0 && _i <= limit625) || (step625 < 0 && _i >= limit625); _i = ((int)(0 + _i + step625))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 873;BA.debugLine="h(i) = \"Col\" & (i + 1)";
Debug.ShouldStop(256);
_h[_i] = "Col"+BA.NumberToString((_i+1));Debug.locals.put("h", _h);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 876;BA.debugLine="innerClearAll(h.Length)";
Debug.ShouldStop(2048);
_innerclearall(_h.length);
 BA.debugLineNum = 877;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
Debug.ShouldStop(4096);
_columnwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 878;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
Debug.ShouldStop(8192);
_headerwidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 879;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
Debug.ShouldStop(16384);
_datawidths = new int[_numberofcolumns];
;
 BA.debugLineNum = 881;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(65536);
_col = 0;Debug.locals.put("col", _col);
_row = 0;Debug.locals.put("row", _row);
 BA.debugLineNum = 882;BA.debugLine="If AutomaticWidths = False Then";
Debug.ShouldStop(131072);
if (_automaticwidths==__c.False) { 
 BA.debugLineNum = 883;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(262144);
{
final int step635 = 1;
final int limit635 = (int) (_numberofcolumns-1);
for (_col = (int) (0); (step635 > 0 && _col <= limit635) || (step635 < 0 && _col >= limit635); _col = ((int)(0 + _col + step635))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 884;BA.debugLine="ColumnWidths(col) = SV.Width / NumberOfColumns";
Debug.ShouldStop(524288);
_columnwidths[_col] = (int) (_sv.getWidth()/(double)_numberofcolumns);
 BA.debugLineNum = 885;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
Debug.ShouldStop(1048576);
_headerwidths[_col] = _columnwidths[_col];
 BA.debugLineNum = 886;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
Debug.ShouldStop(2097152);
_datawidths[_col] = _columnwidths[_col];
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 889;BA.debugLine="If HeadersExist Then";
Debug.ShouldStop(16777216);
if (_headersexist) { 
 BA.debugLineNum = 890;BA.debugLine="Dim strRow(NumberOfColumns) As String";
Debug.ShouldStop(33554432);
_strrow = new String[_numberofcolumns];
java.util.Arrays.fill(_strrow,"");Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 891;BA.debugLine="strRow = List1.get(col)";
Debug.ShouldStop(67108864);
_strrow = (String[])(_list1.Get(_col));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 892;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(134217728);
{
final int step644 = 1;
final int limit644 = (int) (_numberofcolumns-1);
for (_col = (int) (0); (step644 > 0 && _col <= limit644) || (step644 < 0 && _col >= limit644); _col = ((int)(0 + _col + step644))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 893;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(hea";
Debug.ShouldStop(268435456);
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_headers.Get(_col)),__c.Typeface.DEFAULT,_ctextsize)+__c.DipToCurrent((int) (8))+_clinewidth);
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 896;BA.debugLine="For row = 0 To List1.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step648 = 1;
final int limit648 = (int) (_list1.getSize()-1);
for (_row = (int) (0); (step648 > 0 && _row <= limit648) || (step648 < 0 && _row >= limit648); _row = ((int)(0 + _row + step648))) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 897;BA.debugLine="Dim strRow(NumberOfColumns) As String";
Debug.ShouldStop(1);
_strrow = new String[_numberofcolumns];
java.util.Arrays.fill(_strrow,"");Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 898;BA.debugLine="strRow = List1.get(row)";
Debug.ShouldStop(2);
_strrow = (String[])(_list1.Get(_row));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 899;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(4);
{
final int step651 = 1;
final int limit651 = (int) (_numberofcolumns-1);
for (_col = (int) (0); (step651 > 0 && _col <= limit651) || (step651 < 0 && _col >= limit651); _col = ((int)(0 + _col + step651))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 900;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Mea";
Debug.ShouldStop(8);
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_strrow[_col],__c.Typeface.DEFAULT,_ctextsize)+__c.DipToCurrent((int) (8))+_clinewidth));
 }
}Debug.locals.put("col", _col);
;
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 903;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(64);
{
final int step655 = 1;
final int limit655 = (int) (_numberofcolumns-1);
for (_col = (int) (0); (step655 > 0 && _col <= limit655) || (step655 < 0 && _col >= limit655); _col = ((int)(0 + _col + step655))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 904;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
Debug.ShouldStop(128);
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 907;BA.debugLine="SetHeader(h)";
Debug.ShouldStop(1024);
_setheader(_h);
 BA.debugLineNum = 909;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(4096);
_setcolumnswidths(_columnwidths);
 BA.debugLineNum = 911;BA.debugLine="For i = 0 To List1.Size - 1";
Debug.ShouldStop(16384);
{
final int step661 = 1;
final int limit661 = (int) (_list1.getSize()-1);
for (_i = (int) (0); (step661 > 0 && _i <= limit661) || (step661 < 0 && _i >= limit661); _i = ((int)(0 + _i + step661))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 912;BA.debugLine="Dim strRow() As String";
Debug.ShouldStop(32768);
_strrow = new String[(int) (0)];
java.util.Arrays.fill(_strrow,"");Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 913;BA.debugLine="strRow = List1.get(i)";
Debug.ShouldStop(65536);
_strrow = (String[])(_list1.Get(_i));Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 914;BA.debugLine="AddRow(strRow)";
Debug.ShouldStop(131072);
_addrow(_strrow);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 916;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public int  _partition(int _left,int _right,int _pivotindex,int _col,boolean _dir) throws Exception{
try {
		Debug.PushSubsStack("Partition (table) ","table",2,ba,this,1374);
int _storeindex = 0;
String[] _pivotvalues = null;
String _pivotvalue = "";
int _i = 0;
String[] _values = null;
String _s = "";
Debug.locals.put("left", _left);
Debug.locals.put("right", _right);
Debug.locals.put("pivotIndex", _pivotindex);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1374;BA.debugLine="Public Sub Partition (left As Int, right As Int, p";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1375;BA.debugLine="Dim storeIndex As Int";
Debug.ShouldStop(1073741824);
_storeindex = 0;Debug.locals.put("storeIndex", _storeindex);
 BA.debugLineNum = 1376;BA.debugLine="Dim pivotValues() As String";
Debug.ShouldStop(-2147483648);
_pivotvalues = new String[(int) (0)];
java.util.Arrays.fill(_pivotvalues,"");Debug.locals.put("pivotValues", _pivotvalues);
 BA.debugLineNum = 1377;BA.debugLine="Dim pivotValue As String";
Debug.ShouldStop(1);
_pivotvalue = "";Debug.locals.put("pivotValue", _pivotvalue);
 BA.debugLineNum = 1378;BA.debugLine="pivotValues = Data.get(pivotIndex)";
Debug.ShouldStop(2);
_pivotvalues = (String[])(_data.Get(_pivotindex));Debug.locals.put("pivotValues", _pivotvalues);
 BA.debugLineNum = 1379;BA.debugLine="pivotValue = pivotValues(col)";
Debug.ShouldStop(4);
_pivotvalue = _pivotvalues[_col];Debug.locals.put("pivotValue", _pivotvalue);
 BA.debugLineNum = 1380;BA.debugLine="SwapList(pivotIndex, right)";
Debug.ShouldStop(8);
_swaplist(_pivotindex,_right);
 BA.debugLineNum = 1381;BA.debugLine="storeIndex = left";
Debug.ShouldStop(16);
_storeindex = _left;Debug.locals.put("storeIndex", _storeindex);
 BA.debugLineNum = 1382;BA.debugLine="For i = left To right - 1";
Debug.ShouldStop(32);
{
final int step996 = 1;
final int limit996 = (int) (_right-1);
for (_i = _left; (step996 > 0 && _i <= limit996) || (step996 < 0 && _i >= limit996); _i = ((int)(0 + _i + step996))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1383;BA.debugLine="Dim values() As String = Data.get(i)";
Debug.ShouldStop(64);
_values = (String[])(_data.Get(_i));Debug.locals.put("values", _values);Debug.locals.put("values", _values);
 BA.debugLineNum = 1384;BA.debugLine="Dim s As String = values(col)";
Debug.ShouldStop(128);
_s = _values[_col];Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 1385;BA.debugLine="If (dir) Then";
Debug.ShouldStop(256);
if ((_dir)) { 
 BA.debugLineNum = 1386;BA.debugLine="If s.CompareTo(pivotValue) < 0 Then ' dir is <";
Debug.ShouldStop(512);
if (_s.compareTo(_pivotvalue)<0) { 
 BA.debugLineNum = 1387;BA.debugLine="SwapList(i, storeIndex)";
Debug.ShouldStop(1024);
_swaplist(_i,_storeindex);
 BA.debugLineNum = 1388;BA.debugLine="storeIndex = storeIndex + 1";
Debug.ShouldStop(2048);
_storeindex = (int) (_storeindex+1);Debug.locals.put("storeIndex", _storeindex);
 };
 }else {
 BA.debugLineNum = 1391;BA.debugLine="If s.CompareTo(pivotValue) > 0 Then ' dir is <";
Debug.ShouldStop(16384);
if (_s.compareTo(_pivotvalue)>0) { 
 BA.debugLineNum = 1392;BA.debugLine="SwapList(i, storeIndex)";
Debug.ShouldStop(32768);
_swaplist(_i,_storeindex);
 BA.debugLineNum = 1393;BA.debugLine="storeIndex = storeIndex + 1";
Debug.ShouldStop(65536);
_storeindex = (int) (_storeindex+1);Debug.locals.put("storeIndex", _storeindex);
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1397;BA.debugLine="SwapList(storeIndex, right)";
Debug.ShouldStop(1048576);
_swaplist(_storeindex,_right);
 BA.debugLineNum = 1398;BA.debugLine="Return storeIndex";
Debug.ShouldStop(2097152);
if (true) return _storeindex;
 BA.debugLineNum = 1399;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return 0;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _quicksort(int _left,int _right,int _col,boolean _dir) throws Exception{
try {
		Debug.PushSubsStack("QuickSort (table) ","table",2,ba,this,1362);
int _pivotindex = 0;
int _pivotnewindex = 0;
Debug.locals.put("left", _left);
Debug.locals.put("right", _right);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1362;BA.debugLine="Public Sub QuickSort (left As Int, right As Int, c";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1363;BA.debugLine="debug_counter = debug_counter +1";
Debug.ShouldStop(262144);
_debug_counter = (long) (_debug_counter+1);
 BA.debugLineNum = 1364;BA.debugLine="Log (\"counter=\" & debug_counter)";
Debug.ShouldStop(524288);
__c.Log("counter="+BA.NumberToString(_debug_counter));
 BA.debugLineNum = 1365;BA.debugLine="If right > left Then";
Debug.ShouldStop(1048576);
if (_right>_left) { 
 BA.debugLineNum = 1366;BA.debugLine="Dim pivotIndex, pivotNewIndex As Int";
Debug.ShouldStop(2097152);
_pivotindex = 0;Debug.locals.put("pivotIndex", _pivotindex);
_pivotnewindex = 0;Debug.locals.put("pivotNewIndex", _pivotnewindex);
 BA.debugLineNum = 1367;BA.debugLine="pivotIndex = Rnd(left, right + 1) 'max value is";
Debug.ShouldStop(4194304);
_pivotindex = __c.Rnd(_left,(int) (_right+1));Debug.locals.put("pivotIndex", _pivotindex);
 BA.debugLineNum = 1368;BA.debugLine="pivotNewIndex = Partition(left, right, pivotInde";
Debug.ShouldStop(8388608);
_pivotnewindex = _partition(_left,_right,_pivotindex,_col,_dir);Debug.locals.put("pivotNewIndex", _pivotnewindex);
 BA.debugLineNum = 1369;BA.debugLine="QuickSort(left, pivotNewIndex - 1, col, dir)";
Debug.ShouldStop(16777216);
_quicksort(_left,(int) (_pivotnewindex-1),_col,_dir);
 BA.debugLineNum = 1370;BA.debugLine="QuickSort(pivotNewIndex + 1, right, col, dir)";
Debug.ShouldStop(33554432);
_quicksort((int) (_pivotnewindex+1),_right,_col,_dir);
 };
 BA.debugLineNum = 1372;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _refreshtable() throws Exception{
try {
		Debug.PushSubsStack("refreshTable (table) ","table",2,ba,this,1055);
int _i = 0;
 BA.debugLineNum = 1055;BA.debugLine="Private Sub refreshTable";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1056;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.V";
Debug.ShouldStop(-2147483648);
_sv_scrollchanged(_sv.getHorizontalScrollPosition(),_sv.getVerticalScrollPosition());
 BA.debugLineNum = 1057;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
Debug.ShouldStop(1);
{
final int step762 = 1;
final int limit762 = _maxvisiblerow;
for (_i = _minvisiblerow; (step762 > 0 && _i <= limit762) || (step762 < 0 && _i >= limit762); _i = ((int)(0 + _i + step762))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1058;BA.debugLine="HideRow(i)";
Debug.ShouldStop(2);
_hiderow(_i);
 BA.debugLineNum = 1059;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(4);
_showrow(_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1061;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _removerow(int _row) throws Exception{
try {
		Debug.PushSubsStack("RemoveRow (table) ","table",2,ba,this,932);
int _previndex = 0;
int _i = 0;
int _keepsel = 0;
Debug.locals.put("row", _row);
 BA.debugLineNum = 932;BA.debugLine="Public Sub RemoveRow(row As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 933;BA.debugLine="If (row <0 OR row > Data.Size-1) Then Return ' ca";
Debug.ShouldStop(16);
if ((_row<0 || _row>_data.getSize()-1)) { 
if (true) return "";};
 BA.debugLineNum = 935;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.V";
Debug.ShouldStop(64);
_sv_scrollchanged(_sv.getHorizontalScrollPosition(),_sv.getVerticalScrollPosition());
 BA.debugLineNum = 939;BA.debugLine="Dim prevIndex As Int";
Debug.ShouldStop(1024);
_previndex = 0;Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 940;BA.debugLine="prevIndex = SelectedRows.IndexOf(row) ' if the rm";
Debug.ShouldStop(2048);
_previndex = _selectedrows.IndexOf((Object)(_row));Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 942;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
Debug.ShouldStop(8192);
{
final int step681 = 1;
final int limit681 = (int) (_selectedrows.getSize()-1);
for (_i = (int) (0); (step681 > 0 && _i <= limit681) || (step681 < 0 && _i >= limit681); _i = ((int)(0 + _i + step681))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 943;BA.debugLine="Dim keepSel As Int";
Debug.ShouldStop(16384);
_keepsel = 0;Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 944;BA.debugLine="keepSel = SelectedRows.get(i)";
Debug.ShouldStop(32768);
_keepsel = (int)(BA.ObjectToNumber(_selectedrows.Get(_i)));Debug.locals.put("keepSel", _keepsel);
 BA.debugLineNum = 945;BA.debugLine="If (keepSel > row) Then";
Debug.ShouldStop(65536);
if ((_keepsel>_row)) { 
 BA.debugLineNum = 946;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number";
Debug.ShouldStop(131072);
_selectedrows.Set(_i,(Object)(_keepsel-1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 951;BA.debugLine="If (prevIndex <> -1) Then";
Debug.ShouldStop(4194304);
if ((_previndex!=-1)) { 
 BA.debugLineNum = 953;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the c";
Debug.ShouldStop(16777216);
_selectedrows.RemoveAt(_previndex);
 };
 BA.debugLineNum = 956;BA.debugLine="Data.RemoveAt(row)";
Debug.ShouldStop(134217728);
_data.RemoveAt(_row);
 BA.debugLineNum = 957;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
Debug.ShouldStop(268435456);
{
final int step692 = 1;
final int limit692 = _maxvisiblerow;
for (_i = _minvisiblerow; (step692 > 0 && _i <= limit692) || (step692 < 0 && _i >= limit692); _i = ((int)(0 + _i + step692))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 958;BA.debugLine="HideRow(i)";
Debug.ShouldStop(536870912);
_hiderow(_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 969;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(256);
if (_data.getSize()>0) { 
 BA.debugLineNum = 970;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1";
Debug.ShouldStop(512);
_maxvisiblerow = (int) (__c.Min(_maxvisiblerow,_data.getSize()-1));
 BA.debugLineNum = 971;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1";
Debug.ShouldStop(1024);
_minvisiblerow = (int) (__c.Min(_minvisiblerow,_data.getSize()-1));
 BA.debugLineNum = 972;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show al";
Debug.ShouldStop(2048);
{
final int step698 = 1;
final int limit698 = _maxvisiblerow;
for (_i = _minvisiblerow; (step698 > 0 && _i <= limit698) || (step698 < 0 && _i >= limit698); _i = ((int)(0 + _i + step698))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 974;BA.debugLine="ShowRow(i)";
Debug.ShouldStop(8192);
_showrow(_i);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 978;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
Debug.ShouldStop(131072);
_sv.getPanel().setHeight((int) (_data.getSize()*_crowheight));
 BA.debugLineNum = 979;BA.debugLine="updateIPLocation";
Debug.ShouldStop(262144);
_updateiplocation();
 BA.debugLineNum = 981;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,Min(";
Debug.ShouldStop(1048576);
_sv_scrollchanged(_sv.getHorizontalScrollPosition(),(int) (__c.Min(_sv.getVerticalScrollPosition(),_sv.getPanel().getHeight())));
 BA.debugLineNum = 982;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusL";
Debug.ShouldStop(2097152);
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 BA.debugLineNum = 983;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _removeview() throws Exception{
try {
		Debug.PushSubsStack("RemoveView (table) ","table",2,ba,this,1666);
 BA.debugLineNum = 1666;BA.debugLine="Public Sub RemoveView";
Debug.ShouldStop(2);
 BA.debugLineNum = 1667;BA.debugLine="pnlTable.RemoveView";
Debug.ShouldStop(4);
_pnltable.RemoveView();
 BA.debugLineNum = 1668;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _savetabletocsv(String _dir,String _filename) throws Exception{
try {
		Debug.PushSubsStack("SaveTableToCSV (table) ","table",2,ba,this,919);
String[] _headers = null;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 919;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 920;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(8388608);
_headers = new String[_numberofcolumns];
java.util.Arrays.fill(_headers,"");Debug.locals.put("headers", _headers);
 BA.debugLineNum = 921;BA.debugLine="For i = 0 To headers.Length - 1";
Debug.ShouldStop(16777216);
{
final int step669 = 1;
final int limit669 = (int) (_headers.length-1);
for (_i = (int) (0); (step669 > 0 && _i <= limit669) || (step669 < 0 && _i >= limit669); _i = ((int)(0 + _i + step669))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 922;BA.debugLine="Dim L As Label";
Debug.ShouldStop(33554432);
_l = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("L", _l);
 BA.debugLineNum = 923;BA.debugLine="L = Header.GetView(i)";
Debug.ShouldStop(67108864);
_l.setObject((android.widget.TextView)(_header.GetView(_i).getObject()));
 BA.debugLineNum = 924;BA.debugLine="headers(i) = L.Text";
Debug.ShouldStop(134217728);
_headers[_i] = _l.getText();Debug.locals.put("headers", _headers);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 926;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, h";
Debug.ShouldStop(536870912);
_stringutils1.SaveCSV2(_dir,_filename,BA.ObjectToChar(","),_data,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
 BA.debugLineNum = 927;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _selectionsort(int _col,boolean _dir) throws Exception{
try {
		Debug.PushSubsStack("SelectionSort (table) ","table",2,ba,this,1284);
int _minindex = 0;
int _i = 0;
int _j = 0;
String[] _values1 = null;
String _s1 = "";
String[] _values2 = null;
String _s2 = "";
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1284;BA.debugLine="Public Sub SelectionSort (col As Int, dir As Boole";
Debug.ShouldStop(8);
 BA.debugLineNum = 1285;BA.debugLine="Dim minIndex As Int";
Debug.ShouldStop(16);
_minindex = 0;Debug.locals.put("minIndex", _minindex);
 BA.debugLineNum = 1286;BA.debugLine="For i = 0 To Data.Size- 1";
Debug.ShouldStop(32);
{
final int step927 = 1;
final int limit927 = (int) (_data.getSize()-1);
for (_i = (int) (0); (step927 > 0 && _i <= limit927) || (step927 < 0 && _i >= limit927); _i = ((int)(0 + _i + step927))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1287;BA.debugLine="minIndex = i";
Debug.ShouldStop(64);
_minindex = _i;Debug.locals.put("minIndex", _minindex);
 BA.debugLineNum = 1288;BA.debugLine="For j = i + 1 To Data.Size - 1";
Debug.ShouldStop(128);
{
final int step929 = 1;
final int limit929 = (int) (_data.getSize()-1);
for (_j = (int) (_i+1); (step929 > 0 && _j <= limit929) || (step929 < 0 && _j >= limit929); _j = ((int)(0 + _j + step929))) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1289;BA.debugLine="Dim values1() As String = Data.get(j)";
Debug.ShouldStop(256);
_values1 = (String[])(_data.Get(_j));Debug.locals.put("values1", _values1);Debug.locals.put("values1", _values1);
 BA.debugLineNum = 1290;BA.debugLine="Dim s1 As String = values1(col)";
Debug.ShouldStop(512);
_s1 = _values1[_col];Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 1291;BA.debugLine="Dim values2() As String = Data.get(minIndex)";
Debug.ShouldStop(1024);
_values2 = (String[])(_data.Get(_minindex));Debug.locals.put("values2", _values2);Debug.locals.put("values2", _values2);
 BA.debugLineNum = 1292;BA.debugLine="Dim s2 As String = values2(col)";
Debug.ShouldStop(2048);
_s2 = _values2[_col];Debug.locals.put("s2", _s2);Debug.locals.put("s2", _s2);
 BA.debugLineNum = 1293;BA.debugLine="If (dir) Then";
Debug.ShouldStop(4096);
if ((_dir)) { 
 BA.debugLineNum = 1294;BA.debugLine="If s1.CompareTo(s2) < 0 Then minIndex = j";
Debug.ShouldStop(8192);
if (_s1.compareTo(_s2)<0) { 
_minindex = _j;Debug.locals.put("minIndex", _minindex);};
 }else {
 BA.debugLineNum = 1296;BA.debugLine="If s1.CompareTo(s2) > 0 Then minIndex = j";
Debug.ShouldStop(32768);
if (_s1.compareTo(_s2)>0) { 
_minindex = _j;Debug.locals.put("minIndex", _minindex);};
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1299;BA.debugLine="SwapList(i, minIndex)";
Debug.ShouldStop(262144);
_swaplist(_i,_minindex);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1301;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _selectionsortnum(int _col,boolean _dir) throws Exception{
try {
		Debug.PushSubsStack("SelectionSortNum (table) ","table",2,ba,this,1318);
int _minindex = 0;
int _i = 0;
int _j = 0;
String[] _values1 = null;
double _s1 = 0;
String[] _values2 = null;
double _s2 = 0;
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1318;BA.debugLine="Public Sub SelectionSortNum (col As Int,dir As Boo";
Debug.ShouldStop(32);
 BA.debugLineNum = 1319;BA.debugLine="Dim minIndex As Int";
Debug.ShouldStop(64);
_minindex = 0;Debug.locals.put("minIndex", _minindex);
 BA.debugLineNum = 1320;BA.debugLine="For i = 0 To Data.Size- 1";
Debug.ShouldStop(128);
{
final int step952 = 1;
final int limit952 = (int) (_data.getSize()-1);
for (_i = (int) (0); (step952 > 0 && _i <= limit952) || (step952 < 0 && _i >= limit952); _i = ((int)(0 + _i + step952))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1321;BA.debugLine="minIndex = i";
Debug.ShouldStop(256);
_minindex = _i;Debug.locals.put("minIndex", _minindex);
 BA.debugLineNum = 1322;BA.debugLine="For j = i + 1 To Data.Size - 1";
Debug.ShouldStop(512);
{
final int step954 = 1;
final int limit954 = (int) (_data.getSize()-1);
for (_j = (int) (_i+1); (step954 > 0 && _j <= limit954) || (step954 < 0 && _j >= limit954); _j = ((int)(0 + _j + step954))) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1323;BA.debugLine="Dim values1() As String = Data.get(j)";
Debug.ShouldStop(1024);
_values1 = (String[])(_data.Get(_j));Debug.locals.put("values1", _values1);Debug.locals.put("values1", _values1);
 BA.debugLineNum = 1324;BA.debugLine="Dim s1 As Double = values1(col)";
Debug.ShouldStop(2048);
_s1 = (double)(Double.parseDouble(_values1[_col]));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 1325;BA.debugLine="Dim values2() As String = Data.get(minIndex)";
Debug.ShouldStop(4096);
_values2 = (String[])(_data.Get(_minindex));Debug.locals.put("values2", _values2);Debug.locals.put("values2", _values2);
 BA.debugLineNum = 1326;BA.debugLine="Dim s2 As Double = values2(col)";
Debug.ShouldStop(8192);
_s2 = (double)(Double.parseDouble(_values2[_col]));Debug.locals.put("s2", _s2);Debug.locals.put("s2", _s2);
 BA.debugLineNum = 1327;BA.debugLine="If (dir) Then";
Debug.ShouldStop(16384);
if ((_dir)) { 
 BA.debugLineNum = 1328;BA.debugLine="If s1 < s2 Then minIndex = j";
Debug.ShouldStop(32768);
if (_s1<_s2) { 
_minindex = _j;Debug.locals.put("minIndex", _minindex);};
 }else {
 BA.debugLineNum = 1330;BA.debugLine="If s1 > s2 Then minIndex = j";
Debug.ShouldStop(131072);
if (_s1>_s2) { 
_minindex = _j;Debug.locals.put("minIndex", _minindex);};
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1333;BA.debugLine="SwapList(i, minIndex)";
Debug.ShouldStop(1048576);
_swaplist(_i,_minindex);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1335;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _selectrow(b4a.example.table._rowcol _rc) throws Exception{
try {
		Debug.PushSubsStack("SelectRow (table) ","table",2,ba,this,731);
int _previndex = 0;
int _prev = 0;
Debug.locals.put("rc", _rc);
 BA.debugLineNum = 731;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 732;BA.debugLine="If Not(cAllowSelection) Then Return";
Debug.ShouldStop(134217728);
if (__c.Not(_callowselection)) { 
if (true) return "";};
 BA.debugLineNum = 734;BA.debugLine="Dim prevIndex As Int";
Debug.ShouldStop(536870912);
_previndex = 0;Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 735;BA.debugLine="Dim prev As Int ' if we select an alreday selecte";
Debug.ShouldStop(1073741824);
_prev = 0;Debug.locals.put("prev", _prev);
 BA.debugLineNum = 737;BA.debugLine="prevIndex = SelectedRows.indexof(rc.row)	 ' -1 if";
Debug.ShouldStop(1);
_previndex = _selectedrows.IndexOf((Object)(_rc.row));Debug.locals.put("prevIndex", _previndex);
 BA.debugLineNum = 738;BA.debugLine="If (prevIndex <> -1 AND IsMultiSelect = False) Th";
Debug.ShouldStop(2);
if ((_previndex!=-1 && _ismultiselect==__c.False)) { 
 BA.debugLineNum = 740;BA.debugLine="SelectedCol = rc.col";
Debug.ShouldStop(8);
_selectedcol = _rc.Col;
 BA.debugLineNum = 741;BA.debugLine="If visibleRows.ContainsKey(rc.row) Then";
Debug.ShouldStop(16);
if (_visiblerows.ContainsKey((Object)(_rc.row))) { 
 BA.debugLineNum = 742;BA.debugLine="HideRow(rc.row)";
Debug.ShouldStop(32);
_hiderow(_rc.row);
 BA.debugLineNum = 743;BA.debugLine="ShowRow(rc.row)";
Debug.ShouldStop(64);
_showrow(_rc.row);
 };
 BA.debugLineNum = 745;BA.debugLine="Return	' comment this line if you want to unsele";
Debug.ShouldStop(256);
if (true) return "";
 };
 BA.debugLineNum = 748;BA.debugLine="If (prevIndex = -1) Then";
Debug.ShouldStop(2048);
if ((_previndex==-1)) { 
 BA.debugLineNum = 749;BA.debugLine="If (IsMultiSelect) Then";
Debug.ShouldStop(4096);
if ((_ismultiselect)) { 
 BA.debugLineNum = 750;BA.debugLine="SelectedRows.add(rc.row) 'Select the new row";
Debug.ShouldStop(8192);
_selectedrows.Add((Object)(_rc.row));
 BA.debugLineNum = 751;BA.debugLine="prev = -1";
Debug.ShouldStop(16384);
_prev = (int) (-1);Debug.locals.put("prev", _prev);
 }else {
 BA.debugLineNum = 755;BA.debugLine="If (SelectedRows.Size <> 0) Then";
Debug.ShouldStop(262144);
if ((_selectedrows.getSize()!=0)) { 
 BA.debugLineNum = 756;BA.debugLine="prev = SelectedRows.get(0) ' there should be o";
Debug.ShouldStop(524288);
_prev = (int)(BA.ObjectToNumber(_selectedrows.Get((int) (0))));Debug.locals.put("prev", _prev);
 BA.debugLineNum = 757;BA.debugLine="SelectedRows.set(0,rc.row) ' change it to the";
Debug.ShouldStop(1048576);
_selectedrows.Set((int) (0),(Object)(_rc.row));
 }else {
 BA.debugLineNum = 759;BA.debugLine="prev = -1";
Debug.ShouldStop(4194304);
_prev = (int) (-1);Debug.locals.put("prev", _prev);
 BA.debugLineNum = 760;BA.debugLine="SelectedRows.Add(rc.row)";
Debug.ShouldStop(8388608);
_selectedrows.Add((Object)(_rc.row));
 };
 };
 }else {
 BA.debugLineNum = 765;BA.debugLine="prev = SelectedRows.get(prevIndex) ' should be R";
Debug.ShouldStop(268435456);
_prev = (int)(BA.ObjectToNumber(_selectedrows.Get(_previndex)));Debug.locals.put("prev", _prev);
 BA.debugLineNum = 766;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the";
Debug.ShouldStop(536870912);
_selectedrows.RemoveAt(_previndex);
 };
 BA.debugLineNum = 769;BA.debugLine="If prev > -1 Then";
Debug.ShouldStop(1);
if (_prev>-1) { 
 BA.debugLineNum = 770;BA.debugLine="If visibleRows.ContainsKey(rc.row) Then";
Debug.ShouldStop(2);
if (_visiblerows.ContainsKey((Object)(_rc.row))) { 
 BA.debugLineNum = 771;BA.debugLine="HideRow(prev)";
Debug.ShouldStop(4);
_hiderow(_prev);
 BA.debugLineNum = 772;BA.debugLine="ShowRow(prev)";
Debug.ShouldStop(8);
_showrow(_prev);
 };
 };
 BA.debugLineNum = 776;BA.debugLine="SelectedCol = rc.col";
Debug.ShouldStop(128);
_selectedcol = _rc.Col;
 BA.debugLineNum = 777;BA.debugLine="If visibleRows.ContainsKey(rc.row) Then";
Debug.ShouldStop(256);
if (_visiblerows.ContainsKey((Object)(_rc.row))) { 
 BA.debugLineNum = 778;BA.debugLine="HideRow(rc.row)";
Debug.ShouldStop(512);
_hiderow(_rc.row);
 BA.debugLineNum = 779;BA.debugLine="ShowRow(rc.row)";
Debug.ShouldStop(1024);
_showrow(_rc.row);
 };
 BA.debugLineNum = 781;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setallowselection(boolean _allowselection) throws Exception{
try {
		Debug.PushSubsStack("setAllowSelection (table) ","table",2,ba,this,1082);
Debug.locals.put("AllowSelection", _allowselection);
 BA.debugLineNum = 1082;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boo";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1083;BA.debugLine="cAllowSelection = AllowSelection";
Debug.ShouldStop(67108864);
_callowselection = _allowselection;
 BA.debugLineNum = 1084;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(134217728);
if (_pnltable.IsInitialized()) { 
 BA.debugLineNum = 1085;BA.debugLine="clearSelection";
Debug.ShouldStop(268435456);
_clearselection();
 };
 BA.debugLineNum = 1087;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setcellalignment(int _alignment) throws Exception{
try {
		Debug.PushSubsStack("setCellAlignment (table) ","table",2,ba,this,1429);
int _i = 0;
Debug.locals.put("Alignment", _alignment);
 BA.debugLineNum = 1429;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1430;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2097152);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 1432;BA.debugLine="cAlignment = Alignment";
Debug.ShouldStop(8388608);
_calignment = _alignment;
 BA.debugLineNum = 1433;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(16777216);
{
final int step1034 = 1;
final int limit1034 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step1034 > 0 && _i <= limit1034) || (step1034 < 0 && _i >= limit1034); _i = ((int)(0 + _i + step1034))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1434;BA.debugLine="cAlignments(i) = cAlignment";
Debug.ShouldStop(33554432);
_calignments[_i] = _calignment;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1436;BA.debugLine="MultiAlignments = False";
Debug.ShouldStop(134217728);
_multialignments = __c.False;
 BA.debugLineNum = 1437;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(268435456);
if (_data.getSize()>0) { 
 BA.debugLineNum = 1438;BA.debugLine="refreshTable";
Debug.ShouldStop(536870912);
_refreshtable();
 };
 BA.debugLineNum = 1440;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setcellalignments(int[] _alignments) throws Exception{
try {
		Debug.PushSubsStack("SetCellAlignments (table) ","table",2,ba,this,1405);
int _i = 0;
Debug.locals.put("Alignments", _alignments);
 BA.debugLineNum = 1405;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1406;BA.debugLine="Dim i As Int";
Debug.ShouldStop(536870912);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 1408;BA.debugLine="If Alignments.Length <> NumberOfColumns Then";
Debug.ShouldStop(-2147483648);
if (_alignments.length!=_numberofcolumns) { 
 BA.debugLineNum = 1409;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
Debug.ShouldStop(1);
__c.ToastMessageShow("The number of aligments is not equal to the number of columns.",__c.False);
 BA.debugLineNum = 1410;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return "";
 };
 BA.debugLineNum = 1413;BA.debugLine="Dim i As Int";
Debug.ShouldStop(16);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 1414;BA.debugLine="Dim cAlignments0(NumberOfColumns) As Int";
Debug.ShouldStop(32);
_calignments0 = new int[_numberofcolumns];
;
 BA.debugLineNum = 1416;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(128);
{
final int step1022 = 1;
final int limit1022 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step1022 > 0 && _i <= limit1022) || (step1022 < 0 && _i >= limit1022); _i = ((int)(0 + _i + step1022))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1417;BA.debugLine="cAlignments0 = Alignments";
Debug.ShouldStop(256);
_calignments0 = _alignments;
 BA.debugLineNum = 1418;BA.debugLine="cAlignments = cAlignments0";
Debug.ShouldStop(512);
_calignments = _calignments0;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1420;BA.debugLine="MultiAlignments = True";
Debug.ShouldStop(2048);
_multialignments = __c.True;
 BA.debugLineNum = 1421;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(4096);
if (_data.getSize()>0) { 
 BA.debugLineNum = 1422;BA.debugLine="refreshTable";
Debug.ShouldStop(8192);
_refreshtable();
 };
 BA.debugLineNum = 1424;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setcolumncolors(int[] _columncolors) throws Exception{
try {
		Debug.PushSubsStack("SetColumnColors (table) ","table",2,ba,this,1718);
Debug.locals.put("ColumnColors", _columncolors);
 BA.debugLineNum = 1718;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1719;BA.debugLine="cColumnColors = ColumnColors";
Debug.ShouldStop(4194304);
_ccolumncolors = _columncolors;
 BA.debugLineNum = 1720;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setcolumnswidths(int[] _widths) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsWidths (table) ","table",2,ba,this,217);
int _col = 0;
int _row = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _w = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 217;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 219;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(67108864);
_col = 0;Debug.locals.put("col", _col);
_row = 0;Debug.locals.put("row", _row);
 BA.debugLineNum = 221;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
Debug.ShouldStop(268435456);
_savedwidths = new int[_widths.length];
;
 BA.debugLineNum = 222;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
Debug.ShouldStop(536870912);
_columnwidths = new int[_widths.length];
;
 BA.debugLineNum = 223;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
Debug.ShouldStop(1073741824);
_headerwidths = new int[_widths.length];
;
 BA.debugLineNum = 224;BA.debugLine="If cAutomaticWidths = False Then";
Debug.ShouldStop(-2147483648);
if (_cautomaticwidths==__c.False) { 
 BA.debugLineNum = 225;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(1);
{
final int step84 = 1;
final int limit84 = (int) (_widths.length-1);
for (_col = (int) (0); (step84 > 0 && _col <= limit84) || (step84 < 0 && _col >= limit84); _col = ((int)(0 + _col + step84))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 226;BA.debugLine="SavedWidths(col) = Widths(col)";
Debug.ShouldStop(2);
_savedwidths[_col] = _widths[_col];
 BA.debugLineNum = 227;BA.debugLine="ColumnWidths(col) = Widths(col)";
Debug.ShouldStop(4);
_columnwidths[_col] = _widths[_col];
 BA.debugLineNum = 228;BA.debugLine="HeaderWidths(col) = Widths(col)";
Debug.ShouldStop(8);
_headerwidths[_col] = _widths[_col];
 BA.debugLineNum = 229;BA.debugLine="DataWidths(col) = Widths(col)";
Debug.ShouldStop(16);
_datawidths[_col] = _widths[_col];
 }
}Debug.locals.put("col", _col);
;
 }else {
 BA.debugLineNum = 232;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(128);
{
final int step91 = 1;
final int limit91 = (int) (_widths.length-1);
for (_col = (int) (0); (step91 > 0 && _col <= limit91) || (step91 < 0 && _col >= limit91); _col = ((int)(0 + _col + step91))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 233;BA.debugLine="SavedWidths(col) = Widths(col)";
Debug.ShouldStop(256);
_savedwidths[_col] = _widths[_col];
 BA.debugLineNum = 234;BA.debugLine="ColumnWidths(col) = Widths(col)";
Debug.ShouldStop(512);
_columnwidths[_col] = _widths[_col];
 }
}Debug.locals.put("col", _col);
;
 };
 BA.debugLineNum = 238;BA.debugLine="Dim v As View";
Debug.ShouldStop(8192);
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();Debug.locals.put("v", _v);
 BA.debugLineNum = 239;BA.debugLine="Dim w As Int";
Debug.ShouldStop(16384);
_w = 0;Debug.locals.put("w", _w);
 BA.debugLineNum = 240;BA.debugLine="For col = 0 To Widths.Length - 1";
Debug.ShouldStop(32768);
{
final int step98 = 1;
final int limit98 = (int) (_widths.length-1);
for (_col = (int) (0); (step98 > 0 && _col <= limit98) || (step98 < 0 && _col >= limit98); _col = ((int)(0 + _col + step98))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 241;BA.debugLine="v = Header.GetView(col)";
Debug.ShouldStop(65536);
_v = _header.GetView(_col);Debug.locals.put("v", _v);
 BA.debugLineNum = 242;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
Debug.ShouldStop(131072);
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-_clinewidth));Debug.locals.put("w", _w);
 BA.debugLineNum = 243;BA.debugLine="v.Width = w";
Debug.ShouldStop(262144);
_v.setWidth(_w);
 BA.debugLineNum = 244;BA.debugLine="If col > 0 Then";
Debug.ShouldStop(524288);
if (_col>0) { 
 BA.debugLineNum = 245;BA.debugLine="v.Left = Header.GetView(col - 1).Left + Widths(";
Debug.ShouldStop(1048576);
_v.setLeft((int) (_header.GetView((int) (_col-1)).getLeft()+_widths[(int) (_col-1)]));
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 248;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1).";
Debug.ShouldStop(8388608);
_header.setWidth((int) (_header.GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
 BA.debugLineNum = 249;BA.debugLine="SV.Panel.Width = Header.Width";
Debug.ShouldStop(16777216);
_sv.getPanel().setWidth(_header.getWidth());
 BA.debugLineNum = 250;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(33554432);
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 251;BA.debugLine="For row = 0 To visibleRows.Size - 1";
Debug.ShouldStop(67108864);
{
final int step109 = 1;
final int limit109 = (int) (_visiblerows.getSize()-1);
for (_row = (int) (0); (step109 > 0 && _row <= limit109) || (step109 < 0 && _row >= limit109); _row = ((int)(0 + _row + step109))) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 252;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
Debug.ShouldStop(134217728);
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.GetValueAt(_row));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 253;BA.debugLine="For col = 0 To lbls.Length - 1";
Debug.ShouldStop(268435456);
{
final int step111 = 1;
final int limit111 = (int) (_lbls.length-1);
for (_col = (int) (0); (step111 > 0 && _col <= limit111) || (step111 < 0 && _col >= limit111); _col = ((int)(0 + _col + step111))) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 254;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left, l";
Debug.ShouldStop(536870912);
_lbls[_col].SetLayout(_header.GetView(_col).getLeft(),_lbls[_col].getTop(),_header.GetView(_col).getWidth(),(int) (_crowheight-_clinewidth));
 }
}Debug.locals.put("col", _col);
;
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 258;BA.debugLine="lblStatusLine.Width = Header.Width";
Debug.ShouldStop(2);
_lblstatusline.setWidth(_header.getWidth());
 BA.debugLineNum = 259;BA.debugLine="internalPanel.Width = Header.Width";
Debug.ShouldStop(4);
_internalpanel.setWidth(_header.getWidth());
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setheader(String[] _values) throws Exception{
try {
		Debug.PushSubsStack("SetHeader (table) ","table",2,ba,this,615);
int _i = 0;
int _left = 0;
int _change = 0;
int _w = 0;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _extrawidth = 0;
String[] _str = null;
int _j = 0;
Debug.locals.put("Values", _values);
 BA.debugLineNum = 615;BA.debugLine="Public Sub SetHeader(Values() As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 616;BA.debugLine="Dim i As Int";
Debug.ShouldStop(128);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 618;BA.debugLine="For i = Header.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(512);
{
final int step419 = (int) (-1);
final int limit419 = (int) (0);
for (_i = (int) (_header.getNumberOfViews()-1); (step419 > 0 && _i <= limit419) || (step419 < 0 && _i >= limit419); _i = ((int)(0 + _i + step419))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 619;BA.debugLine="Header.RemoveViewAt(i)";
Debug.ShouldStop(1024);
_header.RemoveViewAt(_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 622;BA.debugLine="HeaderNames.Initialize2(Values)";
Debug.ShouldStop(8192);
_headernames.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
 BA.debugLineNum = 624;BA.debugLine="Dim Left = 0 As Int";
Debug.ShouldStop(32768);
_left = (int) (0);Debug.locals.put("Left", _left);Debug.locals.put("Left", _left);
 BA.debugLineNum = 626;BA.debugLine="Dim Change = 0 As Int";
Debug.ShouldStop(131072);
_change = (int) (0);Debug.locals.put("Change", _change);Debug.locals.put("Change", _change);
 BA.debugLineNum = 627;BA.debugLine="Dim w As Int";
Debug.ShouldStop(262144);
_w = 0;Debug.locals.put("w", _w);
 BA.debugLineNum = 628;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(524288);
{
final int step426 = 1;
final int limit426 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step426 > 0 && _i <= limit426) || (step426 < 0 && _i >= limit426); _i = ((int)(0 + _i + step426))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 629;BA.debugLine="Dim L As Label";
Debug.ShouldStop(1048576);
_l = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("L", _l);
 BA.debugLineNum = 630;BA.debugLine="L.Initialize(\"header\")";
Debug.ShouldStop(2097152);
_l.Initialize(ba,"header");
 BA.debugLineNum = 631;BA.debugLine="L.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
_l.setGravity(__c.Gravity.CENTER);
 BA.debugLineNum = 632;BA.debugLine="L.TextSize = cTextSize";
Debug.ShouldStop(8388608);
_l.setTextSize(_ctextsize);
 BA.debugLineNum = 633;BA.debugLine="If cUseColumnColors = False Then";
Debug.ShouldStop(16777216);
if (_cusecolumncolors==__c.False) { 
 BA.debugLineNum = 634;BA.debugLine="L.Color = cHeaderColor";
Debug.ShouldStop(33554432);
_l.setColor(_cheadercolor);
 BA.debugLineNum = 635;BA.debugLine="L.TextColor = cHeaderTextColor";
Debug.ShouldStop(67108864);
_l.setTextColor(_cheadertextcolor);
 }else {
 BA.debugLineNum = 637;BA.debugLine="L.Color = cHeaderColors(i)";
Debug.ShouldStop(268435456);
_l.setColor(_cheadercolors[_i]);
 BA.debugLineNum = 638;BA.debugLine="L.TextColor = cHeaderTextColors(i)";
Debug.ShouldStop(536870912);
_l.setTextColor(_cheadertextcolors[_i]);
 };
 BA.debugLineNum = 641;BA.debugLine="L.Text = Values(i)";
Debug.ShouldStop(1);
_l.setText((Object)(_values[_i]));
 BA.debugLineNum = 642;BA.debugLine="L.Tag = i";
Debug.ShouldStop(2);
_l.setTag((Object)(_i));
 BA.debugLineNum = 644;BA.debugLine="w = Max(2dip, ColumnWidths(i) - cLineWidth)		' n";
Debug.ShouldStop(8);
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_columnwidths[_i]-_clinewidth));Debug.locals.put("w", _w);
 BA.debugLineNum = 645;BA.debugLine="Header.AddView(L, Left, 0, w, cRowHeight)";
Debug.ShouldStop(16);
_header.AddView((android.view.View)(_l.getObject()),_left,(int) (0),_w,_crowheight);
 BA.debugLineNum = 646;BA.debugLine="If cAutomaticWidths = True Then";
Debug.ShouldStop(32);
if (_cautomaticwidths==__c.True) { 
 BA.debugLineNum = 647;BA.debugLine="Dim ExtraWidth As Int";
Debug.ShouldStop(64);
_extrawidth = 0;Debug.locals.put("ExtraWidth", _extrawidth);
 BA.debugLineNum = 648;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
Debug.ShouldStop(128);
_extrawidth = (int) (__c.DipToCurrent((int) (8))+_clinewidth);Debug.locals.put("ExtraWidth", _extrawidth);
 BA.debugLineNum = 649;BA.debugLine="If Values(i).Contains(CRLF) Then";
Debug.ShouldStop(256);
if (_values[_i].contains(__c.CRLF)) { 
 BA.debugLineNum = 650;BA.debugLine="Dim str() As String";
Debug.ShouldStop(512);
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");Debug.locals.put("str", _str);
 BA.debugLineNum = 651;BA.debugLine="Dim j As Int";
Debug.ShouldStop(1024);
_j = 0;Debug.locals.put("j", _j);
 BA.debugLineNum = 652;BA.debugLine="str = Regex.Split(CRLF, Values(i))";
Debug.ShouldStop(2048);
_str = __c.Regex.Split(__c.CRLF,_values[_i]);Debug.locals.put("str", _str);
 BA.debugLineNum = 653;BA.debugLine="HeaderWidths(i) = cvs.MeasureStringWidth(str(0";
Debug.ShouldStop(4096);
_headerwidths[_i] = (int) (_cvs.MeasureStringWidth(_str[(int) (0)],_l.getTypeface(),_ctextsize)+_extrawidth);
 BA.debugLineNum = 654;BA.debugLine="For j = 1 To str.Length - 1";
Debug.ShouldStop(8192);
{
final int step450 = 1;
final int limit450 = (int) (_str.length-1);
for (_j = (int) (1); (step450 > 0 && _j <= limit450) || (step450 < 0 && _j >= limit450); _j = ((int)(0 + _j + step450))) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 655;BA.debugLine="HeaderWidths(i) = Max(HeaderWidths(i),cvs.Mea";
Debug.ShouldStop(16384);
_headerwidths[_i] = (int) (__c.Max(_headerwidths[_i],_cvs.MeasureStringWidth(_str[_j],_l.getTypeface(),_ctextsize)+_extrawidth));
 }
}Debug.locals.put("j", _j);
;
 }else {
 BA.debugLineNum = 658;BA.debugLine="HeaderWidths(i) = cvs.MeasureStringWidth(Value";
Debug.ShouldStop(131072);
_headerwidths[_i] = (int) (_cvs.MeasureStringWidth(_values[_i],_l.getTypeface(),_ctextsize)+_extrawidth);
 };
 BA.debugLineNum = 660;BA.debugLine="If HeaderWidths(i) > ColumnWidths(i) Then OR He";
Debug.ShouldStop(524288);
if (_headerwidths[_i]>_columnwidths[_i]) { 
 BA.debugLineNum = 661;BA.debugLine="Change = 1";
Debug.ShouldStop(1048576);
_change = (int) (1);Debug.locals.put("Change", _change);
 BA.debugLineNum = 662;BA.debugLine="ColumnWidths(i) = Max(HeaderWidths(i), ColumnW";
Debug.ShouldStop(2097152);
_columnwidths[_i] = (int) (__c.Max(_headerwidths[_i],_columnwidths[_i]));
 }else 
{ BA.debugLineNum = 663;BA.debugLine="Else If ColumnWidths(i) > HeaderWidths(i) AND C";
Debug.ShouldStop(4194304);
if (_columnwidths[_i]>_headerwidths[_i] && _columnwidths[_i]>_datawidths[_i]) { 
 BA.debugLineNum = 664;BA.debugLine="Change = 1";
Debug.ShouldStop(8388608);
_change = (int) (1);Debug.locals.put("Change", _change);
 BA.debugLineNum = 665;BA.debugLine="ColumnWidths(i) = Max(HeaderWidths(i), DataWid";
Debug.ShouldStop(16777216);
_columnwidths[_i] = (int) (__c.Max(_headerwidths[_i],_datawidths[_i]));
 }};
 };
 BA.debugLineNum = 668;BA.debugLine="Left = Left + ColumnWidths(i)";
Debug.ShouldStop(134217728);
_left = (int) (_left+_columnwidths[_i]);Debug.locals.put("Left", _left);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 671;BA.debugLine="If Change = 1 Then";
Debug.ShouldStop(1073741824);
if (_change==1) { 
 BA.debugLineNum = 672;BA.debugLine="SetColumnsWidths(ColumnWidths)";
Debug.ShouldStop(-2147483648);
_setcolumnswidths(_columnwidths);
 };
 BA.debugLineNum = 674;BA.debugLine="Header.Left = - SV.HorizontalScrollPosition";
Debug.ShouldStop(2);
_header.setLeft((int) (-_sv.getHorizontalScrollPosition()));
 BA.debugLineNum = 675;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setheadercolor(int _color) throws Exception{
try {
		Debug.PushSubsStack("setHeaderColor (table) ","table",2,ba,this,1456);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1456;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1457;BA.debugLine="cHeaderColor = Color";
Debug.ShouldStop(65536);
_cheadercolor = _color;
 BA.debugLineNum = 1458;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setheadercolors(int[] _headercolors) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderColors (table) ","table",2,ba,this,1736);
Debug.locals.put("HeaderColors", _headercolors);
 BA.debugLineNum = 1736;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 1737;BA.debugLine="cHeaderColors = HeaderColors";
Debug.ShouldStop(256);
_cheadercolors = _headercolors;
 BA.debugLineNum = 1738;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setheaderheight(int _height) throws Exception{
try {
		Debug.PushSubsStack("setHeaderHeight (table) ","table",2,ba,this,1447);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1447;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 1448;BA.debugLine="cHeaderHeight = Height";
Debug.ShouldStop(128);
_cheaderheight = _height;
 BA.debugLineNum = 1449;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setheadertextcolor(int _color) throws Exception{
try {
		Debug.PushSubsStack("setHeaderTextColor (table) ","table",2,ba,this,1465);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1465;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1466;BA.debugLine="cHeaderTextColor = Color";
Debug.ShouldStop(33554432);
_cheadertextcolor = _color;
 BA.debugLineNum = 1467;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setheadertextcolors(int[] _headertextcolors) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderTextColors (table) ","table",2,ba,this,1745);
Debug.locals.put("HeaderTextColors", _headertextcolors);
 BA.debugLineNum = 1745;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors()";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1746;BA.debugLine="cHeaderTextColors = HeaderTextColors";
Debug.ShouldStop(131072);
_cheadertextcolors = _headertextcolors;
 BA.debugLineNum = 1747;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setheight(int _height) throws Exception{
try {
		Debug.PushSubsStack("setHeight (table) ","table",2,ba,this,1179);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1179;BA.debugLine="Public Sub setHeight(Height As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1180;BA.debugLine="pnlTable.Height = Height";
Debug.ShouldStop(134217728);
_pnltable.setHeight(_height);
 BA.debugLineNum = 1181;BA.debugLine="If (showStatusLine = True) Then";
Debug.ShouldStop(268435456);
if ((_showstatusline==__c.True)) { 
 BA.debugLineNum = 1182;BA.debugLine="SV.Height = Height - (cRowHeight * 2)";
Debug.ShouldStop(536870912);
_sv.setHeight((int) (_height-(_crowheight*2)));
 }else {
 BA.debugLineNum = 1184;BA.debugLine="SV.Height = Height - (cRowHeight)";
Debug.ShouldStop(-2147483648);
_sv.setHeight((int) (_height-(_crowheight)));
 };
 BA.debugLineNum = 1186;BA.debugLine="lblStatusLine.Top = SV.Top + SV.Height";
Debug.ShouldStop(2);
_lblstatusline.setTop((int) (_sv.getTop()+_sv.getHeight()));
 BA.debugLineNum = 1187;BA.debugLine="updateIPLocation";
Debug.ShouldStop(4);
_updateiplocation();
 BA.debugLineNum = 1188;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setleft(int _left) throws Exception{
try {
		Debug.PushSubsStack("setLeft (table) ","table",2,ba,this,1149);
Debug.locals.put("Left", _left);
 BA.debugLineNum = 1149;BA.debugLine="Public Sub setLeft(Left As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1150;BA.debugLine="pnlTable.Left = Left";
Debug.ShouldStop(536870912);
_pnltable.setLeft(_left);
 BA.debugLineNum = 1151;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setlinewidth(int _linewidth) throws Exception{
try {
		Debug.PushSubsStack("setLineWidth (table) ","table",2,ba,this,1204);
Debug.locals.put("LineWidth", _linewidth);
 BA.debugLineNum = 1204;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1205;BA.debugLine="cLineWidth = LineWidth";
Debug.ShouldStop(1048576);
_clinewidth = _linewidth;
 BA.debugLineNum = 1206;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setmultiselect(boolean _ms) throws Exception{
try {
		Debug.PushSubsStack("setMultiSelect (table) ","table",2,ba,this,1071);
Debug.locals.put("ms", _ms);
 BA.debugLineNum = 1071;BA.debugLine="Public Sub setMultiSelect(ms As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1072;BA.debugLine="clearSelection";
Debug.ShouldStop(32768);
_clearselection();
 BA.debugLineNum = 1073;BA.debugLine="IsMultiSelect = ms";
Debug.ShouldStop(65536);
_ismultiselect = _ms;
 BA.debugLineNum = 1074;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setpadding(anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _right,int _bottom) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (table) ","table",2,ba,this,1670);
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
Debug.locals.put("v", _v);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Right", _right);
Debug.locals.put("Bottom", _bottom);
 BA.debugLineNum = 1670;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top";
Debug.ShouldStop(32);
 BA.debugLineNum = 1671;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(64);
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();Debug.locals.put("r", _r);
 BA.debugLineNum = 1672;BA.debugLine="r.Target = v";
Debug.ShouldStop(128);
_r.Target = (Object)(_v.getObject());Debug.locals.put("r", _r);
 BA.debugLineNum = 1673;BA.debugLine="r.RunMethod4(\"setPadding\", Array As Object(Left,";
Debug.ShouldStop(256);
_r.RunMethod4("setPadding",new Object[]{(Object)(_left),(Object)(_top),(Object)(_right),(Object)(_bottom)},new String[]{"java.lang.int","java.lang.int","java.lang.int","java.lang.int"});
 BA.debugLineNum = 1674;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setrowcolor1(int _color) throws Exception{
try {
		Debug.PushSubsStack("setRowColor1 (table) ","table",2,ba,this,1474);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1474;BA.debugLine="Public Sub setRowColor1(Color As Int)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1475;BA.debugLine="cRowColor1 = Color";
Debug.ShouldStop(4);
_crowcolor1 = _color;
 BA.debugLineNum = 1476;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(8);
if (_pnltable.IsInitialized()) { 
 BA.debugLineNum = 1477;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(16);
_innerclearall(_numberofcolumns);
 };
 BA.debugLineNum = 1479;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setrowcolor2(int _color) throws Exception{
try {
		Debug.PushSubsStack("setRowColor2 (table) ","table",2,ba,this,1486);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1486;BA.debugLine="Public Sub setRowColor2(Color As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1487;BA.debugLine="cRowColor2 = Color";
Debug.ShouldStop(16384);
_crowcolor2 = _color;
 BA.debugLineNum = 1488;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(32768);
if (_pnltable.IsInitialized()) { 
 BA.debugLineNum = 1489;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(65536);
_innerclearall(_numberofcolumns);
 };
 BA.debugLineNum = 1491;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setrowheight(int _rowheight) throws Exception{
try {
		Debug.PushSubsStack("setRowHeight (table) ","table",2,ba,this,1572);
Debug.locals.put("rowheight", _rowheight);
 BA.debugLineNum = 1572;BA.debugLine="Public Sub setRowHeight(rowheight As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 1573;BA.debugLine="If cRowHeight = cHeaderHeight Then";
Debug.ShouldStop(16);
if (_crowheight==_cheaderheight) { 
 BA.debugLineNum = 1574;BA.debugLine="cHeaderHeight = rowheight";
Debug.ShouldStop(32);
_cheaderheight = _rowheight;
 };
 BA.debugLineNum = 1576;BA.debugLine="cRowHeight = rowheight";
Debug.ShouldStop(128);
_crowheight = _rowheight;
 BA.debugLineNum = 1577;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setselectedcellcolor(int _color) throws Exception{
try {
		Debug.PushSubsStack("setSelectedCellColor (table) ","table",2,ba,this,1510);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1510;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 1511;BA.debugLine="cSelectedCellColor = Color";
Debug.ShouldStop(64);
_cselectedcellcolor = _color;
 BA.debugLineNum = 1512;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(128);
if (_pnltable.IsInitialized()) { 
 BA.debugLineNum = 1513;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(256);
_innerclearall(_numberofcolumns);
 };
 BA.debugLineNum = 1515;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setselectedrowcolor(int _color) throws Exception{
try {
		Debug.PushSubsStack("setSelectedRowColor (table) ","table",2,ba,this,1498);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1498;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1499;BA.debugLine="cSelectedRowColor = Color";
Debug.ShouldStop(67108864);
_cselectedrowcolor = _color;
 BA.debugLineNum = 1500;BA.debugLine="If pnlTable.IsInitialized Then";
Debug.ShouldStop(134217728);
if (_pnltable.IsInitialized()) { 
 BA.debugLineNum = 1501;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(268435456);
_innerclearall(_numberofcolumns);
 };
 BA.debugLineNum = 1503;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setsingleline(boolean _singleline) throws Exception{
try {
		Debug.PushSubsStack("setSingleLine (table) ","table",2,ba,this,1754);
Debug.locals.put("SingleLine", _singleline);
 BA.debugLineNum = 1754;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1755;BA.debugLine="cSingleLine = SingleLine";
Debug.ShouldStop(67108864);
_csingleline = _singleline;
 BA.debugLineNum = 1756;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setsortcolumn(boolean _sortcolumn) throws Exception{
try {
		Debug.PushSubsStack("setSortColumn (table) ","table",2,ba,this,1677);
Debug.locals.put("SortColumn", _sortcolumn);
 BA.debugLineNum = 1677;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1678;BA.debugLine="cSortColumn = SortColumn";
Debug.ShouldStop(8192);
_csortcolumn = _sortcolumn;
 BA.debugLineNum = 1679;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setstatusline(String _s) throws Exception{
try {
		Debug.PushSubsStack("setStatusLine (table) ","table",2,ba,this,1122);
Debug.locals.put("s", _s);
 BA.debugLineNum = 1122;BA.debugLine="Public Sub setStatusLine(s As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1123;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLi";
Debug.ShouldStop(4);
if ((_lblstatusline.IsInitialized())) { 
_lblstatusline.setText((Object)(_s));};
 BA.debugLineNum = 1124;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setstatuslineautofill(boolean _status) throws Exception{
try {
		Debug.PushSubsStack("setStatusLineAutoFill (table) ","table",2,ba,this,1356);
Debug.locals.put("status", _status);
 BA.debugLineNum = 1356;BA.debugLine="Public Sub setStatusLineAutoFill(status As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1357;BA.debugLine="enableStatusLineAutoFill = status";
Debug.ShouldStop(4096);
_enablestatuslineautofill = _status;
 BA.debugLineNum = 1358;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _settablecolor(int _color) throws Exception{
try {
		Debug.PushSubsStack("setTableColor (table) ","table",2,ba,this,1522);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1522;BA.debugLine="Public Sub setTableColor(Color As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1523;BA.debugLine="cTableColor = Color";
Debug.ShouldStop(262144);
_ctablecolor = _color;
 BA.debugLineNum = 1524;BA.debugLine="SV.Panel.Color = cTableColor";
Debug.ShouldStop(524288);
_sv.getPanel().setColor(_ctablecolor);
 BA.debugLineNum = 1525;BA.debugLine="If Header.IsInitialized Then";
Debug.ShouldStop(1048576);
if (_header.IsInitialized()) { 
 BA.debugLineNum = 1526;BA.debugLine="Header.Color = cTableColor";
Debug.ShouldStop(2097152);
_header.setColor(_ctablecolor);
 };
 BA.debugLineNum = 1528;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _settextcolor(int _color) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (table) ","table",2,ba,this,1535);
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1535;BA.debugLine="Public Sub setTextColor(Color As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1536;BA.debugLine="cTextColor = Color";
Debug.ShouldStop(-2147483648);
_ctextcolor = _color;
 BA.debugLineNum = 1537;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 1538;BA.debugLine="For i = 0 To SV.Panel.NumberOfViews - 1";
Debug.ShouldStop(2);
{
final int step1112 = 1;
final int limit1112 = (int) (_sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0); (step1112 > 0 && _i <= limit1112) || (step1112 < 0 && _i >= limit1112); _i = ((int)(0 + _i + step1112))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1539;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4);
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1540;BA.debugLine="lbl = SV.Panel.GetView(i)";
Debug.ShouldStop(8);
_lbl.setObject((android.widget.TextView)(_sv.getPanel().GetView(_i).getObject()));
 BA.debugLineNum = 1541;BA.debugLine="lbl.TextColor = cTextColor";
Debug.ShouldStop(16);
_lbl.setTextColor(_ctextcolor);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1543;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _settextcolors(int[] _textcolors) throws Exception{
try {
		Debug.PushSubsStack("SetTextColors (table) ","table",2,ba,this,1727);
Debug.locals.put("TextColors", _textcolors);
 BA.debugLineNum = 1727;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1728;BA.debugLine="cTextColors = TextColors";
Debug.ShouldStop(-2147483648);
_ctextcolors = _textcolors;
 BA.debugLineNum = 1729;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _settextsize(float _size) throws Exception{
try {
		Debug.PushSubsStack("setTextSize (table) ","table",2,ba,this,1550);
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
Debug.locals.put("Size", _size);
 BA.debugLineNum = 1550;BA.debugLine="Public Sub setTextSize(Size As Float)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1551;BA.debugLine="cTextSize = Size";
Debug.ShouldStop(16384);
_ctextsize = _size;
 BA.debugLineNum = 1552;BA.debugLine="Dim i As Int";
Debug.ShouldStop(32768);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 1554;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
Debug.ShouldStop(131072);
{
final int step1124 = 1;
final int limit1124 = (int) (_header.getNumberOfViews()-1);
for (_i = (int) (0); (step1124 > 0 && _i <= limit1124) || (step1124 < 0 && _i >= limit1124); _i = ((int)(0 + _i + step1124))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1555;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(262144);
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1556;BA.debugLine="lbl = Header.GetView(i)";
Debug.ShouldStop(524288);
_lbl.setObject((android.widget.TextView)(_header.GetView(_i).getObject()));
 BA.debugLineNum = 1557;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(1048576);
_lbl.setTextSize(_ctextsize);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1560;BA.debugLine="For i = 0 To SV.Panel.NumberOfViews - 1";
Debug.ShouldStop(8388608);
{
final int step1129 = 1;
final int limit1129 = (int) (_sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0); (step1129 > 0 && _i <= limit1129) || (step1129 < 0 && _i >= limit1129); _i = ((int)(0 + _i + step1129))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1561;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(16777216);
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1562;BA.debugLine="lbl = SV.Panel.GetView(i)";
Debug.ShouldStop(33554432);
_lbl.setObject((android.widget.TextView)(_sv.getPanel().GetView(_i).getObject()));
 BA.debugLineNum = 1563;BA.debugLine="lbl.TextSize = cTextSize";
Debug.ShouldStop(67108864);
_lbl.setTextSize(_ctextsize);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1565;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _settop(int _top) throws Exception{
try {
		Debug.PushSubsStack("setTop (table) ","table",2,ba,this,1158);
Debug.locals.put("Top", _top);
 BA.debugLineNum = 1158;BA.debugLine="Public Sub setTop(Top As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 1159;BA.debugLine="pnlTable.Top = Top";
Debug.ShouldStop(64);
_pnltable.setTop(_top);
 BA.debugLineNum = 1160;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _settypefaces(anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _typefaces) throws Exception{
try {
		Debug.PushSubsStack("SetTypeFaces (table) ","table",2,ba,this,1590);
Debug.locals.put("TypeFaces", _typefaces);
 BA.debugLineNum = 1590;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1591;BA.debugLine="If TypeFaces.Length <> NumberOfColumns AND Number";
Debug.ShouldStop(4194304);
if (_typefaces.length!=_numberofcolumns && _numberofcolumns>0) { 
 BA.debugLineNum = 1592;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", Fa";
Debug.ShouldStop(8388608);
__c.ToastMessageShow("Invalid number of columns",__c.False);
 BA.debugLineNum = 1593;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return "";
 };
 BA.debugLineNum = 1596;BA.debugLine="If TypeFaces.Length = 1 Then";
Debug.ShouldStop(134217728);
if (_typefaces.length==1) { 
 BA.debugLineNum = 1597;BA.debugLine="cTypeFace = TypeFaces(0)";
Debug.ShouldStop(268435456);
_ctypeface = _typefaces[(int) (0)];
 BA.debugLineNum = 1598;BA.debugLine="MultiTypeFace = False";
Debug.ShouldStop(536870912);
_multitypeface = __c.False;
 }else {
 BA.debugLineNum = 1600;BA.debugLine="cTypeFaces = TypeFaces";
Debug.ShouldStop(-2147483648);
_ctypefaces = _typefaces;
 BA.debugLineNum = 1601;BA.debugLine="MultiTypeFace = True";
Debug.ShouldStop(1);
_multitypeface = __c.True;
 };
 BA.debugLineNum = 1604;BA.debugLine="If Data.Size > 0 Then";
Debug.ShouldStop(8);
if (_data.getSize()>0) { 
 BA.debugLineNum = 1605;BA.debugLine="refreshTable";
Debug.ShouldStop(16);
_refreshtable();
 };
 BA.debugLineNum = 1607;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setusecolumncolors(boolean _usecolumncolors) throws Exception{
try {
		Debug.PushSubsStack("setUseColumnColors (table) ","table",2,ba,this,1686);
int _i = 0;
Debug.locals.put("UseColumnColors", _usecolumncolors);
 BA.debugLineNum = 1686;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As B";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1687;BA.debugLine="cUseColumnColors = UseColumnColors";
Debug.ShouldStop(4194304);
_cusecolumncolors = _usecolumncolors;
 BA.debugLineNum = 1688;BA.debugLine="If cColumnColors.Length = 0 Then";
Debug.ShouldStop(8388608);
if (_ccolumncolors.length==0) { 
 BA.debugLineNum = 1689;BA.debugLine="Dim i As Int";
Debug.ShouldStop(16777216);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 1690;BA.debugLine="Dim cColumnColors(NumberOfColumns) As Int";
Debug.ShouldStop(33554432);
_ccolumncolors = new int[_numberofcolumns];
;
 BA.debugLineNum = 1691;BA.debugLine="Dim cTextColors(NumberOfColumns) As Int";
Debug.ShouldStop(67108864);
_ctextcolors = new int[_numberofcolumns];
;
 BA.debugLineNum = 1692;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(134217728);
{
final int step1231 = 1;
final int limit1231 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step1231 > 0 && _i <= limit1231) || (step1231 < 0 && _i >= limit1231); _i = ((int)(0 + _i + step1231))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1693;BA.debugLine="If i Mod 2 = 0 Then";
Debug.ShouldStop(268435456);
if (_i%2==0) { 
 BA.debugLineNum = 1694;BA.debugLine="cColumnColors(i) = cRowColor1";
Debug.ShouldStop(536870912);
_ccolumncolors[_i] = _crowcolor1;
 }else {
 BA.debugLineNum = 1696;BA.debugLine="cColumnColors(i) = cRowColor2";
Debug.ShouldStop(-2147483648);
_ccolumncolors[_i] = _crowcolor2;
 };
 BA.debugLineNum = 1698;BA.debugLine="cTextColors(i) = cTextColor";
Debug.ShouldStop(2);
_ctextcolors[_i] = _ctextcolor;
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1702;BA.debugLine="If cHeaderColors.Length = 0 Then";
Debug.ShouldStop(32);
if (_cheadercolors.length==0) { 
 BA.debugLineNum = 1703;BA.debugLine="Dim i As Int";
Debug.ShouldStop(64);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 1704;BA.debugLine="Dim cHeaderColors(NumberOfColumns) As Int";
Debug.ShouldStop(128);
_cheadercolors = new int[_numberofcolumns];
;
 BA.debugLineNum = 1705;BA.debugLine="Dim cHeaderTextColors(NumberOfColumns) As Int";
Debug.ShouldStop(256);
_cheadertextcolors = new int[_numberofcolumns];
;
 BA.debugLineNum = 1706;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(512);
{
final int step1244 = 1;
final int limit1244 = (int) (_numberofcolumns-1);
for (_i = (int) (0); (step1244 > 0 && _i <= limit1244) || (step1244 < 0 && _i >= limit1244); _i = ((int)(0 + _i + step1244))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1707;BA.debugLine="cHeaderColors(i) = cHeaderColor";
Debug.ShouldStop(1024);
_cheadercolors[_i] = _cheadercolor;
 BA.debugLineNum = 1708;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
Debug.ShouldStop(2048);
_cheadertextcolors[_i] = _cheadertextcolor;
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1711;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setvalue(int _col,int _row,String _value) throws Exception{
try {
		Debug.PushSubsStack("SetValue (table) ","table",2,ba,this,720);
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
Debug.locals.put("Col", _col);
Debug.locals.put("row", _row);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 720;BA.debugLine="Public Sub SetValue(Col As Int, row As Int, Value";
Debug.ShouldStop(32768);
 BA.debugLineNum = 721;BA.debugLine="Dim values() As String";
Debug.ShouldStop(65536);
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");Debug.locals.put("values", _values);
 BA.debugLineNum = 722;BA.debugLine="values = Data.get(row)";
Debug.ShouldStop(131072);
_values = (String[])(_data.Get(_row));Debug.locals.put("values", _values);
 BA.debugLineNum = 723;BA.debugLine="values(Col) = Value";
Debug.ShouldStop(262144);
_values[_col] = _value;Debug.locals.put("values", _values);
 BA.debugLineNum = 724;BA.debugLine="If visibleRows.ContainsKey(row) Then";
Debug.ShouldStop(524288);
if (_visiblerows.ContainsKey((Object)(_row))) { 
 BA.debugLineNum = 725;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(1048576);
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 726;BA.debugLine="lbls = visibleRows.get(row)";
Debug.ShouldStop(2097152);
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.Get((Object)(_row)));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 727;BA.debugLine="lbls(Col).Text = Value";
Debug.ShouldStop(4194304);
_lbls[_col].setText((Object)(_value));
 };
 BA.debugLineNum = 729;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setvisible(boolean _visible) throws Exception{
try {
		Debug.PushSubsStack("setVisible (table) ","table",2,ba,this,1195);
Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 1195;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1196;BA.debugLine="pnlTable.Visible = Visible";
Debug.ShouldStop(2048);
_pnltable.setVisible(_visible);
 BA.debugLineNum = 1197;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _setwidth(int _width) throws Exception{
try {
		Debug.PushSubsStack("setWidth (table) ","table",2,ba,this,1167);
Debug.locals.put("Width", _width);
 BA.debugLineNum = 1167;BA.debugLine="Public Sub setWidth(Width As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1168;BA.debugLine="pnlTable.Width = Width";
Debug.ShouldStop(32768);
_pnltable.setWidth(_width);
 BA.debugLineNum = 1169;BA.debugLine="SV.Width = Width";
Debug.ShouldStop(65536);
_sv.setWidth(_width);
 BA.debugLineNum = 1170;BA.debugLine="internalPanel.Width = Width";
Debug.ShouldStop(131072);
_internalpanel.setWidth(_width);
 BA.debugLineNum = 1171;BA.debugLine="updateIPLocation";
Debug.ShouldStop(262144);
_updateiplocation();
 BA.debugLineNum = 1172;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _showheadersorting(int _col,int _dir) throws Exception{
try {
		Debug.PushSubsStack("showHeaderSorting (table) ","table",2,ba,this,1243);
int _ll = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _l = 0;
int _t = 0;
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1243;BA.debugLine="Public Sub showHeaderSorting(col As Int,dir As Int";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1250;BA.debugLine="Dim ll As Int = 40";
Debug.ShouldStop(2);
_ll = (int) (40);Debug.locals.put("ll", _ll);Debug.locals.put("ll", _ll);
 BA.debugLineNum = 1251;BA.debugLine="sortingView.RemoveView";
Debug.ShouldStop(4);
_sortingview.RemoveView();
 BA.debugLineNum = 1252;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
Debug.ShouldStop(8);
if ((_dir==0)) { 
if (true) return "";};
 BA.debugLineNum = 1254;BA.debugLine="If (dir = -1) Then";
Debug.ShouldStop(32);
if ((_dir==-1)) { 
 BA.debugLineNum = 1255;BA.debugLine="sortingView.SetBackgroundImage(LoadBitmapSample(";
Debug.ShouldStop(64);
_sortingview.SetBackgroundImage((android.graphics.Bitmap)(__c.LoadBitmapSample(__c.File.getDirAssets(),"sort_asc.png",_ll,_ll).getObject()));
 }else {
 BA.debugLineNum = 1257;BA.debugLine="sortingView.SetBackgroundImage(LoadBitmapSample(";
Debug.ShouldStop(256);
_sortingview.SetBackgroundImage((android.graphics.Bitmap)(__c.LoadBitmapSample(__c.File.getDirAssets(),"sort_desc.png",_ll,_ll).getObject()));
 };
 BA.debugLineNum = 1260;BA.debugLine="Dim v As View";
Debug.ShouldStop(2048);
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();Debug.locals.put("v", _v);
 BA.debugLineNum = 1261;BA.debugLine="v = Header.GetView(col)";
Debug.ShouldStop(4096);
_v = _header.GetView(_col);Debug.locals.put("v", _v);
 BA.debugLineNum = 1262;BA.debugLine="Dim L As Int ' calculate left";
Debug.ShouldStop(8192);
_l = 0;Debug.locals.put("L", _l);
 BA.debugLineNum = 1263;BA.debugLine="Dim t As Int ' calculate top";
Debug.ShouldStop(16384);
_t = 0;Debug.locals.put("t", _t);
 BA.debugLineNum = 1264;BA.debugLine="L = v.Left + v.Width - ll + 6";
Debug.ShouldStop(32768);
_l = (int) (_v.getLeft()+_v.getWidth()-_ll+6);Debug.locals.put("L", _l);
 BA.debugLineNum = 1265;BA.debugLine="t = v.Top + v.Height - ll + 6";
Debug.ShouldStop(65536);
_t = (int) (_v.getTop()+_v.getHeight()-_ll+6);Debug.locals.put("t", _t);
 BA.debugLineNum = 1266;BA.debugLine="Header.AddView(sortingView, L, t, ll, ll)";
Debug.ShouldStop(131072);
_header.AddView((android.view.View)(_sortingview.getObject()),_l,_t,_ll,_ll);
 BA.debugLineNum = 1267;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _showrow(int _row) throws Exception{
try {
		Debug.PushSubsStack("ShowRow (table) ","table",2,ba,this,504);
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
String[] _values = null;
Object[] _rowcolor = null;
int _i = 0;
Debug.locals.put("row", _row);
 BA.debugLineNum = 504;BA.debugLine="Private Sub ShowRow(row As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 505;BA.debugLine="If visibleRows.ContainsKey(row) Then Return";
Debug.ShouldStop(16777216);
if (_visiblerows.ContainsKey((Object)(_row))) { 
if (true) return "";};
 BA.debugLineNum = 507;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(67108864);
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 508;BA.debugLine="Dim values() As String";
Debug.ShouldStop(134217728);
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");Debug.locals.put("values", _values);
 BA.debugLineNum = 509;BA.debugLine="lbls = GetLabels(row)";
Debug.ShouldStop(268435456);
_lbls = _getlabels(_row);Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 510;BA.debugLine="values = Data.get(row)";
Debug.ShouldStop(536870912);
_values = (String[])(_data.Get(_row));Debug.locals.put("values", _values);
 BA.debugLineNum = 511;BA.debugLine="visibleRows.Put(row, lbls)";
Debug.ShouldStop(1073741824);
_visiblerows.Put((Object)(_row),(Object)(_lbls));
 BA.debugLineNum = 512;BA.debugLine="Dim rowColor() As Object";
Debug.ShouldStop(-2147483648);
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 513;BA.debugLine="If (SelectedRows.indexof(row) <> -1 )Then";
Debug.ShouldStop(1);
if ((_selectedrows.IndexOf((Object)(_row))!=-1)) { 
 BA.debugLineNum = 514;BA.debugLine="rowColor = SelectedDrawable";
Debug.ShouldStop(2);
_rowcolor = _selecteddrawable;Debug.locals.put("rowColor", _rowcolor);
 }else 
{ BA.debugLineNum = 515;BA.debugLine="Else If row Mod 2 = 0 Then";
Debug.ShouldStop(4);
if (_row%2==0) { 
 BA.debugLineNum = 516;BA.debugLine="rowColor = Drawable1";
Debug.ShouldStop(8);
_rowcolor = _drawable1;Debug.locals.put("rowColor", _rowcolor);
 }else {
 BA.debugLineNum = 518;BA.debugLine="rowColor = Drawable2";
Debug.ShouldStop(32);
_rowcolor = _drawable2;Debug.locals.put("rowColor", _rowcolor);
 }};
 BA.debugLineNum = 520;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(128);
{
final int step336 = 1;
final int limit336 = (int) (_lbls.length-1);
for (_i = (int) (0); (step336 > 0 && _i <= limit336) || (step336 < 0 && _i >= limit336); _i = ((int)(0 + _i + step336))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 521;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
Debug.ShouldStop(256);
if ((_header.GetView(_i).getWidth()>1)) { 
 BA.debugLineNum = 522;BA.debugLine="SV.Panel.AddView(lbls(I), Header.GetView(I).Lef";
Debug.ShouldStop(512);
_sv.getPanel().AddView((android.view.View)(_lbls[_i].getObject()),_header.GetView(_i).getLeft(),(int) (_row*_crowheight),_header.GetView(_i).getWidth(),(int) (_crowheight-_clinewidth));
 BA.debugLineNum = 523;BA.debugLine="lbls(I).Text = values(I)";
Debug.ShouldStop(1024);
_lbls[_i].setText((Object)(_values[_i]));
 BA.debugLineNum = 524;BA.debugLine="SetPadding(lbls(I), 4dip, 2dip, 4dip, 2dip)";
Debug.ShouldStop(2048);
_setpadding((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbls[_i].getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
 BA.debugLineNum = 525;BA.debugLine="If I = SelectedCol AND (SelectedRows.indexof(ro";
Debug.ShouldStop(4096);
if (_i==_selectedcol && (_selectedrows.IndexOf((Object)(_row))!=-1)) { 
 BA.debugLineNum = 526;BA.debugLine="lbls(I).Background = SelectedCellDrawable";
Debug.ShouldStop(8192);
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_selectedcelldrawable));
 }else {
 BA.debugLineNum = 528;BA.debugLine="lbls(I).Background = rowColor(I)";
Debug.ShouldStop(32768);
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 };
 BA.debugLineNum = 530;BA.debugLine="If MultiAlignments = False Then";
Debug.ShouldStop(131072);
if (_multialignments==__c.False) { 
 BA.debugLineNum = 531;BA.debugLine="lbls(I).Gravity = cAlignment";
Debug.ShouldStop(262144);
_lbls[_i].setGravity(_calignment);
 }else {
 BA.debugLineNum = 533;BA.debugLine="lbls(I).Gravity = cAlignments(I)";
Debug.ShouldStop(1048576);
_lbls[_i].setGravity(_calignments[_i]);
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 537;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _sorttable(int _col,boolean _dir) throws Exception{
try {
		Debug.PushSubsStack("sortTable (table) ","table",2,ba,this,1275);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1275;BA.debugLine="Public Sub sortTable(col As Int, dir As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1276;BA.debugLine="Log (\"sorting table for col:\" & col)";
Debug.ShouldStop(134217728);
__c.Log("sorting table for col:"+BA.NumberToString(_col));
 BA.debugLineNum = 1277;BA.debugLine="clearSelection";
Debug.ShouldStop(268435456);
_clearselection();
 BA.debugLineNum = 1278;BA.debugLine="debug_counter = 0";
Debug.ShouldStop(536870912);
_debug_counter = (long) (0);
 BA.debugLineNum = 1280;BA.debugLine="SelectionSort(col, dir)";
Debug.ShouldStop(-2147483648);
_selectionsort(_col,_dir);
 BA.debugLineNum = 1281;BA.debugLine="refreshTable";
Debug.ShouldStop(1);
_refreshtable();
 BA.debugLineNum = 1282;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _sorttablenum(int _col,boolean _dir) throws Exception{
try {
		Debug.PushSubsStack("sortTableNum (table) ","table",2,ba,this,1309);
Debug.locals.put("col", _col);
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 1309;BA.debugLine="Public Sub sortTableNum(col As Int, dir As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1310;BA.debugLine="Log (\"sorting table for col:\" & col)";
Debug.ShouldStop(536870912);
__c.Log("sorting table for col:"+BA.NumberToString(_col));
 BA.debugLineNum = 1311;BA.debugLine="clearSelection";
Debug.ShouldStop(1073741824);
_clearselection();
 BA.debugLineNum = 1312;BA.debugLine="debug_counter = 0";
Debug.ShouldStop(-2147483648);
_debug_counter = (long) (0);
 BA.debugLineNum = 1314;BA.debugLine="SelectionSortNum(col, dir)";
Debug.ShouldStop(2);
_selectionsortnum(_col,_dir);
 BA.debugLineNum = 1315;BA.debugLine="refreshTable";
Debug.ShouldStop(4);
_refreshtable();
 BA.debugLineNum = 1316;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _sv_scrollchanged(int _posx,int _posy) throws Exception{
try {
		Debug.PushSubsStack("SV_ScrollChanged (table) ","table",2,ba,this,334);
int _currentmin = 0;
int _currentmax = 0;
int _i = 0;
Debug.locals.put("PosX", _posx);
Debug.locals.put("PosY", _posy);
 BA.debugLineNum = 334;BA.debugLine="Private Sub SV_ScrollChanged(PosX As Int, PosY As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="Dim currentMin, currentMax As Int";
Debug.ShouldStop(16384);
_currentmin = 0;Debug.locals.put("currentMin", _currentmin);
_currentmax = 0;Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 336;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
Debug.ShouldStop(32768);
_currentmin = (int) (__c.Max(0,_posy/(double)_crowheight-30));Debug.locals.put("currentMin", _currentmin);
 BA.debugLineNum = 337;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV.Height";
Debug.ShouldStop(65536);
_currentmax = (int) (__c.Min(_data.getSize()-1,(_posy+_sv.getHeight())/(double)_crowheight+30));Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 338;BA.debugLine="If minVisibleRow > -1 Then";
Debug.ShouldStop(131072);
if (_minvisiblerow>-1) { 
 BA.debugLineNum = 339;BA.debugLine="If minVisibleRow < currentMin Then";
Debug.ShouldStop(262144);
if (_minvisiblerow<_currentmin) { 
 BA.debugLineNum = 341;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
Debug.ShouldStop(1048576);
{
final int step189 = 1;
final int limit189 = (int) (__c.Min(_currentmin-1,_maxvisiblerow));
for (_i = _minvisiblerow; (step189 > 0 && _i <= limit189) || (step189 < 0 && _i >= limit189); _i = ((int)(0 + _i + step189))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 342;BA.debugLine="HideRow(I)";
Debug.ShouldStop(2097152);
_hiderow(_i);
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 344;BA.debugLine="Else If minVisibleRow > currentMin Then";
Debug.ShouldStop(8388608);
if (_minvisiblerow>_currentmin) { 
 BA.debugLineNum = 346;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
Debug.ShouldStop(33554432);
{
final int step193 = 1;
final int limit193 = (int) (__c.Min(_minvisiblerow-1,_currentmax));
for (_i = _currentmin; (step193 > 0 && _i <= limit193) || (step193 < 0 && _i >= limit193); _i = ((int)(0 + _i + step193))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 347;BA.debugLine="ShowRow(I)";
Debug.ShouldStop(67108864);
_showrow(_i);
 }
}Debug.locals.put("i", _i);
;
 }};
 BA.debugLineNum = 350;BA.debugLine="If maxVisibleRow > currentMax Then";
Debug.ShouldStop(536870912);
if (_maxvisiblerow>_currentmax) { 
 BA.debugLineNum = 352;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
Debug.ShouldStop(-2147483648);
{
final int step198 = (int) (-1);
final int limit198 = (int) (__c.Max(_currentmax+1,_minvisiblerow));
for (_i = _maxvisiblerow; (step198 > 0 && _i <= limit198) || (step198 < 0 && _i >= limit198); _i = ((int)(0 + _i + step198))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 353;BA.debugLine="HideRow(I)";
Debug.ShouldStop(1);
_hiderow(_i);
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 355;BA.debugLine="Else If maxVisibleRow < currentMax Then";
Debug.ShouldStop(4);
if (_maxvisiblerow<_currentmax) { 
 BA.debugLineNum = 357;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
Debug.ShouldStop(16);
{
final int step202 = (int) (-1);
final int limit202 = (int) (__c.Max(_maxvisiblerow+1,_currentmin));
for (_i = _currentmax; (step202 > 0 && _i <= limit202) || (step202 < 0 && _i >= limit202); _i = ((int)(0 + _i + step202))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 358;BA.debugLine="ShowRow(I)";
Debug.ShouldStop(32);
_showrow(_i);
 }
}Debug.locals.put("i", _i);
;
 }};
 };
 BA.debugLineNum = 362;BA.debugLine="minVisibleRow = currentMin";
Debug.ShouldStop(512);
_minvisiblerow = _currentmin;
 BA.debugLineNum = 363;BA.debugLine="maxVisibleRow = currentMax";
Debug.ShouldStop(1024);
_maxvisiblerow = _currentmax;
 BA.debugLineNum = 364;BA.debugLine="Header.Left = -PosX";
Debug.ShouldStop(2048);
_header.setLeft((int) (-_posx));
 BA.debugLineNum = 365;BA.debugLine="lblStatusLine.Left = - PosX";
Debug.ShouldStop(4096);
_lblstatusline.setLeft((int) (-_posx));
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _swaplist(int _index1,int _index2) throws Exception{
try {
		Debug.PushSubsStack("SwapList (table) ","table",2,ba,this,1337);
Object _temp = null;
Debug.locals.put("index1", _index1);
Debug.locals.put("index2", _index2);
 BA.debugLineNum = 1337;BA.debugLine="Public Sub SwapList(index1 As Int, index2 As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1338;BA.debugLine="Dim temp As Object";
Debug.ShouldStop(33554432);
_temp = new Object();Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1339;BA.debugLine="temp = Data.get(index1)";
Debug.ShouldStop(67108864);
_temp = _data.Get(_index1);Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1340;BA.debugLine="Data.set(index1,Data.get(index2))";
Debug.ShouldStop(134217728);
_data.Set(_index1,_data.Get(_index2));
 BA.debugLineNum = 1341;BA.debugLine="Data.set(index2,temp)";
Debug.ShouldStop(268435456);
_data.Set(_index2,_temp);
 BA.debugLineNum = 1353;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _unhidecol(int _col,int _newsize) throws Exception{
try {
		Debug.PushSubsStack("unHideCol (table) ","table",2,ba,this,1113);
int[] _tmpwidths = null;
int _i = 0;
Debug.locals.put("col", _col);
Debug.locals.put("newSize", _newsize);
 BA.debugLineNum = 1113;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1114;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
Debug.ShouldStop(33554432);
_tmpwidths = new int[_savedwidths.length];
;Debug.locals.put("tmpWidths", _tmpwidths);
 BA.debugLineNum = 1115;BA.debugLine="For i=0 To SavedWidths.Length-1";
Debug.ShouldStop(67108864);
{
final int step802 = 1;
final int limit802 = (int) (_savedwidths.length-1);
for (_i = (int) (0); (step802 > 0 && _i <= limit802) || (step802 < 0 && _i >= limit802); _i = ((int)(0 + _i + step802))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1116;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
Debug.ShouldStop(134217728);
_tmpwidths[_i] = _savedwidths[_i];Debug.locals.put("tmpWidths", _tmpwidths);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1118;BA.debugLine="tmpWidths(col) = newSize";
Debug.ShouldStop(536870912);
_tmpwidths[_col] = _newsize;Debug.locals.put("tmpWidths", _tmpwidths);
 BA.debugLineNum = 1119;BA.debugLine="SetColumnsWidths(tmpWidths)";
Debug.ShouldStop(1073741824);
_setcolumnswidths(_tmpwidths);
 BA.debugLineNum = 1120;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public String  _updateiplocation() throws Exception{
try {
		Debug.PushSubsStack("updateIPLocation (table) ","table",2,ba,this,1134);
 BA.debugLineNum = 1134;BA.debugLine="Private Sub updateIPLocation";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1135;BA.debugLine="If (SV.Height > Data.Size * cRowHeight) Then";
Debug.ShouldStop(16384);
if ((_sv.getHeight()>_data.getSize()*_crowheight)) { 
 BA.debugLineNum = 1137;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cRo";
Debug.ShouldStop(65536);
_internalpanel.setTop((int) (_data.getSize()*_crowheight+_crowheight));
 BA.debugLineNum = 1138;BA.debugLine="internalPanel.Height = SV.Height - (Data.Size *";
Debug.ShouldStop(131072);
_internalpanel.setHeight((int) (_sv.getHeight()-(_data.getSize()*_crowheight)));
 }else {
 BA.debugLineNum = 1140;BA.debugLine="internalPanel.Height = 0";
Debug.ShouldStop(524288);
_internalpanel.setHeight((int) (0));
 };
 BA.debugLineNum = 1142;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return "";
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public boolean  _updaterow(int _row,String[] _values) throws Exception{
try {
		Debug.PushSubsStack("UpdateRow (table) ","table",2,ba,this,1037);
int _i = 0;
Debug.locals.put("row", _row);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 1037;BA.debugLine="Public Sub UpdateRow(row As Int, Values () As Stri";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1038;BA.debugLine="Dim i As Int";
Debug.ShouldStop(8192);
_i = 0;Debug.locals.put("i", _i);
 BA.debugLineNum = 1039;BA.debugLine="If (Values.Length <> NumberOfColumns OR row <0 OR";
Debug.ShouldStop(16384);
if ((_values.length!=_numberofcolumns || _row<0 || _row>_data.getSize()-1)) { 
 BA.debugLineNum = 1040;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) return __c.False;
 };
 BA.debugLineNum = 1042;BA.debugLine="For i=0 To Values.Length-1";
Debug.ShouldStop(131072);
{
final int step751 = 1;
final int limit751 = (int) (_values.length-1);
for (_i = (int) (0); (step751 > 0 && _i <= limit751) || (step751 < 0 && _i >= limit751); _i = ((int)(0 + _i + step751))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1043;BA.debugLine="SetValue(i,row,Values(i))";
Debug.ShouldStop(262144);
_setvalue(_i,_row,_values[_i]);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1045;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return __c.True;
 BA.debugLineNum = 1046;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return false;
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
