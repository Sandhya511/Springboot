package com.supermarket.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supermarket.demo.model.Store;



@Repository
public interface ManagerRepository extends JpaRepository<Store,Long>{

}
