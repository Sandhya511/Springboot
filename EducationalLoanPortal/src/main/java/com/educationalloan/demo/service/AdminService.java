package com.educationalloan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.educationalloan.demo.model.LoanApplication;

import com.educationalloan.demo.repository.LoanApplicationRepository;



@Service
public class AdminService {

	@Autowired
	LoanApplicationRepository laRep ;

	public List<LoanApplication> getAllLoans() {
		
		return laRep.findAll() ;
	}

	public LoanApplication saveLoan(LoanApplication lj) {
		
		return laRep.save(lj) ;
	}
	

	

}
