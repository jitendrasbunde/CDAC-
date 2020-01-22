package com.example.demo.dto;

public class Alumin {
	private String a_id;
	private String f_Name;
	private String l_Name;
	private int batch_id;
	private String mobile;
	private String company;
	private String platform;
	public Alumin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getF_Name() {
		return f_Name;
	}
	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}
	public String getL_Name() {
		return l_Name;
	}
	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	
	/*
	  create table alumni(User_Name varchar(40) primary key,
	  First_Name varchar(20),
	  Last_Name varchar(20),
	  Email varchar(50),
	  Batch varchar(20),
	  Mobile varchar(40), 
	  Company_Name varchar(30), 
	  Working_Platform varchar(30));*/
	
	
	
}
