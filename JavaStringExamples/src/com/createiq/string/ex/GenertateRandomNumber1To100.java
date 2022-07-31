package com.createiq.string.ex;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenertateRandomNumber1To100 {

	public static void main(String[] args) {
//		double num = Math.random();
//		int myRandInt = (int) (num * 100 + 1);
//		System.out.println("Random number between 1 to 100: " + myRandInt);

		// OR
//		Random randI = new Random();
//		int myRandInt = randI.ints(1, 101).findAny().getAsInt();
//		System.out.println("Random number between 1 and 100: " + myRandInt);

		// OR
		int myRandInt = ThreadLocalRandom.current().nextInt(1, 101);
		System.out.println("Random number between 1 and 100: " + myRandInt);

	}

}
