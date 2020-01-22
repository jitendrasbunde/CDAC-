package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.Batch;
import com.example.demo.service.BatchService;
import com.example.demo.service.BatchServiceImple;

@Controller
public class AdminController {
	
	
	BatchService batchService = new BatchServiceImple();
	
	@GetMapping("/page1")
	public ModelAndView page1(HttpServletRequest request)
	{
		ModelAndView mv =new ModelAndView();
		try {
		
			List<Batch> list = batchService.allBatch();
		
			mv.addObject("list", list);
			mv.setViewName("BatchList.jsp");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return mv;
	}

}
