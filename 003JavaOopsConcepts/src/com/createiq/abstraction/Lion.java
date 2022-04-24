package com.createiq.abstraction;

public class Lion extends Animal {

	public Lion(String name) {
		super(name);

	}

	@Override
	public void eat() {
		System.out.println(getName() + " eating......");

	}

	@Override
	public void sleep() {
		System.out.println(getName() + " sleeping......");
	}

	public void roar() {
		System.out.println(getName() + " lions are roaring...");
	}

}
