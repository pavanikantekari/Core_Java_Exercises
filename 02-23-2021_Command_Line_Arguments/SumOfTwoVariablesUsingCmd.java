package com.cmd;

public class SumOfTwoVariablesUsingCmd {

	public static void main(String[] args) {

		int number1 = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		int number2 = Integer.parseInt(args[2]) + Integer.parseInt(args[3]);
		System.out.println("Sum of Two variables = " + (number1 + number2));
	}//main closing

}//class closing
