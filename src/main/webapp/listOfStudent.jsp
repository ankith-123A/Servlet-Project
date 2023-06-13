<%@page import="com.ankith.schooldatamanagment.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Student>l=(List<Student>)(request.getAttribute("list"));%>

<%for(Student s:l){ %>
<h2><%=s%></h2><br><br>
<%} %>

</body>
</html>