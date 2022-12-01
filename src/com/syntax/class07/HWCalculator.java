package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		System.out.println("Enter operation");
		char opt=input.next().charAt(0);
		//operators +,-,*,/
		double add=num1+num2;
		double sub=num1-num2;
		double mul=num1*num2;
		double div=num1/num2;
		if(opt=='+') {
		System.out.println(num1+" + " + num2 + " equals "+ add);	
		}else if(opt=='-'){
			System.out.println(num1+" - " + num2 + " equals "+ sub);
			
		}else if(opt=='*') {
			System.out.println(num1+" * " + num2 + " equals "+ mul);
		}else if(opt=='/') {
			System.out.println(num1+" / " + num2 + " equals "+ div);
		}

	}

}
