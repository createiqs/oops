package com.createiq.emsapp;

import java.util.ArrayList;

public class Test {
	
	 public static void d( int n) {
		 if(n>=0) {
			 d(n -1);
		 }
		 System.out.println(n);
	 }
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add(" pen");
		a1.add(" pencil");
		a1.add(" paper");
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add("books");
		a2.add("rubber");
		a2.add(" pen");
		a2.add(" paper");
		
		a2.retainAll(a1);
		System.out.println(a1);
		
		
	}

}
