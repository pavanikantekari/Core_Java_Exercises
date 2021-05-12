package com.assignment;

public class IsGivenNumberSquareRoot {
	
	private static String isGivenNumberSquareRoot(int num) {
		String res = " no square root";
		for(int i=0;i<=num;i++) {
			if(i * i == num) {
				res = num +" is squareroot " ;
				break;
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println(isGivenNumberSquareRoot(4));

	}

	
}
