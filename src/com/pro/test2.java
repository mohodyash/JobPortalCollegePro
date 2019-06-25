package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test2")
public class test2 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession session=request.getSession(false);
		String username=(String)session.getAttribute("username");
		
		//response.getWriter().print(username);
	
		request.getRequestDispatcher("login.jsp").forward(request, response);;
	}
   
}
