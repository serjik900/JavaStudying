package com.syntax.class10;

public class ArrayNumberOfColumbsAndRows {

	public static void main(String[] args) {
		
		String[][] countries= {
                {"Usa", "Canada"}, //1 array with index 0
                {"Peru", "Brazil", "Colombia", "Ecuador"}, //2 array with index 1
                {"Ethiopia", "Egypt", "Kenya"},
                {"Germany", "Turkiye", "Moldova", "Ukraine"},
                {"Kazakhstan", "Afghanistan", "Korea"}
        };
		int elof1arr=countries[0].length;//number of elements from 1 array
		System.out.println("_____________Getting all values from 2D arrays____________");
		for(int r=0; r<countries.length; r++) {// loops over rows
			for(int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c]+ " ");
			}
			System.out.println(" ");
		}

	}

}
