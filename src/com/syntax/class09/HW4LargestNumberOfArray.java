package com.syntax.class09;

public class HW4LargestNumberOfArray {

	public static void main(String[] args) {
		int num []= {20,11,33,44,85,66, 77};
		int largest=0;
		for(int i=0; i < num.length; i++) {
			if(largest<num[i]) {
				largest=num[i];
				
			}
			
		}System.out.println(largest);

	}

	}



