package com.training.basic;

public class Sum {

	public static void main(String[] args) {
		// Print the sum and avg of all digits in array

		int[] numbers = { 22, 20, 91, 90, 5 };

		int sum = 0;
		

		for (int num : numbers) {
			sum += num;
		}

		double average = (double)sum / numbers.length;

		System.out.println("Sum of numbers: " + sum);
		System.out.println("Avg of numbers: " + average);
	}
}
