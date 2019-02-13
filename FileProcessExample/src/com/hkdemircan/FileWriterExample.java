package com.hkdemircan;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("fileWriter.txt");
		fileWriter.write("Hello txt");
		fileWriter.flush();//now write.
		fileWriter.close();
		
		FileReader fileReader = new FileReader("fileWriter.txt");
		char[] input = new char[100];
		// low level  character oriented
		
		fileReader.read(input);
		for(char c : input) {
			System.out.println(c);
		}
		
	}
}
