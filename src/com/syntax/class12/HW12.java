package com.syntax.class12;

import java.util.Scanner;

public class HW12 {

	public static void main(String[] args) {
		/*Create a String and if the String is not 
empty perform the following: 
*if the String has an odd number of 
characters and has 3 or more 
characters, print the character in the 
middle of the String.
		 * 
		 */

		Scanner in=new Scanner(System.in);
		System.out.println("Type any word");
		String word=in.next();
		if(!word.isEmpty()) {
			if((word.length()>=3) && (word.length()%2!=0)) {
			System.out.println("The middle letter of "+word+": "+word.charAt(word.length()/2));
		
		}else {
			System.out.println("Incorrect word");
		}
	}

}}
