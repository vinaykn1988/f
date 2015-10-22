package com.brillio.training.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is a utility class for accepting console inputs.
 * It uses the builtin java.util.scanner for its work.
 * For all the methods, you must supply a String message
 * 
 * @version 1.0
 * @author Vinod
 *
 */


public class KeyboardUtil {

	// let no one create an object
	
	private KeyboardUtil() {
	}
	
	/**
	 * This method prompts the user with a message and shows the user to key in a String.
	 * Will return the same.
	 * 
	 * @param message  The message to be displayed to the user
	 * @return The string entered by the user
	 * @throws InputMismatchException
	 */
	
	public static String getString(String message) throws InputMismatchException{
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		return scanner.nextLine();
	}
	
	
	/**
	 * This method allows the user to input an int at a prompt
	 * where a message is displayed.
	 * 
	 * @param message The message to be displayed to the user
	 * @return  The int entered by the user
	 * @throws InputMismatchException
	 */
	
	public static int getInt(String message)throws InputMismatchException{
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		return scanner.nextInt();
	}
	
public static double getDouble(String message)throws InputMismatchException{
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		return scanner.nextDouble();
	}

public static Date getDate(String message) throws InputMismatchException{
	
	final String PATTERN = "yyyy-MM-dd"; // ISO 8601 format
	SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
	
	try{
		String input = getString(message);
		return sdf.parse(input);
	}
	catch (ParseException e){
		
		throw new InputMismatchException(
				"Invalid value for pattern" + PATTERN.toUpperCase());
	}
}

}

