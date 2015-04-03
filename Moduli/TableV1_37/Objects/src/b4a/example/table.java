package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class table extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.table");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _rowcol{
public boolean IsInitialized;
public int Row;
public int Col;
public void Initialize() {
IsInitialized = true;
Row = 0;
Col = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
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
public String  _selectrow(b4a.example.table __ref,b4a.example.table._rowcol _rc) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _previndex = 0;
int _prev = 0;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection)) { 
if (true) return "";};
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Dim prev As Int ' if we select an alreday selected row, prev will be rc.row, else will be -1";
_prev = 0;
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if selecting not a selected row";
_previndex = __ref._selectedrows.IndexOf((Object)(_rc.Row));
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="If (prevIndex <> -1 AND IsMultiSelect = False) Then";
if ((_previndex!=-1 && __ref._ismultiselect==__c.False)) { 
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol = _rc.Col;
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows.ContainsKey((Object)(_rc.Row))) { 
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow(null,_rc.Row);
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow(null,_rc.Row);
 };
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="Return	' comment this line if you want to unselect a line";
if (true) return "";
 };
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="If (prevIndex = -1) Then";
if ((_previndex==-1)) { 
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="If (IsMultiSelect) Then";
if ((__ref._ismultiselect)) { 
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="SelectedRows.add(rc.Row) 'Select the new row";
__ref._selectedrows.Add((Object)(_rc.Row));
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="prev = -1";
_prev = (int) (-1);
 }else {
RDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="If (SelectedRows.Size <> 0) Then";
if ((__ref._selectedrows.getSize()!=0)) { 
RDebugUtils.currentLine=2424857;
 //BA.debugLineNum = 2424857;BA.debugLine="prev = SelectedRows.get(0) ' there should be only one here ever!!!, keep the unselected row in prev";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows.Get((int) (0))));
RDebugUtils.currentLine=2424858;
 //BA.debugLineNum = 2424858;BA.debugLine="SelectedRows.set(0,rc.Row) ' change it to the new one";
__ref._selectedrows.Set((int) (0),(Object)(_rc.Row));
 }else {
RDebugUtils.currentLine=2424860;
 //BA.debugLineNum = 2424860;BA.debugLine="prev = -1";
_prev = (int) (-1);
RDebugUtils.currentLine=2424861;
 //BA.debugLineNum = 2424861;BA.debugLine="SelectedRows.Add(rc.Row)";
__ref._selectedrows.Add((Object)(_rc.Row));
 };
 };
 }else {
RDebugUtils.currentLine=2424866;
 //BA.debugLineNum = 2424866;BA.debugLine="prev = SelectedRows.get(prevIndex) ' should be RC.row";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows.Get(_previndex)));
RDebugUtils.currentLine=2424867;
 //BA.debugLineNum = 2424867;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the old selected row";
__ref._selectedrows.RemoveAt(_previndex);
 };
RDebugUtils.currentLine=2424870;
 //BA.debugLineNum = 2424870;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
RDebugUtils.currentLine=2424871;
 //BA.debugLineNum = 2424871;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows.ContainsKey((Object)(_rc.Row))) { 
RDebugUtils.currentLine=2424872;
 //BA.debugLineNum = 2424872;BA.debugLine="HideRow(prev)";
__ref._hiderow(null,_prev);
RDebugUtils.currentLine=2424873;
 //BA.debugLineNum = 2424873;BA.debugLine="ShowRow(prev)";
__ref._showrow(null,_prev);
 };
 };
RDebugUtils.currentLine=2424877;
 //BA.debugLineNum = 2424877;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol = _rc.Col;
RDebugUtils.currentLine=2424878;
 //BA.debugLineNum = 2424878;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows.ContainsKey((Object)(_rc.Row))) { 
RDebugUtils.currentLine=2424879;
 //BA.debugLineNum = 2424879;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow(null,_rc.Row);
RDebugUtils.currentLine=2424880;
 //BA.debugLineNum = 2424880;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow(null,_rc.Row);
 };
RDebugUtils.currentLine=2424882;
 //BA.debugLineNum = 2424882;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.table __ref,anywheresoftware.b4a.BA _ba,Object _callbackmodule,String _eventname,int _vnumberofcolumns,int _cellalignement,boolean _showstatusl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Initialize (CallbackModule As Object, EventName As String, vNumberOfColumns As Int, cellAlignement As Int, showStatusL As Boolean)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="SV.Initialize(0, 0, \"SV\")";
__ref._sv.Initialize(ba,(int) (0),(int) (0),"SV");
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="internalPanel.Initialize(\"IP\")";
__ref._internalpanel.Initialize(ba,"IP");
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="showStatusLine = showStatusL";
__ref._showstatusline = _showstatusl;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows.Initialize();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="cAlignment = cellAlignement";
__ref._calignment = _cellalignement;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Callback = CallbackModule";
__ref._callback = _callbackmodule;
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Event = EventName";
__ref._event = _eventname;
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Data.Initialize";
__ref._data.Initialize();
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="sortingView.Initialize(\"\")";
__ref._sortingview.Initialize(ba,"");
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
__ref._bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs.Initialize2((android.graphics.Bitmap)(__ref._bmp.getObject()));
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignment(b4a.example.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="cAlignment = Alignment";
__ref._calignment = _alignment;
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step1033 = 1;
final int limit1033 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step1033 > 0 && _i <= limit1033) || (step1033 < 0 && _i >= limit1033); _i = ((int)(0 + _i + step1033))) {
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments[_i] = __ref._calignment;
 }
};
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="MultiAlignments = False";
__ref._multialignments = __c.False;
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data.getSize()>0) { 
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="refreshTable";
__ref._refreshtable(null);
 };
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="cHeaderColor = Color";
__ref._cheadercolor = _color;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolor(b4a.example.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="cHeaderTextColor = Color";
__ref._cheadertextcolor = _color;
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub setTextColor(Color As Int)";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="cTextColor = Color";
__ref._ctextcolor = _color;
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="For i = 0 To SV.Panel.NumberOfViews - 1";
{
final int step1111 = 1;
final int limit1111 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0); (step1111 > 0 && _i <= limit1111) || (step1111 < 0 && _i >= limit1111); _i = ((int)(0 + _i + step1111))) {
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="lbl = SV.Panel.GetView(i)";
_lbl.setObject((android.widget.TextView)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor);
 }
};
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="End Sub";
return "";
}
public String  _settablecolor(b4a.example.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub setTableColor(Color As Int)";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="cTableColor = Color";
__ref._ctablecolor = _color;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="SV.Panel.Color = cTableColor";
__ref._sv.getPanel().setColor(__ref._ctablecolor);
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header.IsInitialized()) { 
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Header.Color = cTableColor";
__ref._header.setColor(__ref._ctablecolor);
 };
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="End Sub";
return "";
}
public String  _setrowheight(b4a.example.table __ref,int _rowheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="If cRowHeight = cHeaderHeight Then";
if (__ref._crowheight==__ref._cheaderheight) { 
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="cHeaderHeight = RowHeight";
__ref._cheaderheight = _rowheight;
 };
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="cRowHeight = RowHeight";
__ref._crowheight = _rowheight;
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="End Sub";
return "";
}
public String  _setallowselection(b4a.example.table __ref,boolean _allowselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boolean)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="cAllowSelection = AllowSelection";
__ref._callowselection = _allowselection;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable.IsInitialized()) { 
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="clearSelection";
__ref._clearselection(null);
 };
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="End Sub";
return "";
}
public String  _addtoactivity(b4a.example.table __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As Int, Top As Int, Width As Int, Height As Int)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall(null,__ref._numberofcolumns);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="SV.Panel.Color = cTableColor";
__ref._sv.getPanel().setColor(__ref._ctablecolor);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="IsVisible = True";
__ref._isvisible = __c.True;
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="pnlTable.Initialize(\"\")";
__ref._pnltable.Initialize(ba,"");
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Header.Color = cTableColor";
__ref._header.setColor(__ref._ctablecolor);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Act.AddView(pnlTable, Left, Top , Width, Height)";
_act.AddView((android.view.View)(__ref._pnltable.getObject()),_left,_top,_width,_height);
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="pnlTable.AddView(Header, 0, 0 , Width, cHeaderHeight)";
__ref._pnltable.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),_width,__ref._cheaderheight);
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="lblStatusLine.Initialize(\"\")";
__ref._lblstatusline.Initialize(ba,"");
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it really ?";
__ref._lblstatusline.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO uncomment this";
__ref._internalpanel.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="If (showStatusLine = True) Then";
if ((__ref._showstatusline==__c.True)) { 
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="pnlTable.AddView(SV, 0, Header.Height, Width, Height - Header.Height - cRowHeight)";
__ref._pnltable.AddView((android.view.View)(__ref._sv.getObject()),(int) (0),__ref._header.getHeight(),_width,(int) (_height-__ref._header.getHeight()-__ref._crowheight));
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV.Top + SV.Height, Width, cRowHeight)";
__ref._pnltable.AddView((android.view.View)(__ref._lblstatusline.getObject()),(int) (0),(int) (__ref._sv.getTop()+__ref._sv.getHeight()),_width,__ref._crowheight);
 }else {
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="pnlTable.AddView(SV, 0, Header.Height, Width, Height - Header.Height)";
__ref._pnltable.AddView((android.view.View)(__ref._sv.getObject()),(int) (0),__ref._header.getHeight(),_width,(int) (_height-__ref._header.getHeight()));
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV.Top + SV.Height, 0, 0)";
__ref._pnltable.AddView((android.view.View)(__ref._lblstatusline.getObject()),(int) (0),(int) (__ref._sv.getTop()+__ref._sv.getHeight()),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="pnlTable.AddView(internalPanel,0,0,Width,0)";
__ref._pnltable.AddView((android.view.View)(__ref._internalpanel.getObject()),(int) (0),(int) (0),_width,(int) (0));
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="updateIPLocation";
__ref._updateiplocation(null);
RDebugUtils.currentLine=1507353;
 //BA.debugLineNum = 1507353;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
_columnwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=1507354;
 //BA.debugLineNum = 1507354;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
_headerwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=1507355;
 //BA.debugLineNum = 1507355;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
_datawidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=1507356;
 //BA.debugLineNum = 1507356;BA.debugLine="Dim SavedWidths(NumberOfColumns) As Int";
_savedwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=1507357;
 //BA.debugLineNum = 1507357;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step239 = 1;
final int limit239 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step239 > 0 && _i <= limit239) || (step239 < 0 && _i >= limit239); _i = ((int)(0 + _i + step239))) {
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="ColumnWidths(i) = SV.Width / NumberOfColumns";
__ref._columnwidths[_i] = (int) (__ref._sv.getWidth()/(double)__ref._numberofcolumns);
RDebugUtils.currentLine=1507359;
 //BA.debugLineNum = 1507359;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths[_i] = __ref._columnwidths[_i];
RDebugUtils.currentLine=1507360;
 //BA.debugLineNum = 1507360;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths[_i] = __ref._columnwidths[_i];
RDebugUtils.currentLine=1507361;
 //BA.debugLineNum = 1507361;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths[_i] = __ref._columnwidths[_i];
 }
};
RDebugUtils.currentLine=1507364;
 //BA.debugLineNum = 1507364;BA.debugLine="SV_ScrollChanged(0, 0)";
__ref._sv_scrollchanged(null,(int) (0),(int) (0));
RDebugUtils.currentLine=1507365;
 //BA.debugLineNum = 1507365;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill=True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
if ((__ref._lblstatusline.IsInitialized() && __ref._enablestatuslineautofill==__c.True)) { 
__ref._setstatusline(null,BA.NumberToString(__ref._data.getSize())+" rows");};
RDebugUtils.currentLine=1507366;
 //BA.debugLineNum = 1507366;BA.debugLine="End Sub";
return "";
}
public String  _setmultiselect(b4a.example.table __ref,boolean _ms) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub setMultiSelect(ms As Boolean)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="clearSelection";
__ref._clearselection(null);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="IsMultiSelect = ms";
__ref._ismultiselect = _ms;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return "";
}
public String  _setsortcolumn(b4a.example.table __ref,boolean _sortcolumn) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="cSortColumn = SortColumn";
__ref._csortcolumn = _sortcolumn;
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return "";
}
public String  _setsingleline(b4a.example.table __ref,boolean _singleline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="cSingleLine = SingleLine";
__ref._csingleline = _singleline;
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return "";
}
public String  _setheader(b4a.example.table __ref,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
int _left = 0;
int _change = 0;
int _w = 0;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _extrawidth = 0;
String[] _str = null;
int _j = 0;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub SetHeader(Values() As String)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="For i = Header.NumberOfViews - 1 To 0 Step -1";
{
final int step418 = (int) (-1);
final int limit418 = (int) (0);
for (_i = (int) (__ref._header.getNumberOfViews()-1); (step418 > 0 && _i <= limit418) || (step418 < 0 && _i >= limit418); _i = ((int)(0 + _i + step418))) {
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Header.RemoveViewAt(i)";
__ref._header.RemoveViewAt(_i);
 }
};
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="HeaderNames.Initialize2(Values)";
__ref._headernames.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Dim Left = 0 As Int";
_left = (int) (0);
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Dim Change = 0 As Int";
_change = (int) (0);
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="Dim w As Int";
_w = 0;
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step425 = 1;
final int limit425 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step425 > 0 && _i <= limit425) || (step425 < 0 && _i >= limit425); _i = ((int)(0 + _i + step425))) {
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="L.Initialize(\"header\")";
_l.Initialize(ba,"header");
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="L.Gravity = Gravity.CENTER";
_l.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="L.TextSize = cTextSize";
_l.setTextSize(__ref._ctextsize);
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors==__c.False) { 
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="L.Color = cHeaderColor";
_l.setColor(__ref._cheadercolor);
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="L.TextColor = cHeaderTextColor";
_l.setTextColor(__ref._cheadertextcolor);
 }else {
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="L.Color = cHeaderColors(i)";
_l.setColor(__ref._cheadercolors[_i]);
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="L.TextColor = cHeaderTextColors(i)";
_l.setTextColor(__ref._cheadertextcolors[_i]);
 };
RDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="L.Text = Values(i)";
_l.setText((Object)(_values[_i]));
RDebugUtils.currentLine=2031643;
 //BA.debugLineNum = 2031643;BA.debugLine="L.Tag = i";
_l.setTag((Object)(_i));
RDebugUtils.currentLine=2031645;
 //BA.debugLineNum = 2031645;BA.debugLine="w = Max(2dip, ColumnWidths(i) - cLineWidth)		' needed to make sure that the width has value >0";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),__ref._columnwidths[_i]-__ref._clinewidth));
RDebugUtils.currentLine=2031646;
 //BA.debugLineNum = 2031646;BA.debugLine="Header.AddView(L, Left, 0, w, cRowHeight)";
__ref._header.AddView((android.view.View)(_l.getObject()),_left,(int) (0),_w,__ref._crowheight);
RDebugUtils.currentLine=2031647;
 //BA.debugLineNum = 2031647;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths==__c.True) { 
RDebugUtils.currentLine=2031648;
 //BA.debugLineNum = 2031648;BA.debugLine="Dim ExtraWidth As Int";
_extrawidth = 0;
RDebugUtils.currentLine=2031649;
 //BA.debugLineNum = 2031649;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
_extrawidth = (int) (__c.DipToCurrent((int) (8))+__ref._clinewidth);
RDebugUtils.currentLine=2031650;
 //BA.debugLineNum = 2031650;BA.debugLine="If Values(i).Contains(CRLF) Then";
if (_values[_i].contains(__c.CRLF)) { 
RDebugUtils.currentLine=2031651;
 //BA.debugLineNum = 2031651;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=2031652;
 //BA.debugLineNum = 2031652;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=2031653;
 //BA.debugLineNum = 2031653;BA.debugLine="str = Regex.Split(CRLF, Values(i))";
_str = __c.Regex.Split(__c.CRLF,_values[_i]);
RDebugUtils.currentLine=2031654;
 //BA.debugLineNum = 2031654;BA.debugLine="HeaderWidths(i) = cvs.MeasureStringWidth(str(0), L.Typeface, cTextSize) + ExtraWidth";
__ref._headerwidths[_i] = (int) (__ref._cvs.MeasureStringWidth(_str[(int) (0)],_l.getTypeface(),__ref._ctextsize)+_extrawidth);
RDebugUtils.currentLine=2031655;
 //BA.debugLineNum = 2031655;BA.debugLine="For j = 1 To str.Length - 1";
{
final int step449 = 1;
final int limit449 = (int) (_str.length-1);
for (_j = (int) (1); (step449 > 0 && _j <= limit449) || (step449 < 0 && _j >= limit449); _j = ((int)(0 + _j + step449))) {
RDebugUtils.currentLine=2031656;
 //BA.debugLineNum = 2031656;BA.debugLine="HeaderWidths(i) = Max(HeaderWidths(i),cvs.MeasureStringWidth(str(j), L.Typeface, cTextSize)  + ExtraWidth)";
__ref._headerwidths[_i] = (int) (__c.Max(__ref._headerwidths[_i],__ref._cvs.MeasureStringWidth(_str[_j],_l.getTypeface(),__ref._ctextsize)+_extrawidth));
 }
};
 }else {
RDebugUtils.currentLine=2031659;
 //BA.debugLineNum = 2031659;BA.debugLine="HeaderWidths(i) = cvs.MeasureStringWidth(Values(i), L.Typeface, cTextSize)  + ExtraWidth";
__ref._headerwidths[_i] = (int) (__ref._cvs.MeasureStringWidth(_values[_i],_l.getTypeface(),__ref._ctextsize)+_extrawidth);
 };
RDebugUtils.currentLine=2031661;
 //BA.debugLineNum = 2031661;BA.debugLine="If HeaderWidths(i) > ColumnWidths(i) Then OR HeaderWidths(i) > ColumnWidths(i) Then";
if (__ref._headerwidths[_i]>__ref._columnwidths[_i]) { 
RDebugUtils.currentLine=2031662;
 //BA.debugLineNum = 2031662;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=2031663;
 //BA.debugLineNum = 2031663;BA.debugLine="ColumnWidths(i) = Max(HeaderWidths(i), ColumnWidths(i))";
__ref._columnwidths[_i] = (int) (__c.Max(__ref._headerwidths[_i],__ref._columnwidths[_i]));
 }else 
{RDebugUtils.currentLine=2031664;
 //BA.debugLineNum = 2031664;BA.debugLine="Else If ColumnWidths(i) > HeaderWidths(i) AND ColumnWidths(i) > DataWidths(i) Then";
if (__ref._columnwidths[_i]>__ref._headerwidths[_i] && __ref._columnwidths[_i]>__ref._datawidths[_i]) { 
RDebugUtils.currentLine=2031665;
 //BA.debugLineNum = 2031665;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=2031666;
 //BA.debugLineNum = 2031666;BA.debugLine="ColumnWidths(i) = Max(HeaderWidths(i), DataWidths(i))";
__ref._columnwidths[_i] = (int) (__c.Max(__ref._headerwidths[_i],__ref._datawidths[_i]));
 }};
 };
RDebugUtils.currentLine=2031669;
 //BA.debugLineNum = 2031669;BA.debugLine="Left = Left + ColumnWidths(i)";
_left = (int) (_left+__ref._columnwidths[_i]);
 }
};
RDebugUtils.currentLine=2031672;
 //BA.debugLineNum = 2031672;BA.debugLine="If Change = 1 Then";
if (_change==1) { 
RDebugUtils.currentLine=2031673;
 //BA.debugLineNum = 2031673;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths(null,__ref._columnwidths);
 };
RDebugUtils.currentLine=2031675;
 //BA.debugLineNum = 2031675;BA.debugLine="Header.Left = - SV.HorizontalScrollPosition";
__ref._header.setLeft((int) (-__ref._sv.getHorizontalScrollPosition()));
RDebugUtils.currentLine=2031676;
 //BA.debugLineNum = 2031676;BA.debugLine="End Sub";
return "";
}
public String  _clearall(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub ClearAll";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall(null,__ref._numberofcolumns);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="updateIPLocation";
__ref._updateiplocation(null);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public String  _loadtablefromcsv2(b4a.example.table __ref,String _dir,String _filename,boolean _headersexist,String _separatorchar,boolean _automaticwidths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.collections.List _list1 = null;
String[] _h = null;
anywheresoftware.b4a.objects.collections.List _headers = null;
int _i = 0;
String[] _firstrow = null;
int _col = 0;
int _row = 0;
String[] _strrow = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filename As String, HeadersExist As Boolean, SeparatorChar As String, AutomaticWidths As Boolean)";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths = _automaticwidths;
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, SeparatorChar, headers)";
_list1 = __ref._stringutils1.LoadCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_headers);
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step616 = 1;
final int limit616 = (int) (_headers.getSize()-1);
for (_i = (int) (0); (step616 > 0 && _i <= limit616) || (step616 < 0 && _i >= limit616); _i = ((int)(0 + _i + step616))) {
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="h(i) = headers.get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, SeparatorChar)";
_list1 = __ref._stringutils1.LoadCSV(_dir,_filename,BA.ObjectToChar(_separatorchar));
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="firstRow = List1.get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="Dim h(firstRow.Length) As String";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=2686995;
 //BA.debugLineNum = 2686995;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step624 = 1;
final int limit624 = (int) (_firstrow.length-1);
for (_i = (int) (0); (step624 > 0 && _i <= limit624) || (step624 < 0 && _i >= limit624); _i = ((int)(0 + _i + step624))) {
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=2686999;
 //BA.debugLineNum = 2686999;BA.debugLine="innerClearAll(h.Length)";
__ref._innerclearall(null,_h.length);
RDebugUtils.currentLine=2687000;
 //BA.debugLineNum = 2687000;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
_columnwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=2687001;
 //BA.debugLineNum = 2687001;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
_headerwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=2687002;
 //BA.debugLineNum = 2687002;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
_datawidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=2687004;
 //BA.debugLineNum = 2687004;BA.debugLine="Dim col, Row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=2687005;
 //BA.debugLineNum = 2687005;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=2687006;
 //BA.debugLineNum = 2687006;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step634 = 1;
final int limit634 = (int) (__ref._numberofcolumns-1);
for (_col = (int) (0); (step634 > 0 && _col <= limit634) || (step634 < 0 && _col >= limit634); _col = ((int)(0 + _col + step634))) {
RDebugUtils.currentLine=2687007;
 //BA.debugLineNum = 2687007;BA.debugLine="ColumnWidths(col) = SV.Width / NumberOfColumns";
__ref._columnwidths[_col] = (int) (__ref._sv.getWidth()/(double)__ref._numberofcolumns);
RDebugUtils.currentLine=2687008;
 //BA.debugLineNum = 2687008;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
__ref._headerwidths[_col] = __ref._columnwidths[_col];
RDebugUtils.currentLine=2687009;
 //BA.debugLineNum = 2687009;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
__ref._datawidths[_col] = __ref._columnwidths[_col];
 }
};
 }else {
RDebugUtils.currentLine=2687012;
 //BA.debugLineNum = 2687012;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=2687013;
 //BA.debugLineNum = 2687013;BA.debugLine="Dim strRow(NumberOfColumns) As String";
_strrow = new String[__ref._numberofcolumns];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=2687014;
 //BA.debugLineNum = 2687014;BA.debugLine="strRow = List1.get(col)";
_strrow = (String[])(_list1.Get(_col));
RDebugUtils.currentLine=2687015;
 //BA.debugLineNum = 2687015;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step643 = 1;
final int limit643 = (int) (__ref._numberofcolumns-1);
for (_col = (int) (0); (step643 > 0 && _col <= limit643) || (step643 < 0 && _col >= limit643); _col = ((int)(0 + _col + step643))) {
RDebugUtils.currentLine=2687016;
 //BA.debugLineNum = 2687016;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(headers.get(col), Typeface.DEFAULT, cTextSize) + 8dip + cLineWidth";
__ref._headerwidths[_col] = (int) (__ref._cvs.MeasureStringWidth(BA.ObjectToString(_headers.Get(_col)),__c.Typeface.DEFAULT,__ref._ctextsize)+__c.DipToCurrent((int) (8))+__ref._clinewidth);
 }
};
 };
RDebugUtils.currentLine=2687019;
 //BA.debugLineNum = 2687019;BA.debugLine="For Row = 0 To List1.Size - 1";
{
final int step647 = 1;
final int limit647 = (int) (_list1.getSize()-1);
for (_row = (int) (0); (step647 > 0 && _row <= limit647) || (step647 < 0 && _row >= limit647); _row = ((int)(0 + _row + step647))) {
RDebugUtils.currentLine=2687020;
 //BA.debugLineNum = 2687020;BA.debugLine="Dim strRow(NumberOfColumns) As String";
_strrow = new String[__ref._numberofcolumns];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=2687021;
 //BA.debugLineNum = 2687021;BA.debugLine="strRow = List1.get(Row)";
_strrow = (String[])(_list1.Get(_row));
RDebugUtils.currentLine=2687022;
 //BA.debugLineNum = 2687022;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step650 = 1;
final int limit650 = (int) (__ref._numberofcolumns-1);
for (_col = (int) (0); (step650 > 0 && _col <= limit650) || (step650 < 0 && _col >= limit650); _col = ((int)(0 + _col + step650))) {
RDebugUtils.currentLine=2687023;
 //BA.debugLineNum = 2687023;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.MeasureStringWidth(strRow(col), Typeface.DEFAULT, cTextSize) + 8dip + cLineWidth)";
__ref._datawidths[_col] = (int) (__c.Max(__ref._datawidths[_col],__ref._cvs.MeasureStringWidth(_strrow[_col],__c.Typeface.DEFAULT,__ref._ctextsize)+__c.DipToCurrent((int) (8))+__ref._clinewidth));
 }
};
 }
};
RDebugUtils.currentLine=2687026;
 //BA.debugLineNum = 2687026;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step654 = 1;
final int limit654 = (int) (__ref._numberofcolumns-1);
for (_col = (int) (0); (step654 > 0 && _col <= limit654) || (step654 < 0 && _col >= limit654); _col = ((int)(0 + _col + step654))) {
RDebugUtils.currentLine=2687027;
 //BA.debugLineNum = 2687027;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), DataWidths(col))";
__ref._columnwidths[_col] = (int) (__c.Max(__ref._headerwidths[_col],__ref._datawidths[_col]));
 }
};
 };
RDebugUtils.currentLine=2687030;
 //BA.debugLineNum = 2687030;BA.debugLine="SetHeader(h)";
__ref._setheader(null,_h);
RDebugUtils.currentLine=2687032;
 //BA.debugLineNum = 2687032;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths(null,__ref._columnwidths);
RDebugUtils.currentLine=2687034;
 //BA.debugLineNum = 2687034;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step660 = 1;
