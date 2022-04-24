package com.createiq.inheritencedemo;

public class Bike extends Vehicle {

	@Override
	public void engine() {
		System.out.println(" bike engine");
	}

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.engine();
	}

}
