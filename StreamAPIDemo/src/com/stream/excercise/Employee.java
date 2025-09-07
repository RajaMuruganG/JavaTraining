package com.stream.excercise;

public class Employee {
	private String empName;
	private String city;
	private double salary;
	private int empId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String empName, String city, double salary, int empId) {
		super();
		this.empName = empName;
		this.city = city;
		this.salary = salary;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", city=" + city + ", salary=" + salary + ", empId=" + empId + "]";
	}

}
