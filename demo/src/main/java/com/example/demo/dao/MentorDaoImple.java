package com.example.demo.dao;

import com.example.demo.conn.MyConn;
import com.example.demo.dto.Mentor;

public class MentorDaoImple implements MentorDao{
    private MyConn obj = new MyConn();

	@Override
	public boolean create(Mentor mentor) {
		// TODO Auto-generated method stub
		try {
		String sql="INSERT INTO MENTOR(MENTOR_ID,FIRST_NAME,LAST_NAME,POSITION,EMAIL) VALUES (?,?,?,?,?)";
		obj.getJdbcTemplate().update(sql,new Object[] {mentor.getMentor_Id(),mentor.getF_Name(),mentor.getL_Name(),mentor.getPosition(),mentor.getEmail()});
		
		return true;
		}catch(Exception e) {
			System.out.println("JITU BUNDE");
			return false;
		}
	}
}
