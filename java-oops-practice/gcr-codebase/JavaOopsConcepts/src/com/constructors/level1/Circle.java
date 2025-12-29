package com.constructors.level1;

public class Circle {
	double radius;
	
	public Circle() {
		this(2.6);		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	void getRadius() {
		System.out.println("Radius : " + radius);
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.getRadius();
		Circle c2 = new Circle(554);	
		c2.getRadius();
	}
}
