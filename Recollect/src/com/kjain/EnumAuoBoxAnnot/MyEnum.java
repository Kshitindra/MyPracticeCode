package com.kjain.EnumAuoBoxAnnot;

enum Car {
	i10("5 Lakhs"),i20 ("7 Lakhs"),i10Grand ("6 Lakhs"),Eon ("4 Lakhs"),Verna ("11 Lakhs");
	String price;
	Car(String price)
	{
		this.price=price;
	}

}
public class MyEnum {

	public static void main(String[] args) {
	//	Car car=Car.i10Grand;
		
        Car[] carArray=Car.values();	
        for(Car a: carArray)
        {
        	System.out.println("car is "+a +" price of the car is "+a.price+" and ordnal is "+a.ordinal());
        }
        Car car=Car.Eon;
       System.out.println("car is "+ car.price);
	}

}
