package com.brillio.training.programs;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Program06 {

	public static void main(String[] args) throws Exception{
		
		short s=22;
		Object[] data = {
				200, 1.2, "vinod", s, 2.2f
		};
		
		FileOutputStream file = new FileOutputStream("array.dat");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		// arrays are objects
		out.writeObject(data);
		
		out.close();
		file.close();
		
		System.out.println("It's done");
	}
}
