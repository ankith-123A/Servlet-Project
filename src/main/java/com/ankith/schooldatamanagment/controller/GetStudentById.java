package com.ankith.schooldatamanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankith.schooldatamanagment.Service.StudentServImp;
import com.ankith.schooldatamanagment.Service.StudentService;
import com.ankith.schooldatamanagment.dto.Student;
@WebServlet("/getstudent")
public class GetStudentById extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Integer id = Integer.parseInt(req.getParameter("id"));
		StudentService s=new StudentServImp();
		Student student = s.getStudentById(id);
		PrintWriter out = resp.getWriter();
		out.println("<button><a href=studnetlogin.jsp>Go back to Student Login Page</a></button>");
		out.println("<button><a href=homePage.jsp>To go back HomePage</a></button>");
		out.println(student);
	}
}
