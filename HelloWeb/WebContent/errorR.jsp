<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script type="text/javascript">

	<!--var <var-name> -->
	
	function validate(){
		
		var name=document.fr1.fname.value;
		var pass1=document.fr1.upass.value;
		var pass2=document.fr1.cpass.value;
		var g=document.fr1.gen[0].checked;
		
		
	if(name.length==0){
		alert("Please provide your first name.");
		document.fr1.fname.focus();
		return false;
	}
	
	if(pass1.length < 8){
		alert("Your password should be 8 character long.");
		return false;
	}
	
	if(pass2!=pass1){
		alert("Your password is not matching." );
		return false;
	}
	
	if(g==false){
		alert("Please select your gender.");
		return false;
		
	}
	}
</script>

</head>
<body>
<%@include file="hobbies.html" %>
<br/>
<center><h1 style="color: white;">User Registration Form!</center>
<form action="reg" name="fr1" onsubmit="return validate();" method="post">
	<table align="center" bgcolor="pink" cellpadding="8" cellspacing="8">
	<tr>
		<td>
			<h4 style="color: red;">You are not registered. Please try again.</h4>
		</td>
	</tr>
		<tr>
			<td>Full Name<font color="red"><sup>*</sup></font></td>
			<td><input type="text" name="fname"></td>
			<td>Email Address</td>
			<td><input type="text" name="emailid"></td>
		</tr>
		<tr>
			<td>Username</td>
			<td><input type="text" name="uname"></td>
			<td>ZIP</td>
			<td><input type="text" name="zip"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="upass"></td>
			<td>Confirm Password</td>
			<td><input type="password" name="cpass"></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><textarea rows="5" cols="25" name="addr"></textarea></td>
			<td>Date of Birth</td>
			<td><input type="text" name="dob"></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="radio" name="gen" value="Male">Male<br/>
			<input type="radio" name="gen" value="Female">Female<br/>
			<input type="radio" name="gen" value="Others">Others<br/>
			</td>
			<td>Mobile</td>
			<td><input type="text" name="mob"></td>
		</tr>
		<tr>
			<td>Country</td>
			<td><input type="text" name="country"></td>
			<td>State</td>
			<td><input type="text" name="state"></td>
		</tr>
		<tr>
			<td>Security Question</td>
			<td><select name="ques">
				<option>What is your father name?</option>
				<option>What is your car number?</option>
				<option>Who is your best friend?</option>
				<option>What was your roll number in school?</option>
				
			</select></td>
			<td>Answer</td>
			<td><input type="text" name="ans"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Sign up"></td>
			<td><input type="reset" value="Reset"></td>
			<td></td>
		</tr>
	</table>
</form>
<br/>
<br/>

</body>
</html>