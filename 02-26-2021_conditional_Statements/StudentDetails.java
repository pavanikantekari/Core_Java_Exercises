package com.cmd1;

public class StudentDetails {

	public static void main(String[] args) {

		int telugu = Integer.parseInt(args[0]);
		int hindi = Integer.parseInt(args[1]);
		int english = Integer.parseInt(args[2]);
		int maths = Integer.parseInt(args[3]);
		int science = Integer.parseInt(args[4]);
		int social = Integer.parseInt(args[5]);
		String grade = "fail";
		int sum = telugu + hindi + english + maths + science + social;
		int average = sum / 6;
		double percentage = (double) (sum * 100) / 600;
		if (telugu >= 35 && hindi >= 35 && english >= 35 && maths >= 35 && science >= 35 && social >= 35) {

			if (percentage >= 90) {
				grade = "A+";
			} else if (percentage >= 80 && percentage <= 80) {
				grade = "A";
			} else if (percentage >= 70 && percentage <= 79) {
				grade = "B";
			} else if (percentage >= 60 && percentage <= 69) {
				grade = "C";
			} else if (percentage >= 50 && percentage <= 59) {
				grade = "D";
			} else {
				grade = "E";
			}
		}

		System.out.println(
				"Total marks = " + sum + "\nThe average marks by student = " + average + "\nGrade is = " + grade);
	}

}
