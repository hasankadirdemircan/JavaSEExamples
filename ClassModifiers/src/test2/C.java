package test2;

public class C {

	public static void main(String[] args) {
/*
 * Now, if we try to compile the C class:
 * We get an error
 * Because ; 
 * 
 * B class -> default class.
 * should be public class
 */
		B b = new B(); //error
		
		b.test();
	}
}
