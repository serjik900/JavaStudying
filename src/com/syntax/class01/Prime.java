package com.syntax.class01;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number fucker");
int number=scanner.nextInt();
if(number <=1){
	System.out.println("Not prime");
}
int i;
int flag=0;
for(i=2; i<number; i++) {
	if (number % i==0) {
		System.out.println(number + " is not prime");
flag=1;
break;}
	}
if (flag==0)
	System.out.println(number + " is prime");
	}
}