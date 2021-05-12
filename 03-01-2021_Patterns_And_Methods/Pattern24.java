package com.nestedloop;

public class Pattern24 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=1;rows<=5;rows++) {
			for( columns=rows;columns<=5;columns++) {
				result += " ";
			}
			for (int star=1;star<=rows;star++) {
				result += "1 ";
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
