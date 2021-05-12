package com.nestedloop;

public class Pattern11 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=1;rows<=5;rows++) {
			for( columns=1;columns<=5;columns++) {
				result += " * " + " ";
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
