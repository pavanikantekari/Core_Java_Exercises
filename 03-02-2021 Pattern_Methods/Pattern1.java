package com.nestedloop;

public class Pattern1 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=1;rows<=5;rows++) {
			for( columns=1;columns<=5;columns++) {
				result += columns + " ";
			}
			result +="\n";
		}
		System.out.println(result);
	}

}
