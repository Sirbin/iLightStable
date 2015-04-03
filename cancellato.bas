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

End Sub

Sub Globals
	'If usb1.UsbPresent(1) = usb1.USB_NONE Then	' Ver_2.4
	'	Log( "Msgbox - no device")
	'	Else 
	'	Log("usb 1 present")
	'	Log (usb1.UsbPresent(1))
	'	If (usb1.HasPermission(1)) Then	' Ver_2.4
	'		Dim e As String
	'		Try
	'			e=(usb1.DeviceInfo(1))
	'		Catch
	'			e="error usb1"
	'		End Try
	'		If e.Contains("Product : FT2") Then
	'			Log(e)
	'			Dim dev As Int
	'			dev = usb1.Open(57600, 1)		' Ver_2.4
	'			If dev <> usb1.USB_NONE Then
	'				Log("Connected successfully! 1")
	'				astreams1.Initialize(usb1.GetInputStream, usb1.GetOutputStream, "astreams1")
	'				Return
	'			Else
	'				Log("Error opening USB port 1")
	'			End If
	'		End If
	'	Else
	'		usb1.RequestPermission(1)  ' Ver_2.4
	'		Log("usb 1 permission request !!!")
	'		
	'	End If
	'End If	
	
	'If usb1.UsbPresent(2)= usb1.USB_NONE Then	' Ver_2.4
	'	Log("Msgbox - no device")
	'Else 
	 '	Log("usb 2 present")
	'	Log (usb1.UsbPresent(2))
	'	If (usb1.HasPermission(2)) Then	' Ver_2.4
	'		Dim e As String
	'		Try
	'			e=(usb1.DeviceInfo(2))
	'		Catch
	'			e="error usb2"
	'		End Try
	'		If e.Contains("Product : FT2") Then
	'			Log(e)
	'			Dim dev As Int
	'			dev = usb1.Open(57600, 2)		' Ver_2.4
	'			If dev <> usb1.USB_NONE Then
	'				Log("Connected successfully! 1")
	'				astreams1.Initialize(usb1.GetInputStream, usb1.GetOutputStream, "astreams1")
	'			Else
	'				Log("Error opening USB port 2")
	'			End If
	'		End If
	'	Else
	'		usb1.RequestPermission(2)  ' Ver_2.4
	'		Log("usb 1 permission request !!!")
	'	End If
	'End If	
	'Sub BTConnectToDevice 
'	Dim PairedDevices As Map 
'
'	PairedDevices = serial1.GetPairedDevices
'	Try 
		'serial1.Connect3(PairedDevices.Get(MyDeviceName),1)
		'serial1.ConnectInsecure(admin,PairedDevices.Get(MyDeviceName),1)
'		serial1.Listen
'		serial1.Connect(PairedDevices.Get(MyDeviceName))
'		Log (MyDeviceName)
		
		'Log (boolean as String (serial1.Listen))
		'If success = True Then 
		'Log ("connect to " & MyDeviceName)
		'End If  