final int limit660 = (int) (_list1.getSize()-1);
for (_i = (int) (0); (step660 > 0 && _i <= limit660) || (step660 < 0 && _i >= limit660); _i = ((int)(0 + _i + step660))) {
RDebugUtils.currentLine=2687035;
 //BA.debugLineNum = 2687035;BA.debugLine="Dim strRow() As String";
_strrow = new String[(int) (0)];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=2687036;
 //BA.debugLineNum = 2687036;BA.debugLine="strRow = List1.get(i)";
_strrow = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=2687037;
 //BA.debugLineNum = 2687037;BA.debugLine="AddRow(strRow)";
__ref._addrow(null,_strrow);
 }
};
RDebugUtils.currentLine=2687039;
 //BA.debugLineNum = 2687039;BA.debugLine="End Sub";
return "";
}
public String  _setlinewidth(b4a.example.table __ref,int _linewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="cLineWidth = LineWidth";
__ref._clinewidth = _linewidth;
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.table __ref,float _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub setTextSize(Size As Float)";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="cTextSize = Size";
__ref._ctextsize = _size;
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step1123 = 1;
final int limit1123 = (int) (__ref._header.getNumberOfViews()-1);
for (_i = (int) (0); (step1123 > 0 && _i <= limit1123) || (step1123 < 0 && _i >= limit1123); _i = ((int)(0 + _i + step1123))) {
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="lbl = Header.GetView(i)";
_lbl.setObject((android.widget.TextView)(__ref._header.GetView(_i).getObject()));
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize);
 }
};
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="For i = 0 To SV.Panel.NumberOfViews - 1";
{
final int step1128 = 1;
final int limit1128 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0); (step1128 > 0 && _i <= limit1128) || (step1128 < 0 && _i >= limit1128); _i = ((int)(0 + _i + step1128))) {
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="lbl = SV.Panel.GetView(i)";
_lbl.setObject((android.widget.TextView)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize);
 }
};
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="End Sub";
return "";
}
public String  _settypefaces(b4a.example.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _typefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="If TypeFaces.Length <> NumberOfColumns AND NumberOfColumns > 0 Then";
if (_typefaces.length!=__ref._numberofcolumns && __ref._numberofcolumns>0) { 
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", False)";
__c.ToastMessageShow("Invalid number of columns",__c.False);
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="If TypeFaces.Length = 1 Then";
if (_typefaces.length==1) { 
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="cTypeFace = TypeFaces(0)";
__ref._ctypeface = _typefaces[(int) (0)];
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="MultiTypeFace = False";
__ref._multitypeface = __c.False;
 }else {
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="cTypeFaces = TypeFaces";
__ref._ctypefaces = _typefaces;
RDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="MultiTypeFace = True";
__ref._multitypeface = __c.True;
 };
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data.getSize()>0) { 
RDebugUtils.currentLine=7077903;
 //BA.debugLineNum = 7077903;BA.debugLine="refreshTable";
__ref._refreshtable(null);
 };
RDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnswidths(b4a.example.table __ref,int[] _widths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _col = 0;
int _row = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _w = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
_savedwidths = new int[_widths.length];
;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
_columnwidths = new int[_widths.length];
;
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
_headerwidths = new int[_widths.length];
;
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths==__c.False) { 
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step83 = 1;
final int limit83 = (int) (_widths.length-1);
for (_col = (int) (0); (step83 > 0 && _col <= limit83) || (step83 < 0 && _col >= limit83); _col = ((int)(0 + _col + step83))) {
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths[_col] = _widths[_col];
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths[_col] = _widths[_col];
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="HeaderWidths(col) = Widths(col)";
__ref._headerwidths[_col] = _widths[_col];
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="DataWidths(col) = Widths(col)";
__ref._datawidths[_col] = _widths[_col];
 }
};
 }else {
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step90 = 1;
final int limit90 = (int) (_widths.length-1);
for (_col = (int) (0); (step90 > 0 && _col <= limit90) || (step90 < 0 && _col >= limit90); _col = ((int)(0 + _col + step90))) {
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths[_col] = _widths[_col];
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths[_col] = _widths[_col];
 }
};
 };
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=1179670;
 //BA.debugLineNum = 1179670;BA.debugLine="Dim w As Int";
_w = 0;
RDebugUtils.currentLine=1179671;
 //BA.debugLineNum = 1179671;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step97 = 1;
final int limit97 = (int) (_widths.length-1);
for (_col = (int) (0); (step97 > 0 && _col <= limit97) || (step97 < 0 && _col >= limit97); _col = ((int)(0 + _col + step97))) {
RDebugUtils.currentLine=1179672;
 //BA.debugLineNum = 1179672;BA.debugLine="v = Header.GetView(col)";
_v = __ref._header.GetView(_col);
RDebugUtils.currentLine=1179673;
 //BA.debugLineNum = 1179673;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth));
RDebugUtils.currentLine=1179674;
 //BA.debugLineNum = 1179674;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=1179675;
 //BA.debugLineNum = 1179675;BA.debugLine="If col > 0 Then";
if (_col>0) { 
RDebugUtils.currentLine=1179676;
 //BA.debugLineNum = 1179676;BA.debugLine="v.Left = Header.GetView(col - 1).Left + Widths(col - 1)";
_v.setLeft((int) (__ref._header.GetView((int) (_col-1)).getLeft()+_widths[(int) (_col-1)]));
 };
 }
};
RDebugUtils.currentLine=1179679;
 //BA.debugLineNum = 1179679;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1).Left + Widths(Widths.Length - 1)";
__ref._header.setWidth((int) (__ref._header.GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
RDebugUtils.currentLine=1179680;
 //BA.debugLineNum = 1179680;BA.debugLine="SV.Panel.Width = Header.Width";
__ref._sv.getPanel().setWidth(__ref._header.getWidth());
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1179682;
 //BA.debugLineNum = 1179682;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step108 = 1;
final int limit108 = (int) (__ref._visiblerows.getSize()-1);
for (_row = (int) (0); (step108 > 0 && _row <= limit108) || (step108 < 0 && _row >= limit108); _row = ((int)(0 + _row + step108))) {
RDebugUtils.currentLine=1179683;
 //BA.debugLineNum = 1179683;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows.GetValueAt(_row));
RDebugUtils.currentLine=1179684;
 //BA.debugLineNum = 1179684;BA.debugLine="For col = 0 To lbls.Length - 1";
{
final int step110 = 1;
final int limit110 = (int) (_lbls.length-1);
for (_col = (int) (0); (step110 > 0 && _col <= limit110) || (step110 < 0 && _col >= limit110); _col = ((int)(0 + _col + step110))) {
RDebugUtils.currentLine=1179685;
 //BA.debugLineNum = 1179685;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left, lbls(col).Top, _ 				Header.GetView(col).Width, cRowHeight - cLineWidth)";
_lbls[_col].SetLayout(__ref._header.GetView(_col).getLeft(),_lbls[_col].getTop(),__ref._header.GetView(_col).getWidth(),(int) (__ref._crowheight-__ref._clinewidth));
 }
};
 }
};
RDebugUtils.currentLine=1179689;
 //BA.debugLineNum = 1179689;BA.debugLine="lblStatusLine.Width = Header.Width";
__ref._lblstatusline.setWidth(__ref._header.getWidth());
RDebugUtils.currentLine=1179690;
 //BA.debugLineNum = 1179690;BA.debugLine="internalPanel.Width = Header.Width";
__ref._internalpanel.setWidth(__ref._header.getWidth());
RDebugUtils.currentLine=1179691;
 //BA.debugLineNum = 1179691;BA.debugLine="End Sub";
return "";
}
public String  _addrow(b4a.example.table __ref,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _lastrow = 0;
boolean _changed = false;
int _extrawidth = 0;
int _width = 0;
int _i = 0;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub AddRow(Values() As String)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If Values.Length <> NumberOfColumns Then";
if (_values.length!=__ref._numberofcolumns) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length & \" col=\" & NumberOfColumns)";
__c.Log("Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._numberofcolumns));
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="Data.Add(Values)";
__ref._data.Add((Object)(_values));
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data.getSize()-1);
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths==__c.True) { 
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="Dim ExtraWidth, width As Int";
_extrawidth = 0;
_width = 0;
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
_extrawidth = (int) (__c.DipToCurrent((int) (8))+__ref._clinewidth);
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step260 = 1;
final int limit260 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step260 > 0 && _i <= limit260) || (step260 < 0 && _i >= limit260); _i = ((int)(0 + _i + step260))) {
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface==__c.False) { 
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTypeFace, cTextSize) + ExtraWidth";
_width = (int) (__ref._cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface.getObject()),__ref._ctextsize)+_extrawidth);
 }else {
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTypeFaces(i), cTextSize) + ExtraWidth";
_width = (int) (__ref._cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces[_i].getObject()),__ref._ctextsize)+_extrawidth);
 };
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths[_i]<_width) { 
RDebugUtils.currentLine=1572885;
 //BA.debugLineNum = 1572885;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths[_i] = _width;
RDebugUtils.currentLine=1572886;
 //BA.debugLineNum = 1572886;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths[_i] = _width;
RDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths[_i] = _width;
RDebugUtils.currentLine=1572888;
 //BA.debugLineNum = 1572888;BA.debugLine="DataWidths(i) = width";
__ref._datawidths[_i] = _width;
RDebugUtils.currentLine=1572889;
 //BA.debugLineNum = 1572889;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=1572892;
 //BA.debugLineNum = 1572892;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=1572893;
 //BA.debugLineNum = 1572893;BA.debugLine="refreshTable";
__ref._refreshtable(null);
 };
 }
};
 };
RDebugUtils.currentLine=1572898;
 //BA.debugLineNum = 1572898;BA.debugLine="If lastRow < (SV.VerticalScrollPosition + SV.Height) / cRowHeight + 1 Then";
if (_lastrow<(__ref._sv.getVerticalScrollPosition()+__ref._sv.getHeight())/(double)__ref._crowheight+1) { 
RDebugUtils.currentLine=1572899;
 //BA.debugLineNum = 1572899;BA.debugLine="ShowRow(lastRow)";
__ref._showrow(null,_lastrow);
 };
RDebugUtils.currentLine=1572901;
 //BA.debugLineNum = 1572901;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
__ref._sv.getPanel().setHeight((int) (__ref._data.getSize()*__ref._crowheight));
RDebugUtils.currentLine=1572902;
 //BA.debugLineNum = 1572902;BA.debugLine="updateIPLocation";
__ref._updateiplocation(null);
RDebugUtils.currentLine=1572903;
 //BA.debugLineNum = 1572903;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill=True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
if ((__ref._lblstatusline.IsInitialized() && __ref._enablestatuslineautofill==__c.True)) { 
__ref._setstatusline(null,BA.NumberToString(__ref._data.getSize())+" rows");};
RDebugUtils.currentLine=1572904;
 //BA.debugLineNum = 1572904;BA.debugLine="End Sub";
return "";
}
public String  _setusecolumncolors(b4a.example.table __ref,boolean _usecolumncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As Boolean)";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="cUseColumnColors = UseColumnColors";
__ref._cusecolumncolors = _usecolumncolors;
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="If cColumnColors.Length = 0 Then";
if (__ref._ccolumncolors.length==0) { 
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Dim cColumnColors(NumberOfColumns) As Int";
_ccolumncolors = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Dim cTextColors(NumberOfColumns) As Int";
_ctextcolors = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step1230 = 1;
final int limit1230 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step1230 > 0 && _i <= limit1230) || (step1230 < 0 && _i >= limit1230); _i = ((int)(0 + _i + step1230))) {
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="If i Mod 2 = 0 Then";
if (_i%2==0) { 
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="cColumnColors(i) = cRowColor1";
__ref._ccolumncolors[_i] = __ref._crowcolor1;
 }else {
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="cColumnColors(i) = cRowColor2";
__ref._ccolumncolors[_i] = __ref._crowcolor2;
 };
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="cTextColors(i) = cTextColor";
__ref._ctextcolors[_i] = __ref._ctextcolor;
 }
};
 };
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="If cHeaderColors.Length = 0 Then";
if (__ref._cheadercolors.length==0) { 
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="Dim cHeaderColors(NumberOfColumns) As Int";
_cheadercolors = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="Dim cHeaderTextColors(NumberOfColumns) As Int";
_cheadertextcolors = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step1243 = 1;
final int limit1243 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step1243 > 0 && _i <= limit1243) || (step1243 < 0 && _i >= limit1243); _i = ((int)(0 + _i + step1243))) {
RDebugUtils.currentLine=7471125;
 //BA.debugLineNum = 7471125;BA.debugLine="cHeaderColors(i) = cHeaderColor";
__ref._cheadercolors[_i] = __ref._cheadercolor;
RDebugUtils.currentLine=7471126;
 //BA.debugLineNum = 7471126;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
__ref._cheadertextcolors[_i] = __ref._cheadertextcolor;
 }
};
 };
RDebugUtils.currentLine=7471129;
 //BA.debugLineNum = 7471129;BA.debugLine="End Sub";
