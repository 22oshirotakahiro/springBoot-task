package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;

@Service
public class PgProductService implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAll() {
		
		return productDao.findAll();
	}

	// 上記の並び替えに対応するためのメソッド
	@Override
	public List<Product> getAll(String column) {
		
		return productDao.findAll(column);
	}

	@Override
	public List<Product> getLikeKeyWord(String keyWord) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Product getByProductId(int productId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int regist(Product product) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int delete(int productId) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int update(int productId, Product product) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	
	
	
}
