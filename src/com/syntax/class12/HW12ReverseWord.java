package com.syntax.class12;

import java.util.Scanner;

public class HW12ReverseWord {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Type any word");
		String word=in.next();
		
		for(int i=word.length()-1;i>=0;i--) {
			
		char ch=word.charAt(i);
				
				String reverse="";
				reverse+=ch;
		System.out.print(reverse);

	}

	}}


