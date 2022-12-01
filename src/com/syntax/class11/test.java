package com.syntac.class11;

class Main {
	 String carColor;
	int carYear;
	String carMake;
	  
		  void perform(){
	    System.out.println("Car color is "+carColor+" and car year is "+carYear+" and car model is "+carMake);
	}
	
	  public static void main(String[]args){
	    Main obj=new Main();
	    obj.carColor="Black";
	    obj.carYear=2019;
	    obj.carMake="BMW";
	    obj.perform();
     Main obj2=new Main();
     obj2.carColor="White";
	    obj2.carYear=2018;
	    obj2.carMake="Toyota";
	    obj2.perform();
	  }
	}