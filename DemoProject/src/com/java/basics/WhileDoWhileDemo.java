package com.java.basics;

public class WhileDoWhileDemo {

	public static void main(String[] args) {

		int x = 0;
		while (x > 10) {
			System.out.println(x);
			x++;
		}
		System.out.println("------");
		do {
			System.out.println(x);
			x++;
		} while (x > 20);

		System.out.println("outside "+x);
	}

}
