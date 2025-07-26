package com.training.basic;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] numbers = { 10, 40, 39, 90, 12, 34 };
		int arrSize = numbers.length;

		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] > numbers[i]) {
					x = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = x;
				}
			}
		}
		
		for (int i : numbers) {
			System.out.print(i+" ");
		}

	}

}
