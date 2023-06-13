<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background:linear-gradient(60deg,grey,black,grey);
}
form{
	position: relative;
	left:200px;
}
	div{
		position: relative;
		left: 440px;
		top: 200px;
		width: fit-content;
		border-radius: 10px;
		background:linear-gradient(60deg,lightgreen,lightyellow);
	}
	button{
	position: relative;
	left: 20px;
	}
	a{
	text-decoration: none;
	}
</style>
<body>
<div>
<h1>Enter valid User name (email) and password</h1>
<form action="teacherlogin" method="post">
User name=<input type="text" name="username"><br><br>
Password=<input type="password" name="password"><br><br>
<input type="submit">
	<button><a href="homePage.jsp">To go back HomePage</a></button><br><br>
</form>
</div>
</body>
</html>