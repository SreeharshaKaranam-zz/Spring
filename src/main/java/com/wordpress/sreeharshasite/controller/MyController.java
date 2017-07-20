package com.wordpress.sreeharshasite.controller;

import com.wordpress.sreeharshasite.services.EmployeeServiceImpl;

import java.util.List;

import com.wordpress.sreeharshasite.model.*;

public class MyController {
	
	private EmployeeServiceImpl employeeServiceImpl;

	
	public EmployeeServiceImpl getEmployeeServiceImpl() {
		return employeeServiceImpl;
	}


	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}


	public List<Employee> listAllEmployees()
	{
		return employeeServiceImpl.listAllEmployees();
	}

}
