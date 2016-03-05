package com.kjain.thread;

public class MainThread {

	public static void main(String[] args) {
		Thread t=new Thread();
		t.setName("Kshitindra");
		System.out.println("Main Thread name, priority and thread group are "+t);

		try
		{
			for(int i=0;i<=5;i++)
			{
			System.out.println("printing "+(i+1));	
			Thread.sleep(1000);
			}
		}
		catch(InterruptedException e )
		{
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
       
	}

}
