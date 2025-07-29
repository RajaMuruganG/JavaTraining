package com.training.scan;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of an array: ");
		int size = scan.nextInt();

		System.out.println("Enter array elemets ");

		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = scan.nextInt();
		}
		
		double[] squarRoots = new double[size];
		for (int i = 0; i < squarRoots.length; i++) {
			squarRoots[i]= Math.sqrt(numbers[i]);
		}
		
		for (double squarRoot : squarRoots) {
			System.out.println(squarRoot);
		}	
		
		scan.close();

	}
}
