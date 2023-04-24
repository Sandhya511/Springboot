package com.instagram.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstagramLoginController {
	@GetMapping("/hello")
	public String hello()
	{
		return "HELLO FROM INSTAGRAM ! " ;
	}
	@GetMapping("/login")
	public String login(@RequestParam String username ,@RequestParam String password)
	{
		if(username.equals("Sandhya")&&password.equals("san123"))
		{
			return "Login Successful ! " ;
		}
		else
		{
			return "Login Failed ! Enter correct username and password " ;
		}
	}
	@GetMapping("/post/{uname}")
	public String getPost(@PathVariable ("uname") String uname)
	{
		return "This post is from "+uname ;
	}

}
