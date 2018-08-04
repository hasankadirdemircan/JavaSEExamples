package com.hkdemircan;

public class PassingPrimitive {

	public static void main(String[] args) {
		int number = 50;
		System.out.println(number);

		PassingPrimitive passingPrimitive = new PassingPrimitive();

		passingPrimitive.addNumber(number);// burada degiskenin kopyasi methoda gecer.
		System.out.println(number);

	}

	public void addNumber(int number) {
		number +=10;
		System.out.println(number);
	}
}
