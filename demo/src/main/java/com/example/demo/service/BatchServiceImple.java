package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.BatchDao;
import com.example.demo.dao.BatchDaoImple;
import com.example.demo.dto.Batch;
import com.example.demo.dto.Student;

public class BatchServiceImple implements BatchService {
	
	private BatchDao batchDao = new BatchDaoImple();
	@Override
	public List<Batch> allBatch() {
		// TODO Auto-generated method stub
		
		List<Batch> list=batchDao.selectAll();
		
		return list;
	}

	@Override
	public List<Student> allStudent(int bid) {
		// TODO Auto-generated method stub
		List<Student> slist = batchDao.selectBatchStudents(bid);
		return slist;
	}

}
