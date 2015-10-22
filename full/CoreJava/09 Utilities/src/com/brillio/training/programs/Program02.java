package com.brillio.training.programs;

public class Program02 {

	public static void main(String[] args) throws Exception{
		
		byte[]	buffer = new byte[100];
		String name;
		
		System.out.print("Enter your name: ");
		System.in.read(buffer);
		name = new String(buffer).trim();
		System.out.println("Hello, "+ name + "....");
	}
}
