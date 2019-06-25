	<!DOCTYPE html>

<html>
    <head>
        <title>Post a job</title>
        <link href="postajob.css" rel="stylesheet" type="text/css"/>
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
                <li><a href="#"><p style="color: rgb(255,255,0)">POST A JOB<p></a></li>
                <li><a href="#">LOCATION</a></li>
                <li><a href="./Comment1">FEED BACK</a></li>
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
       <p id="la"><%HttpSession session1=request.getSession();
             String username=(String)session1.getAttribute("username");
             if(username!=null)
             {
            	 out.print(username);
             }
             else{
            	 out.print("UserName");
             }%></p></a>
      
      
       
       </div>
           </div>                                                                             <!-- user -->
  
     <div class="logout">
      <form action="LogOut" method="get">
       <input type="submit" id="b" value="log Out">
       </form>
     </div>
                                                                                 <!-- user --> 
   
    <div class="reg1">
       <div class="reg2">
          POST A JOB
       </div>
       <div class="reg3">
       <form action="PostaJobServlet" method="post">
       <br>
       <input type="text" name="Companytype" id="name" placeholder="Company Type" value="<% 
       String n=request.getParameter("Companytype");
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
       <input type="text" name="requirment" id="address" placeholder="How Many Requirment" value="<% 
       String a=request.getParameter("requirment");
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
       <input type="text" name="reqEx" id="city" placeholder="Experience required for the job" value="<% 
       String ci=request.getParameter("reqEx");
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
       <input type="text" name="salary" id="city" placeholder="Annual salary of the job" value="<%
       String co=request.getParameter("salary");
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
       <input type="text" name="joblocation" id="city" placeholder="Job Location" value="<%
       String e=request.getParameter("joblocation");
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
       <input type="text" name="jobtype" id="city" placeholder="Job Type" value="<%
       String u=request.getParameter("jobtype");
       if(u!=null)
       {
    	   out.print(u);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error6=(String)request.getAttribute("error6");
       if(error6!=null)
       {
    	   out.print(error6);
       }
       %></lable>
       <br>
              
       <input type="text" name="skill" id="city" placeholder="Skill" value="<%
       String s=request.getParameter("skill");
       if(s!=null)
       {
    	   out.print(s);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error7=(String)request.getAttribute("error7");
       if(error7!=null)
       {
    	   out.print(error7);
       }
       %></lable>
       <br>
       
         
       <input type="text" name="education" id="city" placeholder="Education Required" value="<%
       String ee=request.getParameter("jobtype");
       if(ee!=null)
       {
    	   out.print(ee);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error8=(String)request.getAttribute("error8");
       if(error8!=null)
       {
    	   out.print(error8);
       }
       %></lable>
       
              <br>
       <input type="text" name="language" id="city" placeholder="Language" value="<%
       String l=request.getParameter("jobtype");
       if(l!=null)
       {
    	   out.print(l);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error9=(String)request.getAttribute("error9");
       if(error9!=null)
       {
    	   out.print(error9);
       }
       %></lable>
       
              <br>
       <input type="text" name="roll" id="city" placeholder="Roll" value="<%
       String r=request.getParameter("roll");
       if(r!=null)
       {
    	   out.print(r);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error10=(String)request.getAttribute("error10");
       if(error10!=null)
       {	
    	   out.print(error10);
       }
       %></lable>
       <br><br><br>
       <label id="iid">Interview Date</label>
       <select name="date" size="1">	
       
       <% int i=1;
         for(i=1;i<32;i++)
         { %>
        	 <option value="<%=i %>"><%=i %></option>
        <% }
       %>
       
       </select > 
       <select name="months" size="1">
       <option value="jan">JAN</option>
       <option value="feb">FEB</option>
       <option value="mar">MAR</option>
       <option value="apr">APR</option>
       <option value="may">MAY</option>
       <option value="june">JUNE</option>
       <option value="july">JULY</option>
       <option value="aug">AUG</option>
       <option value="sep">SEP</option>
       <option value="oct">OCT</option>
       <option value="nov">NOV</option>
       <option value="dec">DEc</option>
       
       </select>    
       
       <select name="year" size="1">
        <% for(int j=2017;j<2025;j++)
           {
        	%>
        	<option value="<%=j%>"><%=j %></option>
          <%} %>
        
       </select>  
       
         <br>
       <input type="text" name="address" id="city" placeholder="Interview Address" value="<%
       String aa=request.getParameter("address");
       if(aa!=null)
       {
    	   out.print(aa);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error11=(String)request.getAttribute("error11");
       if(error11!=null)
       {
    	   out.print(error11);
       }
       %>
       <br>
        <input type="text" name="time" id="city" placeholder="Interview Time" value="<%
       String aaa=request.getParameter("time");
       if(aaa!=null)
       {
    	   out.print(aaa);
       }
       %>">
       <lable style="color:red; margin-left:20px;"><%
       String error12=(String)request.getAttribute("error11");
       if(error12!=null)
       {
    	   out.print(error12);
       }
       %>
       </lable>
       <input type="Submit" value="POST" id="b1">
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