package com.nestedloop;

public class Pattern7 {

	public static void main(String[] args) {
		int rows,columns;
		int num;
		String result = "";
		for( rows=1;rows<=5;rows++) {
			num = rows;
			for( columns=1;columns<=rows;columns++) {
				result += num++ + " ";
			
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
