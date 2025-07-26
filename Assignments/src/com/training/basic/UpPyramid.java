package com.training.basic;

public class UpPyramid {

	public static void main(String[] args) {

		int pyramidSize = 5;

		for (int i = 1; i <= pyramidSize; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}

	}

}
