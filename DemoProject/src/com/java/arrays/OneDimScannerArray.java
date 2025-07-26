package com.java.arrays;

import java.util.Scanner;

public class OneDimScannerArray {

	public static void main(String[] args) {

		int[] nums = new int[4];

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Numbers: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		for (int val : nums) {
			System.out.println(val);
		}
		scan.close();
	}

}
