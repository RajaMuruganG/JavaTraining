package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookUtil {

	public static List<Book> showAllBooks() {
		return Arrays.asList(new Book(100, "Java", "JavaAuthor", 200, "Tech"),
				new Book(121, "Spring", "SpringAuthor", 500, "Tech"),
				new Book(300, "To Kill a Mockingbird", "Harper Lee", 150, "Novels"),
				new Book(700, "1984", "George Orwell", 240, "Novels"),
				new Book(20, "The Alchemist", "Paulo Coelho", 275, "Fiction"),
				new Book(19, "A Brief History of Time", "Stephen", 500, "Science"),
				new Book(93, "Clean Code", "Robert C. Martin", 1500, "Tech"));
	}
}
