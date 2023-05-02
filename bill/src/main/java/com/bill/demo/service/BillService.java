package com.bill.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	

//	public List<Bill> paging(int offset, int pagesize) {
//		PageRequest paging = PageRequest.of(offset, pagesize) ;
//		Page<Bill> fdata = bRep.findAll(paging) ;
//		List<Bill> bList = fdata.getContent() ;
//		return bList ;
//		
//	}
	public List<Bill> pagings(int num, int size)
	{
	    Page<Bill> obj= bRep.findAll(PageRequest.of(num,size));
	    return obj.getContent();
}
//	public List<Bill> pagingsort(int num, int size, String name)
//	{
//	    Page<Bill> obj= bRep.findAll(PageRequest.of(num, size, Sort.by(name)));
//	    return obj.getContent();
//	}

	public List<Bill> pagingsort(int num, int size, String name)
	{
		PageRequest obj =PageRequest.of(num, size).withSort(Sort.by(name)) ;
	    Page<Bill> obje= bRep.findAll(obj);
	    return obje.getContent();
	}
	
	public List<Bill> getProductsByPrefix(String prefix)
	{
		return bRep.findByNameStartingWith(prefix);
	}
	

}
