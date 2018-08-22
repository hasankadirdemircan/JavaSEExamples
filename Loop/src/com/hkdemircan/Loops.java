package com.hkdemircan;

public class Loops {

	public static void main(String[] args) {
		int number = 5;
		
		System.out.println("***Do While Loop***");
		do {
			number = number + 2;
		}while(number < 6);
		
		System.out.println("number : " + number);
		
		System.out.println("\n ***For Loop***");
		for(int i=0; i<=number; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n***While Loop***");
		while(number<10) {
			System.out.println("number : " + number); 
			number++;
		}
		
		String[] names = {"hasan", "kadir", "demircan"};
		for (String name : names) {
			System.out.println("name : " + name);
		}
	}
}
