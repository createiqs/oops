package com.createiq.abstraction;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;
	}

	public abstract void eat();

	public abstract void sleep();

	public void test() {
		System.out.println(" iam a non abstract method....");
	}
}
