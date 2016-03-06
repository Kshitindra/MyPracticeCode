package com.wf.ect.singleton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SingletonImplTest {
   
	
	@Test
	public void testGetSingletonObject(){
		
		SingletonImpl singletonImpl=SingletonImpl.getSingletonObject();
		SingletonImpl newSingletonImplObj= SingletonImpl.getSingletonObject();
		assertSame(singletonImpl, newSingletonImplObj);
		
	}
	
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	
}
