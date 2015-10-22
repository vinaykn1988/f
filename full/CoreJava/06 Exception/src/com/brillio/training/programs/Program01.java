package com.brillio.training.programs;

import javax.crypto.AEADBadTagException;

//run this program at the command line and supply 2 numbers
	// java com.brillio.trainin.programs.Program01 123 44
public class Program01 {

	
	public static void main(String[] args) {
	
		try {
			String input;
			input = args[0];
			int n = Integer.parseInt(input);
			
			input = args[1];
			int d = Integer.parseInt(input);
			
			int q = n/d;
			
			System.out.println("quotient = "+ q);
		}
		
		catch(NumberFormatException e){
			System.out.println("Please enter only integers");
			throw new RuntimeException();
		}
		catch(ArithmeticException e){
			System.out.println("can't divide by zero");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please supply 2 numbers as command line arguments");
		//	System.exit(1);
		}
		
		catch (Exception e) {

			System.out.println("OOPS! There was an error!");
		}
		finally{
		
			System.out.println("Inside the finallyblock.");
				}
		
		System.out.println("End of program execution");
	}
}
