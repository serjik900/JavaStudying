package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		String str="I am always confused I was kidding";
		System.out.println(str.indexOf("a"));
System.out.println(str.indexOf("s"));
System.out.println(str.indexOf(" "));
/*
 * substring() gives you smaller string from a String we can start the starting
 * part to this method and it will return us to subString from the index
 */

System.out.println(str.substring(5,11));
int num=123456789;
String numStr=String.valueOf(num).substring(1,3);
System.out.println(numStr);
num=Integer.parseInt(numStr);
System.out.println(num);

	}

}
