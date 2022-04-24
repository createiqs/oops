package com.createiq.overloading;

public class Shape {

	// constructor overloading........
	public Shape() {
		System.out.println(" default constructor.......");
	}

	public Shape(int x) {
		System.out.println(x);
	}

	public Shape(int x, int y) {
		System.out.println(x + y);
	}

	// circle, square, rectangle, pyramid
   // method overloading
	public void area() {
		System.out.println("sqaure area");

	}

	public void area(double r) {
		System.out.println("rectangle area");

	}

	public double area(double r, double pi) {
		System.out.println("circle area");
		double area = pi * (r * r);
		return area;
	}

}
