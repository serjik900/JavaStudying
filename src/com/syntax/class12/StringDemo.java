package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		//Proper way of creating an object
		String str=new String("Java");
		//Simpler way to create an object
		String name="Java           ";
		System.out.println(str.length());
		System.out.println(name.length());
if(name.length()>8) {
	System.out.println("Name can`t be more than 8 characters ");
}
	}

}
