package com.jackson.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.books.model.Book;
import com.jackson.books.services.BookService;

@RestController
public class BooksApi {
	private BookService bService;
	public BooksApi(BookService service) {
		this.bService = service;
	}
	
	//See all the books
	@GetMapping("/api/books")
	public List<Book> index() {
		return this.bService.myBooks();
	}
	
	//Create a book
	@PostMapping("/api/books")
	public Book create(@RequestParam(value="title") String title, @RequestParam(value="description")String description, @RequestParam(value="language")String language, @RequestParam(value="numberOfPages")int numberOfPages) {
		Book book = new Book(title, description, language, numberOfPages);
		return this.bService.createBook(book);
	}
	
	//Find the book
	@GetMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		return this.bService.findBook(id);
	}
	
	@PutMapping(value="/api/books/{id}")
	public Book update(@PathVariable("id") Long id, @RequestParam("title") String title, @RequestParam("description") String desc, @RequestParam("language")String lang, @RequestParam("numberOfPages") int numOfPages) {
		Book book = this.bService.updateBook(id, title, desc, lang, numOfPages);
		return book;
	}
	
	@DeleteMapping(value="/api/books/{id}")
	public void destroy(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
	}

}
