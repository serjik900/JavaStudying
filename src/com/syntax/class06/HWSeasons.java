package com.syntax.class06;

import java.util.Scanner;

public class HWSeasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("What month you were born? ");
String season=input.nextLine();
if (season.equals("January") ||season.equals("February") || season.equals("December")) {
	System.out.println("You were born in Winter");
}else if(season.equals("March") || season.equals("April")||season.equals("May")) {
	System.out.println("You were born in Spring");
}else if(season.equals("June") || season.equals("july") ||season.equals("August")) {
	System.out.println("You were born in Summer");
}else if(season.equals("September") || season.equals("October") ||season.equals("November")) {
	System.out.println("You were born in fall");
}

	}

	
		
	}


