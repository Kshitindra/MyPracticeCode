package com.wf.ect.singleton;

public class SingletonImpl {

	static SingletonImpl singletonImplObj= new SingletonImpl();
	
	private SingletonImpl (){}
	public static SingletonImpl getSingletonObject()
	{
		return singletonImplObj;
	}
}
