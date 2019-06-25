<!DOCTYPE html>

<html>
    <head>
        <title>Jobs</title>
        
        <link href="jobs.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="mainmenu">
        <div class="menu">
            <h4>JOB PORTAL</h4>
        </div>
        <div class="list">                                                           <!-- list -->
            <ul>
                <li><a href="http://localhost:8082/JobPortalCollegePro/"></p></a></li>
                <li><a href="http://localhost:8082/JobPortalCollegePro/login.jsp"><p style="color: rgb(255,255,0)"></p></a></li>
                <li><a href="http://localhost:8082/JobPortalCollegePro/registre.jsp"></a></li>
                <li><a href="#"></a></li>
                <li><a href="#"></a></li>
                <li><a href=""> </a></li>
                <li><a href=""> </a></li>
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
       </div>
       
       <div class="logout">
      <form action="LogOut" method="get">
       <input type="submit" id="b" value="Log Out">
       </form>
     </div> 
     
    
     <div class="heding">
     <label>Jobs</label>
     </div>
     
    <%
     //out.print("1");
      int size=(int)request.getAttribute("size");
      for(int i=0;i<size;i++)
      {
     %>
        <br><div style="background-color: white; width: 1000px; height: 200px; margin-left: 160px;     box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        ">
        <div style=" font-size: 20px; font-family: inherit; font-weight: bold; margin-left: 20px; margin-top: 10px; color: rgb(70,130,180);">
         <% out.print(" "+request.getAttribute("skill"+i)); out.print(" "+request.getAttribute("roll"+i)); out.print(" -- "+request.getAttribute("location"+i)); %>
        </div>
        <div style="margin-left: 20px; margin-top: 12px; font-size: 18px; font-family: serif; color:gray;">
         <% out.print(" "+request.getAttribute("cname"+i)); out.print(" "+"Limited"); %>
        </div>
        
        <div style="margin-left: 20px; font-family: serif; font-size: 17px; color: gray; margin-top: 8px;">
        <% out.print(" "+request.getAttribute("reqex"+i)); out.print(" year"); %>
        </div>

        <div style=" margin-left: 20px; font-family: serif; font-size: 17px; color: gray; margin-top: 8px;">
        <% out.print(" Hi Excellent Opportunity to work with Best Organization in the Word"); %>
        </div>
        <div style=" margin-left: 20px; font-family: serif; font-size: 17px; color: gray; margin-top: 8px;">
        <% out.print(" Go to See More and Get More Information and Apply"); %>
        </div>
        
          <div style="margin-top: -15px; margin-left: 800px; font-family: serif;">
         <form action="MoreInfoAboutJob" method="get">
           <input type="hidden" name="cname" value="<% out.print(request.getAttribute("cname"+i));%>">
           <input type="submit" value="See More" style="height: 30px; width: 130px; border: none; background-color: blue; color: white; font-weight: bold; cursor: pointer;">
         </form>
        </div>
        <div style=" margin-left: 20px; font-family: serif; font-size: 17px; color: gray; margin-top: 8px;">
        <% out.print(" Skill : "+request.getAttribute("skill"+i)); %>
        </div>
        
        </div> 
     <%
       
      }
    %>
   
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
                    
                                                            
    </body>
</html>    