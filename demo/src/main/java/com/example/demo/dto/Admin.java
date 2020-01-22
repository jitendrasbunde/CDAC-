package com.example.demo.dto;

public class Admin {
	
	
	private String Name;
	private String first_Name;
	private String list_Name;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getList_Name() {
		return list_Name;
	}
	public void setList_Name(String list_Name) {
		this.list_Name = list_Name;
	}
	/*
	 
create table admin(User_Name varchar(40) primary key,
	First_Name varchar(20),
	Last_Name varchar(20),
	Password varchar(30)); 
	 */
	
}
