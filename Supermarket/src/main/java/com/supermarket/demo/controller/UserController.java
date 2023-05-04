package com.supermarket.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.demo.model.User;
import com.supermarket.demo.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController

public class UserController {
	@Autowired
	 UserService userServ ;
	
	@Tag(name = "User Login")
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String uname = loginData.get("uname") ;
		String password = loginData.get("pwd") ;
		String result = userServ.checkLogin(uname, password) ;
		return result ;
	}
	
	@Tag(name = "Add User")
	@PostMapping("/adduser")
	public User addUser(@RequestBody User m)
	{
		return userServ.addUser(m) ;
	}
	
	@Tag(name = "User Details")
	@GetMapping("/add")
	public List<User> listAll()
	{
		return userServ.getUser() ;
	}
	
	@Tag(name = "Update User")
	@PutMapping(value="/put/{id}")
	public User updateUser(@RequestBody User us,@PathVariable int id)
	{
		return userServ.updateUser(us,id) ;
	}
	

}
