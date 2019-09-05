package com.aarvee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * This class is used to print welcome message to user
 * 
 * @author Naidu
 */
public class WelcomeServlet extends HttpServlet {
	
	 /**
     *  This is used to get Logger object for current class 
     */
	private static Logger logger = Logger.getLogger(WelcomeServlet.class);
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        logger.debug("WelcomeServlet::Initialization");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.debug("doGet Method Execution started.....");
	
		response.getWriter().append("<h1>Hello, This message generted from Welcome Servlet.is Successfully......</h1>");
		
		logger.debug("doGet Method Execution is completed...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
