package com.bookapp;

import java.util.List;
import java.util.Scanner;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class OnlineBookMain {

	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		System.out.println("Book List");
		System.out.println("---------");
		bookService.getAllBooks().stream().forEach(book -> System.out.println(book));
		System.out.println("---------");
		System.out.println("To get list of books by Author");
		System.out.println("Enter Author Name: ");
		Scanner scanner = new Scanner(System.in);
		String authorName = scanner.next();
		try {
			bookService.getByAuthor(authorName).stream().forEach(book-> System.out.println(book));
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------");
		System.out.println("To get list of books, based on category with price range");
		System.out.println("Enter Category Name: ");
		String category = scanner.next();
		System.out.println("Enter Price Range: ");
		double bookPrice = scanner.nextDouble();
		
		try {
			bookService.getCategortLessPrice(category, bookPrice)
			.stream()
			.forEach(book -> System.out.println(book));
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------");
		
		System.out.println("To get list of books, based on Book Id");
		int bookId = scanner.nextInt();
		try {
			System.out.println(bookService.getById(bookId));
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------");
		System.out.println("To get list of books by Book Name");
		System.out.println("Enter Book Name:");
		String bookName = scanner.next();
		
		try {
			bookService.getByTitleContains(bookName)
			.stream()
			.forEach(book-> System.out.println(book));
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
