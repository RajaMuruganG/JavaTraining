package com.java.basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// accept express that can be int, String, ENUM
		System.out.print("Enter Choice=====> ");
		Scanner scan = new Scanner(System.in);
		String operation = scan.next();
		int x = 40;
		int y = 20;
		switch (operation) {
		case "+":
			System.out.println(x + y);
			break;
		case "-":
			System.out.println(x - y);
			break;
		case "*":
			System.out.println(x * y);
			break;
		case "/":
			System.out.println(x / y);
			break;
		default:
			System.out.println("The operator " + operation + " is invalid");
			break;
		}

		String climate = "rainy";

		switch (climate.toUpperCase()) {
		case "RAINY":
			System.out.println("Drint Tea");
			System.out.println("Enjoy Rainy");
			break;
		case "WINTER":
			System.out.println("Drint Soup");
			System.out.println("Enjoy Cozy");
			break;
		case "SUMMAR":
			System.out.println("Drint Juice");
			System.out.println("Stay at home");
			break;
		default:
			System.out.println("Incorrect choice");
			break;

		}
	}

}
