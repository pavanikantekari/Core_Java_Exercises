package com.nestedloop;

import java.util.Scanner;

class IsPrime {
	static String res = "";

	static void isPrime(int num) {
		int i = 2, flag = 0;
		while (i <= num / 2) {
			if (num % i == 0) {
				flag++;
				break;
			}
			i++;
		}
		if (flag == 0) {
			res += num + " is prime ";
		} else {
			res += num + " is not prime";
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int number = sc.nextInt();
		isPrime(number);
	}

}
