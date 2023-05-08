package com.educationalloan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educationalloan.demo.model.LoanApplication;
import com.educationalloan.demo.model.Login;
import com.educationalloan.demo.model.User;
import com.educationalloan.demo.service.LoanApplicationService;
import com.educationalloan.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService uServ ;
	@Autowired
	LoanApplicationService laServ ;
	
	@GetMapping("/getprofile")
	public List <User>getUserDetails()
	{
		List<User> userList = uServ.getUserDetails();
		return userList ;
	}
	
	@PostMapping("/userlogin")
	public String validateUser(@RequestBody Login logindata )
	{
		
		return uServ.validateUser(logindata.getEmail(),logindata.getPassword());
		
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User j)
	{
		return uServ.addUser(j) ;
	}
	@GetMapping(value="/getloan/{loanId}")
    public  LoanApplication getLoan(@PathVariable int loanId)
    {
    	return uServ.getLoan(loanId);
    }
	
	@PutMapping("/updateuser/{id}")
	public User updateUser(@RequestBody User u,@PathVariable int id)
	{
		return uServ.saveUser(u,id) ;
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable int id)
	{
		uServ.deleteUser(id) ;
	}
	
}
