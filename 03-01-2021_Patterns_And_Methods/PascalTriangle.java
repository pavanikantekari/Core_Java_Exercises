package com.nestedloop;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Iteration");
		int Iteration = 4;
		String left = "";
		String right = "";
		String spaces = "                 ";
		for(int i=1;i<= Iteration;i++){
			System.out.println(spaces.substring(0,Iteration-1));
			System.out.println(left + i + right);
			left += i;
			right = i + right;
		}
	}

}
