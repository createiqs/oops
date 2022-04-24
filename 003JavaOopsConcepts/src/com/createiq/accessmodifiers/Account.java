package com.createiq.accessmodifiers;

public class Account {
	// instance variables
	public int acno;
	public String acName;
	public double balance;

	public Account() {
		System.out.println("default....");
	}

	protected void deposit() {
		System.out.println("deposit");
	}

	public static void main(String[] args) {
		Account account = new Account();
		account.acno = 202112345;
		account.acName = "anil";
		account.balance = 2000.00;
	}

}
