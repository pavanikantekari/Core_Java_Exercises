package com.nestedloop;

import java.util.Scanner;

public class RussianMul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values:");
		int firstNum = sc.nextInt();
		int secNum = sc.nextInt();
		String res = firstNum + " : " + secNum + " \n ";
		int total = 0;
		if (firstNum % 2 != 0) {
			total += secNum;
			
		}
		while(firstNum > 1 ) {
			firstNum = firstNum /2 ;
			secNum = secNum * 2;
			res += firstNum + " : " +secNum + "\n";
			if (firstNum % 2 != 0) {
				total += secNum;
			}
		}
		System.out.println(res);
		System.out.println("Product:" + total);
	}

}
