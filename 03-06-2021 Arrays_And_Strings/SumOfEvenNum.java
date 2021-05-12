package com.arrays;

import java.util.Scanner;

public class SumOfEvenNum {

		static int getSumOfEvenNumbers(int[] arrayEle) {
			int sum = 0;
			String result = "";
			if(arrayEle.length != 0) {
				for (int i = 0; i < arrayEle.length; i++) {
					if(arrayEle[i] < 0) {
						sum = -1 ;
						break;
					}
					else if (arrayEle[i] == 0) {
						sum = -2 ;
						break;
					}
					else {
						if(arrayEle[i] % 2 == 0) {
							sum += arrayEle[i];
						}
					}
				}
				
			}
			else {
				sum = -3;
			}
			return sum;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size Of Array");
			int size = sc.nextInt();
			int[] arrayEle = new int[size];
			System.out.println("Enter Array Elements");
			for (int i = 0; i < arrayEle.length; i++) {
				arrayEle[i] = sc.nextInt();
			}
			
			System.out.println(getSumOfEvenNumbers(arrayEle)); // Passing arguments To method and print
			
		} // Main close

	} // Class close

	