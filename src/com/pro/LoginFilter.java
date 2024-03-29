package com.pro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginServlet")
public class LoginFilter implements Filter {

   
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
				
		String loginas=request.getParameter("loginas");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals(""))
		{
			request.setAttribute("error1","User Name is Required");
		}
		if(password.equals(""))
		{
			request.setAttribute("error2","Password is Required");
		}
		if(username.equals("") || password.equals(""))
		{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else {
		chain.doFilter(request, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
