package com.ankith.schooldatamanagment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankith.schooldatamanagment.Service.StudentServImp;
import com.ankith.schooldatamanagment.Service.StudentService;
@WebServlet("/getallstudent")
public class GetAllStudent extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		StudentService ss=new StudentServImp();
		req.setAttribute("list", ss.getAllstudent());
		req.getRequestDispatcher("listOfStudent.jsp").forward(req, resp);
	}

}
