package com.createiq.constructors;

import com.createiq.accessmodifiers.AccessModifiersDemo;

public class Blocks {

	// instance block
	{
		System.out.println("instance block");
	}

	// static block
	static {
		System.out.println(" i'm static block");

	}
	
	public Blocks() {
	System.out.println("default constructor........");
	}
	
	//static method
	
	public static void test() {
		System.out.println("i'm static method.........");
	}

	public static void main(String[] args) {

		Blocks block=new Blocks();
		test();
	}

}
