package com.aarvee.service;

import java.util.List;

import com.aarvee.beans.EmployeeBean;
import com.aarvee.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDaoImpl lo_employeeDaoImpl = new EmployeeDaoImpl(); 

	@Override
	public void addEmployee(EmployeeBean po_employee_bean) {
		
		     lo_employeeDaoImpl.addEmployee(po_employee_bean);
		}
		

	

	@Override
	public List<EmployeeBean> getAllEmployeeList() {
		
		
		
		return lo_employeeDaoImpl.getAllEmployeeList();
	}

	@Override
	public void deleteEmployee(int pc_employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployee(EmployeeBean po_employeebean) {
		// TODO Auto-generated method stub

	}

	@Override
	public EmployeeBean getEmployeeById(int pc_employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
