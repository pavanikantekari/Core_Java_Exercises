package com.arrays;

import java.util.Scanner;

public class NearestMinimumValue {

	static int getNearestMinValue(int[] arrayEle) {
		int nearestNum = 0;
		int minNum = arrayEle[0];
		for (int i = 1; i < arrayEle.length; i++) {
			if (arrayEle[i] < minNum) {
				minNum = arrayEle[i];
			}

			nearestNum = minNum - 1;
		}

		return nearestNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		int[] arrayEle = new int[5];
		for (int i = 0; i < arrayEle.length; i++) {
			arrayEle[i] = sc.nextInt();
		}

		System.out.println("Nearest VAlue In Given Array : " + getNearestMinValue(arrayEle));

	} // Main Close

} // class Close
