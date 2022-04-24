package com.createiq.arrays;

public class Test {

	public static void main(String[] args) {

		int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

//			for(int i=1; i<integers.length; i++) {
//				boolean isPrime=true;
//				for (int j=2; j<i; j++) {
//					if(i%j==0) {
//						isPrime=false;
//						break;
//					}
//				}
//				if(isPrime) 
//					System.out.print(i+" ,");
//			}

		int max = 0;
		int min = 0;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > max)
				max = integers[i];
		}
		System.out.println(max);

		for (int i = 0; i < integers.length; i++) {
			if (integers[i] < min)
				integers[i]=	min ;
		}
		System.out.println(min);
	}

}
