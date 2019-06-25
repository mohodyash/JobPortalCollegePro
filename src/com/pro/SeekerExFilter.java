package com.pro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/SeekerExServlet")
public class SeekerExFilter implements Filter {

    
    public SeekerExFilter() {
        // TODO Auto-generated constructor stub
    }

		public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	     
	    String experience=request.getParameter("experience");
	    String jobprofile=request.getParameter("jobprofile");
	    String organization=request.getParameter("organization");
	    String Descjobprof=request.getParameter("Descjobprof");
	    String skill=request.getParameter("skill");
	    //response.getWriter().println(jobprofile);
	    
	    if(jobprofile.equals(""))
	    {
	    	request.setAttribute("error1","Profile is Required");
	    }
	    if(organization.equals(""))
	    {
	    	request.setAttribute("error2","Organization is Required");
	    }
	    if(Descjobprof.equals(""))
	    {
	    	request.setAttribute("error3", "Desciption is Required");
	    }
	    if(skill.equals(""))
	    {
	    	request.setAttribute("error4", "Skill is Required");
	    }
	    if(jobprofile.equals("")||organization.equals("")||Descjobprof.equals("")||skill.equals(""))
	    {
	    	request.getRequestDispatcher("seekerRegistretion4Ex.jsp").forward(request,response);
	    }
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
