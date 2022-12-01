package com.syntax.class12;
import com.syntax.class12.StringUtils;
public class IndexAllLetters {

	public static void main(String[] args) {
		String str="thor love and thunder";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='t') {
				System.out.println(i);
				StringUtils strUtils=new StringUtils();
				strUtils.printAllIndexes(str,'e');
			}
		}

	}

}
