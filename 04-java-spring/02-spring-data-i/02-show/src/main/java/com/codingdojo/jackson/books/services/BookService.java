package com.codingdojo.jackson.books.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.jackson.books.models.Book;
import com.codingdojo.jackson.books.repositories.BookRepository;

@Service

public class BookService {
	
	private BookRepository bRepo;
	
	public BookService (BookRepository brepo) {
		this.bRepo = brepo;
	}
	
	//Return all the books
	public List<Book> getAllBooks() {
		return this.bRepo.findAll();
	}
	
	//Create a book
	public Book createBook(Book book) {
		return this.bRepo.save(book);
	}
	
	//Retrieve a book
	public Book findBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	    

}
