package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SeekerDao;

@WebServlet("/SeekerRegistretion1")
public class SeekerRegistretion1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int id=1;
		String name=request.getParameter("seekername");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String contact=request.getParameter("contact");
		String Email=request.getParameter("Email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
        
		//data send to DAO
		
		SeekerDao s=new SeekerDao();
		s.getConnection();
		int s_id=s.maxId();
		s_id++;
		
		s.storeContactData(s_id, name, address, city, contact, Email, username, password);
		
	    response.sendRedirect("seekerimgRegistretion.jsp");		
	}
}
