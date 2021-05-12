package com.nestedloop;

public class Pattern19 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		int count = 16;
		for( rows=1;rows<=4;rows++) {
			for( columns=1;columns<=4;columns++) {
				result += count-- + " ";
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
