package com.bill.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

}
