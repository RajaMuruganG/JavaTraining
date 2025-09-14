package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

	//by admin
	   void addBook(Book book);
	   void updateBook(int bookId, double price);
	   void deleteBook(int bookId);
	   Book getById(int bookId) throws BookNotFoundException;
	   
	   //by user
	   List<Book> getAllBooks() throws BookNotFoundException;
	   List<Book> getByAuthor(String author) throws BookNotFoundException;
	   List<Book> getByCategoryLessPrice(String category, double price) throws BookNotFoundException;
	   List<Book> getByTitleContains(String title) throws BookNotFoundException;
	   
}
