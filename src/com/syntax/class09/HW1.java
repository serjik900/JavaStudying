package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		String[] cars= { "BMW", "Audi", "Dodge", "Ford", "KIA", "Toyota"};
		for(String make:cars ) {
			System.out.println(make);
		}
		
System.out.println("----------------");
for(int i=0; i<cars.length; i++) {
	System.out.println(cars[i]);
}
	}

}
