package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookUtil;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAllBooks() {
		return BookUtil.showAllBooks();
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book> bookList = BookUtil.showAllBooks()
				.stream()
				.filter(book-> book.getAuthor().contains(author))
				.toList();
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("No Books found by that Author");
		}
		return bookList;
	}

	@Override
	public List<Book> getCategortLessPrice(String category, double price) throws BookNotFoundException {

		List<Book> bookList = BookUtil.showAllBooks()
				.stream()
				.filter(book-> book.getCategory().equalsIgnoreCase(category) && book.getPrice()<price)
				.toList();
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("No books found in this category within the selected price range");
		}
		return bookList;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> bookList =  BookUtil.showAllBooks()
				.stream()
				.filter(book-> book.getBookId() == bookId)
				.toList();
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("No Book found for this book id");
		}
		return bookList.get(0);
	}

	@Override
	public List<Book> getByTitleContains(String title) throws BookNotFoundException {
		List<Book> bookList =  BookUtil.showAllBooks()
				.stream()
				.filter(book -> book.getTitle().contains(title))
				.toList();
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("No Books found");
		}
		return bookList;
	}

}
