package com.cmd;

public class SumOfTwoDigitNumUsingCmd {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int firstDigit = number / 10;
		int secondDigit = number % 10;
		System.out.println("Sum of Two Digits = " + (firstDigit + secondDigit));

	}// main closing

}// class closing
