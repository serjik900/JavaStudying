package com.syntax.class08;

import java.util.Scanner;

public class HWCoffeeDoWhile {

	public static void main(String[] args) {
		
				
		Scanner sc=new Scanner(System.in);
		double coffee=2.5;
		double answer;
		do {
			System.out.println("Pay for the coffee!");
			answer = sc.nextDouble();
			if(answer>coffee) {
				System.out.println("Give less!");
				System.out.println("---------------");
				
			} else if(answer<coffee) {
					System.out.println("Give more!");
					System.out.println("---------------");
					}
		} while (answer!=coffee);
			
		
System.out.println("Enjoy your coffee!");
	}

}
