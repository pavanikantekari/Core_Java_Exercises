package com.nestedloop;

public class Pattern25 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		int count = 10;
		for( rows=1;rows<=4;rows++) {
			for( columns=4;columns>=rows;columns--) {
				result += count-- + " ";
			}
			result +="\n";
		}
		System.out.println(result);
	}

}
