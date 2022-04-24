package com.createiq.arrays;

public class ArrayDemo2 {

	public static void printElement(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int[] sortedIntegersAsc(int[] array) {
		int temp;
		boolean flag = true;
		int[] sortedArray = array;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] > sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}

	public static int[] sortedIntegersdesc(int[] array) {
		int temp;
		boolean flag = true;
		int[] sortedArray = array;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}

	public static void main(String[] args) {

		int[] integers = { 7, 8, 9, 4, 5, 6, 1, 3, 2 };
		int[] results = sortedIntegersAsc(integers);
//		printElement(sorted);
		printElement(results);

		System.out.println();

		int[] sortedDesc = sortedIntegersdesc(integers);
		printElement(sortedDesc);

	}

}
