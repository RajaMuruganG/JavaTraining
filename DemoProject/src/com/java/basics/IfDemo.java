package com.java.basics;

public class IfDemo {

	public static void main(String[] args) {

		int age = 16;
		if (age > 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not elligible");
		}

		// get 3 marks ->m1,m2,m3
		  //calculate the sum
		  //calculate the avg; double avg = sum/3;
		  // use chained if
		  // avg between 90-100 grade A
		  // avg between 80-90 grade B
		  // avg between 70-80 grade C
		  // avg between 50-70 grade D
		  // else fail

		int m1 = 80;
		int m2 = 85;
		int m3 = 95;
		
		int sum = m1+m2+m3;
		double avg = sum/3;
	}

}
