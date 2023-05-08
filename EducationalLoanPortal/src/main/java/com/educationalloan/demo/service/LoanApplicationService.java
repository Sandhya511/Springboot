package com.educationalloan.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationalloan.demo.model.LoanApplication;
import com.educationalloan.demo.repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {
	@Autowired
	LoanApplicationRepository laRep ;

	public LoanApplication updateLoan(LoanApplication l, int id) {
		return laRep.save(l) ;
	}

	public void deleteLoanApplication(int id) {
		laRep.deleteById(id);
		
	}
	
	

}
