package com.createiq.finalkeyword;

public   class Demo {

	// method overloading
	public static  void m1() {
		System.out.println("static  method");
	}
	
	public static  void m1(int a) {
		System.out.println("static  method");
	}
	public static  void m1(int a, int b) {
		System.out.println("static  method");
	}
	

	public static void main(String[] args) {
		final int value = 122;
//		  value=140;
		System.out.println(value);
	}

}
