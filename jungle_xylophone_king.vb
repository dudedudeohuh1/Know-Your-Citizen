Public Class Form1

Dim CitizenName As String
Dim CitizenAge As Integer
Dim CitizenId As String
Dim CitizenAddress As String
Dim CitizenStatus As String

Private Sub btnSubmit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnSubmit.Click

CitizenName = txtName.Text
CitizenAge = txtAge.Text
CitizenId = txtId.Text
CitizenAddress = txtAddress.Text

If CitizenAge >= 18 Then
CitizenStatus = "Adult"
Else
CitizenStatus = "Minor"
End If

MsgBox("Name: " & CitizenName & vbCrLf & "Age: " & CitizenAge & vbCrLf & "ID Number: " & CitizenId & vbCrLf & "Address: " & CitizenAddress & vbCrLf & "Status: " & CitizenStatus)

End Sub

Private Sub btnClear_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnClear.Click

txtName.Text = ""
txtAge.Text = ""
txtId.Text = ""
txtAddress.Text = ""

End Sub

Private Sub btnExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnExit.Click

Me.Close()

End Sub

End Class