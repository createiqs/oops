package com.createiq.arrays;

public class SwapingDemo {

	public static int add(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		} else {
			try {
				throw new InvalidNumbersEntered("please enter positive values....");
			} catch (InvalidNumbersEntered e) {
				System.out.println("");
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		SwapingDemo demo = new SwapingDemo();
//		System.out.println(demo.add(4, 4));
//		int total = demo.add(4, 4);
//		System.out.println(total);
//
//		int first = 10;
//
//		int second = 20;
//
//		// first we need a one variable which holds first value
//		System.out.println("before swaping the values: " + first);
//		System.out.println("before swaping the values: " + second);
//
//		int temp = first;
//
//		first = second;
//
//		second = temp;
//
//		System.out.println("after swaping the values: " + first);
//		System.out.println("after swaping the values: " + second);

		System.out.println(add(10, -20));
	}

}
