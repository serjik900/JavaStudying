package com.syntax.class08;

public class NestedForPyramid {

	public static void main(String[] args) {
		int row=5;
		for(int i=1; i<5; ++i) {
			for(int j=1; j<=i; ++j) {
				System.out.print( "* " );
			}System.out.println(" ");
		}

	}

}
