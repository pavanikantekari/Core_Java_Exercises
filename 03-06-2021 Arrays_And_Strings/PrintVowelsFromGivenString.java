package com.string;

import java.util.Scanner;

public class PrintVowelsFromGivenString {

	static String removeVowels(String sentence) {
		String vowels = "";
		for (int i = 0; i < sentence.length(); i++) {
			if ("AEIOU".contains("" + sentence.toUpperCase().charAt(i))) {
				vowels += sentence.charAt(i);
			}
		}
		if (vowels == "") {
			return null;
		}
		return vowels;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any sentence: ");
		String sentence = scanner.nextLine();
		System.out.println(removeVowels(sentence));
		scanner.close();
	}
}
