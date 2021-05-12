package com.practice;

public class CountNumOfDigits {

	static String countOfDigit(int number) {
		String res = "";
		int count = 0;
		while (number > 0) {
			count++;
		
			number = number /10;
		}
		return  "count = " + count;
	}
	

	public static void main(String[] args) {
		System.out.println(countOfDigit(1537));

	}

}
