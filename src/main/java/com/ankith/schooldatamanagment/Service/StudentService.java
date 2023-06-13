package com.ankith.schooldatamanagment.Service;

import java.util.List;

import com.ankith.schooldatamanagment.dto.Student;

public interface StudentService 
{
	Student studentLogin(String email,String password);
	
	String saveStudent(Student student);
	
	String updateStudent(Student student);
	
	Student getStudentById(int id);
	
	List<Student> getAllstudent();
	
	Student deleteStudentById(int id);
	
	List<Student> sortedbyName();
	
	List<Student> sortedbyClass();
	
	List<Student> sortedbyThroughtPercentage();
	
	
}
