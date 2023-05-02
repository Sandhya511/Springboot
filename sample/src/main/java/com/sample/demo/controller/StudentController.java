package com.sample.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.model.Student;
import com.sample.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studService;
	
	@GetMapping(value = "/students")
	public List<Student> getAllStudents()
	{
		List<Student> studList = studService.getAllStudents();
		return studList ;
	}
	
	@PutMapping(value="/updatestudent/{rno}")
	public Student updateStudent(@RequestBody Student s,@PathVariable int rno)
	{
		return studService.updateStudent(s,rno) ;
	}
}
	