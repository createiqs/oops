package com.createiq.finalkeyword;

public class FinalChild extends Demo {
	int id;

	// method hiding...............
	public static void m1() {
		// local variable
		int id = 100;
		System.out.println("static method child class");

	}

	public static void main(String[] args) {
		FinalChild fd = new FinalChild();
//		fd.id=120;
		System.out.println(fd.id);
	}

}
