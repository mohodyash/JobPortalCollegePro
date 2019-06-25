package com.pro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collec.Company;
import com.collec.Job;
import com.dao.JobDao;


@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	 HttpSession session=req.getSession(false);
	 String username=(String)session.getAttribute("username");
	 resp.getWriter().println("hello"+username); 
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String skill=request.getParameter("skills");
		String location=request.getParameter("location");
		String experience=request.getParameter("experience");
		
		//resp.getWriter().println(skill);
		
		JobDao j=new JobDao();
		j.getConnection();
		ArrayList<Object> job=j.searchJob(skill, location, experience);
		
		
		Iterator<Object> itr=job.iterator();
		Job jjj[]=new Job[100];
		int i=0;
		while(itr.hasNext())
		{
			
	        Job jj=(Job)itr.next();
	        int id=jj.getC_id(); 
	        String name=j.getname(id);
	        request.setAttribute("cname"+i, name);
	        
	        request.setAttribute("jobtype"+i, jj.getCompanytype());
	        request.setAttribute("reqex"+i, jj.getReqEx());
	        request.setAttribute("requrirment"+i,jj.getRequirment() );
	        request.setAttribute("roll"+i,jj.getRoll());
	        request.setAttribute("location"+i,jj.getAddress());
	        request.setAttribute("skill"+i, jj.getSkill());
	        request.setAttribute("salary"+i, jj.getSalary());
	        request.setAttribute("education"+i,jj.getEducation());
	        request.setAttribute("lan"+i,jj.getLanguage());
	        request.setAttribute("jobtype"+i,jj.getJobtype());
	      //  request.setAttribute("", arg1);
	       
	       
	        i++;
	        jj=null;
		}
		//System.out.println("size of i="+i);
		
		request.setAttribute("size", i);
		
		
		request.getRequestDispatcher("Jobs.jsp").forward(request, resp);
		
		
		
		
		
	}
	
}
