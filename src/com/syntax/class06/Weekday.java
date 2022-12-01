package com.syntax.class06;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("What number of the day of the week today?");
		int day= input.nextInt();
		if((day==1) || (day==2) || (day==3) || (day==4) || (day==5)) {
			System.out.println("Its a week day!");
		}else if((day==6)||(day==7)) {
			System.out.println("Its a weekend");
		}else {
			System.out.println("invalid day");
		}
				
	}

}
