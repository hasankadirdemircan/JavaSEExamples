package com.hkdemircan;

import java.io.FileNotFoundException;

class Car{
	
	public void price() {
		
	}
	
	public void model() throws FileNotFoundException{
		
	}
	
	public void maxSpeed() throws NullPointerException{
		
	}
	
}

public class OverrideException extends Car {

	
	// Error : Multiple markers at this line - Exception IOException is not compatible with throws clause in Car.price()
	
//	@Override
//	public void price() throws IOException {
//		
//	}

	//Super class'ta exception varsa kullanabiliriz.
	@Override
	public void maxSpeed() throws NullPointerException {
		
	}

	//Super class'ta FileNotFoundException var fakat biz kaldirdik. legaldir.
	@Override
	public void model(){
		
	}

}
