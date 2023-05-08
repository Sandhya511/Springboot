package com.educationalloan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.educationalloan.demo.model.LoanApplication;
import com.educationalloan.demo.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService aServ ;
	
	@GetMapping("/getAllLoans")
	public List <LoanApplication> getAllLoans()
	{
		List <LoanApplication> aList = aServ.getAllLoans();
		return aList ;
	}
	@PostMapping("/saveLoans")
	public LoanApplication saveLoan(@RequestBody LoanApplication lj)
	{
		return aServ.saveLoan(lj);
	}
	
	
	

}
