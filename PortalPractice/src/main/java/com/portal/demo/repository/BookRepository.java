package com.portal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.demo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
