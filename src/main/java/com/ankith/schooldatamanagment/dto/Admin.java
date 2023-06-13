package com.ankith.schooldatamanagment.dto;

public class Admin 
{
	private Integer id;
	private String name;
	private String email;
	private String dept;
	private String password;
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + ", password=" + password
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(Integer id, String name, String email, String dept, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.password = password;
	}
}
