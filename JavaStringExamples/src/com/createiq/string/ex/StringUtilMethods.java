package com.createiq.string.ex;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author srikanth
 *
 */
public class StringUtilMethods {

	// count no of words in given string
	public static int countNoOfWords(String input) {
		int count = 1;
		char ch=input.charAt(0);
		for (int i = 0; i < input.length() - 1; i++) {
			if ((input.charAt(i) == ch) && (input.charAt(i + 1) !=ch)) {
				count++;
			}
		}
		return count;
	}

	// findOccurrences
	public static int find(String input, char search) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == search)
				count++;
		}
		return count;
	}

	// using recursion
	public static int findOccurrences(String input, char search, int index) {
		int count = 0;
		if (index >= input.length())
			return 0;

		if (input.charAt(index) == search)
			count++;

		return count + findOccurrences(input, search, index + 1);
	}

	/// with hashing concept

	public static int countOccurence(String input, char search) {
		int hash_arr[] = new int[26];

		for (int i = 0; i < input.length(); i++) {
			hash_arr[input.charAt(i) - 97]++;
		}
		int result = hash_arr[search - 97];
		return result;
	}

	// with map

	public static int countRepeatedChr(String input, char search) {
		Map<Character, Integer> hash = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (hash.containsKey(input.charAt(i))) {
				hash.put(input.charAt(i), hash.get(input.charAt(i)) + 1);
			} else {
				hash.put(input.charAt(i), 1);
			}
		}

		return hash.get(search);
	}

	// with java 8

	public static long countOccurences(String input, char search) {
		long count = input.chars().filter(c -> c == search).count();
		System.out.println(count);
		// OR
		long count2 = input.codePoints().filter(p -> p == search).count();
		System.out.println(count2);
		return count;

	}

	// capitalize String First Letter

	public static String capitilizeFirstLetter(String input) {

		System.out.println("Original String: " + input);

		String firstLetter = input.substring(0, 1);

		String remLetters = input.substring(1);

		firstLetter = firstLetter.toUpperCase();

		return firstLetter + remLetters;

	}

	// Capitalize String First letter of Each word

	public static String capitalizeEachFirstLetterOfWord(String input) {
		String[] words = input.split("\\s");
		String capitalizeStr = "";
		for (String word : words) {
			String firstLetter = word.substring(0, 1);
			String remLetter = word.substring(1);
			capitalizeStr += firstLetter.toUpperCase() + remLetter + " ";

		}
		return capitalizeStr;

	}

	// find vowels

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

	// find vowels with collection

	public static void isVowelWithSet(String input) {
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (isVowelOrNot(c)) {
				set.add(c);
			}
		}

		System.out.println("Vowels are:");
		for (Character c : set) {
			System.out.print(" " + c);
		}

	}

	public static boolean isVowelOrNot(char character) {
		if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i'
				|| character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U') {
			return true;
		} else {
			return false;
		}

	}

	// reverse a String

	public void reverseAString(String input) {
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.println(input.charAt(i));
		}
	}

	// CharToASCIICast

	public int charToASCIICast(String input) {
		char charAt = input.charAt(1);
		int asciiOf = charAt;
		return asciiOf;
	}

	// CharToASCIICast with tocharArray

	public int charToASCIICastWithToCharArray(String input) {
		char ch = input.toCharArray()[1];
		int asciiOf = ch;
		return asciiOf;
	}

	// CharToASCIIGetBytes
	public void charToASCIIGetBytes(String input) {
		byte[] bytes = input.getBytes(StandardCharsets.US_ASCII);
		System.out.println("Ascii value of e is: " + bytes[1]);

		System.out.println("ASCII values for all characters are:");
		for (byte b : bytes) {
			System.out.print(b + " ");
		}

	}

	// CharToASCIIGetBytes with collection and java 9

	public void charToASCIIUsingIntStream(String input) {
		List<Integer> asciiIntegers = input.chars().boxed().collect(Collectors.toList());

		System.out.println("ASCII values for all characters are:");
		for (int i : asciiIntegers) {
			System.out.print(i + " ");
		}

	}

	// CharToASCIIInt with String builder

	public void charToASCIIIntBuilder(String input) {

		StringBuilder sb = new StringBuilder();
		for (char ch : input.toCharArray()) {
			sb.append((int) ch);
		}

		BigInteger biAscii = new BigInteger(sb.toString());
		System.out.println(biAscii);
	}

	public static void main(String[] args) {
//		countOccurences("aaaaaAAAAbbbbbccd", 'a');
//		System.out.println(capitilizeFirstLetter("hello"));
//		System.out.println(capitalizeEachFirstLetterOfWord("welcome to java programming"));
		System.out.println(countNoOfWords("welcome to java programming"));
	}

}
