package com.training.basic;

public class Greater {

	public static void main(String[] args) {

		int[] numbers = { 10, 40, 39, 90, 12, 34 };
		int arrSize = numbers.length;

		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					x = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = x;
				}
			}
		}
		
		for (int i : numbers) {
			System.out.print(i+" ");
		}

		System.out.println();
		
		System.out.println("The Greatest number in the array is: "+ numbers[arrSize-1]);
	}

}
