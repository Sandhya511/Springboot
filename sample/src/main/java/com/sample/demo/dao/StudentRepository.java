package com.sample.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
