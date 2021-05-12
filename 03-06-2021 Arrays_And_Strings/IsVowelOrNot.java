package com.string;

import java.io.InputStream;
import java.util.Scanner;

public class IsVowelOrNot {
	
	private static String isVowel(char ch) {
		 String res="";
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			res += ch + " is vowel";
		}
		else {
			res += ch + " is consonant";
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character : ");
		char ch = sc.next().charAt(0);
		System.out.println(isVowel(ch));

}
}
