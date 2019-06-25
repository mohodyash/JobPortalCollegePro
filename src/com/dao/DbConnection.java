package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	  Connection con=null;
	  
	
	  public Connection getConnection() {
		  try {
			  System.out.println("1 0f 1");
	             Class.forName("com.mysql.jdbc.Driver");  
	             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","yash");
		  }
		  catch (Exception e) {
			  e.printStackTrace();
		}
		  System.out.println("1 of 2");
		  return con;
	  }
}
