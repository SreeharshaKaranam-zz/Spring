package com.wordpress.sreeharshasite.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wordpress.sreeharshasite.controller.MyController;
import com.wordpress.sreeharshasite.model.Employee;

public class DIDemo {

	public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	        MyController controller = (MyController) ctx.getBean("myController");
	        List<Employee> employees = controller.getEmployeeServiceImpl().listAllEmployees();
	 
	        for(Employee employee : employees){
	        	System.out.println("Employee Details");
	            System.out.print(employee.getEmpId()+" ");
	            System.out.print(employee.getEmpName()+" ");
	            System.out.print(employee.getCity()+" ");
	            System.out.print(employee.getDesignation()+" ");
	            System.out.println();
	            }


}
}
