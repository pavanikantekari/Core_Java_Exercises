package com.array;

import java.util.Scanner;

public class ReverseArray {
	static int[] reverseArrayElements(int nums[]) {
		int rev[] = new int[nums.length];
		int k=0;
		for (int i=nums.length-1;i >= 0;i--) {
			rev[k] = nums[i];
			k++;
		}
		return rev;
	}

	public static void main(String[] args) {
		int number[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements ?");
		for (int i=0; i< number.length;i++) {
			number[i] = sc.nextInt();
			
		}
		System.out.println("Reverse Order");
		for(int x :reverseArrayElements(number)) {
			System.out.println(x);
		}
		
	}

}
