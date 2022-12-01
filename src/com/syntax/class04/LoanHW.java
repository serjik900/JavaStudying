package com.syntax.class04;

import java.util.Scanner;

public class LoanHW {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("How much money do you need for the loan?");
		double money=scanner.nextDouble();
		if(money<=200000) {
			System.out.println("Ok. Your loan been approved!");
		}else {
			System.out.println("Your loan been declined!");
		}
	}

}
