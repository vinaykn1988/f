package com.brillio.training.programs;

import java.io.FileInputStream;
import java.io.InputStream;

public class Program01 {

	public static void main(String[] args) throws Exception {
		
		String filename = "D:/vin.txt";
		InputStream in = new FileInputStream(filename);
		
		int ch;
		
		while((ch= in.read())!= -1){
			
		System.out.print((char)ch);
		}
		
		in.close();
	}
}
