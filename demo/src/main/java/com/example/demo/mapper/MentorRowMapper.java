package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.dto.Mentor;

public class MentorRowMapper implements RowMapper<Mentor> {

	@Override
	public Mentor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Mentor obj = new Mentor();
		
		obj.setMentor_Id(rs.getString("mentor_id"));
		obj.setF_Name(rs.getString("First_Name"));
		obj.setL_Name(rs.getString("Last_Name"));
		obj.setStart((Long)rs.getLong("Student_Start"));
		obj.setEnd((Long)rs.getLong("Student_End"));
		obj.setEmail(rs.getString("Email"));
		obj.setPosition(rs.getString("Position"));
		
		return obj;
	}

}
