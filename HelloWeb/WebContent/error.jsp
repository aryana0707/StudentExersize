<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
</head>
<body>
<form action="success" method="post">
<center>
<h1>Sign In</h1>
</center>
<h4 style="color: red;">Username or other information you have <br/>
entered is not correct.</h4>
<table align="center" cellpadding="8" cellspacing="8">
<tr>
<td>UserName</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>Age:</td>
<td><input type="text" name="age"></td>
</tr>
<tr>
<td>Date of birth:</td>
<td><input type="text" name="dob"></td>
</tr>


<tr>

<td><input type="submit" value="submit"></td>
</tr>
</table>
</form>
</body>
</html>