package com.restapi.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
	
	@Autowired
	@GetMapping("/students/{studentId}/courses")

}
