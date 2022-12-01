package com.syntax.class02;

public class HomeWork2 {

	public static void main(String[] args) {
		
		// Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The __ of 2 numbers __ and  is equal to __”

		double a=9.95;
		float b=3.95f;
		double sum=a+b;
		double sub=a-b;
		double mul=a*b;
		double div=a/b;
		System.out.println("!!!!!!!!!!!!!!Task#1!!!!!!!!!!!!!!");
		System.out.println("The summ of the 2 numbers " + a + " and " + b + " is equal to " + sum);
		System.out.println("The subtraction of the 2 numbers " + a + " and " + b + " is equal to " + sub);
		System.out.println("The multiplication of the 2 numbers " + a + " and " + b + " is equal to " + mul);
		System.out.println("The division of the 2 numbers " + a + " and " + b + " is equal to " + div);
		
		//Write a program to find the square of the number 3.9. You program should say “The square of the  is  “
		
		float c=3.9f;
		float sq=c*c;
		System.out.println("!!!!!!!!!!!!!!Task#2!!!!!!!!!!!!!!");
		System.out.println("The square of the  is "+sq);
		
		/*Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
		 *Your program should say. “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
		 */
		int w=5;
		int h=8;
		int ar=w*h;
		int per=2*(w+h);
		System.out.println("!!!!!!!!!!!!!!Task#3!!!!!!!!!!!!!!");
		System.out.println("The perimeter of a rectangle with width "+w+" and height "+h+" is equal to " + per+" and the area is "+ ar);
		
				
	}

}