return "";
}
public String  _setcolumncolors(b4a.example.table __ref,int[] _columncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="cColumnColors = ColumnColors";
__ref._ccolumncolors = _columncolors;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public String  _settextcolors(b4a.example.table __ref,int[] _textcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="cTextColors = TextColors";
__ref._ctextcolors = _textcolors;
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolors(b4a.example.table __ref,int[] _headercolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="cHeaderColors = HeaderColors";
__ref._cheadercolors = _headercolors;
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolors(b4a.example.table __ref,int[] _headertextcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors() As Int)";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="cHeaderTextColors = HeaderTextColors";
__ref._cheadertextcolors = _headertextcolors;
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb(b4a.example.table __ref,anywheresoftware.b4a.sql.SQL _sqlite,String _query,boolean _automaticwidths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
String[] _r = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As String, AutomaticWidths As Boolean)";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs.setObject((android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths = _automaticwidths;
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="NumberOfColumns = Curs.ColumnCount";
__ref._numberofcolumns = _curs.getColumnCount();
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall(null,__ref._numberofcolumns);
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Dim Headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
_columnwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
_headerwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
_datawidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step1174 = 1;
final int limit1174 = (int) (__ref._numberofcolumns-1);
for (_col = (int) (0); (step1174 > 0 && _col <= limit1174) || (step1174 < 0 && _col >= limit1174); _col = ((int)(0 + _col + step1174))) {
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths[_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths[_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths[_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Headers(col), Typeface.DEFAULT, cTextSize) + 8dip + cLineWidth";
__ref._headerwidths[_col] = (int) (__ref._cvs.MeasureStringWidth(_headers[_col],__c.Typeface.DEFAULT,__ref._ctextsize)+__c.DipToCurrent((int) (8))+__ref._clinewidth);
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths[_col] = (int) (0);
RDebugUtils.currentLine=7143447;
 //BA.debugLineNum = 7143447;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step1183 = 1;
final int limit1183 = (int) (_curs.getRowCount()-1);
for (_row = (int) (0); (step1183 > 0 && _row <= limit1183) || (step1183 < 0 && _row >= limit1183); _row = ((int)(0 + _row + step1183))) {
RDebugUtils.currentLine=7143448;
 //BA.debugLineNum = 7143448;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=7143450;
 //BA.debugLineNum = 7143450;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=7143451;
 //BA.debugLineNum = 7143451;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.MeasureStringWidth(str, Typeface.DEFAULT, cTextSize) + 8dip + cLineWidth)";
__ref._datawidths[_col] = (int) (__c.Max(__ref._datawidths[_col],__ref._cvs.MeasureStringWidth(_str,__c.Typeface.DEFAULT,__ref._ctextsize)+__c.DipToCurrent((int) (8))+__ref._clinewidth));
 };
 }
};
RDebugUtils.currentLine=7143454;
 //BA.debugLineNum = 7143454;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), DataWidths(col))";
__ref._columnwidths[_col] = (int) (__c.Max(__ref._headerwidths[_col],__ref._datawidths[_col]));
 };
 }
};
RDebugUtils.currentLine=7143457;
 //BA.debugLineNum = 7143457;BA.debugLine="SetHeader(Headers)";
__ref._setheader(null,_headers);
RDebugUtils.currentLine=7143458;
 //BA.debugLineNum = 7143458;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths(null,__ref._columnwidths);
RDebugUtils.currentLine=7143460;
 //BA.debugLineNum = 7143460;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step1195 = 1;
final int limit1195 = (int) (_curs.getRowCount()-1);
for (_row = (int) (0); (step1195 > 0 && _row <= limit1195) || (step1195 < 0 && _row >= limit1195); _row = ((int)(0 + _row + step1195))) {
RDebugUtils.currentLine=7143461;
 //BA.debugLineNum = 7143461;BA.debugLine="Dim R(NumberOfColumns), str As String";
_r = new String[__ref._numberofcolumns];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=7143462;
 //BA.debugLineNum = 7143462;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step1197 = 1;
final int limit1197 = (int) (__ref._numberofcolumns-1);
for (_col = (int) (0); (step1197 > 0 && _col <= limit1197) || (step1197 < 0 && _col >= limit1197); _col = ((int)(0 + _col + step1197))) {
RDebugUtils.currentLine=7143463;
 //BA.debugLineNum = 7143463;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=7143464;
 //BA.debugLineNum = 7143464;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=7143465;
 //BA.debugLineNum = 7143465;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=7143466;
 //BA.debugLineNum = 7143466;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=7143468;
 //BA.debugLineNum = 7143468;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=7143471;
 //BA.debugLineNum = 7143471;BA.debugLine="AddRow(R)";
__ref._addrow(null,_r);
 }
};
RDebugUtils.currentLine=7143474;
 //BA.debugLineNum = 7143474;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=7143475;
 //BA.debugLineNum = 7143475;BA.debugLine="End Sub";
return "";
}
public String  _getvalue(b4a.example.table __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
String[] _values = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As String";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="values = Data.get(Row)";
_values = (String[])(__ref._data.Get(_row));
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="End Sub";
return "";
}
public String  _refreshtable(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub refreshTable";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.VerticalScrollPosition) ' this strange call will set min/max visible area";
__ref._sv_scrollchanged(null,__ref._sv.getHorizontalScrollPosition(),__ref._sv.getVerticalScrollPosition());
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all visible rows";
{
final int step761 = 1;
final int limit761 = __ref._maxvisiblerow;
for (_i = __ref._minvisiblerow; (step761 > 0 && _i <= limit761) || (step761 < 0 && _i >= limit761); _i = ((int)(0 + _i + step761))) {
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="HideRow(i)";
__ref._hiderow(null,_i);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="ShowRow(i)";
__ref._showrow(null,_i);
 }
};
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="End Sub";
return "";
}
public String  _showrow(b4a.example.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
String[] _values = null;
Object[] _rowcolor = null;
int _i = 0;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub ShowRow(Row As Int)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
if (__ref._visiblerows.ContainsKey((Object)(_row))) { 
if (true) return "";};
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="lbls = GetLabels(Row)";
_lbls = __ref._getlabels(null,_row);
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="values = Data.get(Row)";
_values = (String[])(__ref._data.Get(_row));
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="visibleRows.Put(Row, lbls)";
__ref._visiblerows.Put((Object)(_row),(Object)(_lbls));
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
if ((__ref._selectedrows.IndexOf((Object)(_row))!=-1)) { 
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = __ref._selecteddrawable;
 }else 
{RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="Else If Row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="rowColor = Drawable1";
_rowcolor = __ref._drawable1;
 }else {
RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="rowColor = Drawable2";
_rowcolor = __ref._drawable2;
 }};
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step335 = 1;
final int limit335 = (int) (_lbls.length-1);
for (_i = (int) (0); (step335 > 0 && _i <= limit335) || (step335 < 0 && _i >= limit335); _i = ((int)(0 + _i + step335))) {
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
if ((__ref._header.GetView(_i).getWidth()>1)) { 
RDebugUtils.currentLine=1703954;
 //BA.debugLineNum = 1703954;BA.debugLine="SV.Panel.AddView(lbls(I), Header.GetView(I).Left, Row * cRowHeight, Header.GetView(I).Width, cRowHeight - cLineWidth)";
__ref._sv.getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header.GetView(_i).getLeft(),(int) (_row*__ref._crowheight),__ref._header.GetView(_i).getWidth(),(int) (__ref._crowheight-__ref._clinewidth));
RDebugUtils.currentLine=1703955;
 //BA.debugLineNum = 1703955;BA.debugLine="lbls(I).Text = values(I)";
_lbls[_i].setText((Object)(_values[_i]));
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="SetPadding(lbls(I), 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding(null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbls[_i].getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="If I = SelectedCol AND (SelectedRows.indexof(Row) <> -1) Then";
if (_i==__ref._selectedcol && (__ref._selectedrows.IndexOf((Object)(_row))!=-1)) { 
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="lbls(I).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable));
 }else {
RDebugUtils.currentLine=1703960;
 //BA.debugLineNum = 1703960;BA.debugLine="lbls(I).Background = rowColor(I)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 };
RDebugUtils.currentLine=1703962;
 //BA.debugLineNum = 1703962;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments==__c.False) { 
RDebugUtils.currentLine=1703963;
 //BA.debugLineNum = 1703963;BA.debugLine="lbls(I).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment);
 }else {
RDebugUtils.currentLine=1703965;
 //BA.debugLineNum = 1703965;BA.debugLine="lbls(I).Gravity = cAlignments(I)";
_lbls[_i].setGravity(__ref._calignments[_i]);
 };
 };
 }
};
RDebugUtils.currentLine=1703969;
 //BA.debugLineNum = 1703969;BA.debugLine="End Sub";
return "";
}
public String  _updateiplocation(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub updateIPLocation";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If (SV.Height > Data.Size * cRowHeight) Then";
if ((__ref._sv.getHeight()>__ref._data.getSize()*__ref._crowheight)) { 
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cRowHeight";
__ref._internalpanel.setTop((int) (__ref._data.getSize()*__ref._crowheight+__ref._crowheight));
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="internalPanel.Height = SV.Height - (Data.Size * cRowHeight)";
__ref._internalpanel.setHeight((int) (__ref._sv.getHeight()-(__ref._data.getSize()*__ref._crowheight)));
 }else {
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="internalPanel.Height = 0";
__ref._internalpanel.setHeight((int) (0));
 };
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="End Sub";
return "";
}
public String  _setstatusline(b4a.example.table __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub setStatusLine(s As String)";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLine.Text = s";
if ((__ref._lblstatusline.IsInitialized())) { 
__ref._lblstatusline.setText((Object)(_s));};
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public String  _addrowautomaticwidth(b4a.example.table __ref,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _lastrow = 0;
boolean _changed = false;
int _extrawidth = 0;
int _width = 0;
int _i = 0;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If Values.Length <> NumberOfColumns Then";
if (_values.length!=__ref._numberofcolumns) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length & \" col=\" & NumberOfColumns)";
__c.Log("Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._numberofcolumns));
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Data.Add(Values)";
__ref._data.Add((Object)(_values));
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data.getSize()-1);
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="Dim ExtraWidth, width As Int";
_extrawidth = 0;
_width = 0;
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="ExtraWidth = 8dip + cLineWidth";
_extrawidth = (int) (__c.DipToCurrent((int) (8))+__ref._clinewidth);
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="For I = 0 To NumberOfColumns - 1";
{
final int step296 = 1;
final int limit296 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step296 > 0 && _i <= limit296) || (step296 < 0 && _i >= limit296); _i = ((int)(0 + _i + step296))) {
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface==__c.False) { 
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="width = cvs.MeasureStringWidth(Values(I), cTypeFace, cTextSize) + ExtraWidth";
_width = (int) (__ref._cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface.getObject()),__ref._ctextsize)+_extrawidth);
 }else {
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="width = cvs.MeasureStringWidth(Values(I), cTypeFaces(I), cTextSize) + ExtraWidth";
_width = (int) (__ref._cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces[_i].getObject()),__ref._ctextsize)+_extrawidth);
 };
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="If ColumnWidths(I) < width Then";
if (__ref._columnwidths[_i]<_width) { 
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="ColumnWidths(I) = width";
__ref._columnwidths[_i] = _width;
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="SavedWidths(I) = width";
__ref._savedwidths[_i] = _width;
RDebugUtils.currentLine=1638422;
 //BA.debugLineNum = 1638422;BA.debugLine="HeaderWidths(I) = width";
__ref._headerwidths[_i] = _width;
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="DataWidths(I) = width";
__ref._datawidths[_i] = _width;
RDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=1638427;
 //BA.debugLineNum = 1638427;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=1638428;
 //BA.debugLineNum = 1638428;BA.debugLine="refreshTable";
__ref._refreshtable(null);
 };
 }
};
RDebugUtils.currentLine=1638432;
 //BA.debugLineNum = 1638432;BA.debugLine="If lastRow < (SV.VerticalScrollPosition + SV.Height) / cRowHeight + 1 Then";
if (_lastrow<(__ref._sv.getVerticalScrollPosition()+__ref._sv.getHeight())/(double)__ref._crowheight+1) { 
RDebugUtils.currentLine=1638433;
 //BA.debugLineNum = 1638433;BA.debugLine="ShowRow(lastRow)";
__ref._showrow(null,_lastrow);
 };
RDebugUtils.currentLine=1638435;
 //BA.debugLineNum = 1638435;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
__ref._sv.getPanel().setHeight((int) (__ref._data.getSize()*__ref._crowheight));
RDebugUtils.currentLine=1638436;
 //BA.debugLineNum = 1638436;BA.debugLine="updateIPLocation";
__ref._updateiplocation(null);
RDebugUtils.currentLine=1638437;
 //BA.debugLineNum = 1638437;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill=True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
if ((__ref._lblstatusline.IsInitialized() && __ref._enablestatuslineautofill==__c.True)) { 
__ref._setstatusline(null,BA.NumberToString(__ref._data.getSize())+" rows");};
RDebugUtils.currentLine=1638438;
 //BA.debugLineNum = 1638438;BA.debugLine="End Sub";
