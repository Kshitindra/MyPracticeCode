package com.kjain.threadCommunication;

public class IceCream {

	int count;
	boolean iceCreamAvailable=false;
synchronized int get()
{
//	System.out.println("The value of count in get method is "+count);
	if(!iceCreamAvailable)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	System.out.println("Eating the icecream # "+count);
	iceCreamAvailable=false;
	notify();
	return count;
		
}
	

synchronized void put (int cnt)
{
	
	if(iceCreamAvailable)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	this.count=cnt;
	System.out.println("Producing icecream # "+count);
	iceCreamAvailable=true;
	notify();
}


}
