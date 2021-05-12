package com.nestedloop;

import java.util.Scanner;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String result = " ";
		int num = sc.nextInt();
		int sum = 0;
		int copy = num;
		int length = String.valueOf(num).length();
		while (num > 0) {
			int digit = num % 10;
			sum = (int) (sum + Math.pow(digit,length ));
			num = num / 10;
		}
		if (copy == sum) {
			result += copy + " is an Armstrong "; 
		}
		System.out.println(result);
	}
	
}
	





