package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.collec.Comment;

public class CommentDao {
    
	Connection con=null;
	PreparedStatement psmt=null;
	ResultSet rs=null;
	int max=0;
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
	public int maxId()
	{
		//System.out.println("max 1");
		try {
		psmt=con.prepareStatement("select MAX(c_no) from comment");
		rs=psmt.executeQuery();
		while(rs.next())
		{
			max=rs.getInt(1);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		//System.out.println("max 2");
		return max;
	}
	public void storeData(int c_no,String username,String comment)
	{
		try {
			psmt=con.prepareStatement("insert into comment values(?,?,?)");
			psmt.setInt(1, c_no);
			psmt.setString(2, username);
			psmt.setString(3, comment);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ArrayList<Object> getData()
	{
	      ArrayList<Object> com= new ArrayList<Object>();
	      
	      try {
			psmt=con.prepareStatement("select * from comment");
			rs=psmt.executeQuery();
			while(rs.next())
			{
				Comment c=new Comment();
			    c.setUsername(rs.getString(2));
			    c.setComment(rs.getString(3));
			    
			    com.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	      
	      
		  return com;
		 
	}

}
