package com.brillio.training.programs;

public class Program01 {

	public static void main(String[] args) throws Exception{
		
		// System.in is a reference of type java.io.InputStream
		// and by default refers to an object of 
		// java.io.BufferedInputStream, representing the
		// keyboard (default console input)
		System.out.println(System.in.getClass());
		
		System.out.println("Enter something:");
		int ch = System.in.read();
		
		System.out.println("The first 3 letters you entered are");
		System.out.print((char)ch);
		ch = System.in.read();
		System.out.print((char)ch);
		ch = System.in.read();
		System.out.print((char)ch);
		ch = System.in.read();
		System.out.print((char)ch);
		ch = System.in.read();
		System.out.print((char)ch);
	}
}
