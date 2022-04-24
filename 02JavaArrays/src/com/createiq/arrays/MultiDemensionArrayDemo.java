package com.createiq.arrays;

public class MultiDemensionArrayDemo {
	public static void main(String[] args) {
		int[][] numbers = new int[3][2];
		System.out.println(numbers.length);
		numbers[0][0] = 1;
		numbers[0][1] = 2;
//		numbers[0][2] = 3;

		numbers[1][0] = 4;
		numbers[1][1] = 5;
//		numbers[1][2] = 6;
		
		numbers[2][0] = 7;
		numbers[2][1] = 8;
//		numbers[2][2] = 9;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+"  ");
			}
			System.out.println();
		}

		System.out.println("----------------------");

		int[][] values = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < values.length; i++) {

			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
