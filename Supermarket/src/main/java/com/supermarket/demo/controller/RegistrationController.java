package com.supermarket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.demo.model.Registration;
import com.supermarket.demo.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationService regServ ;
	
	@PostMapping("/registereduser")
	public Registration saveRegistration(@RequestBody Registration r)
	{
		return regServ.saveRegistration(r) ;
	}
	
	@GetMapping("/fetchalldata")
	public List<Registration> getAllUsers()
	{
		List<Registration> smList = regServ.getAllUsers();
		return smList ;
	}
	

}
