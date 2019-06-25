<!DOCTYPE html>

<html>
    <head>
        <title>More About The Job</title>
        
        <link href="seemorejob.css" rel="stylesheet" type="text/css"/>
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
      <div style=" font-size: 20px; font-family: serif; font-weight: bold; margin-left: 490px;">
        All About The Job And Company	
      </div>
      <div style="background-color: white; width: 1000px; height: 1050px; margin-left: 180px; margin-top: 30px;     box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
      ">
          <div style="margin-left: 410px; margin-top: 20px; font-size: 22px; font-family: serif; color: navy;">
            <% out.print(" "+request.getAttribute("skill")); out.print(" "+request.getAttribute("role")); out.print("--"+request.getAttribute("city")); %>
          </div>
          <div style="margin-left: 150px; margin-top: 30px; font-size: 19px; font-family: serif; color: gray;">
           <%  out.print("Package - Rs - "+request.getAttribute("package")); %>
          </div>
          <div style="margin-left: 500px;margin-top: -22px; font-size: 19px; font-family: serif; color: gray;">
          <% out.print("Exp - "+request.getAttribute("ex")+" Year"); %>
          </div>
          <div style="margin-left: 700px; margin-top: -22px; font-size: 19px; font-family: serif; color: gray;">
           <% out.print("location - "+request.getAttribute("city")); %>
          </div>
          
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; color: gray; font-family: serif;">
           <% out.print("Company Name - "+request.getAttribute("cname")+" Limited");%>
          </div>
          <div style="margin-left: 500px; margin-top: -22px; font-size: 18px; font-family: serif; color: gray;"> 
           <% out.print("Industry - "+request.getAttribute("ctype")); %>
          </div>
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Company contact - "+request.getAttribute("contact"));%>
          </div>
          <div style="margin-left: 500px; margin-top: -22px; font-size: 18px; font-family: serif; color: gray;"> 
            <% out.print("Company Email - "+request.getAttribute("Email")); %>
          </div>
          
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Company Address - "+request.getAttribute("location"));%>
          </div>
          
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: blue; ">
           <% out.print("Skill :");%>
          </div>
          
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Skill - Complete "+request.getAttribute("skill"));%>
          </div>
          
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Language - "+request.getAttribute("lang")+", Best Communication  skill and Group Performence");%>
          </div>
          
           <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: blue; ">
           <% out.print("Education :");%>
          </div>
          
            <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Education - "+request.getAttribute("education"));%>
          </div>
          
           <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: blue; ">
           <% out.print("Interview Details :");%>
          </div>
          
           <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Interview Date - "+request.getAttribute("edate"));%>
          </div>
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Interview Address - "+request.getAttribute("eaddress"));%>
          </div>
          
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Interview Address - "+request.getAttribute("eaddress"));%>
          </div>
          
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: gray; ">
           <% out.print("Interview Time - "+request.getAttribute("time"));%>
          </div>
          
          <div style=" margin-left: 150px; margin-top: 40px; font-size: 18px; font-family: serif; color: green; ">
           <% out.print("Tanks to use our job poratal to find a best jobs  for apply The job click on Apply Button  ");%>
          </div>
          
          <div>
            <form action="ApplyForJob" method="get">
            <input type="hidden" name="c_id" value="<% out.print(request.getAttribute("c_id"));%>">
            <input type="hidden" name="c_name" value="<%out.print(request.getAttribute("cname")); %>">
            <input type="hidden" name="post" value="<%out.print(request.getAttribute("role"));%>">
            <input type="submit" value="Apply" style="margin-left: 400px; margin-top: 40px; width: 150px; height: 30px; background-color: blue; color: white; font-family: serif; font-size: 18px; border: none; cursor: pointer;">
            </form>
          </div>
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
                                                 
    </body>
</html>    