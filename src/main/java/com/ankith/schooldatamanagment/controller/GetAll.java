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
@WebServlet("/getall")
public class GetAll extends HttpServlet 
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	HttpSession session = req.getSession();
	TeacherService ts=new TeacherServImp();
	req.setAttribute("list", ts.getAllTeacher());
	req.getRequestDispatcher("listOfTeacher.jsp").forward(req, resp);
}
}
