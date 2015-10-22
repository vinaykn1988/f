package com.brillio.training.programs;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Program04 {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream file = new FileOutputStream("numbers.dat");
		
		//decorator object, provides more operations on "file"
		DataOutputStream out = new DataOutputStream(file);
		
		// any operation on "out" will be eventually delegated to the "file"
		
		out.writeDouble(1.23);
		out.writeDouble(2.35);
		out.writeDouble(Math.PI);
		out.writeDouble(283.56/7787.0);
		
		out.close();
		file.close();
		
		System.out.println("4 numbers written to the file");
	}
	
	
}
