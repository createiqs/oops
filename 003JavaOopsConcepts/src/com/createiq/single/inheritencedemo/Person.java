package com.createiq.single.inheritencedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person extends AdharCard {
	String firstName;
	String lastName;
	Date dateOfBirth;

	public Person(String firstName, String lastName, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public void applyRegistration(int id, String reg, String add) {
		super.applyRegistration(id, reg, add);
	}

	public void display() {
		System.out.println(firstName + " " + lastName + " " + dateOfBirth);
	}

	public static void main(String[] args) throws ParseException {
//		String dateOfbirth = "";
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateOfbirth = "12/12/1990";
		formatter.parse(dateOfbirth);
		System.out.println(dateOfbirth);
//		date.parse(dateOfbirth);
		Person anil = new Person("anil", "b", new Date(dateOfbirth));
		anil.applyRegistration(123456, "Telangana", "Hyd");
		System.out.println(anil);
		anil.display();

	}

}
