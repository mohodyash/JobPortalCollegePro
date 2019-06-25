package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SeekerDao;


@WebServlet("/SeekerExServlet")
public class SeekerExServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String experience=request.getParameter("experience");
	    String jobprofile=request.getParameter("jobprofile");
	    String organization=request.getParameter("organization");
	    String Descjobprof=request.getParameter("Descjobprof");
	    String skill=request.getParameter("skill");
	    
	    SeekerDao s=new SeekerDao();
		s.getConnection();
		int s_id=s.getId1();
		
		s.storeExData(s_id, experience, jobprofile, organization, Descjobprof, skill);

		response.sendRedirect("seekerloginsuccess.jsp");
	    
	}
}
