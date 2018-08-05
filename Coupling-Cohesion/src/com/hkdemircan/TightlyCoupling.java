package com.hkdemircan;

class Employee{
	public String name;
	public int age;
	
}

public class TightlyCoupling {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.name = "kadir";
		employee.age = 23;
		System.out.println(employee.name);
		System.out.println(employee.age);
	}
	
}
