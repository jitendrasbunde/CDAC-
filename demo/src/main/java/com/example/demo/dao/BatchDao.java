package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.Batch;
import com.example.demo.dto.Student;

public interface BatchDao {
 List<Batch> selectAll();
 List<Student> selectBatchStudents(int bid);
}
