package com.nestedloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String result = " ";
		int startValue = sc.nextInt();
		int endValue = sc.nextInt();
		int sum ;
		int copy;
		for(int num = startValue; num <= endValue;num++) {
			 copy = num; sum = 0;
		int length = String.valueOf(num).length();
		while (num > 0) {
			int digit = num % 10;
			sum = (int) (sum + Math.pow(digit,length ));
			num = num / 10;
		}
		if (copy == sum) {
			result += sum + " "; 
		}
		}
		
		System.out.println(result);
	}
	

}
