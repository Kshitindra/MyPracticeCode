package com.wf.ect.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryImplTest {

	ShapeFactoryImpl shapeFacotryImpl;
	
	@Test
	public void testDrawCircle()
	{
		Shape shape;
		shape=shapeFacotryImpl.drawCircle();
		assertEquals(shape.getClass(),Circle.class);
	}
	
	@Test
	public void testDrawSquare()
	{
		Shape shape;
		shape=shapeFacotryImpl.drawSquare();
		assertEquals(shape.getClass(),Square.class);
	}
	
	@Before
	public void setUp() throws Exception {
		shapeFacotryImpl=new ShapeFactoryImpl();
	}

	@Test
	public void test() {
		assertNotNull(shapeFacotryImpl);
	}

}
