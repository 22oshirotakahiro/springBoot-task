package com.example.demo.entity;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class User {
	private Integer id;
	private String loginId;
	private String password;
	private String name;
	private Integer role;
	private String createdAt;
	private String updatedAt;
	
	public User() {
		
	}
	
	public User(Integer id, String loginId, String password, String name, Integer role, String createdAt, String updatedAt) {
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.name = name;
		this.role = role;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}
