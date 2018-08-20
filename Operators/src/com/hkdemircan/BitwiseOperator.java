package com.hkdemircan;

public class BitwiseOperator {

	public static void main(String[] args) {
		byte b1 = 4 & 5; //and
		// 4 -> 0100
		// 5 -> 0101
		//----------
		//      0100 -> 4
		System.out.println("b1 : " + b1);
		
		byte b2 = 7 | 6; // or
		// 7 -> 0111
		// 6 -> 0110
		//----------
		//      0111 -> 7
		System.out.println("b2 : " + b2);
		
		byte b3 = 3 ^ 8; // xor
		// 3 -> 0011
		// 8 -> 1000
		//----------
		//      1011 -> 11
		System.out.println("b3 : " + b3);
		
		
		
	}
}
