package com.brillio.training.entity;

import com.brillio.trainin.exceptions.InvalidIdException;
import com.brillio.trainin.exceptions.NameLengthException;
import com.brillio.trainin.exceptions.SalaryOutofRangeException;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws InvalidIdException {
		if(id<1 || id>99999){
			throw new InvalidIdException("Invalid id. Id must be between 1 and 99999");
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws NameLengthException {
		if(name==null || name.trim().length()<3){
			throw new NameLengthException("Name must be at least 3 characters");
		}
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws SalaryOutofRangeException {
		if(salary<1000 || salary>15000){
			throw new SalaryOutofRangeException("Salary must be between $1000 and $15000");
		}
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ",\n name=" + name + ",\n salary=" + salary + "]";
	}

	
}
