package com.hkdemircan;

public class SwitchCase {

	public static void main(String[] args) {
		
		String temp = "2";
		int number = 2;
		
		switch(temp) {
		case "1":
			System.out.println("temp : " + temp);
		case "2":
			System.out.println("temp : " + temp);
		case "3":
			System.out.println("temp : " + temp);
		case "4":
			System.out.println("temp : " + temp);
		default:
			System.out.println("temp not found!");
		}
		
		System.out.println("*****number*****");
		
		switch(number) {
		case 1:
			System.out.println("temp : " + temp);
			break;
		case 2:
			System.out.println("temp : " + temp);
			break;
		case 3:
			System.out.println("temp : " + temp);
			break;
		case 4:
			System.out.println("temp : " + temp);
			break;
		default:
			System.out.println("temp not found!");
			break;			
		}
		
		System.out.println("switch case finish.!");
	}
}
