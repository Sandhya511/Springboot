package com.supermarket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.demo.model.Manager;
import com.supermarket.demo.service.ManagerService;

@RestController
public class ManagerController {
	@Autowired
	ManagerService mServ ;
	@GetMapping("/fetchallmanager")
	public List<Manager> fetchAllManager()
	{
		return mServ.fetchAllManager() ;
	}
	
	@PostMapping("/savemanager")
	public Manager saveManager(Manager m)
	{
		return mServ.saveManager(m) ;
	}

}
