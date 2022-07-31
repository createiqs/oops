package com.createiq.string.ex;

/**
 * @author srikanth
 *
 */
public class StringUtil {
	
	

	public static int factorial(int number) {
		if (number != 0) {
			return number * factorial(number - 1);
		} else {
			return 1;
		}
	}

	public static int recurson(String input, char search, int index) {
		if (index >= input.length()) {
			return 0;
		}
		int count = 0;
		if (input.charAt(index) == search) {
			count++;
		}
		return count + recurson(input, search, index + 1);

	}

	public static void main(String[] args) {

		int count = 0;
		String s1 = "hello";
		
		char sear='l';
		int cou=0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==sear) {
				cou++;
			}
		}
		System.out.println(sear+" "+ cou);
//
//		System.out.println(s1.subSequence(2, 5));
//		System.out.println(s1.charAt(2));
//		System.out.println(s1.indexOf("o"));
//		System.out.println(s1.valueOf(new Integer(12)));
		boolean isWord = false;
//		int endOfLine = s1.length() - 1;
//		char[] ch = s1.toCharArray();
//
//		if (s1.isEmpty() || s1.isBlank()) {
//			System.out.println("given input is empty");
//		}
//
//		// if character is a letter isword ==true and length should be in range
//		for (int i = 0; i < ch.length; i++) {
//			if (Character.isLetter(ch[i]) && i != endOfLine) {
//				isWord = true;
//			}
//			// if character is not a letter
//			else if (!Character.isLetter(ch[i]) && isWord) {
//				count++;
//				isWord = false;
//
//			} else if (Character.isLetter(ch[i]) && i == endOfLine) {
//				count++;
//			}

//		}
		System.out.println(factorial(4));
		
		System.out.println();

		int result=recurson("hello", 'l', 0);
		System.out.println(result);
		
		
		String s2="hello";
		 
		for(int i=s2.length()-1; i>=0 ;i--) {
			System.out.println(s2);
		}
	}
}
