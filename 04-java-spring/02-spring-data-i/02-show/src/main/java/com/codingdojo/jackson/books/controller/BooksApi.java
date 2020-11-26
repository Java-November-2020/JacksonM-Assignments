package com.codingdojo.jackson.books.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.jackson.books.models.Book;
import com.codingdojo.jackson.books.services.BookService;

@RestController
public class BooksApi {
	
	private BookService bService;
	
	public BooksApi(BookService bservice) {
		this.bService = bservice;
	}
	
	//Get all the books
	@RequestMapping("/api/books")
	public List<Book> index() {
		return this.bService.getAllBooks();
	}
	
	//Add a new book
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	public Book create(Book book) {
		return this.bService.createBook(book);
	}
	
	//Get a specific book
	@RequestMapping("/api/books/{id}")
	public Book getBook(@PathVariable("id") Long id) {
		return this.bService.findBook(id);
	}
	

}
