package com.bill.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bill.demo.model.Bill;
import com.bill.demo.service.BillService;


@RestController
public class BillController {
	@Autowired
	BillService bServ ;
	@GetMapping(value="/bill")
	public List<Bill>getAll()
	{
		List<Bill> billList = bServ.getAll() ;
		return billList ;
	}
	
	@PostMapping(value="/savebill")
	public Bill saveBill(@RequestBody Bill b)
	{
		return bServ.saveBill(b) ;
	}
	
	@PutMapping(value="/updatebill")
	public Bill updateBill(@RequestBody Bill v)
	{
		return bServ.saveBill(v) ;
	}
	
	@DeleteMapping(value="/deletebill/{id}")
	
	public void deleteBill(@PathVariable("id")int pId)
	{
		bServ.deleteBill(pId) ;
	}
	
//	@GetMapping("pagef/{offset}/{pagesize}/")
	
//	public List<Bill> paging(@PathVariable int offset,@PathVariable int pagesize)
//	{
//		return bServ.paging(offset,pagesize) ;
//	}
	
    @GetMapping("page/{num}/{size}")
	
	public List<Bill> pagings(@PathVariable("num") int num,@PathVariable("size") int size)
	{
		return bServ.pagings(num,size) ;
	}
    @GetMapping("page/{num}/{size}/{name}")
	
   	public List<Bill> pagingsort(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name") String name)
   	{
   		return bServ.pagingsort(num,size,name) ;
   	}
    //http://localhost:8080/prefix?prefix=c
    @GetMapping("/{prefix}")
    public List<Bill> getByPrefix(@RequestParam String prefix)
    {
    	return bServ.getProductsByPrefix(prefix) ;
    }
	

}
