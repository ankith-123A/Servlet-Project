package com.ankith.schooldatamanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankith.schooldatamanagment.Service.StudentServImp;
import com.ankith.schooldatamanagment.dto.Student;
@WebServlet("/updatestudent")
public class UpdateStudent extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Integer std = Integer.parseInt(req.getParameter("std"));
		String sec = req.getParameter("sec");
		Date date = Date.valueOf(req.getParameter("dob"));
		String percentage = req.getParameter("per");
		String pass = req.getParameter("password");
		
		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setStd(std);
		s.setSec(sec);
		s.setDob(date);
		s.setThroughtPercentage(percentage);
		s.setPassword(pass);
		StudentServImp ss=new StudentServImp();
		String updateStudent = ss.updateStudent(s);
		PrintWriter out=resp.getWriter();
		out.println("<button><a href=studentlogin.jsp>Go back to Student Login Page</a></button>");
		out.println("<button><a href=homePage.jsp>To go back HomePage</a></button>");
		out.println(updateStudent);
	}
}
