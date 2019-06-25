package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SeekerDao {
	
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
		psmt=con.prepareStatement("select MAX(s_id) from seekercontact");
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
	public boolean checkuser(String username)
	{
		try {
			psmt=con.prepareStatement("select username from seekerContact where username=?");
			psmt.setString(1, username);
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
	public void storeContactData(int s_id,String seekername,String address ,String city,String contact,String Email,String username,String password)
	{
		try {
		psmt=con.prepareStatement("insert into seekercontact values(?,?,?,?,?,?,?,?)");
		psmt.setInt(1, s_id);
		psmt.setString(2, seekername);
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
	}
	public int getId()
	{
		//System.out.println("max 1");
		try {
		psmt=con.prepareStatement("select MAX(s_id) from seekercontact");
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
	public void storeEducationData(int s_id ,String education,String course,String specialization,String university,String passingoutYear,String per,String seekerType)
	{
		try {
			psmt=con.prepareStatement("insert into seekereducation values(?,?,?,?,?,?,?,?)");
			psmt.setInt(1, s_id);
			psmt.setString(2, education);
			psmt.setString(3, course);
			psmt.setString(4, specialization);
			psmt.setString(5, university);
			psmt.setString(6, passingoutYear);
			psmt.setString(7, per);
			psmt.setString(8, seekerType);
			psmt.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public int getsId()
	{
		//System.out.println("max 1");
		try {
		psmt=con.prepareStatement("select MAX(s_id) from seekercontact");
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
	public void storeSkillData(int s_id,String Skill)
	{
		try {
			psmt=con.prepareStatement("insert into seekerskill values(?,?)");
			psmt.setInt(1, s_id);
			psmt.setString(2,Skill);
			psmt.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public int getId1()
	{
		//System.out.println("max 1");
		try {
		psmt=con.prepareStatement("select MAX(s_id) from seekereducation");
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
	public void storeExData(int s_id ,String experience,String jobprofile,String organization,String Descjobprof,String skill)
	{
		try {
			psmt=con.prepareStatement("insert into seekerex values(?,?,?,?,?,?)");
			psmt.setInt(1, s_id);
			psmt.setString(2, experience);
			psmt.setString(3, jobprofile);
			psmt.setString(4, organization);
			psmt.setString(5, Descjobprof);
			psmt.setString(6, skill);
		
			psmt.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public Boolean validetion(String username,String password)
	{
		try {
		psmt=con.prepareStatement("select s_id from seekercontact where username=? and password=?");
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

}
