package com.assignment;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int[][] arrA = new int[5][5];
		int[][] arrB = new int[5][5];
		int[][] arrC = new int[5][5];
		int row1, coloumn1, row2, coloumn2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A matrix rows and coloumns");
		row1 = sc.nextInt();
		coloumn1 = sc.nextInt();
		System.out.println("Enter B matrix rows and coloumns");
		row2 = sc.nextInt();
		coloumn2 = sc.nextInt();
		if (coloumn1 != row2) {
			System.out.println("Multiplication is not possible");
		} else {
			System.out.println("Enter A matrix elements");
			for (int indexr = 0; indexr < row1; indexr++) {
				for (int indexc = 0; indexc < coloumn1; indexc++) {
					arrA[indexr][indexc] = sc.nextInt();

				}
			}
			System.out.println("Enter B matrix elements");
			for (int indexr = 0; indexr < row2; indexr++) {
				for (int indexc = 0; indexc < coloumn2; indexc++) {
					arrB[indexr][indexc] = sc.nextInt();
				}
			}
			// printing the values from Matrices
			System.out.println("The A Matrix elements are : ");
			for (int indexr = 0; indexr < row1; indexr++) {
				for (int indexc = 0; indexc < coloumn1; indexc++) {
					System.out.print(arrA[indexr][indexc] + " ");
				}
				System.out.println();
			}

			System.out.println("The B Matrix elements are : ");
			for (int indexr = 0; indexr < row2; indexr++) {
				for (int indexc = 0; indexc < coloumn2; indexc++) {
					System.out.print(arrB[indexr][indexc] + " ");
				}
				System.out.println("\n");
			}

			// Matrix Multiplication
			for (int indexr = 0; indexr < row1; indexr++) {
				for (int indexc = 0; indexc < coloumn2; indexc++) {
					arrC[indexr][indexc] = 0;
					for (int indexk = 0; indexk <= (coloumn1 | row2); indexk++) {
						arrC[indexr][indexc] = arrC[indexr][indexc] + (arrA[indexr][indexk] * arrB[indexk][indexc]);
					}
				}
			}
			// printing the resulting matrix
			for (int indexr = 0; indexr < row1; indexr++) {
				for (int indexc = 0; indexc < coloumn2; indexc++) {
					System.out.print(arrC[indexr][indexc] + " ");
				}
				System.out.println();
			}

		}

	}

}