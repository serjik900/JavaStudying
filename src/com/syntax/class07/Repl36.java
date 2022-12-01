package com.syntax.class07;

import java.util.Scanner;

public class Repl36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		System.out.println("Please enter two numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		if ((str1 == str2) || (num1 == num2)) {
			System.out.println("AND");
		} else if ((num1 == num2) && (str1 == str2)) {
			System.out.println("OR");
		} else if ((num1 != num2) && (str1 != str2)) {
			System.out.println("NONE");
		}

	}

}
