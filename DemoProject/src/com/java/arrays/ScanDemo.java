package com.java.arrays;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {

		System.out.println("Please Enter Details: ");

		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		int age = scan.nextInt();
		double salary = scan.nextDouble();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		scan.close();
	}

}
