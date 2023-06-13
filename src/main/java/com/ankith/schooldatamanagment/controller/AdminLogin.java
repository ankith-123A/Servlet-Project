package com.ankith.schooldatamanagment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ankith.schooldatamanagment.dto.Admin;
import com.ankith.schooldatamanagment.repository.AdminDAOimp;
@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		AdminDAOimp ad =new AdminDAOimp();
		Admin adminLogin = ad.adminLogin(name, pass);
		HttpSession session = req.getSession();

		if(adminLogin.getId()!=null)
		{
			
			if(adminLogin.getDept().equalsIgnoreCase("master"))
			{
				session.setAttribute("master", adminLogin);
				req.getRequestDispatcher("masterAdmin.jsp").forward(req, resp);
			}
			else
			{
				session.setAttribute("admin", adminLogin);
				req.getRequestDispatcher("adminMenu.jsp").forward(req, resp);
			}
		}
		else
			req.getRequestDispatcher("invalidAdmin.jsp").forward(req, resp);
	}
}
