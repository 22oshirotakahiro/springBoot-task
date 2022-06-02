package com.example.demo.entity;

public class Category {
	
	private int id;
	private String name;
	private String createdAt;
	private String updatedAt;
	
	public Category() {
		
	}
	
	public Category(int categoryId, String categoryName) {
		this.id = categoryId;
		this.name = categoryName;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
