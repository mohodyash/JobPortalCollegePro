package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDao;


@WebServlet("/AdminRegistretionServlet")
public class AdminRegistretionServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("admin");
		String address=request.getParameter("address");
	    int eid=Integer.parseInt(request.getParameter("eid"));
		String contact=request.getParameter("contact");
		String Email=request.getParameter("Email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		AdminDao a=new AdminDao();
		a.getConnection();
		int a_id=a.maxId();
		a_id++;
		//response.getWriter().println(a_id);
		a.storeData(a_id, name, address, eid, contact, Email, username, password);
		response.sendRedirect("CompanyloginSucces.jsp");	

	}
}
