package com.syntax.class06;

import java.util.Scanner;

public class Recap {

	/*
	 * windows:ctr+shift+o mac:cmd+shift+o
	 * formating shift+ctrl+f
	 */

	public static void main(String[] args) {

		int i = 10;
		String str = "Hello";

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");

		// to capture different values, we need to use different options
		String name = input.next();// capturing String
		System.out.println("Nice to meet you " + name);

		System.out.println("How old are you? " + name);
		int age = input.nextInt();// capuring int
		System.out.println(name + " is " + age + " years old");

		System.out.println("How much money you have? " + name);
		double money = input.nextDouble();
		System.out.println(name + " has $ " + money);

		System.out.println(name + " what is your grade?");
		char grade = input.next().charAt(0);
		System.out.println(name + " has grade " + grade);

		System.out.println("End");

	}

}