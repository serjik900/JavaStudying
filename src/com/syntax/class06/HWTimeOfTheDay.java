package com.syntax.class06;

import java.util.Scanner;

public class HWTimeOfTheDay {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input current time in 24 hour format");
		int hour=input.nextInt();
		if(hour>=1 && hour<=11) { 
			System.out.println("Morning!");
		}else if(hour>=12 && hour<=15) {
			System.out.println("Afternoon");
		}else if(hour>=16 && hour<=20) {
			System.out.println("Evening");
		}else if (hour>=21 && hour<=24) {
		System.out.println("Night");
	}
	}	
}


