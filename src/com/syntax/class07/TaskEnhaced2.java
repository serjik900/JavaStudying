package com.syntax.class07;

import java.util.Scanner;

public class TaskEnhaced2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is your score?");
		int score=input.nextInt();
		
		char sc=0;
		
		if(score>=90) {
			sc='A';
		}else if(score>=70 && score<90) {
			sc='B';
		}else if(score>=50 && score<70) {
			sc='C';
		}else if(score<50) {
			sc='F';
		}System.out.println("Your grade is "+sc);
		

	}

}
