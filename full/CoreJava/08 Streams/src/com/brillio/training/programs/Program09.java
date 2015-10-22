package com.brillio.training.programs;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.brillio.training.entity.Person;

public class Program09{

	public static void main(String[] args) throws Exception{
		
		FileInputStream file = new FileInputStream("persons.dat");
		ObjectInputStream in = new ObjectInputStream(file);
		
		while(true){
			
			try {
				Person p = (Person) in.readObject();
				System.out.println(p);
			} catch (EOFException e) {
				break;
			}
		}
		in.close();
		file.close();
	}
	
}
