package com.ankith.schooldatamanagment.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ankith.schooldatamanagment.dto.Admin;
import com.ankith.schooldatamanagment.util.AppConstants;
import com.ankith.schooldatamanagment.util.ConnectionUtil;

public class AdminDAOimp implements AdminDAO 
{

	@Override
	public Admin adminLogin(String name, String password)
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.ADMIN_LOGIN);
				ps.setString(1, name);
				ps.setString(2, password);
				ResultSet set = ps.executeQuery();
					Admin a=new Admin();
					while(set.next())
					{
						 a.setId(set.getInt(1));
						 a.setName(set.getString(2));
						 a.setEmail(set.getString(3));
						 a.setDept(set.getString(4));
						 a.setPassword(set.getString(5));
					}
					return a;
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String saveAdmin(Admin admin) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.SAVE_ADMIN);
				ps.setString(1,admin.getName());
				ps.setString(2,admin.getEmail());
				ps.setString(3,admin.getDept());
				ps.setString(4,admin.getPassword());
				boolean execute = ps.execute();
				return admin.toString()+" data is saved";
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return "Something went wrong";
	}

	@Override
	public String updateAdmin(Admin admin) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.UPDATE_ADMIN);
				ps.setString(1,admin.getName());
				ps.setString(2,admin.getEmail());
				ps.setString(3,admin.getDept());
				ps.setString(4,admin.getPassword());
				ps.setInt(5, admin.getId());
				int eu = ps.executeUpdate();
				return eu+" data is updated";
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Admin getAdminById(int id) {
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_ADMINBYID);
				ps.setInt(1, id);
				ResultSet set = ps.executeQuery();
				if(set.isBeforeFirst())
				{
					Admin a=null;
					while(set.next())
					{
						a=new Admin();
						a.setId(set.getInt(1));
						a.setName(set.getString(2));
						a.setEmail(set.getString(3));
						a.setDept(set.getString(4));
						a.setPassword(set.getString(5));
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
	public List<Admin> getAllAdmin() 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_ALLADMIN);
				ResultSet set = ps.executeQuery();
				if(set.isBeforeFirst())
				{
					List<Admin> l=null;
					Admin a=null;
					while(set.next())
					{
						a=new Admin();
						a.setId(set.getInt(1));
						a.setName(set.getString(2));
						a.setEmail(set.getString(3));
						a.setDept(set.getString(4));
						a.setPassword(set.getString(5));
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
	public Admin deleteAdminById(int id) 
	{
		Connection c = ConnectionUtil.getConnection();
		if(c!=null)
		{
			try {
				PreparedStatement ps = c.prepareStatement(AppConstants.GET_ADMINBYID);
				ps.setInt(1, id);
				ResultSet set = ps.executeQuery();
				PreparedStatement ps2 = c.prepareStatement(AppConstants.DELETE_ADMINBYID);
				ps2.setInt(1, id);
					Admin a=null;
					while(set.next())
					{
						a=new Admin();
						a.setId(set.getInt(1));
						a.setName(set.getString(2));
						a.setEmail(set.getString(3));
						a.setDept(set.getString(4));
						a.setPassword(set.getString(5));
					}
					ps2.executeUpdate();
					return a;
				}
			 catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}

}
