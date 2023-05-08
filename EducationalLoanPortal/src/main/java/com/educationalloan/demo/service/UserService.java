package com.educationalloan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationalloan.demo.model.LoanApplication;
import com.educationalloan.demo.model.User;
import com.educationalloan.demo.repository.LoanApplicationRepository;
import com.educationalloan.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository uRep ;
	@Autowired
	LoanApplicationRepository laRep ;

	public List<User> getUserDetails() {
		return uRep.findAll() ;
	}

	public String validateUser(String email, String password) {
		User u = uRep.findByEmail(email);
		if(u == null)
		{
			return" No user found " ;
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}

	public LoanApplication getLoan(int loanId) {
		LoanApplication l = laRep.findById(loanId).get() ;
	  	   return l;
		
	}

	public User saveUser(User u, int id) {
		return uRep.save(u) ;
	
	}

	public void deleteUser(int id) {
		uRep.deleteById(id);
		
	}

	public User addUser(User j) {
		
		return uRep.save(j);
	}

	
}
