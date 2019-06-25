package com.pro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collec.SortList;
import com.dao.SortListDao;

/**
 * Servlet implementation class SortListJob
 */
@WebServlet("/SortListJob")
public class SortListJob extends HttpServlet {
	
	   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		   
		       String username=req.getParameter("user");
		      // System.out.println(username);
		       
		       SortListDao s=new SortListDao();
		       s.getConnection();
		       ArrayList<SortList> list=s.getData(username);
		       int i=0;
		       Iterator<SortList> itr=list.iterator();
		       while(itr.hasNext())
		       {
		    	  SortList ss=itr.next(); 
		    	  req.setAttribute("post"+i, ss.getPost());
		    	  req.setAttribute("company"+i,ss.getCompanyname());
		    	  i++;
		       }
		       req.setAttribute("size",i);
		       
		    req.getRequestDispatcher("sortlistjob.jsp").forward(req, resp);   
	}
}
