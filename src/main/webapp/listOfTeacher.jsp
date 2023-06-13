<%@page import="com.ankith.schooldatamanagment.dto.Teacher"%>
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
<%List<Teacher> l=(List<Teacher>)(request.getAttribute("list")); %>

<%for(Teacher t:l) {%>
<h2><%=t%></h2><br><br>
<%} %>
</body>
</html>