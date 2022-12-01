package com.syntax.class12;

import java.util.Scanner;

public class HW12StringCombining {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Dad`s name");
		String dName=in.next();
		System.out.println("Mom`s name");
		String mName=in.next();
		System.out.println("Baby gender:boy or girl");
		String gen=in.next();
		if(gen.toLowerCase().equals("boy")) {
										
			System.out.print(dName.substring(0,dName.length()/2)+mName.substring(mName.length()/2));
		}else if(gen.toLowerCase().equals("girl")) {
			System.out.println(mName.substring(0,mName.length()/2)+dName.substring(dName.length()/2));
		}
		
	}

}
