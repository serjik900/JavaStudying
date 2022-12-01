package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		String str="Shah";
		String str1="Shah";
		String str3=new String("Shah");
		
		if(str.equals(str1)) {
			System.out.println("I found it");
		}
		/*
		 * equals method checks if Strings are exactly the same case
		 * equalsIgnoreCase checks if two Strings are exactly the same but does not care about case of letter
		 */
		if(str.equalsIgnoreCase("shah")){
				System.out.println("I found it with equalIgnoreCase");

	}
}
}