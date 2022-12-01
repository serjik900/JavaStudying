package com.syntax.class09;

public class HW5ReverseArray {

	public static void main(String[] args) {
		char[] letter= {'A','B','C','D','E'};
		for(int i=letter.length;i>=0;i--) {
			if(i==letter.length) {
				continue;
			}
			System.out.println(letter[i]);
		}
	}

}
