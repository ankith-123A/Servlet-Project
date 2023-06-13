package com.ankith.schooldatamanagment.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ankith.schooldatamanagment.dto.Student;
import com.ankith.schooldatamanagment.util.AppConstants;
import com.ankith.schooldatamanagment.util.ConnectionUtil;

public class StudentDAOimp implements StudentDAO{

	@Override
	public Student studentLogin(String name, String password) {
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.STUDENT_LOGIN);
				ps.setString(1, name);
				ps.setString(2, password);
				ResultSet set = ps.executeQuery();
				Student a=new Student();
					while(set.next())
					{
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setStd(set.getInt(4));
						 a.setSec(set.getString(5));
						 a.setDob(set.getDate(6));
						 a.setThroughtPercentage(set.getString(7));
						 a.setPassword(set.getString(8));
					}
					return a;
				}
			 catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String saveStudent(Student student) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.SAVE_STUDENT);
				ps.setString(1,student.getName());
				ps.setString(2,student.getEmail());
				ps.setInt(3,student.getStd());
				ps.setString(4,student.getSec());
				ps.setDate(5,student.getDob());
				ps.setString(6,student.getThroughtPercentage());
				ps.setString(7,student.getPassword());
				boolean execute = ps.execute();
				return student.toString()+" data is saved";
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return "Something went wrong";
	}

	@Override
	public String updateStudent(Student student) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.UPDATE_STUDENT);
				ps.setString(1,student.getName());
				ps.setString(2,student.getEmail());
				ps.setInt(3,student.getStd());
				ps.setString(4,student.getSec());
				ps.setDate(5,student.getDob());
				ps.setString(6,student.getThroughtPercentage());
				ps.setString(7,student.getPassword());
				ps.setInt(8, student.getId());
				int eu = ps.executeUpdate();
				return eu+" data is updated";
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Student getStudentById(int id) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_STUDENTBYID);
				ps.setInt(1, id);
				ResultSet set = ps.executeQuery();
				if(set.isBeforeFirst())
				{
					Student a=null;
					while(set.next())
					{
						 a=new Student();
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setStd(set.getInt(4));
						 a.setSec(set.getString(5));
						 a.setDob(set.getDate(6));
						 a.setThroughtPercentage(set.getString(7));
						 a.setPassword(set.getString(8));
					}
					return a;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public List<Student> getAllstudent() 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			List<Student> l=null;
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_ALLSTUDENT);
				ResultSet set = ps.executeQuery();
				if(set.isBeforeFirst())
				{
					l=new ArrayList<Student>();
					Student a=null;
					while(set.next())
					{
						 a=new Student();
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setStd(set.getInt(4));
						 a.setSec(set.getString(5));
						 a.setDob(set.getDate(6));
						 a.setThroughtPercentage(set.getString(7));
						 a.setPassword(set.getString(8));
						 l.add(a);
					}
					return l;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Student deleteStudentById(int id) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_STUDENTBYID);
				ps.setInt(1, id);
				ResultSet set = ps.executeQuery();
				PreparedStatement ps2 = c.prepareStatement(AppConstants.DELETE_STUDENTBYID);
				ps2.setInt(1, id);
				if(set.isBeforeFirst())
				{
					Student a=null;
					while(set.next())
					{
						 a=new Student();
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setStd(set.getInt(4));
						 a.setSec(set.getString(5));
						 a.setDob(set.getDate(6));
						 a.setThroughtPercentage(set.getString(7));
						 a.setPassword(set.getString(8));
					}
					ps2.executeUpdate();
					return a;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
