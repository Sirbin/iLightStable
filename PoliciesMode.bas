Type=Activity
Version=4.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public m As Map
	m.Initialize
	Public LstDati As List
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim lbltitle As Label
	Dim lblCreate As Label
	Dim panel1 As Panel 
	Private ListView1 As ListView
	Private Button1 As Button
	Private Button2 As Button
	Private Insert As Button
	Private Delete As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Policies")
	create_layout
End Sub
Sub create_layout
	lbltitle.Initialize("")
	lbltitle.Text = "iLight Policies Mode"
	lbltitle.TextSize = 34
	lbltitle.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
	lbltitle.TextColor = Colors.RGB(227,227,227)
	Activity.AddView(lbltitle,10dip,10dip,100%x,10%y)
	
	lblCreate.Initialize("lblCreate")
	lblCreate.Color = Colors.RGB(227,227,227)
	
	LstDati.Initialize
	LstDati.AddAll(Array As String("home","motel"))
	For x = 0 To LstDati.Size -1 
		Dim num(2) As String
		num(0) = LstDati.Get(0)
	Next 
	Log (LstDati)
	Log (num(0))
	Log (num(1))
	ListView1.AddSingleLine(num(0))
	ListView1.AddSingleLine2("prova2",2)
	ListView1.AddSingleLine2("prova3",3)
	ListView1.AddSingleLine2("+",4)
	ListView1.SingleLineLayout.Label.TextColor = Colors.RGB(227,227,227)
	ListView1.SingleLineLayout.ItemHeight = 80dip
End Sub	
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub CreatePol_Click
	Dim m As Map
	m.Initialize
	m.put("home",False)
	m.Put("Motel",False)
	InputMap(m,"scelta dei dati")
End Sub
Sub Button2_Click
	Msgbox("ciao","ottimo")
End Sub
Sub Button1_Click
	
End Sub
Sub Insert_Click
	Msgbox("ciao","ottimo")
End Sub
Sub Delete_Click(click As Int)
	
End Sub