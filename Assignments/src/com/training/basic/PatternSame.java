package com.training.basic;

public class PatternSame {

	public static void main(String[] args) {
		//create a pattern as(given below) 1 22 333 4444 
		int pyramidSize = 4;

		for (int i = 1; i <= pyramidSize; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");

			}
			System.out.println();

		}
	}
}
