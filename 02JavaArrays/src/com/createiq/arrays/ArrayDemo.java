package com.createiq.arrays;

public class ArrayDemo {

	public void printElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void printElement(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {

//		int a=10;
		ArrayDemo arrayDemo = new ArrayDemo();
		int[] values = { 6, 7, 5, 3, 2, 1 };// creating
		// sorting
		// asceding
		// 1,2,3,5,6,7
//i=0; 6=i
		// and desending

//		object[]=values;

//		arrayDemo.printElements(values);
		printElement(values);

//		values = new int[5];// initialization

//		for (int i = 0; i < values.length; i++) {
//			System.out.println(values[i]);
//		}

		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
//		numbers[5] = 6;//
		System.out.println("---------------------");

		arrayDemo.printElements(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for (int number : numbers) {
			System.out.println(number);
		}

		String[] names = { "anil", "kiran", "vani", "raju ", "shiva " };

//		arrayDemo.printElements(names);

//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}

		for (String name : names) {
			System.out.println(name);
		}

	}

}
