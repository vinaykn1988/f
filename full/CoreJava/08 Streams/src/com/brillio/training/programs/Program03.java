package com.brillio.training.programs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Program03 {

	public static void main(String[] args) throws Exception {
		
		// size of the file is 1340 bytes
		String filename = "D:/vin.txt";
		
		InputStream in = new FileInputStream(filename);
		int pass=0;
		
		int size = 8*1024;  
		
		byte[]	bytes = new byte[size];
		
		int read;
		
		while(in.read(bytes)!= -1){
			String data = new String(bytes).trim();
			System.out.print(data);
			pass++;
			// to erase the data copied in the current iteration
			Arrays.fill(bytes, (byte)0);
		}
		System.out.println("No of passes are" + pass);
		in.close();
	}
}
