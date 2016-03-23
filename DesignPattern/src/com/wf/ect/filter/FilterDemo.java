package com.wf.ect.filter;

import java.util.ArrayList;

public class FilterDemo {

	ArrayList<Employee> employeeList=new ArrayList<Employee>();
	public ArrayList<Employee> getEmployeeList(){
		
		Employee emp1=new Employee(1, "Emp1", "male",42);
		Employee emp2=new Employee(1, "Emp2", "female",32);
		Employee emp3=new Employee(1, "Emp3", "female",27);
		Employee emp4=new Employee(1, "Emp4", "male",28);
		Employee emp5=new Employee(1, "Emp5", "male",23);
		Employee emp6=new Employee(1, "Emp6", "female",26);
		Employee emp7=new Employee(1, "Emp7", "male",25);
		Employee emp8=new Employee(1, "Emp8", "female",25);
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		employeeList.add(emp8);
		return employeeList;
	}
	
}
