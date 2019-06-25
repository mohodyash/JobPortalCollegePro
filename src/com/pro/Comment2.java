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

import com.dao.CommentDao;
import com.collec.Comment;


@WebServlet("/Comment2")
public class Comment2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		 String comment=req.getParameter("coment");
	     CommentDao c=new CommentDao();
	     c.getConnection();
	     int max=c.maxId();
	     int id=max-5;
	     
	     
	        max++;
	        HttpSession session1=req.getSession();
	        String username=(String)session1.getAttribute("username");
	     //System.out.println("max id"+max);
	     c.storeData(max, username, comment);
	     
	     
	   
	     
	     req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}

}
