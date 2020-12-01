package com.jackson.books.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.books.model.Book;
import com.jackson.books.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bRepo;
	
    // initialize the books variable with values
    private List<Book> books = new ArrayList<Book>(Arrays.asList(
            new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
            new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
            new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
            new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
            new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
            ));
    
	
	//Return all books
	public List<Book> allBooks(){
		return books;
	}
	
	public List<Book> myBooks(){
		return this.bRepo.findAll();
	}
	
	//Create a book
	public Book createBook(Book b) {
		return this.bRepo.save(b);
	}
	
	//Retrieves a book
	public Book findBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	//Find Book by Index
	public Book findBookByIndex(int index) {
		if (index < books.size()) {
			return books.get(index);
		}
		else {
			return null;
		}
	}
	
	//Update the Book Record
    public void updateBook(int id, Book book) {
        if (id < books.size()){
            books.set(id, book);
        }
    }
    
    //Delete the book record using index
    public void destroyBook(int id) {
    	if(id<books.size()) {
    		books.remove(id);
    	}
    }
    
    //Update a book from API
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Book updatedBook = this.bRepo.findById(id).orElse(null);
    	updatedBook.setLanguage(lang);
    	updatedBook.setDescription(desc);
    	updatedBook.setTitle(title);
    	updatedBook.setNumberOfPages(numOfPages);
    	return this.bRepo.save(updatedBook);
    }
    
    //Delete a book from API
    public void deleteBook(Long id) {
    	this.bRepo.deleteById(id);
    }
}


