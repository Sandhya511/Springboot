package com.portal.demo.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.demo.restapi.model.RestApi;
import com.portal.demo.restapi.repository.RestApiRepository;

@Service
public class RestApiService {
	
	@Autowired
	
	RestApiRepository raRep ;

	public List<RestApi> getCourse() {
		List<RestApi> sList = raRep.findAll() ;
		return sList;
	}

	public List<RestApi> getStud() {
		List<RestApi> cList = raRep.findAll() ;
		return cList;
	}

}
