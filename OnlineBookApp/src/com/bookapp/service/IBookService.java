package com.bookapp.service;


import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

	List<Book> getAllBooks();
	List<Book> getByAuthor(String author) throws BookNotFoundException;
	List<Book> getCategortLessPrice(String category, double price) throws BookNotFoundException;
	Book getById(int bookId) throws BookNotFoundException;
	List<Book> getByTitleContains(String title) throws BookNotFoundException;
}
