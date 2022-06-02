package com.example.demo.dao;

import com.example.demo.entity.User;

public interface UserDao {
	
	public User findByLoginIdAndPass(String loginId, String password);
	
}
