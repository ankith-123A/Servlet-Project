package com.ankith.schooldatamanagment.util;

public interface AppConstants 
{
	String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	String URL="jdbc:mysql://localhost:3306/datamanagment";
	String USER_NAME="root";
	String USER_PASSWORD="root";
	
	String ADMIN_LOGIN="SELECT * FROM admin WHERE name=? AND password=?";
	String SAVE_ADMIN="Insert into admin(name,email,dept,password) values(?,?,?,?)";
	String UPDATE_ADMIN="UPDATE admin set name=?,email=?,dept=?,password=? where id=?";
	String GET_ADMINBYID="SELECT * FROM admin WHERE id=?";
	String GET_ALLADMIN="SELECT * FROM admin";
	String DELETE_ADMINBYID="DELETE FROM admin WHERE id=?";
	
	String STUDENT_LOGIN="SELECT * FROM student WHERE name=? AND password=?";
	String SAVE_STUDENT="Insert into student(name,email,std,sec,dob,percentage,password) values(?,?,?,?,?,?,?)";
	String UPDATE_STUDENT="UPDATE student set name=?,email=?,std=?,sec=?,dob=?,percentage=?,password=? where id=?";
	String GET_STUDENTBYID="SELECT * FROM student WHERE id=?";
	String GET_ALLSTUDENT="SELECT * FROM student";
	String DELETE_STUDENTBYID="DELETE FROM student WHERE id=?";
	
	String TEACHER_LOGIN="SELECT * FROM teacher WHERE name=? AND password=?";
	String SAVE_TEACHER="Insert into teacher(name,email,subject,sal,dateofjoining,classteacher,password) values(?,?,?,?,?,?,?)";
	String UPDATE_TEACHER="UPDATE teacher set name=?,email=?,subject=?,sal=?,dateofjoining=?,classteacher=?,password=? where id=?";
	String GET_TEACHERBYID="SELECT * FROM teacher WHERE id=?";
	String GET_ALLTEACHER="SELECT * FROM teacher";
	String DELETE_TEACHERBYID="DELETE FROM teacher WHERE id=?";
}
