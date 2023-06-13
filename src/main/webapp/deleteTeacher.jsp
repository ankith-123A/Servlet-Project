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
	left: 80px;
}
h1{
	position: relative;
	right: 20px;
}
</style>
</head>
<body>
<div>
	<form action="deleteteacher" method="post">
	<h1>Delete Teacher By ID</h1>
	Id=<input type="text" name="id"><br><br>
	<input type="submit"><br><br>
	<button><a href="adminlogin.jsp">Go back to Admin Login Page</a></button><br><br>
	<button><a href="homePage.jsp">To go back HomePage</a></button><br><br>
	</form>
	</div>
</body>
</html>