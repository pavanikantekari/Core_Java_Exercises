package com.nestedloop;

public class pattern21 {

	public static void main(String[] args) {

		int rows, columns;
		String res = "";
		for (rows = 1; rows <= 5; rows++) {
			for (columns = 1; columns <= 5; columns++) {
				if (rows == 1 || rows == 5 || columns == 1 || columns == 5) {
					res += " 1 ";
				}
				else {
					res += "   ";
			    }
			}
			res += "\r";
		}
		System.out.println(res);
	}

}
