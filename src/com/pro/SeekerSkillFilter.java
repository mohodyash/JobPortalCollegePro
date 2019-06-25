package com.pro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/SeekerSkillServlet")
public class SeekerSkillFilter implements Filter {

    
    public SeekerSkillFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String skill=request.getParameter("skill");
		if(skill.equals(""))
		{
			request.setAttribute("error1","Skill is Required");
		}
		if(skill.equals(""))
		{
			request.getRequestDispatcher("seekerRegistretion3skill.jsp").forward(request, response);
		}
		else
		{
		chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
