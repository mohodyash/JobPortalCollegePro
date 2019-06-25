package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.collec.SortList;
import com.mysql.fabric.xmlrpc.base.Array;

public class SortListDao {

	
	Connection con=null;
	PreparedStatement psmt=null;
	ResultSet rs=null;
	
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
   public void storeData(String seeker,String post,String company)
   {
	   try {
		   System.out.println("1 0f 3+1");
		psmt=con.prepareStatement("insert into sortlist values(?,?,?)");
		psmt.setString(1, seeker);
		psmt.setString(2, post);
		psmt.setString(3, company);
		psmt.executeUpdate();
		System.out.println("1 of 3+2");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public void deleteApplyData(String seeker,String post)
   {
	   try {
		psmt=con.prepareStatement("delete from companyapply where seekername=? and roll=?");
		psmt.setString(1, seeker);
		psmt.setString(2, post);
		psmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   public boolean checkSeeker(String seeker,String post,String company)
   {
	   try {
		psmt=con.prepareStatement("select * from sortlist where username=? and post=? and companyname=?");
		psmt.setString(1, seeker);
		psmt.setString(2, post);
		psmt.setString(3, company);
		rs=psmt.executeQuery();
		while(rs.next())
		{
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	   
   }
   public ArrayList<SortList> getData(String username)
   {
	   ArrayList<SortList> a=new ArrayList<>();
	   try {
		psmt=con.prepareStatement("select * from sortlist where username=?");
		psmt.setString(1, username);
		rs=psmt.executeQuery();
		
		int i=0;
		while(rs.next())
		{
		  	SortList s=new SortList();
		  	s.setUsername(rs.getString(1));
		  	s.setPost(rs.getString(2));
		  	s.setCompanyname(rs.getString(3));
		  	
		  	a.add(s);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   return a;
   }


}
