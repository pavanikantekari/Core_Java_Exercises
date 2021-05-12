package com.nestedloop;

public class Pattern5 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=5;rows>=1;rows--) {
			for( columns=5;columns>=1;columns--) {
				result += rows + " ";
			}
			result +="\n";
		}
		System.out.println(result);
	}

}
