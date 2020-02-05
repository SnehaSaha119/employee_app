package com.sneha.apps.emp.crud;

import java.util.HashMap;
import java.util.Map;

import com.sneha.apps.emp.beans.Employee;

public class EmployeeOps {
	
	Map<Integer,Employee> empMap= new HashMap<Integer, Employee>();
	
	public int getEmployee()
	{
		System.out.println("EmployeeOps.getEmployee()");
		return empMap.size();
	}
	
	public void createEmployee(Employee emp) {
		
		empMap.put(emp.getId(),emp);
	}

}