'	Catch
'		ToastMessageShow("Device not available",True)
'	End Try
'End Sub

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'Sub myACET1_TextChanged (Old As String, New As String)
'	something1 = myACET1.Text
'	Log ("the value is " & something1)
'	Log (" the value is arr(0)" & arr(0))
'End Sub
'Sub myACET2_TextChanged (Old As String, New As String)
'	something2 = myACET2.Text
'	Log ("the value is " & something2)
'	Log ("the value is arr(1) " & arr(1))
'End Sub
'Sub myACET3_TextChanged (Old As String, New As String)
'	arr(2) = myACET3.Text
'End Sub
'Sub myACET4_TextChanged (Old As String, New As String)
'	arr(3) = myACET4.Text
'End Sub
'Sub GoNext1_Click
'	Activity.LoadLayout("SensorWizard.bal")
'	Log("I am GoNext1_Click")
'	SetName.AddSingleLine(something1)
'	SetName.AddSingleLine(something2)
'	SetName.AddSingleLine(something3)
'	SetName.AddSingleLine(something4)
'    SetName.SingleLineLayout.Label.TextSize = 50
'	SetName.SingleLineLayout.ItemHeight = 100dip
'	SetName.SingleLineLayout.Label.Gravity = Gravity.CENTER_HORIZONTAL
'	ListView1.Initialize("Listview1")
'	For i = 1 To 901
'	i=i+100-1
'	
'	 ListView1.AddSingleLine(i & ("Lumen"))
'	 ListView1.SingleLineLayout.Label.TextSize = 50
'	 ListView1.SingleLineLayout.ItemHeight = 100dip
'	 ListView1.SingleLineLayout.Label.Gravity = Gravity.CENTER_HORIZONTAL
'	Next 
'	Activity.AddView(ListView1,180,320,21%x,38%y)
'	
'	ListView2.Initialize("Listview2")
'	For i = 10 To 20
'	
'	  ListView2.AddSingleLine(i & ("W"))
'	 ListView2.SingleLineLayout.Label.TextSize = 50
'	 ListView2.SingleLineLayout.ItemHeight = 100dip
'	 ListView2.SingleLineLayout.Label.Gravity = Gravity.CENTER_HORIZONTAL
'	Next 
'	Activity.AddView(ListView2,455,320,11.5%x,38%y)
'	
'	ListView3.Initialize("Listview3")
'	For i = 1 To 91
'	 i=i+10-1
'	 ListView3.AddSingleLine(i & ("%"))
'	 ListView3.SingleLineLayout.Label.TextSize = 50
'	 ListView3.SingleLineLayout.ItemHeight = 100dip
'	 ListView3.SingleLineLayout.Label.Gravity = Gravity.CENTER_HORIZONTAL
'	Next 
'	Activity.AddView(ListView3,610,320,11.5%x,38%y)
'	
'	ListView4.Initialize("Listview4")
'	For i = 1 To 100
'	 
'	  ListView4.AddSingleLine(i & ("C"))
'	 ListView4.SingleLineLayout.Label.TextSize = 50
'	 ListView4.SingleLineLayout.ItemHeight = 100dip
'	 ListView4.SingleLineLayout.Label.Gravity = Gravity.CENTER_HORIZONTAL
'	Next 
'	Activity.AddView(ListView4,765,320,11.5%x,38%y)
'
'    ListView5.AddSingleLine("Yes")
'	ListView5.AddSingleLine("No")
'    ListView5.SingleLineLayout.Label.TextSize = 50
'	ListView5.SingleLineLayout.ItemHeight = 100dip
'	ListView5.SingleLineLayout.Label.Gravity = Gravity.CENTER_HORIZONTAL
'	
'	ListView6.Initialize("Listview6")
'	For i = 1 To 901
'	 i=i+100-1
'	  ListView6.AddSingleLine(i & ("ppm"))
'	 ListView6.SingleLineLayout.Label.TextSize = 50
'	 ListView6.SingleLineLayout.ItemHeight = 100dip
'	 ListView6.SingleLineLayout.Label.Gravity = Gravity.CENTER_HORIZONTAL
'	Next 
'	Activity.AddView(ListView6,1060,320,15%x,38%y)
'
'End Sub		 
'Sub SetName_ItemClick (Position As Int, value As Object)
'	val1 = value
'	show_label1
'End Sub
'Sub ListView1_ItemClick (Position As Int, value As Object) 
'	val2 = value
'	show_label1
'End Sub
'Sub ListView6_ItemClick (Position As Int, value As Object)
'	val7 = value
'	show_label1
'End Sub
'Sub ListView5_ItemClick (Position As Int, value As Object)
'	val6 = value
'	show_label1
'End Sub
'Sub ListView4_ItemClick (Position As Int, value As Object)
'	val5 = value
'	show_label1
'End Sub
'Sub ListView3_ItemClick (Position As Int, value As Object)
'	val4 = value
'	show_label1
'End Sub
'Sub ListView2_ItemClick (Position As Int, value As Object)
'	val3 = value
'	show_label1
'End Sub
'Sub show_label1
'    Label1.Text = val1 & " " & val2 & " " & val3 & " " & val4 & " " & val5 & " " & val6 & " " & val7
'End Sub