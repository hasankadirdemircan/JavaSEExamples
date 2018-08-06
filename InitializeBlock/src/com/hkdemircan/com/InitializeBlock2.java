package com.hkdemircan.com;

class Animal{
	
	static {
		System.out.println("Animal static initialize block");
	}
	
	{
		System.out.println("Animal initialize block");
	}
	
	public Animal() {
		System.out.println("Animal constructor");
	}
}

class Dog extends Animal {
	
	static {
		System.out.println("Dog static initialize block");
	}
	
	{
		System.out.println("Dog initialize block");
	}
	
	public Dog() {
		System.out.println("Dog constructor");
	}
	
}
public class InitializeBlock2 extends Dog {

	public static void main(String[] args) {
		System.out.println("main");
		
		Dog dog = new Dog();
		System.out.println("--dog2--");
		Dog dog2 = new Dog();
		
	}
}
