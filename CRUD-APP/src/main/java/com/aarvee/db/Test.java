package com.aarvee.db;

import java.sql.Connection;

public class Test {
	
	
	private Connection con1;
	private Connection con2;
	private Connection con3;
	private Connection con4;
	
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
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.add();
		
	}

}
