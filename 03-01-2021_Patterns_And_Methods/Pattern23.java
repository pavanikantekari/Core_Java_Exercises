package com.nestedloop;

public class Pattern23 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		int count = 5;
		for( rows=1;rows<=5;rows++) {
			int temp = count;
			for( columns=1;columns<=5;columns++) {
				result += temp-- + " ";
			}
			result +="\n";
			count += 5;
		}
		System.out.println(result);

	}

}
