<%@page import="com.ankith.schooldatamanagment.dto.Teacher"%>
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
	left: 100px;
	border-radius: 5px;
	width:300px;
	}
	div{
		position: relative;
		left: 480px;
		top: 160px;
		width:500px;
		border-radius: 10px;
		background:linear-gradient(60deg,lightgreen,lightyellow);
	}
	#butt{
	position: relative;
	left: 200px;
	background-color: lightblue;
	border: none;
	}
</style>
</head>
<body>
<%Teacher teacher=(Teacher)(session.getAttribute("teacher")); %>
<%if(teacher!=null) {%>
	<div>
	<h1 style="position: relative;left: 60px;">Welcome to Teacher Menu</h1>
	<button><a href="addnewStudent.jsp">Add new Student</a></button><br><br>
	<button><a href="updateStudent.jsp">Update Student</a></button><br><br>
	<button><a href="deleteStudent.jsp">Delete Student</a></button><br><br>
	<button><a href="getStudentById.jsp">Get Student By Id</a></button><br><br>
	<button><a href="getAllstudent.jsp">Get All Student</a></button><br><br>
	<button id=butt><a href="homePage.jsp">To go back HomePage</a></button><br><br>
</div>
<%}else{ %>
	<h2>Login to access Teacher function</h2>
	<button><a href="teacherlogin.jsp">To login as an teacher</a></button><br><br>
<%} %>
</body>
</html>