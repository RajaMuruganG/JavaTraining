package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookUtil {

	public static List<Book> showAllBooks() {
		return Arrays.asList(new Book(1, "Core Java", "Author", 200, "Tech"));
	}
}
