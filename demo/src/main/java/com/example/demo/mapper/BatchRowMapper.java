package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.dto.Batch;
import com.example.demo.dto.User;

public class BatchRowMapper implements RowMapper<Batch> {

	@Override
	public Batch mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Batch batch =new Batch();
		
		batch.setName(rs.getString("B_Name"));
		batch.setStart(rs.getLong("B_Start"));
		batch.setEnd(rs.getLong("B_End"));
		
		return batch;
	}
	

}
