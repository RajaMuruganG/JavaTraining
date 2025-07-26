package com.oops.basics;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.employeeName = "Raja";
		employee1.age = 25;
		employee1.salary = 20000;

		System.out.println("Employee 1 details");

		employee1.getDetails();
		String result = employee1.greet("Welcome");
		System.out.println(result);

		Employee employee2 = new Employee();

		employee2.employeeName = "Priya";
		employee2.age = 22;
		employee2.salary = 30000;
		System.out.println();
		System.out.println("Employee 2 details");

		employee2.getDetails();
		result = employee2.greet("Welcome");
		System.out.println(result);

		Employee employee3 = employee2;

		System.out.println();
		System.out.println("Employee 3 details");

		employee3.getDetails();
		result = employee3.greet("Welcome");
		System.out.println(result);

//		employee2 = null;
		//
//		System.out.println("Employee 2 details");
//		System.out.println("Name: "+ employee2.employeeName );
	}

}
