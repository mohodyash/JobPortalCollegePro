package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDao;
import com.dao.CompanyDao;
import com.dao.SeekerDao;

import javafx.beans.binding.SetExpression;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String loginas=request.getParameter("loginas");
		response.getWriter().println(loginas);
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		

		
		
		if(loginas.equals("company"))
		{
			CompanyDao c=new CompanyDao();
			c.getConnection();
			Boolean result=c.validetion(username, password);
			
			/*	response.getWriter().println(result);*/
			
			if(result==true)
			{
				HttpSession session=request.getSession();
				session.invalidate();
				session=request.getSession();
				session.setAttribute("username",username);
			
				request.getRequestDispatcher("CompanyloginSucces.jsp").forward(request,response);
				
								
				
			}
			else {
				 response.sendRedirect("login2.jsp");
			}
			
			
		}
		if(loginas.equals("admin"))
		{
			AdminDao a=new AdminDao();
			a.getConnection();
		Boolean result=	a.validetion(username, password);
		if(result==true)
		{
			HttpSession session=request.getSession();
			session.invalidate();
			session=request.getSession();
			session.setAttribute("username",username);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
		else {
			 response.sendRedirect("login2.jsp");
		}
		
		
		}
		if(loginas.equals("seeker"))
		{
		SeekerDao s=new SeekerDao();
		s.getConnection();
		Boolean result=s.validetion(username, password);
		if(result==true)
		{ 
		    
			HttpSession session=request.getSession();
			session.invalidate();
			
		    session=request.getSession();
			session.setAttribute("username", username);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
		else {
			response.sendRedirect("login2.jsp");
		}
		
		
		}
		
		//session start 1
		
		
	}
}
