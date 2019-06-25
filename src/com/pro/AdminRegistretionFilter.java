package com.pro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/AdminRegistretionServlet")
public class AdminRegistretionFilter implements Filter {

   
    public AdminRegistretionFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String name=request.getParameter("seekername");
		String address=request.getParameter("address");
		String eid=request.getParameter("eid");
		String contact=request.getParameter("contact");
		String Email=request.getParameter("Email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(name.equals(""))
		{
			request.setAttribute("error1","Name is Required");
		}
		if(address.equals(""))
		{
			request.setAttribute("error2", "Address is Required");
		}
		if(eid.equals(""))
		{
			request.setAttribute("error3", "ID is Required");
		}
		if(contact.equals(""))
		{
			request.setAttribute("error4", "Contact No is Required");
		}
		if(Email.equals(""))
		{
			request.setAttribute("error5", "Email id is Required");
		}
		if(username.equals(""))
		{
			request.setAttribute("error6", "User Name is Required");
		}
		if(password.equals(""))
		{
			request.setAttribute("error7","Password is Required");
		}
		if(name.equals("")||address.equals("")||eid.equals("")||contact.equals("")||Email.equals("")||username.equals("")||password.equals(""))
		{
			request.getRequestDispatcher("adminRegistretion.jsp").forward(request, response);;
		}
		else
		{
		chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
