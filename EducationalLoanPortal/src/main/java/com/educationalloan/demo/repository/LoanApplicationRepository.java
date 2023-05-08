package com.educationalloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationalloan.demo.model.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository <LoanApplication,Integer>{

}
