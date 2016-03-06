package com.wf.ect.singleton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SingletonImplTest {
   
	SingletonImpl singletonImpl;
	
	@Test
	public void testIfSingleObject(){
		
		singletonImpl=singletonImpl.getSingletonObject();
		SingletonImpl newSingletonImplObj= singletonImpl.getSingletonObject();
		assertSame(singletonImpl, newSingletonImplObj);
		
	}
	
	
	
	
	@Before
	public void setUp() throws Exception {
		singletonImpl= new SingletonImpl();
	}

	@Test
	public void test() {
		assertNotNull(singletonImpl);
	}

}
