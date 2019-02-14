package com.hkdemircan;

import java.io.File;
import java.io.IOException;

public class FileProcess {

	public static void main(String[] args) throws IOException {
		File directory = new File("myDir");
		boolean bool = directory.mkdir();
		System.out.println(bool); // is create?
		
		File file = new File(directory,"file");
		bool = file.createNewFile(); 
		System.out.println(bool); // is file  create?
		
		directory.delete(); // not delete because folder is not empty
		file.delete();
		directory.delete();// delete because folder is empty
	}
}
