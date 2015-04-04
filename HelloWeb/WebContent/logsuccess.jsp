<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.html" %>
	<br/>
	<h1 style="color: white;">Congratulation    <%=session.getAttribute("u") %>      </h1>
	<hr/>
	<br/>
	<h3 style="color: red;">This is First Page After get Logged in.</h3>
	<br/>
	<br/>
	
</body>
</html>