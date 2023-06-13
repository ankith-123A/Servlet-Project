package com.ankith.schooldatamanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankith.schooldatamanagment.Service.TeacherServImp;
import com.ankith.schooldatamanagment.Service.TeacherService;
import com.ankith.schooldatamanagment.dto.Teacher;
@WebServlet("/getteacher")
public class GetTeacherById extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		TeacherService td=new TeacherServImp();
		Teacher teacherById = td.getTeacherById(id);
		PrintWriter out = resp.getWriter();
		out.println("<button><a href=teacherlogin.jsp>Go back to Teacher Login Page</a></button>");
		out.println("<button><a href=homePage.jsp>To go back HomePage</a></button>");
		out.println(teacherById);
		
	}
}
