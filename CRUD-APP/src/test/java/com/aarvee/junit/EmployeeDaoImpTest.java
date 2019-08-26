package com.aarvee.junit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.aarvee.beans.EmployeeBean;
import com.aarvee.dao.EmployeeDao;
import com.aarvee.dao.EmployeeDaoImpl;
import com.aarvee.db.DatabaseUtil;


public class EmployeeDaoImpTest {
	
	private Connection con = DatabaseUtil.getConnection();
	
	
	/*@Test
	public void addEmployee() {
		
		System.out.println("save employee data into the database");
		
		String sql = "insert into Employees(employeeName,salary) values(?,?)";
		
		try {
				PreparedStatement prepareStatement1 = con.prepareStatement(sql);
				
				//prepareStatement.setInt(1, po_employee_bean.getEmpolyeeID());
				prepareStatement1.setString(1,"Raju");
				prepareStatement1.setInt(2, 24000);
				prepareStatement1.executeUpdate();
				
				PreparedStatement prepareStatement2 = con.prepareStatement(sql);
				
				//prepareStatement.setInt(1, po_employee_bean.getEmpolyeeID());
				prepareStatement2.setString(1,"Krishna");
				prepareStatement2.setInt(2, 45000);
				prepareStatement2.executeUpdate();
				
				PreparedStatement prepareStatement3 = con.prepareStatement(sql);
				
				//prepareStatement.setInt(1, po_employee_bean.getEmpolyeeID());
				prepareStatement3.setString(1,"Gana");
				prepareStatement3.setInt(2, 50000);
				prepareStatement3.executeUpdate();
				
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}*/
	
	//	return null;
//	}
	/*@Test
	public void deleteEmployee() 
	{
		System.out.println("delete employeeData from DataBase..");
		try
		{
			PreparedStatement prepareStatement = con.prepareStatement("delete from Employees where employeeID=?");
			prepareStatement.setInt(1, 7);
			prepareStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}*/
	
	/*@Test
	public void getAllEmployeeList() 
	{
		System.out.println("to get employee data from DataBase by using JDBC");
		List<EmployeeBean> lo_AllEmployeesList = new ArrayList<>();
		ResultSet rs = null;
		try
		{
			Statement stmt = con.createStatement();
			rs= stmt.executeQuery("select * from Employees");
			while(rs.next())
			{
				EmployeeBean employee_bean = new EmployeeBean();
				
				employee_bean.setEmployeeID(rs.getInt("employeeID"));
				employee_bean.setEmployeeName(rs.getString("employeeName"));
				employee_bean.setSalary(rs.getInt("salary"));
				lo_AllEmployeesList.add(employee_bean);
			}
			System.out.println("----------------------------------------------------");
			for(EmployeeBean emp:lo_AllEmployeesList)
			{
				System.out.println(emp.getEmpolyeeID()+" "+emp.getEmployeeName()+" "+emp.getSalary());
			}
			//	String jsonObj = JsonUtil.convertJavaToJson(lo_AllEmployeesList);
			
				//	lo_jsonObject.getJSONArray(jsonObj);
				
			//	System.out.println(jsonObj);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		//return lo_AllEmployeesList;
	}*/
	
	@Test
	public void updateEmployee() 
	{
		System.out.println("to update employee data into the DataBase");
		try
		{
			PreparedStatement prepareStatement = con.prepareStatement("update Employees set employeeName=?,salary=? where employeeID=?");
			prepareStatement.setString(1, "Jahn");
			prepareStatement.setInt(2, 37000);
			prepareStatement.setInt(3, 5);
			prepareStatement.executeUpdate();
			//System.out.println("------> "+employeebean.getEmployeeID());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
