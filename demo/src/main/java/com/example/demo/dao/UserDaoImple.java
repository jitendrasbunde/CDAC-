package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.conn.MyConn;
import com.example.demo.dto.User;
import com.example.demo.mapper.UserRowMapper;

@Repository
public class UserDaoImple implements UserDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public User select(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName()+"  "+user.getPassword());
		MyConn obj = new MyConn();
		
		
		String sql ="SELECT * FROM USER WHERE USERNAME=? AND PASSWORD=?";
		User temp = jdbcTemplate.queryForObject(sql,new Object[] {user.getUserName(),user.getPassword()}, new UserRowMapper());
		obj.setJdbcTemplate(jdbcTemplate);
		System.out.println("USER IS Select");
		return temp;
	}
}
