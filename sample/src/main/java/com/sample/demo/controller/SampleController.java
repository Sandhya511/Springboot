package com.sample.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController {
	@GetMapping("/loginpage")
	public String loginpage() 
	{
		return "HELLO LOGIN" ;
	}
	 @GetMapping("/landingpage/{username}")
	public String landingpage(@PathVariable("username") String username)
	{
		 return "HELLO Landingpage of " + username ;
	}
	 @GetMapping("/getpost")
	public String getPost(@RequestParam String username)
	{
		return "This is the Post of " + username ;
	}
	
	 @GetMapping("/login")
	public String getLogin(@RequestParam String username,@RequestParam String password)
	{
		 if(username.equals("admin")&&password.equals("12345"))
		 {
			 return "Login Successful!" ;
		 }
		 else
		 {
			 return "Login Failed ! Please check your username and password. " ;
		 }
	}
	 
}

