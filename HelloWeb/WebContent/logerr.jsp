<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script type="text/javascript">
		function validate(){
			var name=document.frm.uname.value;
			var pwd=document.frm.upass.value;
			
			if(name.length==0){
				alert("Please provide username.");
				document.frm.uname.focus();
				return false;
			}
			
			if(pwd.length==0){
				alert("Please provide your password.");
				document.frm.upass.focus();
				return false;
			}
			
		}
	</script>

</head>
<body>
	<%@include file="hobbies.html" %>
	<br/>
	<h1 style="color: white;" align="center">Login Form!</h1>
	<hr>
	<br/>
	<form action="loguser" name="frm" method="post" onsubmit="return validate();">
		<table align="center" bgcolor="pink" cellpadding="8" cellspacing="8" width="60%">
			<tr>
				<td>
					<h4 style="color: red;">Either username or password you have entered is not correct. Please try again.</h4>
				</td>
			</tr>
			
			<tr>
				<td>Username</td>
				<td><input type="text"  name="uname" size="40"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="upass" size="40"></td>
			</tr>
			<tr>
				<td><a href="forget.jsp">I forget my password.</a></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="submit" value="Sign in"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
	
	<br/>
	<br/>
	

</body>
</html>