package com.assignment;

public class SumOfNumUsingRecursion {

	static int sumOfNum(int startValue, int endValue) {
		int sum = 0;
		if (startValue == endValue) {
			return endValue;
		}

		sum += startValue;
		return sum += sumOfNum(startValue + 1, endValue);
	}

	public static void main(String[] args) {

		System.out.println("Sum of Natural Numbers in given range = " + sumOfNum(1, 50));

	}

}
