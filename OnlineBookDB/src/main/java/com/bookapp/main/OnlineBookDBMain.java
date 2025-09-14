package com.bookapp.main;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.util.DBConnection;

public class OnlineBookDBMain {

	public static void main(String[] args) {

		System.out.println("Manage OnlineBook Application");
		

		System.out.println("1. Add New Book");
		System.out.println("2. Update Book");
		System.out.println("3. Delete Book");
		System.out.println("4. Get Book by id");
		System.out.println("5. Get AllBooks");
		System.out.println("6. Get Books by author");
		System.out.println("7. Get Books by category");
		System.out.println("8. Get Books by Title");
		System.out.println("Choose your option to proceed further");
		Scanner scanner = new Scanner(System.in);

		manageBookApp(scanner);
//		int choice = scanner.nextInt();
//		int bookId = 0;
//		switch (choice) {
//		case 1:
//			// Insert New Record
//			bookService.addBook(new Book("Spring", "SpringAuthor", 500, "Tech"));
//			bookService.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 150, "Novels"));
//			bookService.addBook(new Book("1984", "George Orwell", 240, "Novels"));
//			bookService.addBook(new Book("The Alchemist", "Paulo Coelho", 275, "Fiction"));
//			bookService.addBook(new Book("A Brief History of Time", "Stephen", 500, "Science"));
//			bookService.addBook(new Book("Clean Code", "Robert C. Martin", 1500, "Tech"));
//			break;
//		case 2: // update book
//			System.out.println("Enter Book Id");
//			bookId = scanner.nextInt();
//			System.out.println("Enter Book Price");
//			double price = scanner.nextDouble();
//			bookService.updateBook(bookId, price);
//			break;
//		case 3:
//			System.out.println("Enter Book Id");
//			bookId = scanner.nextInt();
//			bookService.deleteBook(bookId);
//			break;
//		case 4:
//			System.out.println("Enter Book Id");
//			bookId = scanner.nextInt();
//			try {
//				Book book = bookService.getById(bookId);
//				System.out.println(book);
//			} catch (BookNotFoundException e) {
//				System.out.println(e.getMessage());
//			}
//			break;
//		case 5:
//			try {
//				List<Book> allBooks = bookService.getAllBooks();
//				allBooks.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
//				allBooks.forEach(book -> System.out.println(book));
//
//			} catch (BookNotFoundException e) {
//				System.out.println(e.getMessage());
//			}
//
//			break;
//		case 6:
//			System.out.println("Enter Author Name to get books");
//			String author = scanner.next();
//			try {
//				List<Book> books = bookService.getByAuthor(author);
//				books.sort((o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
//				books.forEach(book -> System.out.println(book));
//			} catch (BookNotFoundException e) {
//				System.out.println(e.getMessage());
//			}
//			break;
//		case 7:
//			System.out.println("Enter Category Name to get books");
//			String category = scanner.next();
//			System.out.println("Enter books price range");
//			double priceValue = scanner.nextDouble();
//			try {
//				List<Book> books = bookService.getByCategoryLessPrice(category, priceValue);
//				books.sort((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
//				books.forEach(book -> System.out.println(book));
//			} catch (BookNotFoundException e) {
//				System.out.println(e.getMessage());
//			}
//			break;
//		case 8:
//			System.out.println("Enter book title");
//			String bookTitle = scanner.next();
//
//			try {
//				List<Book> books = bookService.getByTitleContains(bookTitle);
//				books.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
//				books.forEach(book -> System.out.println(book));
//			} catch (BookNotFoundException e) {
//				System.out.println(e.getMessage());
//			}
//			break;
//
//		}
//
//		System.out.println("Would you like to proceed further? click y to continue n to end the session");
//
//		String answer = scanner.next();
//		if (answer.equals("y")) {
//			System.out.println("Choose your option to proceed further");
//		} else {
//			scanner.close();
//		}

	}
	
	public static void manageBookApp(Scanner scanner) {
		IBookService bookService = new BookServiceImpl();
		int choice = scanner.nextInt();
		int bookId = 0;
		switch (choice) {
		case 1:
			// Insert New Record
			bookService.addBook(new Book("Spring", "SpringAuthor", 500, "Tech"));
			bookService.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 150, "Novels"));
			bookService.addBook(new Book("1984", "George Orwell", 240, "Novels"));
			bookService.addBook(new Book("The Alchemist", "Paulo Coelho", 275, "Fiction"));
			bookService.addBook(new Book("A Brief History of Time", "Stephen", 500, "Science"));
			bookService.addBook(new Book("Clean Code", "Robert C. Martin", 1500, "Tech"));
			break;
		case 2: // update book
			System.out.println("Enter Book Id");
			bookId = scanner.nextInt();
			System.out.println("Enter Book Price");
			double price = scanner.nextDouble();
			bookService.updateBook(bookId, price);
			break;
		case 3:
			System.out.println("Enter Book Id");
			bookId = scanner.nextInt();
			bookService.deleteBook(bookId);
			break;
		case 4:
			System.out.println("Enter Book Id");
			bookId = scanner.nextInt();
			try {
				Book book = bookService.getById(bookId);
				System.out.println(book);
			} catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 5:
			try {
				List<Book> allBooks = bookService.getAllBooks();
				allBooks.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
				allBooks.forEach(book -> System.out.println(book));

			} catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
			}

			break;
		case 6:
			System.out.println("Enter Author Name to get books");
			String author = scanner.next();
			try {
				List<Book> books = bookService.getByAuthor(author);
				books.sort((o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
				books.forEach(book -> System.out.println(book));
			} catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 7:
			System.out.println("Enter Category Name to get books");
			String category = scanner.next();
			System.out.println("Enter books price range");
			double priceValue = scanner.nextDouble();
			try {
				List<Book> books = bookService.getByCategoryLessPrice(category, priceValue);
				books.sort((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
				books.forEach(book -> System.out.println(book));
			} catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 8:
			System.out.println("Enter book title");
			String bookTitle = scanner.next();

			try {
				List<Book> books = bookService.getByTitleContains(bookTitle);
				books.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
				books.forEach(book -> System.out.println(book));
			} catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;

		}

		System.out.println("Would you like to proceed further? click y to continue n to end the session");

		String answer = scanner.next();
		if (answer.equals("y")) {
			System.out.println("Choose your option to proceed further");
			manageBookApp(scanner);
		} else {
			System.out.println("Your session ended");
			DBConnection.closeConnection();
			scanner.close();
		}
	}
}
