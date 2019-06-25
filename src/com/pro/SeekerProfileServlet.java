package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JButton;

import com.collec.Company;
import com.collec.Seeker;
import com.dao.JobDao;
import com.dao.ProfileDao;


@WebServlet("/SeekerProfileServlet")
public class SeekerProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
   public void service(HttpServletRequest request,HttpServletResponse resp) throws IOException
   {
	   resp.getWriter().println("hello");
	   
	   HttpSession session1=request.getSession(false);
	   String username=(String)session1.getAttribute("username");
	   
	   
	   resp.getWriter().println(username); 
	   if(username!=null)
	   {
		   ProfileDao d=new ProfileDao();
		   
		   //check is seeker or not using method
		   
		   d.getConnection();
		  int result[]= d.checkSeeker(username);
		  
		  int result1[]=d.checkCompany(username);
		  
		  int result2[]=d.checkAdmin(username);
		 // resp.getWriter().println(result2);
		  if(result[1]==10)
		  {
			 //get data from seeker and send to profile jsp
			  int id=result[0];
			  resp.getWriter().println("seeker "+id);
			  d.getConnection();
			  Seeker s=(Seeker)d.getSeekerContact(id);
			  request.setAttribute("seeker",s);
			  try {
		      request.getRequestDispatcher("seekerprofile.jsp").forward(request, resp);
		      
			  }
			  catch (Exception e) {
				// TODO: handle exception
				  e.printStackTrace();
			}
			  
		  }
		  if(result1[1]==20)
		  {
			  //get data from company and send to jsp page 
			  int id=result1[0];
			  JobDao j=new JobDao();
			  j.getConnection()	;
			  Company c=j.getData1(id);
			  //resp.getWriter().println(c.getCompanyname());
			  request.setAttribute("company", c);
			  try {
				request.getRequestDispatcher("CompanyProfile.jsp").forward(request, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  if(result2[1]==30)
		  {
			  int id=result2[0];
			  resp.getWriter().println("admin" +id);
		  }
		  
		   
	   }
	   else {
		resp.sendRedirect("index.jsp");
	}
	   
   }
   

}
