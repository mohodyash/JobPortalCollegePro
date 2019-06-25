<!DOCTYPE html>

<html>
    <head>
        <title>LOGIN</title>
        
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
                <li><a href="http://localhost:8082/JobPortalCollegePro/login.jsp"><p style="color: rgb(255,255,0)">LOGIN </p></a></li>
                <li><a href="http://localhost:8082/JobPortalCollegePro/registre.jsp">REGISTER</a></li>
                <li><a href="#">LOCATION</a></li>
                <li><a href="#">GET APP</a></li>
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
       <p id="la">
             <%HttpSession session1=request.getSession();
             String username=(String)session1.getAttribute("username");
             if(username!=null)
             {
            	 out.print(username);
             }
             else{
            	 out.print("UserName");
             }%>
          </p></a>
       </div>
       </div>
       
       <div class="logout">
      <form action="LogOut" method="get">
       <input type="submit" id="b" value="log Out">
       </form>
     </div>                                                                            <!-- user -->

   
    <div class="log">
        <div class="heding">
            <h3>LOGIN</h3>
        </div>
        <div class="loginas">
            <form action="LoginServlet" method="post">
                <p id="p">Login as</p> 
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
            <p id="pass">Password</p>
            <input type="password" name="password" id="pass1" value="<%
            String p=request.getParameter("password");
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
            
           <input type="submit" value="LOG IN" id="b1">
        </form> 
        </div>
    </div>
          <footer>
         
          </footer>                                                  
    </body>
</html>    