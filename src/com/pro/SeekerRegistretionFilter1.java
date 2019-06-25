package com.pro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.dao.SeekerDao;

@WebFilter("/SeekerRegistretion1")
public class SeekerRegistretionFilter1 implements Filter {

    public SeekerRegistretionFilter1() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String name=request.getParameter("seekername");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String contact=request.getParameter("contact");
		String Email=request.getParameter("Email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		SeekerDao s=new SeekerDao();
		s.getConnection();
		boolean result=s.checkuser(username);
		
		
		if(name.equals(""))
		{
			request.setAttribute("error1","Name is Required");
		}
		if(address.equals(""))
		{
			request.setAttribute("error2", "Address is Required");
		}
		if(city.equals(""))
		{
			request.setAttribute("error3", "City is Required");
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
		if(result==true)
		{
			request.setAttribute("error10","User Name is not Valide");
		}
		if(password.equals(""))
		{
			request.setAttribute("error7","Password is Required");
		}
		if(name.equals("")||address.equals("")||city.equals("")||contact.equals("")||Email.equals("")||username.equals("")||password.equals("")||result==true)
		{
			request.getRequestDispatcher("seekerRegistretion1.jsp").forward(request, response);;
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
