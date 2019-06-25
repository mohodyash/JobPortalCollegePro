package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.collec.Apply;

public class ApplyDao {
	
	Connection con=null;
	PreparedStatement psmt=null;
	ResultSet rs=null;
	//int max=0;
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
	
	public int getId(String sname) {
		int id=0;
		try {
			psmt=con.prepareStatement("select s_id from seekercontact where username=?");
			psmt.setString(1, sname);
			rs=psmt.executeQuery();
			while(rs.next())
			{
				id=rs.getInt(1);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return id;
	}
	
	public boolean check(int c_id,int s_id)
	{
		try {
			psmt=con.prepareStatement("select * from companyapply where c_id=? and s_id=?");
			psmt.setInt(1, c_id);
			psmt.setInt(2, s_id);
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
	public int storeData(int c_id, String cname, int s_id, String sname,String roll)
	{
		System.out.println("10 of 1");
		int no=0;
		try {
			System.out.println("10 of 2");
			psmt=con.prepareStatement("insert into companyapply values(?,?,?,?,?)");
			System.out.println("10 of 3");
			psmt.setInt(1, c_id);
			psmt.setString(2, cname);
			psmt.setInt(3, s_id);
			psmt.setString(4, sname);
			psmt.setString(5, roll);
		    no=psmt.executeUpdate();
		    System.out.println("10 of 4");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return no;
		
	}
	// chech user is seeker or not
    public boolean seekercheck(String username)
    {
    	try {
    		psmt=con.prepareStatement("select * from seekercontact where username=?");
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
    public ArrayList<Apply> getApplyData(String username)
    {   
    	
    	System.out.println("apply 1");
    	
        int i=0;
    	ArrayList<Apply> apply=new ArrayList<>();
    	try {
    	System.out.println("apply 4");
    	psmt=con.prepareStatement("select * from companyapply where cname=?");
    	psmt.setString(1, username);
    	rs=psmt.executeQuery();
    	System.out.println("apply 5");
    	while(rs.next())
    	{
    		Apply aa=new Apply();
    		System.out.println("apply 2");
    		aa.setC_name(rs.getString(2));
    		aa.setS_name(rs.getString(4));
    		aa.setRoll(rs.getString(5));
    		
    		apply.add(aa);
    		
    	}
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	System.out.println("apply 3");
    	return apply;
    }
}
