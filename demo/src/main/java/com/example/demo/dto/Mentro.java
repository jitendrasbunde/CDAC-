package com.example.demo.dto;

public class Mentro {
	
	
	private int mentor_Id;
	private String f_Name;
	private String l_Name;
	private int start ;
	private int end;
	
	
	public Mentro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMentor_Id() {
		return mentor_Id;
	}
	public void setMentor_Id(int mentor_Id) {
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
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
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
