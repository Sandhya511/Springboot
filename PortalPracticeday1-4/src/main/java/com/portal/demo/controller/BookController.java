package com.portal.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portal.demo.model.Book;
import com.portal.demo.service.BookService;


@RestController
public class BookController {
	@Autowired
	
	BookService bServ;
	
	@GetMapping("/book")
	public List<Book> getAll()
	{
		List<Book> b = bServ.getAll() ;
		return b ;
		
	}
	@GetMapping("/book/{bookId}")
	public Optional<Book> getById(@PathVariable int bookId)
	{
		Optional<Book> j = bServ.getById(bookId) ;
		return j ;
	}
	
	@PostMapping(value="/savebook")
	public Book saveBook(@RequestBody Book v)
	{
		return bServ.saveBook(v);
	}
	
	@PutMapping(value = "/books")
	public Book updateBook(@RequestBody Book k)
	{
		return bServ.updateBook(k) ;
	}
	@DeleteMapping("/book/{bookId}")
	public void deleteBook(@PathVariable int bookId )
	{
		bServ.deleteBook(bookId) ;
	}
	

}
