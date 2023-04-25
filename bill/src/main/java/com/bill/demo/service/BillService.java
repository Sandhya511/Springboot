package com.bill.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.demo.model.Bill;
import com.bill.demo.repository.BillRepository;


@Service
public class BillService {
	@Autowired
	BillRepository bRep ;
	
	public List<Bill> getAll()
	{
		List<Bill> billList = bRep.findAll();
		return billList ;
	}

	public Bill saveBill(Bill b) {
		return bRep.save(b) ;	
	}
	
	public Bill updateBill(Bill v) {
		
		return bRep.save(v) ;
	}

	public void deleteBill(int pId) {
		bRep.deleteById(pId);
		
	}
	

}
