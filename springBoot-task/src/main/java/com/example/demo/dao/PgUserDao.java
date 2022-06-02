package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class PgUserDao implements UserDao{
	
	public static final String SELECT_BY_LOGINID_AND_PASS = "SELECT * FROM users WHERE login_id = :loginId AND password = :password";
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public User findByLoginIdAndPass(String loginId, String password) {
		String sql = SELECT_BY_LOGINID_AND_PASS;
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("loginId", loginId);
		param.addValue("password", password);
		List<User> list = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<User>(User.class));
		
		return list.isEmpty() ? null : list.get(0);
	}
	
}