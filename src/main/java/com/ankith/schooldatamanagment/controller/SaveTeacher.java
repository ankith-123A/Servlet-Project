package com.ankith.schooldatamanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankith.schooldatamanagment.Service.TeacherServImp;
import com.ankith.schooldatamanagment.dto.Teacher;
@WebServlet("/addteacher")
public class SaveTeacher extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String sub = req.getParameter("subject");
		double salary =(Double.parseDouble(req.getParameter("salary")));
		Date date = Date.valueOf(req.getParameter("date"));
		String classTeacher = req.getParameter("classTeacher");
		String password = req.getParameter("password");
		
		TeacherServImp ts=new TeacherServImp();
		Teacher t=new Teacher();
		t.setName(name);
		t.setEmail(email);
		t.setSubject(sub);
		t.setSal(salary);
		t.setDateOfJoining(date);
		t.setClassTeacher(classTeacher);
		t.setPassword(password);
		String st = ts.saveTeacher(t);
		PrintWriter out = resp.getWriter();
		out.println("<button><a href=teacherlogin.jsp>Go back to Teacher Login Page</a></button>");
		out.println("<button><a href=homePage.jsp>To go back HomePage</a></button>");
		out.println(st);
		
		
	}
}
