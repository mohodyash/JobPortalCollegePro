package com.pro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.collec.Roll;
import com.collec.Seeker;
import com.collec.UserName;
import com.dao.DbConnection;
import com.dao.ProfileDao;

/**
 * Servlet implementation class SeekerProfile
 */
@WebServlet("/SeekerProfile")
public class SeekerProfile extends HttpServlet {
	
	  
	 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		 
		String username= request.getParameter("seekername");
		String roll=request.getParameter("post");
		Roll.setRoll(roll);
		//this.username=username;
		 resp.getWriter().print("hello"+username);
		 
		 
		 UserName user=new UserName();
		 user.setUsername(username);
		 
		 
		
			 
				 
		 
		 if(username!=null)
		   {
			   ProfileDao d=new ProfileDao();
			   
			   //check is seeker or not using method
			   
			   d.getConnection();
			  int result[]= d.checkSeeker(username);
			  
			  if(result[1]==10)
			  {
				 //get data from seeker and send to profile jsp
				  int id=result[0];
				 // this.id=id;
				  resp.getWriter().println("seeker "+id);
				  d.getConnection();
				  Seeker s=(Seeker)d.getSeekerContact(id);
				  request.setAttribute("seeker",s);
				  try {
			      request.getRequestDispatcher("SeekerProfileForCompany.jsp").forward(request, resp);
			      
				  }
				  catch (Exception e) {
					// TODO: handle exception
					  e.printStackTrace();
				}
				  
			  }
		   }
			  else {
					resp.sendRedirect("index.jsp");
          	}
	 }
	
}
		 
