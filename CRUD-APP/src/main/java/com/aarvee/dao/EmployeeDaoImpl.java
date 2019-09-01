package com.aarvee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
		
		List<EmployeeBean> lo_EmployeeList = new ArrayList<>();
		
		ResultSet rs = null;
		
		String sql = "select* from Employees";
		
		try
		{
			Statement stmt = con.createStatement();
			rs= stmt.executeQuery(sql);
			
			while(rs.next())
			{
				EmployeeBean employeeBean = new EmployeeBean();
				employeeBean.setEmployeeID(rs.getInt("employeeID"));
				employeeBean.setEmployeeName(rs.getString("employeeName"));
				employeeBean.setSalary(rs.getInt("salary"));
				
				lo_EmployeeList.add(employeeBean);
			}
				
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		return lo_EmployeeList;
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
