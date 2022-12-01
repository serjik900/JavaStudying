package com.syntax.class03;

public class Casting {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
byte box1=127;
short box2=3333;
int box3=2313213;
long box4=1212313123;
float box5=213123;
double box6=313123123;
int number=(int)15.3;

byte smallerBox=(byte)box1;
short biggerBox=box1;

long smallerBox1=(long)box2;

float box8=(float)box6; //as box6 is lager it is double we need to force java
int box9=(int)box4;
System.out.println(box9);
	}

}
