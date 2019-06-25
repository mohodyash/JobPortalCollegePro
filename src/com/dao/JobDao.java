package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.collec.Company;
import com.collec.Job;

public class JobDao {

	Connection con=null;
	PreparedStatement psmt=null;
	ResultSet rs=null;
	int c_id;
	
	
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
	public ArrayList<Object> getDataj(int c_id)
	{
		System.out.println("c_id="+c_id);
		ArrayList<Object> job1=new ArrayList<>();
		try {
			System.out.println("5 0f 1");
			psmt=con.prepareStatement("select * from job where c_id=?");
			psmt.setInt(1, c_id);
		
			rs=psmt.executeQuery();
			
			System.out.println("5 of 2");
			while(rs.next())
			{
				System.out.println("5 of 3");
				Job j=new Job();
				
				j.setC_id(rs.getInt(1));
				j.setCompanytype(rs.getString(2));
				j.setRequirment(rs.getString(3));
				j.setReqEx(rs.getString(4));
				j.setSalary(rs.getString(5));
				j.setJoblocation(rs.getString(6));
				j.setJobtype(rs.getString(7));
				j.setSkill(rs.getString(8));
				j.setEducation(rs.getString(9));
				j.setLanguage(rs.getString(10));
				j.setRoll(rs.getString(11));
				j.setEdate(rs.getString(12));
				j.setAddress(rs.getString(13));
				j.setTime(rs.getString(14));
				
				job1.add(j);
				
			}
			
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return job1;
		
	}
	public String getname(int id)
	{
		String name=null;
		try {
			psmt=con.prepareStatement("select companyname from company where c_id=?");
			psmt.setInt(1, id);
			rs=psmt.executeQuery();
			while(rs.next())
			{
				name=rs.getString(1);
			}
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return name;
	}
	

	public ArrayList<Object> getData(String cname)
	{
		ArrayList<Object> company=new ArrayList<>();
		try {
			System.out.println("3 0f 1");
			psmt=con.prepareStatement("select * from company where companyname=?");
			psmt.setString(1, cname);
			rs=psmt.executeQuery();
			
			System.out.println("3 of 2");
			while(rs.next())
			{
				System.out.println("3 of 4");
				/*System.out.println("1 of 3");
				Job j=new Job();
				c_id=rs.getInt(1);
				j.setC_id(rs.getInt(1));
				j.setCompanytype(rs.getString(2));
				j.setRequirment(rs.getString(3));
				j.setReqEx(rs.getString(4));
				j.setSalary(rs.getString(5));
				j.setJoblocation(rs.getString(6));
				j.setJobtype(rs.getString(7));
				j.setSkill(rs.getString(8));
				j.setEducation(rs.getString(9));
				j.setLanguage(rs.getString(10));
				j.setRoll(rs.getString(11));
				j.setEdate(rs.getString(12));
				j.setAddress(rs.getString(13));
				j.setTime(rs.getString(14));
				
				job.add(j);*/
				
				Company c=new Company();
				c.setC_id(rs.getInt(1));
				c.setCompanyname(rs.getString(2));
				c.setAddress(rs.getString(3));
				c.setCity(rs.getString(4));
				c.setContact(rs.getString(5));
				c.setEmail(rs.getString(6));
				company.add(c);
				
				
				
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		System.out.println("3 of 3");
		return company;
	}
	public ArrayList<Object> searchJob(String skill,String location,String expre)
	{
		ArrayList<Object> job=new ArrayList<>();
		try {
			System.out.println("1 0f 1");
			psmt=con.prepareStatement("select * from job where skill=? and joblocation=? and reqEx=?");
			psmt.setString(1, skill);
			psmt.setString(2, location);
			psmt.setString(3, expre);
			rs=psmt.executeQuery();
			
			System.out.println("1 of 2");
			while(rs.next())
			{
				System.out.println("1 of 3");
				Job j=new Job();
				c_id=rs.getInt(1);
				j.setC_id(rs.getInt(1));
				j.setCompanytype(rs.getString(2));
				j.setRequirment(rs.getString(3));
				j.setReqEx(rs.getString(4));
				j.setSalary(rs.getString(5));
				j.setJoblocation(rs.getString(6));
				j.setJobtype(rs.getString(7));
				j.setSkill(rs.getString(8));
				j.setEducation(rs.getString(9));
				j.setLanguage(rs.getString(10));
				j.setRoll(rs.getString(11));
				j.setEdate(rs.getString(12));
				j.setAddress(rs.getString(13));
				j.setTime(rs.getString(14));
				
				job.add(j);
				
			}
			
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return job;
		
	}
	public Company getData1(int id)
	{
		Company c=new Company();
		try {
			System.out.println("3 0f 1");
			psmt=con.prepareStatement("select * from company where c_id=?");
			psmt.setInt(1, id);
			rs=psmt.executeQuery();
			
			System.out.println("3 of 2");
			while(rs.next())
			{
				c.setCompanyname(rs.getString(2));
				c.setAddress(rs.getString(3));
				c.setCity(rs.getString(4));
				c.setContact(rs.getString(5));
				c.setEmail(rs.getString(6));
		        
			}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		System.out.println("3 of 3");
		return c;
	}
	
}
			
