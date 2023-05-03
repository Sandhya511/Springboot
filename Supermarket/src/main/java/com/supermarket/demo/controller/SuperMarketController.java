package com.supermarket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.supermarket.demo.model.Supermarket;
import com.supermarket.demo.service.SuperMarketService;

@RestController
public class SuperMarketController {
	@Autowired
	SuperMarketService smServ;
	
	@GetMapping(value="/smdata")
	public List<Supermarket> getAll()
	{
		List<Supermarket> smList = smServ.getAll() ;
		return smList ;
	}
	
	@PostMapping(value="/savedata")
	public Supermarket saveSM(@RequestBody Supermarket s)
	{
		return smServ.saveSM(s) ;
	}
	
	@PutMapping(value="/updatedata")
	public Supermarket updateSM(@RequestBody Supermarket m)
	{
		return smServ.saveSM(m) ;
	}
	
	@DeleteMapping(value="/deletedata/{id}")
	public void deleteSM(@PathVariable("id")int pId)
	{
		smServ.deleteSM(pId) ;
	}
	
	@GetMapping(value="/sortpage/{field}")
	public List<Supermarket> sortMarket(@PathVariable String field)
	{
		return smServ.sortMarket(field) ;
	}
	@GetMapping(value="page/{offset}/{size}")
	
	public List<Supermarket> pagings(@PathVariable("offset") int offset,@PathVariable("size")int size)
	{
		return smServ.pagings(offset,size) ;
	}
	
	@GetMapping(value="pageandsort/{offset}/{size}/{field}")
	
	public List<Supermarket> pagingsort(@PathVariable("offset") int offset,@PathVariable("size") int size,@PathVariable("field")String field)
	{
		return smServ.pagingsort(offset,size,field) ;
	}
	
	
	
	//query
	//http://localhost:8080/fetchStudentsByDepartment/ECE/Minu
	@GetMapping("/fetchprodbybrand/{brand}/{name}")
	public List<Supermarket> getProdByBrand(@PathVariable String brand,@PathVariable String name)
	{
		return smServ.getProdByBrand(brand,name);
	}
	
	@DeleteMapping("/deletebyname/{name}")
	public String deleteProdByName(@PathVariable  String name)
	{
		int result = smServ.deleteProdByName(name) ;
		if(result>0)
			return "product deleted" ;
		else
			return "problem occured while deleting" ;
		
	}
	
	@PutMapping("/updatebyname/{brand}/{name}")
	public String updateProdByName(@PathVariable String brand,@PathVariable String name)
	{
		int res = smServ.updateProdByName(brand,name) ;
		//System.out.println("result="+res);
		if (res>0)
			return "Product updated" ;
		else
			return "Product update failed" ;
	}
	@GetMapping("/fetchbybrand/{brand}")
	public List<Supermarket> fetchBrand(@PathVariable String brand)
	{
		return smServ.fetchBrand(brand) ;
	
	}
	

}
