<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="hobbies.html" %>
<form action="pageapp" >
	<h1 style="color: blue;" align="center">Select you Hobbies!</h1>
	<table bgcolor="pink" cellpadding="8" cellspacing="8" align="center">
		<tr>
			<td>Hobbies:</td>
			<td>
				<input type="checkbox" name="hob" value="Cricket">Cricket<br/>
				<input type="checkbox" name="hob" value="Adventure">Adventure<br/>
				<input type="checkbox" name="hob" value="Cooking">Cooking<br/>
				<input type="checkbox" name="hob" value="Swimming">Swimming<br/>
			</td>
		</tr>
		
		<tr>
			<td><input type="submit" value="Submit"></td>
			<td><input type="reset" value="Reset"></td>
		</tr>
	</table>
</form>
</body>
</html>