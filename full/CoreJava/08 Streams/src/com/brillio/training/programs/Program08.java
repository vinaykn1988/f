package com.brillio.training.programs;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.brillio.training.entity.Person;

public class Program08 {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream file = new FileOutputStream("persons.dat");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(new Person(1, "Miller","Dallas"));
		out.writeObject(new Person(2, "David","California"));
		out.writeObject(new Person(3, "Jacob","Chicago"));
		out.writeObject(new Person(4, "Martin","Texas"));
		
		out.close();
		file.close();
		
		System.out.println("Done");
	}
}
