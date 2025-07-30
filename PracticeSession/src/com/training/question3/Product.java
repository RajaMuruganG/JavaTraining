package com.training.question3;

public class Product {

	void itemsAvailable(String... itemNames) {
		System.out.println("Available Items: ");
		for (String item : itemNames) {
			System.out.println(item);
		}
	}

	void showReviews(String itemName, String... reviews) {
		System.out.println("Reviews about the item: " + itemName);
		// print the itemname and the reviews
		for (String review : reviews) {
			System.out.println(review);
		}
	}

}
