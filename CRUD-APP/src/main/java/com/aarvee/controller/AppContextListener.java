package com.aarvee.controller;

import java.io.File;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * This class is used to initialize log4j at the time app startup
 * 
 * @author Naidu
 *
 */

public class AppContextListener implements ServletContextListener {
	
	/**
     * This is used to get Logger object for current class 
     */
	private Logger logger = Logger.getLogger(AppContextListener.class);
	
	/**
     * This method will be executed when ServletContext object destroyed...
     */
    public void contextDestroyed(ServletContextEvent contextEvent){
    	
    	logger.info("Context object destroyed...");
         
    }
    
    /**
     * This method will be executed when ServletContext object created...
     */
    public void contextInitialized(ServletContextEvent contextEvent)  { 
    	
    	logger.info("*******Context Initialization Started**********");
    	
    	
    	InputStream in = getClass().getResourceAsStream("/com/aarvee/log4j/application.properties");
 		
 		if(in!=null)
 		{
 			
 			PropertyConfigurator.configure(in);
 			logger.info("****log4j initialized successfully******");
 			System.out.println("Logger is configure with custom setting----->");
 		    logger.info("****Context Initialization Ended*******");
 		}
 		else
 		{
 			BasicConfigurator.configure();
 			logger.info("****log4j is configure with Default setting******");
 			System.out.println("Logger is configure with Default setting---->");
 			logger.info("****log4j is configure with Default setting******");
 		}
           
     
    	
         
        /* // Getting ServletContext Object
         ServletContext context = contextEvent.getServletContext();
         
         // Get context-param value using key
         String log4jConfigLocation = context.getInitParameter("log4j-config-location");
         
         // pointing log4j configuration file
         String fullPath  = context.getRealPath("") + File.separator + log4jConfigLocation;
         
         // loading properties file
         PropertyConfigurator.configure(fullPath);*/
         
         
        
    }
    
}
