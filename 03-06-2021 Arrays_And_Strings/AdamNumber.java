package com.arrays;

import java.util.Scanner;

public class AdamNumber {

		static boolean isAdamNumber(int number) {
			boolean b = false;
		    
		    int multilplication1 = number * number ;
		    int multilplication2 = getReverse(number) * getReverse(number) ;
		    
			    if(multilplication1 == getReverse(multilplication2)) {
			    	b = true;
			    }
			return b;		
		} // IsAdam method close
		
		static int getReverse(int number) {
			String str = String.valueOf(number); // Convert int to String
			StringBuffer sb = new StringBuffer(str); // convert string to StringBuffer
			str = sb.reverse().toString();  // Reverse the String Stored in String 
		    int reverseNum = Integer.parseInt(str);  // convert String to integer
			return reverseNum;		
		} // getRevere Close

		public static void main(String[] args) {
			System.out.println("Enter Number to Check Adam Number");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			System.out.println("IS The Given Numbers is ADAM Number ? "+ isAdamNumber(number));

		} // main close

	} // class close

