package com.brillio.training.entity;

public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	private double height;
	
	public Person(int id, String firstName, String lastName, double height) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
	}
	
	// readable property (accessor) called "Id"
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// readable property (accessor) called "fullName"
	public String getFullName(){
		
		return firstName +" " + lastName;
		
	}
	
	// readable property (accessor) called "height"
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
