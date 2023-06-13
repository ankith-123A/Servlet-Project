package com.ankith.schooldatamanagment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ankith.schooldatamanagment.Service.TeacherServImp;
import com.ankith.schooldatamanagment.Service.TeacherService;
import com.ankith.schooldatamanagment.dto.Teacher;
@WebServlet("/teacherlogin")
public class TeacherLogin extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		TeacherService ts=new TeacherServImp();
		Teacher teacherLogin = ts.teacherLogin(name, pass);
		HttpSession session = req.getSession();
		
		if(teacherLogin.getId()!=null)
		{
			session.setAttribute("teacher",teacherLogin);
			req.getRequestDispatcher("teachermenu.jsp").forward(req, resp);
		}
		else
		{
			req.getRequestDispatcher("invalidteacher.jsp").forward(req, resp);
		}
	}
}
