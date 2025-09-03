package com.list.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.bean.Employee;

public class CompareDemo {

	public static void main(String[] args) {
		List<Employee> employees = 
				Arrays.asList(
					new Employee("Raju","Ooty",2000),
					new Employee("Jeni","Bengaluru",24000),
					new Employee("Kevin","Chennai",12000),
					new Employee("Akash","Vellore",8000),
					new Employee("Akshay","Mysore",15000),
					new Employee("Sri","Mysore",8400));
		
		Collections.sort(employees);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}
}
