package com.ankith.schooldatamanagment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public interface ConnectionUtil 
{
	public static Connection getConnection()
	{
		Connection connection=null;
		try {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			connection = DriverManager.getConnection(AppConstants.URL,AppConstants.USER_NAME,AppConstants.USER_PASSWORD);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
	}
	
}

