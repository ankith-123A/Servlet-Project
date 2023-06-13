<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body{
background:linear-gradient(60deg,grey,black,grey);
}
	a{
	text-decoration: none;
	text-align: center;
	color: black;
	}
	button{
	padding: 5px 10px 5px 10px;
	position: relative;
	left: 150px;
	border-radius: 5px;
	width: 300px;
	}
	div{
		position: relative;
		left: 420px;
		top: 160px;
		width: 600px;
		border-radius: 10px;
		background:linear-gradient(60deg,lightgreen,lightyellow);
	}
	h1{
	position: relative;
		left: 54px;
	}
	#butt{
	position: relative;
	left: 400px;
	background-color: lightblue;
	border: none;
	width: 200px;
	}
</style>
</head>
<body>
<div>
<h1>This is a Message for Student Menu</h1>
	<button><a href="getStudentById.jsp">Get Student By Id</a></button><br><br>
	<button><a href="getAllstudent.jsp">Get All Student</a></button><br><br>
	<button id=butt><a href="homePage.jsp">To go back HomePage</a></button><br><br>
	</div>
</body>
</html>