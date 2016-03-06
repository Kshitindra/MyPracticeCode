package com.wf.ect.factory;

public class ShapeFactory{

	public Shape getShape(String shapeName) {
		Shape shape=null;
		if(shapeName.equalsIgnoreCase("circle"))
			shape=new Circle();
		else if(shapeName.equalsIgnoreCase("square"))
			shape=new Square();
		return shape;
	}

}
