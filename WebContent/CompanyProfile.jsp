<!DOCTYPE html>

<html>
    <head>
        <title>Company Profile</title>
        
        <link href="registre.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="mainmenu">
        <div class="menu">
            <h4>ONLINE JOB PORTAL</h4>
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
       <a href="./SeekerProfileServlet" style="text-decoration: none;">
       <p id="la"> <% 
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
  
       <div style="margin-left: 550px; margin-top: 20px; font-size: 21px; font-family: serif; font-weight: bold;">
          Company Profile
       </div>
       <div style="width: 500px; height: 400px; background-color: white; border: 1px solid gray; border-radius: 5px; margin-left: 400px; margin-top: 20px;">
          <div style="font-size: 19px; font-family: serif; color: grey; margin-left: 40px; margin-top: 40px;">
              <%@ page import ="com.collec.Company" %>
              <% Company c=(Company)request.getAttribute("company");%>
              <% out.print("Company Name : "+c.getCompanyname());%>
          </div>
          
          <div style="font-size: 19px; font-family: serif; color: grey; margin-left: 40px; margin-top: 40px;">    
              <% out.print("Address : "+c.getAddress());%>
          </div>
          
          <div style="font-size: 19px; font-family: serif; color: grey; margin-left: 40px; margin-top: 40px;">
              <% out.print("City : "+c.getCity());%>
          </div>
          <div style="font-size: 19px; font-family: serif; color: grey; margin-left: 40px; margin-top: 40px;">
              <% out.print("Contact : "+c.getContact());%>
          </div>
          <div style="font-size: 19px; font-family: serif; color: grey; margin-left: 40px; margin-top: 40px;">
              <% out.print("Email : "+c.getEmail());%>
          </div>

       </div>
    <footer>
   
    </footer>
                                                            
    </body>
</html>    