package com.brillio.training.programs;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Program05 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream file = new FileInputStream("numbers.dat");
		
		DataInputStream in = new DataInputStream(file);
		
		while(true){
		try {
			double d = in.readDouble();
			System.out.println(d);
		} catch (Exception e) {
			break;
		}
		}
		
		in.close();
		file.close();
		System.out.println("All data read");
	}
	
	
}
