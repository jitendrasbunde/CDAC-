package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
		
		try {
		String sql ="SELECT * FROM USER WHERE USERNAME=? AND PASSWORD=?";
		obj.setJdbcTemplate(jdbcTemplate);
		User temp = jdbcTemplate.queryForObject(sql,new Object[] {user.getUserName(),user.getPassword()}, new UserRowMapper());

		System.out.println("USER IS Select");
		return temp;
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
}
