package com.training.question1;

public class MobMain {

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile("iPhone", 60000, "iPhone16");
		mobile1.getDetails();
		System.out.println();
		Mobile mobile2 = new Mobile("iPhone", 40000, "iPhone15");
		mobile2.getDetails();
		String[] mobileFeatures = mobile1.showFeatures();
		System.out.println();
		for (String features : mobileFeatures) {
			System.out.println(features);
		}
	}
}
