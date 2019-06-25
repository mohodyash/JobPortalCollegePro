package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type=req.getParameter("regestreas");
		//resp.getWriter().println(type);
		if (type.equals("seeker")) {
			resp.sendRedirect("seekerRegistretion1.jsp");
		}
		if (type.equals("admin")) {
			resp.sendRedirect("adminRegistretion.jsp");
		}
		if(type.equals("company"))
		{
			resp.sendRedirect("companyRegistretion.jsp");
		}
	}
}
