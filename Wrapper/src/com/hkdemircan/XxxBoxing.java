package com.hkdemircan;

public class XxxBoxing {

	public static void main(String[] args) {
		// AUTOBOXING
		
		// primitive tipten, wrapper sinif tipine otomatik olarak bir donusum varsa
		// buna autoboxing adi verilir.
		
		Integer autoboxing = 10; //10->primitive , autoboxing->wrapper otomatik donusum.
		
		//BOXING
		
		//primitive tipten wrapper sinifina donusum
		Integer boxing = new Integer(10); 
		Integer boxing2 = Integer.valueOf(10);
		
		
		//AUTOUNBOXING
		
		//wrapper sinifindan primitive tipe otomatik donus.
		Integer integer1 = 100; // autoboxing
		int int1 = integer1; // autounboxing
		
		//UNBOXING
		//wrapper sinifindan primitive tipe fonksiyon yardýmýyla donus.
		Integer integer2 = 150;//autoboxing
		int int2 = integer2.intValue();//unboxing
		
		
		
		
			
	}
}
