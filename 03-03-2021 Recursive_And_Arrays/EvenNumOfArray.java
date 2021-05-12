package com.array;

import java.util.Scanner;

public class EvenNumOfArray {
	static String evenNumberOfArray(int nums[]) {
		String res = "";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				res += nums[i] + ",";
			}
		}
		return res.substring(0, res.length() - 1);
	}

	public static void main(String[] args) {
		int number[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements ?");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		//System.out.println("Reverse order");
		System.out.println(evenNumberOfArray(number));

	}

}
