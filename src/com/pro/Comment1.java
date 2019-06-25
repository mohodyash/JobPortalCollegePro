package com.pro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CommentDao;
import com.collec.*;


/**
 * Servlet implementation class Comment
 */
@WebServlet("/Comment1")
public class Comment1 extends HttpServlet {
	
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	  CommentDao c=new CommentDao();
    	  c.getConnection();
    	  
    	  int max=c.maxId();
    	  int id=max-5;
    	  ArrayList<Object> com=c.getData();
 	     
 	     
 	     Iterator<Object> itr=com.iterator();
 	     int i=0;
 	     
 	     
 	     
 	     
 	     while(itr.hasNext())
 	     {
 	    	 
 	    	 Comment cc=(Comment)itr.next();
 	    	 req.setAttribute("user"+i, cc.getUsername());
 	    	 req.setAttribute("comment"+i,cc.getComment());
 	    	 
 	    	 i++;
 	    	 
 	    	 
 	     }
 	     req.setAttribute("size",i);
 	     req.setAttribute("id", id);
    	
    	req.getRequestDispatcher("Comment.jsp").forward(req, resp);
    	
    	
    }
 

}
