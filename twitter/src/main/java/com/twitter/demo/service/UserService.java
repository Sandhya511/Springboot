package com.twitter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitter.demo.model.User;
import com.twitter.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRep ;
	
	public List<User> getAll()
	{
		List<User> userList = userRep.findAll();
		return userList ;
	}

	public User saveUser(User u) {
		
		return userRep.save(u);
	}
	
	public User updateUser(User v) {
		
		return userRep.save(v) ;
	}

	public void deleteUser(int twId) {
		userRep.deleteById(twId);
		
	}

}
