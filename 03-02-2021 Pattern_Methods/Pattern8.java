package com.nestedloop;

public class Pattern8 {

	public static void main(String[] args) {
		int rows, columns;
		int num = 1;
		String result = "";
		for (rows = 1; rows <= 5; rows++) {
			
			for (columns = 1; columns <= rows; columns++) {
				result += num++ + " ";

			}
			result += "\n";
		}
		System.out.println(result);
	}

}
