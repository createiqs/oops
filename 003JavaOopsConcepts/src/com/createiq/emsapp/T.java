package com.createiq.emsapp;

public class T  extends Test{
	int i=1000;
	
	public void t() {
		System.out.println(i);
//		i =super.i;
		System.out.println(i);
	}
public static void main(String[] args) {
	T t=new T();
	t.t();
}
}
