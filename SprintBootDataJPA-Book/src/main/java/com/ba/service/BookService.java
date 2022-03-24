package com.ba.service;

import java.util.Optional;

import com.ba.entity.Book;

public interface BookService {
	
	Book addBook(Book book);
	
	Book updateBook(Book book);
	
	void  deleteBook(int bid);
	
	Optional<Book> getBook(int bid);
	
	Iterable<Book> getAllBook();

}
