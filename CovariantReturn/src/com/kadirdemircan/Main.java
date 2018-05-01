package com.kadirdemircan;

class Computer {
	
	public Computer() {
		System.out.println("Computer Constructor..!");
	}
	
	public void showMessage() {
		System.out.println("Welcome to covariant type return");
	}
}

class Laptop extends Computer {
	
}

class SuperClass {
	
	public Computer getComputer() {
		return new Computer();
	}
}

class SubClass extends SuperClass {
	
	//Covariant Return;
	@Override
	public Computer getComputer() {
		return new Computer();
	}
}

public class Main {

	public static void main(String[] args) {
		
		SubClass subClass = new SubClass();
		
		subClass.getComputer().showMessage();
	}
}
