package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {

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
		psmt=con.prepareStatement("select MAX(a_id) from admin");
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
	public void storeData(int a_id,String adminname,String address,int e_id,String contact,String email,String username,String password)
	{
		try {
	    psmt=con.prepareStatement("insert into admin values(?,?,?,?,?,?,?,?)");	
	    psmt.setInt(1, a_id);
	    psmt.setString(2, adminname);
	    psmt.setString(3, address);
	    psmt.setInt(4, e_id);
	    psmt.setString(5, contact);
	    psmt.setString(6, email);
	    psmt.setString(7, username);
	    psmt.setString(8, password);
	    psmt.executeUpdate();
	    
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public Boolean validetion(String username,String password)
	{
		try {
		psmt=con.prepareStatement("select a_id from admin where username=? and password=?");
		psmt.setString(1, username);
		psmt.setString(2, password);
		rs=psmt.executeQuery();
		while(rs.next())
		{
		   return true;
		
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		return false;
		
	}
	public String getPassword(String username,String contact)
	{
		try {
		psmt=con.prepareStatement(" select password from admin where username=? and contact=?");
		psmt.setString(1, username);
		psmt.setString(2, contact);
	rs=	psmt.executeQuery();
	while(rs.next())
	{
		return rs.getString(1);
	}
	}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}


}
