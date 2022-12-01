package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="John";
String surname="Wick";
String group="A";
String city="Cicago IL";
String cell="123-123-1234";
System.out.println("My name is "+ name+" and my last name is "+ surname+".");
System.out.println("I am "+ group+" student!");
System.out.println("I live in "+city);
System.out.println("And my phone number is "+cell);
city="New York";
cell="321-322-3333";
System.out.println("My name is "+name+surname+" I moved to "+ city+". My phone number is "+ cell);
//Rules for Identifires=name
//1.cannot use keywords as identifiers
//String new="dsaads";

//2.can`t have spaces in identifiers
//String last name="Smith";

//identifiers can`t start with numbers
//int 1number=123;

/*4. identifiers can`t contain any special characters excempt:
 * $ or _ double $price=9.99; float _price1=2.33f;
 */
//Class should start with Uppercase and follow convention
//variables should start with lowercaseString Weather="hot";<-not preffered String myWeather="cold";<-preffered


//numeratic operators +,-,*,/,%
int a=900;
int b=100;
System.out.println(a+b);
int sum=a+b;
int sub=a-b;
System.out.println(sum);


int e=11;
int f=5;
System.out.println(e/f);//2
System.out.println(e%f);//0 no remainder left 10/5=2 even


double num1=10;
double num2=3;
System.out.println("Division is "+num1/num2);

	}

}
