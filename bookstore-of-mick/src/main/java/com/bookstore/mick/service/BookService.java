package com.bookstore.mick.service;

import java.util.List;

import com.bookstore.mick.domain.Book;

public interface BookService {
List<Book>findAll();
Book findOne(Long id);
}
