package com.syntax.class12;

public class ReplacingInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="fheue9r873tf928g";
System.out.println(str.replaceAll("[0-9]", "@"));
System.out.println(str.replaceAll("[0-9]", ""));
System.out.println(str.replaceAll("[a-k]", "*"));
System.out.println(str.replaceAll("[A-z]", "%"));
System.out.println(str.replaceAll("[^A-Z]", "%"));//everything but not A-Z
System.out.println(str.replaceAll("[^A-Za-z]", "%"));
	}

}
