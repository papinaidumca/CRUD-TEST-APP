package com.aarvee.beans;

import java.io.Serializable;
//import java.util.Date;

public class EmployeeBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int  employeeID;
	private String employeeName;
	private int salary;
//	private Date dob;
	
	
	
	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}
	
	public int getEmpolyeeID()
	{
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
