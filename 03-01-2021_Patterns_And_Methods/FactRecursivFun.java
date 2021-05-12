package com.nestedloop;

import java.util.Scanner;

public class FactRecursivFun {

	static int fact(int num) {
		if(num == 1) {
			return 1;
		}
		else {
			return num * fact(5);
		}
	}

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}