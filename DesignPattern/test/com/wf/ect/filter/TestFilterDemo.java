package com.wf.ect.filter;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestFilterDemo {

	FilterDemo filterDemo;
	
	@Test
	public void testMaleCriteria(){
		ArrayList<Employee> employeeList=filterDemo.getEmployeeList();
		MaleCriteria maleCriteria=new MaleCriteria();
		ArrayList<Employee> maleList=maleCriteria.applyCriteria(employeeList);
		boolean allMale=true;
		for(Employee emp: maleList){
			if(!(emp.getGender().equalsIgnoreCase("male")))
				allMale=false;
		}
		assertTrue(allMale);
	}
	
   
	
	@Before
	public void setUp() throws Exception {
		filterDemo= new FilterDemo();
	}

	@Test
	public void test() {
		assertNotNull(filterDemo);
	}

}
