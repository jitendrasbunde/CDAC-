package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.conn.MyConn;
import com.example.demo.dto.Batch;
import com.example.demo.dto.Student;
import com.example.demo.mapper.BatchRowMapper;

public class BatchDaoImple implements BatchDao{
  
	private MyConn obj1 = new MyConn();
	
	
	@Override
	public List<Batch> selectAll() {
		// TODO Auto-generated method stub
		List<Batch> list=new ArrayList<Batch>() ;
		
		
		
		String sql = "select * from Batch";
		if(obj1.getJdbcTemplate()!=null) {
			System.out.println(obj1.getJdbcTemplate());
		List<Map<String,Object>> temp = obj1.getJdbcTemplate().queryForList(sql);
		
		for(Map<String,Object> p : temp) {
			Batch obj = new Batch();
			
			obj.setName((String)p.get("B_Name"));
			obj.setStart((long)p.get("B_Start"));
			obj.setEnd((long)p.get("B_End"));
			
			list.add(obj);
		}

		}else 
			System.out.println("Template is Null");
		
		return list;
	}

	@Override
	public List<Student> selectBatchStudents(int bid) {
		// TODO Auto-generated method stub

		List<Student> list=new ArrayList<Student>() ;
		
		String sql = "select * from Student where Batch_ID=?";
		if(obj1.getJdbcTemplate()!=null) {
			try {
			System.out.println(obj1.getJdbcTemplate());
		List<Map<String,Object>> temp = obj1.getJdbcTemplate().queryForList(sql,new Object[] {bid});
		System.out.println(obj1.getJdbcTemplate());
				for(Map<String,Object> p : temp) {
					Student obj = new Student();
					
					  
					obj.setS_Id((String)p.get("Student_ID"));
					obj.setName((String)p.get("Student_Name"));
					obj.setBatch_Id((Integer)p.get("Batch_ID"));
					obj.setMentor_Id((Integer)p.get("Mentor_ID"));
					obj.setYear_Down((Integer)p.get("Year_Down"));
					obj.setEmail((String)p.get("Email"));
					obj.setSsc_Broard((String)p.get("SSC_Board"));
					obj.setSsc_Per((Float)p.get("SSC_Percentage"));
					obj.setSsc_Year((Integer)p.get("SSC_Year"));
					obj.setHsc_Broard((String)p.get("HSC_Board"));
					obj.setHsc_Per((Float)p.get("HSC_Percentage"));
					obj.setHsc_Year((Integer)p.get("HSC_Year"));
					obj.setDeploma_Broard((String)p.get("Deploma_Board"));
					obj.setDeploma_Per((Float)p.get("Deploma_Percentage"));
					obj.setDeploma_Year((Integer)p.get("Deploma_Year"));
					obj.setDegree_Broard((String)p.get("Degree_Board"));
					obj.setDegree_Per((Float)p.get("Degree_per"));
					obj.setDegree_Year((Integer)p.get("Degree_Year"));
					list.add(obj);
					
					/*
					
					System.out.println((String)p.get("Student_ID"));
					System.out.println((String)p.get("Student_Name"));
					System.out.println((Integer)p.get("Batch_ID"));
					System.out.println((Integer)p.get("Mentor_ID"));
					System.out.println((Integer)p.get("Year_Down"));
					System.out.println((String)p.get("Email"));
					System.out.println((String)p.get("SSC_Board"));
					System.out.println((Float)p.get("SSC_Percentage"));
					System.out.println((Integer)p.get("SSC_Year"));
					System.out.println((String)p.get("HSC_Board"));
					System.out.println((Float)p.get("HSC_Percentage"));
					System.out.println((Integer)p.get("HSC_Year"));
					System.out.println((String)p.get("Deploma_Board"));
					System.out.println((Float)p.get("Deploma_Percentage"));
					System.out.println((Integer)p.get("Deploma_Year"));
					System.out.println((String)p.get("Degree_Board"));
					System.out.println((Float)p.get("Degree_per"));
					System.out.println((Integer)p.get("Degree_Year"));
					*/
					
				}
				
			}catch(Exception e) {
				System.out.println(e.getMessage()+"Jitu");
			}
		}else 
			System.out.println("Template is Null");
		
		return list;
	}

}
