package com.example.demo.service;

import com.example.demo.dao.MentorDao;
import com.example.demo.dao.MentorDaoImple;
import com.example.demo.dto.Mentor;

public class MentorServiceImple implements MentorService{
	MentorDao obj = new MentorDaoImple();
		
	@Override
	public boolean addMentor(Mentor mentor) {
		// TODO Auto-generated method stub
		obj.create(mentor);
	
		return false;
	}

}
