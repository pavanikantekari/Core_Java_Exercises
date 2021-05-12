package com.nestedloop;

public class Pattern22 {

	public static void main(String[] args) {

		int rows, columns;
		String res = "";
		for (rows = 1; rows <= 5; rows++) {
			for (columns = 1; columns <= 5; columns++) {
				if ( columns == 2 || columns == 4) {
					res += " * ";
				}
				else {
					res += " 1 ";
			    }
			}
			res += "\r";
		}
		System.out.println(res);
	}

}
