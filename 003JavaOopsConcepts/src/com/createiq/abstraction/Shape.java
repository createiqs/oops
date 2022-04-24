package com.createiq.abstraction;

public abstract class Shape {

	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public abstract double area();

	// Concrete methods, non abstract method
	public void display() {
		System.out.println(" i'm non abstract method of abstract class");
	}

	public static void main(String[] args) {
		// anonymous block
//		Shape shape = new Shape() {
//
//			@Override
//			public double area() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
	}

}
