package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.form.LoginForm;
import com.example.demo.form.SearchForm;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public User user;
	
	@Autowired
	public ProductService productService;
	
	public List<Product> list = new ArrayList<Product>(); 
	
	@RequestMapping("/index")
	public String index(Model model) {
		return "index";
		
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
		
	}
	
	 @RequestMapping(value="/menu") 
	 public String munu(
			 @ModelAttribute("login") LoginForm loginForm,
			 @ModelAttribute("search") SearchForm searchForm, 
			 Model model) {
		 
		 String id = loginForm.getLoginId();
		 String pass = loginForm.getPassword();
		 user = userService.login(id, pass);
		 list = productService.getAll();
		 
		 if (user == null) {
			 model.addAttribute("msg", "IDとPASSが違います");
			 return "login";
			 
		 } else {
			 model.addAttribute("loginUser", user);
			 model.addAttribute("result", list);
			 searchForm.setKeyWord("キーワード検索");
			 return "menu";
		 }
		 
	}
	 
}
