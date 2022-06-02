package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@Service
public class PgUserService implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User login(String loginId, String password) {
		
		return userDao.findByLoginIdAndPass(loginId, password);
	}

}
