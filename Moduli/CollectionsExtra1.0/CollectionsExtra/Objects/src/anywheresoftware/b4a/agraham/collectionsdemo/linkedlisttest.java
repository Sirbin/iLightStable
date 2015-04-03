package anywheresoftware.b4a.agraham.collectionsdemo;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class linkedlisttest {
private static linkedlisttest mostCurrent = new linkedlisttest();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.agraham.linkedlist.LinkedListEx _ll = null;
public static anywheresoftware.b4a.objects.collections.List _l = null;
public anywheresoftware.b4a.agraham.collectionsdemo.main _main = null;
public anywheresoftware.b4a.agraham.collectionsdemo.arraysextratest _arraysextratest = null;
  public Object[] GetGlobals() {
		return new Object[] {"ArraysExtraTest",Debug.moduleToString(anywheresoftware.b4a.agraham.collectionsdemo.arraysextratest.class),"L",_l,"LL",_ll,"Main",Debug.moduleToString(anywheresoftware.b4a.agraham.collectionsdemo.main.class)};
}
public static String  _linkedlisttest(anywheresoftware.b4a.BA _ba) throws Exception{
try {
		Debug.PushSubsStack("LinkedListTest (linkedlisttest) ","linkedlisttest",2,_ba,mostCurrent,11);
int[] _a = null;
anywheresoftware.b4a.agraham.linkedlist.LinkedListEx _addres = null;
String _n1 = "";
String _n2 = "";
String _msg = "";
;
 BA.debugLineNum = 11;BA.debugLine="Sub LinkedListTest";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="Dim A() As Int";
Debug.ShouldStop(4096);
_a = new int[(int) (0)];
;Debug.locals.put("A", _a);
 BA.debugLineNum = 14;BA.debugLine="A = Array As Int(1, 8, 51, 5, 13, 36, 9)";
Debug.ShouldStop(8192);
_a = new int[]{(int) (1),(int) (8),(int) (51),(int) (5),(int) (13),(int) (36),(int) (9)};Debug.locals.put("A", _a);
 BA.debugLineNum = 15;BA.debugLine="Dim addres As LinkedList";
Debug.ShouldStop(16384);
_addres = new anywheresoftware.b4a.agraham.linkedlist.LinkedListEx();Debug.locals.put("addres", _addres);
 BA.debugLineNum = 24;BA.debugLine="LL.Initialize";
Debug.ShouldStop(8388608);
_ll.Initialize();
 BA.debugLineNum = 25;BA.debugLine="LL.Add(45)";
Debug.ShouldStop(16777216);
_ll.Add((Object)(45));
 BA.debugLineNum = 26;BA.debugLine="LL.Add(16)";
Debug.ShouldStop(33554432);
_ll.Add((Object)(16));
 BA.debugLineNum = 27;BA.debugLine="LL.Add(23)";
Debug.ShouldStop(67108864);
_ll.Add((Object)(23));
 BA.debugLineNum = 29;BA.debugLine="LL.AddAllAt(2, A)";
Debug.ShouldStop(268435456);
_ll.AddAllAt((int) (2),anywheresoftware.b4a.keywords.Common.ArrayToList(_a));
 BA.debugLineNum = 30;BA.debugLine="ShowLL(\"AddAllAt\")";
Debug.ShouldStop(536870912);
_showll(_ba,"AddAllAt");
 BA.debugLineNum = 32;BA.debugLine="LL.SortCaseInsensitive(True)";
Debug.ShouldStop(-2147483648);
_ll.SortCaseInsensitive(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 33;BA.debugLine="ShowLL(\"Sort lexographically\")";
Debug.ShouldStop(1);
_showll(_ba,"Sort lexographically");
 BA.debugLineNum = 35;BA.debugLine="LL.Sort(True)";
Debug.ShouldStop(4);
_ll.Sort(anywheresoftware.b4a.keywords.Common.True);
 BA.debugLineNum = 36;BA.debugLine="ShowLL(\"Sort\")";
Debug.ShouldStop(8);
_showll(_ba,"Sort");
 BA.debugLineNum = 38;BA.debugLine="LL.Reverse";
Debug.ShouldStop(32);
_ll.Reverse();
 BA.debugLineNum = 39;BA.debugLine="ShowLL(\"Reverse\")";
Debug.ShouldStop(64);
_showll(_ba,"Reverse");
 BA.debugLineNum = 41;BA.debugLine="LL.Swap(0, LL.Size -1)";
Debug.ShouldStop(256);
_ll.Swap((int) (0),(int) (_ll.getSize()-1));
 BA.debugLineNum = 42;BA.debugLine="ShowLL(\"Swap\")";
Debug.ShouldStop(512);
_showll(_ba,"Swap");
 BA.debugLineNum = 44;BA.debugLine="LL.InsertAt(5, -1)";
Debug.ShouldStop(2048);
_ll.InsertAt((int) (5),(Object)(-1));
 BA.debugLineNum = 45;BA.debugLine="ShowLL(\"InsertAt 5 -1\")";
Debug.ShouldStop(4096);
_showll(_ba,"InsertAt 5 -1");
 BA.debugLineNum = 47;BA.debugLine="LL.RemoveAt(5)";
Debug.ShouldStop(16384);
_ll.RemoveAt((int) (5));
 BA.debugLineNum = 48;BA.debugLine="ShowLL(\"RemoveAt 5\")";
Debug.ShouldStop(32768);
_showll(_ba,"RemoveAt 5");
 BA.debugLineNum = 50;BA.debugLine="LL.AddFirst(99)";
Debug.ShouldStop(131072);
_ll.AddFirst((Object)(99));
 BA.debugLineNum = 51;BA.debugLine="LL.AddLast(-99)";
Debug.ShouldStop(262144);
_ll.AddLast((Object)(-99));
 BA.debugLineNum = 52;BA.debugLine="ShowLL(\"Push\")";
Debug.ShouldStop(524288);
_showll(_ba,"Push");
 BA.debugLineNum = 54;BA.debugLine="n1 = LL.RemoveFirst";
Debug.ShouldStop(2097152);
_n1 = BA.ObjectToString(_ll.RemoveFirst());Debug.locals.put("n1", _n1);
 BA.debugLineNum = 55;BA.debugLine="n2 = LL.RemoveLast";
Debug.ShouldStop(4194304);
_n2 = BA.ObjectToString(_ll.RemoveLast());Debug.locals.put("n2", _n2);
 BA.debugLineNum = 56;BA.debugLine="ShowLL(\"Pop \" & n1 & \" \" & n2)";
Debug.ShouldStop(8388608);
_showll(_ba,"Pop "+_n1+" "+_n2);
 BA.debugLineNum = 58;BA.debugLine="ShowLL(\"IndexOf 5 is \" & LL.IndexOf(5))";
Debug.ShouldStop(33554432);
_showll(_ba,"IndexOf 5 is "+BA.NumberToString(_ll.IndexOf((Object)(5))));
 BA.debugLineNum = 60;BA.debugLine="LL.Replace(LL.IndexOf(5), 55)";
Debug.ShouldStop(134217728);
_ll.Replace(_ll.IndexOf((Object)(5)),(Object)(55));
 BA.debugLineNum = 61;BA.debugLine="ShowLL(\"Replace 5 with 55\")";
Debug.ShouldStop(268435456);
_showll(_ba,"Replace 5 with 55");
 BA.debugLineNum = 63;BA.debugLine="msg = \"First = \" & LL.First & \" : Last = \" & LL.Last";
Debug.ShouldStop(1073741824);
_msg = "First = "+BA.ObjectToString(_ll.getFirst())+" : Last = "+BA.ObjectToString(_ll.getLast());Debug.locals.put("msg", _msg);
 BA.debugLineNum = 64;BA.debugLine="Msgbox(msg, \"First and Last\")";
Debug.ShouldStop(-2147483648);
anywheresoftware.b4a.keywords.Common.Msgbox(_msg,"First and Last",_ba);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
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
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim LL As LinkedList";
_ll = new anywheresoftware.b4a.agraham.linkedlist.LinkedListEx();
 //BA.debugLineNum = 7;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public static String  _showl(anywheresoftware.b4a.BA _ba,String _title) throws Exception{
try {
		Debug.PushSubsStack("ShowL (linkedlisttest) ","linkedlisttest",2,_ba,mostCurrent,76);
String _msg = "";
int _i = 0;
;
Debug.locals.put("title", _title);
 BA.debugLineNum = 76;BA.debugLine="Sub ShowL(title As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Dim msg As String";
Debug.ShouldStop(4096);
_msg = "";Debug.locals.put("msg", _msg);
 BA.debugLineNum = 78;BA.debugLine="For i = 0 To L.Size - 1";
Debug.ShouldStop(8192);
{
final int step47 = 1;
final int limit47 = (int) (_l.getSize()-1);
for (_i = (int) (0); (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="msg = msg & L.Get(i) & \" \"";
Debug.ShouldStop(16384);
_msg = _msg+BA.ObjectToString(_l.Get(_i))+" ";Debug.locals.put("msg", _msg);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 81;BA.debugLine="Msgbox(msg, title)";
Debug.ShouldStop(65536);
anywheresoftware.b4a.keywords.Common.Msgbox(_msg,_title,_ba);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
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
public static String  _showll(anywheresoftware.b4a.BA _ba,String _title) throws Exception{
try {
		Debug.PushSubsStack("ShowLL (linkedlisttest) ","linkedlisttest",2,_ba,mostCurrent,68);
String _msg = "";
int _i = 0;
;
Debug.locals.put("title", _title);
 BA.debugLineNum = 68;BA.debugLine="Sub ShowLL(title As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Dim msg As String";
Debug.ShouldStop(16);
_msg = "";Debug.locals.put("msg", _msg);
 BA.debugLineNum = 70;BA.debugLine="For i = 0 To LL.Size - 1";
Debug.ShouldStop(32);
{
final int step40 = 1;
final int limit40 = (int) (_ll.getSize()-1);
for (_i = (int) (0); (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 71;BA.debugLine="msg = msg & LL.Get(i) & \" \"";
Debug.ShouldStop(64);
_msg = _msg+BA.ObjectToString(_ll.Get(_i))+" ";Debug.locals.put("msg", _msg);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 73;BA.debugLine="Msgbox(msg, title)";
Debug.ShouldStop(256);
anywheresoftware.b4a.keywords.Common.Msgbox(_msg,_title,_ba);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
}
