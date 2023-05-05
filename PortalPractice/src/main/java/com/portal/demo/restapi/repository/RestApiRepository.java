package com.portal.demo.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.demo.restapi.model.RestApi;

@Repository
public interface RestApiRepository extends JpaRepository <RestApi,Integer>{

}
