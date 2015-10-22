package com.brillio.training.programs;
		

public class Program04{

	public static void main(String[] args) {

		
		if(args.length == 0){
			System.out.println("no input");
		}
		
		try{
			double str = Double.parseDouble(args[0]);
		System.out.println("enter argument is a double which is" + str);
		}
		
		catch(NumberFormatException e){
			
		}
		
		try{
			int str = Integer.parseInt(args[0]);
		System.out.println("enter argument is a string which is" + str);
		}
		
		catch(NumberFormatException e){
		}
		
		try{
			if(Boolean.parseBoolean(args[0]))
				System.out.println("Entered argument is a boolean which is"+ args[0]);
		}
		
		catch(NumberFormatException e){
		}
		
		System.out.println("Entered argument is a string which is"+ args[0]);
		
}
}