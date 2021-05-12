package com.nestedloop;

public class pattern10 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		char ch = 65;
		for( rows=1;rows<=5;rows++) {
			for( columns=1;columns<=rows;columns++) {
				result += ch + " ";
				ch++;
			}
			result +="\n";
		}
		System.out.println(result);
	}

}
