package com.wordpress.sreeharshasite.services;

import java.util.ArrayList;
import java.util.List;

import com.wordpress.sreeharshasite.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> listAllEmployees() {
		
		Employee emp1=new Employee(100,"John","Delhi","Associate");
		Employee emp2=new Employee(101,"Ravi","Hyderabad","SeniorAssociate");
		Employee emp3=new Employee(102,"Rajesh","Delhi","JuniorAssociate");
		Employee emp4=new Employee(103,"Ramesh","Delhi","AssociateDirector");
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		return employeeList;
	}

}
