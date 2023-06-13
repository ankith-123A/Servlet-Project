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
a{
	text-decoration: none;
}
div{
	position: relative;
	top:150px;
	left:560px;
	border:2px none black;
	width:400px;
	border-radius: 10px;
	background:linear-gradient(60deg,lightgreen,lightyellow);
}
form{
	position: relative;
	left: 60px;
}
</style>
</head>
<body>
<div>
	<form action="addadmin" method="post">
	<h1>To Add new Admin</h1>
	Name=<input type="text" name="name"><br><br>
	Email=<input type="email" name="email"><br><br>
	Dept=<input type="text" name="dept"><br><br>
	Password=<input type="password" name="password"><br><br>
	<input type="submit">
	<button><a href="adminlogin.jsp">Go back to Admin Login Page</a></button><br><br>
	<button style="position: relative;left: 40px;"><a href="homePage.jsp">To go back HomePage</a></button><br><br>
	</form>
</div>
</body>
</html>