package com.syntac.class11;

public class DogHW {
	 String breed;
	String color;
	   double weight;
	    int age;
	    
	    void sit() {
	        System.out.println(breed+ " will sit");
	    }

	    void eat() {
	        System.out.println(breed+ " will eat");
	    }

	    public static void main(String[] args) {
	        // Name of Class variable name = new Name of class ();
	        DogHW Husky=new DogHW();
	        Husky.breed="Husky";
	        Husky.color="white";
	        Husky.weight=5.5;
	        Husky.age=2;
	     
	        System.out.println(Husky.breed+" color is "+Husky.color+" his weight is "+Husky.weight+" and age "+ Husky.age);
	        Husky.eat();

	        System.out.println("*****************");

	       DogHW Bulldog=new DogHW();
	        Bulldog.color="Grey";
	        Bulldog.weight=4;
	        Bulldog.age=3;

	        System.out.println("Bulldog color is "+ Bulldog.color);
	        System.out.println("***************************");

	        DogHW Labrador=new DogHW();
	        
	        Labrador.breed="Lab";
	        Labrador.color="black";
	        Labrador.weight=12.5;
	        Labrador.age=4;
	        Labrador.sit();
	        Labrador.sit();





	    }

	
}
