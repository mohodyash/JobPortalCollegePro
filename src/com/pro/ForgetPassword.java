package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDao;
import com.dao.CompanyDao;


@WebServlet("/ForgetPassword")
public class ForgetPassword extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String get=request.getParameter("loginas");
		String username=request.getParameter("username");
		String contact=request.getParameter("contact");
		
		response.getWriter().println(get);
		if(get.equals("seeker"))
		{
			
		}
		if(get.equals("admin"))
		{
			AdminDao a=new AdminDao();
			a.getConnection();
			String pass=a.getPassword(username, contact);
			response.getWriter().println("password="+pass);
			
		}
		if(get.equals("company"))
		{
			CompanyDao c=new CompanyDao();
			c.getConnection();
			String pass=c.getPassword(username, contact);
			response.getWriter().println("password="+pass);
			
		   
			
			
		}
	}
}
