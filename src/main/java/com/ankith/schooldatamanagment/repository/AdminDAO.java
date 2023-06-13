package com.ankith.schooldatamanagment.repository;

import java.util.List;

import com.ankith.schooldatamanagment.dto.Admin;

public interface AdminDAO 
{
	Admin adminLogin(String email,String password);
	
	String saveAdmin(Admin Admin);
	
	String updateAdmin(Admin Admin);
	
	Admin getAdminById(int id);
	
	List<Admin> getAllAdmin();
	
	Admin deleteAdminById(int id);
}
