package com.string;

import java.util.Scanner;

public class WordsContain {
	static String[] getWordsContainPattern(String[] words, String pattern) {
		String wordsString = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(pattern)) {
				wordsString += words[i] + ",";
			}
		}

		String[] wordsContainPattern = wordsString.substring(0, wordsString.length() - 1).split(",");

		return wordsContainPattern;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number of words: ");
		int size = scanner.nextInt();
		String[] words = new String[size];
		System.out.println("Enter " + size + " words: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scanner.next();
		}
		System.out.println("Enter the pattern you want to search in the words: ");

		for (String x : getWordsContainPattern(words, scanner.next())) {
			System.out.println(x);
		}

		scanner.close();
	}
}
