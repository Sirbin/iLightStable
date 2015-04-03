package derez.libs.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_bar{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="hbar.left = hbar.left * 2"[bar/General script]
views.get("hbar").vw.setLeft((int)((views.get("hbar").vw.getLeft())*2d));
//BA.debugLineNum = 3;BA.debugLine="hbar.top = hbar.top * 2"[bar/General script]
views.get("hbar").vw.setTop((int)((views.get("hbar").vw.getTop())*2d));
//BA.debugLineNum = 4;BA.debugLine="hbar.width = hbar.width * 2"[bar/General script]
views.get("hbar").vw.setWidth((int)((views.get("hbar").vw.getWidth())*2d));
//BA.debugLineNum = 5;BA.debugLine="hbar.height = hbar.height * 2"[bar/General script]
views.get("hbar").vw.setHeight((int)((views.get("hbar").vw.getHeight())*2d));

}
}