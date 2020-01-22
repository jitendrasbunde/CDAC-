package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.dto.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setType(rs.getString("type"));
		
		return user;
	}

}
