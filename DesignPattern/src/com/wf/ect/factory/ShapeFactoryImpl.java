package com.wf.ect.factory;

public class ShapeFactoryImpl {

	public Shape drawCircle() {
		ShapeFactory shapeFactory= new ShapeFactory();
		return shapeFactory.getShape("Circle");
	}

	public Shape drawSquare() {
		ShapeFactory shapeFactory= new ShapeFactory();
		return shapeFactory.getShape("Square");
	}
}
