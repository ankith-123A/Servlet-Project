package com.ankith.schooldatamanagment.dto;

import java.sql.Date;

public class Teacher 
{
	private Integer id;
	private String name;
	private String email;
	private String subject;
	private double sal;
	private Date dateOfJoining;
	private String classTeacher;
	private String password;
	public Teacher() {
		super();
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", email=" + email + ", subject=" + subject + ", sal=" + sal
				+ ", dateOfJoining=" + dateOfJoining + ", classTeacher=" + classTeacher + ", password=" + password
				+ "]";
	}
	public Teacher(Integer id, String name, String email, String subject, double sal, Date dateOfJoining,
			String classTeacher, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.sal = sal;
		this.dateOfJoining = dateOfJoining;
		this.classTeacher = classTeacher;
		this.password = password;
	}
}
