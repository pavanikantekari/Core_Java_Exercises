package com.nestedloop;

public class Pattern6 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=5;rows>=1;rows--) {
			for( columns=5;columns>=rows;columns--) {
				result += rows + " ";
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
