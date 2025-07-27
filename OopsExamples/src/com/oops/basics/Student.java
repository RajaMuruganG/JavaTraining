package com.oops.basics;

public class Student {

	String studentName;
	String department;

	public Student(String name, String department) {
		studentName = name;
		this.department = department;
	}

	void getDetails() {
		System.out.println("Name: " + studentName);
		System.out.println("Department " + department);
	}
}
