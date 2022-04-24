package com.createiq.methodoverloading;

public class Shape {

	public double area(double l, double w) {
		double area = l * w;
		System.out.println("rectangle area: " + area);
		return area;
	}

	public double area(double r) {
		final double pi = 3.14;
		double area = pi * (r * r);
		System.out.println("circle area : " + area);
		int result = (int) area;
		return result;
	}

	public double area() {
		double s = 40;
		double area = s * s;
		System.out.println("sqaure area: " + area);
		return area;
	}

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area();
		shape.area(110.00);
		shape.area(20, 40);
	}

}
