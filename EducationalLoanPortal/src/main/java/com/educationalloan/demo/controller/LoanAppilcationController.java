package com.educationalloan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educationalloan.demo.model.LoanApplication;
//import com.educationalloan.demo.model.LoanApplication;
import com.educationalloan.demo.service.LoanApplicationService;

@RestController
public class LoanAppilcationController {
	
	@Autowired
	LoanApplicationService laServ ;
	
	@PutMapping("/updateloan/{id}")
	public LoanApplication updateLoan(@RequestBody LoanApplication l,@PathVariable int id)
	{
		return laServ.updateLoan(l,id) ;
	}
	
	@DeleteMapping("/deleteloanbyid/{id}")
	public void deleteLoanApplication(@PathVariable int id)
	{
		laServ.deleteLoanApplication(id) ;
	}
	
	

}
