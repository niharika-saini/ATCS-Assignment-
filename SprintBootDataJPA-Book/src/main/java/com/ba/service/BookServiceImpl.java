package com.ba.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ba.dao.BookDao;
import com.ba.entity.Book;


@Service
@Transactional
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookDao dao;

	@Override
	public Book addBook(Book book) {
		
		return dao.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		
		return dao.save(book);
	}

	@Override
	public void deleteBook(int bid) {
		
		dao.deleteById(bid);
	}

	@Override
	public Optional<Book> getBook(int bid) {
		
		return dao.findById(bid);
	}

	@Override
	public Iterable<Book> getAllBook() {
		
		return dao.findAll();
	}
	

}
