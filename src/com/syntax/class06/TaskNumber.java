package com.syntax.class06;

import java.util.Scanner;

public class TaskNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=input.nextInt();
	 if((num>1)&& (num<10)) {
		System.out.println("small number");
	}else if((num>11) && (num<100)) {
		System.out.println("Medium number");
	}else if((num>100) && (num<1000)) {
		System.out.println("number is large");
	}
	}
}
