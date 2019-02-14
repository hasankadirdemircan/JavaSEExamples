package com.hkdemircan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("stream.txt"); //for write
		byte[] byteArray = "hello world".getBytes();
		
		fos.write(byteArray);
		fos.close();
		
		FileInputStream fis = new FileInputStream("stream.txt"); // for read
		int i;
		int avaible;
		while((i = fis.read()) != -1) {
			//avaible bytes
			avaible = fis.available();
			// convert integer to character
			char c = (char) i;
			//prints
			System.out.print("Avaible : " + avaible);
			System.out.println("; Read : " + c);
		}
	}
}
