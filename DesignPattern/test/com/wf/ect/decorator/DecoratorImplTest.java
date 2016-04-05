package com.wf.ect.decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DecoratorImplTest {

	DecoratorImpl decoratorImpl;

	@Test 
	public void testCreateCircle(){
		Shape shape;
		shape=decoratorImpl.createPlainCircle();
		assertEquals(shape.getClass(),Circle.class);
	}
	@Test
	public void testCreateRedCircle(){
		Shape shape;
		shape=decoratorImpl.createRedCircle();
		assertEquals(shape.getClass(),RedCircle.class);
		
	}
	
	
	
	
	@Before
	public void setUp() throws Exception {
		
		decoratorImpl= new DecoratorImpl();
	}

	@Test
	public void test() {
		assertNotNull(decoratorImpl);
	}

}
