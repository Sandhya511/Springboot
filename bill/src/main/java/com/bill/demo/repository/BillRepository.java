package com.bill.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bill.demo.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill,Integer> {

	
	

}
