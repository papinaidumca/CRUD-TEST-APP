package com.aarvee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.aarvee.beans.EmployeeBean;
import com.aarvee.db.DatabaseUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private Connection con = DatabaseUtil.getConnection();
	
	

	@Override
	public void addEmployee(EmployeeBean po_employee_bean) {
		
		System.out.println("save employee data into the database");
		
		String sql = "insert into Employees(employeeName,salary) values(?,?)";
		
		try {
				PreparedStatement prepareStatement = con.prepareStatement(sql);
				
				//prepareStatement.setInt(1, po_employee_bean.getEmpolyeeID());
				prepareStatement.setString(1,po_employee_bean.getEmployeeName());
				prepareStatement.setInt(2, po_employee_bean.getSalary());
				
				prepareStatement.executeUpdate();
				
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}
    
	@Override
	public List<EmployeeBean> getAllEmployeeList() {
		
		
		
		return null;
	}

	@Override
	public void deleteEmployee(int pc_employeeId) {
		

	}

	@Override
	public void updateEmployee(EmployeeBean po_employeebean) {
		

	}

	@Override
	public EmployeeBean getEmployeeById(int pc_employeeId) {
		
		return null;
	}

	
}
