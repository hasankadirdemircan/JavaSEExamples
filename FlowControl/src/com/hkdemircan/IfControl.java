package com.hkdemircan;

public class IfControl {

	public static void main(String[] args) {
		IfControl ifControl = new IfControl();
		int number1 = 5;
		int number2 = 10;
		
		System.out.println(number1 < number2);
		
		if(number1 < number2) {
			System.out.println(number1 + number2);
		}else {
			System.out.println(number1 - number2);
		}
		
		if(!(number1 < number2)) {
			System.out.println(number1 + " > " +  number2);
		}else {
			System.out.println(number1 + " < " +  number2);
		}
		
		if(ifControl.getBoolean(number1) || ifControl.getBoolean(number2)) {
			System.out.println("true || false -> true");
		}

		if(ifControl.getBoolean(number1) && ifControl.getBoolean(number2)) {
		}else {
			System.out.println("true && false -> false");
		}
}
	
	public boolean getBoolean(int number) {
		
		if(number < 6) {
			return true;
		}else {
			return false;
		}
	}
}
