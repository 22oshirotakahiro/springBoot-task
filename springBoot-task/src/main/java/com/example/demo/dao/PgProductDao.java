package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class PgProductDao implements ProductDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	// 定数SQL
	private static final String SQL_SELECT_ALL = "SELECT product_id, p.name, price, description, category_id, c.name AS category_name FROM products AS p INNER JOIN categories AS c ON p.category_id = c.id ORDER BY :column";
	private static final String SQL_SELECT_LIKE_KEYWORD = "SELECT product_id, p.name, price, description, category_id, c.name AS category_name FROM products AS p INNER JOIN categories AS c ON p.category_id = c.id WHERE p.name LIKE ? OR c.name LIKE ?";
	private static final String SQL_SELECT_WHERE_PRODUCT_ID = "SELECT product_id, p.name, price, description, category_id, c.name AS category_name FROM products AS p INNER JOIN categories AS c ON p.category_id = c.id WHERE product_id = ?";
	private static final String SQL_INSERT = "INSERT INTO products(product_id, name, price, category_id) VALUES(?, ?, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM products WHERE product_id = ?";
	private static final String SQL_UPDATE = "UPDATE products SET product_id = ?, name = ?, price = ?, category_id = ?, description = ? WHERE product_id = ?";
	
	private List<Product> list = new ArrayList<Product>();
	

	@Override
	public List<Product> findAll() {
		
		String sql = SQL_SELECT_ALL;
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("column", "product_id");
		list = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));
		
		return list;
	}
	
	// 上記の並び替えに対応するためのメソッド
	@Override
	public List<Product> findAll(String column) {
		
		String sql = SQL_SELECT_ALL;
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("column", column);
		list = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));
		
		return list;
	}

	@Override
	public List<Product> findLikeKeyWord(String keyWord) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Product findByProductId(int productId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int insert(Product product) {
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
