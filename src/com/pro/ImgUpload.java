package com.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DbConnection;
import com.dao.SeekerDao;

/**
 * Servlet implementation class ImgUpload
 */
@WebServlet("/ImgUpload")
public class ImgUpload extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
		//get id from db
      // String id=request.getParameter("id");
       
        SeekerDao s=new SeekerDao();
		s.getConnection();
		int s_id=s.getId();
       String img=request.getParameter("img"); // we get path of the img
       // now we take img file from the path that we use file input stream
       
       FileInputStream fis=new FileInputStream(new File(img));
       // fis contains bits and 
        DbConnection d=new DbConnection();
         Connection  con= d.getConnection();
         try {
         PreparedStatement psmt=con.prepareStatement("insert into seekerprofile values(?,?)");
         psmt.setInt(1, s_id);
         psmt.setBinaryStream(2, fis);
         int i=psmt.executeUpdate();
         if(i>0) {
        	 response.getWriter().println("successfully uploaded");
         }
         }
         catch (Exception e) {
			// TODO: handle exception
        	 System.out.println(e);
		}
         
         response.sendRedirect("seekerRegistretion2.jsp");	
	}

}
