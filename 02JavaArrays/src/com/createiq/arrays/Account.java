package com.createiq.arrays;

public class Account {

	private int acno;
	private String name;
	private double balance;

	public Account() {
	}

	public Account(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return this.acno + " " + this.name + " " + this.balance;
	}

	public static void main(String[] args) {
		Account account = new Account(2021088, "anil", 14000.00);
		System.out.println(account);
	}

}
