package com.ankith.schooldatamanagment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankith.schooldatamanagment.Service.StudentServImp;
import com.ankith.schooldatamanagment.Service.StudentService;
import com.ankith.schooldatamanagment.dto.Student;
@WebServlet("/studentLogin")
public class StudentLogin extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		StudentService ss=new StudentServImp();
		Student studentLogin = ss.studentLogin(name, pass);
		
		if(studentLogin.getId()!=null)
		{
			req.getRequestDispatcher("studentmenu.jsp").forward(req, resp);
		}
		else
		{
			req.getRequestDispatcher("invalidmenu.jsp").forward(req, resp);
		}
	}
}
