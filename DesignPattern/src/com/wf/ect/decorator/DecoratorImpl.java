package com.wf.ect.decorator;

public class DecoratorImpl {

	
	public Circle createPlainCircle() {
   
		Circle plainCircle= new Circle();
		return plainCircle.draw(); 
	
	}

	public Circle createRedCircle() {
		
		Circle plainCircle= new Circle();
		RedCircle redCircle= new RedCircle(plainCircle);
		return redCircle.draw(); 
	
	}

}
