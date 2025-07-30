package com.training.question3;

public class Billing {

	public static void main(String[] args) {

		Product product = new Product();

		product.itemsAvailable("MacBookPro", "iPhone", "Samsung");
		System.out.println();
		product.showReviews("MacBookPro", "MacBookPro Review 1", "MacBookPro Review 2", "MacBookPro Review 3");
		System.out.println();
		product.showReviews("iPhone", "iPhone Review 1", "iPhone Review 2", "iPhone Review 3", "iPhone Review 4");
		System.out.println();
		product.showReviews("Samsung", "Samsung Review 1", "Samsung Review 2");

	}
}
