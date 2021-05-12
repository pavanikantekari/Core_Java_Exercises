package com.array;

public class SubtractionMatrix {
	static int[][] sum(int a[][],int b[][]) {
		int c[][] = new int[2][2];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int a[][] = {{1,2},{3,4}};
		int b[][] = {{3,9},{9,2}};
		int res[][] = sum(a,b);
		for(int i=0;i< res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.println(res[i][j] + " ");
				
			}
		}
		
	}

}
