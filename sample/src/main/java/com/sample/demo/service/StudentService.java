package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

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

	public Student updateStudent(Student s, int rno) {
		Optional<Student> optional=studRepository.findById(rno);
		Student obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			studRepository.saveAndFlush(s);
		}
		return obj ;
	}

}
