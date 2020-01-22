package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.Batch;
import com.example.demo.dto.Student;
import com.example.demo.dto.User;
import com.example.demo.service.BatchService;
import com.example.demo.service.BatchServiceImple;
import com.example.demo.service.UserService;

@Controller
public class HelloController {
	
	@Autowired
	UserService userService;
	BatchService batchService = new BatchServiceImple();
	

	@GetMapping("/signup")
	public ModelAndView signupPage(HttpServletRequest request) {
		ModelAndView mv =new ModelAndView();
		String name = (String)request.getSession().getAttribute("UserId");
		String type = (String)request.getSession().getAttribute("Type");
		
		if(name!=null) {
			if(type.equals("Admin")) {
				
				List<Batch> list = batchService.allBatch();
				
				mv.addObject("list", list);
				mv.setViewName("admin.jsp");
				
			}
			else if(type.equals("Student"))
				mv.setViewName("student.jsp");
			else if(type.equals("Mentor"))
				mv.setViewName("mentor.jsp");
			else 
				mv.setViewName("alumin.jsp");
		}else
		    mv.setViewName("sign.jsp");
		                                                      
		return mv;
	}
	
	
	@PostMapping("/signin")
	public ModelAndView signupPage1(User user,HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv =new ModelAndView();
		
		System.out.println(user.getUserName()+"  "+user.getPassword());
		
		
		
		System.out.println("Step-1");
		

			System.out.println("Step-2");
		    User status = userService.login(user);
		    System.out.println(status);
		    
		if(status!=null) {
			request.getSession().setAttribute("UserId", status.getUserName());  
			request.getSession().setAttribute("Type", status.getType());
			if(status.getType().equals("Admin")) {

				List<Batch> list = batchService.allBatch();
				
				mv.addObject("list", list);
				mv.setViewName("admin.jsp");
				
			}else if(status.getType().equals("Mentor")) {
				mv.setViewName("mentor.jsp");
			}else if(status.getType().equals("Student")) {
				mv.setViewName("student.jsp");
			}else {
				
			}
		}
		else
		    mv.setViewName("sign.jsp");
	 
		return mv;
	}
	
	@GetMapping("/sample")
	public ModelAndView sample() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("sample.jsp");
		return mv;
	}
	
	
	
	@GetMapping("/onebatch")
	public ModelAndView sample1(@RequestParam String bno) {
		ModelAndView mv = new ModelAndView();
		try {
			System.out.println("Hello");
			Integer bid=Integer.parseInt(bno);	
			System.out.println("Batch Id :-> "+bid);
			
			List<Student> slist = batchService.allStudent(bid);
			mv.addObject("slist", slist);
			
		}catch(Exception e) {
			
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
		
		mv.setViewName("Batch.jsp");
		return mv;
	}
}
