package com.syntax.class07;

import java.util.Scanner;

public class HWCalculatorSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers to calculate");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		System.out.println("Enter operation");
		// operators +,-,*,/
		char opr = input.next().charAt(0);
		double result = 0;
		switch (opr) {
		case '+':
			result = (num1 + num2);
			break;
		case '-':
			result = (num1 - num2);
			break;
		case '*':
			result = (num1 * num2);
			break;
		case '/':
			result = (num1 / num2);
		default:
			System.out.println("Enter valid operator");
			break;
		}
		System.out.println(" The result is " + result);
	}
}
