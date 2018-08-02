package com.kadirdemircan;

public class Initialize {

	int instanceIntVariable;
	byte instanceByteVariable;
	float instanceFloatVariable;
	boolean instanceBooleanVariable;

	public static void main(String[] args) {
		Initialize initialize = new Initialize();

		System.out.println(initialize.instanceIntVariable);
		System.out.println(initialize.instanceByteVariable);
		System.out.println(initialize.instanceFloatVariable);
		System.out.println(initialize.instanceBooleanVariable);

		int localIntVariable1;
		int localIntVariable2;
		// System.out.println(localIntVariable1); Error: The local variable
		// localIntVariable may not have been initialized

		// int localIntVariable3 = localIntVariable1 + localIntVariable2;
		// Error;
		// Multiple markers at this line
		// - The local variable localIntVariable1 may not have been
		// initialized
		// - The local variable localIntVariable2 may not have been
		// initialized

	}
}
