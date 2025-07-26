package com.training.basic;

public class DownPyramid {

	public static void main(String[] args) {
		int pyramidSize = 5;

		for (int i = pyramidSize; i>0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

}
