package com.pro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/IndexServlet")
public class IndexFilter implements Filter {

   
    public IndexFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String skill=request.getParameter("skills");
		String location=request.getParameter("location");
		String experience=request.getParameter("experience");
		
		if(skill.equals("")||location.equals("")||experience.equals(""))
		{
			request.setAttribute("error1","Please fill all the Field");
		}
		
		if(skill.equals("")||location.equals("")||experience.equals(""))
		{
			request.getRequestDispatcher("index.jsp").forward(request, response);

		}
		else {
		chain.doFilter(request, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
