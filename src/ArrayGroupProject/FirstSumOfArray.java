package ArrayGroupProject;

import java.util.Scanner;

public class FirstSumOfArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input numbers of elements");
		int n=input.nextInt();
		int[]array=new int[n];
		System.out.println("Enter elements");
		
		for(int i=0;i<n;i++) {
			array[i]=input.nextInt();
		}
		int sum=0;
		for(int value:array) {
		sum+=value;
		}	System.out.println("Sum number is "+ sum);
		}
	}


