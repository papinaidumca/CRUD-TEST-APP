package com.aarvee.controller;

import com.aarvee.beans.EmployeeBean;
import com.aarvee.dao.EmployeeDao;
import com.aarvee.dao.EmployeeDaoImpl;

public class EmployeeControllerTest {
	
	public static void main(String[] args) {
		
		//EmployeeBean employeeBean = new EmployeeBean();
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();

        for (EmployeeBean employeeBean : employeeDao.getAllEmployeeList()) {
            System.out.println("EmployeeID : " + employeeBean.getEmpolyeeID());
        }
		
	}

}
