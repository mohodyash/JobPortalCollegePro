<!DOCTYPE html>

<html>
    <head>
        <title>Seeker Profile</title>
        
        <link href="registre.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="mainmenu">
        <div class="menu">
            <h4>JOB PORTAL</h4>
        </div>
        <div class="list">                                                           <!-- list -->
            <ul>
                <li><a href="http://localhost:8082/JobPortalCollegePro/index.jsp" style="margin-left: 250px;">BACK TO HOME</a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></p></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
            </ul>
        </div>
        </div> 
        
        <div class="user">
      
       <div class="logo">
       <p id="lo">U</p>
       </div>
       <div class="lable">
    <a href="./SeekerProfileServlet" style="text-decoration: none;"><p id="la"> <% 
    HttpSession session1=request.getSession(false);
    String username=(String)session.getAttribute("username");
    if(username!=null)
    {
    	 out.print(username);
    }
    else{
    	out.print("UserName");
    }
   
    %></p></a>
       </div>
       </div>
       
        <div class="logout">
        <form action="LogOut" method="get">
       <input type="submit" id="b" value="log Out">
       </form>
     </div>                                                                                   <!-- user -->
  
     <div style="margin-left: 550px; font-size: 25px; font-family: serif;  font-weight: bold;">
        Seeker Profile
        <%@ page import="com.collec.Seeker" %>
        <%  Seeker s=(Seeker)request.getAttribute("seeker");  
        %>
        
     </div>
     <div style="border:1px solid grey; background-color: white; width: 1050px; margin-left: 130px; margin-top: 20px; border-radius: 5px; height: 1100px;">
      <div style="border: 1px solid black; background-color: grey; width: 120px; height: 150px; margin-left: 850px; margin-top: 130px;">
      <img src="./Downloadimg" width="120px" height="150px">
      </div>
      
      <div style="margin-top: -150px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Name : "+s.getSeekername()); %>
      </div>
      <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Location : "+s.getCity()); %>
      </div>
      
      <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Address : "+s.getAddress()); %>
      </div>
      
      <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Contact : "+s.getContact()); %>
      </div>
      
       <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Email Id : "+s.getEmail()); %>
      </div>
      
      <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("User Name : "+s.getUsername()); %>
      </div>
      
      <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; color:green; font-family: serif;  font-weight: bold;">
       <% out.print("Education ::"); %>
      </div>
      
      <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Education : "+s.getEducation()); %>
      </div>
      
      <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Course : "+s.getCourse()); %>
      </div>
      
      <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Specialization : "+s.getSpecialization()); %>
      </div>
      <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("University : "+s.getUniversity()); %>
      </div>
      
       <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Passing out year : "+s.getPassingoutyear()); %>
      </div>
      
      <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print("Through out Percentage : "+s.getPer()); %>
      </div>
      
       <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% out.print(" Employee Type : "+s.getSeeekrtype()); %>
      </div>
      
      <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% 
        String ex=s.getExperience();
        out.print("Experience : ");
        if(ex!=null)
        {
        out.print(ex+" year"); 
        }
        else{
        	out.print("0"+" year");
        }
        %>
      </div>
      
      <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: green; font-weight: bold;">
       <% out.print(" About Employee Job Profile ::"); %>
      </div>
      <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% 
       String stype=s.getJobprofile();
       out.print(" Employee Type : "); 
       if(stype!=null)
       {
    	   out.print(stype);
       }
       else{
    	   out.print("- - -");
       }
       %>
      </div>
      
       <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% 
        String organization=s.getOrganization();
        out.print("Organization : ");
        if(ex!=null)
        {
        out.print(organization); 
        }
        else{
        	out.print("- - -");
        }
        %>
      </div>
      
      <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% 
       String descjobprofile=s.getDescjobprofile();
       out.print(" About Job Profile : "); 
       if(stype!=null)
       {
    	   out.print(descjobprofile);
       }
       else{
    	   out.print("- - -");
       }
       %>
      </div>
      
       <div style="margin-top: -21px; margin-left: 550px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% 
        String organization1=s.getOrganization();
        out.print("Organization : ");
        if(ex!=null)
        {
        out.print(organization1); 
        }
        else{
        	out.print("- - -");
        }
        %>
      </div>
      
      <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: green; font-weight: bold;">
       <% out.print(" Skill ::"); %>
      </div>
      
            <div style="margin-top: 50px; margin-left: 70px; font-size: 19px; font-family: serif; color: grey; font-weight: bold;">
       <% 
       String skill=s.getSkill();
       
       out.print(" Skill : "); 
       if(stype!=null)
       {
    	   out.print(skill);
       }
       else{
    	   out.print(s.getSkill1());
       }
       %>
      </div>
     </div>
     <br>
     <br>
     
     <div style="border: 1px solid gray; background-color: white; width: 700px; margin-left:300px; height: 300px; border-radius: 5px;">
      <center><div style=" margin-top: 10px; color: gray; ">
          
            <form action="SortListJob" method="get">
             <input type="hidden" name="user" value="<%=s.getUsername()%>">
             <input type="submit" value="Sort List Job" style="width: 150px; height: 30px; margin-top: 100px; background-color: orange; cursor: pointer; border: none; font-size: 18px; font-family: inherit; color:white;">
            </form>
               
           <%--  fro --%>
        </div></center>
     </div>
     <br>
     <br>
     <br>
     <br>
     
    <footer>
   
    </footer>
                                                            
    </body>
</html>    