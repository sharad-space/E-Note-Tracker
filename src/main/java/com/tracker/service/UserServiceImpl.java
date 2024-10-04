package com.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.tracker.entities.User;
import com.tracker.repository.UserRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public User saveUser(User user) {
		user.setRole("USER");
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		User user1 = userRepository.save(user);
		return user1;
	}

	@Override
	public boolean existEmailCheck(String email) {
		boolean existsByEmail = userRepository.existsByEmail(email);
		return existsByEmail;
	}
	
	public void removeSessionMessage() {
	HttpSession session = ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
	session.removeAttribute("msg");
		
	}

}
