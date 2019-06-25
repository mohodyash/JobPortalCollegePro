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

import com.dao.DbConnection;
import com.dao.ProfileDao;


@WebServlet("/Downloadimg")
public class Downloadimg extends HttpServlet {
	byte[] img=null;
	ServletOutputStream sos=null;
	Connection con=null;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sql="select img from seekerprofile where s_id=? ";
        
        
        HttpSession session1=req.getSession(false);
 	    String username=(String)session1.getAttribute("username");
 	    ProfileDao p=new ProfileDao();
	   
	   //check is seeker or not using method
	   
	    p.getConnection();
	    int result[]= p.checkSeeker(username);
        int s_id= result[0];
		DbConnection d=new DbConnection();
		con=d.getConnection();
		try {
			 PreparedStatement psmt=con.prepareStatement(sql);
			 psmt.setInt(1, s_id);
			 ResultSet rs=psmt.executeQuery();
			 if(rs.next())
			 {
				 img=rs.getBytes(1);
			 }
			 sos=resp.getOutputStream();
			 sos.write(img);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
      
	}
}
