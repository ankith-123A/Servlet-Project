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
@WebServlet("/getadmin")
public class GetAdminById extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int parseInt = Integer.parseInt(req.getParameter("id"));
		AdminServImp ad=new AdminServImp();
		Admin adminById = ad.getAdminById(parseInt);
		PrintWriter out = resp.getWriter();
		out.println("<button><a href=adminlogin.jsp>Go back to Admin Login Page</a></button>");
		out.println("<button><a href=homePage.jsp>To go back HomePage</a></button>");
		out.print(adminById);
	}
}
