package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	
	public List<Product> getAll();
	
	public List<Product> getAll(String column);
	
	public List<Product> getLikeKeyWord(String keyWord);
	
	public Product getByProductId(int productId);
	
	public int regist(Product product);

	public int delete(int productId);
	
	public int update(int productId, Product product);
	
}
