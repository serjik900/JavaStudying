package com.syntax.class07;

import java.util.Scanner;
public class HWLanguage {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade = input.next().charAt(0);
		String result;
		switch (grade) {
		case 'A':
			result = "Exellent";
			break;
		case 'B':
			result = "Good";
			break;
		case 'C':
			result = "Average";
			break;
		case 'D':
			result = "Bad";
			break;
		default:
			result = "Not acceptable";
			break;
		}
		System.out.println(result);

	}
}
