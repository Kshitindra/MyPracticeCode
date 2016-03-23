package com.wf.ect.filter;

import java.util.ArrayList;

public class MaleCriteria implements Criteria {

	@Override
	public ArrayList<Employee> applyCriteria(ArrayList<Employee> list) {
        ArrayList<Employee> maleList=new ArrayList<Employee>();
		for(Employee emp: list){
			if(emp.getGender().equalsIgnoreCase("male"))
				maleList.add(emp);
		}
        return maleList;
	}

}
