package com.facebook.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	
	public List<Facebook> sortf(String field)
	{
		return frep.findAll(Sort.by(Direction.DESC,field)) ;
	}

	public Facebook updatef(Facebook m, int id) {
		Optional <Facebook> opt = frep.findById(id) ;
		Facebook obj = null;
		if(opt.isPresent()) {
			obj=opt.get();
			frep.saveAndFlush(m);
			}
		return obj;
	}
// page return
//	public Page<Facebook> paging(int offset, int pagesize) {
//		PageRequest paging = PageRequest.of(offset, pagesize) ;
//		return frep.findAll(paging) ;
//	}
//  page --> List return
	public List<Facebook> paging(int offset, int pagesize) {
		PageRequest paging = PageRequest.of(offset, pagesize) ;
		Page<Facebook> fdata = frep.findAll(paging) ;
		List<Facebook> bList = fdata.getContent() ;
		return bList ;
	}
//	List return
//	public List<Facebook> paging(int offset, int pagesize) {
//		PageRequest paging = PageRequest.of(offset, pagesize) ;
//		return frep.findAll(paging) ;
//	}

}
