package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.conn.MyConn;
import com.example.demo.dto.Batch;
import com.example.demo.dto.Mentor;
import com.example.demo.dto.Student;
import com.example.demo.mapper.BatchRowMapper;
import com.example.demo.mapper.MentorRowMapper;

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
					obj.setDeploma_Broard((String)p.get("Diploma_Board"));
					obj.setDeploma_Per((Float)p.get("Diploma_Percentage"));
					obj.setDeploma_Year((Integer)p.get("Diploma_Year"));
					obj.setDegree_Broard((String)p.get("Degree_University"));
					obj.setDegree_Per((Float)p.get("Degree_Percentage"));
					obj.setDegree_Year((Integer)p.get("Degree_Year"));
					list.add(obj);
					
				}
				
			}catch(Exception e) {
				System.out.println(e.getMessage()+"Jitu");
			}
		}else 
			System.out.println("Template is Null");
		
		return list;
	}
	@Override
	public boolean create(Batch batch) {
		// TODO Auto-generated method stub
		
		List<Mentor> dbMList = new ArrayList<Mentor>();
		
		System.out.println(batch.getStart()+"  "+batch.getEnd());
		long k =batch.getStart();
		Integer b_id=1;
		String batchName = batch.getName();
		long total =batch.getEnd()-batch.getStart()+1;
		if((batch.getEnd()-batch.getStart()+1)<200) {
			
			
			
			String sql = "select Mentor_id from mentor";
			List<Map<String,Object>> Mlist= obj1.getJdbcTemplate().queryForList(sql);
			
			for(Map<String,Object> p : Mlist) {
				Mentor obj = new Mentor();
				
				obj.setMentor_Id((String)p.get("mentor_id"));
				obj.setF_Name((String)p.get("First_Name"));
				obj.setL_Name((String)p.get("Last_Name"));
				obj.setStart((Long)p.get("Student_Start"));
				obj.setEnd((Long)p.get("Student_End"));
				obj.setEmail((String)p.get("Email"));
				obj.setPosition((String)p.get("Position"));
				
				dbMList.add(obj);
			}
			
			String sql3 = "select B_id from Batch where BatchName = ?";
			try {
			b_id = obj1.getJdbcTemplate().queryForObject(sql3,new Object[] {batchName},Integer.class);
			System.out.println(b_id);
			}catch(Exception e) {
				System.out.println("Batch_Id Problem");
			}try {
			int each = (int)(total/dbMList.size());
			System.out.println(dbMList.size());
			System.out.println(each);
			System.out.println(k);
			System.out.println(dbMList.get(0));
			for(int i=1;i<=dbMList.size();i++) {
				for(int j=1;j<=each;j++) {
					
					String sql1="Insert into user(userName,password,type) values(?,?,?)";
					obj1.getJdbcTemplate().update(sql1,new Object[] {k,k,"Student"});
					
					System.out.println(dbMList.get(i-1).getMentor_Id());
					System.out.println(b_id);
					
					String sql2="Insert into student(Student_ID,Mentor_ID,Batch_ID) values(?,?,?)";
					obj1.getJdbcTemplate().update(sql2,new Object[] {k,dbMList.get(i-1).getMentor_Id(),b_id});
					
						System.out.println(k++);
				}
			}
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Batch is Big");
		}
		return false;
	}


}