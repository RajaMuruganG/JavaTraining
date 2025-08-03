package com.oops.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		InEmployee emp = new InEmployee("A", 1);
		System.out.println(emp.name);
		System.out.println(emp.id);
		
		InManager manager = new InManager("M", 10);
		System.out.println("Manager Name==> "+ manager.name);
		System.out.println("Manager Id==> "+manager.id);
		System.out.println("Manager Salary==>"+manager.salary);
		
	}
}
