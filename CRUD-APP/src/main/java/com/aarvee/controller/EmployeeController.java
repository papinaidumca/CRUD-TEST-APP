package com.aarvee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.aarvee.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
//@WebServlet("/welcome")
public class EmployeeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private EmployeeServiceImpl empServiceImpl = new EmployeeServiceImpl();
	
	final static Logger logger = Logger.getLogger(EmployeeController.class);
    
	
   
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	response.getWriter().write("<html><h2>This is a welcome page. Here we are going to learn,how to use log4j in web app</h2></html>"			
    	);
    	
    	System.out.println("This is a EmployeeController  servlet");
    	
    	logger.info("This is a info statement...");
    	logger.debug("This is a debug statement....");
    	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
