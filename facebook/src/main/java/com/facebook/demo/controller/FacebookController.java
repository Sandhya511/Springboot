package com.facebook.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.demo.model.Facebook;
import com.facebook.demo.service.FacebookService;

@RestController
public class FacebookController {
	@Autowired
	FacebookService fServ ;
	@GetMapping(value="/")
	public List<Facebook> getAll()
	{
		List<Facebook> fList = fServ.getAll() ;
		return fList ;
	}
	@PostMapping(value="/save")
	public Facebook saveAll(@RequestBody Facebook k)
	{
		return fServ.saveAll(k) ;
	}
	
	@PutMapping(value="/update")
	public Facebook updateAll(@RequestBody Facebook b)
	{
		return fServ.updateAll(b) ;
	}
	@DeleteMapping(value = "/{id}")
	public void deleteid(@PathVariable("id")int fid)
	{
		fServ.delete(fid);
	}
	

}
