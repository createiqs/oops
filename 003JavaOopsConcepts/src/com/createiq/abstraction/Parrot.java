package com.createiq.abstraction;

public class Parrot extends Bird {

	public Parrot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
	System.out.println(getName()+" flying...........");
	}

}
