<!DOCTYPE html>

<html>
    <head>
        <title>LOGIN</title>
        
        <link href="Comment.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="mainmenu">
        <div class="menu">
            <h4>JOB PORTAL</h4>
        </div>
        <div class="list">                                                           <!-- list -->
            <ul>
                 <li><a href="http://localhost:8082/JobPortalCollegePro/index.jsp" style="margin-left: 250px;">BACK TO HOME</a></li>
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
   
      
     
     
     
     <div class="heding">
     <label style="color:grey; font-family: inherit;">Please Give Your Feedback About This Web site</label>
     </div>
     <div class="comment">
      <!-- form database -->
     </div>
     <div style="width: 1000px; height: 430px;   box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19); margin-top: 20px; margin-left: 150px;">
     <% int size=(int)request.getAttribute("size");
        int id=(int)request.getAttribute("id");
        
      /*   out.print("size="+size);
        out.println("id="+id); */
        
        for(int i=id;i<size;i++)
        {
       %>  
           <div style="margin-left: 100px; margin-top: 15px; padding-top: 13px;">
              <label style="font-family: inherit; color: gray; font-size: 18px; text-decoration:inherit; "><%out.print(request.getAttribute("user"+i));%></label><br><br>
              <label style="padding-top: 5px; font-family: inherit; font-size: 18px; color: green;"><%out.print(request.getAttribute("comment"+i)); %></label>
           </div><hr>
            <%  
               
            %>
       <%
       } 
       %>
     
     
     
    
   
     </div>
    <form action="Comment2" method="get" style="padding-top: 5px; padding-left: 270px; width: 800px;">
    <input type="text" name="coment" placeholder="Comment" style="width: 650px; height: 30px; font-size: 18px; border-color: gray; border-radius: 5px;">
    <input type="submit" value="Comment" style="width: 100px; height: 30px; font-size: 18px; background-color: orange; border:2px solid orange ; border-radius:5px; cursor: pointer; color: white; " >
    </form>

                                                            
    </body>
</html>    