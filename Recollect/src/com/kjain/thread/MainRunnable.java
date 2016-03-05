package com.kjain.thread;

public class MainRunnable {

	public static void main(String[] args) {
		RunnableImpl first=new RunnableImpl("First");
		RunnableImpl second=new RunnableImpl("Second");
		RunnableImpl thrd=new RunnableImpl("Third");
	    first.t.start();
		second.t.start();
		thrd.t.start();
		
		try
		{
			for(int i=0;i<=5;i++)
			{
			System.out.println("In MainRunnable printing "+(i+1));	
			Thread.sleep(500);
			}
			System.out.println("Before Join First Thread alive "+first.t.isAlive());
			System.out.println(" Before Join Second Thread alive "+second.t.isAlive());
			System.out.println(" Before Join Third Thread alive "+thrd.t.isAlive());
			first.t.join();
			second.t.join();
			thrd.t.join();
		}
		catch(InterruptedException e )
		{
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
		
		System.out.println("First Thread alive "+first.t.isAlive());
		System.out.println("Second Thread alive "+second.t.isAlive());
		System.out.println("Third Thread alive "+thrd.t.isAlive());
     System.out.println("Exiting the main thread");

	}

}
