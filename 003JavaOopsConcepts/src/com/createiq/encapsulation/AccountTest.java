package com.createiq.encapsulation;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args)  {
		Account account = new Account(12345, "anil", 0.00);
//		try {
//		account.deposit(0.00);
//		account.balanceEnquiry();
//		} catch (InvalidAmount ia) {
//			try {
//			 ia.printStackTrace();
//			}catch(Exception e) {
//				System.out.println(" please enter a valid amount");
//			}
//		}
		Scanner scanner = new Scanner(System.in);
		String option = "";
		do {
			System.out.println("choose one option");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. BalanceEnquiry");

			System.out.println("Enter here");
			option = scanner.next();
			switch (option) {
			case "1": {
				System.out.println("Enter deposit amount: ");
				String s = scanner.next();
				double amount = Double.parseDouble(s);
				account.deposit(amount);
				account.balanceEnquiry();
				break;
			}
			case "2": {
				System.out.println("Enter with draw amount: ");
				String s = scanner.next();
				double amount = Double.parseDouble(s);
				account.withDraw(amount);
//				double result=
//				System.out.println(result);
				account.balanceEnquiry();
				break;
			}
			case "3": {
				account.balanceEnquiry();
				break;
			}
			default:
				System.out.println(" invalid option");
				break;
			}
			System.out.println("do you want to continue: (yes/no)");
			option = scanner.next();
		} while (option.equalsIgnoreCase("yes"));
//		account.balanceEnquiry();
//		account.deposit(1000.00);
//		account.balanceEnquiry();
//		account.deposit(0.00);
//		account.balanceEnquiry();
		
//		account.withDraw(5000.00);
//		account.balanceEnquiry();
//		account.withDraw(0.00);
//		account.balanceEnquiry();

		// use scanner class to read and write operations
		// choose the options--->case 1. deposit, 2. withdraw, 3. balanceenquiry
	}

}
