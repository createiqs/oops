package com.createiq.overloading;

public class MethodChaining {

	public static void m1() {
		System.out.println(" m1 method...");
	}

	public static void m2() {
		m1();
		System.out.println(" m2 method...");
	}

	public static void m3() {
		m2();
		System.out.println(" m3 method...");
	}
	
	public static void main(String[] args) {
		m3();
	}
}
