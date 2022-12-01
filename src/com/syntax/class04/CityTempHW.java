package com.syntax.class04;

import java.util.Scanner;

public class CityTempHW {
public static void main(String[]args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("What is your age ");
	int age=scanner.nextInt();//we use next.Int if we need int type of data
	
	
	if(age<18) {
		System.out.println("You should study");
	}else {
		System.out.println("You should work");
	}
	
}
}
