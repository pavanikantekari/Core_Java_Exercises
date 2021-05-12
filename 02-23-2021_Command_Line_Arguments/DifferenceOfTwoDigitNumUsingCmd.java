package com.cmd;

public class DifferenceOfTwoDigitNumUsingCmd {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int firstDigit = number / 10;
		int secondDigit = number % 10;
		System.out.println("Difference of Two Digits = " + Math.abs(firstDigit - secondDigit));

	}//main closing

}//class closing
