package com.ankith.schooldatamanagment.Service;

import java.util.List;

import com.ankith.schooldatamanagment.dto.Admin;
import com.ankith.schooldatamanagment.repository.AdminDAOimp;

public class AdminServImp implements AdminService
{
	private AdminDAOimp ad;
	{
		ad=new AdminDAOimp();
	}
	@Override
	public Admin adminLogin(String email, String password) 
	{
		
		return ad.adminLogin(email, password);
	}

	@Override
	public String saveAdmin(Admin admin) {
		
		return ad.saveAdmin(admin);
	}

	@Override
	public String updateAdmin(Admin admin) {
		
		return ad.updateAdmin(admin);
	}

	@Override
	public Admin getAdminById(int id) {
		
		return ad.getAdminById(id);
	}

	@Override
	public List<Admin> getAllAdmin() {
		
		return ad.getAllAdmin();
	}

	@Override
	public Admin deleteAdminById(int id) {
		
		return ad.deleteAdminById(id);
	}

}
