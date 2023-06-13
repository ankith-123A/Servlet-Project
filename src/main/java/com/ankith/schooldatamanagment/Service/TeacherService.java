package com.ankith.schooldatamanagment.Service;

import java.util.List;

import com.ankith.schooldatamanagment.dto.Teacher;

public interface TeacherService 
{
	Teacher teacherLogin(String email,String password);
	
	String saveTeacher(Teacher teacher);
	
	String updateTeacher(Teacher teacher);
	
	Teacher getTeacherById(int id);
	
	List<Teacher> getAllTeacher();
	
	Teacher deleteTeacherById(int id);
}
