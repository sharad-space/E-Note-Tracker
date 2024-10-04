package com.tracker.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracker.entities.User;
import com.tracker.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@ModelAttribute
	public void getUser(Principal p ,Model m) {
		String email = p.getName();
		User user = userRepository.findByEmail(email);
		m.addAttribute("user",user);
		
	}
	
	
	@RequestMapping("/addNotes")
	public String addNotes() {
		
		return "add_notes";
	}
	
	@RequestMapping("/viewNotes")
	public String viewNotes() {
		
		return "view_notes";
	}
	
	@RequestMapping("/editNotes")
	public String editNotes() {
		
		return "edit_notes";
	}

}
