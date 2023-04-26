package com.twitter.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.demo.model.User;
import com.twitter.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userServ;
	@GetMapping(value="/user")
	public List<User> getAll()
	{
		List <User> userList = userServ.getAll();
		return userList ;
	}
	
	@PostMapping(value="/saveuser")
	public User saveUser(@RequestBody User u)
	{
		return userServ.saveUser(u) ;
	}
	
	@PutMapping(value="/updateuser")
	public User updateUser(@RequestBody User v)
	{
		return userServ.saveUser(v);
	}
	
	@DeleteMapping(value="/deleteuser/{id}")
	
	public void deleteUser(@PathVariable("id")int twId )
	{
		userServ.deleteUser(twId) ;
	}
	
	@GetMapping("/sortuser/{field}")
	public List<User> sortUser(@PathVariable String field)
	{
		return userServ.sortUser(field) ;
	}
	

}
