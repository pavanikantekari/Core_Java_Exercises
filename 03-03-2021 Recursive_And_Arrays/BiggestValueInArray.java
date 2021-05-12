package com.array;

import java.util.Scanner;

public class BiggestValueInArray {

	private static int smallestValue(int[] nums) {
		int result = 0;
		int small = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < small) {
				small = nums[i];
			}
		}

		return small;
	}

	private static int biggestValue(int[] nums) {
		int res = 0;
		int big = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > big) {
				big = nums[i];
			}
		}
		return big;
	}

	public static void main(String[] args) {
		int nums[] = new int[5];
		System.out.println("Enter " + nums.length + " values");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println("Biggest value = " + biggestValue(nums));
		System.out.println("Smallest value = " + smallestValue(nums));
	}

}
