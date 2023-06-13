package com.ankith.schooldatamanagment.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ankith.schooldatamanagment.dto.Teacher;
import com.ankith.schooldatamanagment.util.AppConstants;
import com.ankith.schooldatamanagment.util.ConnectionUtil;

public class TeacherDAOimp implements TeacherDAO
{

	@Override
	public Teacher teacherLogin(String name, String password)
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.TEACHER_LOGIN);
				ps.setString(1, name);
				ps.setString(2, password);
				ResultSet set = ps.executeQuery();
				Teacher a=new Teacher();
					while(set.next())
					{
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setSubject(set.getString(4));
						 a.setSal(set.getDouble(5));
						 a.setDateOfJoining(set.getDate(6));
						 a.setClassTeacher(set.getString(7));
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
	public String saveTeacher(Teacher teacher) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.SAVE_TEACHER);
				ps.setString(1,teacher.getName());
				ps.setString(2,teacher.getEmail());
				ps.setString(3,teacher.getSubject());
				ps.setDouble(4,teacher.getSal());
				ps.setDate(5,teacher.getDateOfJoining());
				ps.setString(6,teacher.getClassTeacher());
				ps.setString(7,teacher.getPassword());
				boolean execute = ps.execute();
				return teacher.toString()+" data is saved";
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return "Something went wrong";
	}

	@Override
	public String updateTeacher(Teacher teacher) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.UPDATE_TEACHER);
				ps.setString(1,teacher.getName());
				ps.setString(2,teacher.getEmail());
				ps.setString(3,teacher.getSubject());
				ps.setDouble(4,teacher.getSal());
				ps.setDate(5,teacher.getDateOfJoining());
				ps.setString(6,teacher.getClassTeacher());
				ps.setString(7,teacher.getPassword());
				ps.setInt(8,teacher.getId());
				int eu = ps.executeUpdate();
				return eu+" data is updated";
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Teacher getTeacherById(int id) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_TEACHERBYID);
				ps.setInt(1, id);
				ResultSet set = ps.executeQuery();
				if(set.isBeforeFirst())
				{
					Teacher a=null;
					while(set.next())
					{
						 a=new Teacher();
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setSubject(set.getString(4));
						 a.setSal(set.getDouble(5));
						 a.setDateOfJoining(set.getDate(6));
						 a.setClassTeacher(set.getString(7));
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
	public List<Teacher> getAllTeacher() 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			List<Teacher> l=null;
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_ALLTEACHER);
				ResultSet set = ps.executeQuery();
				if(set.isBeforeFirst())
				{
					l=new ArrayList<Teacher>();
					while(set.next())
					{
						Teacher a=new Teacher();
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setSubject(set.getString(4));
						 a.setSal(set.getDouble(5));
						 a.setDateOfJoining(set.getDate(6));
						 a.setClassTeacher(set.getString(7));
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
	public Teacher deleteTeacherById(int id) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_TEACHERBYID);
				ps.setInt(1, id);
				ResultSet set = ps.executeQuery();
				PreparedStatement ps2 = c.prepareStatement(AppConstants.DELETE_TEACHERBYID);
				ps2.setInt(1, id);
				if(set.isBeforeFirst())
				{
					Teacher a=null;
					while(set.next())
					{
						 a=new Teacher();
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setSubject(set.getString(4));
						 a.setSal(set.getDouble(5));
						 a.setDateOfJoining(set.getDate(6));
						 a.setClassTeacher(set.getString(7));
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
