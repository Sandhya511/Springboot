package com.twitter.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitter.demo.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
