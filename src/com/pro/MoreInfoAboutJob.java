package com.pro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collec.Company;
import com.collec.Job;
import com.dao.JobDao;


@WebServlet("/MoreInfoAboutJob")
public class MoreInfoAboutJob extends HttpServlet {
	
	Company c=null;
	int c_id=0;
	Job jj=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String cname=req.getParameter("cname");
		JobDao j=new JobDao();
		j.getConnection();
		
		ArrayList<Object> data=j.getData(cname);
		
		Iterator<Object> itr=data.iterator();
		while(itr.hasNext())
		{
			  c= (Company)itr.next();
			
				
		}
		
		//resp.getWriter().println(c.getC_id());
		c_id=c.getC_id();
		
		// send data to jsp
		req.setAttribute("c_id", c.getC_id());
		req.setAttribute("cname",c.getCompanyname());
		req.setAttribute("location",c.getAddress());
		
		req.setAttribute("city", c.getCity());
		req.setAttribute("contact",c.getContact());
		req.setAttribute("Email",c.getEmail());
		
		// call to job 
		j.getConnection();
		System.out.println("c id="+c_id);
		ArrayList<Object> data2=j.getDataj(c_id);
		Iterator<Object> itr2=data2.iterator();
		while(itr2.hasNext())
		{
			jj=(Job)itr2.next();
			
		}
		// send to jsp
		//resp.getWriter().println(jj.getEducation());
		req.setAttribute("ctype",jj.getCompanytype());
		req.setAttribute("req",jj.getRequirment());
		req.setAttribute("ex",jj.getReqEx());
		req.setAttribute("package",jj.getSalary());
		req.setAttribute("jtype",jj.getJobtype());
		req.setAttribute("skill",jj.getSkill());
		req.setAttribute("education",jj.getEducation());
		req.setAttribute("lang",jj.getLanguage());
		req.setAttribute("role",jj.getRoll());
		req.setAttribute("edate",jj.getEdate());
		req.setAttribute("eaddress",jj.getAddress());
		req.setAttribute("time",jj.getTime());
		
		
		
	req.getRequestDispatcher("seemorejob.jsp").forward(req, resp);	
	   	
	}
	
}
