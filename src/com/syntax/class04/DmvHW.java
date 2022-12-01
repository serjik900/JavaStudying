package com.syntax.class04;

import java.util.Scanner;

public class DmvHW {

	public static void main(String[] args) {

Scanner scanner= new Scanner(System.in);
System.out.println("Hi! How old are you?");
int age=scanner.nextInt();
if(age>=18) {
	System.out.println("I`m issuing a DL for you!");
}else {
	System.out.println("YOu have to get a permit!");
}

	}

}
