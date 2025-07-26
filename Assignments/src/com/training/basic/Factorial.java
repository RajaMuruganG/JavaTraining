package com.training.basic;

public class Factorial {

	public static void main(String[] args) {
		// Print the factorial for a number

		int factorial = 5;
		int result = 1;
		for (int i = factorial; i > 0; i--) {
			System.out.print(i + " ");
			result *= i;
		}
		System.out.println();
		System.out.println(factorial + " factorial equals : " + result);
	}
}
