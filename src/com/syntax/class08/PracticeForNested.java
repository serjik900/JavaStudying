package com.syntax.class08;

import java.util.Scanner;

public class PracticeForNested {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Type a number");
		 num = input.nextInt();}
			
				
		while (num!=5); {
			
			if(num<5) {
				System.out.println("Number is too small");
				
			}else if(num>5) {
				System.out.println("Number too big");
			
			}
			
		}System.out.println("5 is prime number");}}
		
		

