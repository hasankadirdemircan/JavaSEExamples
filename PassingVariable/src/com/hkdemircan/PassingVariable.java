package com.hkdemircan;

class Employee{
	String name;
	int age;
	double salary;

	Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}

public class PassingVariable {

	public static void main(String[] args) {
		Employee employee = new Employee("kadir", 22, 0.5);
		System.out.println(employee);
		
		PassingVariable passingVariable = new PassingVariable();
		//burada objenin kendisi gitmez, objenin adres bilgisi gider.
		//objenin kendisi methoda gecmez.
		//objenin kopyasi olusmaz.
		passingVariable.change(employee);
		System.out.println(employee);
		
		passingVariable.update(employee);
		System.out.println(employee);
		
	}
	
	public void change(Employee employee) {
		System.out.println(employee);
		employee.name = "hasan";
		employee.age = 24;
		employee.salary = 1.5;

		System.out.println(employee);

	}
	
	public void update(Employee employeeRef) {
		employeeRef.name = "msi";
		employeeRef.age = 30;
		employeeRef.salary = 7;
		System.out.println(employeeRef);
		
		employeeRef = null; // burada employeeRef referans degisken baglantisi kesiliyor.
		
		System.out.println(employeeRef);
		
		
	}
}
