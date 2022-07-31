package com.createiq.string.ex;

/**
 * @author srikanth
 *
 */
public class VowelFinder {
	

	public static int isVowel(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
			if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i'
					|| character == 'I' || character == 'o' || character == 'O' || character == 'u'
					|| character == 'U') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "welcome to java programming";

	}

}
