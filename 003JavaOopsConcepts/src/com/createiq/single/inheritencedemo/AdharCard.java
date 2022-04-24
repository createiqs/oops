package com.createiq.single.inheritencedemo;

public class AdharCard {

	int id;
	String adharRegion;
	String address;

	public void applyRegistration(int id, String reg, String add) {
		this.id = id;
		this.adharRegion = reg;
		this.address = add;
		System.out.println(id + " " + reg + " " + add);
	}

}
