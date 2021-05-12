package com.nestedloop;

public class Pattern17 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=1;rows<=5;rows++) {
			for( columns=0;columns<rows;columns++) {
				result += columns + " ";
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
