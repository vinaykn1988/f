package com.brillio.training.entity;

public class Customer {

	private int customerId;
	private String firstName;
	private String lastName;
	
	private Address address;	// HAS-A  relationship (aggregation)
	
	
	//default constructor
	public Customer() {
	}
	
	

	public Customer(int customerId, String firstName, String lastName) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void print(){
		
		System.out.println("Id    " + customerId);
		System.out.println("Name    " + firstName + " " + lastName);
		
		if(address!=null){
			
			address.print();
			
		}
	}
	
}
