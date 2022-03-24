package com.ba.dao;

import org.springframework.data.repository.CrudRepository;

import com.ba.entity.Book;

public interface BookDao extends CrudRepository<Book, Integer> {
	

}
