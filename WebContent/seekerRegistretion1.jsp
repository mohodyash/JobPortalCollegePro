	<!DOCTYPE html>

<html>
    <head>
        <title>Seeker Registretion</title>
        
        <link href="seekerRegistretion1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="mainmenu">
        <div class="menu">
            <h4>JOB PORTAL</h4>
        </div>
        <div class="list">                                                           <!-- list -->
            <ul>
                <li><a href="http://localhost:8082/JobPortalCollegePro/">HOME</p></a></li>
                <li><a href="#">LOGIN </p></a></li>
                <li><a href="#">REGISTER</a></li>
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
       <p id="la"><%HttpSession session1=request.getSession(false); 
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
       <input type="submit" id="b" value="log Out">
       </form>
     </div>                                                                                   <!-- user -->
                                                                                <!-- user --> 
   
    <div class="reg1">
       <div class="reg2">
        Seeker Contact Details
       </div>
       <div class="reg3">
       <form action="SeekerRegistretion1" method="post">
       <br>
       <input type="text" name="seekername" id="name" placeholder="Name" value="<% 
       String n=request.getParameter("seekername");
       if(n!=null)
       {
    	   out.print(n);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><% 
       String error1=(String)request.getAttribute("error1");
       if(error1!=null)
       {
    	   out.print(error1);
       }
       %></lable>
       <br>
       <input type="text" name="address" id="address" placeholder="Permanent Address" value="<% 
       String a=request.getParameter("address");
       if(a!=null)
       {
    	   out.print(a);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><% 
       String error2=(String)request.getAttribute("error2");
       if(error2!=null)
       {
    	  out.print(error2); 
       }
       %></lable>
       <br>
       <input type="text" name="city" id="city" placeholder="City Name" value="<% 
       String ci=request.getParameter("city");
       if(ci!=null)
       {
    	   out.print(ci);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><% 
       String error3=(String)request.getAttribute("error3");
       if(error3!=null)
       {
    	   out.print(error3);
       }
       %></lable>
       <br>
       <input type="text" name="contact" id="city" placeholder="Contact No" value="<%
       String co=request.getParameter("city");
       if(co!=null)
       {
    	   out.print(co);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error4=(String)request.getAttribute("error4");
       if(error4!=null)
       {
    	   out.print(error4);
       }
       %></lable>
       <br>
       <input type="text" name="Email" id="city" placeholder="Emial ID" value="<%
       String e=request.getParameter("Email");
       if(e!=null)
       {
    	   out.print(e);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error5=(String)request.getAttribute("error5");
       if(error5!=null)
       {
    	   out.print(error5);
       }
       %></lable>
       <br>
       <input type="text" name="username" id="city" placeholder="User Name" value="<%
       String u=request.getParameter("username");
       
       if(u!=null)
       {
    	   out.print(u);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error6=(String)request.getAttribute("error6");
       String error10=(String)request.getAttribute("error10");
       if(error6!=null)
       {
    	   out.print(error6);
       }
       if(error10!=null)
       {
    	   out.print(error10);
       }
       %></lable>
       <br>
       <input type="password" name="password" id="city" placeholder="Password" value="<% 
       String p=request.getParameter("password");
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error7=(String)request.getAttribute("error7");
       if(error7!=null)
       {
    	   out.print(error7);
       }
       %></lable>
       <br>
       <input type="Submit" value="NEXT" id="b1">
       </form>
       </div>
    </div>
    <div id="w1">
    
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