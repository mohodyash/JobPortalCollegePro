package com.pro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collec.Apply;
import com.dao.AdminDao;
import com.dao.ApplyDao;
import com.dao.CompanyDao;
import com.dao.SeekerDao;


@WebServlet("/Login2Servlet")
public class Login2Servlet extends HttpServlet {
	
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
			    
				ApplyDao a=new ApplyDao();
				a.getConnection();
				
				ArrayList<Apply> apply=a.getApplyData(username);
				int i=0;
				Iterator<Apply> itr=apply.iterator();
				
				while(itr.hasNext())
				{
					Apply aa=itr.next();
					request.setAttribute("c_name"+i,aa.getC_name());
					request.setAttribute("s_name"+i,aa.getS_name());
					request.setAttribute("roll"+i,aa.getRoll());
					i++;
				}
 				request.setAttribute("size",i);
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
	      Boolean result=a.validetion(username, password);
			
			/*	response.getWriter().println(result);*/
			
			if(result==true)
			{
				HttpSession session=request.getSession();
				session.invalidate();
				session=request.getSession();
				session.setAttribute("username",username);
				request.getRequestDispatcher("index").forward(request, response);
				
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
			session.setAttribute("username",username);
			response.sendRedirect("index.jsp");
		}
		else {
			response.sendRedirect("login2.jsp");
		}
		
		
		}
	}
}
