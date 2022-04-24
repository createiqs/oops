package com.createiq.encapsulation;

public class Account {
// data hiding
	// read only or write only operations
	// easily test the functionality
	// security
	private int acno;
	private String acName;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int acno, String acName, double balance) {
		this.acno = acno;
		this.acName = acName;
		this.balance = balance;

	}

	// deposit and withdraw

	public void deposit(double amount) throws InvalidAmount {
		if (amount <= 0) {
//			System.out.println(" invalid amount, please deposit above  zero amount");
			throw new InvalidAmount(" invalid amount, please deposit minimum amount ");
		}
		this.balance += amount;
	}

	public double withDraw(double amount) throws InvalidAmount {
		if (amount <= 0) {
//			System.out.println(" invalid amount");
			throw new InvalidAmount(" invalid amount, please deposit minimum   amount ");
		}
		if (balance <= 0) {
			throw new InvalidAmount(" insufficient funds");
		}
		balance = balance - amount;
		return balance;
	}

	public void balanceEnquiry() {
		System.out.println(this.balance);
	}

//	public void setAcNo(int acno) {
//		this.acno = acno;
//	}

	// read only
	public int getAcNo() {
		return acno;
	}

	public void setAcName(String name) {
		acName = name;
	}

	public String getAcName() {
		return this.acName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//	@Override
//	public String toString() {
//		return "Account [acno=" + acno + ", acName=" + acName + ", balance=" + balance + "]";
//	}

	public static void main(String[] args) {
//		Account account = new Account();
//		account.acno = 1123345;
//		account.acName = "anil";
//		account.balance = 10000.00;
//		System.out.println(account.hashCode());
//		System.out.println(account);
		Account account = new Account(12345, "anil", 10000.00);

		System.out.println(account.getAcName() + "  " + account.getBalance());
		account.setAcName("anil b");
		System.out.println(account.getAcName() + "  " + account.getBalance());

	}

	public double getBalance() {
		return this.balance;
	}

	// use encapsulation--> apply
	// today task minimum 5 examples
	// create a car, vehicle, bank, account,
	// athelte--> cricket, football, runner

}