return "";
}
public String  _innerclearall(b4a.example.table __ref,int _vnumberofcolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd1 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd2 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd3 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd4 = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows.Initialize();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="For i = SV.Panel.NumberOfViews -1 To 0 Step -1";
{
final int step122 = (int) (-1);
final int limit122 = (int) (0);
for (_i = (int) (__ref._sv.getPanel().getNumberOfViews()-1); (step122 > 0 && _i <= limit122) || (step122 < 0 && _i >= limit122); _i = ((int)(0 + _i + step122))) {
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="SV.Panel.RemoveViewAt(i)";
__ref._sv.getPanel().RemoveViewAt(_i);
 }
};
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="NumberOfColumns = vNumberOfColumns";
__ref._numberofcolumns = _vnumberofcolumns;
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Dim Drawable1(NumberOfColumns) As Object";
_drawable1 = new Object[__ref._numberofcolumns];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Dim Drawable2(NumberOfColumns) As Object";
_drawable2 = new Object[__ref._numberofcolumns];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Dim SelectedDrawable(NumberOfColumns) As Object";
_selecteddrawable = new Object[__ref._numberofcolumns];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Dim cAlignments(NumberOfColumns) As Int";
_calignments = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors==__c.False) { 
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step131 = 1;
final int limit131 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step131 > 0 && _i <= limit131) || (step131 < 0 && _i >= limit131); _i = ((int)(0 + _i + step131))) {
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
_cd1.Initialize(__ref._crowcolor1,(int) (0));
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
_cd2.Initialize(__ref._crowcolor2,(int) (0));
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor,(int) (0));
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1[_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2[_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable[_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments==__c.False) { 
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments[_i] = __ref._calignment;
 }else {
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments[_i] = __ref._calignments0[_i];
 };
 }
};
 }else {
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step146 = 1;
final int limit146 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step146 > 0 && _i <= limit146) || (step146 < 0 && _i >= limit146); _i = ((int)(0 + _i + step146))) {
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
_cd1.Initialize(__ref._ccolumncolors[_i],(int) (0));
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
_cd2.Initialize(__ref._ccolumncolors[_i],(int) (0));
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor,(int) (0));
RDebugUtils.currentLine=1310751;
 //BA.debugLineNum = 1310751;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1[_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2[_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable[_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=1310754;
 //BA.debugLineNum = 1310754;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments==__c.False) { 
RDebugUtils.currentLine=1310755;
 //BA.debugLineNum = 1310755;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments[_i] = __ref._calignment;
 }else {
RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments[_i] = __ref._calignments0[_i];
 };
 }
};
 };
RDebugUtils.currentLine=1310762;
 //BA.debugLineNum = 1310762;BA.debugLine="Dim cd4 As ColorDrawable";
_cd4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1310763;
 //BA.debugLineNum = 1310763;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
_cd4.Initialize(__ref._cselectedcellcolor,(int) (0));
RDebugUtils.currentLine=1310764;
 //BA.debugLineNum = 1310764;BA.debugLine="SelectedCellDrawable = cd4";
__ref._selectedcelldrawable = (Object)(_cd4.getObject());
RDebugUtils.currentLine=1310766;
 //BA.debugLineNum = 1310766;BA.debugLine="SV.Panel.Height = 0";
__ref._sv.getPanel().setHeight((int) (0));
RDebugUtils.currentLine=1310769;
 //BA.debugLineNum = 1310769;BA.debugLine="SelectedCol = -1";
__ref._selectedcol = (int) (-1);
RDebugUtils.currentLine=1310770;
 //BA.debugLineNum = 1310770;BA.debugLine="minVisibleRow = -1";
__ref._minvisiblerow = (int) (-1);
RDebugUtils.currentLine=1310771;
 //BA.debugLineNum = 1310771;BA.debugLine="maxVisibleRow = 0";
__ref._maxvisiblerow = (int) (0);
RDebugUtils.currentLine=1310772;
 //BA.debugLineNum = 1310772;BA.debugLine="Data.Initialize";
__ref._data.Initialize();
RDebugUtils.currentLine=1310773;
 //BA.debugLineNum = 1310773;BA.debugLine="LabelsCache.Initialize";
__ref._labelscache.Initialize();
RDebugUtils.currentLine=1310774;
 //BA.debugLineNum = 1310774;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows.Initialize();
RDebugUtils.currentLine=1310775;
 //BA.debugLineNum = 1310775;BA.debugLine="SV.VerticalScrollPosition = 0";
__ref._sv.setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=1310776;
 //BA.debugLineNum = 1310776;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=1310777;
 //BA.debugLineNum = 1310777;BA.debugLine="SV.VerticalScrollPosition = 0";
__ref._sv.setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=1310778;
 //BA.debugLineNum = 1310778;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on the first touch";
{
final int step174 = 1;
final int limit174 = (int) (80);
for (_i = (int) (1); (step174 > 0 && _i <= limit174) || (step174 < 0 && _i >= limit174); _i = ((int)(0 + _i + step174))) {
RDebugUtils.currentLine=1310779;
 //BA.debugLineNum = 1310779;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
__ref._labelscache.Add((Object)(__ref._createnewlabels(null)));
 }
};
RDebugUtils.currentLine=1310781;
 //BA.debugLineNum = 1310781;BA.debugLine="If IsVisible Then";
if (__ref._isvisible) { 
RDebugUtils.currentLine=1310782;
 //BA.debugLineNum = 1310782;BA.debugLine="SV_ScrollChanged(0, 0)";
__ref._sv_scrollchanged(null,(int) (0),(int) (0));
 };
RDebugUtils.currentLine=1310784;
 //BA.debugLineNum = 1310784;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill = True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
if ((__ref._lblstatusline.IsInitialized() && __ref._enablestatuslineautofill==__c.True)) { 
__ref._setstatusline(null,BA.NumberToString(__ref._data.getSize())+" rows");};
RDebugUtils.currentLine=1310786;
 //BA.debugLineNum = 1310786;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(b4a.example.table __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _currentmin = 0;
int _currentmax = 0;
int _i = 0;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub SV_ScrollChanged(PosX As Int, PosY As Int)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
_currentmin = (int) (__c.Max(0,_posy/(double)__ref._crowheight-30));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV.Height) / cRowHeight + 30)";
_currentmax = (int) (__c.Min(__ref._data.getSize()-1,(_posy+__ref._sv.getHeight())/(double)__ref._crowheight+30));
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="If minVisibleRow > -1 Then";
if (__ref._minvisiblerow>-1) { 
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="If minVisibleRow < currentMin Then";
if (__ref._minvisiblerow<_currentmin) { 
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, maxVisibleRow)";
{
final int step188 = 1;
final int limit188 = (int) (__c.Min(_currentmin-1,__ref._maxvisiblerow));
for (_i = __ref._minvisiblerow; (step188 > 0 && _i <= limit188) || (step188 < 0 && _i >= limit188); _i = ((int)(0 + _i + step188))) {
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="HideRow(I)";
__ref._hiderow(null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Else If minVisibleRow > currentMin Then";
if (__ref._minvisiblerow>_currentmin) { 
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, currentMax)";
{
final int step192 = 1;
final int limit192 = (int) (__c.Min(__ref._minvisiblerow-1,_currentmax));
for (_i = _currentmin; (step192 > 0 && _i <= limit192) || (step192 < 0 && _i >= limit192); _i = ((int)(0 + _i + step192))) {
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="ShowRow(I)";
__ref._showrow(null,_i);
 }
};
 }};
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="If maxVisibleRow > currentMax Then";
if (__ref._maxvisiblerow>_currentmax) { 
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, minVisibleRow) Step -1";
{
final int step197 = (int) (-1);
final int limit197 = (int) (__c.Max(_currentmax+1,__ref._minvisiblerow));
for (_i = __ref._maxvisiblerow; (step197 > 0 && _i <= limit197) || (step197 < 0 && _i >= limit197); _i = ((int)(0 + _i + step197))) {
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="HideRow(I)";
__ref._hiderow(null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=1376277;
 //BA.debugLineNum = 1376277;BA.debugLine="Else If maxVisibleRow < currentMax Then";
if (__ref._maxvisiblerow<_currentmax) { 
RDebugUtils.currentLine=1376279;
 //BA.debugLineNum = 1376279;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, currentMin) Step -1";
{
final int step201 = (int) (-1);
final int limit201 = (int) (__c.Max(__ref._maxvisiblerow+1,_currentmin));
for (_i = _currentmax; (step201 > 0 && _i <= limit201) || (step201 < 0 && _i >= limit201); _i = ((int)(0 + _i + step201))) {
RDebugUtils.currentLine=1376280;
 //BA.debugLineNum = 1376280;BA.debugLine="ShowRow(I)";
__ref._showrow(null,_i);
 }
};
 }};
 };
RDebugUtils.currentLine=1376284;
 //BA.debugLineNum = 1376284;BA.debugLine="minVisibleRow = currentMin";
__ref._minvisiblerow = _currentmin;
RDebugUtils.currentLine=1376285;
 //BA.debugLineNum = 1376285;BA.debugLine="maxVisibleRow = currentMax";
__ref._maxvisiblerow = _currentmax;
RDebugUtils.currentLine=1376286;
 //BA.debugLineNum = 1376286;BA.debugLine="Header.Left = -PosX";
__ref._header.setLeft((int) (-_posx));
RDebugUtils.currentLine=1376287;
 //BA.debugLineNum = 1376287;BA.debugLine="lblStatusLine.Left = - PosX";
__ref._lblstatusline.setLeft((int) (-_posx));
RDebugUtils.currentLine=1376288;
 //BA.debugLineNum = 1376288;BA.debugLine="End Sub";
return "";
}
public String  _addtoview(b4a.example.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top As Int, Width As Int, Height As Int)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
__ref._addtoactivity(null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_v.getObject())),_left,_top,_width,_height);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
b4a.example.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub Cell_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.table._rowcol();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="L = Sender";
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="SelectRow(rc)";
__ref._selectrow(null,_rc);
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="If SubExists(Callback, Event & \"_CellClick\") Then";
if (__c.SubExists(ba,__ref._callback,__ref._event+"_CellClick")) { 
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="CallSub3(Callback, Event & \"_CellClick\", rc.Col, rc.Row)";
__c.CallSubNew3(ba,__ref._callback,__ref._event+"_CellClick",(Object)(_rc.Col),(Object)(_rc.Row));
 };
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
b4a.example.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.table._rowcol();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="L = Sender";
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="If SubExists(Callback, Event & \"_CellLongClick\") Then";
if (__c.SubExists(ba,__ref._callback,__ref._event+"_CellLongClick")) { 
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="CallSub3(Callback, Event & \"_CellLongClick\", rc.Col, rc.Row)";
__c.CallSubNew3(ba,__ref._callback,__ref._event+"_CellLongClick",(Object)(_rc.Col),(Object)(_rc.Row));
 };
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="End Sub";
return "";
}
public String  _clearselection(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub clearSelection";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows.Clear();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="refreshTable";
__ref._refreshtable(null);
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _createnewlabels(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.example.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.agraham.reflection.Reflection _ref = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub CreateNewLabels As Label()";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim lbls(NumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._numberofcolumns];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step385 = 1;
final int limit385 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step385 > 0 && _i <= limit385) || (step385 < 0 && _i >= limit385); _i = ((int)(0 + _i + step385))) {
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.table._rowcol();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="rc.Col = i";
_rc.Col = _i;
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="L.Initialize(\"Cell\")";
_l.Initialize(ba,"Cell");
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments==__c.False) { 
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="L.Gravity = cAlignment";
_l.setGravity(__ref._calignment);
 }else {
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="L.Gravity = cAlignments(i)";
_l.setGravity(__ref._calignments[_i]);
 };
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="L.TextSize = cTextSize";
_l.setTextSize(__ref._ctextsize);
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors==__c.False) { 
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="L.TextColor = cTextColor";
_l.setTextColor(__ref._ctextcolor);
 }else {
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="L.TextColor = cTextColors(i)";
_l.setTextColor(__ref._ctextcolors[_i]);
 };
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface==__c.False) { 
RDebugUtils.currentLine=1966101;
 //BA.debugLineNum = 1966101;BA.debugLine="L.Typeface = cTypeFace";
_l.setTypeface((android.graphics.Typeface)(__ref._ctypeface.getObject()));
 }else {
RDebugUtils.currentLine=1966103;
 //BA.debugLineNum = 1966103;BA.debugLine="L.Typeface = cTypeFaces(i)";
_l.setTypeface((android.graphics.Typeface)(__ref._ctypefaces[_i].getObject()));
 };
RDebugUtils.currentLine=1966106;
 //BA.debugLineNum = 1966106;BA.debugLine="If cSingleLine Then";
if (__ref._csingleline) { 
RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="Dim ref As Reflector";
_ref = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=1966108;
 //BA.debugLineNum = 1966108;BA.debugLine="ref.Target = L";
_ref.Target = (Object)(_l.getObject());
RDebugUtils.currentLine=1966109;
 //BA.debugLineNum = 1966109;BA.debugLine="ref.RunMethod2(\"setSingleLine\", True, \"java.lang.boolean\")";
_ref.RunMethod2("setSingleLine",BA.ObjectToString(__c.True),"java.lang.boolean");
 };
RDebugUtils.currentLine=1966111;
 //BA.debugLineNum = 1966111;BA.debugLine="L.Tag = rc";
_l.setTag((Object)(_rc));
RDebugUtils.currentLine=1966112;
 //BA.debugLineNum = 1966112;BA.debugLine="lbls(i) = L";
_lbls[_i] = _l;
 }
};
RDebugUtils.currentLine=1966114;
 //BA.debugLineNum = 1966114;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=1966115;
 //BA.debugLineNum = 1966115;BA.debugLine="End Sub";
