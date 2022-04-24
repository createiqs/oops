package com.createiq.abstraction;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);

	}

	@Override
	public void eat() {
		System.out.println(getName() + "  feeding......");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + " rest...........");

	}

	public abstract void fly();
	
	

}
