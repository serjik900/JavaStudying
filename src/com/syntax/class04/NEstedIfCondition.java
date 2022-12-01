package com.syntax.class04;

public class NEstedIfCondition {
public static void main(String []args) {
	int time=6;
	String day="Monday!";
	/*it is outer "if" condition if it is true then only inner condition will be checked
	 *  if it is false nothing happened
	 */
	if(day.equals("Monday!")) {//non primitive have to use .equals sign primitive ==
		if(time>5) {
			System.out.println("Lets go to the office!");
		}
		if(time<10) {
			System.out.println("Lets go to sleep");
		}
	}
}
}
