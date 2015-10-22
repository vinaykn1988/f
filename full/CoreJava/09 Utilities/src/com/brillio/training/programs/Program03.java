package com.brillio.training.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Program03 {

	public static void main(String[] args) throws Exception{
		
		// convert System.in (InputStream) into a Reader
		Reader reader = new InputStreamReader(System.in);
		//create a BufferedReader
		BufferedReader in = new BufferedReader(reader);
		
		String name, city;
	
		System.out.print("what is your name? ");
		name = in.readLine();
		
		System.out.print("where are you from? ");
		city = in.readLine();
		
		System.out.printf("Hello %s, how is weather in %s?\n", name,city);
		
	}
}
