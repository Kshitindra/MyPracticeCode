package com.kjain.threadCommunication;
public class IceCreamLover implements Runnable{

	Thread t;
	IceCream iceCream;
	
	IceCreamLover(IceCream iceCream)
	{
		this.iceCream=iceCream;
		t= new Thread(this,"IceCreamLoverThread");
		t.start();
	}
	
	
	public void run()
	{
		while(true)
		iceCream.get();
	}
	
	
}
