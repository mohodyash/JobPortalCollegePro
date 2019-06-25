<!DOCTYPE html>

<html>
    <head>
        <title>successfully login</title>
        
        <link href="CompanyloginSucces.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="mainmenu">
        <div class="menu">
            <h4>JOB PORTAL</h4>
        </div>
       
        <div class="list">                                                           <!-- list -->
            <ul>
                <li><a href="http://localhost:8082/JobPortalCollegePro/index.jsp">HOME</a></li>
                <li><a href="http://localhost:8082/JobPortalCollegePro/login.jsp">  LOGIN </a></li>
                <li><a href="">REGISTER</p></a></li>
                <li><a href="#">LOCATION</a></li>
                 <li><a href="./Comment1">FEED BACK</a></li>
                
                <li><a href="#"> ABOUT US</a></li>
                <li><a href="#"> CONTACT US</a></li>
            </ul>
        </div>
        </div> 
        
      <div class="user">
      
       <div class="logo">
       <p id="lo">U</p>
       </div>
       <div class="lable">
       <a href="./SeekerProfileServlet" style="text-decoration: none;">
       <p id="la"><% HttpSession session1= request.getSession();
                   String username=(String)session1.getAttribute("username");
                   if(username!=null)
                   {
                	   out.print(username);
                   }
                   else{
                	   out.print("UserName");
                   }
    	  %></p></a>
      
      
       
       </div>
           </div>                                                                             <!-- user -->
  
     <div class="logout">
      <form action="LogOut" method="get">
       <input type="submit" id="b" value="log Out">
       </form>
     </div>
    
    <div class="heding">
    <h1></h1>
    </div>
                
    <div class="post">
    <a href="http://localhost:8082/JobPortalCollegePro/postajob.jsp"><span>Post a Job Almost Free</span></a>
    </div>          
    <br><br><br>
    <div style="     box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
     background-color: white; width: 900px; height: 1000px; border-radius: 5px; margin-left: 220px; ">
      <div style="margin-top: 10px; margin-left: 370px; color: gray;">
          Seeker Applied for job
      </div>
           
       
       <% int size=(int)request.getAttribute("size");
        
         for(int i=0;i<size;i++)
         {
        %>
        <div style="width: 850px; margin-left:20px; margin-top:20px; height: 40px; background-color:white; border: 0px solid grey; border-radius: 5px; font-size: 20px; font-family: inherit; ">
           <label style="color: grey; ">Seeker Name</label><label style="color: grey;"><% out.print(" :: "+request.getAttribute("s_name"+i));%></label>
           <label style="color: grey; margin-left: 90px;">Job Profile</label><label style="color: grey;"><% out.print(" :: "+request.getAttribute("roll"+i));%></label>
           <form action="SeekerProfile" method="get">
              <input type="hidden" name="seekername" value="<%=request.getAttribute("s_name"+i)%>">
              <input type="hidden" name="post" value="<%=request.getAttribute("roll"+i)%>">
              <input type="submit" value="Profile" style=" margin-top:-20px; width: 100px; height: 30px; border: none; background-color: orange; font-size: 18px; color: white; font-weight: bold; cursor: pointer; font-family: inherit; margin-left: 750px; "> 
           </form>
        </div>
          
        <hr style="margin-top: 30px; color:grey;">
        <%
        }     
        %> 
      
       </div>
       
    <footer >
       <div class="footer">
         <div style="margin-left: 120px; padding-top: 20px;">
           <h3 style="color: white; font-family:inherit; font-size: 22px; font-weight: bold; ">Information</h3>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">About us</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Terms & Condition</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Privacy Policy</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Careers with us</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Contact us</h4>
         </div>
         <div style="margin-left: 420px; margin-top: -190px;">
           <h3 style="color: white; font-family:inherit; font-size: 22px; font-weight: bold; ">Learning with us</h3>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">IT & Telecom</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Banking & Finance</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Digital Marketing </h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">HR & admin</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Data Science	</h4>
         </div>
         
           <div style="margin-left: 720px; margin-top: -190px;">
           <h3 style="color: white; font-family:inherit; font-size: 22px; font-weight: bold; ">Ambition Box</h3>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Interview Questions</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">About Companies</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Share Interview Story </h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Write Company Review</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Company Reviews	</h4>
         </div>
          <div style="margin-left: 1020px; margin-top: -190px;">
           <h3 style="color: white; font-family:inherit; font-size: 22px; font-weight: bold; ">Employers</h3>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Post Jobs</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Manage Responses</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Report a Problem </h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Buy Online</h4>
           <h4 style="color:white; font-family: inherit; margin-top: 15px;">Naukri RMS	</h4>
         </div>
         
         <div style=" color: white; margin-top: 50px; margin-left: 400px; font-family: inherit; ">
           Ph No :: 8605240554
         </div>
         <div style=" color: white; margin-top: -20px; margin-left: 700px; font-family: inherit;">
           Email :: Yashmohod@gmail.com
         </div>
       </div>
    </footer> 
    <marquee style="font-family:Book Antiqua; color:grey ; padding: 20px; font-family: serif; font-size: 20px;" bgcolor="white" scrolldelay="90"  >Google  Wipro  Infosys  TCS  TechM  KPIT  Capgemini  Techno  3D PML  Info Tech  Fluent  amazon IBM   </marquee>
          
    </div>                            
    </body>
</html>    