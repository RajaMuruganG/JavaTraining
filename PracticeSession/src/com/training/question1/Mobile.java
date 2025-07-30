package com.training.question1;

public class Mobile {

	private String model;
	private double price;
	private String brand;

	public Mobile(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}

	void getDetails() {
		System.out.println("Model: " + this.model);
		System.out.println("Price: " + this.price);
		System.out.println("Brand: " + this.brand);
	}

	public String[] showFeatures() {

		String[] mobileFeatures = new String[3];
		mobileFeatures[0] = "Cutting-Edge Cameras";
		mobileFeatures[1] = "Apple Intelligence";
		mobileFeatures[2] = "Chip and Battery Life. Fast that lasts";

		return mobileFeatures;
	}
}
