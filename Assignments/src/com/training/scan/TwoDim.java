package com.training.scan;

import java.util.Scanner;

public class TwoDim {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[][] userArray = new String[2][2];
		System.out.println("Enter User Name: ");
		userArray[0][0] = scan.next();
		userArray[0][1] = scan.next();
		userArray[1][0] = scan.next();
		userArray[1][1] = scan.next();

		int requiredUserCount = 0;
		System.out.println("User Names that starts with ‘s’: ");
		for (String[] row : userArray) {
			for (String user : row) {
				if (user.toLowerCase().startsWith("s")) {
					System.out.println(user);
				}
			}
		}
		scan.close();
	}

}
