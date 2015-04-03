Type=Class
Version=4
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
'Events declaration
#Event: ValueChanged(Value As Int, UserChanged As Boolean)

Sub Class_Globals
	Private first As Boolean = True
	Private FirstTime As Boolean = True
	Private shadow_flag As Boolean = False
	
	Private cnvs As Canvas
	
	Private minv, maxv, position, S As Double
	
	Private cx,cy  As Int
	Private handcolor,scalecolor1,scalecolor2,slidercolor  As Int
	Private ScaleInterval As Int
	Private Textcolor, Textsize As Int
	
	Private Clabel, hand  As Label
	
	Private CModule As Object
	
	Private Cbase As Panel	
	
	Private basepath, slidepath As Path
	
	Private R As Reflector
	
	Private sh As Shadow
	
	Private Event As String
	
End Sub

'Initializes the object. For Module put Me.
'the object can be defined as custom view in the designer:
'Width and Height should be the same size.
'Textsize and Textcolor will define the label's text size and color.
'Tag should include tow numbers with a separating comma, defining the minimum value and maximum value of the scale.
'Text shall define the interval between two main scale lines.
'Example : Tag is 20,80 and Text is 10 - the scale will start at 20 and will have 6 intervals of 10 till 80.
'The Drawable (color, radius etc) defines the drawable of the background panel.
'The shape of the hand can be modified by changing the file "hand.png" in files directory.
'The pivot of the hand must be in the center of the Bitmap, the height is 10% of the width. 
'The color of the hand should be black, changing is done by the class.
Public Sub Initialize(Module As Object, Eventname As String)
	CModule = Module
	Event = Eventname
End Sub


'If you create the object by code, not by the designer, use this sub after initialization.
'MinValue and MaxValue define the minimum value and maximum value of the scale.
'scale_interval defines the interval between two main scale lines.
'Example : min and max are 20 and 80, and interval is 10 - the scale will start at 20 and will have 6 intervals of 10 till 80.
'To define a Drawable (color, radius etc) use object.asview.background, before setColors
Public Sub CodeCreateView(Width As Int ,Height As Int,MinValue As Int, MaxValue As Int, Scale_interval As Int)
	minv = MinValue
	maxv = MaxValue
	Cbase.Initialize("Cbase")
	S = Min(Width, Height)
	ScaleInterval = Scale_interval
	ContinueCreation
End Sub

'This sub is called by the Designer when the view is defined as custom view.
Private Sub DesignerCreateView(base As Panel, Lbl As Label, Props As Map)'ignore
	S = Min(base.Width, base.Height)
	
	Cbase.Initialize("Cbase")
    base.AddView(Cbase,0,0,base.width,base.Height)
	Cbase.Background = base.Background
	Dim str() As String = Regex.Split("," , Lbl.Tag)
	minv = str(0)
	maxv = str(1)
	ScaleInterval =  Lbl.text
	ContinueCreation
End Sub

Private Sub ContinueCreation
				      	' These are the default colors and text size
	slidepath.Initialize(0,0)
	hand.Initialize("")
	cx = Round(s/2)
	cy = cx

	Cbase.AddView(hand,cx - 0.4*s, cy -0.04*s,0.8*s,0.08*s)

	hand.Gravity = Gravity.fill
	hand.SetBackgroundImage(LoadBitmap(File.DirAssets,"hand.png"))
	setColors(Colors.red, Colors.white,Colors.lightgray, Colors.RGB(50,50,255),Colors.White, 24)
	
	basepath.Initialize(0,S)
	basepath.LineTo(0,0) 
	basepath.LineTo(S,0) 
	basepath.LineTo(S,S) 
	basepath.LineTo(cx,cy)
	basepath.LineTo(0,s)

End Sub

'Adds a shadow to the hand, in the defined color.
'angle is the angle of the light, 0 is at the top.
'margin sets the maximal offset of the shadow from the hand.
Public Sub SetShadow(shadow_color As Int, angle As Float, margin As Float)
shadow_flag = True
sh.Initialize(Cbase, hand, shadow_color, angle, margin, -1)
End Sub

'Controls the colors and text size
'hand_color is the color of the hand, replacing the black color of the hand image in assets.
'scale_color1 is the color of the main scale lines (the longer lines), and the color of the line around the scale.
'scale_color2 is the color of the secondary scale lines (the shorterer lines)
'slider_color is the color of the line from the scale start to the hand position.
'If not used, the default values are:
'setColors(Colors.red, Colors.white,Colors.lightgray, Colors.RGB(50,50,255),Colors.White, 24)
Public Sub setColors(hand_color As Int,scale_color1 As Int,scale_color2 As Int,slider_color As Int, Text_color As Int, Text_size As Int)

	handcolor = hand_color
	scalecolor1 = scale_color1
	scalecolor2 = scale_color2
	slidercolor = slider_color
	Textcolor = Text_color
	Textsize = Text_size
	
	Dim handcanvas As Canvas
	handcanvas.Initialize(hand)
	
	If handcolor <> Colors.Black Then
		Dim clr As Int  ' replace the hand color from black to the required color
		For i = 0 To hand.Width-1
			For j = 0 To hand.Height-1
				clr = handcanvas.Bitmap.GetPixel(i,j)
				If Bit.UnsignedShiftRight(Bit.AND(clr, 0xff000000), 24) > 50 Then
					handcanvas.DrawPoint(i,j,handcolor)
				End If
			Next
		Next
	End If
