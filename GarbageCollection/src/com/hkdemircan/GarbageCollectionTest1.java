package com.hkdemircan;

class Animal {
	String name;
	
	Animal(String name){
		this.name = name;
	}
}

public class GarbageCollectionTest1 {

	public static void main(String[] args) {
		Animal animal = new Animal("donkey");
		//
		animal = null;
		//buradan sonra GarbageCollection devreye girer ve Heap alanindan animal objesini temizler.
	}
	
}
