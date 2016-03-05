package com.kjain.thread;

public class CallerMain implements Runnable{

	Thread  t;
	String message;
    static CallMe callMe;
	CallerMain(String arg)
	{
		t= new Thread(this);
		message=arg;
		t.start();
	}
	public void run()
	{
		synchronized (callMe) {
			callMe.call(message);
		}
			
		
	}
	public static void main(String[] args) {
		
		 callMe= new CallMe();
		CallerMain caller1= new CallerMain("Hello");
		CallerMain caller2= new CallerMain("Kjain");
		CallerMain caller3= new CallerMain("Enjoy");
	}

}
