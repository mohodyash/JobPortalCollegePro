package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ApplyDao;


@WebServlet("/ApplyForJob")
public class ApplyForJob extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String cname=req.getParameter("c_name");	
	   String roll=req.getParameter("post");
	   
	   String c_id=req.getParameter("c_id");
	   int c_id2=Integer.parseInt(c_id);
	   
	   resp.getWriter().println(cname);
	   resp.getWriter().println(c_id); 
	   
	   HttpSession session1= req.getSession();
       String username=(String)session1.getAttribute("username");
       if(username!=null)
       {
    	   
    	   // apply success
    	   // store data in db 
    	   ApplyDao a=new ApplyDao();
    	   a.getConnection();
    	   if(a.seekercheck(username))
    	   {
    	   int s_id=a.getId(username);
    	   boolean rs=a.check(c_id2, s_id);
    	   resp.getWriter().println("result="+rs);
    	   if(rs==false)
    	   {
    		   int no=a.storeData(c_id2, cname,s_id , username,roll);  
        	   req.getRequestDispatcher("successfullyapplyforjob.jsp").forward(req, resp);

    	   }
    	   else {
    		   req.getRequestDispatcher("allradyapplyforjob.jsp").forward(req, resp);
    	   }
    	   }
    	   else {
			  req.getRequestDispatcher("onlyseekercanapply.jsp").forward(req, resp);
		}
       }
       else{
    	   // fail
    	   // redirect to login page 
    	   req.getRequestDispatcher("login.jsp").forward(req, resp);
       }
	}

}
