package com.syntax.class08;

import java.util.Scanner;

public class ForLoopHW {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=input.nextLine();
		
		for(int i=1; i<=3; i++) {
			System.out.println("Good afternoon, "+ name+"!");
		}
		

	}

}
