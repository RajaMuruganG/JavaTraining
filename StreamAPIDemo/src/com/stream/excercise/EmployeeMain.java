package com.stream.excercise;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Raju", "Ooty", 2000, 30),
				new Employee("Jeni", "Bengaluru", 24000, 40), new Employee("Kevin", "Chennai", 12000, 39),
				new Employee("Akash", "Vellore", 8000, 11), new Employee("Akshay", "Mysore", 15000, 22),
				new Employee("Sri", "Mysore", 8400, 20));

		// get the list of emp from a particular city

		System.out.println("get the list of emp from a particular city");
		employees.stream().filter(emp -> emp.getCity().equals("Mysore")).forEach(System.out::println);
		
		System.out.println("");
		System.out.println("Print only the employee names in uppercase");
		employees.stream().map(emp -> emp.getEmpName().toUpperCase()).forEach(System.out::println);
		
		System.out.println("");
		System.out.println("Get the employee having salary greater than 5000, sort by name");
		employees.stream()
		.filter(emp -> emp.getSalary()>5000)
		.sorted((emp1, emp2)-> emp1.getEmpName().compareTo(emp2.getEmpName()))
		.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("Get the employee with the highest salary");
		
		Employee employee = employees.stream()
		.sorted((emp1, emp2)-> Double.compare(emp2.getSalary(), emp1.getSalary()))
		.findFirst()
		.get();
		
		System.out.println(employee);
		
		System.out.println("");
		System.out.println("Get the sum of salaries of all employees");
		
		double sum = employees.stream()
		.map(emp -> emp.getSalary())
		.reduce((x,y)->x+y)
		.get();
		System.out.println(sum);
		
		
	}
}
