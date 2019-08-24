package com.aarvee.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	
	private static Connection con=null;
	
	private DatabaseUtil()
	{
		
	}
	
	public static Connection getConnection()
	{
		if(con==null)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver is loaded");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_app_db", "root", "root");
				System.out.println("Connection established.....");
			} 
			catch (ClassNotFoundException e) {
				
				System.out.println("Exception occured while the Driver class is not loaded.."+e.getMessage());
			}
			catch(SQLException ex)
			{
				System.out.println("Excception occured while the connection is failed..."+ex.getMessage());
			}
		}
		return con;
	}
	
	public static void close(Connection con)
	{
		try {
			con.close();
			System.out.println("connection is closed"+con);
		} 
		catch (SQLException e)
		{
		}
	}

}
