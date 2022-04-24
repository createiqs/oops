package com.createiq.constructors;

import com.createiq.accessmodifiers.AccessModifiersDemo;
import com.createiq.accessmodifiers.Account;

public class Student {

	// identity
	int id;
	String name;
	double fee;
	static String COLLEGE_NAME = "kakatiya university";

	static {
		System.out.println("db connection is created...");
	}

// 1. default constructor
   public  Student() {
		
		System.out.println("default constructor........");
	}

	// 2. parameterized constructor
	public Student(int sid, String sname, double sfee) {
//		this();
		System.out.println("parameterized constructor........");
		id = sid;
		name = sname;
		fee = sfee;
	}

	public Student(String name, double fee) {
		this.name = name;
		this.fee = fee;
	}

//	public Student( double fee, String name ) {
//		this.name=name;
//		this.fee=fee;
//	}

	public void display() {
		System.out.println(id + "  " + name + " " + fee + " " + COLLEGE_NAME);
	}

	public void getNameAndFee() {
		System.out.println(name + "  " + fee);
	}

	public static void main(String[] args) {
		Account account = new Account();
		account.acno = 202112345;
		account.acName = "anil";
		account.balance = 2000.00;
		
		Student student = new Student();
		student.id = 100;
		student.name = "anil";
		student.fee = 15000.00;
		System.out.println(student);
		student.display();

//		Student student2 = new Student(101, "balu", 12000.00);
//		student2.display();
//		
//		Student student3=new Student("raj", 11000.00);
//		student3.getNameAndFee();
//		AccessModifiersDemo demo=new AccessModifiersDemo();
//		demo.test();
	}

}
