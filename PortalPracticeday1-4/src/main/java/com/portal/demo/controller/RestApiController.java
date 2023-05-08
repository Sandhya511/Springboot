package com.portal.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.portal.demo.model.RestApi;
import com.portal.demo.service.RestApiService;


@RestController
public class RestApiController {
	@Autowired 
	
	RestApiService raServ ;
	
	@GetMapping("/students/{studentId}/course")
	public List<RestApi> getCourse(@PathVariable int studentId)
	{
		List<RestApi> cList = raServ.getCourse() ;
		return cList ;
			
	}
	
	@GetMapping("/students/{studentId}/course/{courseId}")
	public List<RestApi> getStud(@PathVariable int studentId,@PathVariable int courseId)
	{
		List<RestApi> sList = raServ.getStud() ;
		return sList ; 
	}
	

}
