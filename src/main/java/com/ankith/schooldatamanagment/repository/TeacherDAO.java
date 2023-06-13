package com.ankith.schooldatamanagment.repository;

import java.util.List;

import com.ankith.schooldatamanagment.dto.Teacher;

public interface TeacherDAO 
{
	Teacher teacherLogin(String email,String password);
	
	String saveTeacher(Teacher Teacher);
	
	String updateTeacher(Teacher Teacher);
	
	Teacher getTeacherById(int id);
	
	List<Teacher> getAllTeacher();
	
	Teacher deleteTeacherById(int id);
}
