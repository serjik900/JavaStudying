package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {
public static void main(String[]args) {
	/*scanner is ther class that helps us take the input from the keyboard
	 * is contains many different smaller modules called methods that can help 
	 * us take Strings booleans basically all types of data from the keyboard
	 */
	Scanner input=new Scanner(System.in);
	//A message will be displayed the to user on the console to enter name
	System.out.println("Please enter you name");
	//Activates the java program to take the input from the keyboard and store
	String name=input.next();
	//prints whatever name user enters on the keyboard on the console
	System.out.println("Hello "+name);
}
}
