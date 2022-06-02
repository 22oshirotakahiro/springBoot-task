package com.example.demo.entity;

public class Product {
	
	private int id;
	private int productId;
	private int categoryId;
	private String name;
	private int price;
	private String description;
	private String imagePath;
	private String createdAt;
	private String updatedAt;
	private Category ctgry;
	
	public Product() {
		
	}
	
	public Product (int id, int productId, int categaoryId, String name, int price, String description, String imagePath) {
		this.id = id;
		this.productId = productId;
		this.categoryId = categaoryId;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imagePath = imagePath;
		
	}
	
	public Product (int id, int productId, String name, int price, String description, String imagePath, int categaoryId, String categoryName) {
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imagePath = imagePath;
		this.ctgry = new Category(categaoryId, categoryName);
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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
	public Category getCtgry() {
		return ctgry;
	}
	public void setCtgry(Category ctgry) {
		this.ctgry = ctgry;
	}
	
}
