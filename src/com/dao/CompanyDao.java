package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CompanyDao {
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
		psmt=con.prepareStatement("select MAX(c_id) from company");
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
	public void storeData(int c_id,String companyname,String address,String city,String contact, String Email,String username,String password)
	{
		System.out.println("store 1");
		try {
		psmt=con.prepareStatement("insert into company values(?,?,?,?,?,?,?,?)");
		psmt.setInt(1,c_id);
		psmt.setString(2, companyname);
		psmt.setString(3, address);
		psmt.setString(4, city);
		psmt.setString(5, contact);
		psmt.setString(6, Email);
		psmt.setString(7, username);
		psmt.setString(8, password);
		psmt.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("store 2");
	}
	public Boolean validetion(String username,String password)
	{
		try {
		psmt=con.prepareStatement("select c_id from company where username=? and password=?");
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
		psmt=con.prepareStatement(" select password from company where username=? and contact=?");
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
	
	public int getId(String username)
	{
		int c_id=0;
		try
		{
		psmt=con.prepareStatement("select c_id from company where username=?");
		psmt.setString(1, username);
		rs=psmt.executeQuery();
		while(rs.next())
		{
			c_id=rs.getInt(1);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return c_id;
	}
	
	public void storeJob(int c_id,String Companytype,String requirment,String reqEx,String salary,String joblocation,String jobtype,String skill,String education,String language,String roll,String edate,String address,String time)
	{
		
		System.out.println("sj"+1);
		try {
		psmt=con.prepareStatement("insert into job values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");//14
		psmt.setInt(1, c_id);
		psmt.setString(2, Companytype);
		psmt.setString(3, requirment);
		psmt.setString(4, reqEx);
		psmt.setString(5, salary);
		psmt.setString(6, joblocation);
		psmt.setString(7, jobtype);
		psmt.setString(8, skill);
		psmt.setString(9, education);
		psmt.setString(10, language);
		psmt.setString(11, roll);
		psmt.setString(12, edate);
		psmt.setString(13, address);
		psmt.setString(14, time);
		
		psmt.executeUpdate();
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
					
	}
	public boolean validation1(int c_id,String skill)
	{
		try {
			psmt=con.prepareStatement("select * from job where c_id=? and skill=?");
			psmt.setInt(1, c_id);
			psmt.setString(2, skill);
			rs=psmt.executeQuery();
			while(rs.next())
			{
				return true;
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	
}
