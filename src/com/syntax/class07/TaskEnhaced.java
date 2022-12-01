package com.syntax.class07;

import java.util.Scanner;

public class TaskEnhaced {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
	System.out.println("What month you were born? ");
	String season=input.nextLine();
	String s=null;
	
	if (season.equals("January") ||season.equals("February") || season.equals("December")) {
		s="Winter";
	}else if(season.equals("March") || season.equals("April")||season.equals("May")) {
		s= "Spring";
	}else if(season.equals("June") || season.equals("july") ||season.equals("August")) {
		s="Summer";
	}else if(season.equals("September") || season.equals("October") ||season.equals("November")) {
		s="fall";
		
	}else {
		System.out.println("invalid");
	}
System.out.println(s);
		}

		
			
		}