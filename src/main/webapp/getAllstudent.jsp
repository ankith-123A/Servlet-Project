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
	left:500px;
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
	right: 60px;
}
input{
position: relative;
	left: 60px;
}
</style>
</head>
<body>
<div>
<form action="getallstudent" method="post">
<h1>To get All Student Details</h1>
<input type="submit"><br><br>
</form>
</div>
</body>
</html>