package com.nestedloop;

import java.util.Scanner;

public class PrimeNumInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter start and end value:");
		int startValue = sc.nextInt();
		int endValue = sc.nextInt();
		String res = "";
		for(int num = startValue; num <= endValue;num++) {
		int i=2,flag =0;
		while(i < num/2) {          //startvalue in place num
			if(num % i == 0) {      //startvalue in place num
				flag++;
				break;
			}
			i++;
			
		}
		if(flag == 0) {
			res +=num + ",";
		}
		
			
		}
		System.out.println(res.substring(0,res.length()-1));
	}

}
