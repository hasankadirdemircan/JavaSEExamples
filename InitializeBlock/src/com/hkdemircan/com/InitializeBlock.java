package com.hkdemircan.com;

public class InitializeBlock {
	
	static {
		//static initialize block
		System.out.println("static initialize block1");
	}
	
	static {
		System.out.println("static initialize block2");
	}

	{
		System.out.println("initialize block1");
	}
	
	{
		System.out.println("initialize block2");
	}
	
	public InitializeBlock() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		
		InitializeBlock initializeBlock1 = new InitializeBlock();
		InitializeBlock initializeBlock2 = new InitializeBlock();
		
	}
}
