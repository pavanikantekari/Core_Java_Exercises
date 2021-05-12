package com.arrays;

import java.util.Scanner;

public class OccurenceCounter {

	static int getCount(int[] inputArray, int givenNumber) {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (givenNumber == Math.abs(inputArray[i])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter Input Arrayas");
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		// Insert elements into Array
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		System.out.println("Enter Number to find Ocuurence");
		int number = sc.nextInt();
		System.out.println("Occurence Of Given Number in : " + getCount(input, number));

	}

}
