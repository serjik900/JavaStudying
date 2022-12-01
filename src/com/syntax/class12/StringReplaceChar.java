package com.syntax.class12;

public class StringReplaceChar {

	public static void main(String[] args) {
		String str="Batch 14 is good 9^y8w9t298y8gf";
		System.out.println(str.replace("good","bad"));
		//replace method replaces one String with another in a String
System.out.println(str.replaceAll("[a-z]",""));
	}

}
