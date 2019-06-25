<!DOCTYPE html>

<html>
    <head>
        <title>Forget Password</title>
        
        <link href="login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="mainmenu">
        <div class="menu">
            <h4>JOB PORTAL</h4>
        </div>
        <div class="list">                                                           <!-- list -->
            <ul>
                <li><a href="http://localhost:8082/JobPortalCollegePro/">HOME</p></a></li>
                <li><a href="http://localhost:8082/JobPortalCollegePro/login.jsp">LOGIN </p></a></li>
                <li><a href="http://localhost:8082/JobPortalCollegePro/registre.jsp">REGISTER</a></li>
                <li><a href="#">LOCATION</a></li>
                  <li><a href="./Comment1">FEED BACK</a></li>
   
                <li><a href=""> ABOUT US</a></li>
                <li><a href=""> CONTACT US</a></li>
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
                                                                              <!-- user -->

   
    <div class="log">
        <div class="heding">
            <h3>Get Password</h3>
        </div>
        <div class="loginas">
            <form action="ForgetPassword" method="post">
                <p id="p">Get Password</p> 
                <select name="loginas" id="loginas">
                    <option value="seeker">seeker</option>
                    <option value="admin">admin</option>
                    <option value="company">company</option>
                </select>
                 
        </div>
        <div class="loginfield">
            <p id="user">User Name</p>
            <input type="text" name="username" id="user1" value="<%
            String u=request.getParameter("username");
            if(u!=null)
            {
            	out.print(u);
            }
            %>">
            <p style="color:red"><% 
            String error1=(String)request.getAttribute("error1");
            if(error1!=null)
            {
            	out.print(error1);
            }
            %></p>
            <p id="pass">Contact Number</p>
            <input type="number" name="contact" id="pass1" value="<%
            String p=request.getParameter("contact");
            if(p!=null)
            {
            	out.print(p);
            }
            %>">
            <p style="color:red"><%
            String error2=(String)request.getAttribute("error2");
            if(error2!=null)
            {
            	out.print(error2);
            }
            %></p>
            <br>
           <input type="submit" value="GET" id="b1">
           
        </form> 
        </div>
    </div>
              <footer >
       <div class="footer" style="background-color:rgba(0,0,0,0.7);
	       margin-top: 150px;
	       height: 300px;">
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