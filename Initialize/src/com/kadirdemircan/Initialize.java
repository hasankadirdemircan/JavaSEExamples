package com.kadirdemircan;

class StaticInitialize{
	int staticIntVariable;
	byte staticByteVariable;
	float staticFloatVariable;
	boolean staticBooleanVariable;
	double staticDoublenVariable;
	long staticLongVariable;
	String staticVariable;
	
	@Override
	public String toString() {
		return "StaticInitialize [staticIntVariable=" + staticIntVariable + ", staticByteVariable=" + staticByteVariable
				+ ", staticFloatVariable=" + staticFloatVariable + ", staticBooleanVariable=" + staticBooleanVariable
				+ ", staticDoublenVariable=" + staticDoublenVariable + ", staticLongVariable=" + staticLongVariable
				+ ", staticVariable=" + staticVariable + "]";
	}
	
}

public class Initialize {

	int instanceIntVariable;
	byte instanceByteVariable;
	float instanceFloatVariable;
	boolean instanceBooleanVariable;
	double instanceDoubleVariable;
	long instanceLongVariable;
	String stringVariable;

	@Override
	public String toString() {
		return "Initialize [instanceIntVariable=" + instanceIntVariable + ", instanceByteVariable="
				+ instanceByteVariable + ", instanceFloatVariable=" + instanceFloatVariable
				+ ", instanceBooleanVariable=" + instanceBooleanVariable + ", instanceDoublenVariable="
				+ instanceDoubleVariable + ", instanceLongVariable=" + instanceLongVariable + ", stringVariable="
				+ stringVariable + "]";
	}


	public static void main(String[] args) {
		Initialize initialize = new Initialize();
		System.out.println("---instance initialize");
		System.out.println(initialize);
		System.out.println(initialize.instanceFloatVariable + initialize.instanceDoubleVariable );
		
		StaticInitialize staticInitialize = new StaticInitialize();
		System.out.println("---static initialize");
		System.out.println(staticInitialize);
		System.out.println(staticInitialize.staticFloatVariable + staticInitialize.staticDoublenVariable);
		
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
