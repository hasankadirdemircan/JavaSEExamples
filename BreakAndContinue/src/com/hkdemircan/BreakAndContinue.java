package com.hkdemircan;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		int number = 10;
		System.out.println("\n *** Break ***");
		for(int i=0; i<10; i++) {
			System.out.println("number : " + i);
			if(i % 2 == 0) {
				break;
			}
		
		}
		
		System.out.println("\n *** Continue ***");
		for(int i=0; i<10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("number : " + i);
		}
		
		
		System.out.println("\n *** 3nd For Loop ***");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("j : " + j);
				if (j % 2 == 0) {
					break;
				}

			}
		}
		
		System.out.println("\n *** 4th For Loop ***");
		breakMe:for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.println("j : " + j);
				if( j % 2 == 0) {
					break breakMe;
				}
				
			}
		}
	}
}
