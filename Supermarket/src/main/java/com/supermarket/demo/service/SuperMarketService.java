package com.supermarket.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.supermarket.demo.model.Supermarket;
import com.supermarket.demo.repository.SuperMarketRepository;

import jakarta.transaction.Transactional;

//import jakarta.transaction.Transactional;
@Service
public class SuperMarketService {
	@Autowired
	SuperMarketRepository smRep ;
	
	// CRUD operations
	public List<Supermarket> getAll() {
		List<Supermarket> smList = smRep.findAll() ;
		return smList;
	}

	public Supermarket saveSM(Supermarket s) {
		return smRep.save(s);
	}

	public Supermarket updateSM(Supermarket m) {
		return smRep.save(m);	
	}
	
	public void deleteSM(int pId) {
		smRep.deleteById(pId);	
	}

	//sorting and paging
	
	public List<Supermarket> sortMarket(String field) {
		//return smRep.findAll(Sort.by(field)) ;
		return smRep.findAll(Sort.by(Direction.DESC, field)) ;
	}
	
	public List<Supermarket> pagings(int offset, int size) {
		Page<Supermarket> smpage = smRep.findAll(PageRequest.of(offset, size)) ;
		return smpage.getContent();
	}

	public List<Supermarket> pagingsort(int offset, int size, String field) {
		Page<Supermarket> smpagesort = smRep.findAll(PageRequest.of(offset, size,Sort.by(field))) ;
		return smpagesort.getContent();
	}
	
	// JPA Queries
	public List<Supermarket> fetchProdByPrefix(String prefix) {
		return smRep.findByNameStartingWith(prefix);
	}

	public List<Supermarket> fetchProdBySuffix(String suffix) {
		return smRep.findByNameEndingWith(suffix);
	}
	
	public List<Supermarket> getProdByBrand(String brand, String name) {
		return smRep.getProdByBrand(brand,name);
	}
	
	// Native Query
	public List<Supermarket> fetchByBrand(String brand) {
		return smRep.fetchByBrand(brand);
	}
	
	//DML Queries
	
	@Transactional
	public int deleteProdByName(String name) {
		return smRep.deleteProdByName(name);
	}
	@Transactional
	public int updateProdByName(String brand, String name) {
		return smRep.updateProdByName(brand, name);
		
	}

}
