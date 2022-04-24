package com.createiq.inheritencedemo;

import com.createiq.accessmodifiers.Account;

public class Vehicle {

	public void engine() {
		System.out.println("vehicle engine");
	}

	public void wheels() {
		System.out.println("vehicle wheels");
	}

	public void breaks() {
		System.out.println("vehicle breaks");
	}

	public static void main(String[] args) {
		Account account = new Account();
//		account.deposit();
	}

}