return null;
}
public boolean  _getallowselection(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub getAllowSelection As Boolean";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Return cAllowSelection";
if (true) return __ref._callowselection;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return false;
}
public int  _getcellalignment(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub getCellAlignment As Int";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Return cAlignment";
if (true) return __ref._calignment;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return 0;
}
public int[]  _getcolumncolors(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub GetColumnColors As Int()";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Return cColumnColors";
if (true) return __ref._ccolumncolors;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return null;
}
public int[]  _getcolumnwidths(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub GetColumnWidths As Int()";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Return SavedWidths";
if (true) return __ref._savedwidths;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return null;
}
public int  _getheadercolor(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Return cHeaderColor";
if (true) return __ref._cheadercolor;
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadercolors(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub GetHeaderColors As Int()";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Return cHeaderColors";
if (true) return __ref._cheadercolors;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return null;
}
public int  _getheaderheight(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub getHeaderHeight As Int";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Return cHeaderHeight";
if (true) return __ref._cheaderheight;
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getheaderpanel(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub getHeaderPanel As Panel";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Return Header";
if (true) return __ref._header;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return null;
}
public int  _getheadertextcolor(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Public Sub getHeaderTextColor As Int";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Return cHeaderTextColor";
if (true) return __ref._cheadertextcolor;
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadertextcolors(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Return cHeaderTextColors";
if (true) return __ref._cheadertextcolors;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return null;
}
public int  _getheight(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Return pnlTable.Height";
if (true) return __ref._pnltable.getHeight();
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _getlabels(b4a.example.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.example.table._rowcol _rc = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache.getSize()>0) { 
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="lbls = LabelsCache.get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache.Get((int) (__ref._labelscache.getSize()-1)));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
__ref._labelscache.RemoveAt((int) (__ref._labelscache.getSize()-1));
 }else {
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="lbls = CreateNewLabels";
_lbls = __ref._createnewlabels(null);
 };
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step376 = 1;
final int limit376 = (int) (_lbls.length-1);
for (_i = (int) (0); (step376 > 0 && _i <= limit376) || (step376 < 0 && _i >= limit376); _i = ((int)(0 + _i + step376))) {
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.table._rowcol();
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="rc = lbls(I).Tag";
_rc = (b4a.example.table._rowcol)(_lbls[_i].getTag());
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="rc.Row = Row";
_rc.Row = _row;
 }
};
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="End Sub";
return null;
}
public int  _getleft(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Return pnlTable.Left";
if (true) return __ref._pnltable.getLeft();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return 0;
}
public int  _getlinewidth(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub getLineWidth As Int";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return cLineWidth";
if (true) return __ref._clinewidth;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return 0;
}
public boolean  _getmultiselect(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub getMultiSelect As Boolean";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return IsMultiSelect";
if (true) return __ref._ismultiselect;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return false;
}
public int  _getrowcolor1(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub getRowColor1 As Int";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Return cRowColor1";
if (true) return __ref._crowcolor1;
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolor2(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub getRowColor2 As Int";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Return cRowColor2";
if (true) return __ref._crowcolor2;
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return 0;
}
public int  _getrowheight(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub getRowHeight As Int";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Return cRowHeight";
if (true) return __ref._crowheight;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcellcolor(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub getSelectedCellColor As Int";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Return cSelectedCellColor";
if (true) return __ref._cselectedcellcolor;
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedrowcolor(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub getSelectedRowColor As Int";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Return cSelectedRowColor";
if (true) return __ref._cselectedrowcolor;
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getselectedrows(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.collections.List _sr = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub getSelectedRows As List";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim sr As List";
_sr = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="sr.Initialize";
_sr.Initialize();
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="sr.AddAll(SelectedRows)";
_sr.AddAll(__ref._selectedrows);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Return sr";
if (true) return _sr;
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="End Sub";
return null;
}
public boolean  _getsingleline(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub getSingleLine As Boolean";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Return cSingleLine";
if (true) return __ref._csingleline;
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return false;
}
public long  _getsize(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub getSize As Long";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Return Data.Size";
if (true) return (long) (__ref._data.getSize());
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return 0L;
}
public boolean  _getsortcolumn(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub getSortColumn As Boolean";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Return cSortColumn";
if (true) return __ref._csortcolumn;
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return false;
}
public int  _gettablecolor(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub getTableColor As Int";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Return cTableColor";
if (true) return __ref._ctablecolor;
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return 0;
}
public int  _gettextcolor(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub getTextColor As Int";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Return cTextColor";
if (true) return __ref._ctextcolor;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return 0;
}
public int[]  _gettextcolors(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub GetTextColors As Int()";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Return cTextColors";
if (true) return __ref._ctextcolors;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return null;
}
public float  _gettextsize(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub getTextSize As Float";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Return cTextSize";
if (true) return __ref._ctextsize;
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return pnlTable.Top";
if (true) return __ref._pnltable.getTop();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return 0;
}
public boolean  _getusecolumncolors(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub getUseColumnColors As Boolean";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Return cUseColumnColors";
if (true) return __ref._cusecolumncolors;
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return false;
}
public String[]  _getvalues(b4a.example.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
String[] _rowdata = null;
String[] _tmp = null;
int _i = 0;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim rowData() As String  = Data.get(Row) ' will throw an excpetion if row is not correct";
_rowdata = (String[])(__ref._data.Get(_row));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim tmp(NumberOfColumns) As String";
_tmp = new String[__ref._numberofcolumns];
java.util.Arrays.fill(_tmp,"");
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="For i=0 To NumberOfColumns-1 ' copy the array";
{
final int step709 = 1;
final int limit709 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step709 > 0 && _i <= limit709) || (step709 < 0 && _i >= limit709); _i = ((int)(0 + _i + step709))) {
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="tmp(i) =  rowData(i)";
_tmp[_i] = _rowdata[_i];
 }
};
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Return tmp";
if (true) return _tmp;
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return pnlTable.Visible";
if (true) return __ref._pnltable.getVisible();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return false;
}
public int  _getwidth(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Return pnlTable.Width";
if (true) return __ref._pnltable.getWidth();
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return 0;
}
public String  _header_click(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
int _dir = 0;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub Header_Click";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="L = Sender";
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="If cSortColumn = True Then";
if (__ref._csortcolumn==__c.True) { 
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="Dim dir As Int = 0 ' unsorted";
_dir = (int) (0);
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="If (sortedCol = col) Then ' we are sorting the same col, reverse dir";
if ((__ref._sortedcol==_col)) { 
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Select sortingDir";
switch (BA.switchObjectToInt(__ref._sortingdir,(int) (0),(int) (1),(int) (-1))) {
case 0:
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Case 0: dir = -1 ' going up";
_dir = (int) (-1);
 break;
case 1:
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="Case 1: dir = -1";
_dir = (int) (-1);
 break;
case 2:
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="Case -1: dir = 1";
_dir = (int) (1);
 break;
}
;
 }else {
RDebugUtils.currentLine=4784146;
 //BA.debugLineNum = 4784146;BA.debugLine="dir = -1 ' start with going up";
_dir = (int) (-1);
 };
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="sortedCol = col";
__ref._sortedcol = _col;
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="sortingDir = dir";
__ref._sortingdir = _dir;
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="sortTable(col,dir <=0)";
__ref._sorttable(null,_col,_dir<=0);
RDebugUtils.currentLine=4784151;
 //BA.debugLineNum = 4784151;BA.debugLine="showHeaderSorting(col, dir)";
__ref._showheadersorting(null,_col,_dir);
 };
RDebugUtils.currentLine=4784154;
 //BA.debugLineNum = 4784154;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Then";
if (__c.SubExists(ba,__ref._callback,__ref._event+"_HeaderClick")) { 
RDebugUtils.currentLine=4784155;
 //BA.debugLineNum = 4784155;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", col)";
__c.CallSubNew2(ba,__ref._callback,__ref._event+"_HeaderClick",(Object)(_col));
 };
RDebugUtils.currentLine=4784157;
 //BA.debugLineNum = 4784157;BA.debugLine="End Sub";
return "";
}
public String  _sorttable(b4a.example.table __ref,int _col,boolean _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub sortTable(col As Int, dir As Boolean)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Log (\"sorting table for col:\" & col)";
__c.Log("sorting table for col:"+BA.NumberToString(_col));
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="clearSelection";
__ref._clearselection(null);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="debug_counter = 0";
__ref._debug_counter = (long) (0);
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="SelectionSort(col, dir)";
__ref._selectionsort(null,_col,_dir);
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="refreshTable";
__ref._refreshtable(null);
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="End Sub";
return "";
}
public String  _showheadersorting(b4a.example.table __ref,int _col,int _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _ll = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _l = 0;
int _t = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub showHeaderSorting(col As Int,dir As Int)";
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="Dim ll As Int = 40";
_ll = (int) (40);
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="sortingView.RemoveView";
__ref._sortingview.RemoveView();
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
if ((_dir==0)) { 
if (true) return "";};
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="If (dir = -1) Then";
if ((_dir==-1)) { 
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="sortingView.SetBackgroundImage(LoadBitmapSample(File.DirAssets, \"sort_asc.png\", ll, ll))";
__ref._sortingview.SetBackgroundImage((android.graphics.Bitmap)(__c.LoadBitmapSample(__c.File.getDirAssets(),"sort_asc.png",_ll,_ll).getObject()));
 }else {
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="sortingView.SetBackgroundImage(LoadBitmapSample(File.DirAssets, \"sort_desc.png\", ll, ll))";
__ref._sortingview.SetBackgroundImage((android.graphics.Bitmap)(__c.LoadBitmapSample(__c.File.getDirAssets(),"sort_desc.png",_ll,_ll).getObject()));
 };
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="v = Header.GetView(col)";
_v = __ref._header.GetView(_col);
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="Dim L As Int ' calculate left";
_l = 0;
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="Dim t As Int ' calculate top";
_t = 0;
RDebugUtils.currentLine=4849685;
 //BA.debugLineNum = 4849685;BA.debugLine="L = v.Left + v.Width - ll + 6";
_l = (int) (_v.getLeft()+_v.getWidth()-_ll+6);
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="t = v.Top + v.Height - ll + 6";
_t = (int) (_v.getTop()+_v.getHeight()-_ll+6);
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="Header.AddView(sortingView, L, t, ll, ll)";
__ref._header.AddView((android.view.View)(__ref._sortingview.getObject()),_l,_t,_ll,_ll);
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="End Sub";
return "";
}
public String  _header_longclick(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub Header_LongClick";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="L = Sender";
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="If SubExists(Callback, Event & \"_HeaderLongClick\") Then";
if (__c.SubExists(ba,__ref._callback,__ref._event+"_HeaderLongClick")) { 
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="CallSub2(Callback, Event & \"_HeaderLongClick\", col)";
__c.CallSubNew2(ba,__ref._callback,__ref._event+"_HeaderLongClick",(Object)(_col));
 };
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="End Sub";
return "";
}
public String  _hidecol(b4a.example.table __ref,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub hideCol(col As Int)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths.length];
;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="For i = 0 To SavedWidths.Length-1";
{
final int step793 = 1;
final int limit793 = (int) (__ref._savedwidths.length-1);
for (_i = (int) (0); (step793 > 0 && _i <= limit793) || (step793 < 0 && _i >= limit793); _i = ((int)(0 + _i + step793))) {
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths[_i];
 }
};
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="tmpWidths(col) = 1";
_tmpwidths[_col] = (int) (1);
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths(null,_tmpwidths);
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(b4a.example.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub HideRow (Row As Int)";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="lbls = visibleRows.get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows.Get((Object)(_row)));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step362 = 1;
final int limit362 = (int) (_lbls.length-1);
for (_i = (int) (0); (step362 > 0 && _i <= limit362) || (step362 < 0 && _i >= limit362); _i = ((int)(0 + _i + step362))) {
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="visibleRows.Remove(Row)";
__ref._visiblerows.Remove((Object)(_row));
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="LabelsCache.Add(lbls)";
__ref._labelscache.Add((Object)(_lbls));
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="End Sub";
return "";
}
public boolean  _insertrowat(b4a.example.table __ref,int _row,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.collections.List _l = null;
int _i = 0;
int _keepsel = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As String) As Boolean";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If (Row < 0) Then Row = 0";
if ((_row<0)) { 
_row = (int) (0);};
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="If (Row > Data.Size) Then";
if ((_row>__ref._data.getSize())) { 
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="AddRow(Values)";
__ref._addrow(null,_values);
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.VerticalScrollPosition) ' this strange call will set min/max visible area";
__ref._sv_scrollchanged(null,__ref._sv.getHorizontalScrollPosition(),__ref._sv.getVerticalScrollPosition());
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="L.Initialize";
_l.Initialize();
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="L.Add(Values)";
_l.Add((Object)(_values));
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selection";
{
final int step724 = 1;
final int limit724 = (int) (__ref._selectedrows.getSize()-1);
for (_i = (int) (0); (step724 > 0 && _i <= limit724) || (step724 < 0 && _i >= limit724); _i = ((int)(0 + _i + step724))) {
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="keepSel = SelectedRows.get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows.Get(_i)));
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="If (keepSel >= Row) Then";
if ((_keepsel>=_row)) { 
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number in all rows appear after the soon tobe removed removed row";
__ref._selectedrows.Set(_i,(Object)(_keepsel+1));
 };
 }
};
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step731 = 1;
final int limit731 = __ref._maxvisiblerow;
for (_i = __ref._minvisiblerow; (step731 > 0 && _i <= limit731) || (step731 < 0 && _i >= limit731); _i = ((int)(0 + _i + step731))) {
RDebugUtils.currentLine=2949141;
 //BA.debugLineNum = 2949141;BA.debugLine="HideRow(i)";
__ref._hiderow(null,_i);
 }
};
RDebugUtils.currentLine=2949143;
 //BA.debugLineNum = 2949143;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
__ref._data.AddAllAt(_row,_l);
RDebugUtils.currentLine=2949145;
 //BA.debugLineNum = 2949145;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.VerticalScrollPosition) ' this strange call will set min/max visible area";
__ref._sv_scrollchanged(null,__ref._sv.getHorizontalScrollPosition(),__ref._sv.getVerticalScrollPosition());
RDebugUtils.currentLine=2949147;
 //BA.debugLineNum = 2949147;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step736 = 1;
final int limit736 = __ref._maxvisiblerow;
for (_i = __ref._minvisiblerow; (step736 > 0 && _i <= limit736) || (step736 < 0 && _i >= limit736); _i = ((int)(0 + _i + step736))) {
RDebugUtils.currentLine=2949148;
 //BA.debugLineNum = 2949148;BA.debugLine="ShowRow(i)";
__ref._showrow(null,_i);
 }
};
RDebugUtils.currentLine=2949151;
 //BA.debugLineNum = 2949151;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
__ref._sv.getPanel().setHeight((int) (__ref._data.getSize()*__ref._crowheight));
RDebugUtils.currentLine=2949152;
 //BA.debugLineNum = 2949152;BA.debugLine="updateIPLocation";
__ref._updateiplocation(null);
RDebugUtils.currentLine=2949153;
 //BA.debugLineNum = 2949153;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,Min(SV.VerticalScrollPosition, SV.Panel.Height))";
__ref._sv_scrollchanged(null,__ref._sv.getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv.getVerticalScrollPosition(),__ref._sv.getPanel().getHeight())));
RDebugUtils.currentLine=2949154;
 //BA.debugLineNum = 2949154;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill = True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
if ((__ref._lblstatusline.IsInitialized() && __ref._enablestatuslineautofill==__c.True)) { 
__ref._setstatusline(null,BA.NumberToString(__ref._data.getSize())+" rows");};
RDebugUtils.currentLine=2949155;
 //BA.debugLineNum = 2949155;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=2949156;
 //BA.debugLineNum = 2949156;BA.debugLine="End Sub";
return false;
}
public String  _ip_click(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub IP_Click";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Then";
if (__c.SubExists(ba,__ref._callback,__ref._event+"_HeaderClick")) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", -1)";
__c.CallSubNew2(ba,__ref._callback,__ref._event+"_HeaderClick",(Object)(-1));
 };
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(b4a.example.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return Row < (SV.VerticalScrollPosition + SV.Height) / (cRowHeight + 1) AND _ 		Row > SV.VerticalScrollPosition / cRowHeight";
if (true) return _row<(__ref._sv.getVerticalScrollPosition()+__ref._sv.getHeight())/(double)(__ref._crowheight+1) && _row>__ref._sv.getVerticalScrollPosition()/(double)__ref._crowheight;
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="End Sub";
return false;
}
public String  _jumptorow(b4a.example.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub JumpToRow(Row As Int)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="SV.VerticalScrollPosition = Row * cRowHeight";
__ref._sv.setVerticalScrollPosition((int) (_row*__ref._crowheight));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="SV.VerticalScrollPosition = Row * cRowHeight";
__ref._sv.setVerticalScrollPosition((int) (_row*__ref._crowheight));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="End Sub";
return "";
}
public String  _jumptorowandselect(b4a.example.table __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
b4a.example.table._rowcol _rc = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub JumpToRowAndSelect(Row As Int, Col As Int)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.table._rowcol();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="rc.Row = Row";
_rc.Row = _row;
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="rc.Col = Col";
_rc.Col = _col;
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="SelectRow(rc)";
__ref._selectrow(null,_rc);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="SV.VerticalScrollPosition = Row * cRowHeight";
__ref._sv.setVerticalScrollPosition((int) (_row*__ref._crowheight));
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="SV.VerticalScrollPosition = Row * cRowHeight";
__ref._sv.setVerticalScrollPosition((int) (_row*__ref._crowheight));
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="End Sub";
return "";
}
public String  _loadtablefromcsv(b4a.example.table __ref,String _dir,String _filename,boolean _headersexist) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.objects.collections.List _list1 = null;
String[] _h = null;
anywheresoftware.b4a.objects.collections.List _headers = null;
int _i = 0;
String[] _firstrow = null;
String[] _row = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filename As String, HeadersExist As Boolean)";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="cAutomaticWidths = False";
__ref._cautomaticwidths = __c.False;
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\", headers)";
_list1 = __ref._stringutils1.LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step579 = 1;
final int limit579 = (int) (_headers.getSize()-1);
for (_i = (int) (0); (step579 > 0 && _i <= limit579) || (step579 < 0 && _i >= limit579); _i = ((int)(0 + _i + step579))) {
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="h(i) = headers.get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
_list1 = __ref._stringutils1.LoadCSV(_dir,_filename,BA.ObjectToChar(","));
RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="firstRow = List1.get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="Dim h(firstRow.Length) As String";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step587 = 1;
final int limit587 = (int) (_firstrow.length-1);
for (_i = (int) (0); (step587 > 0 && _i <= limit587) || (step587 < 0 && _i >= limit587); _i = ((int)(0 + _i + step587))) {
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="innerClearAll(h.Length)";
__ref._innerclearall(null,_h.length);
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="Dim ColumnWidths(NumberOfColumns) As Int";
_columnwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="Dim HeaderWidths(NumberOfColumns) As Int";
_headerwidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=2621466;
 //BA.debugLineNum = 2621466;BA.debugLine="Dim DataWidths(NumberOfColumns) As Int";
_datawidths = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step595 = 1;
final int limit595 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step595 > 0 && _i <= limit595) || (step595 < 0 && _i >= limit595); _i = ((int)(0 + _i + step595))) {
RDebugUtils.currentLine=2621468;
 //BA.debugLineNum = 2621468;BA.debugLine="ColumnWidths(i) = SV.Width / NumberOfColumns";
__ref._columnwidths[_i] = (int) (__ref._sv.getWidth()/(double)__ref._numberofcolumns);
RDebugUtils.currentLine=2621469;
 //BA.debugLineNum = 2621469;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths[_i] = __ref._columnwidths[_i];
RDebugUtils.currentLine=2621470;
 //BA.debugLineNum = 2621470;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths[_i] = __ref._columnwidths[_i];
 }
};
RDebugUtils.currentLine=2621472;
 //BA.debugLineNum = 2621472;BA.debugLine="SetHeader(h)";
