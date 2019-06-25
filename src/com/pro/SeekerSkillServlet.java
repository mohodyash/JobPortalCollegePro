package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SeekerDao;

/**
 * Servlet implementation class SeekerSkillServlet
 */
@WebServlet("/SeekerSkillServlet")
public class SeekerSkillServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String skill=req.getParameter("skill");
		
		//send to dAo
		
		SeekerDao s=new SeekerDao();
		s.getConnection();
		int s_id=s.getsId();
		
		s.storeSkillData(s_id, skill);
		
		
		resp.sendRedirect("seekerloginsuccess.jsp");
		
		
	}

}
