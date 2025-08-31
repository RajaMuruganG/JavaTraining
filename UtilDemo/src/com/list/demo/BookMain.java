package com.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.bean.Book;

public class BookMain {

	public static void main(String[] args) {

		ArrayList<Book> bookList = new ArrayList();
		bookList.add(new Book("Book1", 100, "Author1"));
		bookList.add(new Book("Book2", 300, "Author5"));
		bookList.add(new Book("Book3", 200, "Author4"));
		bookList.add(new Book("Book4", 600, "Author2"));
		bookList.add(new Book("Book5", 900, "Author9"));

		Iterator<Book> bookIterator = bookList.iterator();
		while (bookIterator.hasNext()) {
			System.out.println(bookIterator.next());
		}

		bookList.add(1, new Book("InsertBook", 220, "InsertAuthor"));
		System.out.println("----------------");
		System.out.println("List Iterator------ Next-- index from 1");
		ListIterator<Book> listIterator = bookList.listIterator(1);
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("List Iterator------ Pre index from 3");
		listIterator = bookList.listIterator(3);
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}
}
