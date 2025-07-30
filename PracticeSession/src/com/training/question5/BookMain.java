package com.training.question5;

public class BookMain {

	public static void main(String[] args) {

		Book book1 = new Book("Book1");
		book1.printDetails();
		System.out.println();
		Book book2 = new Book("Book2", "Author", 250);
		book2.printDetails();
		System.out.println();
		Book book3 = new Book("Book3", 350);
		book3.printDetails();
	}

}
