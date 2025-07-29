package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		String[] userNames = { "raja123", "murugan123", "priya123" };

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username to login: ");
		String newUser = scan.next();

		String message = "Invalid username";
		for (String userName : userNames) {
			if (userName.equals(newUser)) {
				message = "You are logged in successfully";
			}
		}

		System.out.println(message);
		scan.close();

	}
}
