package com.createiq.abstraction;

public  abstract class Bike {
	
	private static final String REGISTRATION_NUMBER="12354564TVSJupiter";
	private int capacity;
	
	public abstract void startEngine();
	
	public abstract void breakingSysytem();
	
	public abstract void stop();
	
	public void test() {
		System.out.println(" to test the bike");
	}

}
