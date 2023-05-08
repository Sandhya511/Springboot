package com.portal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.demo.model.RestApi;

@Repository
public interface RestApiRepository extends JpaRepository <RestApi,Integer>{

}
