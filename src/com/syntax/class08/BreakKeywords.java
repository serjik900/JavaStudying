package com.syntax.class08;

public class BreakKeywords {

	public static void main(String[] args) {
		for(int i=1; i<5; i++) {

            System.out.println("Hello");

            if(i==3) {
            break; // <- breaks the block of code
        }

    }
        // break - break the loop and it usually used inside some type of conditon

    boolean hungry=true;
    while(hungry) {
        System.out.println("Give me food");
        break;
    }

    System.out.println("End");

    }

}