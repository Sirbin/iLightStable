Type=Class
Version=4
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
Private p As Panel
Private Myparent As Panel
Private vi As View
Dim l,t,w,h, dx,dy , Mymargin, Myangle, Mycolor As Int
End Sub

'Initializes the object. 
'Parent is the activity or panel which is the parent of the view.
'Color is the shadow color.
'angle is the direction of the coming light, in degrees, 0 is on top.
'margin - the width of the shadow which is seen behind the view.
'radius - the radius of the corners, 0 if no radius. If you use a bitmap with transparent parts, pass -1 to get the shaped shadow.
Public Sub Initialize(Parent As Panel, V As View, color As Int, angle As Float, margin As Float, radius As Float)
p.Initialize("p")
Myparent = Parent
Mymargin = margin
Myangle = angle
Mycolor = color
vi = V
l = V.Left
t = V.Top
w = V.Width
h = V.Height

Select True
	Case V Is RadioButton ' radiobutton is a button but with normal size

	Case V Is Button ' button has special size
		w = w - 8dip 
		l = l + 4dip 
		h = h - 12dip 
		t = t + 6dip 
End Select

If radius >= 0 Then
	Dim pdr As ColorDrawable
	pdr.Initialize(color,radius)
	p.Background = pdr
Else
	SetBitmap
End If

SetAngle(angle)

End Sub

'Color is the shadow color.
'radius - the radius of the corners, 0 if no radius. If you use a bitmap with transparent parts, pass -1 to get the shaped shadow.
Public Sub SetColor(color As Int, radius As Float)
'If radius > 0 Then
'	Dim pdr As ColorDrawable
'	pdr.Initialize(color,radius)
'	p.Background = pdr
'Else
'	p.color = color
'End If
Mycolor = color
If radius >= 0 Then
	Dim pdr As ColorDrawable
	pdr.Initialize(Mycolor,radius)
	p.Background = pdr
Else
	SetBitmap
End If
End Sub

'margin - the width of the shadow which is seen behind the view.
Public Sub SetMargin(margin As Float)
Mymargin = margin
SetAngle(Myangle)
End Sub

'angle is the direction of the coming light, in degrees, 0 is on top.
Public Sub SetAngle(angle As Float)
Myangle = angle
p.RemoveView
angle = (angle + 360) Mod 360
dx = Abs(Mymargin * SinD(angle))
dy = Abs(Mymargin * CosD(angle))
Select True
	Case angle = 0
		Myparent.AddView(p,l ,t+dy,w ,h)
		
	Case angle > 0 AND angle < 90
		Myparent.AddView(p,l - dx,t+dy,w ,h)
		
	Case angle = 90
		Myparent.AddView(p,l - dx,t,w ,h)
		
	Case angle > 90 AND angle < 180
		Myparent.AddView(p,l - dx,t-dy,w ,h)
		
	Case angle = 180
		Myparent.AddView(p,l ,t-dy,w,h)
		
	Case angle > 180 AND angle < 270
		Myparent.AddView(p,l+dx ,t-dy,w,h)
		
	Case angle = 270
		Myparent.AddView(p,l+dx ,t,w,h)
		
	Case angle > 270 AND angle < 360
		Myparent.AddView(p,l+dx ,t+dy,w ,h)
		
End Select
vi.BringToFront
End Sub

Private Sub SetBitmap
Dim vcn,pcn As Canvas
Dim clr As Int
Dim ow,oh As Int
vcn.Initialize(vi)
Dim bmp As Bitmap

ow = w
oh = h
Select True
	Case vi Is RadioButton ' radiobutton is a button but with normal size
	Case vi Is Button ' button has special size
		ow = w+8dip
		oh = h+12dip
End Select
bmp.InitializeMutable(ow,oh)
pcn.Initialize2(bmp)
pcn.DrawColor(Mycolor)
For i = 0 To ow-1
	For j = 0 To oh-1
		clr = vcn.Bitmap.GetPixel(i,j)
		If Bit.UnsignedShiftRight(Bit.AND(clr, 0xff000000), 24) < 50 Then
			pcn.DrawPoint(i,j,Colors.Transparent)
		End If
	Next
Next
p.SetBackgroundImage(bmp)
End Sub

'Rotate the view and shadow in the defined angle, in degrees
Public Sub SetRotation( Angle As Float)
	Dim jo = p As JavaObject
	jo.RunMethod("setRotation", Array As Object(Angle))
	jo = vi 
	jo.RunMethod("setRotation", Array As Object(Angle))
End Sub









