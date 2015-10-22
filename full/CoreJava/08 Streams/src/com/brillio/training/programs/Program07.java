package com.brillio.training.programs;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Program07 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream file = new FileInputStream("array.dat");
		ObjectInputStream in = new ObjectInputStream(file);
		
		while(true){
			Object []data;
			
			try {
				data = (Object []) in.readObject();
			} catch (Exception e) {
				break;
			}
			
			for (Object obj : data) {
				
				if(obj instanceof Integer){
					System.out.println(obj + " is an integer");
				}
				
				else if(obj instanceof Double){
					System.out.println(obj + " is a double");
				}
				
				else if(obj instanceof Short){
					System.out.println(obj + " is a Short");
				}
				
				else if(obj instanceof Float){
					System.out.println(obj + " is a Float");
				}
				
				else if(obj instanceof String){
					System.out.println(obj + " is a String");
				}
			}
			
		}
	}
}
