package com.aarvee.junit;

import java.sql.Connection;

import org.junit.Test;

import com.aarvee.db.DatabaseUtil;

public class DatabaseUtilTest {
	
	private Connection con1;
	private Connection con2;
	private Connection con3;
	private Connection con4;
	
	@Test
	public  void add()
	{
		con1= DatabaseUtil.getConnection();
		
		con2= DatabaseUtil.getConnection();
		con3= DatabaseUtil.getConnection();
	    con4= DatabaseUtil.getConnection();
		
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
		System.out.println(con4);
	}

}
