package com.java.arrays;

import java.util.Iterator;

public class OneDimArray {

	public static void main(String[] args) {

		// declare and initialize

		int[] nums = new int[4];
		System.out.println(nums.length);
		System.out.println(nums[2]);

		// populate the Array
		nums[0] = 100;
		nums[1] = 90;
		nums[2] = 50;
		nums[3] = 70;

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			System.out.println(nums[i]);
			sum += nums[i];
		}

		sum = 0;
		System.out.println("----For Each---");
		//for each for forward iteration not for reverse iteration
		for (int num : nums) { // num here is value
			sum += num;
		}

		System.out.println("sum= " + sum);
	}

}
