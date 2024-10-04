package com.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracker.entities.User;
import com.tracker.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@Autowired
	UserService service;
 
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user,HttpSession session) {
		
		System.out.println(user);
		boolean f = service.existEmailCheck(user.getEmail());
		if (f) {
			session.setAttribute("msg", "User Already exits !");
		}else {
			User saveUser = service.saveUser(user);
			if (saveUser!=null) {
				session.setAttribute("msg", "Register successfully !");
			}else {
				session.setAttribute("msg", "Somthing went Wrong!");
			}
		}
		
		
		
		return "redirect:/register";
	}
	
	
	
	
	@RequestMapping("/signin")
	public String login() {
		
		return "login";
	}
	
}
