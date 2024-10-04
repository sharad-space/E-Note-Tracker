package com.tracker.service;

import com.tracker.entities.User;


public interface UserService {
	
	public User saveUser(User user);
    public boolean existEmailCheck(String email);		
	

}
