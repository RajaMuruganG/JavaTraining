package com.java.arrays;

import java.util.Scanner;

public class TwoDimScannerArray {
	public static void main(String[] args) {

		int[][] marks = new int[3][2];

//		marks[0][0] = 20;
//		marks[0][1] = 30;
//		marks[1][0] = 40;
//		marks[1][1] = 50;
//		marks[2][0] = 60;
//		marks[2][1] = 70;
//		
//		for (int[] row : marks) {
//			for (int col : row) {
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Marks");

		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				marks[i][j] = scan.nextInt();
			}
		}

		for (int[] row : marks) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}
}
