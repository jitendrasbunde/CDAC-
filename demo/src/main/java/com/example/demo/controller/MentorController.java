package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.Mentor;
import com.example.demo.service.MentorService;
import com.example.demo.service.MentorServiceImple;

@Controller
public class MentorController {
	
	private MentorService obj = new MentorServiceImple();
	
	@GetMapping("/mentoradd")
	public ModelAndView page1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("mentoradd.jsp");
		return mv;
	}
	
	@PostMapping("/addmentor")
	public ModelAndView page2(Mentor mentor,HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		
		obj.addMentor(mentor);
		
		mv.setViewName("admin.jsp");
		return mv;
	}
	
}
