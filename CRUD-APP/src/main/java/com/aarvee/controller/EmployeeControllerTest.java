package com.aarvee.controller;

import com.aarvee.beans.EmployeeBean;
import com.aarvee.service.EmployeeServiceImpl;

public class EmployeeControllerTest {
	
	public static void main(String[] args) {
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		
		System.out.println("EmployeeID:  EmployeeName: Salary: ");
        for (EmployeeBean emp : employeeServiceImpl.getAllEmployeeList()) {
            System.out.println("   "+emp.getEmpolyeeID()+"   "+emp.getEmployeeName()+"   "+emp.getSalary());
        }
		
	}

}
