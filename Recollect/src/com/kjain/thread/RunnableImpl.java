package com.kjain.thread;

public class RunnableImpl implements Runnable {
Thread t;
	
	RunnableImpl(String threadName)
	{
		t=new Thread(this);
		t.setName(threadName);
	}
	@Override
	public void run() {
		try
		{
			for(int i=0;i<=5;i++)
			{
			System.out.println("In thread "+t.getName() + " printing "+(i+1));	
			Thread.sleep(500);
			}
		}
		catch(InterruptedException e )
		{
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
System.out.println("Exiting thread "+t.getName());
	}

}
