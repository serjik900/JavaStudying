package com.syntax.class12;

import java.util.Arrays;

public class StringSplit {

    public static void main(String[] args) {

        String str="Batch 14 is really good";
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);

        String str2="Today is Sunday. Sunday is good. Java is also good";
        String[] arr2=str2.split("[.]");
        System.out.println(Arrays.toString(arr2));
    }

}