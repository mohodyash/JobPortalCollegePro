package com.pro;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.coyote.http11.Http11AprProtocol;

import com.dao.CompanyDao;

/**
 * Servlet implementation class PostaJobServlet
 */
@WebServlet("/PostaJobServlet")
public class PostaJobServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		String Companytype=request.getParameter("Companytype");
		String requirment=request.getParameter("requirment");
		String reqEx=request.getParameter("reqEx");
		String salary=request.getParameter("salary");
		String joblocation=request.getParameter("joblocation");
		String jobtype=request.getParameter("jobtype");
		String skill=request.getParameter("skill");
		String education=request.getParameter("education");
		String language=request.getParameter("language");
		String roll=request.getParameter("roll");
		
		String date=request.getParameter("date");
		String months=request.getParameter("months");
		String year=request.getParameter("year");
		
		String edate=date+"/"+months+"/"+year;
		String address=request.getParameter("address");
		
		String time=request.getParameter("time");
		
		//response.getWriter().println(time);
		
		//get company id
		
		HttpSession session=request.getSession(false);
		String username=(String)session.getAttribute("username");
		
		
		
		CompanyDao d=new CompanyDao();
		d.getConnection();
		int c_id=d.getId(username);
		
		//store data
		
		//response.getWriter().write();
		//response.getWriter().println("hi");
		
		
		
		
		
	    boolean result=d.validation1(c_id,skill);
	    if(result==true)
	    {
	    	request.getRequestDispatcher("jobpostsucces.jsp").forward(request, response);
	    }
	    else {
			d.storeJob(c_id, Companytype, requirment, reqEx, salary, joblocation, jobtype, skill, education, language, roll, edate, address, time);

	    	
	    }
		
		
		request.getRequestDispatcher("jobpostsucces.jsp").forward(request, response);
	
		
	}
}
