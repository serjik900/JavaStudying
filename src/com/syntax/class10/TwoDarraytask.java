package com.syntax.class10;

public class TwoDarraytask {

	public static void main(String[] args) {
		String [] [] bigArray=new String[2][4];
		//1 row
		bigArray[0][0]="Mr";
		bigArray[0][1]="Mrs";
		bigArray[0][2]="Ms";
		bigArray[0][3]="Miss";
		
		//2 row
		bigArray[1][0]="Smith";
		bigArray[1][1]="Jordan";
		bigArray[1][2]="Jackson";
		bigArray[1][3]="Obama";
		
		
		
		//Accessing elements from 2d array
		System.out.println(bigArray[0][1]+" "+ bigArray[1][0]); //300
		System.out.println("===============================");
	}

}
