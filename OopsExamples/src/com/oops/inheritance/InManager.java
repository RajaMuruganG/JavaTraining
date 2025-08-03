package com.oops.inheritance;

public class InManager extends InEmployee {

	double salary;
	
	
	public InManager(String name, int id) {
		super(name,id);
		this.salary =20000;
	}
}
