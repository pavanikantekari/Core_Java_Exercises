package com.practice;

public class ReverseOfGivenNum {

	static int reverseOfNUmber(int number) {
		int rem = 0, rev = 0;
		while (number > 0) {
			rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
		} // while close
		return rev;
	}

	public static void main(String[] args) {

		System.out.println(reverseOfNUmber(153));

	}

}
