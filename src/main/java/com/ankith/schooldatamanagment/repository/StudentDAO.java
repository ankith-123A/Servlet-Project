package com.ankith.schooldatamanagment.repository;

import java.util.List;

import com.ankith.schooldatamanagment.dto.Student;

public interface StudentDAO 
{
	Student studentLogin(String email,String password);
	
	String saveStudent(Student student);
	
	String updateStudent(Student student);
	
	Student getStudentById(int id);
	
	List<Student> getAllstudent();
	
	Student deleteStudentById(int id);
	
}