__ref._setheader(null,_h);
RDebugUtils.currentLine=2621473;
 //BA.debugLineNum = 2621473;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths(null,__ref._columnwidths);
RDebugUtils.currentLine=2621475;
 //BA.debugLineNum = 2621475;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step602 = 1;
final int limit602 = (int) (_list1.getSize()-1);
for (_i = (int) (0); (step602 > 0 && _i <= limit602) || (step602 < 0 && _i >= limit602); _i = ((int)(0 + _i + step602))) {
RDebugUtils.currentLine=2621476;
 //BA.debugLineNum = 2621476;BA.debugLine="Dim Row() As String";
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");
RDebugUtils.currentLine=2621477;
 //BA.debugLineNum = 2621477;BA.debugLine="Row = List1.get(i)";
_row = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=2621478;
 //BA.debugLineNum = 2621478;BA.debugLine="AddRow(Row)";
__ref._addrow(null,_row);
 }
};
RDebugUtils.currentLine=2621480;
 //BA.debugLineNum = 2621480;BA.debugLine="End Sub";
return "";
}
public int  _partition(b4a.example.table __ref,int _left,int _right,int _pivotindex,int _col,boolean _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _storeindex = 0;
String[] _pivotvalues = null;
String _pivotvalue = "";
int _i = 0;
String[] _values = null;
String _s = "";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Partition (left As Int, right As Int, pivotIndex As Int, col As Int, dir As Boolean) As Int";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim storeIndex As Int";
_storeindex = 0;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Dim pivotValues() As String";
_pivotvalues = new String[(int) (0)];
java.util.Arrays.fill(_pivotvalues,"");
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="Dim pivotValue As String";
_pivotvalue = "";
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="pivotValues = Data.get(pivotIndex)";
_pivotvalues = (String[])(__ref._data.Get(_pivotindex));
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="pivotValue = pivotValues(col)";
_pivotvalue = _pivotvalues[_col];
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="SwapList(pivotIndex, right)";
__ref._swaplist(null,_pivotindex,_right);
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="storeIndex = left";
_storeindex = _left;
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="For i = left To right - 1";
{
final int step995 = 1;
final int limit995 = (int) (_right-1);
for (_i = _left; (step995 > 0 && _i <= limit995) || (step995 < 0 && _i >= limit995); _i = ((int)(0 + _i + step995))) {
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="Dim values() As String = Data.get(i)";
_values = (String[])(__ref._data.Get(_i));
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="Dim s As String = values(col)";
_s = _values[_col];
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="If (dir) Then";
if ((_dir)) { 
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="If s.CompareTo(pivotValue) < 0 Then ' dir is < acc, > dec";
if (_s.compareTo(_pivotvalue)<0) { 
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="SwapList(i, storeIndex)";
__ref._swaplist(null,_i,_storeindex);
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="storeIndex = storeIndex + 1";
_storeindex = (int) (_storeindex+1);
 };
 }else {
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="If s.CompareTo(pivotValue) > 0 Then ' dir is < acc, > dec";
if (_s.compareTo(_pivotvalue)>0) { 
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="SwapList(i, storeIndex)";
__ref._swaplist(null,_i,_storeindex);
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="storeIndex = storeIndex + 1";
_storeindex = (int) (_storeindex+1);
 };
 };
 }
};
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="SwapList(storeIndex, right)";
__ref._swaplist(null,_storeindex,_right);
RDebugUtils.currentLine=5373976;
 //BA.debugLineNum = 5373976;BA.debugLine="Return storeIndex";
if (true) return _storeindex;
RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="End Sub";
return 0;
}
public String  _swaplist(b4a.example.table __ref,int _index1,int _index2) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
Object _temp = null;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub SwapList(index1 As Int, index2 As Int)";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim temp As Object";
_temp = new Object();
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="temp = Data.get(index1)";
_temp = __ref._data.Get(_index1);
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="Data.set(index1,Data.get(index2))";
__ref._data.Set(_index1,__ref._data.Get(_index2));
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Data.set(index2,temp)";
__ref._data.Set(_index2,_temp);
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="End Sub";
return "";
}
public String  _quicksort(b4a.example.table __ref,int _left,int _right,int _col,boolean _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _pivotindex = 0;
int _pivotnewindex = 0;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub QuickSort (left As Int, right As Int, col As Int, dir As Boolean)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="debug_counter = debug_counter +1";
__ref._debug_counter = (long) (__ref._debug_counter+1);
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Log (\"counter=\" & debug_counter)";
__c.Log("counter="+BA.NumberToString(__ref._debug_counter));
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="If right > left Then";
if (_right>_left) { 
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Dim pivotIndex, pivotNewIndex As Int";
_pivotindex = 0;
_pivotnewindex = 0;
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="pivotIndex = Rnd(left, right + 1) 'max value is exclusive";
_pivotindex = __c.Rnd(_left,(int) (_right+1));
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="pivotNewIndex = Partition(left, right, pivotIndex, col,dir)";
_pivotnewindex = __ref._partition(null,_left,_right,_pivotindex,_col,_dir);
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="QuickSort(left, pivotNewIndex - 1, col, dir)";
__ref._quicksort(null,_left,(int) (_pivotnewindex-1),_col,_dir);
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="QuickSort(pivotNewIndex + 1, right, col, dir)";
__ref._quicksort(null,(int) (_pivotnewindex+1),_right,_col,_dir);
 };
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="End Sub";
return "";
}
public String  _removerow(b4a.example.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _previndex = 0;
int _i = 0;
int _keepsel = 0;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub RemoveRow(Row As Int)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If (Row <0 OR Row > Data.Size-1) Then Return ' cant remove row outside of the table scope";
if ((_row<0 || _row>__ref._data.getSize()-1)) { 
if (true) return "";};
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,SV.VerticalScrollPosition) ' this strange call will set min/max visible area";
__ref._sv_scrollchanged(null,__ref._sv.getHorizontalScrollPosition(),__ref._sv.getVerticalScrollPosition());
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rmeoved one was selected or not/";
_previndex = __ref._selectedrows.IndexOf((Object)(_row));
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selection";
{
final int step680 = 1;
final int limit680 = (int) (__ref._selectedrows.getSize()-1);
for (_i = (int) (0); (step680 > 0 && _i <= limit680) || (step680 < 0 && _i >= limit680); _i = ((int)(0 + _i + step680))) {
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="keepSel = SelectedRows.get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows.Get(_i)));
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="If (keepSel > Row) Then";
if ((_keepsel>_row)) { 
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number in all rows appear after the soon tobe removed removed row";
__ref._selectedrows.Set(_i,(Object)(_keepsel-1));
 };
 }
};
RDebugUtils.currentLine=2818067;
 //BA.debugLineNum = 2818067;BA.debugLine="If (prevIndex <> -1) Then";
if ((_previndex!=-1)) { 
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the current row from the selected list";
__ref._selectedrows.RemoveAt(_previndex);
 };
RDebugUtils.currentLine=2818072;
 //BA.debugLineNum = 2818072;BA.debugLine="Data.RemoveAt(Row)";
__ref._data.RemoveAt(_row);
RDebugUtils.currentLine=2818073;
 //BA.debugLineNum = 2818073;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all visible rows";
{
final int step691 = 1;
final int limit691 = __ref._maxvisiblerow;
for (_i = __ref._minvisiblerow; (step691 > 0 && _i <= limit691) || (step691 < 0 && _i >= limit691); _i = ((int)(0 + _i + step691))) {
RDebugUtils.currentLine=2818074;
 //BA.debugLineNum = 2818074;BA.debugLine="HideRow(i)";
__ref._hiderow(null,_i);
 }
};
RDebugUtils.currentLine=2818085;
 //BA.debugLineNum = 2818085;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data.getSize()>0) { 
RDebugUtils.currentLine=2818086;
 //BA.debugLineNum = 2818086;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1) ' adjust visible rows";
__ref._maxvisiblerow = (int) (__c.Min(__ref._maxvisiblerow,__ref._data.getSize()-1));
RDebugUtils.currentLine=2818087;
 //BA.debugLineNum = 2818087;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1)";
__ref._minvisiblerow = (int) (__c.Min(__ref._minvisiblerow,__ref._data.getSize()-1));
RDebugUtils.currentLine=2818088;
 //BA.debugLineNum = 2818088;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all visible rows (should select the ones needed to be selected as well)";
{
final int step697 = 1;
final int limit697 = __ref._maxvisiblerow;
for (_i = __ref._minvisiblerow; (step697 > 0 && _i <= limit697) || (step697 < 0 && _i >= limit697); _i = ((int)(0 + _i + step697))) {
RDebugUtils.currentLine=2818090;
 //BA.debugLineNum = 2818090;BA.debugLine="ShowRow(i)";
__ref._showrow(null,_i);
 }
};
 };
