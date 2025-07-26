package com.training.basic;

public class Armstrong {

	public static void main(String[] args) {
		// Print the armstrong number
		// sample armstrong numbers are 153, 9474
		// equal to the sum of its own digits each raised to the power of the number of
		// digits.

		int originalNum = 94741;
		int num = originalNum;

		int len = String.valueOf(num).length();
		double sum = 0;
		for (int i = 0; i < len; i++) {
			int digit = num % 10;
			num = num / 10;
			sum += Math.pow(digit, len);
		}

		int res = (int) sum;
		System.out.println("Calculation result==> " + res);

		System.out.println(res == originalNum ? originalNum + " is an armstrong number "
				: originalNum + " is not an armstrong number");
	}
}
