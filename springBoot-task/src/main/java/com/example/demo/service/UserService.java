package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	
	public User login(String loginId, String password);
	
}
