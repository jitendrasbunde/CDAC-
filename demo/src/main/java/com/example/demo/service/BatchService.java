package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Batch;
import com.example.demo.dto.Student;



public interface BatchService {
	List<Batch> allBatch();
	List<Student> allStudent(int bid);
	}
