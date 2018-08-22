package com.hkdemircan;

public class BitShifting {
	
	public static void main(String[] args) {
		// >>
		// <<
		byte b = 8;
		//00001000
		byte b2 = 8>>1;
		//00000100
		
		System.out.println(b2);
		
		byte b3 = 7>>2;
		//00000111;
		//00000001;
		System.out.println(b3);
		//BCD koduna bakabilirsin.
		
		byte b4 = (byte) (b3<<2);
		//b4 -> 00000100
		System.out.println(b4);
	}

}
