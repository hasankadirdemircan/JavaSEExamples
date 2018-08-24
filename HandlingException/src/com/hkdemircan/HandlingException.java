package com.hkdemircan;

public class HandlingException {

	public static void main(String[] args) {
		int number1 = 5;
		
		try {
			System.out.println(number1/0);
			System.out.println("not work!");
		}catch(ArithmeticException e) {
			System.out.println("catch ArihmeticException!");
		}
		
	}
}
