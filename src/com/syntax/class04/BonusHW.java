package com.syntax.class04;

import java.util.Scanner;

public class BonusHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);

System.out.println("How many years you`ve been working?");

double years=scanner.nextDouble();
if (years>=5) {

System.out.println("You are eligible for bonus. What is you annual salary?");
}else {
	System.out.println("you are not eligible for bonus!");

}

Double money=scanner.nextDouble();

if(money>=50000) {
	System.out.println("Your bonus is 5000");
}else {
	System.out.println("Your bonus is 3000");
}



	}
	}