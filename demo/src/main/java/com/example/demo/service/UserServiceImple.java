package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserDaoImple;
import com.example.demo.dto.User;

@Service
public class UserServiceImple implements  UserService {
	
	@Autowired 
	private UserDao userDao;
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User temp =userDao.select(user);
		return temp ;
	}

}
