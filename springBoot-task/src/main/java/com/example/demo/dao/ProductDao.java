package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductDao {
	
	public List<Product> findAll();
	
	public List<Product> findAll(String column);
	
	public List<Product> findLikeKeyWord(String keyWord);
	
	public Product findByProductId(int productId);
	
	public int insert(Product product);

	public int delete(int productId);
	
	public int update(int productId, Product product);
	
}
