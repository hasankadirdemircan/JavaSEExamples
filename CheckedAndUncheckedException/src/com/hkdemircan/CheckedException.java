package com.hkdemircan;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {

	
	public static void main(String[] args) {
			try {
				//FileWriter class'i checked exception.
				FileWriter fw = new FileWriter("file.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void throwsExample() throws IOException {

		FileWriter fw = new FileWriter("file.txt");
	}
}
