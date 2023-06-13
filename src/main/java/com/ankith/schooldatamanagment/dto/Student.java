package com.ankith.schooldatamanagment.dto;

import java.sql.Date;

public class Student 
{
	private Integer id;
	private String name;
	private String email;
	private Integer std;
	private String sec;
	private Date dob;
	private String throughtPercentage;
	private String password;
	
	public Integer getId() 
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public Integer getStd() 
	{
		return std;
	}
	public void setStd(Integer std) 
	{
		this.std = std;
	}
	public String getSec()
	{
		return sec;
	}
	public void setSec(String sec)
	{
		this.sec = sec;
	}
	public Date getDob() 
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	public String getThroughtPercentage()
	{
		return throughtPercentage;
	}
	public void setThroughtPercentage(String throughtPercentage)
	{
		this.throughtPercentage = throughtPercentage;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public Student() 
	{
		super();
	}
	public Student(Integer id, String name, String email, Integer std, String sec, Date dob, String throughtPercentage,
			String password) 
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.std = std;
		this.sec = sec;
		this.dob = dob;
		this.throughtPercentage = throughtPercentage;
		this.password = password;
	}
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", std=" + std + ", sec=" + sec + ", dob="
				+ dob + ", throughtPercentage=" + throughtPercentage + ", password=" + password + "]";
	}
}
