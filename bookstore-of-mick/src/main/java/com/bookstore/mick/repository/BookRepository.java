package com.bookstore.mick.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.mick.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
