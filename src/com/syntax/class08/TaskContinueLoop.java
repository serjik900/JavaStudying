package com.syntax.class08;

public class TaskContinueLoop {
	public static void main(String[] args) {
		
	

      for (int i=1; i<=50; i++) {

          if(i%3==0) {
              continue;
          }

          System.out.print(i+" ");
      }

      
  }
}
