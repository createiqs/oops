package com.createiq.abstraction;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);

	}

	@Override
	public void fly() {
		System.out.println(getName() + " i can't fly used swim only....");
	}

	public static void main(String[] args) {
		Penguin penguin = new Penguin("penguin");
		penguin.eat();
		penguin.sleep();
		penguin.fly();
	}

}
