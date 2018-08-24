package com.hkdemircan;

public class UncaughtException {

	public static void main(String[] args) {
		UncaughtException uncaughtException = new UncaughtException();
		String name = null;
		uncaughtException.method1(name);
	}
	
	public void method1(String name) {
		System.out.println("method1");
		try {
			method2(name);
		}catch(NullPointerException e) {
			// NullPointerException burada yakalandi.
			//Buraya kadar method3, method2 ��ker.
			System.out.println("NullPointerException Catch!");
		}
		System.out.println("method1 work!");
	}
	
	public void method2(String name) {
		System.out.println("method2");
		method3(name);
		System.out.println("method2 not work!");
	}
	
	public void method3(String name) {
		name.toLowerCase();
		System.out.println("method3 not work!");
	}
}
/// Stack Goruntusu
//  method3
//  method2
//  method1
//  main

