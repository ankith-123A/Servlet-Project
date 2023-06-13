package com.ankith.schooldatamanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankith.schooldatamanagment.Service.AdminServImp;
import com.ankith.schooldatamanagment.dto.Admin;
@WebServlet("/addadmin")
public class SaveAdmin extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String dept = req.getParameter("dept");
		String pass = req.getParameter("password");
		AdminServImp as=new AdminServImp();
		Admin a=new Admin();
		a.setName(name);
		a.setEmail(email);
		a.setDept(dept);
		a.setPassword(pass);
		String sa = as.saveAdmin(a);
		PrintWriter out = resp.getWriter();
		out.println("<button><a href=adminlogin.jsp>Go back to Admin Login Page</a></button>");
		out.println("<button><a href=homePage.jsp>To go back HomePage</a></button>");
		out.println(sa);
	}
}
