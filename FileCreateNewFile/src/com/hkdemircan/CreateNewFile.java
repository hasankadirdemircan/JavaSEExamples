package com.hkdemircan;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		File file = new File("text.txt");
		
		System.out.println(file.exists());//has a file ? true or false
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.exists());
	}
}

