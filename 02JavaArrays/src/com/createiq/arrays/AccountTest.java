package com.createiq.arrays;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
//		account.acno=1000;
		account.setAcno(1000);
		account.setName("anil");
		account.setBalance(10000.00);
		System.out.println(account);

	}
}
