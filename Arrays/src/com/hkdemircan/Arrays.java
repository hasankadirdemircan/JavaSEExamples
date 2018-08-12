package com.hkdemircan;

public class Arrays {

	public static void main(String[] args) {

//		int[] notInitializedarray;

		int[] initializedArray = new int[5];
//		initializedArray[5] = 1;// Runtime exception; java.lang.ArrayIndexOutOfBoundsException
		for (int i : initializedArray) {
			System.out.println(i);
		}

		// Error; The local variable array1 may not have been initialized
		// for (int i : notInitializedarray) {
		// System.out.println(i);
		// }

		int[][] myArray = new int[3][];
		int[] array = new int[2];
		array[0] = 6;
		array[1] = 7;

		int[] array1 = new int[3];
		array1[0] = 9;
		array1[1] = 8;
		array1[2] = 5;
		
		int[] array2 = new int[3];
		array2[0] = 6;
		array2[1] = 7;
		array2[2] = 8;

		myArray[0] = array;
		myArray[1] = array1;
		myArray[2] = array2;
		System.out.println("**********");
		for (int k = 0; k < myArray.length; k++) {

			for (int i = 0; i < myArray[k].length; i++) {
				System.out.println(myArray[k][i]);
			}
			System.out.println("-");
		}

	}
}
