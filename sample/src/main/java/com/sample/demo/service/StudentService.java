package com.sample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.dao.StudentRepository;
import com.sample.demo.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentRepository studRepository ;
	
	public List<Student> getAllStudents()
	{
		List<Student>studList=studRepository.findAll();
		return studList;
	}

}
