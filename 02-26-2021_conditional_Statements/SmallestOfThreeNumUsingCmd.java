package com.cmd1;

public class SmallestOfThreeNumUsingCmd {

	public static void main(String[] args) {

		String res = "";
		if (args.length != 3) {
			res += "Invalid Arguments \n";
			res += "Enter three values";
			System.out.println(res);
			return;
		}

		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		int thirdNum = Integer.parseInt(args[2]);

		if (firstNum < secondNum) {
			if (firstNum < thirdNum) {
				res = firstNum + " is small";
			} else {
				res = thirdNum + "is small";
			}
		}

		else if (secondNum < thirdNum) {
			res = secondNum + "is small";
		} else {
			res = thirdNum + "is small";
		}
	}
}
