package com.kjain.recollect;

public class KJainMain {

	 static int a=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Recursion r= new Recursion();
		for(int i=1;i<=9;i++)
		
		System.out.println("Factorial of " + i +" is "+r.fact(i));*/
		
     // callMe();
		/*StringBuffer a =new StringBuffer("kjain");
		a=new StringBuffer("kjain123");
		a.setCharAt(3, 'T');
		System.out.println(a);*/
		
		VarArgs v=new VarArgs();
		System.out.println(v.getClass().getName());
		v.addInt(1,2,3,4,5,6,7);
		v.addInt(1);
		v.addInt();
	} 
	
	private static void callMe()
	{
         System.out.println("callMe called successfully  value of a  is "+a);
	}

}
