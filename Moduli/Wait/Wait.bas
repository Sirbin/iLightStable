Type=Class
Version=2.5
@EndOfDesignText@
'Class module
Sub Class_Globals
Private azimuth, scale As Double
Private gif As GifDecoder
Private IV As ImageView
Private AW,AH,SF, Frame,  counter, mycycle, IVHS As Int
Private gifcycle As Int = 0
Private msglbl As Label
Private background, board As Panel
Type sp_par(x As Int, y As Int, az As Double, vx As Double, vy As Double)	
Private s As sp_par
Private mypic As String
End Sub

'Initializes the object. Defines the appearance.
'Pic is the Gif file name, include the file in DirAssets (the IDE files)
Public Sub Initialize(Parent As activity,PanelColor As Int,TextColor As Int, TextSize As Int,Pic As String)
AW = Parent.Width
AH = Parent.Height
scale =  Max(AW,AH)/480 

background.Initialize("bg")
background.Color = Colors.ARGB(90,0,0,0)
Parent.AddView(background, 0,0,100%x,100%y)
background.Visible = False

board.Initialize("")
Dim dr As ColorDrawable
dr.Initialize(PanelColor,15*scale)
board.background = dr
background.AddView(board,AW/2-110dip*scale, AH/2-80dip*scale, 220dip*scale, 160dip*scale)

msglbl.Initialize("")
msglbl.TextSize = TextSize
msglbl.TextColor = TextColor
msglbl.Gravity =  Gravity.CENTER_HORIZONTAL
board.AddView(msglbl,10dip*scale,board.height/2 -20dip*scale,board.width -20dip*scale,40dip*scale)

mypic = Pic

gif.DisposeFrames
If File.Exists(File.DirAssets, mypic) Then
	gif.Load(File.DirAssets, mypic)
Else
	gif.Load(File.DirAssets,"clock1.gif")
End If
Frame = 0

IV.Initialize("")
board.AddView(IV,40dip*scale,40dip*scale,50dip*scale,50dip*scale)
IV.Gravity = Gravity.FILL
IV.Bitmap = gif.Frame(Frame)
IVHS = 25dip*scale  ' = half size

s.x = board.Width/2
s.y = board.Height/2
azimuth = 320 
s.az = azimuth
s.vx =  2 * scale * SinD(azimuth)
s.vy = -2 * scale * CosD(azimuth)
End Sub

'Define the Text of the message and the Cycle - after how many loops the DoEvents will be called.
'Call this before the loop start.
Sub Show( Text As String, Cycle As Int)
msglbl.Text = Text
mycycle = Cycle
background.Visible = True
End Sub

'Change the default movement speed of the Gif which is 3, min is 2.
Sub SetSpeed(Speed As Int)
s.vx =  Speed * scale * SinD(azimuth)
s.vy = -Speed * scale * CosD(azimuth)
End Sub

'Call this somewhere inside the loop, with the loop index.
Sub DoEvent(count As Int)
If count Mod (mycycle) = 0 Then 
	move
	DoEvents
End If
End Sub

Private Sub move
If board.Visible = False Then Return
s.x = s.x + s.vx
s.y = s.y + s.vy 
IV.Left = s.x - IVHS
IV.Top  = s.y - IVHS

If s.x > board.Width - IVHS Then
	s.vx = -s.vx
	s.x = board.Width - IVHS
End If		
If	s.x < IVHS Then
	s.vx = -s.vx
	s.x = IVHS
End If
If s.y > board.height - IVHS Then
	s.vy = -s.vy
	s.y = board.height - IVHS
End If
If	s.y <  IVHS Then 
	s.vy = -s.vy
	s.y = IVHS 
End If 

gifcycle = gifcycle + 1
If gifcycle = 5 Then
	Frame = Frame + 1
	If Frame >= gif.FrameCount Then
		Frame = 0
	End If
	IV.Bitmap = gif.Frame(Frame)
	gifcycle = 0
End If
End Sub

'Call this after the end of the loop.
Sub Hide
background.Visible = False
End Sub

Private Sub bg_click
End Sub

Private Sub bg_longclick
End Sub


