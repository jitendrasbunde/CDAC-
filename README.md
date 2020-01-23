# CDAC-



create table mentor(
	Mentor_ID varchar(25) primary key auto_increment,
	First_Name varchar(30),
	Last_Name varchar(30),
	Student_Start Bigint(10),
	Student_End Bigint(10),
	Position varchar(30),
	Email varchar(50)
);


create table student(Student_ID varchar(70) primary key,
		Student_Name varchar(40),
		Batch_ID int(11),
		SSC_Board varchar(30),
		SSC_Percentage float,
		SSC_Year int(10),
		HSC_Board varchar(30),
		HSC_Percentage float,
		HSC_Year int(10),
		Diploma_Board varchar(30),
		Diploma_Percentage float,
		Diploma_Year int(10),
		Degree_University varchar(50),
		Degree_Percentage float,
		Degree_Year int(10),
		Year_Down int(10),
		Email varchar(50),
		Mentor_ID varchar(25)
);


create table user(
	User_Name varchar(40) primary key,
	Password varchar(50), 
	Type varchar(30)
);

create table admin(
	User_Name varchar(40) primary key,
	First_Name varchar(20),
	Last_Name varchar(20),
	Password varchar(30)
);

create table alumni(
	User_Name varchar(40) primary key,
	Password varchar(30),
	First_Name varchar(20),
	Last_Name varchar(20),
	Email varchar(50),
	Batch varchar(20), 
	Mobile varchar(40), 
	Company_Name varchar(30), 
	Working_Platform varchar(30)
);
