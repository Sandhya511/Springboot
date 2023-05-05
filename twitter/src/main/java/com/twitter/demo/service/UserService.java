package com.twitter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
//
//	public List<User> sortUser(String field) {
//		return userRep.findAll(Sort.by(field));
//		
//	}

	public List<User> sortp(String field) {
		
		//return userRep.findAll(Sort.by(field));
			return userRep.findAll(Sort.by(Direction.DESC, field)) ;
	}

	public List<User> pager(int offset, int size) {
		Page<User> pg = userRep.findAll(PageRequest.of(offset, size)) ;
		return pg.getContent();
	}
	
}
