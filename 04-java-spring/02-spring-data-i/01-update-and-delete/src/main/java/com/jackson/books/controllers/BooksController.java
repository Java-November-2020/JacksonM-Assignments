package com.jackson.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jackson.books.model.Book;
import com.jackson.books.services.BookService;

@Controller
public class BooksController {
	@Autowired
	private BookService bservice;
	
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> books = this.bservice.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
	@GetMapping("/books/my/")
	public String my(Model model) {
		List<Book> books = this.bservice.myBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
	@GetMapping("/books/{index}")
	public String findBookByIndex(Model viewModel, @PathVariable("index") int index) {
		Book book = this.bservice.findBookByIndex(index);
		viewModel.addAttribute("book", book);
		return "showBook.jsp";
	}
	
	@GetMapping("/mybooks/{id}")
	public String findBookByIndex(Model viewModel, @PathVariable("id") Long id) {
		Book book = this.bservice.findBook(id);
		viewModel.addAttribute("book", book);
		return "showBook.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute ("book") Book book) {
		return "new.jsp";
	}
	
	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		}else {
			this.bservice.createBook(book);
			return "redirect:/books";
		}
	}
	
	@GetMapping("/books/edit/{id}")
	public String editBook(@PathVariable("id")int id, Model model){
		Book book = this.bservice.findBookByIndex(id);
		if (book!=null) {
			model.addAttribute("book", book);
			return "editBook.jsp";
		}else {
			return "redirect:/books/";
		}
	}
	
    @PostMapping("/books/edit/{id}")
    public String updateBook(@PathVariable("id") int id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "editBook.jsp";
        }else{
            this.bservice.updateBook(id, book);
            return "redirect:/books/";
        }
    }
    
    @RequestMapping(value="/books/delete/{id}")
    public String destroyBook(@PathVariable("id") int id) {
    	this.bservice.destroyBook(id);
    	return "redirect:/books";
    }

}
