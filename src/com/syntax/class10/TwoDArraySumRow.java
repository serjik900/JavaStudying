package com.syntax.class10;

public class TwoDArraySumRow {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		int rows = a.length;    
	       int cols = a[0].length;    
	            
	        //Calculates sum of each row of given matrix    
	        for(int i = 0; i < rows; i++){    
	          int  sumRow = 0;    
	            for(int j = 0; j < cols; j++){    
	              sumRow = sumRow + a[i][j];    
	            }    
	            System.out.println(sumRow);    
	        }    
	            
	        
	        }    
	    }    