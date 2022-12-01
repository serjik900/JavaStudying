package com.syntax.class06;

import java.util.Scanner;

public class taskHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("What is your height(inches)?");
int height=input.nextInt();
if(height<60) {
	System.out.println("You are short");
	
}else if((height>=60) && (height<=72)){
	System.out.println("You are medium heght");
}
else if (height>72) {
	System.out.println("You are tall");
}
	}

}
