package com.java.basics;

public class TernaryOp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String res = a > b ? "A is greater" : "B is Greater";
		System.out.println("Result--> " + res);

		String name = "Raja";
		res = name.equals("Raja") ? "Welcome Raja" : "Wrong username";
		System.out.println(res);

	}
}
