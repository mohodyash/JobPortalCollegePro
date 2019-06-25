package com.pro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/SeekerRegistretion2")
public class SeekerRegistretionFilter2 implements Filter {

    
    public SeekerRegistretionFilter2() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String education=request.getParameter("education");
		String course=request.getParameter("course");
		String specialization=request.getParameter("specialization");
		String university=request.getParameter("university");
		String passingoutYear=request.getParameter("passingout");
		String per=request.getParameter("per");
		String seekerType=request.getParameter("employeetype");
		
		//response.getWriter().println(education);
		if(course.equals(""))
		{
			request.setAttribute("error1","Course is Required");
		}
		if(specialization.equals(""))
		{
			request.setAttribute("error2", "Specialization is Required");
		}
		if(university.equals(""))
		{
			request.setAttribute("error3", "University is Required");
		}
		if(passingoutYear.equals(""))
		{
			request.setAttribute("error4","Year is Required");
		}
		if(per.equals(""))
		{
			request.setAttribute("error5","Persentage is Required");
		}
		if(course.equals("")||specialization.equals("")||university.equals("")||passingoutYear.equals("")||per.equals(""))
		{
			request.getRequestDispatcher("seekerRegistretion2.jsp").forward(request, response);
		}
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
