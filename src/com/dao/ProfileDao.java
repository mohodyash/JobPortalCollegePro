package com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collec.Seeker;

@WebServlet("/ProfileDao")
public class ProfileDao extends HttpServlet {
	
	Connection con=null;
	PreparedStatement psmt=null;
	ResultSet rs=null;
	int id=0;
	int[] a=new int[2];
	public void getConnection() {
	
	
	try {
    Class.forName("com.mysql.jdbc.Driver");  
    System.out.println(1);
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal","root","yash");  
	System.out.println(2);
	
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	}
	public int[] checkSeeker(String username)
	{
		try {
			 psmt=con.prepareStatement("select s_id from seekercontact where username=?");
			 psmt.setString(1, username);
			 rs=psmt.executeQuery();
			 
			 while(rs.next())
			 {
		         id= rs.getInt(1);
				 a[0]=id;
				 a[1]=10;
				 return a;
			 }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return a;
	}
	public int[] checkCompany(String username)
	{
		try {
			 psmt=con.prepareStatement("select c_id from company where username=?");
			 psmt.setString(1, username);
			 rs=psmt.executeQuery();
			 while(rs.next())
			 {
				 id=rs.getInt(1);
		         a[0]=id;
		         a[1]=20;
		         return a;
			 }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return a;
	
	}
	public int[] checkAdmin(String username)
	{
		try {
			 psmt=con.prepareStatement("select a_id from admin where username=?");
			 psmt.setString(1, username);
			 rs=psmt.executeQuery();
			 while(rs.next())
			 {
				 id=rs.getInt(1);
				 a[0]=id;
				 a[1]=30;
				 return a;
			 }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return a;
	}
   public Object getSeekerContact(int id)
   {
	   Seeker s=new Seeker();
	   try {
		   
		   psmt=con.prepareStatement("select * from seekercontact where s_id=?");
		   psmt.setInt(1, id);
		   rs=psmt.executeQuery();
		   while(rs.next())
		   {
			s.setSeekername(rs.getString(2));   
			s.setAddress(rs.getString(3));
			s.setCity(rs.getString(4));
			s.setContact(rs.getString(5));
			s.setEmail(rs.getString(6));
			s.setUsername(rs.getString(7));
		   }
		   psmt=con.prepareStatement("select * from seekereducation where s_id=?");
		   psmt.setInt(1, id);
		   rs=psmt.executeQuery();
		   while(rs.next())
		   {
			   s.setEducation(rs.getString(2));
			   s.setCourse(rs.getString(3));
			   s.setSpecialization(rs.getString(4));
			   s.setUniversity(rs.getString(5));
			   s.setPassingoutyear(rs.getString(6));
			   s.setPer(rs.getString(7));
			   s.setSeeekrtype(rs.getString(8));
			   
		   }
		   psmt=con.prepareStatement("select * from seekerSkill where s_id=?");
		   psmt.setInt(1, id);
		   rs=psmt.executeQuery();
		   while(rs.next())
		   {
			   s.setSkill1(rs.getString(2));
		   }
		   psmt=con.prepareStatement("select * from seekerex where s_id=?");
		   psmt.setInt(1, id);
		   rs=psmt.executeQuery();
		   while(rs.next())
		   {
			   s.setExperience(rs.getString(2));
			   s.setJobprofile(rs.getString(3));
			   s.setOrganization(rs.getString(4));
			   s.setDescjobprofile(rs.getString(5));
			   s.setSkill(rs.getString(6));
		   }
	   } 
	   catch (Exception e) {
		// TODO: handle exception
	}
	return s;
   }
   public void getSeekerEducation(int id)
   {
	   
   }
   public void getSeekerEx(int id)
   {
	   
   }
   public void getSeekerProfile(int id)
   {
	   
   }
   public void getSeekerSkill(int id)
   {
	   
   }
}
  
