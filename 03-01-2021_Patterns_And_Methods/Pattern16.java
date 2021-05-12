package com.nestedloop;

public class Pattern16 {

	public static void main(String[] args) {
		int rows,columns;
		int count = 2;
		String result = "";
		for( rows=1;rows<=5;rows++) {
			for( columns=1;columns<=rows;columns++) {
				result +=count+" ";
				count +=2;
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
