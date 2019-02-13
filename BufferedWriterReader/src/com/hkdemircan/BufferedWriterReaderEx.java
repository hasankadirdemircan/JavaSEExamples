package com.hkdemircan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderEx {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("buffered.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hello");
		bw.write("world");
		bw.newLine();
		bw.write("java");
		bw.close();
	
		
		FileReader fr = new FileReader("buffered.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(data);
		}
		fr.close();
		br.close();
		
	}
}
