package com.nestedloop;

public class Pattern4 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=1;rows<=5;rows++) {
			for( columns=1;columns<=5;columns++) {
				result += rows + " ";
			}
			result +="\n";
		}
		System.out.println(result);
	}

}
