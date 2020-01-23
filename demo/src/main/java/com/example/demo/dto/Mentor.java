package com.example.demo.dto;

public class Mentor {
	
	
	private String mentor_Id;
	private String f_Name;
	private String l_Name;
	private Long start ;
	private Long end;
	private String email;
	private String position;
	
	
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getMentor_Id() {
		return mentor_Id;
	}


	public void setMentor_Id(String mentor_Id) {
		this.mentor_Id = mentor_Id;
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

	

	public Long getStart() {
		return start;
	}


	public void setStart(Long start) {
		this.start = start;
	}


	public Long getEnd() {
		return end;
	}


	public void setEnd(Long end) {
		this.end = end;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	
	/*
	  create table mentor(Mentor_ID int(10) primary key auto_increment,
	  First_Name varchar(30),
	  Last_Name varchar(30),
	  Student_Start int(10),
	  Student_End int(10),
	  Position varchar(30),
	  Email varchar(50));
	 */
}
