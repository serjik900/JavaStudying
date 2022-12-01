package com.syntax.class12;

import java.util.Arrays;

public class StringDemoArray {

	public static void main(String[] args) {
		String str="I love java programmimg";
		char[] charArray=str.toCharArray();
		System.out.println(charArray[5]);
		char[] charArray1=str.toCharArray();
		System.out.println(Array.toString());

		
		int counter=0;
		for(char c:charArray) {
			if(c=='a') {
				counter++;
				
			}
		}
		System.out.println("letter a has appeard "+counter+ " times");
		
	}

}
