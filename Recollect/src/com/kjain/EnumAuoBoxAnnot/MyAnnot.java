package com.kjain.EnumAuoBoxAnnot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@interface KjainAnnot{
	int price();
	String carName();
}


@interface OwnerAnnot{
	
	String ownerName();
}
@OwnerAnnot(ownerName="Aksh jain is the owner") 
 class MyAnnot {

	@OwnerAnnot(ownerName="Aksh jain is the owner") 
	 String nameOfOwner="Aksh Jain";
	
	@KjainAnnot(price =450000, carName="Eon")
	public  String carNameAndPrice()
	{
		return "Eon";
	}

	@ OwnerAnnot (ownerName="Kshitindra Jain")
	public  void setOwner()
	{
		
	}
	
	@ OwnerAnnot (ownerName="Kapila  Jain")
	public MyAnnot() {
	}
	
	public static void callMe()
	{
		MyAnnot myAnnot= new MyAnnot();
	
	Class c=myAnnot.getClass();
	/*try {
		Method[] m=c.getMethods();
		for(Method meth: m)
		{
			System.out.println("Methods are "+meth.getName());
		}*/
	    Method meth=null;
		try {
			meth = c.getMethod("carNameAndPrice");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Annotation for "+meth.getName() +" are:");
		for(Annotation a:c.getAnnotations())
		{
			System.out.println(a);
		}
			
	/*} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
		
	}
	
public static void main(String[] args) {
	
	callMe();
		
	}
}
