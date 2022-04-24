package com.createiq.inheritencedemo;

public class Car extends Vehicle {
	// annotation 1.5 version
	@Override
	public void engine() {
		System.out.println(" car engine");
	}

	public static void main(String[] args) {
		Car maruthi = new Car();
		maruthi.engine();
	}

}
