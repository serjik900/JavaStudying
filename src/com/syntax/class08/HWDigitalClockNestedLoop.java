package com.syntax.class08;

public class HWDigitalClockNestedLoop {

	public static void main(String[] args) {
	
		for(int i=0; i<=23; i++) {

            for(int j=0; j<=5; j++)  {
            	 for(int y=0; y<=9; y++) { 
                if (i<10) {
                	
                	System.out.println("0"+i+":"+j+y);
                }else {
            		 System.out.println(i+":"+j+y); } 

            }
            }}}
}

