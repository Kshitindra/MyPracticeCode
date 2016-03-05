package com.kjain.threadCommunication;

public class IceCreamMain {

	public static void main(String[] args) {
		
		IceCream iceCream= new IceCream();
		IceCreamMachine machine=new IceCreamMachine(iceCream);
		IceCreamLover eater=new IceCreamLover(iceCream);

	}

}
