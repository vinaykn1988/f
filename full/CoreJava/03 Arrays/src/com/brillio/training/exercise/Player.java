package com.brillio.training.exercise;

public abstract class Player {

	private String firstName;
	private String lastName;
	
	public Player() {
	}

	public Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName(){
		
		return (this.firstName + " " + this.lastName);
		
	}
	
	public abstract int getRating();
}
