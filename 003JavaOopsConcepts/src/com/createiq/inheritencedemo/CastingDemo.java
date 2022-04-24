package com.createiq.inheritencedemo;

public class CastingDemo {
	public static void main(String[] args) {
		byte a =120;
		System.out.println(a);
		// implicit casting
		int b=a;
		System.out.println(b);
		
		// explicit casting 
		int c=10000;
		byte d=(byte)c;
		System.out.println(d);
	}

}
