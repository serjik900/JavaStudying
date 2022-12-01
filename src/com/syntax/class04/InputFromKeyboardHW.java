package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboardHW {

	public static void main(String[] args) {
	
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("From what city are you?");
	String city=scanner.next();
	
	System.out.println("What temperature your city in ? ");
	float temp=scanner.nextFloat();
	temp=(temp-32)*5/9;
	System.out.println("The temperature in "+city+" is "+temp+" Fahrenheit.");
		
	}
		
	}