End Sub

'Returns the panel
Public Sub AsView As View
	Return Cbase
End Sub

Private Sub Cbase_Touch (Action As Int, X As Float, Y As Float) As Boolean
	Dim teta As Float = RtoAngle(X,Y)
	If teta > 0 AND teta < 270 Then DrawPosition(teta, True)
	Return True
End Sub

'Gets or Sets the position of the circle seek.
'Setting the value must be done at least once to display the view.
Public Sub setValue(Value As Double)
	If first Then ' only after the new size of the view is known
		cnvs.Initialize(Cbase)
		R.Target = cnvs
		R.Target = R.GetField("paint")
		R.RunMethod2("setAntiAlias", True, "java.lang.boolean")
		S = Min(Cbase.Width, Cbase.Height)
		cx = S/2
		cy = S/2
			
		Clabel.Initialize("")
		Clabel.Color = Colors.Transparent
		Clabel.Textcolor = Textcolor
		Clabel.Textsize = Textsize
		Clabel.Gravity = Gravity.CENTER
		Cbase.AddView(Clabel,cx-S/4,cy,S/2,S/2)
		first = False
	
	End If
	Value = Min(Max(Value,minv),maxv)
	position = Value
	DrawPosition(Round(Value * 270 / maxv),False)

End Sub

'Gets or Sets the position of the circle seek.
'Setting the value must be done at least once to display the view.
Public Sub getValue As Double
	Return position
End Sub

Private Sub DrawPosition(Angle As Int, userchanged As Boolean)
	If FirstTime Then DrawBase
	position = Angle * (maxv-minv) / 270
	Cbase.Invalidate 
	cnvs.RemoveClip
	Dim k As Int = Round(position+minv)
	position = Round(k-minv)
	Clabel.Text = k
	Angle = 270*position/(maxv-minv) 	
	DrawSlider(Angle)	
	If SubExists(CModule, Event & "_ValueChanged") Then
	  	CallSub3(CModule, Event & "_ValueChanged",k, userchanged )
	End If
End Sub

Private Sub DrawBase
	Dim r0,r1,r2,a,px0,py0,px1,py1, cs,sn  As Float
	FirstTime = False
	r0 = 0.47 * s
	r1 = 0.43 *s
	r2 = 0.38  * s
	
	Dim t As Int = (maxv-minv)/ScaleInterval
	Dim da As Float = 270*ScaleInterval/(maxv-minv)
	For i = 0 To t
		a =  i* da -45
		cs = CosD(a)
		sn = SinD(a)
		px0 = cx - r0*cs
		py0 = cy - r0*sn
		px1 = cx - r2*cs
		py1 = cy - r2*sn
		cnvs.DrawLine(px0,py0,px1,py1,scalecolor1,3dip)
	Next
	For i = 1 To t
		a =  i* da -45 - da/2
		cs = CosD(a)
		sn = SinD(a)
		px0 = cx - r0*cs
		py0 = cy - r0*sn
		px1 = cx - r1*cs
		py1 = cy - r1*sn
		cnvs.DrawLine(px0,py0,px1,py1,scalecolor2,3dip)
	Next
End Sub


Private Sub DrawSlider(angle As Float)
cnvs.ClipPath(basepath)
	cnvs.DrawCircle(cx, cy, S*0.48 , scalecolor1, False, 4dip)
	cnvs.RemoveClip

	
	slidepath.Initialize(0,S)
	If angle > 90 Then slidepath.LineTo(0,0) 
	If angle > 180 Then slidepath.LineTo(S,0) 
	Dim point(2) As Float = PtoR(angle , 2*cx)
	slidepath.LineTo(point(0),point(1))
	slidepath.LineTo(cx,cy)
	cnvs.ClipPath(slidepath)
	cnvs.DrawCircle(cx, cy, S*0.48 , slidercolor,False, 4dip)
	
	setRotation(hand, angle-225)
	If shadow_flag Then sh.setRotation( angle-225)
End Sub

Private Sub PtoR(alfa As Float, Rad As Float) As Float()
	Dim point(2) As Float
	point(0) = cx + Rad * SinD(alfa - 135)
	point(1) = cy - Rad * CosD(alfa - 135) 
	Return point
End Sub

'Returns just the angle.
Private Sub RtoAngle(X As Float, Y As Float) As Float
	Dim teta As Float
	If Y <> 0 Then
		teta = ATan2D((X-cx),(cy-Y)) + 135
	Else
		If (X-cx) > 0 Then teta = 235 Else teta = 45
	End If
	Return teta
End Sub



'Sets the rotation angle of the given view
'v = view
'Angle = rotation angle in degrees
Private Sub setRotation(v As View, Angle As Float)
    Dim jo = v As JavaObject
    jo.RunMethod("setRotation", Array As Object(Angle))
End Sub
