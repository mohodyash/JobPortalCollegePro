<!DOCTYPE html>

<html>
    <head>
        <title>Company Registretion</title>
        
        <link href="comRegistretion.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="mainmenu">
        <div class="menu">
            <h4>JOB PORTAL</h4>
        </div>
        <div class="list">                                                           <!-- list -->
            <ul>
                <li><a href="http://localhost:8082/JobPortalCollegePro/">HOME</p></a></li>
                <li><a href="">LOGIN </p></a></li>
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
     </div>                                                                              <!-- user -->
   
    <div class="reg1">
       <div class="reg2">
        Company Registretion Form
       </div>
       <div class="reg3">
       <form action="CompanyRegistretionServlet" method="post">
       <br><br>
       <input type="text" name="companyname" id="name" placeholder="Company Name" value="<% 
       String c=request.getParameter("companyname");
       if(c!=null)
       {
    	   out.print(c);
       }
       %>">
       <lable style="color:red;"><% 
       String error1=(String)request.getAttribute("error1");
       if(error1!=null)
       {
    	   out.print(error1);
       }
       %></lable>
       
       <input type="text" name="address" id="address" placeholder="Address" value="<% 
       String a=request.getParameter("address");
       if(a!=null)
       {
    	   out.print(a);
       }
       %>">
       <lable style="color:red;"><% 
       String error2=(String)request.getAttribute("error2");
       if(error2!=null)
       {
    	  out.print(error2); 
       }
       %></lable>
      
       <input type="text" name="city" id="city" placeholder="City Name" value="<% 
       String ci=request.getParameter("city");
       if(ci!=null)
       {
    	   out.print(ci);
       }
       %>">
       <lable style="color:red;"><% 
       String error3=(String)request.getAttribute("error3");
       if(error3!=null)
       {
    	   out.print(error3);
       }
       %></lable>
       
       <input type="number" name="contact" id="contact" placeholder="Contact No" value="<%
       String co=request.getParameter("city");
       if(co!=null)
       {
    	   out.print(co);
       }
       %>">
       <lable style="color:red;"><%
       String error4=(String)request.getAttribute("error4");
       if(error4!=null)
       {
    	   out.print(error4);
       }
       %></lable>
       
       <input type="text" name="Email" id="email" placeholder="Emial ID" value="<%
       String e=request.getParameter("Email");
       if(e!=null)
       {
    	   out.print(e);
       }
       %>">
       <lable style="color:red;"><%
       String error5=(String)request.getAttribute("error5");
       if(error5!=null)
       {
    	   out.print(error5);
       }
       %></lable>
      
       <input type="text" name="username" id="username" placeholder="User Name" value="<%
       String u=request.getParameter("username");
       if(u!=null)
       {
    	   out.print(u);
       }
       %>">
       <lable style="color:red;"><%
       String error6=(String)request.getAttribute("error6");
       if(error6!=null)
       {
    	   out.print(error6);
       }
       %></lable>
       
       <input type="password" name="password" id="pass" placeholder="Password" value="<% 
       String p=request.getParameter("password");
       %>">
       <lable style="color:red;"><%
       String error7=(String)request.getAttribute("error7");
       if(error7!=null)
       {
    	   out.print(error7);
       }
       %></lable>
       
       <input type="Submit" value="Register" id="b1">
       </form>
       </div>
    </div>
    <div id="w1">
    
    </div>
                                                          
 </body>
 </html>