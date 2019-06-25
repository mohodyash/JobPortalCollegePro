package com.pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collec.Roll;
import com.dao.SortListDao;

/**
 * Servlet implementation class SortListServlet
 */
@WebServlet("/SortListServlet")
public class SortListServlet extends HttpServlet {
   
	           
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String seeker=req.getParameter("username");
        String company=req.getParameter("company");
        String post=Roll.getRoll();
        
       // System.out.println(seeker);
       // System.out.println(company);
       // System.out.println(post);
        
        SortListDao s=new SortListDao();
        s.getConnection();
        
        if(s.checkSeeker(seeker, post, company)==false)
        {
        
        s.storeData(seeker, post, company);
        
        s.deleteApplyData(seeker, post);
        
        req.getRequestDispatcher("sortlistsuccess.jsp").forward(req, resp);
        }
        else {
        	 req.getRequestDispatcher("allredysortlist.jsp").forward(req, resp);
        }
	}
}
