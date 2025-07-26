package com.oops.basics;

public class Employee {

	String employeeName;
	int age;
	double salary;

	void getDetails() {
		System.out.println("Name: " + employeeName);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}

	String greet(String message) {
		return message+" "+employeeName;
	}
	
}
