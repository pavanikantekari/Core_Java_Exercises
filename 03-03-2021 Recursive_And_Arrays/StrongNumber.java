package com.assignment;

public class StrongNumber {

	static String isStrong(int num) {
		int copy = num;
		String res = " ";
		if (copy == sumOfFact(145)) {
			res += copy + " is strong number";
		} else {
			res += copy + " is not strong number";
		}
		return res;
	}

	static int sumOfFact(int num) {

		int sum = 0;
		while (num != 0) {
			int fact = 1;
			int digit = num % 10;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;

			}
			sum += fact;
			num = num / 10;
		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println(sumOfFact(145));
		System.out.println(isStrong(145));

	}

}
