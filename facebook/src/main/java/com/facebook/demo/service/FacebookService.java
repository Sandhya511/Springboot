package com.facebook.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.demo.model.Facebook;
import com.facebook.demo.repository.FacebookRepository;
@Service
public class FacebookService {
	@Autowired
	FacebookRepository frep ;
	public List<Facebook> getAll() {
		List<Facebook> fout= frep.findAll();
		return fout;
	}

	public Facebook saveAll(Facebook k) {
		// TODO Auto-generated method stub
		return frep.save(k);
	}

	public Facebook updateAll(Facebook b) {
		// TODO Auto-generated method stub
		return frep.save(b);
	}

	public void delete(int fid) {
		frep.deleteById(fid);
		
	}

}
