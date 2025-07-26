package com.java.arrays;

import java.util.Scanner;

public class DynamicTwoDimScannerArray {
	public static void main(String[] args) {

		int[][] marks = new int[3][];

		marks[0] = new int[3]; // one dimension array with 3 col
		marks[1] = new int[4];// one dimension array with 4 col
		marks[2] = new int[2];// one dimension array with 2 col

		marks[0][0] = 20;
		marks[0][1] = 30;
		marks[1][0] = 40;
		marks[1][1] = 50;
		marks[2][0] = 60;
		marks[2][1] = 70;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Marks");

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Row: "+ i);	
			for (int j = 0; j < marks[i].length; j++) {
				System.out.println("Enter Col Value: "+ j);
				marks[i][j] = scan.nextInt();
			}
		}

		for (int[] row : marks) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		scan.close();

	}
}
