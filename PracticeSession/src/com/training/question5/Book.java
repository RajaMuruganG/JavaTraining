package com.training.question5;

public class Book {

	int bookId;
	String title;
	String author;
	double price;

	public Book(String title) {
		super();
		this.title = title;
	}

	public Book(String title, String author, double price) {
		this(title, price);
		this.author= author;
	}

	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	void printDetails() {

		if (this.title != null) {
			System.out.println("Book Title: " + this.title);
		}

		if (this.author != null) {
			System.out.println("Author: " + this.author);
		}

		if (this.price > 0) {
			System.out.println("Price: " + this.price);
		}
	}
	
	void display(String...n) {
		System.out.println("VarArg");
	}
	
	void display(Object n) {
		System.out.println("VarArg");
	}

}
