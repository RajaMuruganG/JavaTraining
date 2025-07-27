package com.oops.overload;

public class VarArgsDemo {

	public static void main(String[] args) {

		sum(10, 20, 30);
		sum(10, 20);
		sum(10, 20, 30, 40);
		sum(10, 20, 50, 60);
	}

	static void sum(int x, int y) {
		System.out.println("sum---> " + x +", "+ y);
	}

	static void sum(int... marks) {
		int result = 0;
		for (int mark : marks) {
			result += mark;
		}
		System.out.println("Sum --> " + result);
	}
}
