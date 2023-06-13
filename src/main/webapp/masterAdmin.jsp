<%@page import="com.ankith.schooldatamanagment.dto.Admin"%>
<%@page import="com.ankith.schooldatamanagment.repository.AdminDAOimp"%>
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
	left: 20px;
	border-radius: 5px;
	width:160px;
	}
	div{
		position: relative;
		left: 480px;
		top: 160px;
		width: 525px;
		border-radius: 10px;
		background:linear-gradient(60deg,lightgreen,lightyellow);
	}
	#butt{
	position: relative;
	left: 340px;
	background-color: lightblue;
	border: none;
	}
</style>
</head>
<body>
<%Admin admin=(Admin)session.getAttribute("master"); 
if(admin!=null){
	%>
	<div>
	<h1 style="position: relative;left: 28px;">This is Message for master admin</h1>
	<button><a href="addnewAdmin.jsp">Add new Admin</a></button>
	<button><a href="addnewTeacher.jsp">Add new Teacher</a></button>
	<button><a href="addnewStudent.jsp">Add new Student</a></button><br><br>
	
	<button><a href="updateAdmin.jsp">Update Admin</a></button>
	<button><a href="updateTeacher.jsp">Update Teacher</a></button>
	<button><a href="updateStudent.jsp">Update Student</a></button><br><br>
	
	<button><a href="deleteAdmin.jsp">Delete Admin</a></button>
	<button><a href="deleteTeacher.jsp">Delete Teacher</a></button>
	<button><a href="deleteStudent.jsp">Delete Student</a></button><br><br>
	
	<button><a href="getAdminById.jsp">Get Admin By Id</a></button>
	<button><a href="getTeacherById.jsp">Get Teacher By Id</a></button>
	<button><a href="getStudentById.jsp">Get Student By Id</a></button><br><br>
	
	<button><a href="getAllteacher.jsp">Get All Teacher</a></button>
	<button><a href="getAllstudent.jsp">Get All Student</a></button><br><br>
	<button id=butt><a href="homePage.jsp">To go back HomePage</a></button><br><br>
	
	</div>
	
	<%}else{%>
	<h2>Login to access Master admin function</h2>
	<button><a href="adminlogin.jsp">To login as an Admin</a></button><br><br>
	<%} %>
</body>
</html>