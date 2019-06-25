package com.pro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CompanyDao;

@WebServlet("/CompanyRegistretionServlet")
public class CompanyRegistretionServlet extends HttpServlet {
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String companyname=request.getParameter("companyname");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String contact=request.getParameter("contact");
		String Email=request.getParameter("Email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
	    
		
       CompanyDao c=new CompanyDao();
       c.getConnection();
       int c_id= c.maxId();
       response.getWriter().println(c_id);
       c_id++;
       // store data
       c.storeData(c_id, companyname, address, city, contact, Email, username, password);
       
       response.sendRedirect("CompanyloginSucces.jsp");
       
       

      	
	}
}
