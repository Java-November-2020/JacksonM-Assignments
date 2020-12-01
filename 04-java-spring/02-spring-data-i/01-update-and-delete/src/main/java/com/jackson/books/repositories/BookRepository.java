package com.jackson.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackson.books.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	//Find all Books in the database
	List<Book> findAll();
	
	//Find all the books by description
	List<Book> findByDescriptionContaining(String search);
	
	//Counts on how many titles contain a certain string
	Long countByTitleContaining(String search);
	
	//Deletes a book that starts with a specific title
	Long deleteByTitleStartingWith(String search);
}
