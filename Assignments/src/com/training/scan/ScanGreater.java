package com.training.scan;

import java.util.Scanner;

public class ScanGreater {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int number1 = scan.nextInt();
		System.out.println("Enter Number 2");
		int number2 = scan.nextInt();
		System.out.println("Enter Number 3");
		int number3 = scan.nextInt();
		int result = number1 > number2 ? number1 > number3 ? number1 : number3 : number2 > number3 ? number2 : number3;
		System.out.println("The Greatest number is: " + result);
		scan.close();
	}

}
