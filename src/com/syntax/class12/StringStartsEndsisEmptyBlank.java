package com.syntax.class12;

public class StringStartsEndsisEmptyBlank {

	public static void main(String[] args) {
		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+lastName);
		System.out.println(firstName.concat(" ").concat(lastName));
String str="I love java";
String str1="";
/* startsWith=>check if a String starts with a specific letter or word
 * endsWith=>check if a String ends with a specific letter or word
 * contains=>check if a String contain with a specific letter or word
 */
System.out.println(str.isEmpty());
System.out.println(str1+" . is Blank()");
System.out.println(str.trim());


String str2="Java is Very easy";
System.out.println(str2.startsWith("J"));
System.out.println(str2.endsWith("y"));
/*
 * Method chaining helps us call multiple methods on a single line one method after an other
 * 
 */
System.out.println(str2.toLowerCase().contains("very"));
	}

}
