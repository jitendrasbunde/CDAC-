package com.example.demo.dto;

public class Student {

	private String s_Id;
	private String Name;
	private String email;
	private String ssc_Broard;
	private Float ssc_Per;
	private Integer ssc_Year;
	private String hsc_Broard;
	private Float hsc_Per;
	private Integer hsc_Year;
	private String deploma_Broard;
	private Float deploma_Per;
	private Integer deploma_Year;
	private String degree_Broard;
	private Float degree_Per;
	private Integer  degree_Year;
	private Integer year_Down;
	private Integer batch_Id;
	private Integer mentor_Id;
	
	/*
	 create table student(Student_ID varchar(70) primary key,
	 Student_Name varchar(40),
		Batch_ID int(20),
		SSC_Board varchar(30),
		SSC_Percentage decimal(18,2),
		SSC_Year int(10),
		HSC_Board varchar(30),
		HSC_Percentage decimal(18,2),
		HSC_Year int(10),
		Diploma_Board varchar(30),
		Diploma_Percentage decimal(18,2),
		Diploma_Year int(10),
		Degree_University varchar(50),
		Degree_Year int(10),
		Year_Down int(10),
		Email varchar(50),
		Mentor_ID int(10))
	
	 */
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getS_Id() {
		return s_Id;
	}

	public void setS_Id(String s_Id) {
		this.s_Id = s_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsc_Broard() {
		return ssc_Broard;
	}

	public void setSsc_Broard(String ssc_Broard) {
		this.ssc_Broard = ssc_Broard;
	}

	public Float getSsc_Per() {
		return ssc_Per;
	}

	public void setSsc_Per(Float ssc_Per) {
		this.ssc_Per = ssc_Per;
	}

	public Integer getSsc_Year() {
		return ssc_Year;
	}

	public void setSsc_Year(Integer ssc_Year) {
		this.ssc_Year = ssc_Year;
	}

	public String getHsc_Broard() {
		return hsc_Broard;
	}

	public void setHsc_Broard(String hsc_Broard) {
		this.hsc_Broard = hsc_Broard;
	}

	public Float getHsc_Per() {
		return hsc_Per;
	}

	public void setHsc_Per(Float hsc_Per) {
		this.hsc_Per = hsc_Per;
	}

	public Integer getHsc_Year() {
		return hsc_Year;
	}

	public void setHsc_Year(Integer hsc_Year) {
		this.hsc_Year = hsc_Year;
	}

	public String getDeploma_Broard() {
		return deploma_Broard;
	}

	public void setDeploma_Broard(String deploma_Broard) {
		this.deploma_Broard = deploma_Broard;
	}

	public Float getDeploma_Per() {
		return deploma_Per;
	}

	public void setDeploma_Per(Float deploma_Per) {
		this.deploma_Per = deploma_Per;
	}

	public Integer getDeploma_Year() {
		return deploma_Year;
	}

	public void setDeploma_Year(Integer deploma_Year) {
		this.deploma_Year = deploma_Year;
	}

	public String getDegree_Broard() {
		return degree_Broard;
	}

	public void setDegree_Broard(String degree_Broard) {
		this.degree_Broard = degree_Broard;
	}

	public Float getDegree_Per() {
		return degree_Per;
	}

	public void setDegree_Per(Float degree_Per) {
		this.degree_Per = degree_Per;
	}

	public Integer getDegree_Year() {
		return degree_Year;
	}

	public void setDegree_Year(Integer degree_Year) {
		this.degree_Year = degree_Year;
	}

	public Integer getYear_Down() {
		return year_Down;
	}

	public void setYear_Down(Integer year_Down) {
		this.year_Down = year_Down;
	}

	public Integer getBatch_Id() {
		return batch_Id;
	}

	public void setBatch_Id(Integer batch_Id) {
		this.batch_Id = batch_Id;
	}

	public Integer getMentor_Id() {
		return mentor_Id;
	}

	public void setMentor_Id(Integer mentor_Id) {
		this.mentor_Id = mentor_Id;
	}

	
	

	
}
