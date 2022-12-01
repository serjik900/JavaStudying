package com.syntax.class04;

import java.util.Scanner;

public class InpuFromKeyboard4 {
public static void main(String [] args) {
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Please enter your name!");
	
	 String name=input.nextLine();
	 System.out.println("Enter your age");
	 int age=input.nextInt();
	 System.out.println("Hi"+name+" your age is "+age+". I don`t care!");
}
}
