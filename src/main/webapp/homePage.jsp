<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body
{
background:linear-gradient(60deg,grey,black,grey);
}
div{
	position: relative;
	top:150px;
	left:500px;
	border:2px none black;
	width:460px;
	border-radius: 10px;
	background:linear-gradient(60deg,lightgreen,lightyellow);
}
button{
		text-align: center;
		position:relative;
		left:140px;
		border-radius: 5px;
}
a{
	text-decoration: none;
	padding: 20px 30px 20px 30px;
}
h1{
position: relative;
left: 40px;
}
</style>
</head>
<body>
<div>
<h1>Welcome to NRS Konandur</h1>
	<button style="padding-right: 15px;"><a href="adminlogin.jsp"> To Admin Login</a></button><br><br>
	<button><a href="teacherlogin.jsp"> To Teacher Login</a></button><br><br>
	<button><a href="studentlogin.jsp"> To Student Login</a></button><br><br>
</div>
</body>
</html>