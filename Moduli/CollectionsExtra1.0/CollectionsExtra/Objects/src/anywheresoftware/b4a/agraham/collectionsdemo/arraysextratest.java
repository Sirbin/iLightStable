package anywheresoftware.b4a.agraham.collectionsdemo;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arraysextratest {
private static arraysextratest mostCurrent = new arraysextratest();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.agraham.linkedlist.LinkedListEx.ArraysExtra _ax = null;
public static String[] _arrstring = null;
public static int[] _arrint = null;
public static Object[] _arrobj = null;
public anywheresoftware.b4a.agraham.collectionsdemo.main _main = null;
public anywheresoftware.b4a.agraham.collectionsdemo.linkedlisttest _linkedlisttest = null;
  public Object[] GetGlobals() {
		return new Object[] {"ArrInt",_arrint,"ArrObj",_arrobj,"ArrString",_arrstring,"Ax",_ax,"LinkedListTest",Debug.moduleToString(anywheresoftware.b4a.agraham.collectionsdemo.linkedlisttest.class),"Main",Debug.moduleToString(anywheresoftware.b4a.agraham.collectionsdemo.main.class)};
}
public static String  _arraytest(anywheresoftware.b4a.BA _ba) throws Exception{
try {
		Debug.PushSubsStack("ArrayTest (arraysextratest) ","arraysextratest",1,_ba,mostCurrent,13);
int[] _aint1 = null;
int[] _aint2 = null;
String[] _astr1 = null;
String[] _astr2 = null;
;
 BA.debugLineNum = 13;BA.debugLine="Sub ArrayTest";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="ArrInt = Array As Int(1, 8, 51, 5, 13, 36, 9, 45, 16, 23)";
Debug.ShouldStop(16384);
_arrint = new int[]{(int) (1),(int) (8),(int) (51),(int) (5),(int) (13),(int) (36),(int) (9),(int) (45),(int) (16),(int) (23)};
 BA.debugLineNum = 16;BA.debugLine="ArrString = Array As String(1, 8, 51, 5, 13, 36, 9, 45, 16, 23)";
Debug.ShouldStop(32768);
_arrstring = new String[]{BA.NumberToString(1),BA.NumberToString(8),BA.NumberToString(51),BA.NumberToString(5),BA.NumberToString(13),BA.NumberToString(36),BA.NumberToString(9),BA.NumberToString(45),BA.NumberToString(16),BA.NumberToString(23)};
 BA.debugLineNum = 18;BA.debugLine="Ax.SortNumericArray(ArrInt)";
Debug.ShouldStop(131072);
_ax.SortNumericArray((Object)(_arrint));
 BA.debugLineNum = 19;BA.debugLine="ShowArrayI(ArrInt, \"Sort Int\")";
Debug.ShouldStop(262144);
_showarrayi(_ba,_arrint,"Sort Int");
 BA.debugLineNum = 21;BA.debugLine="ShowArrayI(ArrInt, \"Search Int for 45 = \" & Ax.BinarySearch(ArrInt, 45))";
Debug.ShouldStop(1048576);
_showarrayi(_ba,_arrint,"Search Int for 45 = "+BA.NumberToString(_ax.BinarySearch((Object)(_arrint),(Object)(45))));
 BA.debugLineNum = 23;BA.debugLine="Dim AInt1(5) As Int";
Debug.ShouldStop(4194304);
_aint1 = new int[(int) (5)];
;Debug.locals.put("AInt1", _aint1);
 BA.debugLineNum = 24;BA.debugLine="Ax.ArrayCopy(ArrInt, 2, AInt1, 0, 5)";
Debug.ShouldStop(8388608);
_ax.ArrayCopy((Object)(_arrint),(int) (2),(Object)(_aint1),(int) (0),(int) (5));
 BA.debugLineNum = 25;BA.debugLine="ShowArrayI(AInt1, \"Copy Int\")";
Debug.ShouldStop(16777216);
_showarrayi(_ba,_aint1,"Copy Int");
 BA.debugLineNum = 27;BA.debugLine="Dim AInt2() As Int";
Debug.ShouldStop(67108864);
_aint2 = new int[(int) (0)];
;Debug.locals.put("AInt2", _aint2);
 BA.debugLineNum = 28;BA.debugLine="AInt2 = Ax.Clone(ArrInt)";
Debug.ShouldStop(134217728);
_aint2 = (int[])(_ax.Clone((Object)(_arrint)));Debug.locals.put("AInt2", _aint2);
 BA.debugLineNum = 29;BA.debugLine="ShowArrayI(AInt2, \"Clone Int\")";
Debug.ShouldStop(268435456);
_showarrayi(_ba,_aint2,"Clone Int");
 BA.debugLineNum = 31;BA.debugLine="Ax.Fill(ArrInt, 0, ArrInt.Length, 99)";
Debug.ShouldStop(1073741824);
_ax.Fill((Object)(_arrint),(int) (0),_arrint.length,(Object)(99));
 BA.debugLineNum = 32;BA.debugLine="ShowArrayI(ArrInt, \"Fill Int\")";
Debug.ShouldStop(-2147483648);
_showarrayi(_ba,_arrint,"Fill Int");
 BA.debugLineNum = 34;BA.debugLine="Msgbox(Ax.ToString(ArrInt), \"ToString Int\")";
Debug.ShouldStop(2);
anywheresoftware.b4a.keywords.Common.Msgbox(_ax.ToString((Object)(_arrint)),"ToString Int",_ba);
 BA.debugLineNum = 36;BA.debugLine="Ax.SortStringArray(ArrString, Ax.SORTCASEINSENSITIVE)";
Debug.ShouldStop(8);
_ax.SortStringArray((Object)(_arrstring),_ax.SORTCASEINSENSITIVE);
 BA.debugLineNum = 37;BA.debugLine="ShowArrayS(ArrString, \"Sort String\")";
Debug.ShouldStop(16);
_showarrays(_ba,_arrstring,"Sort String");
 BA.debugLineNum = 39;BA.debugLine="ShowArrayS(ArrString, \"Search String for 45 = \" & Ax.BinarySearch(ArrString, \"45\"))";
Debug.ShouldStop(64);
_showarrays(_ba,_arrstring,"Search String for 45 = "+BA.NumberToString(_ax.BinarySearch((Object)(_arrstring),(Object)("45"))));
 BA.debugLineNum = 41;BA.debugLine="Dim AStr1(5) As String";
Debug.ShouldStop(256);
_astr1 = new String[(int) (5)];
java.util.Arrays.fill(_astr1,"");Debug.locals.put("AStr1", _astr1);
 BA.debugLineNum = 42;BA.debugLine="Ax.ArrayCopy(ArrString, 2, AStr1, 0, 5)";
Debug.ShouldStop(512);
_ax.ArrayCopy((Object)(_arrstring),(int) (2),(Object)(_astr1),(int) (0),(int) (5));
 BA.debugLineNum = 43;BA.debugLine="ShowArrayS(AStr1, \"Copy String\")";
Debug.ShouldStop(1024);
_showarrays(_ba,_astr1,"Copy String");
 BA.debugLineNum = 45;BA.debugLine="Dim AStr2() As String";
Debug.ShouldStop(4096);
_astr2 = new String[(int) (0)];
java.util.Arrays.fill(_astr2,"");Debug.locals.put("AStr2", _astr2);
 BA.debugLineNum = 46;BA.debugLine="AStr2 = Ax.Clone(ArrString)";
Debug.ShouldStop(8192);
_astr2 = (String[])(_ax.Clone((Object)(_arrstring)));Debug.locals.put("AStr2", _astr2);
 BA.debugLineNum = 47;BA.debugLine="ShowArrayS(AStr2, \"Clone String\")";
Debug.ShouldStop(16384);
_showarrays(_ba,_astr2,"Clone String");
 BA.debugLineNum = 49;BA.debugLine="Ax.Fill(ArrString, 0, ArrString.Length, \"aa\")";
Debug.ShouldStop(65536);
_ax.Fill((Object)(_arrstring),(int) (0),_arrstring.length,(Object)("aa"));
 BA.debugLineNum = 50;BA.debugLine="ShowArrayS(ArrString, \"Fill String\")";
Debug.ShouldStop(131072);
_showarrays(_ba,_arrstring,"Fill String");
 BA.debugLineNum = 52;BA.debugLine="Msgbox(Ax.ToString(ArrString), \"ToString String\")";
Debug.ShouldStop(524288);
anywheresoftware.b4a.keywords.Common.Msgbox(_ax.ToString((Object)(_arrstring)),"ToString String",_ba);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim Ax As ArraysExtra";
_ax = new anywheresoftware.b4a.agraham.linkedlist.LinkedListEx.ArraysExtra();
 //BA.debugLineNum = 7;BA.debugLine="Dim ArrString() As String";
_arrstring = new String[(int) (0)];
java.util.Arrays.fill(_arrstring,"");
 //BA.debugLineNum = 8;BA.debugLine="Dim ArrInt() As Int";
_arrint = new int[(int) (0)];
;
 //BA.debugLineNum = 9;BA.debugLine="Dim ArrObj() As Object";
_arrobj = new Object[(int) (0)];
{
int d0 = _arrobj.length;
for (int i0 = 0;i0 < d0;i0++) {
_arrobj[i0] = new Object();
}
}
;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public static String  _showarrayi(anywheresoftware.b4a.BA _ba,int[] _arr,String _title) throws Exception{
try {
		Debug.PushSubsStack("ShowArrayI (arraysextratest) ","arraysextratest",1,_ba,mostCurrent,65);
String _msg = "";
int _i = 0;
;
Debug.locals.put("Arr", _arr);
Debug.locals.put("title", _title);
 BA.debugLineNum = 65;BA.debugLine="Sub ShowArrayI(Arr() As Int, title As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Dim msg As String";
Debug.ShouldStop(2);
_msg = "";Debug.locals.put("msg", _msg);
 BA.debugLineNum = 67;BA.debugLine="For i = 0 To Arr.Length - 1";
Debug.ShouldStop(4);
{
final int step43 = 1;
final int limit43 = (int) (_arr.length-1);
for (_i = (int) (0); (step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43); _i = ((int)(0 + _i + step43))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 68;BA.debugLine="msg = msg & Arr(i) & \" \"";
Debug.ShouldStop(8);
_msg = _msg+BA.NumberToString(_arr[_i])+" ";Debug.locals.put("msg", _msg);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 70;BA.debugLine="Msgbox(msg, title)";
Debug.ShouldStop(32);
anywheresoftware.b4a.keywords.Common.Msgbox(_msg,_title,_ba);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
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
public static String  _showarrayo(anywheresoftware.b4a.BA _ba,Object[] _arr,String _title) throws Exception{
try {
		Debug.PushSubsStack("ShowArrayO (arraysextratest) ","arraysextratest",1,_ba,mostCurrent,73);
String _msg = "";
int _i = 0;
;
Debug.locals.put("Arr", _arr);
Debug.locals.put("title", _title);
 BA.debugLineNum = 73;BA.debugLine="Sub ShowArrayO(Arr() As Object, title As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim msg As String";
Debug.ShouldStop(512);
_msg = "";Debug.locals.put("msg", _msg);
 BA.debugLineNum = 75;BA.debugLine="For i = 0 To Arr.Length - 1";
Debug.ShouldStop(1024);
{
final int step50 = 1;
final int limit50 = (int) (_arr.length-1);
for (_i = (int) (0); (step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50); _i = ((int)(0 + _i + step50))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="msg = msg & Arr(i) & \" \"";
Debug.ShouldStop(2048);
_msg = _msg+BA.ObjectToString(_arr[_i])+" ";Debug.locals.put("msg", _msg);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 78;BA.debugLine="Msgbox(msg, title)";
Debug.ShouldStop(8192);
anywheresoftware.b4a.keywords.Common.Msgbox(_msg,_title,_ba);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
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
public static String  _showarrays(anywheresoftware.b4a.BA _ba,String[] _arr,String _title) throws Exception{
try {
		Debug.PushSubsStack("ShowArrayS (arraysextratest) ","arraysextratest",1,_ba,mostCurrent,57);
String _msg = "";
int _i = 0;
;
Debug.locals.put("Arr", _arr);
Debug.locals.put("title", _title);
 BA.debugLineNum = 57;BA.debugLine="Sub ShowArrayS(Arr() As String, title As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim msg As String";
Debug.ShouldStop(33554432);
_msg = "";Debug.locals.put("msg", _msg);
 BA.debugLineNum = 59;BA.debugLine="For i = 0 To Arr.Length - 1";
Debug.ShouldStop(67108864);
{
final int step36 = 1;
final int limit36 = (int) (_arr.length-1);
for (_i = (int) (0); (step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36); _i = ((int)(0 + _i + step36))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="msg = msg & Arr(i) & \" \"";
Debug.ShouldStop(134217728);
_msg = _msg+_arr[_i]+" ";Debug.locals.put("msg", _msg);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="Msgbox(msg, title)";
Debug.ShouldStop(536870912);
anywheresoftware.b4a.keywords.Common.Msgbox(_msg,_title,_ba);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
}
