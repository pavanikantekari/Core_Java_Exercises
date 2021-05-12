package com.nestedloop;

public class Pattern18 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=1;rows<=4;rows++) {
			for( columns=1;columns<=4;columns++) {
				if(rows == 1 || rows == 3) {
					result += " 1 ";
				}
				else {
					result += " 0 ";
				}
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
