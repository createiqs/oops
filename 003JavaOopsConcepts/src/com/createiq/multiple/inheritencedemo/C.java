package com.createiq.multiple.inheritencedemo;

public class C extends A {

	public C() {
//		super();
		System.out.println(" c class cunstructor");
	}

	@Override
	public void m1() {
//		super.m1();
		System.out.println(" C class m1 method");
	}

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		System.out.println(c.color);
	}

}
