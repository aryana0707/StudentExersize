<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%@include file="hobbies.html" %>
	<br/>
	<h1 style="color: green;">Congratulation!</h1>
		
		<% 
		String s=(String)request.getAttribute("key");
	
		if(s==null){
			%>
			<jsp:forward page="errorR.jsp"></jsp:forward>
			<%
		}
		else
		{
			%>
			
		<hr/>
		<br/>
		<h3 style="color:red;">YOU HAVE SUCCESSFULLY REGISTERED.     </h3>
			<%
		}
		
		%>
	
</body>
</html>