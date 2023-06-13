package com.ankith.schooldatamanagment.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ankith.schooldatamanagment.dto.Student;
import com.ankith.schooldatamanagment.repository.StudentDAOimp;

public class StudentServImp implements StudentService
{
	private StudentDAOimp s;
	{
		 s=new StudentDAOimp();
	}
	
	@Override
	public Student studentLogin(String name, String password) 
	{
		Student studentLogin = s.studentLogin(name, password);
		return studentLogin;
	}

	@Override
	public String saveStudent(Student student) 
	{
		String saveStudent = s.saveStudent(student);
		return saveStudent;
	}

	@Override
	public String updateStudent(Student student) 
	{
		return s.updateStudent(student);
	}

	@Override
	public Student getStudentById(int id) 
	{
		return s.getStudentById(id);
	}

	@Override
	public List<Student> getAllstudent()
	{
		return s.getAllstudent();
	}

	@Override
	public Student deleteStudentById(int id) 
	{
		return s.deleteStudentById(id);
	}

	@Override
	public List<Student> sortedbyName()
	{
		List<Student> allstudent = s.getAllstudent();
		
		Comparator<Student> com=new Comparator<Student>() 
		{
			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		Collections.sort(allstudent, com);
		return allstudent;
	}

	@Override
	public List<Student> sortedbyClass() 
	{
		List<Student> allstudent = s.getAllstudent();
		
		Comparator<Student> com=new Comparator<Student>() 
		{
			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getStd()-o2.getStd();
			}
			
		};
		Collections.sort(allstudent, com);
		return allstudent;
	}

	@Override
	public List<Student> sortedbyThroughtPercentage() 
	{
		List<Student> allstudent = s.getAllstudent();
		
		Comparator<Student> com=new Comparator<Student>() 
		{
			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getThroughtPercentage().compareTo(o2.getThroughtPercentage());
			}
			
		};
		Collections.sort(allstudent, com);
		return allstudent;
	}

}
