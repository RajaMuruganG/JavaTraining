package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		String[] users = { "Raja", "Murugan", "Priya" };

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name to register: ");
		String newUser = scan.next();

		String message = "You are registered";
		for (String user : users) {
			if (user.toLowerCase().equalsIgnoreCase(newUser)) {
				message = "Name is not unique";
			}
		}

		System.out.println(message);
		scan.close();

	}

}
