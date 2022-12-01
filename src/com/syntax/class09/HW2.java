package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		
		String[] animal= {"cat","dog","cow","horse","chicken"};
		for(String kind:animal) {
System.out.println(kind);
	}
		System.out.println("-----------------");
		for(int i=0;i<animal.length; i++) {
			System.out.println(animal[i]);
		}
	}
}
