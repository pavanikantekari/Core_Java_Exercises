package com.nestedloop;

public class Pattern20 {

	public static void main(String[] args) {
		int rows,columns;
		String result = "";
		for( rows=1;rows<=4;rows++) {
			for( columns=1;columns<=4;columns++) {
				if (rows % 2 != 0) {
					if (columns % 2 == 0) {
						result += " 1 ";
					}
					else {
						result += " 0 ";
					}
				}
				else {
					if (columns % 2 == 0) {
						result += " 0 ";
					}
					else {
						result += " 1 ";
					}
				}
			}
			result +="\n";
		}
		System.out.println(result);

	}

}
