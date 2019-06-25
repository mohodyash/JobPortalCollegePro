<!DOCTYPE html>

<html>
    <head>
        <title>successfully apply for job</title>
        
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
  
     <div style="margin-left: 200px; margin-top: 50px; color: gray;">
      <h2>*  </h2>
      <h2>* Thank to Use our Job Portal </h2>
     </div>
               
    <footer>
   
    </footer>
                                                            
    </body>
</html>    