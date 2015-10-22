package com.brillio.training.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

	private int id;
	private String name;
	private Date birthDate;
	private String city;
	

	public Customer() {
	}
	
	public Customer(int id, String name, String input, String city) {
		this.id = id;
		this.name = name;
		this.birthDate = stringToDate(input);
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String input) {
		this.birthDate = stringToDate(input);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	private static Date stringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(input);
		}
		
		catch (ParseException e) {
			return null;
		}
	}
	
	
	
}



