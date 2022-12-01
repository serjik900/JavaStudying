package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboardComplex {
	public static void main(String [] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Did you solve Reple assignments");
		
		boolean solvedAnyRepls=input.nextBoolean();
		
		if(solvedAnyRepls) {
			System.out.println("How many repls did you solved");
			int noOfReplsSolved=input.nextInt();
			
		if(noOfReplsSolved>=17) {
				System.out.println("You are doing good!");
			}
			else if(noOfReplsSolved>10) {
				System.out.println("You are doing ok!");
		}else {
			System.out.println("You should solve some more Repls");
		
		}}else {
			System.out.println("They are really important");
		}
	
	}
}
