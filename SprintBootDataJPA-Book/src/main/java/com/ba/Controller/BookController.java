package com.ba.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ba.entity.Book;
import com.ba.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService service;
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
		
	}
	
	
	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return service.updateBook(book);
		
	}
	
	@GetMapping("/getBook/{id}")
	public Optional<Book> getBook(@PathVariable("id") int bid) {
		return service.getBook(bid);
		
	}
	
	@GetMapping("/GetAllBook")
	public Iterable<Book> getAllBook() {
		return service.getAllBook();
		
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public void  deleteBook(@PathVariable("id") int bid) {
		service.deleteBook(bid);
		
	}

}
