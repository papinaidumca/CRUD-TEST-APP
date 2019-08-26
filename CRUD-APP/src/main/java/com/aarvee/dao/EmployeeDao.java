package com.aarvee.dao;

import java.util.List;

import com.aarvee.beans.EmployeeBean;

public interface EmployeeDao {
	
	public void addEmployee(EmployeeBean po_employee_bean);
	public List<EmployeeBean> getAllEmployeeList();
	public void deleteEmployee(int pc_employeeId);
	public void updateEmployee(EmployeeBean po_employeebean);
	public EmployeeBean getEmployeeById(int pc_employeeId);
	
	
}
