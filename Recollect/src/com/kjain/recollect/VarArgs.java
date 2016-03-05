package com.kjain.recollect;

public class VarArgs {

	void addInt(int ... i)
	{
		System.out.println("calling the vararg method. Values are:");
		for (int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
	}
	
	public void addInt(int num)
	{
		System.out.println("calling the normal addInt method. Values is "+num);
	}
	
}
