package com.facebook.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facebook.demo.model.Facebook;

@Repository
public interface FacebookRepository extends JpaRepository <Facebook,Integer>{

}
