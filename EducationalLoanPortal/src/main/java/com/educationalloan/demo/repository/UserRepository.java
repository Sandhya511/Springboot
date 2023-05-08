package com.educationalloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalloan.demo.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	User findByEmail(String email);

}
