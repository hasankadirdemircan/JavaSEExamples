package com.hkdemircan;

public class Arrrays {

	public static void main(String[] args) {

		int[] notInitializedarray;

		int[] initializedArray = new int[5];
		initializedArray[5] = 1;// Runtime exception; java.lang.ArrayIndexOutOfBoundsException
		for (int i : initializedArray) {
			System.out.println(i);
		}

		// Error; The local variable array1 may not have been initialized
		// for (int i : notInitializedarray) {
		// System.out.println(i);
		// }

		int[][] myArray = new int[3][];
		int[] array = new int[2];
		array[0] = 1;
		array[1] = 2;

		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;

		myArray[0] = array;
		myArray[1] = array1;
		System.out.println("**********");
		for (int k = 0; k < myArray.length; k++) {

			for (int i = 0; i < myArray[k].length; i++) {
				System.out.println(myArray[k][i]);
			}
			System.out.println("-");
		}

	}
}
