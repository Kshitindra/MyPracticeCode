package com.kjain.threadCommunication;

public class IceCreamMachine implements Runnable{
	Thread t;
	IceCream iceCream;
	int i=1;
	IceCreamMachine( IceCream iceCream)
	{
		this.iceCream=iceCream;
		t= new Thread(this,"IceCreamMachineThread");
		t.start();
	}
	
	public void run()
	{
		while(i<=20){
		iceCream.put(i++);
		
		}
		
	}

}
