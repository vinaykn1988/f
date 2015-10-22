package com.brillio.training.enitiy;

public class Circle implements Shape {

	private double radius;
	
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public void printArea() {

		double area;
		area = PI*radius*radius;
		
		System.out.printf("Radius = %.2f", radius);
		System.out.printf("Area + %.2f", area);
		System.out.println(".........");
	}

}
