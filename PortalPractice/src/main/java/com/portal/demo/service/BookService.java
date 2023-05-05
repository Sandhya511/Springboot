package com.portal.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.demo.model.Book;
import com.portal.demo.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bRep ;

	public List<Book> getAll() {
		List<Book> b = bRep.findAll() ;
		return b;
	}

	public Optional<Book> getById(int bookId) {
		Optional<Book> j = bRep.findById(bookId);
		return j;
	}

	public Book saveBook(Book v) {
		
		return bRep.save(v);
	}

	public Book updateBook(Book k) {
		return bRep.save(k);
	}

	public void deleteBook(int bookId) {
		bRep.deleteById(bookId);
		
	}
	

}
