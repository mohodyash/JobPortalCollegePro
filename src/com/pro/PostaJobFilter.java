package com.pro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/PostaJobServlet")
public class PostaJobFilter implements Filter {

   
    public PostaJobFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String Companytype=request.getParameter("Companytype");
		String requirment=request.getParameter("requirment");
		String reqEx=request.getParameter("reqEx");
		String salary=request.getParameter("salary");
		String joblocation=request.getParameter("joblocation");
		String jobtype=request.getParameter("jobtype");
		String skill=request.getParameter("skill");
		String education=request.getParameter("education");
		String language=request.getParameter("language");
		String roll=request.getParameter("roll");
		
		String date=request.getParameter("date");
		String months=request.getParameter("months");
		String year=request.getParameter("year");
		
		String edate=date+"/"+months+"/"+year;
		
		String address=request.getParameter("address");

		if(Companytype.equals(""))
		{
			request.setAttribute("error1","Company Type is Required");
		}
		if(requirment.equals(""))
		{
			request.setAttribute("error2", "requirment is Required");
		}
		if(reqEx.equals(""))
		{
			request.setAttribute("error3", "Exprerience is Required");
		}
		if(salary.equals(""))
		{
			request.setAttribute("error4", "Salary is Required");
		}
		if(joblocation.equals(""))
		{
			request.setAttribute("error5", "Email id is Required");
		}
		if(jobtype.equals(""))
		{
			request.setAttribute("error6", "Job Type is Required");
		}
		if(skill.equals(""))
		{
			request.setAttribute("error7","Skill is Required");
		}
		if(education.equals(""))
		{
			request.setAttribute("error8","Education is Required");
		}
		if(language.equals(""))
		{
			request.setAttribute("error9","Language is Required");
		}
		if(roll.equals(""))
		{
			request.setAttribute("error10","Roll is Required");
		}
		if(address.equals(""))
		{
			request.setAttribute("error11","Password is Required");
		}
		if(Companytype.equals("")||requirment.equals("")||reqEx.equals("")||salary.equals("")||joblocation.equals("")||jobtype.equals("")||skill.equals("")||education.equals("")||language.equals("")||roll.equals("")||address.equals(""))
		{
			request.getRequestDispatcher("postajob.jsp").forward(request, response);;
		}
		else
		{
		chain.doFilter(request, response);
		}
		
		
		chain.doFilter(request, response);
	}

   	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
