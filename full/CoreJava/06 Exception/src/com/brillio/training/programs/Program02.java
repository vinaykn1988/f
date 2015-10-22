package com.brillio.training.programs;

import com.brillio.trainin.exceptions.InvalidIdException;
import com.brillio.trainin.exceptions.NameLengthException;
import com.brillio.trainin.exceptions.SalaryOutofRangeException;
import com.brillio.training.entity.Employee;

public class Program02 {

	public static void main(String[] args) {
		
		Employee e1;
		
		e1 = new Employee();
		
		try {
			e1.setId(4546);
			e1.setName("");
			e1.setSalary(7000.0);
			System.out.println(e1);
		} catch (InvalidIdException e) {
				System.out.println("Invalid id");
		} catch (NameLengthException e) {
				System.out.println("Name length is out of range");
		} catch (SalaryOutofRangeException e) {
				System.out.println("salary is out of range");
		}
		
		
		System.out.println("End of program execution.");
	}
}
