package com.supermarket.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.demo.model.User;
import com.supermarket.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRep ;
	
	public String checkLogin(String uname,String pwd)
	{
		User u = userRep.findByuname(uname) ;
		if(u == null)
		{
			return" No user found " ;
		}
		else
		{
			if(u.getPwd().equals(pwd))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}
	
	public User addUser(User m)
	{
		return userRep.save(m) ;
	}
	
	public List<User> getUser()
	{
		return userRep.findAll() ;
	}

	public User updateUser(User us, int id) {
		Optional<User> optional = userRep.findById(id) ;
		User obj =null;
		if(optional.isPresent())
		{
			obj = optional.get();
			userRep.save(us) ;
		}
		return obj;
	}

}
