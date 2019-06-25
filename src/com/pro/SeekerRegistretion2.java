package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SeekerDao;


@WebServlet("/SeekerRegistretion2")
public class SeekerRegistretion2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String education=request.getParameter("education");
		String course=request.getParameter("course");
		String specialization=request.getParameter("specialization");
		String university=request.getParameter("university");
		String passingoutYear=request.getParameter("passingout");
		String per=request.getParameter("per");
		String seekerType=request.getParameter("employeetype");
		
		// send to DAO
		SeekerDao s=new SeekerDao();
		s.getConnection();
		int s_id=s.getId();
		
		s.storeEducationData(s_id, education, course, specialization, university, passingoutYear, per, seekerType);
	  // System.out.println(s_id);
		
		if(seekerType.equals("fresher"))
		{
			response.sendRedirect("seekerRegistretion3skill.jsp");
		}
		if(seekerType.equals("Experience"))
		{
			response.sendRedirect("seekerRegistretion4Ex.jsp");

		}
		
	}
}
