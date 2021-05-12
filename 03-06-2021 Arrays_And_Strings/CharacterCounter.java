package com.strings;

import java.util.Scanner;

public class CharacterCounter {

	static int toFind(String words, char ch) {
		int count = 0;
		for (int i = 0; i < words.length(); i++) {
			if(ch == words.charAt(i)) {
				count++;
			}
		}
		if(count >= 0)
			return count;
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentance = scanner.next();
		System.out.println("Enthe the charecter to find repeated times in the sentance: ");
		char ch = scanner.next().charAt(0);
		System.out.println(toFind(sentance, ch));
		scanner.close();
	}
}
