package com.brillio.training.programs;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) throws Exception {

		// capable of scanning from keyboard input

		Scanner scanner = new Scanner(System.in);

		int id;
		double salary;
		String name;

		System.out.print("Enter id       :");
		id = scanner.nextInt();
	//	scanner.nextLine(); // skip the new line chars

		// create a new Scanner
		scanner = new Scanner(System.in);
		System.out.print("Enter name    :");
		name = scanner.nextLine();

		System.out.print("Enter salary       :");
		salary = scanner.nextDouble();

		System.out.println("Name  = " + name);
		System.out.println("Id  = " + id);
		System.out.println("Salary  = " + salary);

	}
}
