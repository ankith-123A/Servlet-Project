package com.ankith.schooldatamanagment.Service;

import java.util.List;

import com.ankith.schooldatamanagment.dto.Teacher;
import com.ankith.schooldatamanagment.repository.TeacherDAOimp;

public class TeacherServImp implements TeacherService
{
	private TeacherDAOimp td;
	{
		td=new TeacherDAOimp();
	}

	@Override
	public Teacher teacherLogin(String name, String password) {
		
		return td.teacherLogin(name, password);
	}

	@Override
	public String saveTeacher(Teacher teacher) {
		
		return td.saveTeacher(teacher);
	}

	@Override
	public String updateTeacher(Teacher teacher) {
		
		return td.updateTeacher(teacher);
	}

	@Override
	public Teacher getTeacherById(int id) {
		
		return td.getTeacherById(id);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		
		return td.getAllTeacher();
	}

	@Override
	public Teacher deleteTeacherById(int id) {
		
		return td.deleteTeacherById(id);
	}

}
