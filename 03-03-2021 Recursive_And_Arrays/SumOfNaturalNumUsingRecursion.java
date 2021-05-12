package com.practice;

public class SumOfNaturalNumUsingRecursion {

	
    public static int sumOfNumbers(int num) {
        if (num != 0)
            return num + sumOfNumbers(num - 1);
        else
            return num;
    }
    public static void main(String[] args) {
    	int number = 20;
        int sum = sumOfNumbers(number);
        System.out.println("Sum = " + sum);
        }
	}

