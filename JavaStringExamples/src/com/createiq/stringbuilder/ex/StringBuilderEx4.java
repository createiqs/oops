package com.createiq.stringbuilder.ex;

public class StringBuilderEx4 {
	public static void main(String[] args) {
//		CreateIQ
		StringBuilder str=new StringBuilder("CreateIQ");
		int ind1=str.indexOf("Tech"); //ind1=-1
		int ind2=str.indexOf("Create"); //ind2= 0
		System.out.println("ind1 "+ind1);
		System.out.println("ind2 "+ind2);
	}

}