RDebugUtils.currentLine=2818094;
 //BA.debugLineNum = 2818094;BA.debugLine="SV.Panel.Height = Data.Size * cRowHeight";
__ref._sv.getPanel().setHeight((int) (__ref._data.getSize()*__ref._crowheight));
RDebugUtils.currentLine=2818095;
 //BA.debugLineNum = 2818095;BA.debugLine="updateIPLocation";
__ref._updateiplocation(null);
RDebugUtils.currentLine=2818097;
 //BA.debugLineNum = 2818097;BA.debugLine="SV_ScrollChanged(SV.HorizontalScrollPosition,Min(SV.VerticalScrollPosition, SV.Panel.Height))";
__ref._sv_scrollchanged(null,__ref._sv.getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv.getVerticalScrollPosition(),__ref._sv.getPanel().getHeight())));
RDebugUtils.currentLine=2818098;
 //BA.debugLineNum = 2818098;BA.debugLine="If (lblStatusLine.IsInitialized AND enableStatusLineAutoFill=True) Then setStatusLine(Data.Size & \" rows\") ' should this be automatic ?";
if ((__ref._lblstatusline.IsInitialized() && __ref._enablestatuslineautofill==__c.True)) { 
__ref._setstatusline(null,BA.NumberToString(__ref._data.getSize())+" rows");};
RDebugUtils.currentLine=2818099;
 //BA.debugLineNum = 2818099;BA.debugLine="End Sub";
return "";
}
public String  _removeview(b4a.example.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub RemoveView";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="pnlTable.RemoveView";
__ref._pnltable.RemoveView();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public String  _savetabletocsv(b4a.example.table __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
String[] _headers = null;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename As String)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="For i = 0 To headers.Length - 1";
{
final int step668 = 1;
final int limit668 = (int) (_headers.length-1);
for (_i = (int) (0); (step668 > 0 && _i <= limit668) || (step668 < 0 && _i >= limit668); _i = ((int)(0 + _i + step668))) {
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="L = Header.GetView(i)";
_l.setObject((android.widget.TextView)(__ref._header.GetView(_i).getObject()));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, headers)";
__ref._stringutils1.SaveCSV2(_dir,_filename,BA.ObjectToChar(","),__ref._data,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="End Sub";
return "";
}
public String  _selectionsort(b4a.example.table __ref,int _col,boolean _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _minindex = 0;
int _i = 0;
int _j = 0;
String[] _values1 = null;
String _s1 = "";
String[] _values2 = null;
String _s2 = "";
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub SelectionSort (col As Int, dir As Boolean)";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim minIndex As Int";
_minindex = 0;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="For i = 0 To Data.Size- 1";
{
final int step926 = 1;
final int limit926 = (int) (__ref._data.getSize()-1);
for (_i = (int) (0); (step926 > 0 && _i <= limit926) || (step926 < 0 && _i >= limit926); _i = ((int)(0 + _i + step926))) {
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="minIndex = i";
_minindex = _i;
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="For j = i + 1 To Data.Size - 1";
{
final int step928 = 1;
final int limit928 = (int) (__ref._data.getSize()-1);
for (_j = (int) (_i+1); (step928 > 0 && _j <= limit928) || (step928 < 0 && _j >= limit928); _j = ((int)(0 + _j + step928))) {
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Dim values1() As String = Data.get(j)";
_values1 = (String[])(__ref._data.Get(_j));
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Dim s1 As String = values1(col)";
_s1 = _values1[_col];
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Dim values2() As String = Data.get(minIndex)";
_values2 = (String[])(__ref._data.Get(_minindex));
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Dim s2 As String = values2(col)";
_s2 = _values2[_col];
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="If (dir) Then";
if ((_dir)) { 
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="If s1.CompareTo(s2) < 0 Then minIndex = j";
if (_s1.compareTo(_s2)<0) { 
_minindex = _j;};
 }else {
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="If s1.CompareTo(s2) > 0 Then minIndex = j";
if (_s1.compareTo(_s2)>0) { 
_minindex = _j;};
 };
 }
};
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="SwapList(i, minIndex)";
__ref._swaplist(null,_i,_minindex);
 }
};
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="End Sub";
return "";
}
public String  _selectionsortnum(b4a.example.table __ref,int _col,boolean _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _minindex = 0;
int _i = 0;
int _j = 0;
String[] _values1 = null;
double _s1 = 0;
String[] _values2 = null;
double _s2 = 0;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub SelectionSortNum (col As Int,dir As Boolean)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim minIndex As Int";
_minindex = 0;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="For i = 0 To Data.Size- 1";
{
final int step951 = 1;
final int limit951 = (int) (__ref._data.getSize()-1);
for (_i = (int) (0); (step951 > 0 && _i <= limit951) || (step951 < 0 && _i >= limit951); _i = ((int)(0 + _i + step951))) {
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="minIndex = i";
_minindex = _i;
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="For j = i + 1 To Data.Size - 1";
{
final int step953 = 1;
final int limit953 = (int) (__ref._data.getSize()-1);
for (_j = (int) (_i+1); (step953 > 0 && _j <= limit953) || (step953 < 0 && _j >= limit953); _j = ((int)(0 + _j + step953))) {
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Dim values1() As String = Data.get(j)";
_values1 = (String[])(__ref._data.Get(_j));
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="Dim s1 As Double = values1(col)";
_s1 = (double)(Double.parseDouble(_values1[_col]));
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Dim values2() As String = Data.get(minIndex)";
_values2 = (String[])(__ref._data.Get(_minindex));
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="Dim s2 As Double = values2(col)";
_s2 = (double)(Double.parseDouble(_values2[_col]));
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="If (dir) Then";
if ((_dir)) { 
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="If s1 < s2 Then minIndex = j";
if (_s1<_s2) { 
_minindex = _j;};
 }else {
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="If s1 > s2 Then minIndex = j";
if (_s1>_s2) { 
_minindex = _j;};
 };
 }
};
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="SwapList(i, minIndex)";
__ref._swaplist(null,_i,_minindex);
 }
};
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignments(b4a.example.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="If Alignments.Length <> NumberOfColumns Then";
if (_alignments.length!=__ref._numberofcolumns) { 
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="ToastMessageShow(\"The number of aligments is not equal to the number of columns.\", False)";
__c.ToastMessageShow("The number of aligments is not equal to the number of columns.",__c.False);
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="Dim cAlignments0(NumberOfColumns) As Int";
_calignments0 = new int[__ref._numberofcolumns];
;
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step1021 = 1;
final int limit1021 = (int) (__ref._numberofcolumns-1);
for (_i = (int) (0); (step1021 > 0 && _i <= limit1021) || (step1021 < 0 && _i >= limit1021); _i = ((int)(0 + _i + step1021))) {
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="cAlignments0 = Alignments";
__ref._calignments0 = _alignments;
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="cAlignments = cAlignments0";
__ref._calignments = __ref._calignments0;
 }
};
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="MultiAlignments = True";
__ref._multialignments = __c.True;
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data.getSize()>0) { 
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="refreshTable";
__ref._refreshtable(null);
 };
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="End Sub";
return "";
}
public String  _setheaderheight(b4a.example.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="cHeaderHeight = Height";
__ref._cheaderheight = _height;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return "";
}
public String  _setheight(b4a.example.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub setHeight(Height As Int)";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="pnlTable.Height = Height";
__ref._pnltable.setHeight(_height);
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="If (showStatusLine = True) Then";
if ((__ref._showstatusline==__c.True)) { 
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="SV.Height = Height - (cRowHeight * 2)";
__ref._sv.setHeight((int) (_height-(__ref._crowheight*2)));
 }else {
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="SV.Height = Height - (cRowHeight)";
__ref._sv.setHeight((int) (_height-(__ref._crowheight)));
 };
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="lblStatusLine.Top = SV.Top + SV.Height";
__ref._lblstatusline.setTop((int) (__ref._sv.getTop()+__ref._sv.getHeight()));
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="updateIPLocation";
__ref._updateiplocation(null);
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="End Sub";
return "";
}
public String  _setleft(b4a.example.table __ref,int _left) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub setLeft(Left As Int)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="pnlTable.Left = Left";
__ref._pnltable.setLeft(_left);
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public String  _setpadding(b4a.example.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _right,int _bottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top As Int, Right As Int, Bottom As Int)";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="r.Target = v";
_r.Target = (Object)(_v.getObject());
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="r.RunMethod4(\"setPadding\", Array As Object(Left, Top, Right, Bottom), Array As String(\"java.lang.int\", \"java.lang.int\", \"java.lang.int\", \"java.lang.int\"))";
_r.RunMethod4("setPadding",new Object[]{(Object)(_left),(Object)(_top),(Object)(_right),(Object)(_bottom)},new String[]{"java.lang.int","java.lang.int","java.lang.int","java.lang.int"});
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor1(b4a.example.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub setRowColor1(Color As Int)";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="cRowColor1 = Color";
__ref._crowcolor1 = _color;
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable.IsInitialized()) { 
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall(null,__ref._numberofcolumns);
 };
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor2(b4a.example.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub setRowColor2(Color As Int)";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="cRowColor2 = Color";
__ref._crowcolor2 = _color;
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable.IsInitialized()) { 
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall(null,__ref._numberofcolumns);
 };
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcellcolor(b4a.example.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="cSelectedCellColor = Color";
__ref._cselectedcellcolor = _color;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable.IsInitialized()) { 
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall(null,__ref._numberofcolumns);
 };
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowcolor(b4a.example.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="cSelectedRowColor = Color";
__ref._cselectedrowcolor = _color;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable.IsInitialized()) { 
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall(null,__ref._numberofcolumns);
 };
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="End Sub";
return "";
}
public String  _setstatuslineautofill(b4a.example.table __ref,boolean _status) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub setStatusLineAutoFill(status As Boolean)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="enableStatusLineAutoFill = status";
__ref._enablestatuslineautofill = _status;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public String  _settop(b4a.example.table __ref,int _top) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub setTop(Top As Int)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="pnlTable.Top = Top";
__ref._pnltable.setTop(_top);
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value As String)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="values = Data.get(Row)";
_values = (String[])(__ref._data.Get(_row));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows.ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="lbls = visibleRows.get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows.Get((Object)(_row)));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText((Object)(_value));
 };
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.example.table __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="pnlTable.Visible = Visible";
__ref._pnltable.setVisible(_visible);
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(b4a.example.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub setWidth(Width As Int)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="pnlTable.Width = Width";
__ref._pnltable.setWidth(_width);
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="SV.Width = Width";
__ref._sv.setWidth(_width);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="internalPanel.Width = Width";
__ref._internalpanel.setWidth(_width);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="updateIPLocation";
__ref._updateiplocation(null);
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="End Sub";
return "";
}
public String  _sorttablenum(b4a.example.table __ref,int _col,boolean _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub sortTableNum(col As Int, dir As Boolean)";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Log (\"sorting table for col:\" & col)";
__c.Log("sorting table for col:"+BA.NumberToString(_col));
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="clearSelection";
__ref._clearselection(null);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="debug_counter = 0";
__ref._debug_counter = (long) (0);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="SelectionSortNum(col, dir)";
__ref._selectionsortnum(null,_col,_dir);
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="refreshTable";
__ref._refreshtable(null);
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="End Sub";
return "";
}
public String  _unhidecol(b4a.example.table __ref,int _col,int _newsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths.length];
;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="For i=0 To SavedWidths.Length-1";
{
final int step801 = 1;
final int limit801 = (int) (__ref._savedwidths.length-1);
for (_i = (int) (0); (step801 > 0 && _i <= limit801) || (step801 < 0 && _i >= limit801); _i = ((int)(0 + _i + step801))) {
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths[_i];
 }
};
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="tmpWidths(col) = newSize";
_tmpwidths[_col] = _newsize;
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths(null,_tmpwidths);
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="End Sub";
return "";
}
public boolean  _updaterow(b4a.example.table __ref,int _row,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
int _i = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As String) As Boolean";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If (Values.Length <> NumberOfColumns OR Row <0 OR Row>Data.Size-1) Then";
if ((_values.length!=__ref._numberofcolumns || _row<0 || _row>__ref._data.getSize()-1)) { 
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="For i=0 To Values.Length-1";
{
final int step750 = 1;
final int limit750 = (int) (_values.length-1);
for (_i = (int) (0); (step750 > 0 && _i <= limit750) || (step750 < 0 && _i >= limit750); _i = ((int)(0 + _i + step750))) {
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="SetValue(i,Row,Values(i))";
__ref._setvalue(null,_i,_row,_values[_i]);
 }
};
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
return false;
}
}