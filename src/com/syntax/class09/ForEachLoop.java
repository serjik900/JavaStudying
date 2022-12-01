package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		
//		only works with arrays or collection
		String[] iceCream= {"vanilla", "choco", "pistation"};
		for(String flavor:iceCream) {
			System.out.println(flavor);
		}
System.out.println("_________________");
int[] num= {23,323,3123,31,23,31,34};
//regular loop
for(int i=0; i<num.length;i++) {
	System.out.println(i);
}
//get a;; values using enhaced for loop
for(int numbers:num) {
	System.out.print(numbers+" ");
}

	}

}
