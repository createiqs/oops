package com.createiq.overloading;

public class Shape2 {
	public Shape2(int x, int y) {
		System.out.println(x + y);
	}

	public Shape2(int x) {
		this(10, 20);
		System.out.println(x);
	}

	// constructor overloading........
	public Shape2() {
		this(5);
		System.out.println(" default constructor.......");
	}

	public static void main(String[] args) {
			Shape2 shpe=new Shape2();
//			Shape2 shpe1=new Shape2(5);
//		Shape2 shpe3 = new Shape2(10, 20);

	}

}
