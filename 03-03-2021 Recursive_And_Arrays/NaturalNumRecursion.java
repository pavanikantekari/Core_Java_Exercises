package com.practice;

import java.util.Scanner;

public class NaturalNumRecursion {

	static String naturalNumbers(int startValue, int endValue) {
		// Scanner sc = new Scanner(System.in);
		// startValue = sc.nextInt();
		// endValue = sc.nextInt();
		String res = " ";
		
		if (endValue == startValue) {
			return endValue +"";
		}
		res += startValue;
		// Num = Num +1;

		return res + " " + naturalNumbers(startValue+1, endValue);
	
	}

	public static void main(String[] args) {

		System.out.println(naturalNumbers(10, 15));

	}

}
