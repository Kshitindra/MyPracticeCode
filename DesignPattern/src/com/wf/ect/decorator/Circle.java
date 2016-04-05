package com.wf.ect.decorator;

public class Circle implements Shape {

	
	@Override
	public Circle draw() {
      System.out.println("Drawing Plain Circle");
	return new Circle();	
	}

}
