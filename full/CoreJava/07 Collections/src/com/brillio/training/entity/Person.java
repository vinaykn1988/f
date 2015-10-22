package com.brillio.training.entity;

public class Person {

	private String name;
	private String city;
	
	public Person() {
	}

	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, city=%s]", name, city);
	}
	
	
}
